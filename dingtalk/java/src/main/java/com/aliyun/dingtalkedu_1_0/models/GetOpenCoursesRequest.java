// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkedu_1_0.models;

import com.aliyun.tea.*;

public class GetOpenCoursesRequest extends TeaModel {
    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    public static GetOpenCoursesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOpenCoursesRequest self = new GetOpenCoursesRequest();
        return TeaModel.build(map, self);
    }

    public GetOpenCoursesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetOpenCoursesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
