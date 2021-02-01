package com.eryueniao.epidemic.service;

import com.eryueniao.epidemic.bean.ProvinceInfo;

import java.util.List;

public interface ProvinceService {
    List<ProvinceInfo> noDataProvinceList(String date);
}
