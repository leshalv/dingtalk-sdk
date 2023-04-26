// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkesign_2_0.models;

import com.aliyun.tea.*;

public class ChannelOrdersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChannelOrdersResponseBody body;

    public static ChannelOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        ChannelOrdersResponse self = new ChannelOrdersResponse();
        return TeaModel.build(map, self);
    }

    public ChannelOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChannelOrdersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChannelOrdersResponse setBody(ChannelOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public ChannelOrdersResponseBody getBody() {
        return this.body;
    }

}
