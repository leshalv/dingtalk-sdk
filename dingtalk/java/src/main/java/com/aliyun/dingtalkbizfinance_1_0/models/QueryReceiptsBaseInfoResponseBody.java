// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkbizfinance_1_0.models;

import com.aliyun.tea.*;

public class QueryReceiptsBaseInfoResponseBody extends TeaModel {
    @NameInMap("hasMore")
    public String hasMore;

    @NameInMap("list")
    public java.util.List<QueryReceiptsBaseInfoResponseBodyList> list;

    @NameInMap("totalCount")
    public Long totalCount;

    public static QueryReceiptsBaseInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryReceiptsBaseInfoResponseBody self = new QueryReceiptsBaseInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryReceiptsBaseInfoResponseBody setHasMore(String hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public String getHasMore() {
        return this.hasMore;
    }

    public QueryReceiptsBaseInfoResponseBody setList(java.util.List<QueryReceiptsBaseInfoResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryReceiptsBaseInfoResponseBodyList> getList() {
        return this.list;
    }

    public QueryReceiptsBaseInfoResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryReceiptsBaseInfoResponseBodyListCreator extends TeaModel {
        @NameInMap("avatarUrl")
        public String avatarUrl;

        @NameInMap("nick")
        public String nick;

        @NameInMap("userId")
        public String userId;

        public static QueryReceiptsBaseInfoResponseBodyListCreator build(java.util.Map<String, ?> map) throws Exception {
            QueryReceiptsBaseInfoResponseBodyListCreator self = new QueryReceiptsBaseInfoResponseBodyListCreator();
            return TeaModel.build(map, self);
        }

        public QueryReceiptsBaseInfoResponseBodyListCreator setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public QueryReceiptsBaseInfoResponseBodyListCreator setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public QueryReceiptsBaseInfoResponseBodyListCreator setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryReceiptsBaseInfoResponseBodyListCustomer extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("name")
        public String name;

        public static QueryReceiptsBaseInfoResponseBodyListCustomer build(java.util.Map<String, ?> map) throws Exception {
            QueryReceiptsBaseInfoResponseBodyListCustomer self = new QueryReceiptsBaseInfoResponseBodyListCustomer();
            return TeaModel.build(map, self);
        }

        public QueryReceiptsBaseInfoResponseBodyListCustomer setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryReceiptsBaseInfoResponseBodyListCustomer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryReceiptsBaseInfoResponseBodyListPrincipal extends TeaModel {
        @NameInMap("avatarUrl")
        public String avatarUrl;

        @NameInMap("nick")
        public String nick;

        @NameInMap("userId")
        public String userId;

        public static QueryReceiptsBaseInfoResponseBodyListPrincipal build(java.util.Map<String, ?> map) throws Exception {
            QueryReceiptsBaseInfoResponseBodyListPrincipal self = new QueryReceiptsBaseInfoResponseBodyListPrincipal();
            return TeaModel.build(map, self);
        }

        public QueryReceiptsBaseInfoResponseBodyListPrincipal setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public QueryReceiptsBaseInfoResponseBodyListPrincipal setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public QueryReceiptsBaseInfoResponseBodyListPrincipal setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryReceiptsBaseInfoResponseBodyListProject extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("name")
        public String name;

        public static QueryReceiptsBaseInfoResponseBodyListProject build(java.util.Map<String, ?> map) throws Exception {
            QueryReceiptsBaseInfoResponseBodyListProject self = new QueryReceiptsBaseInfoResponseBodyListProject();
            return TeaModel.build(map, self);
        }

        public QueryReceiptsBaseInfoResponseBodyListProject setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryReceiptsBaseInfoResponseBodyListProject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryReceiptsBaseInfoResponseBodyListSupplier extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("name")
        public String name;

        public static QueryReceiptsBaseInfoResponseBodyListSupplier build(java.util.Map<String, ?> map) throws Exception {
            QueryReceiptsBaseInfoResponseBodyListSupplier self = new QueryReceiptsBaseInfoResponseBodyListSupplier();
            return TeaModel.build(map, self);
        }

        public QueryReceiptsBaseInfoResponseBodyListSupplier setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryReceiptsBaseInfoResponseBodyListSupplier setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryReceiptsBaseInfoResponseBodyList extends TeaModel {
        @NameInMap("accountantBookId")
        public String accountantBookId;

        @NameInMap("amount")
        public String amount;

        @NameInMap("businessId")
        public String businessId;

        @NameInMap("companyCode")
        public String companyCode;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("creator")
        public QueryReceiptsBaseInfoResponseBodyListCreator creator;

        @NameInMap("customer")
        public QueryReceiptsBaseInfoResponseBodyListCustomer customer;

        @NameInMap("modelId")
        public String modelId;

        @NameInMap("principal")
        public QueryReceiptsBaseInfoResponseBodyListPrincipal principal;

        @NameInMap("project")
        public QueryReceiptsBaseInfoResponseBodyListProject project;

        @NameInMap("receiptId")
        public String receiptId;

        @NameInMap("recordTime")
        public String recordTime;

        @NameInMap("remark")
        public String remark;

        @NameInMap("source")
        public String source;

        @NameInMap("status")
        public String status;

        @NameInMap("supplier")
        public QueryReceiptsBaseInfoResponseBodyListSupplier supplier;

        @NameInMap("title")
        public String title;

        @NameInMap("voucherStatus")
        public String voucherStatus;

        public static QueryReceiptsBaseInfoResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryReceiptsBaseInfoResponseBodyList self = new QueryReceiptsBaseInfoResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryReceiptsBaseInfoResponseBodyList setAccountantBookId(String accountantBookId) {
            this.accountantBookId = accountantBookId;
            return this;
        }
        public String getAccountantBookId() {
            return this.accountantBookId;
        }

        public QueryReceiptsBaseInfoResponseBodyList setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public QueryReceiptsBaseInfoResponseBodyList setBusinessId(String businessId) {
            this.businessId = businessId;
            return this;
        }
        public String getBusinessId() {
            return this.businessId;
        }

        public QueryReceiptsBaseInfoResponseBodyList setCompanyCode(String companyCode) {
            this.companyCode = companyCode;
            return this;
        }
        public String getCompanyCode() {
            return this.companyCode;
        }

        public QueryReceiptsBaseInfoResponseBodyList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryReceiptsBaseInfoResponseBodyList setCreator(QueryReceiptsBaseInfoResponseBodyListCreator creator) {
            this.creator = creator;
            return this;
        }
        public QueryReceiptsBaseInfoResponseBodyListCreator getCreator() {
            return this.creator;
        }

        public QueryReceiptsBaseInfoResponseBodyList setCustomer(QueryReceiptsBaseInfoResponseBodyListCustomer customer) {
            this.customer = customer;
            return this;
        }
        public QueryReceiptsBaseInfoResponseBodyListCustomer getCustomer() {
            return this.customer;
        }

        public QueryReceiptsBaseInfoResponseBodyList setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public QueryReceiptsBaseInfoResponseBodyList setPrincipal(QueryReceiptsBaseInfoResponseBodyListPrincipal principal) {
            this.principal = principal;
            return this;
        }
        public QueryReceiptsBaseInfoResponseBodyListPrincipal getPrincipal() {
            return this.principal;
        }

        public QueryReceiptsBaseInfoResponseBodyList setProject(QueryReceiptsBaseInfoResponseBodyListProject project) {
            this.project = project;
            return this;
        }
        public QueryReceiptsBaseInfoResponseBodyListProject getProject() {
            return this.project;
        }

        public QueryReceiptsBaseInfoResponseBodyList setReceiptId(String receiptId) {
            this.receiptId = receiptId;
            return this;
        }
        public String getReceiptId() {
            return this.receiptId;
        }

        public QueryReceiptsBaseInfoResponseBodyList setRecordTime(String recordTime) {
            this.recordTime = recordTime;
            return this;
        }
        public String getRecordTime() {
            return this.recordTime;
        }

        public QueryReceiptsBaseInfoResponseBodyList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryReceiptsBaseInfoResponseBodyList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public QueryReceiptsBaseInfoResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryReceiptsBaseInfoResponseBodyList setSupplier(QueryReceiptsBaseInfoResponseBodyListSupplier supplier) {
            this.supplier = supplier;
            return this;
        }
        public QueryReceiptsBaseInfoResponseBodyListSupplier getSupplier() {
            return this.supplier;
        }

        public QueryReceiptsBaseInfoResponseBodyList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryReceiptsBaseInfoResponseBodyList setVoucherStatus(String voucherStatus) {
            this.voucherStatus = voucherStatus;
            return this;
        }
        public String getVoucherStatus() {
            return this.voucherStatus;
        }

    }

}
