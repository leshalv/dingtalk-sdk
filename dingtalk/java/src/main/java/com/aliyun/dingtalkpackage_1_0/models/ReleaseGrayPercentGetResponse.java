// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkpackage_1_0.models;

import com.aliyun.tea.*;

public class ReleaseGrayPercentGetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseGrayPercentGetResponseBody body;

    public static ReleaseGrayPercentGetResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseGrayPercentGetResponse self = new ReleaseGrayPercentGetResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseGrayPercentGetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseGrayPercentGetResponse setBody(ReleaseGrayPercentGetResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseGrayPercentGetResponseBody getBody() {
        return this.body;
    }

}