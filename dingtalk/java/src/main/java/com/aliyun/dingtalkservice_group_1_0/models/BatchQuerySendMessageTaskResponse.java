// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkservice_group_1_0.models;

import com.aliyun.tea.*;

public class BatchQuerySendMessageTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchQuerySendMessageTaskResponseBody body;

    public static BatchQuerySendMessageTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchQuerySendMessageTaskResponse self = new BatchQuerySendMessageTaskResponse();
        return TeaModel.build(map, self);
    }

    public BatchQuerySendMessageTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchQuerySendMessageTaskResponse setBody(BatchQuerySendMessageTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchQuerySendMessageTaskResponseBody getBody() {
        return this.body;
    }

}