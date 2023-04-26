// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalksns_storage_1_0.models;

import com.aliyun.tea.*;

public class GetSpaceResponseBody extends TeaModel {
    @NameInMap("space")
    public GetSpaceResponseBodySpace space;

    public static GetSpaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSpaceResponseBody self = new GetSpaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSpaceResponseBody setSpace(GetSpaceResponseBodySpace space) {
        this.space = space;
        return this;
    }
    public GetSpaceResponseBodySpace getSpace() {
        return this.space;
    }

    public static class GetSpaceResponseBodySpace extends TeaModel {
        @NameInMap("corpId")
        public String corpId;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("modifiedTime")
        public String modifiedTime;

        @NameInMap("spaceId")
        public String spaceId;

        public static GetSpaceResponseBodySpace build(java.util.Map<String, ?> map) throws Exception {
            GetSpaceResponseBodySpace self = new GetSpaceResponseBodySpace();
            return TeaModel.build(map, self);
        }

        public GetSpaceResponseBodySpace setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public GetSpaceResponseBodySpace setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSpaceResponseBodySpace setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetSpaceResponseBodySpace setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

    }

}
