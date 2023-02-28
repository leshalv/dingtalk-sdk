// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkdoc_2_0.models;

import com.aliyun.tea.*;

public class GetStarInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetStarInfoResponseBody body;

    public static GetStarInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStarInfoResponse self = new GetStarInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetStarInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStarInfoResponse setBody(GetStarInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStarInfoResponseBody getBody() {
        return this.body;
    }

}
