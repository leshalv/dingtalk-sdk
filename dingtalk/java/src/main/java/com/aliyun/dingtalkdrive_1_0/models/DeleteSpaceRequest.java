// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkdrive_1_0.models;

import com.aliyun.tea.*;

public class DeleteSpaceRequest extends TeaModel {
    @NameInMap("unionId")
    public String unionId;

    public static DeleteSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSpaceRequest self = new DeleteSpaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSpaceRequest setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

}
