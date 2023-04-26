// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkyida_1_0.models;

import com.aliyun.tea.*;

public class GetInstancesByIdListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstancesByIdListResponseBody body;

    public static GetInstancesByIdListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstancesByIdListResponse self = new GetInstancesByIdListResponse();
        return TeaModel.build(map, self);
    }

    public GetInstancesByIdListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstancesByIdListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstancesByIdListResponse setBody(GetInstancesByIdListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstancesByIdListResponseBody getBody() {
        return this.body;
    }

}
