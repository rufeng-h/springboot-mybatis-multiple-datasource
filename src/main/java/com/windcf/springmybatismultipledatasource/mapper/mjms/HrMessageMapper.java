package com.windcf.springmybatismultipledatasource.mapper.mjms;

import com.windcf.springmybatismultipledatasource.model.mjms.HrMessage;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface HrMessageMapper {
    int deleteByPrimaryKey(Long msgId);

    int insert(HrMessage record);

    int insertSelective(HrMessage record);

    HrMessage selectByPrimaryKey(Long msgId);

    int updateByPrimaryKeySelective(HrMessage record);

    int updateByPrimaryKey(HrMessage record);
}