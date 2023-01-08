package com.windcf.springmybatismultipledatasource.mapper.ams;

import com.windcf.springmybatismultipledatasource.model.ams.PtClass;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface PtClassMapper {
    int deleteByPrimaryKey(String clsCode);

    int insert(PtClass record);

    int insertSelective(PtClass record);

    PtClass selectByPrimaryKey(String clsCode);

    int updateByPrimaryKeySelective(PtClass record);

    int updateByPrimaryKey(PtClass record);
}