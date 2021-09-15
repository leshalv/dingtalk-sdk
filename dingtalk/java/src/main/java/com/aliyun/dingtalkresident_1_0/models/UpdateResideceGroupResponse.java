// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkresident_1_0.models;

import com.aliyun.tea.*;

public class UpdateResideceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateResideceGroupResponseBody body;

    public static UpdateResideceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResideceGroupResponse self = new UpdateResideceGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResideceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateResideceGroupResponse setBody(UpdateResideceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateResideceGroupResponseBody getBody() {
        return this.body;
    }

}
