package com.windcf.springmybatismultipledatasource.model.ams;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @author : chunf
*/
/**
    * 科目
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PtSubject {
    private Long subId;

    /**
    * 科目名称
    */
    private String subName;

    /**
    * 备注信息
    */
    private String subDesp;

    private LocalDateTime subCreated;

    private LocalDateTime subModified;

    /**
    * 运动能力id
    */
    private Long compId;
}