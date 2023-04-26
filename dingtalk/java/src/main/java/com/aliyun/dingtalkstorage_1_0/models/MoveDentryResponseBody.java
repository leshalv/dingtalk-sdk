// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkstorage_1_0.models;

import com.aliyun.tea.*;

public class MoveDentryResponseBody extends TeaModel {
    @NameInMap("async")
    public Boolean async;

    @NameInMap("dentry")
    public MoveDentryResponseBodyDentry dentry;

    @NameInMap("taskId")
    public String taskId;

    public static MoveDentryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveDentryResponseBody self = new MoveDentryResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveDentryResponseBody setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public MoveDentryResponseBody setDentry(MoveDentryResponseBodyDentry dentry) {
        this.dentry = dentry;
        return this;
    }
    public MoveDentryResponseBodyDentry getDentry() {
        return this.dentry;
    }

    public MoveDentryResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class MoveDentryResponseBodyDentryProperties extends TeaModel {
        @NameInMap("readOnly")
        public Boolean readOnly;

        public static MoveDentryResponseBodyDentryProperties build(java.util.Map<String, ?> map) throws Exception {
            MoveDentryResponseBodyDentryProperties self = new MoveDentryResponseBodyDentryProperties();
            return TeaModel.build(map, self);
        }

        public MoveDentryResponseBodyDentryProperties setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class MoveDentryResponseBodyDentry extends TeaModel {
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
        public MoveDentryResponseBodyDentryProperties properties;

        @NameInMap("size")
        public Long size;

        @NameInMap("spaceId")
        public String spaceId;

        @NameInMap("status")
        public String status;

        @NameInMap("storageDriver")
        public String storageDriver;

        @NameInMap("type")
        public String type;

        @NameInMap("uuid")
        public String uuid;

        @NameInMap("version")
        public Long version;

        public static MoveDentryResponseBodyDentry build(java.util.Map<String, ?> map) throws Exception {
            MoveDentryResponseBodyDentry self = new MoveDentryResponseBodyDentry();
            return TeaModel.build(map, self);
        }

        public MoveDentryResponseBodyDentry setAppProperties(java.util.Map<String, java.util.List<DentryAppPropertiesValue>> appProperties) {
            this.appProperties = appProperties;
            return this;
        }
        public java.util.Map<String, java.util.List<DentryAppPropertiesValue>> getAppProperties() {
            return this.appProperties;
        }

        public MoveDentryResponseBodyDentry setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public MoveDentryResponseBodyDentry setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public MoveDentryResponseBodyDentry setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public MoveDentryResponseBodyDentry setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public MoveDentryResponseBodyDentry setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public MoveDentryResponseBodyDentry setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public MoveDentryResponseBodyDentry setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MoveDentryResponseBodyDentry setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public MoveDentryResponseBodyDentry setPartitionType(String partitionType) {
            this.partitionType = partitionType;
            return this;
        }
        public String getPartitionType() {
            return this.partitionType;
        }

        public MoveDentryResponseBodyDentry setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public MoveDentryResponseBodyDentry setProperties(MoveDentryResponseBodyDentryProperties properties) {
            this.properties = properties;
            return this;
        }
        public MoveDentryResponseBodyDentryProperties getProperties() {
            return this.properties;
        }

        public MoveDentryResponseBodyDentry setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public MoveDentryResponseBodyDentry setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

        public MoveDentryResponseBodyDentry setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public MoveDentryResponseBodyDentry setStorageDriver(String storageDriver) {
            this.storageDriver = storageDriver;
            return this;
        }
        public String getStorageDriver() {
            return this.storageDriver;
        }

        public MoveDentryResponseBodyDentry setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public MoveDentryResponseBodyDentry setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public MoveDentryResponseBodyDentry setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
