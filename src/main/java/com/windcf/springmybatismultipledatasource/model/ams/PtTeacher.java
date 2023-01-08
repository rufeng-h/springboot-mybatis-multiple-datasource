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
    * 教师表
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PtTeacher {
    private String teaId;

    private String teaName;

    private String password;

    /**
    * 头像
    */
    private String avatar;

    private String email;

    private String teaDesp;

    private LocalDateTime teaCreated;

    private LocalDateTime teaModified;

    private LocalDateTime teaLastLogin;

    private String phone;

    private Long tid;

    /**
    * 所属学院
    */
    private String clgCode;

    private Object teaGender;

    private LocalDate teaBirth;

    private Boolean principal;
}