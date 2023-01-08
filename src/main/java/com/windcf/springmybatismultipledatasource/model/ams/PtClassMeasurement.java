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
    * 班级、测量中间表
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PtClassMeasurement {
    private Long cmsId;

    private Long msId;

    private String clsCode;

    private LocalDateTime cmsCreated;

    private LocalDateTime cmsModified;
}