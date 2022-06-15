// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkexclusive_1_0.models;

import com.aliyun.tea.*;

public class ExclusiveCreateDingPortalRequest extends TeaModel {
    // 工作台名称。
    @NameInMap("dingPortalName")
    public String dingPortalName;

    // 被操纵企业ID。
    @NameInMap("targetCorpId")
    public String targetCorpId;

    // 模版id。
    @NameInMap("templateAppUuid")
    public String templateAppUuid;

    // 模版所属的组织id。
    @NameInMap("templateCorpId")
    public String templateCorpId;

    public static ExclusiveCreateDingPortalRequest build(java.util.Map<String, ?> map) throws Exception {
        ExclusiveCreateDingPortalRequest self = new ExclusiveCreateDingPortalRequest();
        return TeaModel.build(map, self);
    }

    public ExclusiveCreateDingPortalRequest setDingPortalName(String dingPortalName) {
        this.dingPortalName = dingPortalName;
        return this;
    }
    public String getDingPortalName() {
        return this.dingPortalName;
    }

    public ExclusiveCreateDingPortalRequest setTargetCorpId(String targetCorpId) {
        this.targetCorpId = targetCorpId;
        return this;
    }
    public String getTargetCorpId() {
        return this.targetCorpId;
    }

    public ExclusiveCreateDingPortalRequest setTemplateAppUuid(String templateAppUuid) {
        this.templateAppUuid = templateAppUuid;
        return this;
    }
    public String getTemplateAppUuid() {
        return this.templateAppUuid;
    }

    public ExclusiveCreateDingPortalRequest setTemplateCorpId(String templateCorpId) {
        this.templateCorpId = templateCorpId;
        return this;
    }
    public String getTemplateCorpId() {
        return this.templateCorpId;
    }

}