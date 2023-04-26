// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkdatacenter_1_0.models;

import com.aliyun.tea.*;

public class QueryYydCalendarMonthStatisticalDataResponseBody extends TeaModel {
    @NameInMap("dataList")
    public java.util.List<java.util.Map<String, ?>> dataList;

    @NameInMap("metaList")
    public java.util.List<QueryYydCalendarMonthStatisticalDataResponseBodyMetaList> metaList;

    public static QueryYydCalendarMonthStatisticalDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryYydCalendarMonthStatisticalDataResponseBody self = new QueryYydCalendarMonthStatisticalDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryYydCalendarMonthStatisticalDataResponseBody setDataList(java.util.List<java.util.Map<String, ?>> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getDataList() {
        return this.dataList;
    }

    public QueryYydCalendarMonthStatisticalDataResponseBody setMetaList(java.util.List<QueryYydCalendarMonthStatisticalDataResponseBodyMetaList> metaList) {
        this.metaList = metaList;
        return this;
    }
    public java.util.List<QueryYydCalendarMonthStatisticalDataResponseBodyMetaList> getMetaList() {
        return this.metaList;
    }

    public static class QueryYydCalendarMonthStatisticalDataResponseBodyMetaList extends TeaModel {
        @NameInMap("kpiCaliber")
        public String kpiCaliber;

        @NameInMap("kpiId")
        public String kpiId;

        @NameInMap("kpiName")
        public String kpiName;

        @NameInMap("period")
        public String period;

        @NameInMap("unit")
        public String unit;

        public static QueryYydCalendarMonthStatisticalDataResponseBodyMetaList build(java.util.Map<String, ?> map) throws Exception {
            QueryYydCalendarMonthStatisticalDataResponseBodyMetaList self = new QueryYydCalendarMonthStatisticalDataResponseBodyMetaList();
            return TeaModel.build(map, self);
        }

        public QueryYydCalendarMonthStatisticalDataResponseBodyMetaList setKpiCaliber(String kpiCaliber) {
            this.kpiCaliber = kpiCaliber;
            return this;
        }
        public String getKpiCaliber() {
            return this.kpiCaliber;
        }

        public QueryYydCalendarMonthStatisticalDataResponseBodyMetaList setKpiId(String kpiId) {
            this.kpiId = kpiId;
            return this;
        }
        public String getKpiId() {
            return this.kpiId;
        }

        public QueryYydCalendarMonthStatisticalDataResponseBodyMetaList setKpiName(String kpiName) {
            this.kpiName = kpiName;
            return this;
        }
        public String getKpiName() {
            return this.kpiName;
        }

        public QueryYydCalendarMonthStatisticalDataResponseBodyMetaList setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public QueryYydCalendarMonthStatisticalDataResponseBodyMetaList setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
