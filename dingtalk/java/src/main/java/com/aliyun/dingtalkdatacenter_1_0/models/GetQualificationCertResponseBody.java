// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkdatacenter_1_0.models;

import com.aliyun.tea.*;

public class GetQualificationCertResponseBody extends TeaModel {
    @NameInMap("data")
    public String data;

    @NameInMap("total")
    public Long total;

    public static GetQualificationCertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualificationCertResponseBody self = new GetQualificationCertResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualificationCertResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetQualificationCertResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
