// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkcrm_1_0.models;

import com.aliyun.tea.*;

public class BatchAddFollowRecordsRequest extends TeaModel {
    /**
     * <p>关系数据列表。</p>
     */
    @NameInMap("instanceList")
    public java.util.List<BatchAddFollowRecordsRequestInstanceList> instanceList;

    /**
     * <p>操作人userId</p>
     */
    @NameInMap("operatorUserId")
    public String operatorUserId;

    public static BatchAddFollowRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddFollowRecordsRequest self = new BatchAddFollowRecordsRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddFollowRecordsRequest setInstanceList(java.util.List<BatchAddFollowRecordsRequestInstanceList> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<BatchAddFollowRecordsRequestInstanceList> getInstanceList() {
        return this.instanceList;
    }

    public BatchAddFollowRecordsRequest setOperatorUserId(String operatorUserId) {
        this.operatorUserId = operatorUserId;
        return this;
    }
    public String getOperatorUserId() {
        return this.operatorUserId;
    }

    public static class BatchAddFollowRecordsRequestInstanceListDataArray extends TeaModel {
        /**
         * <p>模型字段extendValue。</p>
         */
        @NameInMap("extendValue")
        public String extendValue;

        /**
         * <p>模型字段id。</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>模型字段value。</p>
         */
        @NameInMap("value")
        public String value;

        public static BatchAddFollowRecordsRequestInstanceListDataArray build(java.util.Map<String, ?> map) throws Exception {
            BatchAddFollowRecordsRequestInstanceListDataArray self = new BatchAddFollowRecordsRequestInstanceListDataArray();
            return TeaModel.build(map, self);
        }

        public BatchAddFollowRecordsRequestInstanceListDataArray setExtendValue(String extendValue) {
            this.extendValue = extendValue;
            return this;
        }
        public String getExtendValue() {
            return this.extendValue;
        }

        public BatchAddFollowRecordsRequestInstanceListDataArray setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public BatchAddFollowRecordsRequestInstanceListDataArray setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class BatchAddFollowRecordsRequestInstanceList extends TeaModel {
        /**
         * <p>关系模型数据。</p>
         */
        @NameInMap("dataArray")
        public java.util.List<BatchAddFollowRecordsRequestInstanceListDataArray> dataArray;

        public static BatchAddFollowRecordsRequestInstanceList build(java.util.Map<String, ?> map) throws Exception {
            BatchAddFollowRecordsRequestInstanceList self = new BatchAddFollowRecordsRequestInstanceList();
            return TeaModel.build(map, self);
        }

        public BatchAddFollowRecordsRequestInstanceList setDataArray(java.util.List<BatchAddFollowRecordsRequestInstanceListDataArray> dataArray) {
            this.dataArray = dataArray;
            return this;
        }
        public java.util.List<BatchAddFollowRecordsRequestInstanceListDataArray> getDataArray() {
            return this.dataArray;
        }

    }

}
