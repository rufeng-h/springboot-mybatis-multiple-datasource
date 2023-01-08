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
    * 公告附件
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HrJobAtch {
    private Long atchId;

    private String atchPath;

    private Long atchJobId;

    private LocalDateTime atchCreated;

    private String atchName;
}