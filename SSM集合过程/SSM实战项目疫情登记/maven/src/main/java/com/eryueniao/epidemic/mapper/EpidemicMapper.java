package com.eryueniao.epidemic.mapper;

import com.eryueniao.epidemic.bean.EpidemicDetailInfo;
import com.eryueniao.epidemic.bean.EpidemicInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EpidemicMapper {
    @Insert("INSERT INTO epidemics ( province_id, data_year, data_month, data_day, affirmed, suspected, isolated, dead, cured, user_id, input_date )\n" +
            "VALUES\n" +
            "\t(#{provinceId},#{dataYear},#{dataMonth},#{dataDay},#{affirmed},#{suspected},#{isolated},#{dead},#{cured},#{userId},#{inputDate})")
    void saveEpidemicInfos(EpidemicInfo epidemicInfo);

    @Select("SELECT\n" +
            "ep.province_id,\n" +
            "temp.province_name,\n" +
            "ep.data_year,\n" +
            "ep.data_month,\n" +
            "ep.data_day,\n" +
            "temp.affirmed_total,\n" +
            "temp.suspected_total,\n" +
            "temp.isolated_total,\n" +
            "temp.dead_total,\n" +
            "temp.cured_total \n" +
            "FROM\n" +
            "\tepidemics ep\n" +
            "\tRIGHT OUTER JOIN (\n" +
            "\t\n" +
            "\tSELECT\n" +
            "e.province_id,\n" +
            "p.province_name,\n" +
            "SUM( e.affirmed ) affirmed_total,\n" +
            "SUM( e.suspected ) suspected_total,\n" +
            "SUM( e.isolated ) isolated_total,\n" +
            "SUM( e.dead ) dead_total,\n" +
            "SUM( e.cured ) cured_total \n" +
            "FROM\n" +
            "\tepidemics e\n" +
            "\tRIGHT OUTER JOIN provinces p ON e.province_id = p.province_id \n" +
            "GROUP BY\n" +
            "\te.province_id,\n" +
            "\tp.province_name\n" +
            "\t\n" +
            "\t) temp ON ep.province_id = temp.province_id \n" +
            "WHERE\n" +
            "\tep.data_year =#{arg0} \n" +
            "\tAND ep.data_month =#{arg1} \n" +
            "\tAND ep.data_day =#{arg2}")
    List<EpidemicDetailInfo> findEpidemicDetailInfoTotal(int year, int month, int day);
}
