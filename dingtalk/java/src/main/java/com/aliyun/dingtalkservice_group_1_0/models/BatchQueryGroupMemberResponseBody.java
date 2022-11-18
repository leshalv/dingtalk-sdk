// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkservice_group_1_0.models;

import com.aliyun.tea.*;

public class BatchQueryGroupMemberResponseBody extends TeaModel {
    // 是否还存在数据
    @NameInMap("hasMore")
    public Boolean hasMore;

    // 下一次游标
    @NameInMap("nextToken")
    public String nextToken;

    // 会话ID
    @NameInMap("openConversationId")
    public String openConversationId;

    // 成员数据列表
    @NameInMap("records")
    public java.util.List<BatchQueryGroupMemberResponseBodyRecords> records;

    public static BatchQueryGroupMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryGroupMemberResponseBody self = new BatchQueryGroupMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchQueryGroupMemberResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public BatchQueryGroupMemberResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public BatchQueryGroupMemberResponseBody setOpenConversationId(String openConversationId) {
        this.openConversationId = openConversationId;
        return this;
    }
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    public BatchQueryGroupMemberResponseBody setRecords(java.util.List<BatchQueryGroupMemberResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<BatchQueryGroupMemberResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class BatchQueryGroupMemberResponseBodyRecords extends TeaModel {
        // 是否内部员工
        @NameInMap("innerStaff")
        public Boolean innerStaff;

        // 群成员昵称
        @NameInMap("nickName")
        public String nickName;

        // 是否群主
        @NameInMap("owner")
        public Boolean owner;

        // 群成员uinionId
        @NameInMap("unionId")
        public String unionId;

        // 员工ID
        @NameInMap("userId")
        public String userId;

        public static BatchQueryGroupMemberResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryGroupMemberResponseBodyRecords self = new BatchQueryGroupMemberResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public BatchQueryGroupMemberResponseBodyRecords setInnerStaff(Boolean innerStaff) {
            this.innerStaff = innerStaff;
            return this;
        }
        public Boolean getInnerStaff() {
            return this.innerStaff;
        }

        public BatchQueryGroupMemberResponseBodyRecords setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public BatchQueryGroupMemberResponseBodyRecords setOwner(Boolean owner) {
            this.owner = owner;
            return this;
        }
        public Boolean getOwner() {
            return this.owner;
        }

        public BatchQueryGroupMemberResponseBodyRecords setUnionId(String unionId) {
            this.unionId = unionId;
            return this;
        }
        public String getUnionId() {
            return this.unionId;
        }

        public BatchQueryGroupMemberResponseBodyRecords setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}