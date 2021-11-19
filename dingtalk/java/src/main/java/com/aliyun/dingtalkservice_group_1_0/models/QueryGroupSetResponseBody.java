// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkservice_group_1_0.models;

import com.aliyun.tea.*;

public class QueryGroupSetResponseBody extends TeaModel {
    // records
    @NameInMap("records")
    public java.util.List<QueryGroupSetResponseBodyRecords> records;

    public static QueryGroupSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGroupSetResponseBody self = new QueryGroupSetResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGroupSetResponseBody setRecords(java.util.List<QueryGroupSetResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<QueryGroupSetResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class QueryGroupSetResponseBodyRecords extends TeaModel {
        @NameInMap("openGroupSetId")
        public String openGroupSetId;

        @NameInMap("groupSetName")
        public String groupSetName;

        @NameInMap("templateId")
        public String templateId;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        public static QueryGroupSetResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            QueryGroupSetResponseBodyRecords self = new QueryGroupSetResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public QueryGroupSetResponseBodyRecords setOpenGroupSetId(String openGroupSetId) {
            this.openGroupSetId = openGroupSetId;
            return this;
        }
        public String getOpenGroupSetId() {
            return this.openGroupSetId;
        }

        public QueryGroupSetResponseBodyRecords setGroupSetName(String groupSetName) {
            this.groupSetName = groupSetName;
            return this;
        }
        public String getGroupSetName() {
            return this.groupSetName;
        }

        public QueryGroupSetResponseBodyRecords setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryGroupSetResponseBodyRecords setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryGroupSetResponseBodyRecords setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

    }

}
