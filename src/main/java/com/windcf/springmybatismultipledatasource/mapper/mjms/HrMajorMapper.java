package com.windcf.springmybatismultipledatasource.mapper.mjms;

import com.windcf.springmybatismultipledatasource.model.mjms.HrMajor;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface HrMajorMapper {
    int deleteByPrimaryKey(String majorId);

    int insert(HrMajor record);

    int insertSelective(HrMajor record);

    HrMajor selectByPrimaryKey(String majorId);

    int updateByPrimaryKeySelective(HrMajor record);

    int updateByPrimaryKey(HrMajor record);
}