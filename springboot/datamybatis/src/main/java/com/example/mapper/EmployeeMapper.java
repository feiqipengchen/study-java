package com.example.mapper;


import com.example.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper//或者@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
