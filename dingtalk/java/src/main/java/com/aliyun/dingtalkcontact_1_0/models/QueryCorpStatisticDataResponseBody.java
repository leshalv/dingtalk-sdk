// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkcontact_1_0.models;

import com.aliyun.tea.*;

public class QueryCorpStatisticDataResponseBody extends TeaModel {
    @NameInMap("result")
    public java.util.List<QueryCorpStatisticDataResponseBodyResult> result;

    public static QueryCorpStatisticDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCorpStatisticDataResponseBody self = new QueryCorpStatisticDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCorpStatisticDataResponseBody setResult(java.util.List<QueryCorpStatisticDataResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryCorpStatisticDataResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryCorpStatisticDataResponseBodyResult extends TeaModel {
        @NameInMap("cardBeReceivedTotalCnt")
        public Long cardBeReceivedTotalCnt;

        @NameInMap("cardReceiveTotalCnt")
        public Long cardReceiveTotalCnt;

        @NameInMap("cardTotalBeVisitedCnt")
        public Long cardTotalBeVisitedCnt;

        @NameInMap("dataDate")
        public String dataDate;

        @NameInMap("dingTotalShareCnt")
        public Long dingTotalShareCnt;

        @NameInMap("totalSendCnt")
        public Long totalSendCnt;

        @NameInMap("wechatTotalShareCnt")
        public Long wechatTotalShareCnt;

        public static QueryCorpStatisticDataResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryCorpStatisticDataResponseBodyResult self = new QueryCorpStatisticDataResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryCorpStatisticDataResponseBodyResult setCardBeReceivedTotalCnt(Long cardBeReceivedTotalCnt) {
            this.cardBeReceivedTotalCnt = cardBeReceivedTotalCnt;
            return this;
        }
        public Long getCardBeReceivedTotalCnt() {
            return this.cardBeReceivedTotalCnt;
        }

        public QueryCorpStatisticDataResponseBodyResult setCardReceiveTotalCnt(Long cardReceiveTotalCnt) {
            this.cardReceiveTotalCnt = cardReceiveTotalCnt;
            return this;
        }
        public Long getCardReceiveTotalCnt() {
            return this.cardReceiveTotalCnt;
        }

        public QueryCorpStatisticDataResponseBodyResult setCardTotalBeVisitedCnt(Long cardTotalBeVisitedCnt) {
            this.cardTotalBeVisitedCnt = cardTotalBeVisitedCnt;
            return this;
        }
        public Long getCardTotalBeVisitedCnt() {
            return this.cardTotalBeVisitedCnt;
        }

        public QueryCorpStatisticDataResponseBodyResult setDataDate(String dataDate) {
            this.dataDate = dataDate;
            return this;
        }
        public String getDataDate() {
            return this.dataDate;
        }

        public QueryCorpStatisticDataResponseBodyResult setDingTotalShareCnt(Long dingTotalShareCnt) {
            this.dingTotalShareCnt = dingTotalShareCnt;
            return this;
        }
        public Long getDingTotalShareCnt() {
            return this.dingTotalShareCnt;
        }

        public QueryCorpStatisticDataResponseBodyResult setTotalSendCnt(Long totalSendCnt) {
            this.totalSendCnt = totalSendCnt;
            return this;
        }
        public Long getTotalSendCnt() {
            return this.totalSendCnt;
        }

        public QueryCorpStatisticDataResponseBodyResult setWechatTotalShareCnt(Long wechatTotalShareCnt) {
            this.wechatTotalShareCnt = wechatTotalShareCnt;
            return this;
        }
        public Long getWechatTotalShareCnt() {
            return this.wechatTotalShareCnt;
        }

    }

}
