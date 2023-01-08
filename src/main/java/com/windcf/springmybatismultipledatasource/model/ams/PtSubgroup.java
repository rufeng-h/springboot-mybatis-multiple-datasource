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
    * 科目组
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PtSubgroup {
    private Long grpId;

    private String grpName;

    private String grpDesp;

    private LocalDateTime grpCreated;

    private String grpCreatedTeaId;

    private LocalDateTime grpModified;
}