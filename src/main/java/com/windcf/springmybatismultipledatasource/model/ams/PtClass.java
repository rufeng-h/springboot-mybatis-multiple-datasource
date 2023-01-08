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
    * 班级表
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PtClass {
    private String clsCode;

    private Long clsId;

    private String clsName;

    private String clgCode;

    /**
    * 录入系统时年级
    */
    private Integer clsEntryGrade;

    /**
    * 录入系统年份
    */
    private Integer clsEntryYear;

    private LocalDateTime clsCreated;

    private LocalDateTime clsModified;

    private String teaId;
}