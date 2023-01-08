package com.windcf.springmybatismultipledatasource.mapper.mjms;

import com.windcf.springmybatismultipledatasource.model.mjms.HrResume;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface HrResumeMapper {
    int deleteByPrimaryKey(Long rsId);

    int insert(HrResume record);

    int insertSelective(HrResume record);

    HrResume selectByPrimaryKey(Long rsId);

    int updateByPrimaryKeySelective(HrResume record);

    int updateByPrimaryKey(HrResume record);
}