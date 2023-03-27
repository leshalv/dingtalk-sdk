// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkproject_1_0.models;

import com.aliyun.tea.*;

public class SearchTaskFlowRequest extends TeaModel {
    /**
     * <p>每页返回最大数量。默认10，最大300。</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>分页标，从上一次请求结果中获取。</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>模糊查询工作流名字。</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>工作流ID集合，逗号组合。</p>
     */
    @NameInMap("taskflowIds")
    public String taskflowIds;

    public static SearchTaskFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchTaskFlowRequest self = new SearchTaskFlowRequest();
        return TeaModel.build(map, self);
    }

    public SearchTaskFlowRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SearchTaskFlowRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchTaskFlowRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SearchTaskFlowRequest setTaskflowIds(String taskflowIds) {
        this.taskflowIds = taskflowIds;
        return this;
    }
    public String getTaskflowIds() {
        return this.taskflowIds;
    }

}
