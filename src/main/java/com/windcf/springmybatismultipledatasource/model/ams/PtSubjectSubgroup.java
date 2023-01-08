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
    * 科目与科目组关联
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PtSubjectSubgroup {
    private Long subGrpId;

    private Long subId;

    private LocalDateTime subGrpCreated;

    private Long grpId;

    private LocalDateTime subGrpModified;
}