// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkindustry_1_0.models;

import com.aliyun.tea.*;

public class CollegeQueryStudentInfoByMobileRequest extends TeaModel {
    // 手机号
    @NameInMap("mobile")
    public String mobile;

    public static CollegeQueryStudentInfoByMobileRequest build(java.util.Map<String, ?> map) throws Exception {
        CollegeQueryStudentInfoByMobileRequest self = new CollegeQueryStudentInfoByMobileRequest();
        return TeaModel.build(map, self);
    }

    public CollegeQueryStudentInfoByMobileRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

}