// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkservice_group_1_0.models;

import com.aliyun.tea.*;

public class EmotionStatisticsResponseBody extends TeaModel {
    // 情感统计
    @NameInMap("emotionStatisticsRecords")
    public java.util.List<EmotionStatisticsResponseBodyEmotionStatisticsRecords> emotionStatisticsRecords;

    public static EmotionStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EmotionStatisticsResponseBody self = new EmotionStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public EmotionStatisticsResponseBody setEmotionStatisticsRecords(java.util.List<EmotionStatisticsResponseBodyEmotionStatisticsRecords> emotionStatisticsRecords) {
        this.emotionStatisticsRecords = emotionStatisticsRecords;
        return this;
    }
    public java.util.List<EmotionStatisticsResponseBodyEmotionStatisticsRecords> getEmotionStatisticsRecords() {
        return this.emotionStatisticsRecords;
    }

    public static class EmotionStatisticsResponseBodyEmotionStatisticsRecords extends TeaModel {
        // 心声数量
        @NameInMap("count")
        public Long count;

        // 日期
        @NameInMap("dt")
        public String dt;

        // 负面情绪值（0-1,越大越负面)
        @NameInMap("emotionScore")
        public Double emotionScore;

        public static EmotionStatisticsResponseBodyEmotionStatisticsRecords build(java.util.Map<String, ?> map) throws Exception {
            EmotionStatisticsResponseBodyEmotionStatisticsRecords self = new EmotionStatisticsResponseBodyEmotionStatisticsRecords();
            return TeaModel.build(map, self);
        }

        public EmotionStatisticsResponseBodyEmotionStatisticsRecords setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public EmotionStatisticsResponseBodyEmotionStatisticsRecords setDt(String dt) {
            this.dt = dt;
            return this;
        }
        public String getDt() {
            return this.dt;
        }

        public EmotionStatisticsResponseBodyEmotionStatisticsRecords setEmotionScore(Double emotionScore) {
            this.emotionScore = emotionScore;
            return this;
        }
        public Double getEmotionScore() {
            return this.emotionScore;
        }

    }

}