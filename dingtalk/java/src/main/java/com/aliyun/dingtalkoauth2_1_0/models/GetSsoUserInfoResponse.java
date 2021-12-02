// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkoauth2_1_0.models;

import com.aliyun.tea.*;

public class GetSsoUserInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSsoUserInfoResponseBody body;

    public static GetSsoUserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSsoUserInfoResponse self = new GetSsoUserInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetSsoUserInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSsoUserInfoResponse setBody(GetSsoUserInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSsoUserInfoResponseBody getBody() {
        return this.body;
    }

}
