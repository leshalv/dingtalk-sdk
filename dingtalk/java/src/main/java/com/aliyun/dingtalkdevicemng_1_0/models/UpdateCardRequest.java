// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkdevicemng_1_0.models;

import com.aliyun.tea.*;

public class UpdateCardRequest extends TeaModel {
    @NameInMap("bizId")
    public String bizId;

    @NameInMap("cardData")
    public String cardData;

    public static UpdateCardRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCardRequest self = new UpdateCardRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCardRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateCardRequest setCardData(String cardData) {
        this.cardData = cardData;
        return this;
    }
    public String getCardData() {
        return this.cardData;
    }

}
