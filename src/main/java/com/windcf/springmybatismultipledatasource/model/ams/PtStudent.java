package com.windcf.springmybatismultipledatasource.model.ams;

import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @author : chunf
*/
/**
    * 学生表
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PtStudent {
    private String stuId;

    /**
    * id
    */
    private Long sid;

    private String stuName;

    /**
    * 出生日期
    */
    private LocalDate stuBirth;

    /**
    * 性别
    */
    private Object stuGender;

    /**
    * 登陆密码
    */
    private String password;

    /**
    * 头像
    */
    private String avatar;

    private String clsCode;

    /**
    * 创建时间
    */
    private LocalDateTime stuCreated;

    /**
    * 上次修改时间
    */
    private LocalDateTime stuModified;

    /**
    * 上次登录
    */
    private LocalDateTime stuLastLogin;

    private String stuDesp;
}