package com.windcf.springmybatismultipledatasource.mapper.ams;

import com.windcf.springmybatismultipledatasource.model.ams.PtScore;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface PtScoreMapper {
    int deleteByPrimaryKey(Long scoId);

    int insert(PtScore record);

    int insertSelective(PtScore record);

    PtScore selectByPrimaryKey(Long scoId);

    int updateByPrimaryKeySelective(PtScore record);

    int updateByPrimaryKey(PtScore record);
}