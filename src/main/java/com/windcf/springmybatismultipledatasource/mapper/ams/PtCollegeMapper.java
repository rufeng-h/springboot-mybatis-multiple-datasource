package com.windcf.springmybatismultipledatasource.mapper.ams;

import com.windcf.springmybatismultipledatasource.model.ams.PtCollege;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface PtCollegeMapper {
    int deleteByPrimaryKey(String clgCode);

    int insert(PtCollege record);

    int insertSelective(PtCollege record);

    PtCollege selectByPrimaryKey(String clgCode);

    int updateByPrimaryKeySelective(PtCollege record);

    int updateByPrimaryKey(PtCollege record);
}