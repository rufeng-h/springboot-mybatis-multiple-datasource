package com.windcf.springmybatismultipledatasource.mapper.ams;

import com.windcf.springmybatismultipledatasource.model.ams.PtSubject;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface PtSubjectMapper {
    int deleteByPrimaryKey(Long subId);

    int insert(PtSubject record);

    int insertSelective(PtSubject record);

    PtSubject selectByPrimaryKey(Long subId);

    int updateByPrimaryKeySelective(PtSubject record);

    int updateByPrimaryKey(PtSubject record);
}