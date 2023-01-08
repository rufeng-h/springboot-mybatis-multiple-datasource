package com.windcf.springmybatismultipledatasource.mapper.ams;

import com.windcf.springmybatismultipledatasource.model.ams.PtClassMeasurement;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface PtClassMeasurementMapper {
    int deleteByPrimaryKey(Long cmsId);

    int insert(PtClassMeasurement record);

    int insertSelective(PtClassMeasurement record);

    PtClassMeasurement selectByPrimaryKey(Long cmsId);

    int updateByPrimaryKeySelective(PtClassMeasurement record);

    int updateByPrimaryKey(PtClassMeasurement record);
}