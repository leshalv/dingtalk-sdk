// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkindustry_1_0.models;

import com.aliyun.tea.*;

public class DigitalStoreContactInfoResponseBody extends TeaModel {
    // 门店通通讯录Code
    @NameInMap("code")
    public String code;

    // 门店通通讯录名称
    @NameInMap("name")
    public String name;

    // 门店通通讯录根节点Id
    @NameInMap("rootDeptId")
    public Long rootDeptId;

    public static DigitalStoreContactInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DigitalStoreContactInfoResponseBody self = new DigitalStoreContactInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DigitalStoreContactInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DigitalStoreContactInfoResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DigitalStoreContactInfoResponseBody setRootDeptId(Long rootDeptId) {
        this.rootDeptId = rootDeptId;
        return this;
    }
    public Long getRootDeptId() {
        return this.rootDeptId;
    }

}