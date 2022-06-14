// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkdevicemng_1_0.models;

import com.aliyun.tea.*;

public class SendMsgResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendMsgResponseBody body;

    public static SendMsgResponse build(java.util.Map<String, ?> map) throws Exception {
        SendMsgResponse self = new SendMsgResponse();
        return TeaModel.build(map, self);
    }

    public SendMsgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendMsgResponse setBody(SendMsgResponseBody body) {
        this.body = body;
        return this;
    }
    public SendMsgResponseBody getBody() {
        return this.body;
    }

}
