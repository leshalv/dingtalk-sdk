// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkcard_1_0.models;

import com.aliyun.tea.*;

public class CreateCardWithDelegateResponseBody extends TeaModel {
    @NameInMap("result")
    public String result;

    @NameInMap("success")
    public Boolean success;

    public static CreateCardWithDelegateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCardWithDelegateResponseBody self = new CreateCardWithDelegateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCardWithDelegateResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public CreateCardWithDelegateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
