// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkworkflow_1_0.models;

import com.aliyun.tea.*;

public class ExecuteProcessInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecuteProcessInstanceResponseBody body;

    public static ExecuteProcessInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteProcessInstanceResponse self = new ExecuteProcessInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteProcessInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteProcessInstanceResponse setBody(ExecuteProcessInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteProcessInstanceResponseBody getBody() {
        return this.body;
    }

}