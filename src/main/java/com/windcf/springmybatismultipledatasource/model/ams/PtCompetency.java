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
    * 运动能力
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PtCompetency {
    private Long compId;

    private String compName;

    private String compDesp;

    private LocalDateTime compCreated;

    private LocalDateTime compMidified;
}