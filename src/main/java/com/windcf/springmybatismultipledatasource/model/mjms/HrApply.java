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
    * 职位申请
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HrApply {
    private Long apyId;

    /**
    * 申请人id
    */
    private Long apyCandId;

    /**
    * 职位id
    */
    private Long apyJobId;

    /**
    * 状态，'1' -> 未审核，'2' -> 通过, '3' -> 不通过
    */
    private String apyStatus;

    private LocalDateTime apyCreated;

    private LocalDateTime apyModified;

    /**
    * 操作人
    */
    private Long apyOperAdmin;

    /**
    * 简历id
    */
    private Long apyRsId;
}