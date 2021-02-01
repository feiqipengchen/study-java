package com.eryueniao.epidemic.service;

import com.eryueniao.epidemic.bean.DailyEpidemicInfo;
import com.eryueniao.epidemic.bean.EpidemicDetailInfo;
import com.eryueniao.epidemic.bean.ProvinceInfo;

import java.util.List;

public interface EpidemicService {
    public List<ProvinceInfo> saveEpdemicinfos(Integer userId, DailyEpidemicInfo dailyEpidemicInfo);

    public List<EpidemicDetailInfo> findEpidemicDetailInfoTotal();
}
