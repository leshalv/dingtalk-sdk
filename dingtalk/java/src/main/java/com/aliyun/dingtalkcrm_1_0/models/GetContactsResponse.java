// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkcrm_1_0.models;

import com.aliyun.tea.*;

public class GetContactsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetContactsResponseBody body;

    public static GetContactsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContactsResponse self = new GetContactsResponse();
        return TeaModel.build(map, self);
    }

    public GetContactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContactsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetContactsResponse setBody(GetContactsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContactsResponseBody getBody() {
        return this.body;
    }

}
