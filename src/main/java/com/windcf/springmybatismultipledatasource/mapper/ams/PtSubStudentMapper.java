package com.windcf.springmybatismultipledatasource.mapper.ams;

import com.windcf.springmybatismultipledatasource.model.ams.PtSubStudent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* @author : chunf
*/
@Mapper
public interface PtSubStudentMapper {
    int deleteByPrimaryKey(@Param("subId") Long subId, @Param("grade") Integer grade, @Param("gender") String gender);

    int insert(PtSubStudent record);

    int insertSelective(PtSubStudent record);

    PtSubStudent selectByPrimaryKey(@Param("subId") Long subId, @Param("grade") Integer grade, @Param("gender") String gender);

    int updateByPrimaryKeySelective(PtSubStudent record);

    int updateByPrimaryKey(PtSubStudent record);
}