// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkim_1_0.models;

import com.aliyun.tea.*;

public class SendDingMessageRequest extends TeaModel {
    // 钉内用户oauth2.0授权码。
    @NameInMap("code")
    public String code;

    // 消息内容。
    @NameInMap("message")
    public String message;

    // 消息类型
    @NameInMap("messageType")
    public String messageType;

    // 群会话Id。
    @NameInMap("openConversationId")
    public String openConversationId;

    // 钉外用户在业务系统内的唯一标志。
    @NameInMap("receiverId")
    public String receiverId;

    // 钉内用户userId。
    @NameInMap("senderId")
    public String senderId;

    public static SendDingMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendDingMessageRequest self = new SendDingMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendDingMessageRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendDingMessageRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendDingMessageRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public SendDingMessageRequest setOpenConversationId(String openConversationId) {
        this.openConversationId = openConversationId;
        return this;
    }
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    public SendDingMessageRequest setReceiverId(String receiverId) {
        this.receiverId = receiverId;
        return this;
    }
    public String getReceiverId() {
        return this.receiverId;
    }

    public SendDingMessageRequest setSenderId(String senderId) {
        this.senderId = senderId;
        return this;
    }
    public String getSenderId() {
        return this.senderId;
    }

}
