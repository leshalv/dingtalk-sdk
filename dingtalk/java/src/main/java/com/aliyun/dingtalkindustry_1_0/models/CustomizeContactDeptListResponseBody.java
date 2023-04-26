// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkindustry_1_0.models;

import com.aliyun.tea.*;

public class CustomizeContactDeptListResponseBody extends TeaModel {
    @NameInMap("content")
    public java.util.List<CustomizeContactDeptListResponseBodyContent> content;

    public static CustomizeContactDeptListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CustomizeContactDeptListResponseBody self = new CustomizeContactDeptListResponseBody();
        return TeaModel.build(map, self);
    }

    public CustomizeContactDeptListResponseBody setContent(java.util.List<CustomizeContactDeptListResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<CustomizeContactDeptListResponseBodyContent> getContent() {
        return this.content;
    }

    public static class CustomizeContactDeptListResponseBodyContent extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("id")
        public Long id;

        @NameInMap("managerIdList")
        public java.util.List<String> managerIdList;

        @NameInMap("name")
        public String name;

        @NameInMap("order")
        public Long order;

        @NameInMap("parentDeptId")
        public Long parentDeptId;

        @NameInMap("refId")
        public Long refId;

        @NameInMap("type")
        public Long type;

        public static CustomizeContactDeptListResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            CustomizeContactDeptListResponseBodyContent self = new CustomizeContactDeptListResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public CustomizeContactDeptListResponseBodyContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CustomizeContactDeptListResponseBodyContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CustomizeContactDeptListResponseBodyContent setManagerIdList(java.util.List<String> managerIdList) {
            this.managerIdList = managerIdList;
            return this;
        }
        public java.util.List<String> getManagerIdList() {
            return this.managerIdList;
        }

        public CustomizeContactDeptListResponseBodyContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CustomizeContactDeptListResponseBodyContent setOrder(Long order) {
            this.order = order;
            return this;
        }
        public Long getOrder() {
            return this.order;
        }

        public CustomizeContactDeptListResponseBodyContent setParentDeptId(Long parentDeptId) {
            this.parentDeptId = parentDeptId;
            return this;
        }
        public Long getParentDeptId() {
            return this.parentDeptId;
        }

        public CustomizeContactDeptListResponseBodyContent setRefId(Long refId) {
            this.refId = refId;
            return this;
        }
        public Long getRefId() {
            return this.refId;
        }

        public CustomizeContactDeptListResponseBodyContent setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

}
