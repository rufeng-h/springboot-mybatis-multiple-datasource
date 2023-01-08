package com.windcf.springmybatismultipledatasource.model.mjms;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @author : chunf
*/
/**
    * 教育经历
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HrEduExpr {
    private Long eduId;

    /**
    * 学历，0 -> 初中及以下，1 -> 高中，2 -> 本科，
    */
    private String eduEducation;

    /**
    * 学校
    */
    private String eduSchool;

    /**
    * 专业，本科以下选填
    */
    private String eduMajor;

    /**
    * 专业描述
    */
    private String eduMajorDesc;

    private LocalDateTime eduStartDate;

    private LocalDateTime eduEndDate;

    private LocalDateTime eduCreated;

    private LocalDateTime eduModified;

    /**
    * 外键
    */
    private Long eduCandId;

    /**
    * 所属简历
    */
    private Long eduRsId;
}