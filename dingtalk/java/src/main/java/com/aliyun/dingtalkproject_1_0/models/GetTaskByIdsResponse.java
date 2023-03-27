// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkproject_1_0.models;

import com.aliyun.tea.*;

public class GetTaskByIdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTaskByIdsResponseBody body;

    public static GetTaskByIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskByIdsResponse self = new GetTaskByIdsResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskByIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskByIdsResponse setBody(GetTaskByIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskByIdsResponseBody getBody() {
        return this.body;
    }

}
