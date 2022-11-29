// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkyida_1_0.models;

import com.aliyun.tea.*;

public class GetFormListInAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFormListInAppResponseBody body;

    public static GetFormListInAppResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFormListInAppResponse self = new GetFormListInAppResponse();
        return TeaModel.build(map, self);
    }

    public GetFormListInAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFormListInAppResponse setBody(GetFormListInAppResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFormListInAppResponseBody getBody() {
        return this.body;
    }

}