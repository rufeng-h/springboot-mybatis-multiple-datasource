package com.windcf.springmybatismultipledatasource.mapper.ams;

import com.windcf.springmybatismultipledatasource.model.ams.PtRoleOper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface PtRoleOperMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PtRoleOper record);

    int insertSelective(PtRoleOper record);

    PtRoleOper selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PtRoleOper record);

    int updateByPrimaryKey(PtRoleOper record);
}