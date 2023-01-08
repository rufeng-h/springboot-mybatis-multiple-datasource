package com.windcf.springmybatismultipledatasource.mapper.mjms;

import com.windcf.springmybatismultipledatasource.model.mjms.HrFamily;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface HrFamilyMapper {
    int deleteByPrimaryKey(Long fmId);

    int insert(HrFamily record);

    int insertSelective(HrFamily record);

    HrFamily selectByPrimaryKey(Long fmId);

    int updateByPrimaryKeySelective(HrFamily record);

    int updateByPrimaryKey(HrFamily record);
}