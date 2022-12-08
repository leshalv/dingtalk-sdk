// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkconv_file_1_0.models;

import com.aliyun.tea.*;

public class SendRequest extends TeaModel {
    // 文件id
    @NameInMap("dentryId")
    public String dentryId;

    // 目标会话id
    @NameInMap("openConversationId")
    public String openConversationId;

    // 文件所在空间id
    @NameInMap("spaceId")
    public String spaceId;

    // 用户id
    @NameInMap("unionId")
    public String unionId;

    public static SendRequest build(java.util.Map<String, ?> map) throws Exception {
        SendRequest self = new SendRequest();
        return TeaModel.build(map, self);
    }

    public SendRequest setDentryId(String dentryId) {
        this.dentryId = dentryId;
        return this;
    }
    public String getDentryId() {
        return this.dentryId;
    }

    public SendRequest setOpenConversationId(String openConversationId) {
        this.openConversationId = openConversationId;
        return this;
    }
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    public SendRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public SendRequest setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

}