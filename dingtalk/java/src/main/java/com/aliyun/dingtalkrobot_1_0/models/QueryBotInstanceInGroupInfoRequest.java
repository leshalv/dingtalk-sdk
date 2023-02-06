// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkrobot_1_0.models;

import com.aliyun.tea.*;

public class QueryBotInstanceInGroupInfoRequest extends TeaModel {
    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>钉钉开放平台后台机器人的robotCode</p>
     */
    @NameInMap("robotCode")
    public String robotCode;

    public static QueryBotInstanceInGroupInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBotInstanceInGroupInfoRequest self = new QueryBotInstanceInGroupInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryBotInstanceInGroupInfoRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryBotInstanceInGroupInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryBotInstanceInGroupInfoRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

}
