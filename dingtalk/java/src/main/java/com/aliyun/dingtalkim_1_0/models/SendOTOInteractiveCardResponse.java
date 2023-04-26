// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkim_1_0.models;

import com.aliyun.tea.*;

public class SendOTOInteractiveCardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SendOTOInteractiveCardResponseBody body;

    public static SendOTOInteractiveCardResponse build(java.util.Map<String, ?> map) throws Exception {
        SendOTOInteractiveCardResponse self = new SendOTOInteractiveCardResponse();
        return TeaModel.build(map, self);
    }

    public SendOTOInteractiveCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendOTOInteractiveCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendOTOInteractiveCardResponse setBody(SendOTOInteractiveCardResponseBody body) {
        this.body = body;
        return this;
    }
    public SendOTOInteractiveCardResponseBody getBody() {
        return this.body;
    }

}
