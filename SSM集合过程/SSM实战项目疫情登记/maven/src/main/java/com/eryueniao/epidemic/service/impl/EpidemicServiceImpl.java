package com.eryueniao.epidemic.service.impl;

import com.eryueniao.epidemic.bean.DailyEpidemicInfo;
import com.eryueniao.epidemic.bean.EpidemicDetailInfo;
import com.eryueniao.epidemic.bean.EpidemicInfo;
import com.eryueniao.epidemic.bean.ProvinceInfo;
import com.eryueniao.epidemic.mapper.EpidemicMapper;
import com.eryueniao.epidemic.mapper.ProvinceMapper;
import com.eryueniao.epidemic.service.EpidemicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@Service
public class EpidemicServiceImpl implements EpidemicService {
    @Autowired
    private EpidemicMapper epidemicMapper;
    @Autowired
    private ProvinceMapper provinceMapper;

    @Override
    public List<ProvinceInfo> saveEpdemicinfos(Integer userId, DailyEpidemicInfo dailyEpidemicInfo) {
        String date = dailyEpidemicInfo.getDate();
        List<EpidemicInfo> array = dailyEpidemicInfo.getArray();
        String[] strings = date.split("-");
        int year = Integer.parseInt(strings[0]);
        int month = Integer.parseInt(strings[1]);
        int day = Integer.parseInt(strings[2]);
        for (int i = 0; i < array.size(); i++) {
            //epidemicInfo封装了页面提交过来的数据(province_id,五个疫情数据)
            EpidemicInfo epidemicInfo = array.get(i);
            epidemicInfo.setDataYear(year);
            epidemicInfo.setDataMonth(month);
            epidemicInfo.setDataDay(day);
            epidemicInfo.setInputDate(new Date());//设置当前时间作为数据录入的时间
            //保存了所有的疫情信息数据
            epidemicMapper.saveEpidemicInfos(epidemicInfo);
        }
//返回下一组没有录入疫情数据的省份列表
        return provinceMapper.findNoDataProvinceList(year, month, day);
    }

    @Override
    public List<EpidemicDetailInfo> findEpidemicDetailInfoTotal() {
        Calendar calendar = new GregorianCalendar();
        int year=calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day=calendar.get(Calendar.DATE);
        List<EpidemicDetailInfo> epidemicDetailInfoTotal = epidemicMapper.findEpidemicDetailInfoTotal(year,month,day);
        return epidemicDetailInfoTotal;
    }
}
