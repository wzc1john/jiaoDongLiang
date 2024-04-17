package com.nan.mybatis2.mapper;

import com.nan.mybatis2.bean.Ordinary;

/**
 * @author shuimiao
 * @date 2020-06-27-18:05
 */
public interface OrdinaryMapper {
    public Ordinary getOriById(Integer id);

    public void insertOri(Ordinary ordinary);

    void insertText(String text1,String text2,Integer user_id);

    void insertLogin(Integer userId,String userName,Integer success,Integer chance);

    void insertGame(Integer angle,Integer vv,Integer top,Integer user_id);

}
