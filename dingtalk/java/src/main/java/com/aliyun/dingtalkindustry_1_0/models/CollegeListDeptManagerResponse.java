// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkindustry_1_0.models;

import com.aliyun.tea.*;

public class CollegeListDeptManagerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CollegeListDeptManagerResponseBody body;

    public static CollegeListDeptManagerResponse build(java.util.Map<String, ?> map) throws Exception {
        CollegeListDeptManagerResponse self = new CollegeListDeptManagerResponse();
        return TeaModel.build(map, self);
    }

    public CollegeListDeptManagerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CollegeListDeptManagerResponse setBody(CollegeListDeptManagerResponseBody body) {
        this.body = body;
        return this;
    }
    public CollegeListDeptManagerResponseBody getBody() {
        return this.body;
    }

}