package com.windcf.springmybatismultipledatasource.model.mjms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @author : chunf
*/
/**
    * 行业信息
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HrIndustry {
    private String indId;

    private String indName;

    private String indPid;

    private Byte indLevel;
}