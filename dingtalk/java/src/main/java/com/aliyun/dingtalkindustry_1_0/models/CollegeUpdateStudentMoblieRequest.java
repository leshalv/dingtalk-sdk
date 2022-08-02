// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkindustry_1_0.models;

import com.aliyun.tea.*;

public class CollegeUpdateStudentMoblieRequest extends TeaModel {
    // 是否直接更换
    @NameInMap("isForce")
    public Boolean isForce;

    // 修改后的手机号
    @NameInMap("newMobile")
    public String newMobile;

    // 学生id
    @NameInMap("studentId")
    public Long studentId;

    public static CollegeUpdateStudentMoblieRequest build(java.util.Map<String, ?> map) throws Exception {
        CollegeUpdateStudentMoblieRequest self = new CollegeUpdateStudentMoblieRequest();
        return TeaModel.build(map, self);
    }

    public CollegeUpdateStudentMoblieRequest setIsForce(Boolean isForce) {
        this.isForce = isForce;
        return this;
    }
    public Boolean getIsForce() {
        return this.isForce;
    }

    public CollegeUpdateStudentMoblieRequest setNewMobile(String newMobile) {
        this.newMobile = newMobile;
        return this;
    }
    public String getNewMobile() {
        return this.newMobile;
    }

    public CollegeUpdateStudentMoblieRequest setStudentId(Long studentId) {
        this.studentId = studentId;
        return this;
    }
    public Long getStudentId() {
        return this.studentId;
    }

}
