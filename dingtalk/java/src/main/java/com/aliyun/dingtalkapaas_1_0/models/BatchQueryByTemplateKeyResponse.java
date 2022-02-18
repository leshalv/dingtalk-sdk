// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkapaas_1_0.models;

import com.aliyun.tea.*;

public class BatchQueryByTemplateKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchQueryByTemplateKeyResponseBody body;

    public static BatchQueryByTemplateKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryByTemplateKeyResponse self = new BatchQueryByTemplateKeyResponse();
        return TeaModel.build(map, self);
    }

    public BatchQueryByTemplateKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchQueryByTemplateKeyResponse setBody(BatchQueryByTemplateKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchQueryByTemplateKeyResponseBody getBody() {
        return this.body;
    }

}