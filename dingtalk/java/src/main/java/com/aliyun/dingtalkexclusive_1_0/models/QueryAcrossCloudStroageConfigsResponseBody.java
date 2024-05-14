// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkexclusive_1_0.models;

import com.aliyun.tea.*;

public class QueryAcrossCloudStroageConfigsResponseBody extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("accessKeyId")
    public String accessKeyId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("accessKeySecret")
    public String accessKeySecret;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("bucketName")
    public String bucketName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("cloudType")
    public Integer cloudType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("endpoint")
    public String endpoint;

    public static QueryAcrossCloudStroageConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAcrossCloudStroageConfigsResponseBody self = new QueryAcrossCloudStroageConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAcrossCloudStroageConfigsResponseBody setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public QueryAcrossCloudStroageConfigsResponseBody setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
        return this;
    }
    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    public QueryAcrossCloudStroageConfigsResponseBody setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public QueryAcrossCloudStroageConfigsResponseBody setCloudType(Integer cloudType) {
        this.cloudType = cloudType;
        return this;
    }
    public Integer getCloudType() {
        return this.cloudType;
    }

    public QueryAcrossCloudStroageConfigsResponseBody setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

}
