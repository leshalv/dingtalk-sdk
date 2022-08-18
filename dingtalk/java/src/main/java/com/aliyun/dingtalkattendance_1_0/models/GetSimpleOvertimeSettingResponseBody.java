// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkattendance_1_0.models;

import com.aliyun.tea.*;

public class GetSimpleOvertimeSettingResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("result")
    public java.util.List<GetSimpleOvertimeSettingResponseBodyResult> result;

    public static GetSimpleOvertimeSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSimpleOvertimeSettingResponseBody self = new GetSimpleOvertimeSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSimpleOvertimeSettingResponseBody setResult(java.util.List<GetSimpleOvertimeSettingResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetSimpleOvertimeSettingResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetSimpleOvertimeSettingResponseBodyResultItems extends TeaModel {
        // 加班规则id
        @NameInMap("id")
        public Long id;

        // 加班规则名称
        @NameInMap("name")
        public String name;

        @NameInMap("settingId")
        public Long settingId;

        public static GetSimpleOvertimeSettingResponseBodyResultItems build(java.util.Map<String, ?> map) throws Exception {
            GetSimpleOvertimeSettingResponseBodyResultItems self = new GetSimpleOvertimeSettingResponseBodyResultItems();
            return TeaModel.build(map, self);
        }

        public GetSimpleOvertimeSettingResponseBodyResultItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetSimpleOvertimeSettingResponseBodyResultItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSimpleOvertimeSettingResponseBodyResultItems setSettingId(Long settingId) {
            this.settingId = settingId;
            return this;
        }
        public Long getSettingId() {
            return this.settingId;
        }

    }

    public static class GetSimpleOvertimeSettingResponseBodyResult extends TeaModel {
        // 加班规则集合
        @NameInMap("items")
        public java.util.List<GetSimpleOvertimeSettingResponseBodyResultItems> items;

        // 当前页码
        @NameInMap("pageNumber")
        public Long pageNumber;

        // 总页数
        @NameInMap("totalPage")
        public Long totalPage;

        public static GetSimpleOvertimeSettingResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetSimpleOvertimeSettingResponseBodyResult self = new GetSimpleOvertimeSettingResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetSimpleOvertimeSettingResponseBodyResult setItems(java.util.List<GetSimpleOvertimeSettingResponseBodyResultItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetSimpleOvertimeSettingResponseBodyResultItems> getItems() {
            return this.items;
        }

        public GetSimpleOvertimeSettingResponseBodyResult setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public GetSimpleOvertimeSettingResponseBodyResult setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
