// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkdatacenter_1_0.models;

import com.aliyun.tea.*;

public class GetSeriousViolationRequest extends TeaModel {
    // 页数,第几页
    @NameInMap("pageNumber")
    public Integer pageNumber;

    // 每页条数
    @NameInMap("pageSize")
    public Integer pageSize;

    // 关键词
    @NameInMap("searchKey")
    public String searchKey;

    public static GetSeriousViolationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSeriousViolationRequest self = new GetSeriousViolationRequest();
        return TeaModel.build(map, self);
    }

    public GetSeriousViolationRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetSeriousViolationRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSeriousViolationRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

}