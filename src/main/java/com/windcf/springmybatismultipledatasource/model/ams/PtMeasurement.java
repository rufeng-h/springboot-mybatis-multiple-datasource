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
    * 测量记录表
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PtMeasurement {
    private Long msId;

    private String msName;

    private String msDesp;

    private LocalDateTime msCreated;

    private LocalDateTime msModified;

    /**
    * 科目组id
    */
    private Long grpId;

    private String msCreatedAdmin;
}