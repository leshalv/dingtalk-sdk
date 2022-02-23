// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkconnector_1_0.models;

import com.aliyun.tea.*;

public class CreateActionRequest extends TeaModel {
    @NameInMap("actionInfo")
    public java.util.List<CreateActionRequestActionInfo> actionInfo;

    public static CreateActionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateActionRequest self = new CreateActionRequest();
        return TeaModel.build(map, self);
    }

    public CreateActionRequest setActionInfo(java.util.List<CreateActionRequestActionInfo> actionInfo) {
        this.actionInfo = actionInfo;
        return this;
    }
    public java.util.List<CreateActionRequestActionInfo> getActionInfo() {
        return this.actionInfo;
    }

    public static class CreateActionRequestActionInfoOutputDataRules extends TeaModel {
        // 规则的预期值。
        @NameInMap("expectValue")
        public String expectValue;

        // 操作类型。
        @NameInMap("operate")
        public String operate;

        // 规则的属性路径。
        @NameInMap("propertyPath")
        public String propertyPath;

        public static CreateActionRequestActionInfoOutputDataRules build(java.util.Map<String, ?> map) throws Exception {
            CreateActionRequestActionInfoOutputDataRules self = new CreateActionRequestActionInfoOutputDataRules();
            return TeaModel.build(map, self);
        }

        public CreateActionRequestActionInfoOutputDataRules setExpectValue(String expectValue) {
            this.expectValue = expectValue;
            return this;
        }
        public String getExpectValue() {
            return this.expectValue;
        }

        public CreateActionRequestActionInfoOutputDataRules setOperate(String operate) {
            this.operate = operate;
            return this;
        }
        public String getOperate() {
            return this.operate;
        }

        public CreateActionRequestActionInfoOutputDataRules setPropertyPath(String propertyPath) {
            this.propertyPath = propertyPath;
            return this;
        }
        public String getPropertyPath() {
            return this.propertyPath;
        }

    }

    public static class CreateActionRequestActionInfo extends TeaModel {
        // api请求url path，结合Connector上的apiDomain使用
        @NameInMap("apiPath")
        public String apiPath;

        // 描述
        @NameInMap("description")
        public String description;

        // 连接平台连接器id
        @NameInMap("dingConnectorId")
        public String dingConnectorId;

        // 入参schema
        @NameInMap("inputSchema")
        public String inputSchema;

        // 服务商的执行事件Id
        @NameInMap("integratorActionId")
        public String integratorActionId;

        // 服务商的连接器Id
        @NameInMap("integratorConnectorId")
        public String integratorConnectorId;

        // 名称
        @NameInMap("name")
        public String name;

        // 执行动作接口成功调用规则。
        @NameInMap("outputDataRules")
        public java.util.List<CreateActionRequestActionInfoOutputDataRules> outputDataRules;

        // 出参schema
        @NameInMap("outputSchema")
        public String outputSchema;

        public static CreateActionRequestActionInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateActionRequestActionInfo self = new CreateActionRequestActionInfo();
            return TeaModel.build(map, self);
        }

        public CreateActionRequestActionInfo setApiPath(String apiPath) {
            this.apiPath = apiPath;
            return this;
        }
        public String getApiPath() {
            return this.apiPath;
        }

        public CreateActionRequestActionInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateActionRequestActionInfo setDingConnectorId(String dingConnectorId) {
            this.dingConnectorId = dingConnectorId;
            return this;
        }
        public String getDingConnectorId() {
            return this.dingConnectorId;
        }

        public CreateActionRequestActionInfo setInputSchema(String inputSchema) {
            this.inputSchema = inputSchema;
            return this;
        }
        public String getInputSchema() {
            return this.inputSchema;
        }

        public CreateActionRequestActionInfo setIntegratorActionId(String integratorActionId) {
            this.integratorActionId = integratorActionId;
            return this;
        }
        public String getIntegratorActionId() {
            return this.integratorActionId;
        }

        public CreateActionRequestActionInfo setIntegratorConnectorId(String integratorConnectorId) {
            this.integratorConnectorId = integratorConnectorId;
            return this;
        }
        public String getIntegratorConnectorId() {
            return this.integratorConnectorId;
        }

        public CreateActionRequestActionInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateActionRequestActionInfo setOutputDataRules(java.util.List<CreateActionRequestActionInfoOutputDataRules> outputDataRules) {
            this.outputDataRules = outputDataRules;
            return this;
        }
        public java.util.List<CreateActionRequestActionInfoOutputDataRules> getOutputDataRules() {
            return this.outputDataRules;
        }

        public CreateActionRequestActionInfo setOutputSchema(String outputSchema) {
            this.outputSchema = outputSchema;
            return this;
        }
        public String getOutputSchema() {
            return this.outputSchema;
        }

    }

}
