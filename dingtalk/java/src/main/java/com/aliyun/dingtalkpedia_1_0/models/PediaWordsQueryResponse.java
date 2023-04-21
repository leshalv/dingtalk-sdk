// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkpedia_1_0.models;

import com.aliyun.tea.*;

public class PediaWordsQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PediaWordsQueryResponseBody body;

    public static PediaWordsQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        PediaWordsQueryResponse self = new PediaWordsQueryResponse();
        return TeaModel.build(map, self);
    }

    public PediaWordsQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PediaWordsQueryResponse setBody(PediaWordsQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public PediaWordsQueryResponseBody getBody() {
        return this.body;
    }

}
