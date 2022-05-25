// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkconference_1_0.models;

import com.aliyun.tea.*;

public class UpdateVideoConferenceSettingRequest extends TeaModel {
    // 允许参会人员取消静音
    @NameInMap("allowUnmuteSelf")
    public Boolean allowUnmuteSelf;

    // 主持人离会，是否自动转移主持人角色
    @NameInMap("autoTransferHost")
    public Boolean autoTransferHost;

    // 禁止共享屏幕
    @NameInMap("forbiddenShareScreen")
    public Boolean forbiddenShareScreen;

    // 锁定会议，禁止邀请入会
    @NameInMap("lockConference")
    public Boolean lockConference;

    // 全员静音
    @NameInMap("muteAll")
    public Boolean muteAll;

    // 仅允许企业内员工加入会议
    @NameInMap("onlyInternalEmployeesJoin")
    public Boolean onlyInternalEmployeesJoin;

    public static UpdateVideoConferenceSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoConferenceSettingRequest self = new UpdateVideoConferenceSettingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVideoConferenceSettingRequest setAllowUnmuteSelf(Boolean allowUnmuteSelf) {
        this.allowUnmuteSelf = allowUnmuteSelf;
        return this;
    }
    public Boolean getAllowUnmuteSelf() {
        return this.allowUnmuteSelf;
    }

    public UpdateVideoConferenceSettingRequest setAutoTransferHost(Boolean autoTransferHost) {
        this.autoTransferHost = autoTransferHost;
        return this;
    }
    public Boolean getAutoTransferHost() {
        return this.autoTransferHost;
    }

    public UpdateVideoConferenceSettingRequest setForbiddenShareScreen(Boolean forbiddenShareScreen) {
        this.forbiddenShareScreen = forbiddenShareScreen;
        return this;
    }
    public Boolean getForbiddenShareScreen() {
        return this.forbiddenShareScreen;
    }

    public UpdateVideoConferenceSettingRequest setLockConference(Boolean lockConference) {
        this.lockConference = lockConference;
        return this;
    }
    public Boolean getLockConference() {
        return this.lockConference;
    }

    public UpdateVideoConferenceSettingRequest setMuteAll(Boolean muteAll) {
        this.muteAll = muteAll;
        return this;
    }
    public Boolean getMuteAll() {
        return this.muteAll;
    }

    public UpdateVideoConferenceSettingRequest setOnlyInternalEmployeesJoin(Boolean onlyInternalEmployeesJoin) {
        this.onlyInternalEmployeesJoin = onlyInternalEmployeesJoin;
        return this;
    }
    public Boolean getOnlyInternalEmployeesJoin() {
        return this.onlyInternalEmployeesJoin;
    }

}
