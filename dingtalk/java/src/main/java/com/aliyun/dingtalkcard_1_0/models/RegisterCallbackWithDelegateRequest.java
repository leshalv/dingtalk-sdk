// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkcard_1_0.models;

import com.aliyun.tea.*;

public class RegisterCallbackWithDelegateRequest extends TeaModel {
    @NameInMap("apiSecret")
    public String apiSecret;

    @NameInMap("callbackRouteKey")
    public String callbackRouteKey;

    @NameInMap("callbackUrl")
    public String callbackUrl;

    @NameInMap("forceUpdate")
    public Boolean forceUpdate;

    public static RegisterCallbackWithDelegateRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterCallbackWithDelegateRequest self = new RegisterCallbackWithDelegateRequest();
        return TeaModel.build(map, self);
    }

    public RegisterCallbackWithDelegateRequest setApiSecret(String apiSecret) {
        this.apiSecret = apiSecret;
        return this;
    }
    public String getApiSecret() {
        return this.apiSecret;
    }

    public RegisterCallbackWithDelegateRequest setCallbackRouteKey(String callbackRouteKey) {
        this.callbackRouteKey = callbackRouteKey;
        return this;
    }
    public String getCallbackRouteKey() {
        return this.callbackRouteKey;
    }

    public RegisterCallbackWithDelegateRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public RegisterCallbackWithDelegateRequest setForceUpdate(Boolean forceUpdate) {
        this.forceUpdate = forceUpdate;
        return this;
    }
    public Boolean getForceUpdate() {
        return this.forceUpdate;
    }

}
