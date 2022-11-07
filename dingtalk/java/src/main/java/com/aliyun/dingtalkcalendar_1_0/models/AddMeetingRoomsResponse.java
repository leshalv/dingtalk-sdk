// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkcalendar_1_0.models;

import com.aliyun.tea.*;

public class AddMeetingRoomsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMeetingRoomsResponseBody body;

    public static AddMeetingRoomsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMeetingRoomsResponse self = new AddMeetingRoomsResponse();
        return TeaModel.build(map, self);
    }

    public AddMeetingRoomsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMeetingRoomsResponse setBody(AddMeetingRoomsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMeetingRoomsResponseBody getBody() {
        return this.body;
    }

}