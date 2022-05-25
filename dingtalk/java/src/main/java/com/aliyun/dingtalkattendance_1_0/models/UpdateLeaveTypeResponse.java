// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkattendance_1_0.models;

import com.aliyun.tea.*;

public class UpdateLeaveTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLeaveTypeResponseBody body;

    public static UpdateLeaveTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLeaveTypeResponse self = new UpdateLeaveTypeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLeaveTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLeaveTypeResponse setBody(UpdateLeaveTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLeaveTypeResponseBody getBody() {
        return this.body;
    }

}