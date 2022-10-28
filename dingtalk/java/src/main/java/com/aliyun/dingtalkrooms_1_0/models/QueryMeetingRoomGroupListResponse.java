// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkrooms_1_0.models;

import com.aliyun.tea.*;

public class QueryMeetingRoomGroupListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMeetingRoomGroupListResponseBody body;

    public static QueryMeetingRoomGroupListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMeetingRoomGroupListResponse self = new QueryMeetingRoomGroupListResponse();
        return TeaModel.build(map, self);
    }

    public QueryMeetingRoomGroupListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMeetingRoomGroupListResponse setBody(QueryMeetingRoomGroupListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMeetingRoomGroupListResponseBody getBody() {
        return this.body;
    }

}