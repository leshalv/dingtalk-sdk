// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkproject_1_0.models;

import com.aliyun.tea.*;

public class SeachTaskStageRequest extends TeaModel {
    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("query")
    public String query;

    @NameInMap("stageIds")
    public String stageIds;

    @NameInMap("taskListId")
    public String taskListId;

    public static SeachTaskStageRequest build(java.util.Map<String, ?> map) throws Exception {
        SeachTaskStageRequest self = new SeachTaskStageRequest();
        return TeaModel.build(map, self);
    }

    public SeachTaskStageRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SeachTaskStageRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SeachTaskStageRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SeachTaskStageRequest setStageIds(String stageIds) {
        this.stageIds = stageIds;
        return this;
    }
    public String getStageIds() {
        return this.stageIds;
    }

    public SeachTaskStageRequest setTaskListId(String taskListId) {
        this.taskListId = taskListId;
        return this;
    }
    public String getTaskListId() {
        return this.taskListId;
    }

}
