package com.windcf.springmybatismultipledatasource.mapper.ams;

import com.windcf.springmybatismultipledatasource.model.ams.PtScoreSheet;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* @author : chunf
*/
@Mapper
public interface PtScoreSheetMapper {
    int deleteByPrimaryKey(@Param("subId") Long subId, @Param("gender") String gender, @Param("grade") Integer grade, @Param("upper") BigDecimal upper, @Param("lower") BigDecimal lower);

    int insert(PtScoreSheet record);

    int insertSelective(PtScoreSheet record);

    PtScoreSheet selectByPrimaryKey(@Param("subId") Long subId, @Param("gender") String gender, @Param("grade") Integer grade, @Param("upper") BigDecimal upper, @Param("lower") BigDecimal lower);

    int updateByPrimaryKeySelective(PtScoreSheet record);

    int updateByPrimaryKey(PtScoreSheet record);
}