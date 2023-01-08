package com.windcf.springmybatismultipledatasource.mapper.ams;

import com.windcf.springmybatismultipledatasource.model.ams.PtStudent;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface PtStudentMapper {
    int deleteByPrimaryKey(String stuId);

    int insert(PtStudent record);

    int insertSelective(PtStudent record);

    PtStudent selectByPrimaryKey(String stuId);

    int updateByPrimaryKeySelective(PtStudent record);

    int updateByPrimaryKey(PtStudent record);
}