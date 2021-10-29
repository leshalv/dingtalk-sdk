// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkedu_1_0.models;

import com.aliyun.tea.*;

public class DeleteDeviceOrgResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDeviceOrgResponseBody body;

    public static DeleteDeviceOrgResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceOrgResponse self = new DeleteDeviceOrgResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceOrgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeviceOrgResponse setBody(DeleteDeviceOrgResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeviceOrgResponseBody getBody() {
        return this.body;
    }

}
