// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalksns_storage_1_0.models;

import com.aliyun.tea.*;

public class ListDentriesResponseBody extends TeaModel {
    // 文件列表
    // 最大size:
    // 	50
    @NameInMap("dentries")
    public java.util.List<ListDentriesResponseBodyDentries> dentries;

    // 分页游标
    // 不为空表示有更多数据
    @NameInMap("nextToken")
    public String nextToken;

    public static ListDentriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDentriesResponseBody self = new ListDentriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDentriesResponseBody setDentries(java.util.List<ListDentriesResponseBodyDentries> dentries) {
        this.dentries = dentries;
        return this;
    }
    public java.util.List<ListDentriesResponseBodyDentries> getDentries() {
        return this.dentries;
    }

    public ListDentriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListDentriesResponseBodyDentriesProperties extends TeaModel {
        // 文件是否只读
        @NameInMap("readOnly")
        public Boolean readOnly;

        public static ListDentriesResponseBodyDentriesProperties build(java.util.Map<String, ?> map) throws Exception {
            ListDentriesResponseBodyDentriesProperties self = new ListDentriesResponseBodyDentriesProperties();
            return TeaModel.build(map, self);
        }

        public ListDentriesResponseBodyDentriesProperties setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class ListDentriesResponseBodyDentriesThumbnail extends TeaModel {
        // 缩略图高度
        @NameInMap("height")
        public Integer height;

        // 缩略图url
        @NameInMap("url")
        public String url;

        // 缩略图宽度
        @NameInMap("width")
        public Integer width;

        public static ListDentriesResponseBodyDentriesThumbnail build(java.util.Map<String, ?> map) throws Exception {
            ListDentriesResponseBodyDentriesThumbnail self = new ListDentriesResponseBodyDentriesThumbnail();
            return TeaModel.build(map, self);
        }

        public ListDentriesResponseBodyDentriesThumbnail setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public ListDentriesResponseBodyDentriesThumbnail setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ListDentriesResponseBodyDentriesThumbnail setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class ListDentriesResponseBodyDentries extends TeaModel {
        // 在特定应用上的属性。key是微应用Id, value是属性列表。
        // 可以通过修改DentryAppProperty里的scope来设置属性的可见性
        // 最大size:
        // 	10
        @NameInMap("appProperties")
        public java.util.Map<String, java.util.List<DentriesAppPropertiesValue>> appProperties;

        // 创建时间
        @NameInMap("createTime")
        public String createTime;

        // 创建者id
        @NameInMap("creatorId")
        public String creatorId;

        // 后缀
        @NameInMap("extension")
        public String extension;

        // id
        @NameInMap("id")
        public String id;

        // 修改时间
        @NameInMap("modifiedTime")
        public String modifiedTime;

        // 修改者id
        @NameInMap("modifierId")
        public String modifierId;

        // 名称
        @NameInMap("name")
        public String name;

        // 父目录id, 根目录id值为0
        // 空值代表根目录的parentId不存在
        @NameInMap("parentId")
        public String parentId;

        // 存储分区，目前包括公有云OSS存储分区和专属Mini OSS存储分区
        // 枚举值:
        // 	PUBLIC_OSS_PARTITION: 公有云OSS存储分区
        // 	MINI_OSS_PARTITION: 专属Mini OSS存储分区
        @NameInMap("partitionType")
        public String partitionType;

        // 路径
        @NameInMap("path")
        public String path;

        // 属性
        @NameInMap("properties")
        public ListDentriesResponseBodyDentriesProperties properties;

        // 大小, 单位:Byte
        @NameInMap("size")
        public Long size;

        // 所在空间id
        @NameInMap("spaceId")
        public String spaceId;

        // 状态
        // 枚举值:
        // 	NORMAL: 正常
        // 	DELETED: 已删除
        // 	EXPIRED: 已过期
        @NameInMap("status")
        public String status;

        // 驱动类型
        // 枚举值:
        // 	DINGTALK: 钉钉统一存储驱动
        // 	ALIDOC: 钉钉文档存储驱动
        // 	SHANJI: 闪记存储驱动
        // 	UNKNOWN: 未知驱动
        @NameInMap("storageDriver")
        public String storageDriver;

        // 缩略图信息
        @NameInMap("thumbnail")
        public ListDentriesResponseBodyDentriesThumbnail thumbnail;

        // 类型，目录或文件
        // 枚举值:
        // 	FILE: 文件
        // 	FOLDER: 文件夹
        @NameInMap("type")
        public String type;

        // uuid，如移动文件，此字段不变
        @NameInMap("uuid")
        public String uuid;

        // 版本
        @NameInMap("version")
        public Long version;

        public static ListDentriesResponseBodyDentries build(java.util.Map<String, ?> map) throws Exception {
            ListDentriesResponseBodyDentries self = new ListDentriesResponseBodyDentries();
            return TeaModel.build(map, self);
        }

        public ListDentriesResponseBodyDentries setAppProperties(java.util.Map<String, java.util.List<DentriesAppPropertiesValue>> appProperties) {
            this.appProperties = appProperties;
            return this;
        }
        public java.util.Map<String, java.util.List<DentriesAppPropertiesValue>> getAppProperties() {
            return this.appProperties;
        }

        public ListDentriesResponseBodyDentries setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDentriesResponseBodyDentries setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListDentriesResponseBodyDentries setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ListDentriesResponseBodyDentries setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDentriesResponseBodyDentries setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListDentriesResponseBodyDentries setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public ListDentriesResponseBodyDentries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDentriesResponseBodyDentries setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ListDentriesResponseBodyDentries setPartitionType(String partitionType) {
            this.partitionType = partitionType;
            return this;
        }
        public String getPartitionType() {
            return this.partitionType;
        }

        public ListDentriesResponseBodyDentries setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListDentriesResponseBodyDentries setProperties(ListDentriesResponseBodyDentriesProperties properties) {
            this.properties = properties;
            return this;
        }
        public ListDentriesResponseBodyDentriesProperties getProperties() {
            return this.properties;
        }

        public ListDentriesResponseBodyDentries setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListDentriesResponseBodyDentries setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

        public ListDentriesResponseBodyDentries setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDentriesResponseBodyDentries setStorageDriver(String storageDriver) {
            this.storageDriver = storageDriver;
            return this;
        }
        public String getStorageDriver() {
            return this.storageDriver;
        }

        public ListDentriesResponseBodyDentries setThumbnail(ListDentriesResponseBodyDentriesThumbnail thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public ListDentriesResponseBodyDentriesThumbnail getThumbnail() {
            return this.thumbnail;
        }

        public ListDentriesResponseBodyDentries setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDentriesResponseBodyDentries setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public ListDentriesResponseBodyDentries setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}