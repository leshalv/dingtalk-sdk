// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkwatt_1_0.models;

import com.aliyun.tea.*;

public class GetPointInfoHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("x-acs-dingtalk-access-token")
    public String xAcsDingtalkAccessToken;

    public static GetPointInfoHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetPointInfoHeaders self = new GetPointInfoHeaders();
        return TeaModel.build(map, self);
    }

    public GetPointInfoHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetPointInfoHeaders setXAcsDingtalkAccessToken(String xAcsDingtalkAccessToken) {
        this.xAcsDingtalkAccessToken = xAcsDingtalkAccessToken;
        return this;
    }
    public String getXAcsDingtalkAccessToken() {
        return this.xAcsDingtalkAccessToken;
    }

}
