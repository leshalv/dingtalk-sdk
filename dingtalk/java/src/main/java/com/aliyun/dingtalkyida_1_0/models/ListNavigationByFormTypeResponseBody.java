// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkyida_1_0.models;

import com.aliyun.tea.*;

public class ListNavigationByFormTypeResponseBody extends TeaModel {
    @NameInMap("result")
    public java.util.List<ListNavigationByFormTypeResponseBodyResult> result;

    public static ListNavigationByFormTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNavigationByFormTypeResponseBody self = new ListNavigationByFormTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNavigationByFormTypeResponseBody setResult(java.util.List<ListNavigationByFormTypeResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListNavigationByFormTypeResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListNavigationByFormTypeResponseBodyResultTitle extends TeaModel {
        // 英文名称
        @NameInMap("nameInEnglish")
        public String nameInEnglish;

        // type
        @NameInMap("type")
        public String type;

        // 中文名称
        @NameInMap("nameInChinese")
        public String nameInChinese;

        public static ListNavigationByFormTypeResponseBodyResultTitle build(java.util.Map<String, ?> map) throws Exception {
            ListNavigationByFormTypeResponseBodyResultTitle self = new ListNavigationByFormTypeResponseBodyResultTitle();
            return TeaModel.build(map, self);
        }

        public ListNavigationByFormTypeResponseBodyResultTitle setNameInEnglish(String nameInEnglish) {
            this.nameInEnglish = nameInEnglish;
            return this;
        }
        public String getNameInEnglish() {
            return this.nameInEnglish;
        }

        public ListNavigationByFormTypeResponseBodyResultTitle setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListNavigationByFormTypeResponseBodyResultTitle setNameInChinese(String nameInChinese) {
            this.nameInChinese = nameInChinese;
            return this;
        }
        public String getNameInChinese() {
            return this.nameInChinese;
        }

    }

    public static class ListNavigationByFormTypeResponseBodyResult extends TeaModel {
        // title
        @NameInMap("title")
        public ListNavigationByFormTypeResponseBodyResultTitle title;

        // processCode
        @NameInMap("processCode")
        public String processCode;

        // formUuid
        @NameInMap("formUuid")
        public String formUuid;

        public static ListNavigationByFormTypeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListNavigationByFormTypeResponseBodyResult self = new ListNavigationByFormTypeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListNavigationByFormTypeResponseBodyResult setTitle(ListNavigationByFormTypeResponseBodyResultTitle title) {
            this.title = title;
            return this;
        }
        public ListNavigationByFormTypeResponseBodyResultTitle getTitle() {
            return this.title;
        }

        public ListNavigationByFormTypeResponseBodyResult setProcessCode(String processCode) {
            this.processCode = processCode;
            return this;
        }
        public String getProcessCode() {
            return this.processCode;
        }

        public ListNavigationByFormTypeResponseBodyResult setFormUuid(String formUuid) {
            this.formUuid = formUuid;
            return this;
        }
        public String getFormUuid() {
            return this.formUuid;
        }

    }

}
