// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkdevicemng_1_0.models;

import com.aliyun.tea.*;

public class BatchRegisterDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchRegisterDeviceResponseBody body;

    public static BatchRegisterDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchRegisterDeviceResponse self = new BatchRegisterDeviceResponse();
        return TeaModel.build(map, self);
    }

    public BatchRegisterDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchRegisterDeviceResponse setBody(BatchRegisterDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchRegisterDeviceResponseBody getBody() {
        return this.body;
    }

}
