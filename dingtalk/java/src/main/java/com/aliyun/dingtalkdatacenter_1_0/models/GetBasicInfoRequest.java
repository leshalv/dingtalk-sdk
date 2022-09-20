// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkdatacenter_1_0.models;

import com.aliyun.tea.*;

public class GetBasicInfoRequest extends TeaModel {
    // 页数,第几页
    @NameInMap("pageNumber")
    public Integer pageNumber;

    // 每页条数
    @NameInMap("pageSize")
    public Integer pageSize;

    // 关键词
    @NameInMap("searchKey")
    public String searchKey;

    public static GetBasicInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBasicInfoRequest self = new GetBasicInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetBasicInfoRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetBasicInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetBasicInfoRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

}