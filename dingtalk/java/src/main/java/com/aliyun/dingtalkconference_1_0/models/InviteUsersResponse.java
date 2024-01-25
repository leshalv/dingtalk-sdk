// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkconference_1_0.models;

import com.aliyun.tea.*;

public class InviteUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InviteUsersResponseBody body;

    public static InviteUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        InviteUsersResponse self = new InviteUsersResponse();
        return TeaModel.build(map, self);
    }

    public InviteUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InviteUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InviteUsersResponse setBody(InviteUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public InviteUsersResponseBody getBody() {
        return this.body;
    }

}
