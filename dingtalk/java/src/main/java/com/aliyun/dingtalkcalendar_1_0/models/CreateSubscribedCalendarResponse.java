// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkcalendar_1_0.models;

import com.aliyun.tea.*;

public class CreateSubscribedCalendarResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSubscribedCalendarResponseBody body;

    public static CreateSubscribedCalendarResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSubscribedCalendarResponse self = new CreateSubscribedCalendarResponse();
        return TeaModel.build(map, self);
    }

    public CreateSubscribedCalendarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSubscribedCalendarResponse setBody(CreateSubscribedCalendarResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSubscribedCalendarResponseBody getBody() {
        return this.body;
    }

}