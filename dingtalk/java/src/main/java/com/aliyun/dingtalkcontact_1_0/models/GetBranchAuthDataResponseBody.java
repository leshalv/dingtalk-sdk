// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkcontact_1_0.models;

import com.aliyun.tea.*;

public class GetBranchAuthDataResponseBody extends TeaModel {
    // result
    @NameInMap("result")
    public java.util.List<GetBranchAuthDataResponseBodyResult> result;

    public static GetBranchAuthDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBranchAuthDataResponseBody self = new GetBranchAuthDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBranchAuthDataResponseBody setResult(java.util.List<GetBranchAuthDataResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetBranchAuthDataResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetBranchAuthDataResponseBodyResult extends TeaModel {
        // 字段code
        @NameInMap("fieldCode")
        public String fieldCode;

        // 字段名称
        @NameInMap("fieldName")
        public String fieldName;

        // 字段值
        @NameInMap("fieldValue")
        public String fieldValue;

        public static GetBranchAuthDataResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetBranchAuthDataResponseBodyResult self = new GetBranchAuthDataResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetBranchAuthDataResponseBodyResult setFieldCode(String fieldCode) {
            this.fieldCode = fieldCode;
            return this;
        }
        public String getFieldCode() {
            return this.fieldCode;
        }

        public GetBranchAuthDataResponseBodyResult setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public GetBranchAuthDataResponseBodyResult setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

    }

}
