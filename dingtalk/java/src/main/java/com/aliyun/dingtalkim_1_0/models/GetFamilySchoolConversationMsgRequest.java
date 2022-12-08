// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkim_1_0.models;

import com.aliyun.tea.*;

public class GetFamilySchoolConversationMsgRequest extends TeaModel {
    // 查询最大消息数
    @NameInMap("maxResults")
    public Integer maxResults;

    // 要查询的消息类型
    @NameInMap("msgTypes")
    public java.util.List<Integer> msgTypes;

    // 下一次查询的游标，毫秒值
    @NameInMap("nextToken")
    public Long nextToken;

    // 接收卡片的群的openConversationId
    @NameInMap("openConversationId")
    public String openConversationId;

    // 用户唯一标识
    @NameInMap("unionId")
    public String unionId;

    public static GetFamilySchoolConversationMsgRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFamilySchoolConversationMsgRequest self = new GetFamilySchoolConversationMsgRequest();
        return TeaModel.build(map, self);
    }

    public GetFamilySchoolConversationMsgRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetFamilySchoolConversationMsgRequest setMsgTypes(java.util.List<Integer> msgTypes) {
        this.msgTypes = msgTypes;
        return this;
    }
    public java.util.List<Integer> getMsgTypes() {
        return this.msgTypes;
    }

    public GetFamilySchoolConversationMsgRequest setNextToken(Long nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Long getNextToken() {
        return this.nextToken;
    }

    public GetFamilySchoolConversationMsgRequest setOpenConversationId(String openConversationId) {
        this.openConversationId = openConversationId;
        return this;
    }
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    public GetFamilySchoolConversationMsgRequest setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

}