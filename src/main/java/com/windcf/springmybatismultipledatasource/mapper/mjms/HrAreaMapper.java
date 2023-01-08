package com.windcf.springmybatismultipledatasource.mapper.mjms;

import com.windcf.springmybatismultipledatasource.model.mjms.HrArea;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface HrAreaMapper {
    int deleteByPrimaryKey(Long areaId);

    int insert(HrArea record);

    int insertSelective(HrArea record);

    HrArea selectByPrimaryKey(Long areaId);

    int updateByPrimaryKeySelective(HrArea record);

    int updateByPrimaryKey(HrArea record);
}