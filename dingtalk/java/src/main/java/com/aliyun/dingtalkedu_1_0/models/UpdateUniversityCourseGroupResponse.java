// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkedu_1_0.models;

import com.aliyun.tea.*;

public class UpdateUniversityCourseGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateUniversityCourseGroupResponseBody body;

    public static UpdateUniversityCourseGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUniversityCourseGroupResponse self = new UpdateUniversityCourseGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUniversityCourseGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUniversityCourseGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUniversityCourseGroupResponse setBody(UpdateUniversityCourseGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUniversityCourseGroupResponseBody getBody() {
        return this.body;
    }

}
