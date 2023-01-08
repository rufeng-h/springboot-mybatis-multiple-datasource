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
    * 消息
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HrMessage {
    private Long msgId;

    /**
    * 消息内容，支持富文本，支持表情、文件等
    */
    private String msgContent;

    /**
    * 消息类型
    */
    private String msgType;

    private Long msgFrom;

    private Long msgTo;

    /**
    * 消息状态
    */
    private String msgStatus;

    private LocalDateTime msgCreated;
}