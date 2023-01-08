package com.windcf.springmybatismultipledatasource.mapper.ams;

import com.windcf.springmybatismultipledatasource.model.ams.PtOperLog;
import org.apache.ibatis.annotations.Mapper;

/**
* @author : chunf
*/
@Mapper
public interface PtOperLogMapper {
    int deleteByPrimaryKey(Long operId);

    int insert(PtOperLog record);

    int insertSelective(PtOperLog record);

    PtOperLog selectByPrimaryKey(Long operId);

    int updateByPrimaryKeySelective(PtOperLog record);

    int updateByPrimaryKey(PtOperLog record);
}