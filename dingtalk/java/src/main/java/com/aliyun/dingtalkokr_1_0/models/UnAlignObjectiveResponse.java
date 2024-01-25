// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkokr_1_0.models;

import com.aliyun.tea.*;

public class UnAlignObjectiveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnAlignObjectiveResponseBody body;

    public static UnAlignObjectiveResponse build(java.util.Map<String, ?> map) throws Exception {
        UnAlignObjectiveResponse self = new UnAlignObjectiveResponse();
        return TeaModel.build(map, self);
    }

    public UnAlignObjectiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnAlignObjectiveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnAlignObjectiveResponse setBody(UnAlignObjectiveResponseBody body) {
        this.body = body;
        return this;
    }
    public UnAlignObjectiveResponseBody getBody() {
        return this.body;
    }

}
