// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkrooms_1_0.models;

import com.aliyun.tea.*;

public class UpdateMeetingRoomGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMeetingRoomGroupResponseBody body;

    public static UpdateMeetingRoomGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeetingRoomGroupResponse self = new UpdateMeetingRoomGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMeetingRoomGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMeetingRoomGroupResponse setBody(UpdateMeetingRoomGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMeetingRoomGroupResponseBody getBody() {
        return this.body;
    }

}