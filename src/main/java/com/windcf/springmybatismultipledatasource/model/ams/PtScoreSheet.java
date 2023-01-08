package com.windcf.springmybatismultipledatasource.model.ams;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @author : chunf
*/
/**
    * 单项评分标准
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PtScoreSheet {
    /**
    * 科目
    */
    private Long subId;

    /**
    * 性别
    */
    private String gender;

    private Integer grade;

    /**
    * 上区间
    */
    private BigDecimal upper;

    /**
    * 下区间
    */
    private BigDecimal lower;

    private Integer score;

    private LocalDateTime createdTime;

    private LocalDateTime lastModifyTime;

    /**
    * 级别
    */
    private String level;

    private Long id;
}