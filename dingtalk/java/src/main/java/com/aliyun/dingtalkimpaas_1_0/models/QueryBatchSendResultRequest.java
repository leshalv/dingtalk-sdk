// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkimpaas_1_0.models;

import com.aliyun.tea.*;

public class QueryBatchSendResultRequest extends TeaModel {
    // 发送者，必须是B端用户
    @NameInMap("senderUserId")
    public String senderUserId;

    // batchSend返回的taskId
    @NameInMap("taskId")
    public String taskId;

    public static QueryBatchSendResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBatchSendResultRequest self = new QueryBatchSendResultRequest();
        return TeaModel.build(map, self);
    }

    public QueryBatchSendResultRequest setSenderUserId(String senderUserId) {
        this.senderUserId = senderUserId;
        return this;
    }
    public String getSenderUserId() {
        return this.senderUserId;
    }

    public QueryBatchSendResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
