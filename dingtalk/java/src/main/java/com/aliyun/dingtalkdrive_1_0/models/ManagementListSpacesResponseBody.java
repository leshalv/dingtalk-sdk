// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkdrive_1_0.models;

import com.aliyun.tea.*;

public class ManagementListSpacesResponseBody extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("spaces")
    public java.util.List<ManagementListSpacesResponseBodySpaces> spaces;

    public static ManagementListSpacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ManagementListSpacesResponseBody self = new ManagementListSpacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ManagementListSpacesResponseBody setSpaces(java.util.List<ManagementListSpacesResponseBodySpaces> spaces) {
        this.spaces = spaces;
        return this;
    }
    public java.util.List<ManagementListSpacesResponseBodySpaces> getSpaces() {
        return this.spaces;
    }

    public static class ManagementListSpacesResponseBodySpaces extends TeaModel {
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

        public static ManagementListSpacesResponseBodySpaces build(java.util.Map<String, ?> map) throws Exception {
            ManagementListSpacesResponseBodySpaces self = new ManagementListSpacesResponseBodySpaces();
            return TeaModel.build(map, self);
        }

        public ManagementListSpacesResponseBodySpaces setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ManagementListSpacesResponseBodySpaces setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ManagementListSpacesResponseBodySpaces setPermissionMode(String permissionMode) {
            this.permissionMode = permissionMode;
            return this;
        }
        public String getPermissionMode() {
            return this.permissionMode;
        }

        public ManagementListSpacesResponseBodySpaces setQuota(Long quota) {
            this.quota = quota;
            return this;
        }
        public Long getQuota() {
            return this.quota;
        }

        public ManagementListSpacesResponseBodySpaces setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

        public ManagementListSpacesResponseBodySpaces setSpaceName(String spaceName) {
            this.spaceName = spaceName;
            return this;
        }
        public String getSpaceName() {
            return this.spaceName;
        }

        public ManagementListSpacesResponseBodySpaces setSpaceType(String spaceType) {
            this.spaceType = spaceType;
            return this;
        }
        public String getSpaceType() {
            return this.spaceType;
        }

        public ManagementListSpacesResponseBodySpaces setUsedQuota(Long usedQuota) {
            this.usedQuota = usedQuota;
            return this;
        }
        public Long getUsedQuota() {
            return this.usedQuota;
        }

    }

}
