// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkrooms_1_0.models;

import com.aliyun.tea.*;

public class DeleteMeetingRoomGroupResponseBody extends TeaModel {
    // 是否成功
    @NameInMap("result")
    public Boolean result;

    public static DeleteMeetingRoomGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMeetingRoomGroupResponseBody self = new DeleteMeetingRoomGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMeetingRoomGroupResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}