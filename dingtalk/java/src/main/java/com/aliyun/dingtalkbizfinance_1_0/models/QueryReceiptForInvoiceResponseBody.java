// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkbizfinance_1_0.models;

import com.aliyun.tea.*;

public class QueryReceiptForInvoiceResponseBody extends TeaModel {
    /**
     * <p>是否还有数据</p>
     */
    @NameInMap("hasMore")
    public String hasMore;

    /**
     * <p>分页数据</p>
     */
    @NameInMap("list")
    public java.util.List<QueryReceiptForInvoiceResponseBodyList> list;

    /**
     * <p>总数</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static QueryReceiptForInvoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryReceiptForInvoiceResponseBody self = new QueryReceiptForInvoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryReceiptForInvoiceResponseBody setHasMore(String hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public String getHasMore() {
        return this.hasMore;
    }

    public QueryReceiptForInvoiceResponseBody setList(java.util.List<QueryReceiptForInvoiceResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryReceiptForInvoiceResponseBodyList> getList() {
        return this.list;
    }

    public QueryReceiptForInvoiceResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryReceiptForInvoiceResponseBodyListCreator extends TeaModel {
        /**
         * <p>创建人头像</p>
         */
        @NameInMap("avatarUrl")
        public String avatarUrl;

        /**
         * <p>创建人昵称</p>
         */
        @NameInMap("nick")
        public String nick;

        /**
         * <p>创建人工号</p>
         */
        @NameInMap("userId")
        public String userId;

        public static QueryReceiptForInvoiceResponseBodyListCreator build(java.util.Map<String, ?> map) throws Exception {
            QueryReceiptForInvoiceResponseBodyListCreator self = new QueryReceiptForInvoiceResponseBodyListCreator();
            return TeaModel.build(map, self);
        }

