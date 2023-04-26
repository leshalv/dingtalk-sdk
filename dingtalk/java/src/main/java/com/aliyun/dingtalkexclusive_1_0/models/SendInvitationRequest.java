// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkexclusive_1_0.models;

import com.aliyun.tea.*;

public class SendInvitationRequest extends TeaModel {
    @NameInMap("deptId")
    public String deptId;

    @NameInMap("orgAlias")
    public String orgAlias;

    @NameInMap("partnerLabelId")
    public Long partnerLabelId;

    @NameInMap("partnerNum")
    public String partnerNum;

    @NameInMap("phone")
    public String phone;

    public static SendInvitationRequest build(java.util.Map<String, ?> map) throws Exception {
        SendInvitationRequest self = new SendInvitationRequest();
        return TeaModel.build(map, self);
    }

    public SendInvitationRequest setDeptId(String deptId) {
        this.deptId = deptId;
        return this;
    }
    public String getDeptId() {
        return this.deptId;
    }

    public SendInvitationRequest setOrgAlias(String orgAlias) {
        this.orgAlias = orgAlias;
        return this;
    }
    public String getOrgAlias() {
        return this.orgAlias;
    }

    public SendInvitationRequest setPartnerLabelId(Long partnerLabelId) {
        this.partnerLabelId = partnerLabelId;
        return this;
    }
    public Long getPartnerLabelId() {
        return this.partnerLabelId;
    }

    public SendInvitationRequest setPartnerNum(String partnerNum) {
        this.partnerNum = partnerNum;
        return this;
    }
    public String getPartnerNum() {
        return this.partnerNum;
    }

    public SendInvitationRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

}
