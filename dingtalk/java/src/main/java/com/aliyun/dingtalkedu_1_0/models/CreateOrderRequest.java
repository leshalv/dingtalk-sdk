// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkedu_1_0.models;

import com.aliyun.tea.*;

public class CreateOrderRequest extends TeaModel {
    // 实付金额，单位分（优惠计算后）
    @NameInMap("actualAmount")
    public Long actualAmount;

    // 订单明细信息
    @NameInMap("detailList")
    public java.util.List<CreateOrderRequestDetailList> detailList;

    // 人脸id
    @NameInMap("faceId")
    public String faceId;

    // 刷脸token
    @NameInMap("ftoken")
    public String ftoken;

    // 签名
    @NameInMap("signature")
    public String signature;

    // 设备号
    @NameInMap("sn")
    public String sn;

    // 交易加签
    @NameInMap("terminalParams")
    public String terminalParams;

    // utc时间戳
    @NameInMap("timestamp")
    public Long timestamp;

    // 应付价格，单位分
    @NameInMap("totalAmount")
    public Long totalAmount;

    // 员工id
    @NameInMap("userId")
    public String userId;

    public static CreateOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderRequest self = new CreateOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderRequest setActualAmount(Long actualAmount) {
        this.actualAmount = actualAmount;
        return this;
    }
    public Long getActualAmount() {
        return this.actualAmount;
    }

    public CreateOrderRequest setDetailList(java.util.List<CreateOrderRequestDetailList> detailList) {
        this.detailList = detailList;
        return this;
    }
    public java.util.List<CreateOrderRequestDetailList> getDetailList() {
        return this.detailList;
    }

    public CreateOrderRequest setFaceId(String faceId) {
        this.faceId = faceId;
        return this;
    }
    public String getFaceId() {
        return this.faceId;
    }

    public CreateOrderRequest setFtoken(String ftoken) {
        this.ftoken = ftoken;
        return this;
    }
    public String getFtoken() {
        return this.ftoken;
    }

    public CreateOrderRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public CreateOrderRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public CreateOrderRequest setTerminalParams(String terminalParams) {
        this.terminalParams = terminalParams;
        return this;
    }
    public String getTerminalParams() {
        return this.terminalParams;
    }

    public CreateOrderRequest setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public CreateOrderRequest setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public CreateOrderRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class CreateOrderRequestDetailList extends TeaModel {
        // 计算优惠后的实付金额，单位为分
        @NameInMap("actualAmount")
        public Long actualAmount;

        // 应付金额，单位为分
        @NameInMap("itemAmount")
        public Long itemAmount;

        // 商品名
        @NameInMap("itemName")
        public String itemName;

        // 场景
        @NameInMap("scene")
        public Long scene;

        public static CreateOrderRequestDetailList build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderRequestDetailList self = new CreateOrderRequestDetailList();
            return TeaModel.build(map, self);
        }

        public CreateOrderRequestDetailList setActualAmount(Long actualAmount) {
            this.actualAmount = actualAmount;
            return this;
        }
        public Long getActualAmount() {
            return this.actualAmount;
        }

        public CreateOrderRequestDetailList setItemAmount(Long itemAmount) {
            this.itemAmount = itemAmount;
            return this;
        }
        public Long getItemAmount() {
            return this.itemAmount;
        }

        public CreateOrderRequestDetailList setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public CreateOrderRequestDetailList setScene(Long scene) {
            this.scene = scene;
            return this;
        }
        public Long getScene() {
            return this.scene;
        }

    }

}
