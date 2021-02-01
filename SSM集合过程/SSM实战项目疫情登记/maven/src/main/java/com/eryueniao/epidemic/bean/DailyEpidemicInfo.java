package com.eryueniao.epidemic.bean;

import java.util.List;

//该类作用是接收页面提交的每一天的6个省份的疫情数据
public class DailyEpidemicInfo {
    private String date;
    List<EpidemicInfo> array;

    public DailyEpidemicInfo() {
    }

    public DailyEpidemicInfo(String date, List<EpidemicInfo> array) {
        this.date = date;
        this.array = array;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<EpidemicInfo> getArray() {
        return array;
    }

    public void setArray(List<EpidemicInfo> array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "DailyEpidemicInfo{" +
                "date='" + date + '\'' +
                ", array=" + array +
                '}';
    }
}
