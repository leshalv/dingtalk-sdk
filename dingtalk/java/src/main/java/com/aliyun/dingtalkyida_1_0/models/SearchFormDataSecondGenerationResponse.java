// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkyida_1_0.models;

import com.aliyun.tea.*;

public class SearchFormDataSecondGenerationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchFormDataSecondGenerationResponseBody body;

    public static SearchFormDataSecondGenerationResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchFormDataSecondGenerationResponse self = new SearchFormDataSecondGenerationResponse();
        return TeaModel.build(map, self);
    }

    public SearchFormDataSecondGenerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchFormDataSecondGenerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchFormDataSecondGenerationResponse setBody(SearchFormDataSecondGenerationResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchFormDataSecondGenerationResponseBody getBody() {
        return this.body;
    }

}
