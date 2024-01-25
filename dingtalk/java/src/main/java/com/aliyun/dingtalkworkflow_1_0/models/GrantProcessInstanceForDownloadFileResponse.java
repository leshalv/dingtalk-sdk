// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkworkflow_1_0.models;

import com.aliyun.tea.*;

public class GrantProcessInstanceForDownloadFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantProcessInstanceForDownloadFileResponseBody body;

    public static GrantProcessInstanceForDownloadFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantProcessInstanceForDownloadFileResponse self = new GrantProcessInstanceForDownloadFileResponse();
        return TeaModel.build(map, self);
    }

    public GrantProcessInstanceForDownloadFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantProcessInstanceForDownloadFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantProcessInstanceForDownloadFileResponse setBody(GrantProcessInstanceForDownloadFileResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantProcessInstanceForDownloadFileResponseBody getBody() {
        return this.body;
    }

}
