// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkedu_1_0.models;

import com.aliyun.tea.*;

public class CardDeleteCardRequest extends TeaModel {
    @NameInMap("cardBizCode")
    public String cardBizCode;

    @NameInMap("cardBizId")
    public String cardBizId;

    @NameInMap("cardId")
    public Long cardId;

    @NameInMap("sourceType")
    public String sourceType;

    @NameInMap("userId")
    public String userId;

    public static CardDeleteCardRequest build(java.util.Map<String, ?> map) throws Exception {
        CardDeleteCardRequest self = new CardDeleteCardRequest();
        return TeaModel.build(map, self);
    }

    public CardDeleteCardRequest setCardBizCode(String cardBizCode) {
        this.cardBizCode = cardBizCode;
        return this;
    }
    public String getCardBizCode() {
        return this.cardBizCode;
    }

    public CardDeleteCardRequest setCardBizId(String cardBizId) {
        this.cardBizId = cardBizId;
        return this;
    }
    public String getCardBizId() {
        return this.cardBizId;
    }

    public CardDeleteCardRequest setCardId(Long cardId) {
        this.cardId = cardId;
        return this;
    }
    public Long getCardId() {
        return this.cardId;
    }

    public CardDeleteCardRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CardDeleteCardRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
