// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkcrm_1_0.models;

import com.aliyun.tea.*;

public class BatchUpdateContactsRequest extends TeaModel {
    @NameInMap("operatorUserId")
    public String operatorUserId;

    @NameInMap("relationList")
    public java.util.List<BatchUpdateContactsRequestRelationList> relationList;

    public static BatchUpdateContactsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateContactsRequest self = new BatchUpdateContactsRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateContactsRequest setOperatorUserId(String operatorUserId) {
        this.operatorUserId = operatorUserId;
        return this;
    }
    public String getOperatorUserId() {
        return this.operatorUserId;
    }

    public BatchUpdateContactsRequest setRelationList(java.util.List<BatchUpdateContactsRequestRelationList> relationList) {
        this.relationList = relationList;
        return this;
    }
    public java.util.List<BatchUpdateContactsRequestRelationList> getRelationList() {
        return this.relationList;
    }

    public static class BatchUpdateContactsRequestRelationListBizDataList extends TeaModel {
        @NameInMap("extendValue")
        public String extendValue;

        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static BatchUpdateContactsRequestRelationListBizDataList build(java.util.Map<String, ?> map) throws Exception {
            BatchUpdateContactsRequestRelationListBizDataList self = new BatchUpdateContactsRequestRelationListBizDataList();
            return TeaModel.build(map, self);
        }

        public BatchUpdateContactsRequestRelationListBizDataList setExtendValue(String extendValue) {
            this.extendValue = extendValue;
            return this;
        }
        public String getExtendValue() {
            return this.extendValue;
        }

        public BatchUpdateContactsRequestRelationListBizDataList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public BatchUpdateContactsRequestRelationListBizDataList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class BatchUpdateContactsRequestRelationList extends TeaModel {
        @NameInMap("bizDataList")
        public java.util.List<BatchUpdateContactsRequestRelationListBizDataList> bizDataList;

        @NameInMap("bizExtMap")
        public java.util.Map<String, String> bizExtMap;

        @NameInMap("relationId")
        public String relationId;

        public static BatchUpdateContactsRequestRelationList build(java.util.Map<String, ?> map) throws Exception {
            BatchUpdateContactsRequestRelationList self = new BatchUpdateContactsRequestRelationList();
            return TeaModel.build(map, self);
        }

        public BatchUpdateContactsRequestRelationList setBizDataList(java.util.List<BatchUpdateContactsRequestRelationListBizDataList> bizDataList) {
            this.bizDataList = bizDataList;
            return this;
        }
        public java.util.List<BatchUpdateContactsRequestRelationListBizDataList> getBizDataList() {
            return this.bizDataList;
        }

        public BatchUpdateContactsRequestRelationList setBizExtMap(java.util.Map<String, String> bizExtMap) {
            this.bizExtMap = bizExtMap;
            return this;
        }
        public java.util.Map<String, String> getBizExtMap() {
            return this.bizExtMap;
        }

        public BatchUpdateContactsRequestRelationList setRelationId(String relationId) {
            this.relationId = relationId;
            return this;
        }
        public String getRelationId() {
            return this.relationId;
        }

    }

}
