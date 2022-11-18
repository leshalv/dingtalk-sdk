// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkservice_group_1_0.models;

import com.aliyun.tea.*;

public class BatchQueryGroupMemberRequest extends TeaModel {
    // 每页条数
    @NameInMap("maxResults")
    public Long maxResults;

    // 游标
    @NameInMap("nextToken")
    public String nextToken;

    // 群会话ID
    @NameInMap("openConversationId")
    public String openConversationId;

    // 开放团队ID
    @NameInMap("openTeamId")
    public String openTeamId;

    public static BatchQueryGroupMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryGroupMemberRequest self = new BatchQueryGroupMemberRequest();
        return TeaModel.build(map, self);
    }

    public BatchQueryGroupMemberRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public BatchQueryGroupMemberRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public BatchQueryGroupMemberRequest setOpenConversationId(String openConversationId) {
        this.openConversationId = openConversationId;
        return this;
    }
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    public BatchQueryGroupMemberRequest setOpenTeamId(String openTeamId) {
        this.openTeamId = openTeamId;
        return this;
    }
    public String getOpenTeamId() {
        return this.openTeamId;
    }

}