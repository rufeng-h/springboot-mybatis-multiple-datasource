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
    * 角色资源
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PtRoleOper {
    private Long id;

    private Long roleId;

    private Long operId;

    private LocalDateTime created;

    private LocalDateTime modified;
}