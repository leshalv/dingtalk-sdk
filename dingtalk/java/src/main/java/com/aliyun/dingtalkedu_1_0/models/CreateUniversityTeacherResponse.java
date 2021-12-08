// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkedu_1_0.models;

import com.aliyun.tea.*;

public class CreateUniversityTeacherResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateUniversityTeacherResponseBody body;

    public static CreateUniversityTeacherResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUniversityTeacherResponse self = new CreateUniversityTeacherResponse();
        return TeaModel.build(map, self);
    }

    public CreateUniversityTeacherResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUniversityTeacherResponse setBody(CreateUniversityTeacherResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUniversityTeacherResponseBody getBody() {
        return this.body;
    }

}
