package com.eryueniao.epidemic.mapper;

import com.eryueniao.epidemic.bean.ProvinceInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ProvinceMapper {
    @Select("SELECT\n" +
            "\t* \n" +
            "FROM\n" +
            "\tprovinces \n" +
            "WHERE\n" +
            "\tprovince_id NOT IN (\n" +
            "\tSELECT\n" +
            "\tprovince_id \n" +
            "FROM\n" +
            "\tepidemics \n" +
            "WHERE\n" +
            "\tdata_year = #{arg0} \n" +
            "\tAND data_month = #{arg1} \n" +
            "\tAND data_day = #{arg2}) \n" +
            "ORDER BY\n" +
            "\tprovince_id \n" +
            "\tLIMIT 0,6;\n")
    List<ProvinceInfo> findNoDataProvinceList(int year, @Param("arg1") int month, int day);
}
