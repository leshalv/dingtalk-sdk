// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkcontact_1_0.models;

import com.aliyun.tea.*;

public class BatchApproveUnionApplyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static BatchApproveUnionApplyResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchApproveUnionApplyResponse self = new BatchApproveUnionApplyResponse();
        return TeaModel.build(map, self);
    }

    public BatchApproveUnionApplyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}