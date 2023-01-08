package com.windcf.springmybatismultipledatasource.mapper.ams;

import com.windcf.springmybatismultipledatasource.model.ams.PtCompetency;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface PtCompetencyMapper {
    int deleteByPrimaryKey(Long compId);

    int insert(PtCompetency record);

    int insertSelective(PtCompetency record);

    PtCompetency selectByPrimaryKey(Long compId);

    int updateByPrimaryKeySelective(PtCompetency record);

    int updateByPrimaryKey(PtCompetency record);
}