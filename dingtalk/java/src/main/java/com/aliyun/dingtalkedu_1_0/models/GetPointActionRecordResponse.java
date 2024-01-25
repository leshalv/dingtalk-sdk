// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkedu_1_0.models;

import com.aliyun.tea.*;

public class GetPointActionRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPointActionRecordResponseBody body;

    public static GetPointActionRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPointActionRecordResponse self = new GetPointActionRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetPointActionRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPointActionRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPointActionRecordResponse setBody(GetPointActionRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPointActionRecordResponseBody getBody() {
        return this.body;
    }

}