        public QueryReceiptForInvoiceResponseBodyListCreator setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public QueryReceiptForInvoiceResponseBodyListCreator setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public QueryReceiptForInvoiceResponseBodyListCreator setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryReceiptForInvoiceResponseBodyListCustomer extends TeaModel {
        /**
         * <p>客户code</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>客户名字</p>
         */
        @NameInMap("name")
        public String name;

        public static QueryReceiptForInvoiceResponseBodyListCustomer build(java.util.Map<String, ?> map) throws Exception {
            QueryReceiptForInvoiceResponseBodyListCustomer self = new QueryReceiptForInvoiceResponseBodyListCustomer();
            return TeaModel.build(map, self);
        }

        public QueryReceiptForInvoiceResponseBodyListCustomer setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryReceiptForInvoiceResponseBodyListCustomer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryReceiptForInvoiceResponseBodyListProductInfoList extends TeaModel {
        /**
         * <p>含税金额</p>
         */
        @NameInMap("amountWithTax")
        public String amountWithTax;

        /**
         * <p>商品名称</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>数量</p>
         */
        @NameInMap("quantity")
        public String quantity;

        /**
         * <p>规格型号</p>
         */
        @NameInMap("specification")
        public String specification;

        /**
         * <p>税率</p>
         */
        @NameInMap("taxRate")
        public String taxRate;

        /**
         * <p>计量单位</p>
         */
        @NameInMap("unit")
        public String unit;

        /**
         * <p>含税单价</p>
         */
        @NameInMap("unitPriceWithTax")
        public String unitPriceWithTax;

        public static QueryReceiptForInvoiceResponseBodyListProductInfoList build(java.util.Map<String, ?> map) throws Exception {
            QueryReceiptForInvoiceResponseBodyListProductInfoList self = new QueryReceiptForInvoiceResponseBodyListProductInfoList();
            return TeaModel.build(map, self);
        }

        public QueryReceiptForInvoiceResponseBodyListProductInfoList setAmountWithTax(String amountWithTax) {
            this.amountWithTax = amountWithTax;
            return this;
        }
        public String getAmountWithTax() {
            return this.amountWithTax;
        }

        public QueryReceiptForInvoiceResponseBodyListProductInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryReceiptForInvoiceResponseBodyListProductInfoList setQuantity(String quantity) {
            this.quantity = quantity;
            return this;
        }
        public String getQuantity() {
            return this.quantity;
        }

        public QueryReceiptForInvoiceResponseBodyListProductInfoList setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public QueryReceiptForInvoiceResponseBodyListProductInfoList setTaxRate(String taxRate) {
            this.taxRate = taxRate;
            return this;
        }
        public String getTaxRate() {
            return this.taxRate;
        }

        public QueryReceiptForInvoiceResponseBodyListProductInfoList setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public QueryReceiptForInvoiceResponseBodyListProductInfoList setUnitPriceWithTax(String unitPriceWithTax) {
            this.unitPriceWithTax = unitPriceWithTax;
            return this;
        }
        public String getUnitPriceWithTax() {
            return this.unitPriceWithTax;
        }

    }

    public static class QueryReceiptForInvoiceResponseBodyList extends TeaModel {
        /**
         * <p>金额</p>
         */
        @NameInMap("amount")
        public String amount;

        /**
         * <p>开票状态</p>
         */
        @NameInMap("applyStatus")
        public String applyStatus;

        /**
         * <p>创建时间</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>创建人</p>
         */
        @NameInMap("creator")
        public QueryReceiptForInvoiceResponseBodyListCreator creator;

        /**
         * <p>客户</p>
         */
        @NameInMap("customer")
        public QueryReceiptForInvoiceResponseBodyListCustomer customer;

        /**
         * <p>开票人邮箱</p>
         */
        @NameInMap("drawerEmail")
        public String drawerEmail;

        /**
         * <p>开票人手机号码</p>
         */
        @NameInMap("drawerTelephone")
        public String drawerTelephone;

        /**
         * <p>发票种类</p>
         */
        @NameInMap("invoiceType")
        public String invoiceType;

        /**
         * <p>主数据modelId</p>
         */
        @NameInMap("modelId")
        public String modelId;

        /**
         * <p>商品列表</p>
         */
        @NameInMap("productInfoList")
        public java.util.List<QueryReceiptForInvoiceResponseBodyListProductInfoList> productInfoList;

        /**
         * <p>购方账户</p>
         */
        @NameInMap("purchaserAccount")
        public String purchaserAccount;

        /**
         * <p>购方地址</p>
         */
        @NameInMap("purchaserAddress")
        public String purchaserAddress;

        /**
         * <p>购方银行</p>
         */
        @NameInMap("purchaserBankName")
        public String purchaserBankName;

        /**
         * <p>购方抬头</p>
         */
        @NameInMap("purchaserName")
        public String purchaserName;

        /**
         * <p>购方税号</p>
         */
        @NameInMap("purchaserTaxNo")
        public String purchaserTaxNo;

        /**
         * <p>购方电话</p>
         */
        @NameInMap("purchaserTel")
        public String purchaserTel;

        /**
         * <p>单据ID</p>
         */
        @NameInMap("receiptId")
        public String receiptId;

        /**
         * <p>记录时间，默认为审批通过时间</p>
         */
        @NameInMap("recordTime")
        public String recordTime;

        /**
         * <p>备注</p>
         */
        @NameInMap("remark")
        public String remark;

        /**
         * <p>来源</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>状态 agree running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>单据标题</p>
         */
        @NameInMap("title")
        public String title;

        public static QueryReceiptForInvoiceResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryReceiptForInvoiceResponseBodyList self = new QueryReceiptForInvoiceResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryReceiptForInvoiceResponseBodyList setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public QueryReceiptForInvoiceResponseBodyList setApplyStatus(String applyStatus) {
            this.applyStatus = applyStatus;
            return this;
        }
        public String getApplyStatus() {
            return this.applyStatus;
        }

        public QueryReceiptForInvoiceResponseBodyList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryReceiptForInvoiceResponseBodyList setCreator(QueryReceiptForInvoiceResponseBodyListCreator creator) {
            this.creator = creator;
            return this;
        }
        public QueryReceiptForInvoiceResponseBodyListCreator getCreator() {
            return this.creator;
        }

        public QueryReceiptForInvoiceResponseBodyList setCustomer(QueryReceiptForInvoiceResponseBodyListCustomer customer) {
            this.customer = customer;
            return this;
        }
        public QueryReceiptForInvoiceResponseBodyListCustomer getCustomer() {
            return this.customer;
        }

        public QueryReceiptForInvoiceResponseBodyList setDrawerEmail(String drawerEmail) {
            this.drawerEmail = drawerEmail;
            return this;
        }
        public String getDrawerEmail() {
            return this.drawerEmail;
        }

        public QueryReceiptForInvoiceResponseBodyList setDrawerTelephone(String drawerTelephone) {
            this.drawerTelephone = drawerTelephone;
            return this;
        }
        public String getDrawerTelephone() {
            return this.drawerTelephone;
        }

        public QueryReceiptForInvoiceResponseBodyList setInvoiceType(String invoiceType) {
            this.invoiceType = invoiceType;
            return this;
        }
        public String getInvoiceType() {
            return this.invoiceType;
        }

        public QueryReceiptForInvoiceResponseBodyList setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public QueryReceiptForInvoiceResponseBodyList setProductInfoList(java.util.List<QueryReceiptForInvoiceResponseBodyListProductInfoList> productInfoList) {
            this.productInfoList = productInfoList;
            return this;
        }
        public java.util.List<QueryReceiptForInvoiceResponseBodyListProductInfoList> getProductInfoList() {
            return this.productInfoList;
        }

        public QueryReceiptForInvoiceResponseBodyList setPurchaserAccount(String purchaserAccount) {
            this.purchaserAccount = purchaserAccount;
            return this;
        }
        public String getPurchaserAccount() {
            return this.purchaserAccount;
        }

        public QueryReceiptForInvoiceResponseBodyList setPurchaserAddress(String purchaserAddress) {
            this.purchaserAddress = purchaserAddress;
            return this;
        }
        public String getPurchaserAddress() {
            return this.purchaserAddress;
        }

        public QueryReceiptForInvoiceResponseBodyList setPurchaserBankName(String purchaserBankName) {
            this.purchaserBankName = purchaserBankName;
            return this;
        }
        public String getPurchaserBankName() {
            return this.purchaserBankName;
        }

        public QueryReceiptForInvoiceResponseBodyList setPurchaserName(String purchaserName) {
            this.purchaserName = purchaserName;
            return this;
        }
        public String getPurchaserName() {
            return this.purchaserName;
        }

        public QueryReceiptForInvoiceResponseBodyList setPurchaserTaxNo(String purchaserTaxNo) {
            this.purchaserTaxNo = purchaserTaxNo;
            return this;
        }
        public String getPurchaserTaxNo() {
            return this.purchaserTaxNo;
        }

        public QueryReceiptForInvoiceResponseBodyList setPurchaserTel(String purchaserTel) {
            this.purchaserTel = purchaserTel;
            return this;
        }
        public String getPurchaserTel() {
            return this.purchaserTel;
        }

        public QueryReceiptForInvoiceResponseBodyList setReceiptId(String receiptId) {
            this.receiptId = receiptId;
            return this;
        }
        public String getReceiptId() {
            return this.receiptId;
        }

        public QueryReceiptForInvoiceResponseBodyList setRecordTime(String recordTime) {
            this.recordTime = recordTime;
            return this;
        }
        public String getRecordTime() {
            return this.recordTime;
        }

        public QueryReceiptForInvoiceResponseBodyList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryReceiptForInvoiceResponseBodyList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public QueryReceiptForInvoiceResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryReceiptForInvoiceResponseBodyList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
