// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkchengfeng_1_0.models;

import com.aliyun.tea.*;

public class GetAnalyzeDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAnalyzeDataResponseBody body;

    public static GetAnalyzeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAnalyzeDataResponse self = new GetAnalyzeDataResponse();
        return TeaModel.build(map, self);
    }

    public GetAnalyzeDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAnalyzeDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAnalyzeDataResponse setBody(GetAnalyzeDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAnalyzeDataResponseBody getBody() {
        return this.body;
    }

}
