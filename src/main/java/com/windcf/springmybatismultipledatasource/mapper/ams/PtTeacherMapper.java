package com.windcf.springmybatismultipledatasource.mapper.ams;

import com.windcf.springmybatismultipledatasource.model.ams.PtTeacher;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface PtTeacherMapper {
    int deleteByPrimaryKey(String teaId);

    int insert(PtTeacher record);

    int insertSelective(PtTeacher record);

    PtTeacher selectByPrimaryKey(String teaId);

    int updateByPrimaryKeySelective(PtTeacher record);

    int updateByPrimaryKey(PtTeacher record);
}