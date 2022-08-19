// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalklive_1_0.models;

import com.aliyun.tea.*;

public class CreateLiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLiveResponseBody body;

    public static CreateLiveResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveResponse self = new CreateLiveResponse();
        return TeaModel.build(map, self);
    }

    public CreateLiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLiveResponse setBody(CreateLiveResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLiveResponseBody getBody() {
        return this.body;
    }

}