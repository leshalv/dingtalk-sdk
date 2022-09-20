// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkdatacenter_1_0.models;

import com.aliyun.tea.*;

public class SearchCompanyRequest extends TeaModel {
    // 起始页
    @NameInMap("pageNumber")
    public Integer pageNumber;

    // 页面大小
    @NameInMap("pageSize")
    public Integer pageSize;

    // 关键词
    @NameInMap("searchKey")
    public String searchKey;

    public static SearchCompanyRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchCompanyRequest self = new SearchCompanyRequest();
        return TeaModel.build(map, self);
    }

    public SearchCompanyRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchCompanyRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchCompanyRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

}