// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkstorage_1_0.models;

import com.aliyun.tea.*;

public class GetDentryResponseBody extends TeaModel {
    @NameInMap("dentry")
    public GetDentryResponseBodyDentry dentry;

    public static GetDentryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDentryResponseBody self = new GetDentryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDentryResponseBody setDentry(GetDentryResponseBodyDentry dentry) {
        this.dentry = dentry;
        return this;
    }
    public GetDentryResponseBodyDentry getDentry() {
        return this.dentry;
    }

    public static class GetDentryResponseBodyDentryProperties extends TeaModel {
        @NameInMap("readOnly")
        public Boolean readOnly;

        public static GetDentryResponseBodyDentryProperties build(java.util.Map<String, ?> map) throws Exception {
            GetDentryResponseBodyDentryProperties self = new GetDentryResponseBodyDentryProperties();
            return TeaModel.build(map, self);
        }

        public GetDentryResponseBodyDentryProperties setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class GetDentryResponseBodyDentryThumbnail extends TeaModel {
        @NameInMap("height")
        public Integer height;

        @NameInMap("url")
        public String url;

        @NameInMap("width")
        public Integer width;

        public static GetDentryResponseBodyDentryThumbnail build(java.util.Map<String, ?> map) throws Exception {
            GetDentryResponseBodyDentryThumbnail self = new GetDentryResponseBodyDentryThumbnail();
            return TeaModel.build(map, self);
        }

        public GetDentryResponseBodyDentryThumbnail setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public GetDentryResponseBodyDentryThumbnail setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetDentryResponseBodyDentryThumbnail setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class GetDentryResponseBodyDentry extends TeaModel {
        @NameInMap("appProperties")
        public java.util.Map<String, java.util.List<DentryAppPropertiesValue>> appProperties;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("creatorId")
        public String creatorId;

        @NameInMap("extension")
        public String extension;

        @NameInMap("id")
        public String id;

        @NameInMap("modifiedTime")
        public String modifiedTime;

        @NameInMap("modifierId")
        public String modifierId;

        @NameInMap("name")
        public String name;

        @NameInMap("parentId")
        public String parentId;

        @NameInMap("partitionType")
        public String partitionType;

        @NameInMap("path")
        public String path;

        @NameInMap("properties")
        public GetDentryResponseBodyDentryProperties properties;

        @NameInMap("size")
        public Long size;

        @NameInMap("spaceId")
        public String spaceId;

        @NameInMap("status")
        public String status;

        @NameInMap("storageDriver")
        public String storageDriver;

        @NameInMap("thumbnail")
        public GetDentryResponseBodyDentryThumbnail thumbnail;

        @NameInMap("type")
        public String type;

        @NameInMap("uuid")
        public String uuid;

        @NameInMap("version")
        public Long version;

        public static GetDentryResponseBodyDentry build(java.util.Map<String, ?> map) throws Exception {
            GetDentryResponseBodyDentry self = new GetDentryResponseBodyDentry();
            return TeaModel.build(map, self);
        }

        public GetDentryResponseBodyDentry setAppProperties(java.util.Map<String, java.util.List<DentryAppPropertiesValue>> appProperties) {
            this.appProperties = appProperties;
            return this;
        }
        public java.util.Map<String, java.util.List<DentryAppPropertiesValue>> getAppProperties() {
            return this.appProperties;
        }

        public GetDentryResponseBodyDentry setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetDentryResponseBodyDentry setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetDentryResponseBodyDentry setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public GetDentryResponseBodyDentry setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDentryResponseBodyDentry setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetDentryResponseBodyDentry setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public GetDentryResponseBodyDentry setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDentryResponseBodyDentry setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public GetDentryResponseBodyDentry setPartitionType(String partitionType) {
            this.partitionType = partitionType;
            return this;
        }
        public String getPartitionType() {
            return this.partitionType;
        }

        public GetDentryResponseBodyDentry setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetDentryResponseBodyDentry setProperties(GetDentryResponseBodyDentryProperties properties) {
            this.properties = properties;
            return this;
        }
        public GetDentryResponseBodyDentryProperties getProperties() {
            return this.properties;
        }

        public GetDentryResponseBodyDentry setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetDentryResponseBodyDentry setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

        public GetDentryResponseBodyDentry setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDentryResponseBodyDentry setStorageDriver(String storageDriver) {
            this.storageDriver = storageDriver;
            return this;
        }
        public String getStorageDriver() {
            return this.storageDriver;
        }

        public GetDentryResponseBodyDentry setThumbnail(GetDentryResponseBodyDentryThumbnail thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public GetDentryResponseBodyDentryThumbnail getThumbnail() {
            return this.thumbnail;
        }

        public GetDentryResponseBodyDentry setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetDentryResponseBodyDentry setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public GetDentryResponseBodyDentry setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
