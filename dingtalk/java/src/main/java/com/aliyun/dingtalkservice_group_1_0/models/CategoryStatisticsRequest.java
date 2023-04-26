// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkservice_group_1_0.models;

import com.aliyun.tea.*;

public class CategoryStatisticsRequest extends TeaModel {
    @NameInMap("maxDt")
    public String maxDt;

    @NameInMap("minDt")
    public String minDt;

    @NameInMap("openTeamId")
    public String openTeamId;

    public static CategoryStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        CategoryStatisticsRequest self = new CategoryStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public CategoryStatisticsRequest setMaxDt(String maxDt) {
        this.maxDt = maxDt;
        return this;
    }
    public String getMaxDt() {
        return this.maxDt;
    }

    public CategoryStatisticsRequest setMinDt(String minDt) {
        this.minDt = minDt;
        return this;
    }
    public String getMinDt() {
        return this.minDt;
    }

    public CategoryStatisticsRequest setOpenTeamId(String openTeamId) {
        this.openTeamId = openTeamId;
        return this;
    }
    public String getOpenTeamId() {
        return this.openTeamId;
    }

}
