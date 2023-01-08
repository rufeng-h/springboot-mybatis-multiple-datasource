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
    * 年级、性别对应的测试科目
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PtSubStudent {
    private Long subId;

    private Integer grade;

    private String gender;

    private Long id;

    private LocalDateTime subsCreated;
}