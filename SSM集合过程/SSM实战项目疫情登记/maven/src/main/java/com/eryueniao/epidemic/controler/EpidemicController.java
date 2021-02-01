package com.eryueniao.epidemic.controler;

import com.eryueniao.epidemic.bean.*;
import com.eryueniao.epidemic.service.EpidemicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/epidemicData")
public class EpidemicController {
    @Autowired
    EpidemicService epidemicService;

    @RequestMapping("/ajax/input")
    @ResponseBody //将return的对象转换成json格式响应给页面
    public AjaxResponseInfo saveEpidemicInfo(@RequestBody DailyEpidemicInfo dailyEpidemicInfo, HttpSession session) {
/// / @RequestBody作用是讲页面提交的json格式的数据转换成对象
        AjaxResponseInfo ajaxResponseInfo = new AjaxResponseInfo();
        UserInfo loginedUser = (UserInfo) session.getAttribute("loginedUser");
        if (loginedUser != null) {
            //已经登陆了
            Integer userId = loginedUser.getUserId();
            List<ProvinceInfo> provinceInfos = epidemicService.saveEpdemicinfos(userId, dailyEpidemicInfo);
            ajaxResponseInfo.setCode(0);
            ajaxResponseInfo.setMsg("保存成功");
            ajaxResponseInfo.setData(provinceInfos);
        } else {
            //表示用户没有登录
            ajaxResponseInfo.setCode(-2);
            ajaxResponseInfo.setMsg("权限不足，请登陆后再试");
        }
        return ajaxResponseInfo;
    }

    @RequestMapping("/ajax/lastestData")
    @ResponseBody
    public AjaxResponseInfo findEpidemicInfoTotal() {
        List<EpidemicDetailInfo> epidemicInfoTotals = epidemicService.findEpidemicDetailInfoTotal();
        AjaxResponseInfo ajaxResponseInfo = new AjaxResponseInfo();
        ajaxResponseInfo.setCode(0);
        ajaxResponseInfo.setMsg("查询成功");
        ajaxResponseInfo.setData(epidemicInfoTotals);
        return ajaxResponseInfo;
    }
}
