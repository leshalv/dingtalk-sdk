// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkminiapp_1_0.models;

import com.aliyun.tea.*;

public class GetMaxVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMaxVersionResponseBody body;

    public static GetMaxVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMaxVersionResponse self = new GetMaxVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetMaxVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMaxVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMaxVersionResponse setBody(GetMaxVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMaxVersionResponseBody getBody() {
        return this.body;
    }

}
