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
    * 科目组分享
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PtSubGroupShare {
    private Long sid;

    private Long grpId;

    private String teaId;

    private String shareTeaId;

    private LocalDateTime shareTime;
}