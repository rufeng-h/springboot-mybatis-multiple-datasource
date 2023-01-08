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
    * 个人优势
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HrAdvantage {
    private Long advId;

    private String advContent;

    private LocalDateTime advCreated;

    private LocalDateTime advModified;

    private Long advCandId;

    private Long advRsId;
}