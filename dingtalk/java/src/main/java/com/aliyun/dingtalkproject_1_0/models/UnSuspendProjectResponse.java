// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkproject_1_0.models;

import com.aliyun.tea.*;

public class UnSuspendProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnSuspendProjectResponseBody body;

    public static UnSuspendProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        UnSuspendProjectResponse self = new UnSuspendProjectResponse();
        return TeaModel.build(map, self);
    }

    public UnSuspendProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnSuspendProjectResponse setBody(UnSuspendProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public UnSuspendProjectResponseBody getBody() {
        return this.body;
    }

}
