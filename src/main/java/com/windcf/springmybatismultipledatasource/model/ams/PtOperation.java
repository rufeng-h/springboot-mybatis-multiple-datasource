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
    * 接口表
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PtOperation {
    private Long operId;

    private String operName;

    private String operSummary;

    private String operDesp;

    private LocalDateTime created;

    private Long pid;
}