// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalklive_1_0.models;

import com.aliyun.tea.*;

public class StartCloudFeedRequest extends TeaModel {
    // 操作者的组织内id（staffId）
    @NameInMap("userId")
    public String userId;

    public static StartCloudFeedRequest build(java.util.Map<String, ?> map) throws Exception {
        StartCloudFeedRequest self = new StartCloudFeedRequest();
        return TeaModel.build(map, self);
    }

    public StartCloudFeedRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
