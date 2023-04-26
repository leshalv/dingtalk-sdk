// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkyida_1_0.models;

import com.aliyun.tea.*;

public class CheckCloudAccountStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckCloudAccountStatusResponseBody body;

    public static CheckCloudAccountStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckCloudAccountStatusResponse self = new CheckCloudAccountStatusResponse();
        return TeaModel.build(map, self);
    }

    public CheckCloudAccountStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckCloudAccountStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckCloudAccountStatusResponse setBody(CheckCloudAccountStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckCloudAccountStatusResponseBody getBody() {
        return this.body;
    }

}
