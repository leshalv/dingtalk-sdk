// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkyida_1_0.models;

import com.aliyun.tea.*;

public class GetSimpleCubeModelListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("appType")
    public String appType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("corpId")
    public String corpId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("cubeCode")
    public String cubeCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("cubeTenantId")
    public String cubeTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("systemToken")
    public String systemToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("userId")
    public String userId;

    public static GetSimpleCubeModelListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSimpleCubeModelListRequest self = new GetSimpleCubeModelListRequest();
        return TeaModel.build(map, self);
    }

    public GetSimpleCubeModelListRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public GetSimpleCubeModelListRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetSimpleCubeModelListRequest setCubeCode(String cubeCode) {
        this.cubeCode = cubeCode;
        return this;
    }
    public String getCubeCode() {
        return this.cubeCode;
    }

    public GetSimpleCubeModelListRequest setCubeTenantId(String cubeTenantId) {
        this.cubeTenantId = cubeTenantId;
        return this;
    }
    public String getCubeTenantId() {
        return this.cubeTenantId;
    }

    public GetSimpleCubeModelListRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

    public GetSimpleCubeModelListRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
