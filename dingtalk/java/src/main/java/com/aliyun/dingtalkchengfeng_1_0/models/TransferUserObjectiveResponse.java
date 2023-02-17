// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkchengfeng_1_0.models;

import com.aliyun.tea.*;

public class TransferUserObjectiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TransferUserObjectiveResponseBody body;

    public static TransferUserObjectiveResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferUserObjectiveResponse self = new TransferUserObjectiveResponse();
        return TeaModel.build(map, self);
    }

    public TransferUserObjectiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferUserObjectiveResponse setBody(TransferUserObjectiveResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferUserObjectiveResponseBody getBody() {
        return this.body;
    }

}
