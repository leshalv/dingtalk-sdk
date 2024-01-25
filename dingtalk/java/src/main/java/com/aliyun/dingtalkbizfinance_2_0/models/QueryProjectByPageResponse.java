// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkbizfinance_2_0.models;

import com.aliyun.tea.*;

public class QueryProjectByPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryProjectByPageResponseBody body;

    public static QueryProjectByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectByPageResponse self = new QueryProjectByPageResponse();
        return TeaModel.build(map, self);
    }

    public QueryProjectByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryProjectByPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryProjectByPageResponse setBody(QueryProjectByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryProjectByPageResponseBody getBody() {
        return this.body;
    }

}
