package com.windcf.springmybatismultipledatasource.model.ams;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @author : chunf
*/
/**
    * 成绩表
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PtScore {
    private Long scoId;

    private String stuId;

    /**
    * 科目id
    */
    private Long subId;

    /**
    * 测试数据
    */
    private BigDecimal scoData;

    private LocalDateTime scoCreated;

    private LocalDateTime scoModified;

    /**
    * 测量id
    */
    private Long msId;

    private String scoLevel;

    private Integer score;
}