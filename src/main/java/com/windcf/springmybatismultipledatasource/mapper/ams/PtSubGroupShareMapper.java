package com.windcf.springmybatismultipledatasource.mapper.ams;

import com.windcf.springmybatismultipledatasource.model.ams.PtSubGroupShare;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface PtSubGroupShareMapper {
    int deleteByPrimaryKey(Long sid);

    int insert(PtSubGroupShare record);

    int insertSelective(PtSubGroupShare record);

    PtSubGroupShare selectByPrimaryKey(Long sid);

    int updateByPrimaryKeySelective(PtSubGroupShare record);

    int updateByPrimaryKey(PtSubGroupShare record);
}