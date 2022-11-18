// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkpackage_1_0.models;

import com.aliyun.tea.*;

public class GetUploadTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUploadTokenResponseBody body;

    public static GetUploadTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUploadTokenResponse self = new GetUploadTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetUploadTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUploadTokenResponse setBody(GetUploadTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUploadTokenResponseBody getBody() {
        return this.body;
    }

}