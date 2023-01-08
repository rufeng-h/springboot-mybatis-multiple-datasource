package com.windcf.springmybatismultipledatasource.mapper.mjms;

import com.windcf.springmybatismultipledatasource.model.mjms.HrApply;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface HrApplyMapper {
    int deleteByPrimaryKey(Long apyId);

    int insert(HrApply record);

    int insertSelective(HrApply record);

    HrApply selectByPrimaryKey(Long apyId);

    int updateByPrimaryKeySelective(HrApply record);

    int updateByPrimaryKey(HrApply record);
}