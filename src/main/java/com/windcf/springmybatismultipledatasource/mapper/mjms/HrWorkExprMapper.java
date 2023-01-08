package com.windcf.springmybatismultipledatasource.mapper.mjms;

import com.windcf.springmybatismultipledatasource.model.mjms.HrWorkExpr;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface HrWorkExprMapper {
    int deleteByPrimaryKey(Long workId);

    int insert(HrWorkExpr record);

    int insertSelective(HrWorkExpr record);

    HrWorkExpr selectByPrimaryKey(Long workId);

    int updateByPrimaryKeySelective(HrWorkExpr record);

    int updateByPrimaryKey(HrWorkExpr record);
}