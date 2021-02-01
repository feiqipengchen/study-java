package com.eryueniao.epidemic.service.impl;

import com.eryueniao.epidemic.bean.ProvinceInfo;
import com.eryueniao.epidemic.mapper.ProvinceMapper;
import com.eryueniao.epidemic.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private ProvinceMapper provinceMapper;
    @Override
    public List<ProvinceInfo> noDataProvinceList(String date) {//date 2020-11-20
        String[] strings = date.split("-");
        int year=Integer.parseInt(strings[0]);
        int month=Integer.parseInt(strings[1]);
        int day=Integer.parseInt(strings[2]);
        List<ProvinceInfo> noDataProvinceList = provinceMapper.findNoDataProvinceList(year, month, day);
        return noDataProvinceList;
    }
}
