// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkimpaas_1_0.models;

import com.aliyun.tea.*;

public class AddGroupMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddGroupMembersResponseBody body;

    public static AddGroupMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGroupMembersResponse self = new AddGroupMembersResponse();
        return TeaModel.build(map, self);
    }

    public AddGroupMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddGroupMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddGroupMembersResponse setBody(AddGroupMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGroupMembersResponseBody getBody() {
        return this.body;
    }

}
