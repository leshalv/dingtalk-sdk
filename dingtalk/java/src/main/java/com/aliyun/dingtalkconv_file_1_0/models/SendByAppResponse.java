// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkconv_file_1_0.models;

import com.aliyun.tea.*;

public class SendByAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendByAppResponseBody body;

    public static SendByAppResponse build(java.util.Map<String, ?> map) throws Exception {
        SendByAppResponse self = new SendByAppResponse();
        return TeaModel.build(map, self);
    }

    public SendByAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendByAppResponse setBody(SendByAppResponseBody body) {
        this.body = body;
        return this;
    }
    public SendByAppResponseBody getBody() {
        return this.body;
    }

}