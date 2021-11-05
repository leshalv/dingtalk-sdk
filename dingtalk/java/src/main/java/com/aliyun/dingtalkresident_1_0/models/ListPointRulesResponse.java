// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkresident_1_0.models;

import com.aliyun.tea.*;

public class ListPointRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPointRulesResponseBody body;

    public static ListPointRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPointRulesResponse self = new ListPointRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListPointRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPointRulesResponse setBody(ListPointRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPointRulesResponseBody getBody() {
        return this.body;
    }

}
