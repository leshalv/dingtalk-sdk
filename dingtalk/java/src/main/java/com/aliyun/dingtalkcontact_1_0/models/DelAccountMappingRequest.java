// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkcontact_1_0.models;

import com.aliyun.tea.*;

public class DelAccountMappingRequest extends TeaModel {
    @NameInMap("domain")
    public String domain;

    @NameInMap("userId")
    public String userId;

    public static DelAccountMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        DelAccountMappingRequest self = new DelAccountMappingRequest();
        return TeaModel.build(map, self);
    }

    public DelAccountMappingRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DelAccountMappingRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
