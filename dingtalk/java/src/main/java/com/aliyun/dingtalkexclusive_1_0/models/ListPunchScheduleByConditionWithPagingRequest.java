// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkexclusive_1_0.models;

import com.aliyun.tea.*;

public class ListPunchScheduleByConditionWithPagingRequest extends TeaModel {
    @NameInMap("bizInstanceId")
    public String bizInstanceId;

    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("nextToken")
    public Long nextToken;

    @NameInMap("scheduleDateEnd")
    public String scheduleDateEnd;

    @NameInMap("scheduleDateStart")
    public String scheduleDateStart;

    @NameInMap("userIdList")
    public java.util.List<String> userIdList;

    public static ListPunchScheduleByConditionWithPagingRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPunchScheduleByConditionWithPagingRequest self = new ListPunchScheduleByConditionWithPagingRequest();
        return TeaModel.build(map, self);
    }

    public ListPunchScheduleByConditionWithPagingRequest setBizInstanceId(String bizInstanceId) {
        this.bizInstanceId = bizInstanceId;
        return this;
    }
    public String getBizInstanceId() {
        return this.bizInstanceId;
    }

    public ListPunchScheduleByConditionWithPagingRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPunchScheduleByConditionWithPagingRequest setNextToken(Long nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Long getNextToken() {
        return this.nextToken;
    }

    public ListPunchScheduleByConditionWithPagingRequest setScheduleDateEnd(String scheduleDateEnd) {
        this.scheduleDateEnd = scheduleDateEnd;
        return this;
    }
    public String getScheduleDateEnd() {
        return this.scheduleDateEnd;
    }

    public ListPunchScheduleByConditionWithPagingRequest setScheduleDateStart(String scheduleDateStart) {
        this.scheduleDateStart = scheduleDateStart;
        return this;
    }
    public String getScheduleDateStart() {
        return this.scheduleDateStart;
    }

    public ListPunchScheduleByConditionWithPagingRequest setUserIdList(java.util.List<String> userIdList) {
        this.userIdList = userIdList;
        return this;
    }
    public java.util.List<String> getUserIdList() {
        return this.userIdList;
    }

}
