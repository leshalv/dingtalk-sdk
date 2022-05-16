// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkindustry_1_0.models;

import com.aliyun.tea.*;

public class IndustryManufactureMesTeamMgmtRequest extends TeaModel {
    // 本次操作的行为，取值： ● add：增加   -- 创建群 ● update：更新 -- 群成员变更
    @NameInMap("action")
    public String action;

    // ISV的唯一标识,由BPaaS分配
    @NameInMap("appKey")
    public String appKey;

    // 基础数据名称。比如班组
    @NameInMap("baseDataName")
    public String baseDataName;

    // 事件配置列表(启用卡片列表),所有枚举值： 任务分配提醒: TASK_ASSIGN_REMINDER 任务逾期提醒: TASK_OVERDUE_REMINDER 置顶加急任务: STICK_URGET_TASK 报工审批提醒: OUTPUT_APPROVE_REMINDER 报工审批反馈: OUTPUT_APPROVE_RESULT 班组概览 :TEAM_OVERVIEW 我的任务:MYTASK_OVERVIEW     例如： ["STICK_URGET_TASK","OUTPUT_APPROVE_REMINDER"]
    @NameInMap("events")
    public java.util.List<String> events;

    // 扩展字段
    @NameInMap("extendData")
    public java.util.List<IndustryManufactureMesTeamMgmtRequestExtendData> extendData;

    // 群配置
    @NameInMap("groupConfig")
    public java.util.Map<String, ?> groupConfig;

    // 群插件列表
    @NameInMap("groupPlugins")
    public java.util.List<IndustryManufactureMesTeamMgmtRequestGroupPlugins> groupPlugins;

    // 群类型，枚举
    @NameInMap("groupType")
    public String groupType;

    // 班组模型实例的唯一Id， 由业务方传递
    @NameInMap("id")
    public String id;

    // 班组长(支持多个)
    @NameInMap("leaders")
    public java.util.List<IndustryManufactureMesTeamMgmtRequestLeaders> leaders;

    // 班组成员(群成员)
    @NameInMap("members")
    public java.util.List<IndustryManufactureMesTeamMgmtRequestMembers> members;

    // 班组群名称
    @NameInMap("name")
    public String name;

    // 关联的工序
    @NameInMap("processIds")
    public java.util.List<String> processIds;

    public static IndustryManufactureMesTeamMgmtRequest build(java.util.Map<String, ?> map) throws Exception {
        IndustryManufactureMesTeamMgmtRequest self = new IndustryManufactureMesTeamMgmtRequest();
        return TeaModel.build(map, self);
    }

    public IndustryManufactureMesTeamMgmtRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public IndustryManufactureMesTeamMgmtRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public IndustryManufactureMesTeamMgmtRequest setBaseDataName(String baseDataName) {
        this.baseDataName = baseDataName;
        return this;
    }
    public String getBaseDataName() {
        return this.baseDataName;
    }

    public IndustryManufactureMesTeamMgmtRequest setEvents(java.util.List<String> events) {
        this.events = events;
        return this;
    }
    public java.util.List<String> getEvents() {
        return this.events;
    }

    public IndustryManufactureMesTeamMgmtRequest setExtendData(java.util.List<IndustryManufactureMesTeamMgmtRequestExtendData> extendData) {
        this.extendData = extendData;
        return this;
    }
    public java.util.List<IndustryManufactureMesTeamMgmtRequestExtendData> getExtendData() {
        return this.extendData;
    }

    public IndustryManufactureMesTeamMgmtRequest setGroupConfig(java.util.Map<String, ?> groupConfig) {
        this.groupConfig = groupConfig;
        return this;
    }
    public java.util.Map<String, ?> getGroupConfig() {
        return this.groupConfig;
    }

    public IndustryManufactureMesTeamMgmtRequest setGroupPlugins(java.util.List<IndustryManufactureMesTeamMgmtRequestGroupPlugins> groupPlugins) {
        this.groupPlugins = groupPlugins;
        return this;
    }
    public java.util.List<IndustryManufactureMesTeamMgmtRequestGroupPlugins> getGroupPlugins() {
        return this.groupPlugins;
    }

    public IndustryManufactureMesTeamMgmtRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public IndustryManufactureMesTeamMgmtRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public IndustryManufactureMesTeamMgmtRequest setLeaders(java.util.List<IndustryManufactureMesTeamMgmtRequestLeaders> leaders) {
        this.leaders = leaders;
        return this;
    }
    public java.util.List<IndustryManufactureMesTeamMgmtRequestLeaders> getLeaders() {
        return this.leaders;
    }

    public IndustryManufactureMesTeamMgmtRequest setMembers(java.util.List<IndustryManufactureMesTeamMgmtRequestMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<IndustryManufactureMesTeamMgmtRequestMembers> getMembers() {
        return this.members;
    }

    public IndustryManufactureMesTeamMgmtRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public IndustryManufactureMesTeamMgmtRequest setProcessIds(java.util.List<String> processIds) {
        this.processIds = processIds;
        return this;
    }
    public java.util.List<String> getProcessIds() {
        return this.processIds;
    }

    public static class IndustryManufactureMesTeamMgmtRequestExtendData extends TeaModel {
        // 字段唯一标识
        @NameInMap("code")
        public String code;

        // 字段中文描述
        @NameInMap("name")
        public String name;

        // 字段的取值
        @NameInMap("value")
        public String value;

        // 字段的类型(string,number,boolean)
        @NameInMap("valueType")
        public String valueType;

        public static IndustryManufactureMesTeamMgmtRequestExtendData build(java.util.Map<String, ?> map) throws Exception {
            IndustryManufactureMesTeamMgmtRequestExtendData self = new IndustryManufactureMesTeamMgmtRequestExtendData();
            return TeaModel.build(map, self);
        }

        public IndustryManufactureMesTeamMgmtRequestExtendData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public IndustryManufactureMesTeamMgmtRequestExtendData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public IndustryManufactureMesTeamMgmtRequestExtendData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public IndustryManufactureMesTeamMgmtRequestExtendData setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class IndustryManufactureMesTeamMgmtRequestGroupPlugins extends TeaModel {
        @NameInMap("label")
        public String label;

        @NameInMap("value")
        public String value;

        public static IndustryManufactureMesTeamMgmtRequestGroupPlugins build(java.util.Map<String, ?> map) throws Exception {
            IndustryManufactureMesTeamMgmtRequestGroupPlugins self = new IndustryManufactureMesTeamMgmtRequestGroupPlugins();
            return TeaModel.build(map, self);
        }

        public IndustryManufactureMesTeamMgmtRequestGroupPlugins setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public IndustryManufactureMesTeamMgmtRequestGroupPlugins setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class IndustryManufactureMesTeamMgmtRequestLeaders extends TeaModel {
        // 工人姓名
        @NameInMap("name")
        public String name;

        // 工人staffNo
        @NameInMap("userId")
        public String userId;

        public static IndustryManufactureMesTeamMgmtRequestLeaders build(java.util.Map<String, ?> map) throws Exception {
            IndustryManufactureMesTeamMgmtRequestLeaders self = new IndustryManufactureMesTeamMgmtRequestLeaders();
            return TeaModel.build(map, self);
        }

        public IndustryManufactureMesTeamMgmtRequestLeaders setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public IndustryManufactureMesTeamMgmtRequestLeaders setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class IndustryManufactureMesTeamMgmtRequestMembers extends TeaModel {
        // 工人姓名
        @NameInMap("name")
        public String name;

        // 工人staffNo
        @NameInMap("userId")
        public String userId;

        public static IndustryManufactureMesTeamMgmtRequestMembers build(java.util.Map<String, ?> map) throws Exception {
            IndustryManufactureMesTeamMgmtRequestMembers self = new IndustryManufactureMesTeamMgmtRequestMembers();
            return TeaModel.build(map, self);
        }

        public IndustryManufactureMesTeamMgmtRequestMembers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public IndustryManufactureMesTeamMgmtRequestMembers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
