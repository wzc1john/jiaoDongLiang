package com.nan.mybatis2.mapper;

import com.nan.mybatis2.bean.Competition;

/**
 * @author shuimiao
 * @date 2020-06-27-22:43
 */
public interface CompetitionMapper {
    public Competition getCompById(Integer id);
    public void insertComp(Competition competition);
}
