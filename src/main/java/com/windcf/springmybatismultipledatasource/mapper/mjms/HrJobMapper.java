package com.windcf.springmybatismultipledatasource.mapper.mjms;

import com.windcf.springmybatismultipledatasource.model.mjms.HrJob;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface HrJobMapper {
    int deleteByPrimaryKey(Long jobId);

    int insert(HrJob record);

    int insertSelective(HrJob record);

    HrJob selectByPrimaryKey(Long jobId);

    int updateByPrimaryKeySelective(HrJob record);

    int updateByPrimaryKey(HrJob record);
}