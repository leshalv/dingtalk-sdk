// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkbizfinance_2_0.models;

import com.aliyun.tea.*;

public class BankGatewayInvokeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BankGatewayInvokeResponseBody body;

    public static BankGatewayInvokeResponse build(java.util.Map<String, ?> map) throws Exception {
        BankGatewayInvokeResponse self = new BankGatewayInvokeResponse();
        return TeaModel.build(map, self);
    }

    public BankGatewayInvokeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BankGatewayInvokeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BankGatewayInvokeResponse setBody(BankGatewayInvokeResponseBody body) {
        this.body = body;
        return this;
    }
    public BankGatewayInvokeResponseBody getBody() {
        return this.body;
    }

}
