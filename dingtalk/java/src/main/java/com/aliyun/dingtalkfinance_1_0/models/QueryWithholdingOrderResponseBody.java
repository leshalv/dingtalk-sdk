// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkfinance_1_0.models;

import com.aliyun.tea.*;

public class QueryWithholdingOrderResponseBody extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("amount")
    public String amount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("gmtPay")
    public String gmtPay;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("instId")
    public String instId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("orderNo")
    public String orderNo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("outTradeNo")
    public String outTradeNo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("payChannel")
    public String payChannel;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("payChannelAccountNo")
    public String payChannelAccountNo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("payerUserId")
    public String payerUserId;

    @NameInMap("remark")
    public String remark;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("subInstId")
    public String subInstId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("title")
    public String title;

    public static QueryWithholdingOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryWithholdingOrderResponseBody self = new QueryWithholdingOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryWithholdingOrderResponseBody setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public QueryWithholdingOrderResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public QueryWithholdingOrderResponseBody setGmtPay(String gmtPay) {
        this.gmtPay = gmtPay;
        return this;
    }
    public String getGmtPay() {
        return this.gmtPay;
    }

    public QueryWithholdingOrderResponseBody setInstId(String instId) {
        this.instId = instId;
        return this;
    }
    public String getInstId() {
        return this.instId;
    }

    public QueryWithholdingOrderResponseBody setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryWithholdingOrderResponseBody setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public QueryWithholdingOrderResponseBody setPayChannel(String payChannel) {
        this.payChannel = payChannel;
        return this;
    }
    public String getPayChannel() {
        return this.payChannel;
    }

    public QueryWithholdingOrderResponseBody setPayChannelAccountNo(String payChannelAccountNo) {
        this.payChannelAccountNo = payChannelAccountNo;
        return this;
    }
    public String getPayChannelAccountNo() {
        return this.payChannelAccountNo;
    }

    public QueryWithholdingOrderResponseBody setPayerUserId(String payerUserId) {
        this.payerUserId = payerUserId;
        return this;
    }
    public String getPayerUserId() {
        return this.payerUserId;
    }

    public QueryWithholdingOrderResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public QueryWithholdingOrderResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryWithholdingOrderResponseBody setSubInstId(String subInstId) {
        this.subInstId = subInstId;
        return this;
    }
    public String getSubInstId() {
        return this.subInstId;
    }

    public QueryWithholdingOrderResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
