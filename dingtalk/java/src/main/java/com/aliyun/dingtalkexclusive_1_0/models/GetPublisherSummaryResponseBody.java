// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkexclusive_1_0.models;

import com.aliyun.tea.*;

public class GetPublisherSummaryResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<GetPublisherSummaryResponseBodyData> data;

    @NameInMap("hasMore")
    public Boolean hasMore;

    @NameInMap("nextToken")
    public Long nextToken;

    @NameInMap("publisherArticleCntStd")
    public String publisherArticleCntStd;

    @NameInMap("publisherArticlePvCntStd")
    public String publisherArticlePvCntStd;

    @NameInMap("publisherArticlePvTop5")
    public java.util.List<GetPublisherSummaryResponseBodyPublisherArticlePvTop5> publisherArticlePvTop5;

    @NameInMap("publisherCntStd")
    public String publisherCntStd;

    public static GetPublisherSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPublisherSummaryResponseBody self = new GetPublisherSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPublisherSummaryResponseBody setData(java.util.List<GetPublisherSummaryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetPublisherSummaryResponseBodyData> getData() {
        return this.data;
    }

    public GetPublisherSummaryResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public GetPublisherSummaryResponseBody setNextToken(Long nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Long getNextToken() {
        return this.nextToken;
    }

    public GetPublisherSummaryResponseBody setPublisherArticleCntStd(String publisherArticleCntStd) {
        this.publisherArticleCntStd = publisherArticleCntStd;
        return this;
    }
    public String getPublisherArticleCntStd() {
        return this.publisherArticleCntStd;
    }

    public GetPublisherSummaryResponseBody setPublisherArticlePvCntStd(String publisherArticlePvCntStd) {
        this.publisherArticlePvCntStd = publisherArticlePvCntStd;
        return this;
    }
    public String getPublisherArticlePvCntStd() {
        return this.publisherArticlePvCntStd;
    }

    public GetPublisherSummaryResponseBody setPublisherArticlePvTop5(java.util.List<GetPublisherSummaryResponseBodyPublisherArticlePvTop5> publisherArticlePvTop5) {
        this.publisherArticlePvTop5 = publisherArticlePvTop5;
        return this;
    }
    public java.util.List<GetPublisherSummaryResponseBodyPublisherArticlePvTop5> getPublisherArticlePvTop5() {
        return this.publisherArticlePvTop5;
    }

    public GetPublisherSummaryResponseBody setPublisherCntStd(String publisherCntStd) {
        this.publisherCntStd = publisherCntStd;
        return this;
    }
    public String getPublisherCntStd() {
        return this.publisherCntStd;
    }

    public static class GetPublisherSummaryResponseBodyData extends TeaModel {
        @NameInMap("publisherArticleCntStd")
        public String publisherArticleCntStd;

        @NameInMap("publisherArticlePvCntStd")
        public String publisherArticlePvCntStd;

        @NameInMap("publisherName")
        public String publisherName;

        @NameInMap("unionId")
        public String unionId;

        public static GetPublisherSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPublisherSummaryResponseBodyData self = new GetPublisherSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPublisherSummaryResponseBodyData setPublisherArticleCntStd(String publisherArticleCntStd) {
            this.publisherArticleCntStd = publisherArticleCntStd;
            return this;
        }
        public String getPublisherArticleCntStd() {
            return this.publisherArticleCntStd;
        }

        public GetPublisherSummaryResponseBodyData setPublisherArticlePvCntStd(String publisherArticlePvCntStd) {
            this.publisherArticlePvCntStd = publisherArticlePvCntStd;
            return this;
        }
        public String getPublisherArticlePvCntStd() {
            return this.publisherArticlePvCntStd;
        }

        public GetPublisherSummaryResponseBodyData setPublisherName(String publisherName) {
            this.publisherName = publisherName;
            return this;
        }
        public String getPublisherName() {
            return this.publisherName;
        }

        public GetPublisherSummaryResponseBodyData setUnionId(String unionId) {
            this.unionId = unionId;
            return this;
        }
        public String getUnionId() {
            return this.unionId;
        }

    }

    public static class GetPublisherSummaryResponseBodyPublisherArticlePvTop5 extends TeaModel {
        @NameInMap("name")
        public String name;

        public static GetPublisherSummaryResponseBodyPublisherArticlePvTop5 build(java.util.Map<String, ?> map) throws Exception {
            GetPublisherSummaryResponseBodyPublisherArticlePvTop5 self = new GetPublisherSummaryResponseBodyPublisherArticlePvTop5();
            return TeaModel.build(map, self);
        }

        public GetPublisherSummaryResponseBodyPublisherArticlePvTop5 setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
