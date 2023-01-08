package com.windcf.springmybatismultipledatasource.mapper.mjms;

import com.windcf.springmybatismultipledatasource.model.mjms.HrCandidate;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface HrCandidateMapper {
    int deleteByPrimaryKey(Long candId);

    int insert(HrCandidate record);

    int insertSelective(HrCandidate record);

    HrCandidate selectByPrimaryKey(Long candId);

    int updateByPrimaryKeySelective(HrCandidate record);

    int updateByPrimaryKey(HrCandidate record);
}