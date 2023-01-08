package com.windcf.springmybatismultipledatasource.model.mjms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @author : chunf
*/
/**
    * 专业信息
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HrMajor {
    private String majorId;

    private String majorName;

    private String majorPid;

    private Byte majorLevel;
}