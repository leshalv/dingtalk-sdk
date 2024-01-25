// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkindustry_1_0.models;

import com.aliyun.tea.*;

public class SupplyListRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SupplyListRoleResponseBody body;

    public static SupplyListRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        SupplyListRoleResponse self = new SupplyListRoleResponse();
        return TeaModel.build(map, self);
    }

    public SupplyListRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SupplyListRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SupplyListRoleResponse setBody(SupplyListRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public SupplyListRoleResponseBody getBody() {
        return this.body;
    }

}
