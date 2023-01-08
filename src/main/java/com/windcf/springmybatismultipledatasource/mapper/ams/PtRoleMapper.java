package com.windcf.springmybatismultipledatasource.mapper.ams;

import com.windcf.springmybatismultipledatasource.model.ams.PtRole;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface PtRoleMapper {
    int deleteByPrimaryKey(Long roleId);

    int insert(PtRole record);

    int insertSelective(PtRole record);

    PtRole selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(PtRole record);

    int updateByPrimaryKey(PtRole record);
}