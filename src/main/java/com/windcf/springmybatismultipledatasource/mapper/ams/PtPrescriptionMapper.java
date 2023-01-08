package com.windcf.springmybatismultipledatasource.mapper.ams;

import com.windcf.springmybatismultipledatasource.model.ams.PtPrescription;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface PtPrescriptionMapper {
    int insert(PtPrescription record);

    int insertSelective(PtPrescription record);
}