// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkim_1_0.models;

import com.aliyun.tea.*;

public class SendTemplateInteractiveCardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendTemplateInteractiveCardResponseBody body;

    public static SendTemplateInteractiveCardResponse build(java.util.Map<String, ?> map) throws Exception {
        SendTemplateInteractiveCardResponse self = new SendTemplateInteractiveCardResponse();
        return TeaModel.build(map, self);
    }

    public SendTemplateInteractiveCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendTemplateInteractiveCardResponse setBody(SendTemplateInteractiveCardResponseBody body) {
        this.body = body;
        return this;
    }
    public SendTemplateInteractiveCardResponseBody getBody() {
        return this.body;
    }

}
