// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkh3yun_1_0.models;

import com.aliyun.tea.*;

public class GetRoleUsersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("roleId")
    public String roleId;

    public static GetRoleUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRoleUsersRequest self = new GetRoleUsersRequest();
        return TeaModel.build(map, self);
    }

    public GetRoleUsersRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

}
