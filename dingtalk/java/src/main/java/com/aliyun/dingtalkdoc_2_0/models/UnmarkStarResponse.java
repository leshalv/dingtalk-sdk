// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkdoc_2_0.models;

import com.aliyun.tea.*;

public class UnmarkStarResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnmarkStarResponseBody body;

    public static UnmarkStarResponse build(java.util.Map<String, ?> map) throws Exception {
        UnmarkStarResponse self = new UnmarkStarResponse();
        return TeaModel.build(map, self);
    }

    public UnmarkStarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnmarkStarResponse setBody(UnmarkStarResponseBody body) {
        this.body = body;
        return this;
    }
    public UnmarkStarResponseBody getBody() {
        return this.body;
    }

}
