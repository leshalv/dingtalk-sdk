// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkswform_1_0.models;

import com.aliyun.tea.*;

public class ListFormInstancesRequest extends TeaModel {
    // 时间，必须是YYYY-MM-DD的格式。循环填表才需要传这个参数。
    @NameInMap("actionDate")
    public String actionDate;

    // 填表类型。0表示通用填表，1表示教育版填表
    @NameInMap("bizType")
    public Integer bizType;

    // 10
    @NameInMap("maxResults")
    public Integer maxResults;

    // 0
    @NameInMap("nextToken")
    public Integer nextToken;

    public static ListFormInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFormInstancesRequest self = new ListFormInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListFormInstancesRequest setActionDate(String actionDate) {
        this.actionDate = actionDate;
        return this;
    }
    public String getActionDate() {
        return this.actionDate;
    }

    public ListFormInstancesRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public ListFormInstancesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListFormInstancesRequest setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

}
