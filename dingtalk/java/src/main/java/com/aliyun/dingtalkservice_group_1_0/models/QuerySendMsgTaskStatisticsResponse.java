// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkservice_group_1_0.models;

import com.aliyun.tea.*;

public class QuerySendMsgTaskStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySendMsgTaskStatisticsResponseBody body;

    public static QuerySendMsgTaskStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySendMsgTaskStatisticsResponse self = new QuerySendMsgTaskStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySendMsgTaskStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySendMsgTaskStatisticsResponse setBody(QuerySendMsgTaskStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySendMsgTaskStatisticsResponseBody getBody() {
        return this.body;
    }

}