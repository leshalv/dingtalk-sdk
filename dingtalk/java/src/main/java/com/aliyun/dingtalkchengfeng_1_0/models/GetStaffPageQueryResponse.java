// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkchengfeng_1_0.models;

import com.aliyun.tea.*;

public class GetStaffPageQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetStaffPageQueryResponseBody body;

    public static GetStaffPageQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStaffPageQueryResponse self = new GetStaffPageQueryResponse();
        return TeaModel.build(map, self);
    }

    public GetStaffPageQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStaffPageQueryResponse setBody(GetStaffPageQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStaffPageQueryResponseBody getBody() {
        return this.body;
    }

}
