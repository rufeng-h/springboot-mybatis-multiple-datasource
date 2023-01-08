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
    * 简历
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HrResume {
    private Long rsId;

    private String rsName;

    private String rsDesc;

    private LocalDateTime rsCreated;

    private LocalDateTime rsModified;

    private Long rsCandId;

    private Short rsPublic;

    private Short rsDefault;
}