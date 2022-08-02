// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkindustry_1_0.models;

import com.aliyun.tea.*;

public class CollegeActiveCollegeDeptGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CollegeActiveCollegeDeptGroupResponseBody body;

    public static CollegeActiveCollegeDeptGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CollegeActiveCollegeDeptGroupResponse self = new CollegeActiveCollegeDeptGroupResponse();
        return TeaModel.build(map, self);
    }

    public CollegeActiveCollegeDeptGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CollegeActiveCollegeDeptGroupResponse setBody(CollegeActiveCollegeDeptGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CollegeActiveCollegeDeptGroupResponseBody getBody() {
        return this.body;
    }

}
