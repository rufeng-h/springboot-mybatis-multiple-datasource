package com.windcf.springmybatismultipledatasource.mapper.ams;

import com.windcf.springmybatismultipledatasource.model.ams.PtSubgroup;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface PtSubgroupMapper {
    int deleteByPrimaryKey(Long grpId);

    int insert(PtSubgroup record);

    int insertSelective(PtSubgroup record);

    PtSubgroup selectByPrimaryKey(Long grpId);

    int updateByPrimaryKeySelective(PtSubgroup record);

    int updateByPrimaryKey(PtSubgroup record);
}