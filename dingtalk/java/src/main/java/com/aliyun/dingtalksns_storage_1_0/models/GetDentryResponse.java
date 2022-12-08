// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalksns_storage_1_0.models;

import com.aliyun.tea.*;

public class GetDentryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDentryResponseBody body;

    public static GetDentryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDentryResponse self = new GetDentryResponse();
        return TeaModel.build(map, self);
    }

    public GetDentryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDentryResponse setBody(GetDentryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDentryResponseBody getBody() {
        return this.body;
    }

}