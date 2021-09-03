// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkcontact_1_0.models;

import com.aliyun.tea.*;

public class TranslateFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TranslateFileResponseBody body;

    public static TranslateFileResponse build(java.util.Map<String, ?> map) throws Exception {
        TranslateFileResponse self = new TranslateFileResponse();
        return TeaModel.build(map, self);
    }

    public TranslateFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TranslateFileResponse setBody(TranslateFileResponseBody body) {
        this.body = body;
        return this;
    }
    public TranslateFileResponseBody getBody() {
        return this.body;
    }

}
