// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkproject_integration_1_0;

import com.aliyun.tea.*;
import com.aliyun.dingtalkproject_integration_1_0.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public com.aliyun.gateway.spi.Client _client;
    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._client = new com.aliyun.gateway.dingtalk.Client();
        this._spi = _client;
        this._endpointRule = "";
        if (com.aliyun.teautil.Common.empty(_endpoint)) {
            this._endpoint = "api.dingtalk.com";
        }

    }


    /**
     * @summary 在项目事件会话中加人
     *
     * @param headers AddAttendeeToEventGroupHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddAttendeeToEventGroupResponse
     */
    public AddAttendeeToEventGroupResponse addAttendeeToEventGroupWithOptions(String userId, String groupId, AddAttendeeToEventGroupHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAttendeeToEventGroup"),
            new TeaPair("version", "projectIntegration_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/projectIntegration/users/" + userId + "/eventGroups/" + groupId + "/members"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new AddAttendeeToEventGroupResponse());
    }

    /**
     * @summary 在项目事件会话中加人
     *
     * @return AddAttendeeToEventGroupResponse
     */
    public AddAttendeeToEventGroupResponse addAttendeeToEventGroup(String userId, String groupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddAttendeeToEventGroupHeaders headers = new AddAttendeeToEventGroupHeaders();
        return this.addAttendeeToEventGroupWithOptions(userId, groupId, headers, runtime);
    }

    /**
     * @summary 创建项目事件会话
     *
     * @param headers CreateEventGroupHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEventGroupResponse
     */
    public CreateEventGroupResponse createEventGroupWithOptions(String userId, CreateEventGroupHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEventGroup"),
            new TeaPair("version", "projectIntegration_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/projectIntegration/users/" + userId + "/eventGroups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateEventGroupResponse());
    }

    /**
     * @summary 创建项目事件会话
     *
     * @return CreateEventGroupResponse
     */
    public CreateEventGroupResponse createEventGroup(String userId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateEventGroupHeaders headers = new CreateEventGroupHeaders();
        return this.createEventGroupWithOptions(userId, headers, runtime);
    }

    /**
     * @summary 在群会话发送项目卡片消息
     *
     * @param headers SendInteractiveCardHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendInteractiveCardResponse
     */
    public SendInteractiveCardResponse sendInteractiveCardWithOptions(String userId, SendInteractiveCardHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendInteractiveCard"),
            new TeaPair("version", "projectIntegration_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/projectIntegration/users/" + userId + "/groupChatCardMessages"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new SendInteractiveCardResponse());
    }

    /**
     * @summary 在群会话发送项目卡片消息
     *
     * @return SendInteractiveCardResponse
     */
    public SendInteractiveCardResponse sendInteractiveCard(String userId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SendInteractiveCardHeaders headers = new SendInteractiveCardHeaders();
        return this.sendInteractiveCardWithOptions(userId, headers, runtime);
    }

    /**
     * @summary 单聊会话发送项目卡片消息
     *
     * @param headers SendSingleInteractiveCardHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendSingleInteractiveCardResponse
     */
    public SendSingleInteractiveCardResponse sendSingleInteractiveCardWithOptions(String userId, SendSingleInteractiveCardHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendSingleInteractiveCard"),
            new TeaPair("version", "projectIntegration_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/projectIntegration/users/" + userId + "/singleChatCardMessages"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new SendSingleInteractiveCardResponse());
    }

    /**
     * @summary 单聊会话发送项目卡片消息
     *
     * @return SendSingleInteractiveCardResponse
     */
    public SendSingleInteractiveCardResponse sendSingleInteractiveCard(String userId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SendSingleInteractiveCardHeaders headers = new SendSingleInteractiveCardHeaders();
        return this.sendSingleInteractiveCardWithOptions(userId, headers, runtime);
    }

    /**
     * @summary 更新项目卡片消息
     *
     * @param headers UpdateInteractiveCardHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInteractiveCardResponse
     */
    public UpdateInteractiveCardResponse updateInteractiveCardWithOptions(String userId, UpdateInteractiveCardHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInteractiveCard"),
            new TeaPair("version", "projectIntegration_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/projectIntegration/users/" + userId + "/cardMessages"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateInteractiveCardResponse());
    }

    /**
     * @summary 更新项目卡片消息
     *
     * @return UpdateInteractiveCardResponse
     */
    public UpdateInteractiveCardResponse updateInteractiveCard(String userId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateInteractiveCardHeaders headers = new UpdateInteractiveCardHeaders();
        return this.updateInteractiveCardWithOptions(userId, headers, runtime);
    }
}
