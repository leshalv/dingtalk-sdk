// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkmanufacturing_1_0.models;

import com.aliyun.tea.*;

public class IndustrializeManufactureQueryJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public IndustrializeManufactureQueryJobsResponseBody body;

    public static IndustrializeManufactureQueryJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        IndustrializeManufactureQueryJobsResponse self = new IndustrializeManufactureQueryJobsResponse();
        return TeaModel.build(map, self);
    }

    public IndustrializeManufactureQueryJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IndustrializeManufactureQueryJobsResponse setBody(IndustrializeManufactureQueryJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public IndustrializeManufactureQueryJobsResponseBody getBody() {
        return this.body;
    }

}
