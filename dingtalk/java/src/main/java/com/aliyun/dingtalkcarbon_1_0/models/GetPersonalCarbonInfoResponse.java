// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkcarbon_1_0.models;

import com.aliyun.tea.*;

public class GetPersonalCarbonInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPersonalCarbonInfoResponseBody body;

    public static GetPersonalCarbonInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPersonalCarbonInfoResponse self = new GetPersonalCarbonInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetPersonalCarbonInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPersonalCarbonInfoResponse setBody(GetPersonalCarbonInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPersonalCarbonInfoResponseBody getBody() {
        return this.body;
    }

}