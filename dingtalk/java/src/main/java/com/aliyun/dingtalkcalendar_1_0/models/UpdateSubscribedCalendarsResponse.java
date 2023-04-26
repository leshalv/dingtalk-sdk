// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkcalendar_1_0.models;

import com.aliyun.tea.*;

public class UpdateSubscribedCalendarsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSubscribedCalendarsResponseBody body;

    public static UpdateSubscribedCalendarsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubscribedCalendarsResponse self = new UpdateSubscribedCalendarsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSubscribedCalendarsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSubscribedCalendarsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSubscribedCalendarsResponse setBody(UpdateSubscribedCalendarsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSubscribedCalendarsResponseBody getBody() {
        return this.body;
    }

}
