// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkresident_1_0.models;

import com.aliyun.tea.*;

public class DeleteResidentDepartmentResponseBody extends TeaModel {
    @NameInMap("result")
    public Boolean result;

    public static DeleteResidentDepartmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteResidentDepartmentResponseBody self = new DeleteResidentDepartmentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteResidentDepartmentResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
