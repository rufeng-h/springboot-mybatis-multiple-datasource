package com.windcf.springmybatismultipledatasource.mapper.mjms;

import com.windcf.springmybatismultipledatasource.model.mjms.HrAdmin;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface HrAdminMapper {
    int deleteByPrimaryKey(Long adminId);

    int insert(HrAdmin record);

    int insertSelective(HrAdmin record);

    HrAdmin selectByPrimaryKey(Long adminId);

    int updateByPrimaryKeySelective(HrAdmin record);

    int updateByPrimaryKey(HrAdmin record);
}