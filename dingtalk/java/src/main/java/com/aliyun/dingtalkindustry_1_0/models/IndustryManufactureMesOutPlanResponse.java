// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkindustry_1_0.models;

import com.aliyun.tea.*;

public class IndustryManufactureMesOutPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public IndustryManufactureMesOutPlanResponseBody body;

    public static IndustryManufactureMesOutPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        IndustryManufactureMesOutPlanResponse self = new IndustryManufactureMesOutPlanResponse();
        return TeaModel.build(map, self);
    }

    public IndustryManufactureMesOutPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IndustryManufactureMesOutPlanResponse setBody(IndustryManufactureMesOutPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public IndustryManufactureMesOutPlanResponseBody getBody() {
        return this.body;
    }

}