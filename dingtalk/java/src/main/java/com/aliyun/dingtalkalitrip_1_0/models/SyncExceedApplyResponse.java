// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkalitrip_1_0.models;

import com.aliyun.tea.*;

public class SyncExceedApplyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SyncExceedApplyResponseBody body;

    public static SyncExceedApplyResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncExceedApplyResponse self = new SyncExceedApplyResponse();
        return TeaModel.build(map, self);
    }

    public SyncExceedApplyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncExceedApplyResponse setBody(SyncExceedApplyResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncExceedApplyResponseBody getBody() {
        return this.body;
    }

}
