// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkyida_1_0.models;

import com.aliyun.tea.*;

public class ExecuteBatchTaskRequest extends TeaModel {
    // 宜搭应用编码
    @NameInMap("appType")
    public String appType;

    // 文件
    @NameInMap("files")
    public String files;

    // 审批动作
    @NameInMap("outResult")
    public String outResult;

    // 审批意见
    @NameInMap("remark")
    public String remark;

    // 宜搭应用秘钥
    @NameInMap("systemToken")
    public String systemToken;

    // taskInfoList
    @NameInMap("taskInformationList")
    public String taskInformationList;

    // 钉钉userId
    @NameInMap("userId")
    public String userId;

    public static ExecuteBatchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteBatchTaskRequest self = new ExecuteBatchTaskRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteBatchTaskRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public ExecuteBatchTaskRequest setFiles(String files) {
        this.files = files;
        return this;
    }
    public String getFiles() {
        return this.files;
    }

    public ExecuteBatchTaskRequest setOutResult(String outResult) {
        this.outResult = outResult;
        return this;
    }
    public String getOutResult() {
        return this.outResult;
    }

    public ExecuteBatchTaskRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ExecuteBatchTaskRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

    public ExecuteBatchTaskRequest setTaskInformationList(String taskInformationList) {
        this.taskInformationList = taskInformationList;
        return this;
    }
    public String getTaskInformationList() {
        return this.taskInformationList;
    }

    public ExecuteBatchTaskRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
