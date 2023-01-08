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
    * 运动处方
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PtPrescription {
    private Long prsId;

    private Long compId;

    private String prsLevel;

    private String prsText;

    private LocalDateTime prsCreated;

    private LocalDateTime prsModified;
}