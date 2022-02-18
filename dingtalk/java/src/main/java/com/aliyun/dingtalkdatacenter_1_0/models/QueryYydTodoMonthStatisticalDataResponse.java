// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkdatacenter_1_0.models;

import com.aliyun.tea.*;

public class QueryYydTodoMonthStatisticalDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryYydTodoMonthStatisticalDataResponseBody body;

    public static QueryYydTodoMonthStatisticalDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryYydTodoMonthStatisticalDataResponse self = new QueryYydTodoMonthStatisticalDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryYydTodoMonthStatisticalDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryYydTodoMonthStatisticalDataResponse setBody(QueryYydTodoMonthStatisticalDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryYydTodoMonthStatisticalDataResponseBody getBody() {
        return this.body;
    }

}