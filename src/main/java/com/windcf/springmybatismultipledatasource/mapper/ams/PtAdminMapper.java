package com.windcf.springmybatismultipledatasource.mapper.ams;

import com.windcf.springmybatismultipledatasource.model.ams.PtAdmin;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author : chunf
 */
@Mapper
public interface PtAdminMapper {
    int deleteByPrimaryKey(String adminId);

    int insert(PtAdmin record);

    int insertSelective(PtAdmin record);

    PtAdmin selectByPrimaryKey(String adminId);

    int updateByPrimaryKeySelective(PtAdmin record);

    int updateByPrimaryKey(PtAdmin record);
}