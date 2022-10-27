// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkrooms_1_0.models;

import com.aliyun.tea.*;

public class CreateMeetingRoomGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMeetingRoomGroupResponseBody body;

    public static CreateMeetingRoomGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMeetingRoomGroupResponse self = new CreateMeetingRoomGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateMeetingRoomGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMeetingRoomGroupResponse setBody(CreateMeetingRoomGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMeetingRoomGroupResponseBody getBody() {
        return this.body;
    }

}
