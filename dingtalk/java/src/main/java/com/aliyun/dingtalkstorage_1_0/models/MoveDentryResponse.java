// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkstorage_1_0.models;

import com.aliyun.tea.*;

public class MoveDentryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MoveDentryResponseBody body;

    public static MoveDentryResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveDentryResponse self = new MoveDentryResponse();
        return TeaModel.build(map, self);
    }

    public MoveDentryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveDentryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveDentryResponse setBody(MoveDentryResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveDentryResponseBody getBody() {
        return this.body;
    }

}
