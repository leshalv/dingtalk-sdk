// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkokr_1_0.models;

import com.aliyun.tea.*;

public class UpdateObjectiveRequest extends TeaModel {
    @NameInMap("content")
    public java.io.InputStream content;

    // userId
    @NameInMap("userId")
    public String userId;

    public static UpdateObjectiveRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateObjectiveRequest self = new UpdateObjectiveRequest();
        return TeaModel.build(map, self);
    }

    public UpdateObjectiveRequest setContent(java.io.InputStream content) {
        this.content = content;
        return this;
    }
    public java.io.InputStream getContent() {
        return this.content;
    }

    public UpdateObjectiveRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}