// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkproject_1_0.models;

import com.aliyun.tea.*;

public class SearchUserTaskRequest extends TeaModel {
    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("tql")
    public String tql;

    public static SearchUserTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchUserTaskRequest self = new SearchUserTaskRequest();
        return TeaModel.build(map, self);
    }

    public SearchUserTaskRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SearchUserTaskRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchUserTaskRequest setTql(String tql) {
        this.tql = tql;
        return this;
    }
    public String getTql() {
        return this.tql;
    }

}
