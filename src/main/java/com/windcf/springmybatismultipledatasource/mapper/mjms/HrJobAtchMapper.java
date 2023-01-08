package com.windcf.springmybatismultipledatasource.mapper.mjms;

import com.windcf.springmybatismultipledatasource.model.mjms.HrJobAtch;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface HrJobAtchMapper {
    int deleteByPrimaryKey(Long atchId);

    int insert(HrJobAtch record);

    int insertSelective(HrJobAtch record);

    HrJobAtch selectByPrimaryKey(Long atchId);

    int updateByPrimaryKeySelective(HrJobAtch record);

    int updateByPrimaryKey(HrJobAtch record);
}