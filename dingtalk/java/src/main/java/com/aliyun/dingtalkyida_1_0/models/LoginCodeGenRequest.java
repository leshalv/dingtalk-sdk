// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkyida_1_0.models;

import com.aliyun.tea.*;

public class LoginCodeGenRequest extends TeaModel {
    @NameInMap("userId")
    public String userId;

    public static LoginCodeGenRequest build(java.util.Map<String, ?> map) throws Exception {
        LoginCodeGenRequest self = new LoginCodeGenRequest();
        return TeaModel.build(map, self);
    }

    public LoginCodeGenRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
