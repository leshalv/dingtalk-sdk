// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkindustry_1_0.models;

import com.aliyun.tea.*;

public class QueryGroupInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryGroupInfoResponseBody body;

    public static QueryGroupInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGroupInfoResponse self = new QueryGroupInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryGroupInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGroupInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryGroupInfoResponse setBody(QueryGroupInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGroupInfoResponseBody getBody() {
        return this.body;
    }

}
