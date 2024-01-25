// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkrobot_1_0.models;

import com.aliyun.tea.*;

public class BatchRecallOTOResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchRecallOTOResponseBody body;

    public static BatchRecallOTOResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchRecallOTOResponse self = new BatchRecallOTOResponse();
        return TeaModel.build(map, self);
    }

    public BatchRecallOTOResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchRecallOTOResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchRecallOTOResponse setBody(BatchRecallOTOResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchRecallOTOResponseBody getBody() {
        return this.body;
    }

}
