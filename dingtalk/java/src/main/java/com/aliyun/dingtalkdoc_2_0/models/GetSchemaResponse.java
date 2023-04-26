// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkdoc_2_0.models;

import com.aliyun.tea.*;

public class GetSchemaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSchemaResponseBody body;

    public static GetSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSchemaResponse self = new GetSchemaResponse();
        return TeaModel.build(map, self);
    }

    public GetSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSchemaResponse setBody(GetSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSchemaResponseBody getBody() {
        return this.body;
    }

}
