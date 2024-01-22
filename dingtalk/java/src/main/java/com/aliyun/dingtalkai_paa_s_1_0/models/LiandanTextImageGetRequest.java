// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkai_paa_s_1_0.models;

import com.aliyun.tea.*;

public class LiandanTextImageGetRequest extends TeaModel {
    @NameInMap("module")
    public String module;

    @NameInMap("requestSource")
    public String requestSource;

    @NameInMap("taskId")
    public String taskId;

    @NameInMap("userId")
    public String userId;

    public static LiandanTextImageGetRequest build(java.util.Map<String, ?> map) throws Exception {
        LiandanTextImageGetRequest self = new LiandanTextImageGetRequest();
        return TeaModel.build(map, self);
    }

    public LiandanTextImageGetRequest setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public LiandanTextImageGetRequest setRequestSource(String requestSource) {
        this.requestSource = requestSource;
        return this;
    }
    public String getRequestSource() {
        return this.requestSource;
    }

    public LiandanTextImageGetRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public LiandanTextImageGetRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
