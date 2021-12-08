// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkim_1_0.models;

import com.aliyun.tea.*;

public class GetSceneGroupInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSceneGroupInfoResponseBody body;

    public static GetSceneGroupInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSceneGroupInfoResponse self = new GetSceneGroupInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetSceneGroupInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSceneGroupInfoResponse setBody(GetSceneGroupInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSceneGroupInfoResponseBody getBody() {
        return this.body;
    }

}
