// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkim_1_0.models;

import com.aliyun.tea.*;

public class QuerySingleGroupResponseBody extends TeaModel {
    // 群会话列表。
    @NameInMap("openConversations")
    public java.util.List<QuerySingleGroupResponseBodyOpenConversations> openConversations;

    public static QuerySingleGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySingleGroupResponseBody self = new QuerySingleGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySingleGroupResponseBody setOpenConversations(java.util.List<QuerySingleGroupResponseBodyOpenConversations> openConversations) {
        this.openConversations = openConversations;
        return this;
    }
    public java.util.List<QuerySingleGroupResponseBodyOpenConversations> getOpenConversations() {
        return this.openConversations;
    }

    public static class QuerySingleGroupResponseBodyOpenConversations extends TeaModel {
        // 钉外用户在业务系统内的唯一标识。
        @NameInMap("appUserId")
        public String appUserId;

        // 群会话Id。
        @NameInMap("openConversationId")
        public String openConversationId;

        // 钉内用户userId。
        @NameInMap("userId")
        public String userId;

        public static QuerySingleGroupResponseBodyOpenConversations build(java.util.Map<String, ?> map) throws Exception {
            QuerySingleGroupResponseBodyOpenConversations self = new QuerySingleGroupResponseBodyOpenConversations();
            return TeaModel.build(map, self);
        }

        public QuerySingleGroupResponseBodyOpenConversations setAppUserId(String appUserId) {
            this.appUserId = appUserId;
            return this;
        }
        public String getAppUserId() {
            return this.appUserId;
        }

        public QuerySingleGroupResponseBodyOpenConversations setOpenConversationId(String openConversationId) {
            this.openConversationId = openConversationId;
            return this;
        }
        public String getOpenConversationId() {
            return this.openConversationId;
        }

        public QuerySingleGroupResponseBodyOpenConversations setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
