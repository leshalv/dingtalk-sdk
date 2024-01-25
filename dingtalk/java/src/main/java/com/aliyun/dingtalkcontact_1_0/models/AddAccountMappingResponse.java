// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkcontact_1_0.models;

import com.aliyun.tea.*;

public class AddAccountMappingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAccountMappingResponseBody body;

    public static AddAccountMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAccountMappingResponse self = new AddAccountMappingResponse();
        return TeaModel.build(map, self);
    }

    public AddAccountMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAccountMappingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAccountMappingResponse setBody(AddAccountMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAccountMappingResponseBody getBody() {
        return this.body;
    }

}
