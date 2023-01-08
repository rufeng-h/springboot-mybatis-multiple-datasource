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
    * 角色表
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PtRole {
    private Long roleId;

    private String roleName;

    private LocalDateTime roleCreated;

    private LocalDateTime roleModified;

    private String roleDesp;

    /**
    * 状态
    */
    private Byte status;
}