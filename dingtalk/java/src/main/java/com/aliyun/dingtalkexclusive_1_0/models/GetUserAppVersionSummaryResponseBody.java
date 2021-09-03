// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkexclusive_1_0.models;

import com.aliyun.tea.*;

public class GetUserAppVersionSummaryResponseBody extends TeaModel {
    // 用户版本分布情况列表
    @NameInMap("data")
    public java.util.List<GetUserAppVersionSummaryResponseBodyData> data;

    // 下一次请求的分页游标
    @NameInMap("nextId")
    public Long nextId;

    // 是否有更多数据
    @NameInMap("hasMore")
    public Boolean hasMore;

    public static GetUserAppVersionSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserAppVersionSummaryResponseBody self = new GetUserAppVersionSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserAppVersionSummaryResponseBody setData(java.util.List<GetUserAppVersionSummaryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetUserAppVersionSummaryResponseBodyData> getData() {
        return this.data;
    }

    public GetUserAppVersionSummaryResponseBody setNextId(Long nextId) {
        this.nextId = nextId;
        return this;
    }
    public Long getNextId() {
        return this.nextId;
    }

    public GetUserAppVersionSummaryResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public static class GetUserAppVersionSummaryResponseBodyData extends TeaModel {
        // 统计日期
        @NameInMap("statDate")
        public String statDate;

        // 组织名称
        @NameInMap("orgName")
        public String orgName;

        // 端信息
        @NameInMap("client")
        public String client;

        // 版本信息
        @NameInMap("appVersion")
        public String appVersion;

        // 用户数
        @NameInMap("userCnt")
        public Float userCnt;

        public static GetUserAppVersionSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUserAppVersionSummaryResponseBodyData self = new GetUserAppVersionSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUserAppVersionSummaryResponseBodyData setStatDate(String statDate) {
            this.statDate = statDate;
            return this;
        }
        public String getStatDate() {
            return this.statDate;
        }

        public GetUserAppVersionSummaryResponseBodyData setOrgName(String orgName) {
            this.orgName = orgName;
            return this;
        }
        public String getOrgName() {
            return this.orgName;
        }

        public GetUserAppVersionSummaryResponseBodyData setClient(String client) {
            this.client = client;
            return this;
        }
        public String getClient() {
            return this.client;
        }

        public GetUserAppVersionSummaryResponseBodyData setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public GetUserAppVersionSummaryResponseBodyData setUserCnt(Float userCnt) {
            this.userCnt = userCnt;
            return this;
        }
        public Float getUserCnt() {
            return this.userCnt;
        }

    }

}
