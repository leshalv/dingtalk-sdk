// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkwatt_1_0.models;

import com.aliyun.tea.*;

public class SendPopupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SendPopupResponseBody body;

    public static SendPopupResponse build(java.util.Map<String, ?> map) throws Exception {
        SendPopupResponse self = new SendPopupResponse();
        return TeaModel.build(map, self);
    }

    public SendPopupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendPopupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendPopupResponse setBody(SendPopupResponseBody body) {
        this.body = body;
        return this;
    }
    public SendPopupResponseBody getBody() {
        return this.body;
    }

}
