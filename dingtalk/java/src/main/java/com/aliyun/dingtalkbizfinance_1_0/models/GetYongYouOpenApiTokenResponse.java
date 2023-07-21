// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkbizfinance_1_0.models;

import com.aliyun.tea.*;

public class GetYongYouOpenApiTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetYongYouOpenApiTokenResponseBody body;

    public static GetYongYouOpenApiTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetYongYouOpenApiTokenResponse self = new GetYongYouOpenApiTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetYongYouOpenApiTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetYongYouOpenApiTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetYongYouOpenApiTokenResponse setBody(GetYongYouOpenApiTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetYongYouOpenApiTokenResponseBody getBody() {
        return this.body;
    }

}
