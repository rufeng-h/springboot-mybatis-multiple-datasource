package com.windcf.springmybatismultipledatasource.mapper.mjms;

import com.windcf.springmybatismultipledatasource.model.mjms.HrEduExpr;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface HrEduExprMapper {
    int deleteByPrimaryKey(Long eduId);

    int insert(HrEduExpr record);

    int insertSelective(HrEduExpr record);

    HrEduExpr selectByPrimaryKey(Long eduId);

    int updateByPrimaryKeySelective(HrEduExpr record);

    int updateByPrimaryKey(HrEduExpr record);
}