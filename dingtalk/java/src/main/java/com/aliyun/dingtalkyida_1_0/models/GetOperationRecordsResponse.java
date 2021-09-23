// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkyida_1_0.models;

import com.aliyun.tea.*;

public class GetOperationRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOperationRecordsResponseBody body;

    public static GetOperationRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOperationRecordsResponse self = new GetOperationRecordsResponse();
        return TeaModel.build(map, self);
    }

    public GetOperationRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOperationRecordsResponse setBody(GetOperationRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOperationRecordsResponseBody getBody() {
        return this.body;
    }

}
