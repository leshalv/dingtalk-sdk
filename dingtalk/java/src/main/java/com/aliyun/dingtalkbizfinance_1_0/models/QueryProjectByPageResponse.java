// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkbizfinance_1_0.models;

import com.aliyun.tea.*;

public class QueryProjectByPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryProjectByPageResponse setBody(QueryProjectByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryProjectByPageResponseBody getBody() {
        return this.body;
    }

}
