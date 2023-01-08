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
    * 工作经历
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HrWorkExpr {
    private Long workId;

    /**
    * 公司名称
    */
    private String workComp;

    /**
    * 所属行业
    */
    private String workInd;

    private LocalDateTime workStart;

    private LocalDateTime workEnd;

    /**
    * 公司规模
    */
    private String workCompSize;

    /**
    * 职位
    */
    private String workPosition;

    /**
    * 公司性质
    */
    private String workCompType;

    /**
    * 工作描述
    */
    private String workDesc;

    private LocalDateTime workCreated;

    private LocalDateTime workModified;

    private Long workCandId;

    private Long workRsId;

    /**
    * 工作类型 全职 兼职
    */
    private String workType;
}