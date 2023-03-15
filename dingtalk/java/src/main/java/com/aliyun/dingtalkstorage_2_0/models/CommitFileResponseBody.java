// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkstorage_2_0.models;

import com.aliyun.tea.*;

public class CommitFileResponseBody extends TeaModel {
    /**
     * <p>文件信息</p>
     */
    @NameInMap("dentry")
    public CommitFileResponseBodyDentry dentry;

    public static CommitFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CommitFileResponseBody self = new CommitFileResponseBody();
        return TeaModel.build(map, self);
    }

    public CommitFileResponseBody setDentry(CommitFileResponseBodyDentry dentry) {
        this.dentry = dentry;
        return this;
    }
    public CommitFileResponseBodyDentry getDentry() {
        return this.dentry;
    }

    public static class CommitFileResponseBodyDentryProperties extends TeaModel {
        /**
         * <p>文件是否只读</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        public static CommitFileResponseBodyDentryProperties build(java.util.Map<String, ?> map) throws Exception {
            CommitFileResponseBodyDentryProperties self = new CommitFileResponseBodyDentryProperties();
            return TeaModel.build(map, self);
        }

        public CommitFileResponseBodyDentryProperties setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class CommitFileResponseBodyDentryThumbnail extends TeaModel {
        /**
         * <p>缩略图高度</p>
         */
        @NameInMap("height")
        public Integer height;

        /**
         * <p>缩略图url</p>
         */
        @NameInMap("url")
        public String url;

        /**
         * <p>缩略图宽度</p>
         */
        @NameInMap("width")
        public Integer width;

        public static CommitFileResponseBodyDentryThumbnail build(java.util.Map<String, ?> map) throws Exception {
            CommitFileResponseBodyDentryThumbnail self = new CommitFileResponseBodyDentryThumbnail();
            return TeaModel.build(map, self);
        }

        public CommitFileResponseBodyDentryThumbnail setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public CommitFileResponseBodyDentryThumbnail setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public CommitFileResponseBodyDentryThumbnail setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class CommitFileResponseBodyDentry extends TeaModel {
        /**
         * <p>在特定应用上的属性。key是微应用Id, value是属性列表。</p>
         * <p>可以通过修改DentryAppProperty里的scope来设置属性的可见性</p>
         * <p>最大size:</p>
         * <p>	10</p>
         */
        @NameInMap("appProperties")
        public java.util.Map<String, java.util.List<DentryAppPropertiesValue>> appProperties;

        /**
         * <p>类别, 如图片、视频、音频等</p>
         * <p>枚举值:</p>
         * <p>	IMAGE: 图片</p>
         * <p>	VIDEO: 视频</p>
         * <p>	AUDIO: 音频</p>
         * <p>	ARCHIVE: 压缩包</p>
         * <p>	SHORTCUT: 快捷方式</p>
         * <p>	DOCUMENT: 文档</p>
         * <p>	ALI_DOC: 钉钉文档</p>
         * <p>	OTHER: 其它</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>创建时间</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>创建者id</p>
         */
        @NameInMap("creatorId")
        public String creatorId;

        /**
         * <p>后缀</p>
         */
        @NameInMap("extension")
        public String extension;

        /**
         * <p>id</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>修改时间</p>
         */
        @NameInMap("modifiedTime")
        public String modifiedTime;

        /**
         * <p>修改者id</p>
         */
        @NameInMap("modifierId")
        public String modifierId;

        /**
         * <p>名称</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>父目录id, 根目录id值为0</p>
         * <p>空值代表根目录的parentId不存在</p>
         */
        @NameInMap("parentId")
        public String parentId;

        /**
         * <p>存储分区，目前包括公有云OSS存储分区和专属Mini OSS存储分区</p>
         * <p>枚举值:</p>
         * <p>	PUBLIC_OSS_PARTITION: 公有云OSS存储分区</p>
         * <p>	MINI_OSS_PARTITION: 专属Mini OSS存储分区</p>
         */
        @NameInMap("partitionType")
        public String partitionType;

        /**
         * <p>路径</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>属性</p>
         */
        @NameInMap("properties")
        public CommitFileResponseBodyDentryProperties properties;

        /**
         * <p>大小, 单位:Byte</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <p>所在空间id</p>
         */
        @NameInMap("spaceId")
        public String spaceId;

        /**
         * <p>状态</p>
         * <p>枚举值:</p>
         * <p>	NORMAL: 正常</p>
         * <p>	DELETED: 已删除</p>
         * <p>	EXPIRED: 已过期</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>驱动类型</p>
         * <p>枚举值:</p>
         * <p>	DINGTALK: 钉钉统一存储驱动</p>
         * <p>	ALIDOC: 钉钉文档存储驱动</p>
         * <p>	SHANJI: 闪记存储驱动</p>
         * <p>	UNKNOWN: 未知驱动</p>
         */
        @NameInMap("storageDriver")
        public String storageDriver;

        /**
         * <p>缩略图信息</p>
         */
        @NameInMap("thumbnail")
        public CommitFileResponseBodyDentryThumbnail thumbnail;

        /**
         * <p>类型，目录或文件</p>
         * <p>枚举值:</p>
         * <p>	FILE: 文件</p>
         * <p>	FOLDER: 文件夹</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>uuid，如移动文件，此字段不变</p>
         */
        @NameInMap("uuid")
        public String uuid;

        /**
         * <p>版本</p>
         */
        @NameInMap("version")
        public Long version;

        public static CommitFileResponseBodyDentry build(java.util.Map<String, ?> map) throws Exception {
            CommitFileResponseBodyDentry self = new CommitFileResponseBodyDentry();
            return TeaModel.build(map, self);
        }

        public CommitFileResponseBodyDentry setAppProperties(java.util.Map<String, java.util.List<DentryAppPropertiesValue>> appProperties) {
            this.appProperties = appProperties;
            return this;
        }
        public java.util.Map<String, java.util.List<DentryAppPropertiesValue>> getAppProperties() {
            return this.appProperties;
        }

        public CommitFileResponseBodyDentry setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CommitFileResponseBodyDentry setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CommitFileResponseBodyDentry setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public CommitFileResponseBodyDentry setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public CommitFileResponseBodyDentry setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CommitFileResponseBodyDentry setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public CommitFileResponseBodyDentry setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public CommitFileResponseBodyDentry setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CommitFileResponseBodyDentry setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public CommitFileResponseBodyDentry setPartitionType(String partitionType) {
            this.partitionType = partitionType;
            return this;
        }
        public String getPartitionType() {
            return this.partitionType;
        }

        public CommitFileResponseBodyDentry setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CommitFileResponseBodyDentry setProperties(CommitFileResponseBodyDentryProperties properties) {
            this.properties = properties;
            return this;
        }
        public CommitFileResponseBodyDentryProperties getProperties() {
            return this.properties;
        }

        public CommitFileResponseBodyDentry setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public CommitFileResponseBodyDentry setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

        public CommitFileResponseBodyDentry setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CommitFileResponseBodyDentry setStorageDriver(String storageDriver) {
            this.storageDriver = storageDriver;
            return this;
        }
        public String getStorageDriver() {
            return this.storageDriver;
        }

        public CommitFileResponseBodyDentry setThumbnail(CommitFileResponseBodyDentryThumbnail thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public CommitFileResponseBodyDentryThumbnail getThumbnail() {
            return this.thumbnail;
        }

        public CommitFileResponseBodyDentry setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CommitFileResponseBodyDentry setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public CommitFileResponseBodyDentry setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
