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
    * 管理员
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PtAdmin {
    private String adminId;

    private Long aid;

    private String adminName;

    private LocalDateTime adminCreated;

    private LocalDateTime adminModified;

    private String password;

    private String phone;

    private String email;

    private String avatar;

    private LocalDateTime adminLastLogin;

    private String adminDesp;

    private Object adminGender;
}