// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkattendance_1_0.models;

import com.aliyun.tea.*;

public class GetSimpleOvertimeSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSimpleOvertimeSettingResponseBody body;

    public static GetSimpleOvertimeSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSimpleOvertimeSettingResponse self = new GetSimpleOvertimeSettingResponse();
        return TeaModel.build(map, self);
    }

    public GetSimpleOvertimeSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSimpleOvertimeSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSimpleOvertimeSettingResponse setBody(GetSimpleOvertimeSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSimpleOvertimeSettingResponseBody getBody() {
        return this.body;
    }

}
