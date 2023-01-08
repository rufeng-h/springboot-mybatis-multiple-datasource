package com.windcf.springmybatismultipledatasource.model.mjms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @author : chunf
*/
/**
    * 全国行政区划
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HrArea {
    private Long areaId;

    private String areaName;

    private Long areaPid;

    private Short areaLevel;
}