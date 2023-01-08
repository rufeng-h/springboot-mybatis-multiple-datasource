package com.windcf.springmybatismultipledatasource.model.mjms;

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
public class HrAdmin {
    private Long adminId;

    private String adminName;

    private String adminPhone;

    private String adminEmail;

    private String adminAvatar;

    private LocalDateTime adminCreated;

    private LocalDateTime adminModified;

    private String adminStatus;

    private String adminPwd;

    private LocalDateTime adminLastLogin;
}