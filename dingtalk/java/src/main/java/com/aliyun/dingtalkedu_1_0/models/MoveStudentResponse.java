// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkedu_1_0.models;

import com.aliyun.tea.*;

public class MoveStudentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MoveStudentResponseBody body;

    public static MoveStudentResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveStudentResponse self = new MoveStudentResponse();
        return TeaModel.build(map, self);
    }

    public MoveStudentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveStudentResponse setBody(MoveStudentResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveStudentResponseBody getBody() {
        return this.body;
    }

}
