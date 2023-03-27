// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkproject_1_0.models;

import com.aliyun.tea.*;

public class SearchOranizationCustomfieldResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchOranizationCustomfieldResponseBody body;

    public static SearchOranizationCustomfieldResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchOranizationCustomfieldResponse self = new SearchOranizationCustomfieldResponse();
        return TeaModel.build(map, self);
    }

    public SearchOranizationCustomfieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchOranizationCustomfieldResponse setBody(SearchOranizationCustomfieldResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchOranizationCustomfieldResponseBody getBody() {
        return this.body;
    }

}
