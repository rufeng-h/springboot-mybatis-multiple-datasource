package com.windcf.springmybatismultipledatasource.mapper.ams;

import com.windcf.springmybatismultipledatasource.model.ams.PtTeacherRole;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface PtTeacherRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PtTeacherRole record);

    int insertSelective(PtTeacherRole record);

    PtTeacherRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PtTeacherRole record);

    int updateByPrimaryKey(PtTeacherRole record);
}