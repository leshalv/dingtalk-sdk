// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkexclusive_1_0.models;

import com.aliyun.tea.*;

public class DeleteAcrossCloudStroageConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAcrossCloudStroageConfigsResponseBody body;

    public static DeleteAcrossCloudStroageConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAcrossCloudStroageConfigsResponse self = new DeleteAcrossCloudStroageConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAcrossCloudStroageConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAcrossCloudStroageConfigsResponse setBody(DeleteAcrossCloudStroageConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAcrossCloudStroageConfigsResponseBody getBody() {
        return this.body;
    }

}