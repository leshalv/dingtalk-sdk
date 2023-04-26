// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkdevicemng_1_0.models;

import com.aliyun.tea.*;

public class UninstallDeviceRobotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UninstallDeviceRobotResponseBody body;

    public static UninstallDeviceRobotResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallDeviceRobotResponse self = new UninstallDeviceRobotResponse();
        return TeaModel.build(map, self);
    }

    public UninstallDeviceRobotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallDeviceRobotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UninstallDeviceRobotResponse setBody(UninstallDeviceRobotResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallDeviceRobotResponseBody getBody() {
        return this.body;
    }

}
