// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkim_1_0.models;

import com.aliyun.tea.*;

public class RemoveRobotFromConversationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveRobotFromConversationResponseBody body;

    public static RemoveRobotFromConversationResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveRobotFromConversationResponse self = new RemoveRobotFromConversationResponse();
        return TeaModel.build(map, self);
    }

    public RemoveRobotFromConversationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveRobotFromConversationResponse setBody(RemoveRobotFromConversationResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveRobotFromConversationResponseBody getBody() {
        return this.body;
    }

}