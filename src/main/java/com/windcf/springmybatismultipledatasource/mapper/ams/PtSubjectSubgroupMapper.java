package com.windcf.springmybatismultipledatasource.mapper.ams;

import com.windcf.springmybatismultipledatasource.model.ams.PtSubjectSubgroup;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface PtSubjectSubgroupMapper {
    int deleteByPrimaryKey(Long subGrpId);

    int insert(PtSubjectSubgroup record);

    int insertSelective(PtSubjectSubgroup record);

    PtSubjectSubgroup selectByPrimaryKey(Long subGrpId);

    int updateByPrimaryKeySelective(PtSubjectSubgroup record);

    int updateByPrimaryKey(PtSubjectSubgroup record);
}