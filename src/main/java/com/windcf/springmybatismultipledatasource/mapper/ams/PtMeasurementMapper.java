package com.windcf.springmybatismultipledatasource.mapper.ams;

import com.windcf.springmybatismultipledatasource.model.ams.PtMeasurement;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface PtMeasurementMapper {
    int deleteByPrimaryKey(Long msId);

    int insert(PtMeasurement record);

    int insertSelective(PtMeasurement record);

    PtMeasurement selectByPrimaryKey(Long msId);

    int updateByPrimaryKeySelective(PtMeasurement record);

    int updateByPrimaryKey(PtMeasurement record);
}