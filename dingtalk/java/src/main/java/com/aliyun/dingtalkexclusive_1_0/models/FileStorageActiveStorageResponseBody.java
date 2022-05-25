// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkexclusive_1_0.models;

import com.aliyun.tea.*;

public class FileStorageActiveStorageResponseBody extends TeaModel {
    // oss开启时间
    @NameInMap("createDate")
    public String createDate;

    // 是否开启专属存储 0开启1关闭
    @NameInMap("fileStorageOpenStatus")
    public Integer fileStorageOpenStatus;

    // 存储状态 0正常1异常
    @NameInMap("storageStatus")
    public Integer storageStatus;

    // 已经使用的容量Bytes
    @NameInMap("usedQuota")
    public Long usedQuota;

    public static FileStorageActiveStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FileStorageActiveStorageResponseBody self = new FileStorageActiveStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public FileStorageActiveStorageResponseBody setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }
    public String getCreateDate() {
        return this.createDate;
    }

    public FileStorageActiveStorageResponseBody setFileStorageOpenStatus(Integer fileStorageOpenStatus) {
        this.fileStorageOpenStatus = fileStorageOpenStatus;
        return this;
    }
    public Integer getFileStorageOpenStatus() {
        return this.fileStorageOpenStatus;
    }

    public FileStorageActiveStorageResponseBody setStorageStatus(Integer storageStatus) {
        this.storageStatus = storageStatus;
        return this;
    }
    public Integer getStorageStatus() {
        return this.storageStatus;
    }

    public FileStorageActiveStorageResponseBody setUsedQuota(Long usedQuota) {
        this.usedQuota = usedQuota;
        return this;
    }
    public Long getUsedQuota() {
        return this.usedQuota;
    }

}