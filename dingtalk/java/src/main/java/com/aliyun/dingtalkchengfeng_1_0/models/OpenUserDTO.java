// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkchengfeng_1_0.models;

import com.aliyun.tea.*;

public class OpenUserDTO extends TeaModel {
    /**
     * <p>用户id</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>用户名称</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>钉钉用户id</p>
     */
    @NameInMap("userId")
    public String userId;

    public static OpenUserDTO build(java.util.Map<String, ?> map) throws Exception {
        OpenUserDTO self = new OpenUserDTO();
        return TeaModel.build(map, self);
    }

    public OpenUserDTO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public OpenUserDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OpenUserDTO setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
