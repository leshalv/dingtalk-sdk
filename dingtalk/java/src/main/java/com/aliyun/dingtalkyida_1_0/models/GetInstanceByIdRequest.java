// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkyida_1_0.models;

import com.aliyun.tea.*;

public class GetInstanceByIdRequest extends TeaModel {
    @NameInMap("appType")
    public String appType;

    @NameInMap("language")
    public String language;

    @NameInMap("systemToken")
    public String systemToken;

    @NameInMap("userId")
    public String userId;

    public static GetInstanceByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceByIdRequest self = new GetInstanceByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceByIdRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public GetInstanceByIdRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetInstanceByIdRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

    public GetInstanceByIdRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
