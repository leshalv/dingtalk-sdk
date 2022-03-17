// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkokr_1_0.models;

import com.aliyun.tea.*;

public class UpdatePrivacyResponseBody extends TeaModel {
    // 返回的数据。
    @NameInMap("data")
    public UpdatePrivacyResponseBodyData data;

    // 请求成功的标识。
    @NameInMap("success")
    public Boolean success;

    public static UpdatePrivacyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivacyResponseBody self = new UpdatePrivacyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePrivacyResponseBody setData(UpdatePrivacyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdatePrivacyResponseBodyData getData() {
        return this.data;
    }

    public UpdatePrivacyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdatePrivacyResponseBodyDataPolicyListMemberList extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("nickname")
        public String nickname;

        @NameInMap("type")
        public String type;

        public static UpdatePrivacyResponseBodyDataPolicyListMemberList build(java.util.Map<String, ?> map) throws Exception {
            UpdatePrivacyResponseBodyDataPolicyListMemberList self = new UpdatePrivacyResponseBodyDataPolicyListMemberList();
            return TeaModel.build(map, self);
        }

        public UpdatePrivacyResponseBodyDataPolicyListMemberList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdatePrivacyResponseBodyDataPolicyListMemberList setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public UpdatePrivacyResponseBodyDataPolicyListMemberList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdatePrivacyResponseBodyDataPolicyList extends TeaModel {
        @NameInMap("memberList")
        public java.util.List<UpdatePrivacyResponseBodyDataPolicyListMemberList> memberList;

        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public Long type;

        public static UpdatePrivacyResponseBodyDataPolicyList build(java.util.Map<String, ?> map) throws Exception {
            UpdatePrivacyResponseBodyDataPolicyList self = new UpdatePrivacyResponseBodyDataPolicyList();
            return TeaModel.build(map, self);
        }

        public UpdatePrivacyResponseBodyDataPolicyList setMemberList(java.util.List<UpdatePrivacyResponseBodyDataPolicyListMemberList> memberList) {
            this.memberList = memberList;
            return this;
        }
        public java.util.List<UpdatePrivacyResponseBodyDataPolicyListMemberList> getMemberList() {
            return this.memberList;
        }

        public UpdatePrivacyResponseBodyDataPolicyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdatePrivacyResponseBodyDataPolicyList setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

    public static class UpdatePrivacyResponseBodyData extends TeaModel {
        @NameInMap("id")
        public String id;

        // 权限列表
        @NameInMap("policyList")
        public java.util.List<UpdatePrivacyResponseBodyDataPolicyList> policyList;

        // 是否可见的标识。
        @NameInMap("privacy")
        public String privacy;

        // 哪种类型的权限。
        @NameInMap("type")
        public String type;

        public static UpdatePrivacyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdatePrivacyResponseBodyData self = new UpdatePrivacyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdatePrivacyResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdatePrivacyResponseBodyData setPolicyList(java.util.List<UpdatePrivacyResponseBodyDataPolicyList> policyList) {
            this.policyList = policyList;
            return this;
        }
        public java.util.List<UpdatePrivacyResponseBodyDataPolicyList> getPolicyList() {
            return this.policyList;
        }

        public UpdatePrivacyResponseBodyData setPrivacy(String privacy) {
            this.privacy = privacy;
            return this;
        }
        public String getPrivacy() {
            return this.privacy;
        }

        public UpdatePrivacyResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
