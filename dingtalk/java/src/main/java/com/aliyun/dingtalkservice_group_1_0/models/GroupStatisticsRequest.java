// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkservice_group_1_0.models;

import com.aliyun.tea.*;

public class GroupStatisticsRequest extends TeaModel {
    // 截止日期
    @NameInMap("maxDt")
    public String maxDt;

    // 起始日期
    @NameInMap("minDt")
    public String minDt;

    // 开放团队ID
    @NameInMap("openTeamId")
    public String openTeamId;

    public static GroupStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GroupStatisticsRequest self = new GroupStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GroupStatisticsRequest setMaxDt(String maxDt) {
        this.maxDt = maxDt;
        return this;
    }
    public String getMaxDt() {
        return this.maxDt;
    }

    public GroupStatisticsRequest setMinDt(String minDt) {
        this.minDt = minDt;
        return this;
    }
    public String getMinDt() {
        return this.minDt;
    }

    public GroupStatisticsRequest setOpenTeamId(String openTeamId) {
        this.openTeamId = openTeamId;
        return this;
    }
    public String getOpenTeamId() {
        return this.openTeamId;
    }

}
