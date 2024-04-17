package com.nan.mybatis2.mapper;

import com.nan.mybatis2.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @author shuimiao
 * @date 2020-06-27-14:07
 */
@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptByTd(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insrtDeptById(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDeptById(Department department);

}
