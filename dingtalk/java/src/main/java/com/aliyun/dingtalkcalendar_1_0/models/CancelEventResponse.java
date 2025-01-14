// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkcalendar_1_0.models;

import com.aliyun.tea.*;

public class CancelEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelEventResponseBody body;

    public static CancelEventResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelEventResponse self = new CancelEventResponse();
        return TeaModel.build(map, self);
    }

    public CancelEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelEventResponse setBody(CancelEventResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelEventResponseBody getBody() {
        return this.body;
    }

}
