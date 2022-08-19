// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkdoc_1_0.models;

import com.aliyun.tea.*;

public class SheetAutofitRowsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SheetAutofitRowsResponseBody body;

    public static SheetAutofitRowsResponse build(java.util.Map<String, ?> map) throws Exception {
        SheetAutofitRowsResponse self = new SheetAutofitRowsResponse();
        return TeaModel.build(map, self);
    }

    public SheetAutofitRowsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SheetAutofitRowsResponse setBody(SheetAutofitRowsResponseBody body) {
        this.body = body;
        return this;
    }
    public SheetAutofitRowsResponseBody getBody() {
        return this.body;
    }

}
