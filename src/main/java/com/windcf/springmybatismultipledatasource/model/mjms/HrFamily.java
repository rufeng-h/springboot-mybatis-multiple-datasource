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
    * 家庭成员
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HrFamily {
    private Long fmId;

    private Long fmCandId;

    private String fmName;

    private String fmRelation;

    /**
    * 工作单位
    */
    private String fmCompany;

    private LocalDateTime fmModified;

    private LocalDateTime fmCreated;

    /**
    * 职务
    */
    private String fmPosition;
}