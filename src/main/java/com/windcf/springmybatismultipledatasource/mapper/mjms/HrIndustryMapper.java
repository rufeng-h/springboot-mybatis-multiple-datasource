package com.windcf.springmybatismultipledatasource.mapper.mjms;

import com.windcf.springmybatismultipledatasource.model.mjms.HrIndustry;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface HrIndustryMapper {
    int deleteByPrimaryKey(String indId);

    int insert(HrIndustry record);

    int insertSelective(HrIndustry record);

    HrIndustry selectByPrimaryKey(String indId);

    int updateByPrimaryKeySelective(HrIndustry record);

    int updateByPrimaryKey(HrIndustry record);
}