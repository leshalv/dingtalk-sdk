// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkindustry_1_0.models;

import com.aliyun.tea.*;

public class CollegeQueryStudentInfoByMobileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CollegeQueryStudentInfoByMobileResponseBody body;

    public static CollegeQueryStudentInfoByMobileResponse build(java.util.Map<String, ?> map) throws Exception {
        CollegeQueryStudentInfoByMobileResponse self = new CollegeQueryStudentInfoByMobileResponse();
        return TeaModel.build(map, self);
    }

    public CollegeQueryStudentInfoByMobileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CollegeQueryStudentInfoByMobileResponse setBody(CollegeQueryStudentInfoByMobileResponseBody body) {
        this.body = body;
        return this;
    }
    public CollegeQueryStudentInfoByMobileResponseBody getBody() {
        return this.body;
    }

}
