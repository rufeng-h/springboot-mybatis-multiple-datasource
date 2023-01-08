package com.windcf.springmybatismultipledatasource.mapper.ams;

import com.windcf.springmybatismultipledatasource.model.ams.PtOperation;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface PtOperationMapper {
    int deleteByPrimaryKey(Long operId);

    int insert(PtOperation record);

    int insertSelective(PtOperation record);

    PtOperation selectByPrimaryKey(Long operId);

    int updateByPrimaryKeySelective(PtOperation record);

    int updateByPrimaryKey(PtOperation record);
}