// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkdrive_1_0.models;

import com.aliyun.tea.*;

public class InfoSpaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InfoSpaceResponseBody body;

    public static InfoSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        InfoSpaceResponse self = new InfoSpaceResponse();
        return TeaModel.build(map, self);
    }

    public InfoSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InfoSpaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InfoSpaceResponse setBody(InfoSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public InfoSpaceResponseBody getBody() {
        return this.body;
    }

}
