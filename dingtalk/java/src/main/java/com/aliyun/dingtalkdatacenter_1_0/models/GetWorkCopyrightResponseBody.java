// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkdatacenter_1_0.models;

import com.aliyun.tea.*;

public class GetWorkCopyrightResponseBody extends TeaModel {
    @NameInMap("data")
    public String data;

    @NameInMap("total")
    public Long total;

    public static GetWorkCopyrightResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkCopyrightResponseBody self = new GetWorkCopyrightResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkCopyrightResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetWorkCopyrightResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
