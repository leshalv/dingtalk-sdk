// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkservice_group_1_0.models;

import com.aliyun.tea.*;

public class GetAuthTokenRequest extends TeaModel {
    // 渠道DT/LINKS
    @NameInMap("channel")
    public String channel;

    // token有效时间（秒）-可不传
    @NameInMap("effectiveTime")
    public Long effectiveTime;

    // 团队ID
    @NameInMap("openTeamId")
    public String openTeamId;

    // 小二id
    @NameInMap("serverId")
    public String serverId;

    // 小二名称
    @NameInMap("serverName")
    public String serverName;

    public static GetAuthTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuthTokenRequest self = new GetAuthTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetAuthTokenRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public GetAuthTokenRequest setEffectiveTime(Long effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public Long getEffectiveTime() {
        return this.effectiveTime;
    }

    public GetAuthTokenRequest setOpenTeamId(String openTeamId) {
        this.openTeamId = openTeamId;
        return this;
    }
    public String getOpenTeamId() {
        return this.openTeamId;
    }

    public GetAuthTokenRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public GetAuthTokenRequest setServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }
    public String getServerName() {
        return this.serverName;
    }

}