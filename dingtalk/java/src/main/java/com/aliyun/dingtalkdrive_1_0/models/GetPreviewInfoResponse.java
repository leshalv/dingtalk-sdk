// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkdrive_1_0.models;

import com.aliyun.tea.*;

public class GetPreviewInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPreviewInfoResponseBody body;

    public static GetPreviewInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPreviewInfoResponse self = new GetPreviewInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetPreviewInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPreviewInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPreviewInfoResponse setBody(GetPreviewInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPreviewInfoResponseBody getBody() {
        return this.body;
    }

}
