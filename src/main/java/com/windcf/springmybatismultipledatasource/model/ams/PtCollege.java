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
    * 学院表
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PtCollege {
    private String clgCode;

    private Long clgId;

    /**
    * 学院名称
    */
    private String clgName;

    /**
    * 办公室
    */
    private String clgOffice;

    /**
    * 电话
    */
    private String clgTel;

    /**
    * 主页
    */
    private String clgHome;

    /**
    * 创建时间
    */
    private LocalDateTime clgCreated;

    /**
    * 上次修改
    */
    private LocalDateTime clgModified;
}