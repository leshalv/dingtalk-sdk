// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkservice_group_1_0.models;

import com.aliyun.tea.*;

public class GetNegativeWordCloudResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetNegativeWordCloudResponseBody body;

    public static GetNegativeWordCloudResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNegativeWordCloudResponse self = new GetNegativeWordCloudResponse();
        return TeaModel.build(map, self);
    }

    public GetNegativeWordCloudResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNegativeWordCloudResponse setBody(GetNegativeWordCloudResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNegativeWordCloudResponseBody getBody() {
        return this.body;
    }

}