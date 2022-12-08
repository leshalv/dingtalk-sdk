// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkdoc_1_0.models;

import com.aliyun.tea.*;

public class SheetFindAllRequest extends TeaModel {
    // 查找选项
    @NameInMap("findOptions")
    public SheetFindAllRequestFindOptions findOptions;

    // 要查找的文本
    @NameInMap("text")
    public String text;

    // 操作人unionId
    @NameInMap("operatorId")
    public String operatorId;

    public static SheetFindAllRequest build(java.util.Map<String, ?> map) throws Exception {
        SheetFindAllRequest self = new SheetFindAllRequest();
        return TeaModel.build(map, self);
    }

    public SheetFindAllRequest setFindOptions(SheetFindAllRequestFindOptions findOptions) {
        this.findOptions = findOptions;
        return this;
    }
    public SheetFindAllRequestFindOptions getFindOptions() {
        return this.findOptions;
    }

    public SheetFindAllRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SheetFindAllRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public static class SheetFindAllRequestFindOptions extends TeaModel {
        @NameInMap("includeHidden")
        public Boolean includeHidden;

        // 匹配大小写
        @NameInMap("matchCase")
        public Boolean matchCase;

        // 匹配整个单元格
        @NameInMap("matchEntireCell")
        public Boolean matchEntireCell;

        // 在公式内搜索
        @NameInMap("matchFormulaText")
        public Boolean matchFormulaText;

        @NameInMap("scope")
        public String scope;

        @NameInMap("unionCells")
        public Boolean unionCells;

        // text是正则表达式
        @NameInMap("useRegExp")
        public Boolean useRegExp;

        public static SheetFindAllRequestFindOptions build(java.util.Map<String, ?> map) throws Exception {
            SheetFindAllRequestFindOptions self = new SheetFindAllRequestFindOptions();
            return TeaModel.build(map, self);
        }

        public SheetFindAllRequestFindOptions setIncludeHidden(Boolean includeHidden) {
            this.includeHidden = includeHidden;
            return this;
        }
        public Boolean getIncludeHidden() {
            return this.includeHidden;
        }

        public SheetFindAllRequestFindOptions setMatchCase(Boolean matchCase) {
            this.matchCase = matchCase;
            return this;
        }
        public Boolean getMatchCase() {
            return this.matchCase;
        }

        public SheetFindAllRequestFindOptions setMatchEntireCell(Boolean matchEntireCell) {
            this.matchEntireCell = matchEntireCell;
            return this;
        }
        public Boolean getMatchEntireCell() {
            return this.matchEntireCell;
        }

        public SheetFindAllRequestFindOptions setMatchFormulaText(Boolean matchFormulaText) {
            this.matchFormulaText = matchFormulaText;
            return this;
        }
        public Boolean getMatchFormulaText() {
            return this.matchFormulaText;
        }

        public SheetFindAllRequestFindOptions setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public SheetFindAllRequestFindOptions setUnionCells(Boolean unionCells) {
            this.unionCells = unionCells;
            return this;
        }
        public Boolean getUnionCells() {
            return this.unionCells;
        }

        public SheetFindAllRequestFindOptions setUseRegExp(Boolean useRegExp) {
            this.useRegExp = useRegExp;
            return this;
        }
        public Boolean getUseRegExp() {
            return this.useRegExp;
        }

    }

}