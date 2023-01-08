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
    * 操作记录表
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PtOperLog {
    private Long operId;

    /**
    * 操作说明
    */
    private String operDesc;

    /**
    * 请求参数
    */
    private String operReqParam;

    /**
    * 返回结果
    */
    private String operExp;

    /**
    * 操作方法
    */
    private String operMethod;

    /**
    * 操作人
    */
    private String operUserId;

    /**
    * 操作人名称
    */
    private String operUserName;

    /**
    * 请求uri
    */
    private String operUri;

    private String operIp;

    private LocalDateTime operTime;

    /**
    * 1 成功 0 失败
    */
    private Integer operStatus;

    private String operType;

    private String operUserType;
}