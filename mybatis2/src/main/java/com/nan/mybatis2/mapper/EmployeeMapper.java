package com.nan.mybatis2.mapper;

import com.nan.mybatis2.bean.Employee;

/**
 * @author shuimiao
 * @date 2020-06-27-14:31
 */
public interface EmployeeMapper {
    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
