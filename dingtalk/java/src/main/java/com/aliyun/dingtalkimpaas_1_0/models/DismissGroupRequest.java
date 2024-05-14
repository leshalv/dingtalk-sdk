// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkimpaas_1_0.models;

import com.aliyun.tea.*;

public class DismissGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("conversationId")
    public String conversationId;

    @NameInMap("operatorUid")
    public String operatorUid;

    public static DismissGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DismissGroupRequest self = new DismissGroupRequest();
        return TeaModel.build(map, self);
    }

    public DismissGroupRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public DismissGroupRequest setOperatorUid(String operatorUid) {
        this.operatorUid = operatorUid;
        return this;
    }
    public String getOperatorUid() {
        return this.operatorUid;
    }

}
