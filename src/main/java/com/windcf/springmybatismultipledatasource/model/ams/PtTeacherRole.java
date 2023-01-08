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
    * 教师、角色
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PtTeacherRole {
    private Long id;

    private String teaId;

    private Long roleId;

    private LocalDateTime created;

    private LocalDateTime modified;
}