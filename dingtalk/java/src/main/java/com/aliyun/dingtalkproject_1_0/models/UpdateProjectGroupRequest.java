// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkproject_1_0.models;

import com.aliyun.tea.*;

public class UpdateProjectGroupRequest extends TeaModel {
    // 增加到项目分组的Id列表，最多5个
    @NameInMap("addProjectGroupIds")
    public java.util.List<String> addProjectGroupIds;

    // 移除项目分组的Id列表，最多5个
    @NameInMap("delProjectGroupIds")
    public java.util.List<String> delProjectGroupIds;

    public static UpdateProjectGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectGroupRequest self = new UpdateProjectGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectGroupRequest setAddProjectGroupIds(java.util.List<String> addProjectGroupIds) {
        this.addProjectGroupIds = addProjectGroupIds;
        return this;
    }
    public java.util.List<String> getAddProjectGroupIds() {
        return this.addProjectGroupIds;
    }

    public UpdateProjectGroupRequest setDelProjectGroupIds(java.util.List<String> delProjectGroupIds) {
        this.delProjectGroupIds = delProjectGroupIds;
        return this;
    }
    public java.util.List<String> getDelProjectGroupIds() {
        return this.delProjectGroupIds;
    }

}
