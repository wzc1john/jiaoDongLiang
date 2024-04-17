package com.nan.mybatis2.mapper;

import com.nan.mybatis2.bean.Test;

/**
 * @author shuimiao
 * @date 2020-06-27-14:57
 */
public interface TestMapper {
    public Test getTest(Integer id);

    public void InsertTest(Test test);
}
