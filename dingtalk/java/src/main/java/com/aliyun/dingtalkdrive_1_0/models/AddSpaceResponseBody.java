// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkdrive_1_0.models;

import com.aliyun.tea.*;

public class AddSpaceResponseBody extends TeaModel {
    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     */
    @NameInMap("modifyTime")
    public String modifyTime;

    @NameInMap("permissionMode")
    public String permissionMode;

    @NameInMap("quota")
    public Long quota;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("spaceId")
    public String spaceId;

    @NameInMap("spaceName")
    public String spaceName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("spaceType")
    public String spaceType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("usedQuota")
    public Long usedQuota;

    public static AddSpaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddSpaceResponseBody self = new AddSpaceResponseBody();
        return TeaModel.build(map, self);
    }

    public AddSpaceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public AddSpaceResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public AddSpaceResponseBody setPermissionMode(String permissionMode) {
        this.permissionMode = permissionMode;
        return this;
    }
    public String getPermissionMode() {
        return this.permissionMode;
    }

    public AddSpaceResponseBody setQuota(Long quota) {
        this.quota = quota;
        return this;
    }
    public Long getQuota() {
        return this.quota;
    }

    public AddSpaceResponseBody setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public AddSpaceResponseBody setSpaceName(String spaceName) {
        this.spaceName = spaceName;
        return this;
    }
    public String getSpaceName() {
        return this.spaceName;
    }

    public AddSpaceResponseBody setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

    public AddSpaceResponseBody setUsedQuota(Long usedQuota) {
        this.usedQuota = usedQuota;
        return this;
    }
    public Long getUsedQuota() {
        return this.usedQuota;
    }

}
