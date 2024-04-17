package com.nan.mybatis2.mapper;

import com.nan.mybatis2.bean.Coordinate;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

/**
 * @author shuimiao
 * @date 2020-06-28-10:55
 */
@Mapper
public interface CoordinateMapper {
     public Coordinate getCoodById(Integer id);
     public void insertCood(Coordinate coordinate);
}
