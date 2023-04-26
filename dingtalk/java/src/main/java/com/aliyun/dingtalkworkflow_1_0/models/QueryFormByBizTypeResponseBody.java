// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkworkflow_1_0.models;

import com.aliyun.tea.*;

public class QueryFormByBizTypeResponseBody extends TeaModel {
    @NameInMap("result")
    public java.util.List<QueryFormByBizTypeResponseBodyResult> result;

    public static QueryFormByBizTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFormByBizTypeResponseBody self = new QueryFormByBizTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFormByBizTypeResponseBody setResult(java.util.List<QueryFormByBizTypeResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryFormByBizTypeResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryFormByBizTypeResponseBodyResult extends TeaModel {
        @NameInMap("appType")
        public Integer appType;

        @NameInMap("appUuid")
        public String appUuid;

        @NameInMap("bizType")
        public String bizType;

        @NameInMap("content")
        public String content;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("creator")
        public String creator;

        @NameInMap("formCode")
        public String formCode;

        @NameInMap("formUuid")
        public String formUuid;

        @NameInMap("memo")
        public String memo;

        @NameInMap("modifedTime")
        public Long modifedTime;

        @NameInMap("name")
        public String name;

        @NameInMap("ownerId")
        public String ownerId;

        @NameInMap("status")
        public String status;

        public static QueryFormByBizTypeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryFormByBizTypeResponseBodyResult self = new QueryFormByBizTypeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryFormByBizTypeResponseBodyResult setAppType(Integer appType) {
            this.appType = appType;
            return this;
        }
        public Integer getAppType() {
            return this.appType;
        }

        public QueryFormByBizTypeResponseBodyResult setAppUuid(String appUuid) {
            this.appUuid = appUuid;
            return this;
        }
        public String getAppUuid() {
            return this.appUuid;
        }

        public QueryFormByBizTypeResponseBodyResult setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryFormByBizTypeResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QueryFormByBizTypeResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryFormByBizTypeResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryFormByBizTypeResponseBodyResult setFormCode(String formCode) {
            this.formCode = formCode;
            return this;
        }
        public String getFormCode() {
            return this.formCode;
        }

        public QueryFormByBizTypeResponseBodyResult setFormUuid(String formUuid) {
            this.formUuid = formUuid;
            return this;
        }
        public String getFormUuid() {
            return this.formUuid;
        }

        public QueryFormByBizTypeResponseBodyResult setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public QueryFormByBizTypeResponseBodyResult setModifedTime(Long modifedTime) {
            this.modifedTime = modifedTime;
            return this;
        }
        public Long getModifedTime() {
            return this.modifedTime;
        }

        public QueryFormByBizTypeResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryFormByBizTypeResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public QueryFormByBizTypeResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
