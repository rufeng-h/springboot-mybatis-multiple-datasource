package com.windcf.springmybatismultipledatasource.mapper.mjms;

import com.windcf.springmybatismultipledatasource.model.mjms.HrAdvantage;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface HrAdvantageMapper {
    int deleteByPrimaryKey(Long advId);

    int insert(HrAdvantage record);

    int insertSelective(HrAdvantage record);

    HrAdvantage selectByPrimaryKey(Long advId);

    int updateByPrimaryKeySelective(HrAdvantage record);

    int updateByPrimaryKey(HrAdvantage record);
}