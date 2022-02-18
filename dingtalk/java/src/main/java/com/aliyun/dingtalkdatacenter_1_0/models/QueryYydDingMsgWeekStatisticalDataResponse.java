// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkdatacenter_1_0.models;

import com.aliyun.tea.*;

public class QueryYydDingMsgWeekStatisticalDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryYydDingMsgWeekStatisticalDataResponseBody body;

    public static QueryYydDingMsgWeekStatisticalDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryYydDingMsgWeekStatisticalDataResponse self = new QueryYydDingMsgWeekStatisticalDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryYydDingMsgWeekStatisticalDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryYydDingMsgWeekStatisticalDataResponse setBody(QueryYydDingMsgWeekStatisticalDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryYydDingMsgWeekStatisticalDataResponseBody getBody() {
        return this.body;
    }

}