// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkyida_1_0.models;

import com.aliyun.tea.*;

public class TerminateInstanceRequest extends TeaModel {
    @NameInMap("appType")
    public String appType;

    @NameInMap("language")
    public String language;

    @NameInMap("processInstanceId")
    public String processInstanceId;

    @NameInMap("systemToken")
    public String systemToken;

    @NameInMap("userId")
    public String userId;

    public static TerminateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        TerminateInstanceRequest self = new TerminateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public TerminateInstanceRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public TerminateInstanceRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public TerminateInstanceRequest setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    public TerminateInstanceRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

    public TerminateInstanceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
