// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkproject_1_0.models;

import com.aliyun.tea.*;

public class UpdateTaskContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTaskContentResponseBody body;

    public static UpdateTaskContentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskContentResponse self = new UpdateTaskContentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTaskContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTaskContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTaskContentResponse setBody(UpdateTaskContentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTaskContentResponseBody getBody() {
        return this.body;
    }

}
