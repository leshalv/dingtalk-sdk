// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkh5package_1_0.models;

import com.aliyun.tea.*;

public class PublishPackageRequest extends TeaModel {
    // 企业内部微应用agentId
    @NameInMap("agentId")
    public Long agentId;

    // 第三方企业应用appId
    @NameInMap("appId")
    public Long appId;

    // H5离线包版本号
    @NameInMap("version")
    public String version;

    public static PublishPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishPackageRequest self = new PublishPackageRequest();
        return TeaModel.build(map, self);
    }

    public PublishPackageRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public PublishPackageRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public PublishPackageRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}