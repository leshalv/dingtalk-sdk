// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkorg_culture_1_0.models;

import com.aliyun.tea.*;

public class QueryPointActionAutoAssignRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPointActionAutoAssignRuleResponseBody body;

    public static QueryPointActionAutoAssignRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPointActionAutoAssignRuleResponse self = new QueryPointActionAutoAssignRuleResponse();
        return TeaModel.build(map, self);
    }

    public QueryPointActionAutoAssignRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPointActionAutoAssignRuleResponse setBody(QueryPointActionAutoAssignRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPointActionAutoAssignRuleResponseBody getBody() {
        return this.body;
    }

}