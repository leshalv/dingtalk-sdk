// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkim_1_0;

import com.aliyun.tea.*;
import com.aliyun.dingtalkim_1_0.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        com.aliyun.gateway.dingtalk.Client gatewayClient = new com.aliyun.gateway.dingtalk.Client();
        this._spi = gatewayClient;
        this._endpointRule = "";
        if (com.aliyun.teautil.Common.empty(_endpoint)) {
            this._endpoint = "api.dingtalk.com";
        }

    }


    /**
     * <b>summary</b> : 
     * <p>添加企业文字表情</p>
     * 
     * @param request AddOrgTextEmotionRequest
     * @param headers AddOrgTextEmotionHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddOrgTextEmotionResponse
     */
    public AddOrgTextEmotionResponse addOrgTextEmotionWithOptions(AddOrgTextEmotionRequest request, AddOrgTextEmotionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backgroundMediaId)) {
            body.put("backgroundMediaId", request.backgroundMediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgroundMediaIdForPanel)) {
            body.put("backgroundMediaIdForPanel", request.backgroundMediaIdForPanel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deptId)) {
            body.put("deptId", request.deptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emotionName)) {
            body.put("emotionName", request.emotionName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddOrgTextEmotion"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/organizations/textEmotions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new AddOrgTextEmotionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加企业文字表情</p>
     * 
     * @param request AddOrgTextEmotionRequest
     * @return AddOrgTextEmotionResponse
     */
    public AddOrgTextEmotionResponse addOrgTextEmotion(AddOrgTextEmotionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddOrgTextEmotionHeaders headers = new AddOrgTextEmotionHeaders();
        return this.addOrgTextEmotionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加机器人到会话</p>
     * 
     * @param request AddRobotToConversationRequest
     * @param headers AddRobotToConversationHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddRobotToConversationResponse
     */
    public AddRobotToConversationResponse addRobotToConversationWithOptions(AddRobotToConversationRequest request, AddRobotToConversationHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.icon)) {
            body.put("icon", request.icon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("robotCode", request.robotCode);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddRobotToConversation"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/conversations/robots"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new AddRobotToConversationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加机器人到会话</p>
     * 
     * @param request AddRobotToConversationRequest
     * @return AddRobotToConversationResponse
     */
    public AddRobotToConversationResponse addRobotToConversation(AddRobotToConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddRobotToConversationHeaders headers = new AddRobotToConversationHeaders();
        return this.addRobotToConversationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>自动开通钉钉客联微应用</p>
     * 
     * @param headers AutoOpenDingTalkConnectHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AutoOpenDingTalkConnectResponse
     */
    public AutoOpenDingTalkConnectResponse autoOpenDingTalkConnectWithOptions(AutoOpenDingTalkConnectHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "AutoOpenDingTalkConnect"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/interconnections/apps/open"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new AutoOpenDingTalkConnectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>自动开通钉钉客联微应用</p>
     * @return AutoOpenDingTalkConnectResponse
     */
    public AutoOpenDingTalkConnectResponse autoOpenDingTalkConnect() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AutoOpenDingTalkConnectHeaders headers = new AutoOpenDingTalkConnectHeaders();
        return this.autoOpenDingTalkConnectWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询家校群消息详情</p>
     * 
     * @param request BatchQueryFamilySchoolMessageRequest
     * @param headers BatchQueryFamilySchoolMessageHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchQueryFamilySchoolMessageResponse
     */
    public BatchQueryFamilySchoolMessageResponse batchQueryFamilySchoolMessageWithOptions(BatchQueryFamilySchoolMessageRequest request, BatchQueryFamilySchoolMessageHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openMessageIds)) {
            body.put("openMessageIds", request.openMessageIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unionId)) {
            body.put("unionId", request.unionId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchQueryFamilySchoolMessage"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/conversations/familySchools/messages/batchQuery"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new BatchQueryFamilySchoolMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询家校群消息详情</p>
     * 
     * @param request BatchQueryFamilySchoolMessageRequest
     * @return BatchQueryFamilySchoolMessageResponse
     */
    public BatchQueryFamilySchoolMessageResponse batchQueryFamilySchoolMessage(BatchQueryFamilySchoolMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        BatchQueryFamilySchoolMessageHeaders headers = new BatchQueryFamilySchoolMessageHeaders();
        return this.batchQueryFamilySchoolMessageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询群成员</p>
     * 
     * @param request BatchQueryGroupMemberRequest
     * @param headers BatchQueryGroupMemberHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchQueryGroupMemberResponse
     */
    public BatchQueryGroupMemberResponse batchQueryGroupMemberWithOptions(BatchQueryGroupMemberRequest request, BatchQueryGroupMemberHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coolAppCode)) {
            body.put("coolAppCode", request.coolAppCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchQueryGroupMember"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/sceneGroups/members/batchQuery"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new BatchQueryGroupMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询群成员</p>
     * 
     * @param request BatchQueryGroupMemberRequest
     * @return BatchQueryGroupMemberResponse
     */
    public BatchQueryGroupMemberResponse batchQueryGroupMember(BatchQueryGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        BatchQueryGroupMemberHeaders headers = new BatchQueryGroupMemberHeaders();
        return this.batchQueryGroupMemberWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>钉钉互动卡片模板构建动作</p>
     * 
     * @param request CardTemplateBuildActionRequest
     * @param headers CardTemplateBuildActionHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CardTemplateBuildActionResponse
     */
    public CardTemplateBuildActionResponse cardTemplateBuildActionWithOptions(CardTemplateBuildActionRequest request, CardTemplateBuildActionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            body.put("action", request.action);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardTemplateJson)) {
            body.put("cardTemplateJson", request.cardTemplateJson);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CardTemplateBuildAction"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/interactiveCards/templates/buildAction"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CardTemplateBuildActionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>钉钉互动卡片模板构建动作</p>
     * 
     * @param request CardTemplateBuildActionRequest
     * @return CardTemplateBuildActionResponse
     */
    public CardTemplateBuildActionResponse cardTemplateBuildAction(CardTemplateBuildActionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CardTemplateBuildActionHeaders headers = new CardTemplateBuildActionHeaders();
        return this.cardTemplateBuildActionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更换群主</p>
     * 
     * @param request ChangeGroupOwnerRequest
     * @param headers ChangeGroupOwnerHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeGroupOwnerResponse
     */
    public ChangeGroupOwnerResponse changeGroupOwnerWithOptions(ChangeGroupOwnerRequest request, ChangeGroupOwnerHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupOwnerId)) {
            body.put("groupOwnerId", request.groupOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupOwnerType)) {
            body.put("groupOwnerType", request.groupOwnerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeGroupOwner"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/interconnections/groups/owners"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ChangeGroupOwnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更换群主</p>
     * 
     * @param request ChangeGroupOwnerRequest
     * @return ChangeGroupOwnerResponse
     */
    public ChangeGroupOwnerResponse changeGroupOwner(ChangeGroupOwnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ChangeGroupOwnerHeaders headers = new ChangeGroupOwnerHeaders();
        return this.changeGroupOwnerWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>会话开放的ChatId转OpenConversationId</p>
     * 
     * @param headers ChatIdToOpenConversationIdHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatIdToOpenConversationIdResponse
     */
    public ChatIdToOpenConversationIdResponse chatIdToOpenConversationIdWithOptions(String chatId, ChatIdToOpenConversationIdHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ChatIdToOpenConversationId"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/chat/" + chatId + "/convertToOpenConversationId"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ChatIdToOpenConversationIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>会话开放的ChatId转OpenConversationId</p>
     * @return ChatIdToOpenConversationIdResponse
     */
    public ChatIdToOpenConversationIdResponse chatIdToOpenConversationId(String chatId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ChatIdToOpenConversationIdHeaders headers = new ChatIdToOpenConversationIdHeaders();
        return this.chatIdToOpenConversationIdWithOptions(chatId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置群管理员</p>
     * 
     * @param request ChatSubAdminUpdateRequest
     * @param headers ChatSubAdminUpdateHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatSubAdminUpdateResponse
     */
    public ChatSubAdminUpdateResponse chatSubAdminUpdateWithOptions(ChatSubAdminUpdateRequest request, ChatSubAdminUpdateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            body.put("role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            body.put("userIds", request.userIds);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatSubAdminUpdate"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/subAdministrators"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ChatSubAdminUpdateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置群管理员</p>
     * 
     * @param request ChatSubAdminUpdateRequest
     * @return ChatSubAdminUpdateResponse
     */
    public ChatSubAdminUpdateResponse chatSubAdminUpdate(ChatSubAdminUpdateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ChatSubAdminUpdateHeaders headers = new ChatSubAdminUpdateHeaders();
        return this.chatSubAdminUpdateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户是否为企业内部群成员</p>
     * 
     * @param request CheckUserIsGroupMemberRequest
     * @param headers CheckUserIsGroupMemberHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckUserIsGroupMemberResponse
     */
    public CheckUserIsGroupMemberResponse checkUserIsGroupMemberWithOptions(CheckUserIsGroupMemberRequest request, CheckUserIsGroupMemberHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckUserIsGroupMember"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/innerGroups/members/check"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CheckUserIsGroupMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户是否为企业内部群成员</p>
     * 
     * @param request CheckUserIsGroupMemberRequest
     * @return CheckUserIsGroupMemberResponse
     */
    public CheckUserIsGroupMemberResponse checkUserIsGroupMember(CheckUserIsGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CheckUserIsGroupMemberHeaders headers = new CheckUserIsGroupMemberHeaders();
        return this.checkUserIsGroupMemberWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询消息开放群模板下群计数</p>
     * 
     * @param request CountOpenMsgSceneGroupsRequest
     * @param headers CountOpenMsgSceneGroupsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CountOpenMsgSceneGroupsResponse
     */
    public CountOpenMsgSceneGroupsResponse countOpenMsgSceneGroupsWithOptions(CountOpenMsgSceneGroupsRequest request, CountOpenMsgSceneGroupsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("templateId", request.templateId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CountOpenMsgSceneGroups"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/openMsgSceneGroups/templates/counts/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CountOpenMsgSceneGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询消息开放群模板下群计数</p>
     * 
     * @param request CountOpenMsgSceneGroupsRequest
     * @return CountOpenMsgSceneGroupsResponse
     */
    public CountOpenMsgSceneGroupsResponse countOpenMsgSceneGroups(CountOpenMsgSceneGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CountOpenMsgSceneGroupsHeaders headers = new CountOpenMsgSceneGroupsHeaders();
        return this.countOpenMsgSceneGroupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建钉外两人群</p>
     * 
     * @param request CreateCoupleGroupConversationRequest
     * @param headers CreateCoupleGroupConversationHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCoupleGroupConversationResponse
     */
    public CreateCoupleGroupConversationResponse createCoupleGroupConversationWithOptions(CreateCoupleGroupConversationRequest request, CreateCoupleGroupConversationHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appUserId)) {
            body.put("appUserId", request.appUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupAvatar)) {
            body.put("groupAvatar", request.groupAvatar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("groupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupOwnerId)) {
            body.put("groupOwnerId", request.groupOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupTemplateId)) {
            body.put("groupTemplateId", request.groupTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("operatorId", request.operatorId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCoupleGroupConversation"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/interconnections/coupleGroups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateCoupleGroupConversationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建钉外两人群</p>
     * 
     * @param request CreateCoupleGroupConversationRequest
     * @return CreateCoupleGroupConversationResponse
     */
    public CreateCoupleGroupConversationResponse createCoupleGroupConversation(CreateCoupleGroupConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateCoupleGroupConversationHeaders headers = new CreateCoupleGroupConversationHeaders();
        return this.createCoupleGroupConversationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建互通群（支持普通互通群、跨钉两人群）</p>
     * 
     * @param request CreateGroupConversationRequest
     * @param headers CreateGroupConversationHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGroupConversationResponse
     */
    public CreateGroupConversationResponse createGroupConversationWithOptions(CreateGroupConversationRequest request, CreateGroupConversationHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appUserIds)) {
            body.put("appUserIds", request.appUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupAvatar)) {
            body.put("groupAvatar", request.groupAvatar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("groupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupOwnerId)) {
            body.put("groupOwnerId", request.groupOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupOwnerType)) {
            body.put("groupOwnerType", request.groupOwnerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupTemplateId)) {
            body.put("groupTemplateId", request.groupTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("operatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            body.put("userIds", request.userIds);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGroupConversation"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/interconnections/groups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateGroupConversationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建互通群（支持普通互通群、跨钉两人群）</p>
     * 
     * @param request CreateGroupConversationRequest
     * @return CreateGroupConversationResponse
     */
    public CreateGroupConversationResponse createGroupConversation(CreateGroupConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateGroupConversationHeaders headers = new CreateGroupConversationHeaders();
        return this.createGroupConversationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建钉外账号</p>
     * 
     * @param request CreateInterconnectionRequest
     * @param headers CreateInterconnectionHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInterconnectionResponse
     */
    public CreateInterconnectionResponse createInterconnectionWithOptions(CreateInterconnectionRequest request, CreateInterconnectionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.interconnections)) {
            body.put("interconnections", request.interconnections);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInterconnection"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/interconnections"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateInterconnectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建钉外账号</p>
     * 
     * @param request CreateInterconnectionRequest
     * @return CreateInterconnectionResponse
     */
    public CreateInterconnectionResponse createInterconnection(CreateInterconnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateInterconnectionHeaders headers = new CreateInterconnectionHeaders();
        return this.createInterconnectionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建场景群会话</p>
     * 
     * @param request CreateSceneGroupConversationRequest
     * @param headers CreateSceneGroupConversationHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSceneGroupConversationResponse
     */
    public CreateSceneGroupConversationResponse createSceneGroupConversationWithOptions(CreateSceneGroupConversationRequest request, CreateSceneGroupConversationHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.features)) {
            body.put("features", request.features);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("groupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupOwnerId)) {
            body.put("groupOwnerId", request.groupOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.icon)) {
            body.put("icon", request.icon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managementOptions)) {
            body.put("managementOptions", request.managementOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("templateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdList)) {
            body.put("userIdList", request.userIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("uuid", request.uuid);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSceneGroupConversation"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/sceneGroups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateSceneGroupConversationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建场景群会话</p>
     * 
     * @param request CreateSceneGroupConversationRequest
     * @return CreateSceneGroupConversationResponse
     */
    public CreateSceneGroupConversationResponse createSceneGroupConversation(CreateSceneGroupConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateSceneGroupConversationHeaders headers = new CreateSceneGroupConversationHeaders();
        return this.createSceneGroupConversationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建店铺群</p>
     * 
     * @param request CreateStoreGroupConversationRequest
     * @param headers CreateStoreGroupConversationHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStoreGroupConversationResponse
     */
    public CreateStoreGroupConversationResponse createStoreGroupConversationWithOptions(CreateStoreGroupConversationRequest request, CreateStoreGroupConversationHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appUserId)) {
            body.put("appUserId", request.appUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessUniqueKey)) {
            body.put("businessUniqueKey", request.businessUniqueKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupAvatar)) {
            body.put("groupAvatar", request.groupAvatar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("groupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupTemplateId)) {
            body.put("groupTemplateId", request.groupTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("operatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            body.put("userIds", request.userIds);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStoreGroupConversation"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/interconnections/storeGroups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateStoreGroupConversationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建店铺群</p>
     * 
     * @param request CreateStoreGroupConversationRequest
     * @return CreateStoreGroupConversationResponse
     */
    public CreateStoreGroupConversationResponse createStoreGroupConversation(CreateStoreGroupConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateStoreGroupConversationHeaders headers = new CreateStoreGroupConversationHeaders();
        return this.createStoreGroupConversationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除企业文字表情</p>
     * 
     * @param request DeleteOrgTextEmotionRequest
     * @param headers DeleteOrgTextEmotionHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOrgTextEmotionResponse
     */
    public DeleteOrgTextEmotionResponse deleteOrgTextEmotionWithOptions(DeleteOrgTextEmotionRequest request, DeleteOrgTextEmotionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deptId)) {
            body.put("deptId", request.deptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emotionIds)) {
            body.put("emotionIds", request.emotionIds);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOrgTextEmotion"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/organizations/textEmotions/remove"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteOrgTextEmotionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除企业文字表情</p>
     * 
     * @param request DeleteOrgTextEmotionRequest
     * @return DeleteOrgTextEmotionResponse
     */
    public DeleteOrgTextEmotionResponse deleteOrgTextEmotion(DeleteOrgTextEmotionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteOrgTextEmotionHeaders headers = new DeleteOrgTextEmotionHeaders();
        return this.deleteOrgTextEmotionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解散互通群</p>
     * 
     * @param request DismissGroupConversationRequest
     * @param headers DismissGroupConversationHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DismissGroupConversationResponse
     */
    public DismissGroupConversationResponse dismissGroupConversationWithOptions(DismissGroupConversationRequest request, DismissGroupConversationHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DismissGroupConversation"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/interconnections/groups/dismiss"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DismissGroupConversationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解散互通群</p>
     * 
     * @param request DismissGroupConversationRequest
     * @return DismissGroupConversationResponse
     */
    public DismissGroupConversationResponse dismissGroupConversation(DismissGroupConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DismissGroupConversationHeaders headers = new DismissGroupConversationHeaders();
        return this.dismissGroupConversationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建ToB会话地址</p>
     * 
     * @param request GetConversationUrlRequest
     * @param headers GetConversationUrlHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConversationUrlResponse
     */
    public GetConversationUrlResponse getConversationUrlWithOptions(GetConversationUrlRequest request, GetConversationUrlHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appUserId)) {
            body.put("appUserId", request.appUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelCode)) {
            body.put("channelCode", request.channelCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("deviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConversationUrl"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/conversations/urls"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetConversationUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建ToB会话地址</p>
     * 
     * @param request GetConversationUrlRequest
     * @return GetConversationUrlResponse
     */
    public GetConversationUrlResponse getConversationUrl(GetConversationUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetConversationUrlHeaders headers = new GetConversationUrlHeaders();
        return this.getConversationUrlWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户家校群消息(图片&amp;视频Z&amp;富文本)</p>
     * 
     * @param request GetFamilySchoolConversationMsgRequest
     * @param headers GetFamilySchoolConversationMsgHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFamilySchoolConversationMsgResponse
     */
    public GetFamilySchoolConversationMsgResponse getFamilySchoolConversationMsgWithOptions(GetFamilySchoolConversationMsgRequest request, GetFamilySchoolConversationMsgHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgTypes)) {
            body.put("msgTypes", request.msgTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unionId)) {
            body.put("unionId", request.unionId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFamilySchoolConversationMsg"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/conversations/familySchools/messages/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetFamilySchoolConversationMsgResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户家校群消息(图片&amp;视频Z&amp;富文本)</p>
     * 
     * @param request GetFamilySchoolConversationMsgRequest
     * @return GetFamilySchoolConversationMsgResponse
     */
    public GetFamilySchoolConversationMsgResponse getFamilySchoolConversationMsg(GetFamilySchoolConversationMsgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetFamilySchoolConversationMsgHeaders headers = new GetFamilySchoolConversationMsgHeaders();
        return this.getFamilySchoolConversationMsgWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户家校群</p>
     * 
     * @param request GetFamilySchoolConversationsRequest
     * @param headers GetFamilySchoolConversationsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFamilySchoolConversationsResponse
     */
    public GetFamilySchoolConversationsResponse getFamilySchoolConversationsWithOptions(GetFamilySchoolConversationsRequest request, GetFamilySchoolConversationsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unionId)) {
            body.put("unionId", request.unionId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFamilySchoolConversations"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/conversations/familySchools/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetFamilySchoolConversationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户家校群</p>
     * 
     * @param request GetFamilySchoolConversationsRequest
     * @return GetFamilySchoolConversationsResponse
     */
    public GetFamilySchoolConversationsResponse getFamilySchoolConversations(GetFamilySchoolConversationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetFamilySchoolConversationsHeaders headers = new GetFamilySchoolConversationsHeaders();
        return this.getFamilySchoolConversationsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询企业内部群成员</p>
     * 
     * @param request GetInnerGroupMembersRequest
     * @param headers GetInnerGroupMembersHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInnerGroupMembersResponse
     */
    public GetInnerGroupMembersResponse getInnerGroupMembersWithOptions(GetInnerGroupMembersRequest request, GetInnerGroupMembersHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInnerGroupMembers"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/innerGroups/members/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetInnerGroupMembersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询企业内部群成员</p>
     * 
     * @param request GetInnerGroupMembersRequest
     * @return GetInnerGroupMembersResponse
     */
    public GetInnerGroupMembersResponse getInnerGroupMembers(GetInnerGroupMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetInnerGroupMembersHeaders headers = new GetInnerGroupMembersHeaders();
        return this.getInnerGroupMembersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建客联互通会话地址</p>
     * 
     * @param request GetInterconnectionUrlRequest
     * @param headers GetInterconnectionUrlHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInterconnectionUrlResponse
     */
    public GetInterconnectionUrlResponse getInterconnectionUrlWithOptions(GetInterconnectionUrlRequest request, GetInterconnectionUrlHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appUserAvatar)) {
            body.put("appUserAvatar", request.appUserAvatar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appUserAvatarType)) {
            body.put("appUserAvatarType", request.appUserAvatarType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appUserId)) {
            body.put("appUserId", request.appUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appUserMobileNumber)) {
            body.put("appUserMobileNumber", request.appUserMobileNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appUserName)) {
            body.put("appUserName", request.appUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgPageType)) {
            body.put("msgPageType", request.msgPageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qrCode)) {
            body.put("qrCode", request.qrCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signature)) {
            body.put("signature", request.signature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCode)) {
            body.put("sourceCode", request.sourceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            body.put("sourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInterconnectionUrl"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/interconnections/sessions/urls"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetInterconnectionUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建客联互通会话地址</p>
     * 
     * @param request GetInterconnectionUrlRequest
     * @return GetInterconnectionUrlResponse
     */
    public GetInterconnectionUrlResponse getInterconnectionUrl(GetInterconnectionUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetInterconnectionUrlHeaders headers = new GetInterconnectionUrlHeaders();
        return this.getInterconnectionUrlWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询最近活跃的企业内部群列表</p>
     * 
     * @param request GetNewestInnerGroupsRequest
     * @param headers GetNewestInnerGroupsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNewestInnerGroupsResponse
     */
    public GetNewestInnerGroupsResponse getNewestInnerGroupsWithOptions(GetNewestInnerGroupsRequest request, GetNewestInnerGroupsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNewestInnerGroups"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/activities/innerGroups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetNewestInnerGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询最近活跃的企业内部群列表</p>
     * 
     * @param request GetNewestInnerGroupsRequest
     * @return GetNewestInnerGroupsResponse
     */
    public GetNewestInnerGroupsResponse getNewestInnerGroups(GetNewestInnerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetNewestInnerGroupsHeaders headers = new GetNewestInnerGroupsHeaders();
        return this.getNewestInnerGroupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询群简要信息</p>
     * 
     * @param request GetSceneGroupInfoRequest
     * @param headers GetSceneGroupInfoHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSceneGroupInfoResponse
     */
    public GetSceneGroupInfoResponse getSceneGroupInfoWithOptions(GetSceneGroupInfoRequest request, GetSceneGroupInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coolAppCode)) {
            body.put("coolAppCode", request.coolAppCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSceneGroupInfo"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/sceneGroups/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetSceneGroupInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询群简要信息</p>
     * 
     * @param request GetSceneGroupInfoRequest
     * @return GetSceneGroupInfoResponse
     */
    public GetSceneGroupInfoResponse getSceneGroupInfo(GetSceneGroupInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetSceneGroupInfoHeaders headers = new GetSceneGroupInfoHeaders();
        return this.getSceneGroupInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询群成员</p>
     * 
     * @param request GetSceneGroupMembersRequest
     * @param headers GetSceneGroupMembersHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSceneGroupMembersResponse
     */
    public GetSceneGroupMembersResponse getSceneGroupMembersWithOptions(GetSceneGroupMembersRequest request, GetSceneGroupMembersHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coolAppCode)) {
            body.put("coolAppCode", request.coolAppCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cursor)) {
            body.put("cursor", request.cursor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("size", request.size);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSceneGroupMembers"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/sceneGroups/members/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetSceneGroupMembersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询群成员</p>
     * 
     * @param request GetSceneGroupMembersRequest
     * @return GetSceneGroupMembersResponse
     */
    public GetSceneGroupMembersResponse getSceneGroupMembers(GetSceneGroupMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetSceneGroupMembersHeaders headers = new GetSceneGroupMembersHeaders();
        return this.getSceneGroupMembersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>群禁言</p>
     * 
     * @param request GroupBanWordsRequest
     * @param headers GroupBanWordsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GroupBanWordsResponse
     */
    public GroupBanWordsResponse groupBanWordsWithOptions(GroupBanWordsRequest request, GroupBanWordsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.banWordsMode)) {
            body.put("banWordsMode", request.banWordsMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("options", request.options);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GroupBanWords"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/groups/words/ban"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GroupBanWordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>群禁言</p>
     * 
     * @param request GroupBanWordsRequest
     * @return GroupBanWordsResponse
     */
    public GroupBanWordsResponse groupBanWords(GroupBanWordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GroupBanWordsHeaders headers = new GroupBanWordsHeaders();
        return this.groupBanWordsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>群容量扩容询价</p>
     * 
     * @param request GroupCapacityInquiryRequest
     * @param headers GroupCapacityInquiryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GroupCapacityInquiryResponse
     */
    public GroupCapacityInquiryResponse groupCapacityInquiryWithOptions(GroupCapacityInquiryRequest request, GroupCapacityInquiryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.effectiveDuration)) {
            body.put("effectiveDuration", request.effectiveDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            body.put("operator", request.operator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetCapacity)) {
            body.put("targetCapacity", request.targetCapacity);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GroupCapacityInquiry"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/groups/capacities/inquiries/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GroupCapacityInquiryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>群容量扩容询价</p>
     * 
     * @param request GroupCapacityInquiryRequest
     * @return GroupCapacityInquiryResponse
     */
    public GroupCapacityInquiryResponse groupCapacityInquiry(GroupCapacityInquiryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GroupCapacityInquiryHeaders headers = new GroupCapacityInquiryHeaders();
        return this.groupCapacityInquiryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>群容量扩容确认下单</p>
     * 
     * @param request GroupCapacityOrderConfirmRequest
     * @param headers GroupCapacityOrderConfirmHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GroupCapacityOrderConfirmResponse
     */
    public GroupCapacityOrderConfirmResponse groupCapacityOrderConfirmWithOptions(GroupCapacityOrderConfirmRequest request, GroupCapacityOrderConfirmHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            body.put("operator", request.operator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("orderId", request.orderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GroupCapacityOrderConfirm"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/groups/capacities/orders/confirm"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GroupCapacityOrderConfirmResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>群容量扩容确认下单</p>
     * 
     * @param request GroupCapacityOrderConfirmRequest
     * @return GroupCapacityOrderConfirmResponse
     */
    public GroupCapacityOrderConfirmResponse groupCapacityOrderConfirm(GroupCapacityOrderConfirmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GroupCapacityOrderConfirmHeaders headers = new GroupCapacityOrderConfirmHeaders();
        return this.groupCapacityOrderConfirmWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>群容量请求扩容下单</p>
     * 
     * @param request GroupCapacityOrderPlaceRequest
     * @param headers GroupCapacityOrderPlaceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GroupCapacityOrderPlaceResponse
     */
    public GroupCapacityOrderPlaceResponse groupCapacityOrderPlaceWithOptions(GroupCapacityOrderPlaceRequest request, GroupCapacityOrderPlaceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actualPrice)) {
            body.put("actualPrice", request.actualPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentCapacity)) {
            body.put("currentCapacity", request.currentCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentEffectUntil)) {
            body.put("currentEffectUntil", request.currentEffectUntil);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.discount)) {
            body.put("discount", request.discount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            body.put("extInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.markedPrice)) {
            body.put("markedPrice", request.markedPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            body.put("operator", request.operator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetCapacity)) {
            body.put("targetCapacity", request.targetCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetEffectUntil)) {
            body.put("targetEffectUntil", request.targetEffectUntil);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("token", request.token);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GroupCapacityOrderPlace"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/groups/capacities/orders/place"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GroupCapacityOrderPlaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>群容量请求扩容下单</p>
     * 
     * @param request GroupCapacityOrderPlaceRequest
     * @return GroupCapacityOrderPlaceResponse
     */
    public GroupCapacityOrderPlaceResponse groupCapacityOrderPlace(GroupCapacityOrderPlaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GroupCapacityOrderPlaceHeaders headers = new GroupCapacityOrderPlaceHeaders();
        return this.groupCapacityOrderPlaceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据群链接、群号等检索条件，查询群信息</p>
     * 
     * @param request GroupManageQueryRequest
     * @param headers GroupManageQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GroupManageQueryResponse
     */
    public GroupManageQueryResponse groupManageQueryWithOptions(GroupManageQueryRequest request, GroupManageQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createdAfter)) {
            body.put("createdAfter", request.createdAfter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("groupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupMemberSamples)) {
            body.put("groupMemberSamples", request.groupMemberSamples);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupOwner)) {
            body.put("groupOwner", request.groupOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupTitleKeywords)) {
            body.put("groupTitleKeywords", request.groupTitleKeywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupUrl)) {
            body.put("groupUrl", request.groupUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.membersOver)) {
            body.put("membersOver", request.membersOver);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GroupManageQuery"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/groups/managements/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GroupManageQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据群链接、群号等检索条件，查询群信息</p>
     * 
     * @param request GroupManageQueryRequest
     * @return GroupManageQueryResponse
     */
    public GroupManageQueryResponse groupManageQuery(GroupManageQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GroupManageQueryHeaders headers = new GroupManageQueryHeaders();
        return this.groupManageQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>群管理缩容</p>
     * 
     * @param request GroupManageReduceRequest
     * @param headers GroupManageReduceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GroupManageReduceResponse
     */
    public GroupManageReduceResponse groupManageReduceWithOptions(GroupManageReduceRequest request, GroupManageReduceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.capacityLimit)) {
            body.put("capacityLimit", request.capacityLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("options", request.options);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GroupManageReduce"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/groups/capacities/reduce"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GroupManageReduceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>群管理缩容</p>
     * 
     * @param request GroupManageReduceRequest
     * @return GroupManageReduceResponse
     */
    public GroupManageReduceResponse groupManageReduce(GroupManageReduceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GroupManageReduceHeaders headers = new GroupManageReduceHeaders();
        return this.groupManageReduceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>安装机器人到组织</p>
     * 
     * @param request InstallRobotToOrgRequest
     * @param headers InstallRobotToOrgHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallRobotToOrgResponse
     */
    public InstallRobotToOrgResponse installRobotToOrgWithOptions(InstallRobotToOrgRequest request, InstallRobotToOrgHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.brief)) {
            body.put("brief", request.brief);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.icon)) {
            body.put("icon", request.icon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outgoingToken)) {
            body.put("outgoingToken", request.outgoingToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outgoingUrl)) {
            body.put("outgoingUrl", request.outgoingUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previewMediaId)) {
            body.put("previewMediaId", request.previewMediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("robotCode", request.robotCode);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallRobotToOrg"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/organizations/robots/install"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new InstallRobotToOrgResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>安装机器人到组织</p>
     * 
     * @param request InstallRobotToOrgRequest
     * @return InstallRobotToOrgResponse
     */
    public InstallRobotToOrgResponse installRobotToOrg(InstallRobotToOrgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InstallRobotToOrgHeaders headers = new InstallRobotToOrgHeaders();
        return this.installRobotToOrgWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建可交互式实例</p>
     * 
     * @param request InteractiveCardCreateInstanceRequest
     * @param headers InteractiveCardCreateInstanceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return InteractiveCardCreateInstanceResponse
     */
    public InteractiveCardCreateInstanceResponse interactiveCardCreateInstanceWithOptions(InteractiveCardCreateInstanceRequest request, InteractiveCardCreateInstanceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callbackRouteKey)) {
            body.put("callbackRouteKey", request.callbackRouteKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardData)) {
            body.put("cardData", request.cardData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardTemplateId)) {
            body.put("cardTemplateId", request.cardTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatBotId)) {
            body.put("chatBotId", request.chatBotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationType)) {
            body.put("conversationType", request.conversationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTrackId)) {
            body.put("outTrackId", request.outTrackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateData)) {
            body.put("privateData", request.privateData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pullStrategy)) {
            body.put("pullStrategy", request.pullStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverUserIdList)) {
            body.put("receiverUserIdList", request.receiverUserIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("robotCode", request.robotCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdType)) {
            body.put("userIdType", request.userIdType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InteractiveCardCreateInstance"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/interactiveCards/instances"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new InteractiveCardCreateInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建可交互式实例</p>
     * 
     * @param request InteractiveCardCreateInstanceRequest
     * @return InteractiveCardCreateInstanceResponse
     */
    public InteractiveCardCreateInstanceResponse interactiveCardCreateInstance(InteractiveCardCreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InteractiveCardCreateInstanceHeaders headers = new InteractiveCardCreateInstanceHeaders();
        return this.interactiveCardCreateInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>拉取企业的所有文字表情，包含正常使用的、已经删除了的、安全审核不通过的文字表情</p>
     * 
     * @param headers ListOrgTextEmotionHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOrgTextEmotionResponse
     */
    public ListOrgTextEmotionResponse listOrgTextEmotionWithOptions(ListOrgTextEmotionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListOrgTextEmotion"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/organizations/textEmotions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListOrgTextEmotionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>拉取企业的所有文字表情，包含正常使用的、已经删除了的、安全审核不通过的文字表情</p>
     * @return ListOrgTextEmotionResponse
     */
    public ListOrgTextEmotionResponse listOrgTextEmotion() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListOrgTextEmotionHeaders headers = new ListOrgTextEmotionHeaders();
        return this.listOrgTextEmotionWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开放场景群新增群角色</p>
     * 
     * @param request OpenGroupRoleAddRequest
     * @param headers OpenGroupRoleAddHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenGroupRoleAddResponse
     */
    public OpenGroupRoleAddResponse openGroupRoleAddWithOptions(OpenGroupRoleAddRequest request, OpenGroupRoleAddHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("roleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenGroupRoleAdd"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/groups/roles"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new OpenGroupRoleAddResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开放场景群新增群角色</p>
     * 
     * @param request OpenGroupRoleAddRequest
     * @return OpenGroupRoleAddResponse
     */
    public OpenGroupRoleAddResponse openGroupRoleAdd(OpenGroupRoleAddRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        OpenGroupRoleAddHeaders headers = new OpenGroupRoleAddHeaders();
        return this.openGroupRoleAddWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开放场景群群角色查询</p>
     * 
     * @param request OpenGroupRoleQueryRequest
     * @param headers OpenGroupRoleQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenGroupRoleQueryResponse
     */
    public OpenGroupRoleQueryResponse openGroupRoleQueryWithOptions(OpenGroupRoleQueryRequest request, OpenGroupRoleQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenGroupRoleQuery"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/groups/roles/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new OpenGroupRoleQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开放场景群群角色查询</p>
     * 
     * @param request OpenGroupRoleQueryRequest
     * @return OpenGroupRoleQueryResponse
     */
    public OpenGroupRoleQueryResponse openGroupRoleQuery(OpenGroupRoleQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        OpenGroupRoleQueryHeaders headers = new OpenGroupRoleQueryHeaders();
        return this.openGroupRoleQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开放场景群群角色移除</p>
     * 
     * @param request OpenGroupRoleRemoveRequest
     * @param headers OpenGroupRoleRemoveHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenGroupRoleRemoveResponse
     */
    public OpenGroupRoleRemoveResponse openGroupRoleRemoveWithOptions(OpenGroupRoleRemoveRequest request, OpenGroupRoleRemoveHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openRoleId)) {
            body.put("openRoleId", request.openRoleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenGroupRoleRemove"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/groups/roles/remove"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new OpenGroupRoleRemoveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开放场景群群角色移除</p>
     * 
     * @param request OpenGroupRoleRemoveRequest
     * @return OpenGroupRoleRemoveResponse
     */
    public OpenGroupRoleRemoveResponse openGroupRoleRemove(OpenGroupRoleRemoveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        OpenGroupRoleRemoveHeaders headers = new OpenGroupRoleRemoveHeaders();
        return this.openGroupRoleRemoveWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开放场景群群角色变更</p>
     * 
     * @param request OpenGroupRoleUpdateRequest
     * @param headers OpenGroupRoleUpdateHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenGroupRoleUpdateResponse
     */
    public OpenGroupRoleUpdateResponse openGroupRoleUpdateWithOptions(OpenGroupRoleUpdateRequest request, OpenGroupRoleUpdateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openRoleId)) {
            body.put("openRoleId", request.openRoleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("roleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenGroupRoleUpdate"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/groups/roles"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new OpenGroupRoleUpdateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开放场景群群角色变更</p>
     * 
     * @param request OpenGroupRoleUpdateRequest
     * @return OpenGroupRoleUpdateResponse
     */
    public OpenGroupRoleUpdateResponse openGroupRoleUpdate(OpenGroupRoleUpdateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        OpenGroupRoleUpdateHeaders headers = new OpenGroupRoleUpdateHeaders();
        return this.openGroupRoleUpdateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开放场景群群成员的群角色信息查询</p>
     * 
     * @param request OpenGroupUserRoleQueryRequest
     * @param headers OpenGroupUserRoleQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenGroupUserRoleQueryResponse
     */
    public OpenGroupUserRoleQueryResponse openGroupUserRoleQueryWithOptions(OpenGroupUserRoleQueryRequest request, OpenGroupUserRoleQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.viewedUserId)) {
            body.put("viewedUserId", request.viewedUserId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenGroupUserRoleQuery"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/groups/users/roles/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new OpenGroupUserRoleQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开放场景群群成员的群角色信息查询</p>
     * 
     * @param request OpenGroupUserRoleQueryRequest
     * @return OpenGroupUserRoleQueryResponse
     */
    public OpenGroupUserRoleQueryResponse openGroupUserRoleQuery(OpenGroupUserRoleQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        OpenGroupUserRoleQueryHeaders headers = new OpenGroupUserRoleQueryHeaders();
        return this.openGroupUserRoleQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>内部群转部门群</p>
     * 
     * @param request OpenInnerGroupTransferToDeptGroupRequest
     * @param headers OpenInnerGroupTransferToDeptGroupHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenInnerGroupTransferToDeptGroupResponse
     */
    public OpenInnerGroupTransferToDeptGroupResponse openInnerGroupTransferToDeptGroupWithOptions(OpenInnerGroupTransferToDeptGroupRequest request, OpenInnerGroupTransferToDeptGroupHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deptId)) {
            body.put("deptId", request.deptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenInnerGroupTransferToDeptGroup"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/innerGroups/transferToDeptGroups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new OpenInnerGroupTransferToDeptGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>内部群转部门群</p>
     * 
     * @param request OpenInnerGroupTransferToDeptGroupRequest
     * @return OpenInnerGroupTransferToDeptGroupResponse
     */
    public OpenInnerGroupTransferToDeptGroupResponse openInnerGroupTransferToDeptGroup(OpenInnerGroupTransferToDeptGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        OpenInnerGroupTransferToDeptGroupHeaders headers = new OpenInnerGroupTransferToDeptGroupHeaders();
        return this.openInnerGroupTransferToDeptGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>群搜索</p>
     * 
     * @param request OpenSearchGroupListRequest
     * @param headers OpenSearchGroupListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenSearchGroupListResponse
     */
    public OpenSearchGroupListResponse openSearchGroupListWithOptions(OpenSearchGroupListRequest request, OpenSearchGroupListHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenSearchGroupList"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/groups/search"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new OpenSearchGroupListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>群搜索</p>
     * 
     * @param request OpenSearchGroupListRequest
     * @return OpenSearchGroupListResponse
     */
    public OpenSearchGroupListResponse openSearchGroupList(OpenSearchGroupListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        OpenSearchGroupListHeaders headers = new OpenSearchGroupListHeaders();
        return this.openSearchGroupListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>以个人身份发送卡片消息</p>
     * 
     * @param request OpenUserSendCardMessageRequest
     * @param headers OpenUserSendCardMessageHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenUserSendCardMessageResponse
     */
    public OpenUserSendCardMessageResponse openUserSendCardMessageWithOptions(OpenUserSendCardMessageRequest request, OpenUserSendCardMessageHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cardContent)) {
            body.put("cardContent", request.cardContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiveUserId)) {
            body.put("receiveUserId", request.receiveUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenUserSendCardMessage"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/cardMessages/users/send"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new OpenUserSendCardMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>以个人身份发送卡片消息</p>
     * 
     * @param request OpenUserSendCardMessageRequest
     * @return OpenUserSendCardMessageResponse
     */
    public OpenUserSendCardMessageResponse openUserSendCardMessage(OpenUserSendCardMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        OpenUserSendCardMessageHeaders headers = new OpenUserSendCardMessageHeaders();
        return this.openUserSendCardMessageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>成员授权场景下查询群信息</p>
     * 
     * @param request QueryGroupInfoByMemberAuthRequest
     * @param headers QueryGroupInfoByMemberAuthHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryGroupInfoByMemberAuthResponse
     */
    public QueryGroupInfoByMemberAuthResponse queryGroupInfoByMemberAuthWithOptions(QueryGroupInfoByMemberAuthRequest request, QueryGroupInfoByMemberAuthHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coolAppCode)) {
            body.put("coolAppCode", request.coolAppCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryGroupInfoByMemberAuth"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/memberAuthorizations/groups/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new QueryGroupInfoByMemberAuthResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>成员授权场景下查询群信息</p>
     * 
     * @param request QueryGroupInfoByMemberAuthRequest
     * @return QueryGroupInfoByMemberAuthResponse
     */
    public QueryGroupInfoByMemberAuthResponse queryGroupInfoByMemberAuth(QueryGroupInfoByMemberAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryGroupInfoByMemberAuthHeaders headers = new QueryGroupInfoByMemberAuthHeaders();
        return this.queryGroupInfoByMemberAuthWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询群成员列表</p>
     * 
     * @param request QueryGroupMemberRequest
     * @param headers QueryGroupMemberHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryGroupMemberResponse
     */
    public QueryGroupMemberResponse queryGroupMemberWithOptions(QueryGroupMemberRequest request, QueryGroupMemberHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            query.put("openConversationId", request.openConversationId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryGroupMember"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/interconnections/conversations/members"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new QueryGroupMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询群成员列表</p>
     * 
     * @param request QueryGroupMemberRequest
     * @return QueryGroupMemberResponse
     */
    public QueryGroupMemberResponse queryGroupMember(QueryGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryGroupMemberHeaders headers = new QueryGroupMemberHeaders();
        return this.queryGroupMemberWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>成员授权场景下查询群成员</p>
     * 
     * @param request QueryGroupMemberByMemberAuthRequest
     * @param headers QueryGroupMemberByMemberAuthHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryGroupMemberByMemberAuthResponse
     */
    public QueryGroupMemberByMemberAuthResponse queryGroupMemberByMemberAuthWithOptions(QueryGroupMemberByMemberAuthRequest request, QueryGroupMemberByMemberAuthHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coolAppCode)) {
            body.put("coolAppCode", request.coolAppCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryGroupMemberByMemberAuth"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/memberAuthorizations/groups/members/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new QueryGroupMemberByMemberAuthResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>成员授权场景下查询群成员</p>
     * 
     * @param request QueryGroupMemberByMemberAuthRequest
     * @return QueryGroupMemberByMemberAuthResponse
     */
    public QueryGroupMemberByMemberAuthResponse queryGroupMemberByMemberAuth(QueryGroupMemberByMemberAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryGroupMemberByMemberAuthHeaders headers = new QueryGroupMemberByMemberAuthHeaders();
        return this.queryGroupMemberByMemberAuthWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询群禁言状态</p>
     * 
     * @param request QueryGroupMuteStatusRequest
     * @param headers QueryGroupMuteStatusHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryGroupMuteStatusResponse
     */
    public QueryGroupMuteStatusResponse queryGroupMuteStatusWithOptions(QueryGroupMuteStatusRequest request, QueryGroupMuteStatusHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            query.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryGroupMuteStatus"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/sceneGroups/muteSettings"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new QueryGroupMuteStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询群禁言状态</p>
     * 
     * @param request QueryGroupMuteStatusRequest
     * @return QueryGroupMuteStatusResponse
     */
    public QueryGroupMuteStatusResponse queryGroupMuteStatus(QueryGroupMuteStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryGroupMuteStatusHeaders headers = new QueryGroupMuteStatusHeaders();
        return this.queryGroupMuteStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>读取群成员列表</p>
     * 
     * @param request QueryInnerGroupMemberListRequest
     * @param headers QueryInnerGroupMemberListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryInnerGroupMemberListResponse
     */
    public QueryInnerGroupMemberListResponse queryInnerGroupMemberListWithOptions(QueryInnerGroupMemberListRequest request, QueryInnerGroupMemberListHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryInnerGroupMemberList"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/innerGroups/memberLists/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new QueryInnerGroupMemberListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>读取群成员列表</p>
     * 
     * @param request QueryInnerGroupMemberListRequest
     * @return QueryInnerGroupMemberListResponse
     */
    public QueryInnerGroupMemberListResponse queryInnerGroupMemberList(QueryInnerGroupMemberListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryInnerGroupMemberListHeaders headers = new QueryInnerGroupMemberListHeaders();
        return this.queryInnerGroupMemberListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询最近活跃的企业内部群列表</p>
     * 
     * @param request QueryInnerGroupRecentListRequest
     * @param headers QueryInnerGroupRecentListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryInnerGroupRecentListResponse
     */
    public QueryInnerGroupRecentListResponse queryInnerGroupRecentListWithOptions(QueryInnerGroupRecentListRequest request, QueryInnerGroupRecentListHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryInnerGroupRecentList"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/innerGroups/recentLists"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new QueryInnerGroupRecentListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询最近活跃的企业内部群列表</p>
     * 
     * @param request QueryInnerGroupRecentListRequest
     * @return QueryInnerGroupRecentListResponse
     */
    public QueryInnerGroupRecentListResponse queryInnerGroupRecentList(QueryInnerGroupRecentListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryInnerGroupRecentListHeaders headers = new QueryInnerGroupRecentListHeaders();
        return this.queryInnerGroupRecentListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询群内具有指定群角色的所有群成员</p>
     * 
     * @param request QueryMembersOfGroupRoleRequest
     * @param headers QueryMembersOfGroupRoleHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMembersOfGroupRoleResponse
     */
    public QueryMembersOfGroupRoleResponse queryMembersOfGroupRoleWithOptions(QueryMembersOfGroupRoleRequest request, QueryMembersOfGroupRoleHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openRoleId)) {
            body.put("openRoleId", request.openRoleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timestamp)) {
            body.put("timestamp", request.timestamp);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMembersOfGroupRole"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/sceneGroups/roles/members/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new QueryMembersOfGroupRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询群内具有指定群角色的所有群成员</p>
     * 
     * @param request QueryMembersOfGroupRoleRequest
     * @return QueryMembersOfGroupRoleResponse
     */
    public QueryMembersOfGroupRoleResponse queryMembersOfGroupRole(QueryMembersOfGroupRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryMembersOfGroupRoleHeaders headers = new QueryMembersOfGroupRoleHeaders();
        return this.queryMembersOfGroupRoleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据单聊会话及发送方获取接收方用户信息</p>
     * 
     * @param request QueryOpenConversationReceiveUserRequest
     * @param headers QueryOpenConversationReceiveUserHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOpenConversationReceiveUserResponse
     */
    public QueryOpenConversationReceiveUserResponse queryOpenConversationReceiveUserWithOptions(QueryOpenConversationReceiveUserRequest request, QueryOpenConversationReceiveUserHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendUserId)) {
            body.put("sendUserId", request.sendUserId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOpenConversationReceiveUser"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/otoChat/receiveUsers/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new QueryOpenConversationReceiveUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据单聊会话及发送方获取接收方用户信息</p>
     * 
     * @param request QueryOpenConversationReceiveUserRequest
     * @return QueryOpenConversationReceiveUserResponse
     */
    public QueryOpenConversationReceiveUserResponse queryOpenConversationReceiveUser(QueryOpenConversationReceiveUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryOpenConversationReceiveUserHeaders headers = new QueryOpenConversationReceiveUserHeaders();
        return this.queryOpenConversationReceiveUserWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取群基础信息</p>
     * 
     * @param request QueryOpenGroupBaseInfoRequest
     * @param headers QueryOpenGroupBaseInfoHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOpenGroupBaseInfoResponse
     */
    public QueryOpenGroupBaseInfoResponse queryOpenGroupBaseInfoWithOptions(QueryOpenGroupBaseInfoRequest request, QueryOpenGroupBaseInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOpenGroupBaseInfo"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/groups/baseInfos/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new QueryOpenGroupBaseInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取群基础信息</p>
     * 
     * @param request QueryOpenGroupBaseInfoRequest
     * @return QueryOpenGroupBaseInfoResponse
     */
    public QueryOpenGroupBaseInfoResponse queryOpenGroupBaseInfo(QueryOpenGroupBaseInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryOpenGroupBaseInfoHeaders headers = new QueryOpenGroupBaseInfoHeaders();
        return this.queryOpenGroupBaseInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取最近联系人及群组</p>
     * 
     * @param request QueryRecentConversationsRequest
     * @param headers QueryRecentConversationsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRecentConversationsResponse
     */
    public QueryRecentConversationsResponse queryRecentConversationsWithOptions(QueryRecentConversationsRequest request, QueryRecentConversationsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.onlyHuman)) {
            body.put("onlyHuman", request.onlyHuman);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlyInnerGroup)) {
            body.put("onlyInnerGroup", request.onlyInnerGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRecentConversations"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/conversations/recentLists/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new QueryRecentConversationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取最近联系人及群组</p>
     * 
     * @param request QueryRecentConversationsRequest
     * @return QueryRecentConversationsResponse
     */
    public QueryRecentConversationsResponse queryRecentConversations(QueryRecentConversationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryRecentConversationsHeaders headers = new QueryRecentConversationsHeaders();
        return this.queryRecentConversationsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询群内群模板机器人</p>
     * 
     * @param request QuerySceneGroupTemplateRobotRequest
     * @param headers QuerySceneGroupTemplateRobotHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySceneGroupTemplateRobotResponse
     */
    public QuerySceneGroupTemplateRobotResponse querySceneGroupTemplateRobotWithOptions(QuerySceneGroupTemplateRobotRequest request, QuerySceneGroupTemplateRobotHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            query.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            query.put("robotCode", request.robotCode);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySceneGroupTemplateRobot"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/sceneGroups/templates/robots"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new QuerySceneGroupTemplateRobotResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询群内群模板机器人</p>
     * 
     * @param request QuerySceneGroupTemplateRobotRequest
     * @return QuerySceneGroupTemplateRobotResponse
     */
    public QuerySceneGroupTemplateRobotResponse querySceneGroupTemplateRobot(QuerySceneGroupTemplateRobotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QuerySceneGroupTemplateRobotHeaders headers = new QuerySceneGroupTemplateRobotHeaders();
        return this.querySceneGroupTemplateRobotWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询群信息</p>
     * 
     * @param request QuerySingleGroupRequest
     * @param headers QuerySingleGroupHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySingleGroupResponse
     */
    public QuerySingleGroupResponse querySingleGroupWithOptions(QuerySingleGroupRequest request, QuerySingleGroupHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupMembers)) {
            body.put("groupMembers", request.groupMembers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupTemplateId)) {
            body.put("groupTemplateId", request.groupTemplateId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySingleGroup"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/interconnections/doubleGroups/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new QuerySingleGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询群信息</p>
     * 
     * @param request QuerySingleGroupRequest
     * @return QuerySingleGroupResponse
     */
    public QuerySingleGroupResponse querySingleGroup(QuerySingleGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QuerySingleGroupHeaders headers = new QuerySingleGroupHeaders();
        return this.querySingleGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询未读消息数</p>
     * 
     * @param request QueryUnReadMessageRequest
     * @param headers QueryUnReadMessageHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUnReadMessageResponse
     */
    public QueryUnReadMessageResponse queryUnReadMessageWithOptions(QueryUnReadMessageRequest request, QueryUnReadMessageHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appUserId)) {
            body.put("appUserId", request.appUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationIds)) {
            body.put("openConversationIds", request.openConversationIds);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUnReadMessage"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/interconnections/unReadMsgs/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new QueryUnReadMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询未读消息数</p>
     * 
     * @param request QueryUnReadMessageRequest
     * @return QueryUnReadMessageResponse
     */
    public QueryUnReadMessageResponse queryUnReadMessage(QueryUnReadMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryUnReadMessageHeaders headers = new QueryUnReadMessageHeaders();
        return this.queryUnReadMessageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>移除会话机器人</p>
     * 
     * @param request RemoveRobotFromConversationRequest
     * @param headers RemoveRobotFromConversationHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveRobotFromConversationResponse
     */
    public RemoveRobotFromConversationResponse removeRobotFromConversationWithOptions(RemoveRobotFromConversationRequest request, RemoveRobotFromConversationHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chatBotUserId)) {
            body.put("chatBotUserId", request.chatBotUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveRobotFromConversation"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/conversations/robots/remove"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new RemoveRobotFromConversationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>移除会话机器人</p>
     * 
     * @param request RemoveRobotFromConversationRequest
     * @return RemoveRobotFromConversationResponse
     */
    public RemoveRobotFromConversationResponse removeRobotFromConversation(RemoveRobotFromConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RemoveRobotFromConversationHeaders headers = new RemoveRobotFromConversationHeaders();
        return this.removeRobotFromConversationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据关键词搜索企业内部群</p>
     * 
     * @param request SearchInnerGroupsRequest
     * @param headers SearchInnerGroupsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchInnerGroupsResponse
     */
    public SearchInnerGroupsResponse searchInnerGroupsWithOptions(SearchInnerGroupsRequest request, SearchInnerGroupsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            body.put("searchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchInnerGroups"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/innerGroups/search"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new SearchInnerGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据关键词搜索企业内部群</p>
     * 
     * @param request SearchInnerGroupsRequest
     * @return SearchInnerGroupsResponse
     */
    public SearchInnerGroupsResponse searchInnerGroups(SearchInnerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SearchInnerGroupsHeaders headers = new SearchInnerGroupsHeaders();
        return this.searchInnerGroupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发送可交互式动态卡片</p>
     * 
     * @param request SendInteractiveCardRequest
     * @param headers SendInteractiveCardHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendInteractiveCardResponse
     */
    public SendInteractiveCardResponse sendInteractiveCardWithOptions(SendInteractiveCardRequest request, SendInteractiveCardHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.atOpenIds)) {
            body.put("atOpenIds", request.atOpenIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackRouteKey)) {
            body.put("callbackRouteKey", request.callbackRouteKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardData)) {
            body.put("cardData", request.cardData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardOptions)) {
            body.put("cardOptions", request.cardOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardTemplateId)) {
            body.put("cardTemplateId", request.cardTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatBotId)) {
            body.put("chatBotId", request.chatBotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationType)) {
            body.put("conversationType", request.conversationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digitalWorkerCode)) {
            body.put("digitalWorkerCode", request.digitalWorkerCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTrackId)) {
            body.put("outTrackId", request.outTrackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateData)) {
            body.put("privateData", request.privateData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pullStrategy)) {
            body.put("pullStrategy", request.pullStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverUserIdList)) {
            body.put("receiverUserIdList", request.receiverUserIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("robotCode", request.robotCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdType)) {
            body.put("userIdType", request.userIdType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendInteractiveCard"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/interactiveCards/send"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new SendInteractiveCardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发送可交互式动态卡片</p>
     * 
     * @param request SendInteractiveCardRequest
     * @return SendInteractiveCardResponse
     */
    public SendInteractiveCardResponse sendInteractiveCard(SendInteractiveCardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SendInteractiveCardHeaders headers = new SendInteractiveCardHeaders();
        return this.sendInteractiveCardWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>人与人单聊发送可交互式动态卡片</p>
     * 
     * @param request SendOTOInteractiveCardRequest
     * @param headers SendOTOInteractiveCardHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendOTOInteractiveCardResponse
     */
    public SendOTOInteractiveCardResponse sendOTOInteractiveCardWithOptions(SendOTOInteractiveCardRequest request, SendOTOInteractiveCardHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.atOpenIds)) {
            body.put("atOpenIds", request.atOpenIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackRouteKey)) {
            body.put("callbackRouteKey", request.callbackRouteKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardData)) {
            body.put("cardData", request.cardData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardOptions)) {
            body.put("cardOptions", request.cardOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardTemplateId)) {
            body.put("cardTemplateId", request.cardTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTrackId)) {
            body.put("outTrackId", request.outTrackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateData)) {
            body.put("privateData", request.privateData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pullStrategy)) {
            body.put("pullStrategy", request.pullStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverUserIdList)) {
            body.put("receiverUserIdList", request.receiverUserIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("robotCode", request.robotCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdType)) {
            body.put("userIdType", request.userIdType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendOTOInteractiveCard"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/privateChat/interactiveCards/send"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new SendOTOInteractiveCardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>人与人单聊发送可交互式动态卡片</p>
     * 
     * @param request SendOTOInteractiveCardRequest
     * @return SendOTOInteractiveCardResponse
     */
    public SendOTOInteractiveCardResponse sendOTOInteractiveCard(SendOTOInteractiveCardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SendOTOInteractiveCardHeaders headers = new SendOTOInteractiveCardHeaders();
        return this.sendOTOInteractiveCardWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机器人发送互动卡片（普通版）</p>
     * 
     * @param request SendRobotInteractiveCardRequest
     * @param headers SendRobotInteractiveCardHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendRobotInteractiveCardResponse
     */
    public SendRobotInteractiveCardResponse sendRobotInteractiveCardWithOptions(SendRobotInteractiveCardRequest request, SendRobotInteractiveCardHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callbackUrl)) {
            body.put("callbackUrl", request.callbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardBizId)) {
            body.put("cardBizId", request.cardBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardData)) {
            body.put("cardData", request.cardData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardTemplateId)) {
            body.put("cardTemplateId", request.cardTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pullStrategy)) {
            body.put("pullStrategy", request.pullStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("robotCode", request.robotCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendOptions)) {
            body.put("sendOptions", request.sendOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.singleChatReceiver)) {
            body.put("singleChatReceiver", request.singleChatReceiver);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unionIdPrivateDataMap)) {
            body.put("unionIdPrivateDataMap", request.unionIdPrivateDataMap);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdPrivateDataMap)) {
            body.put("userIdPrivateDataMap", request.userIdPrivateDataMap);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendRobotInteractiveCard"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/v1.0/robot/interactiveCards/send"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new SendRobotInteractiveCardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>机器人发送互动卡片（普通版）</p>
     * 
     * @param request SendRobotInteractiveCardRequest
     * @return SendRobotInteractiveCardResponse
     */
    public SendRobotInteractiveCardResponse sendRobotInteractiveCard(SendRobotInteractiveCardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SendRobotInteractiveCardHeaders headers = new SendRobotInteractiveCardHeaders();
        return this.sendRobotInteractiveCardWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机器人发送消息</p>
     * 
     * @param request SendRobotMessageRequest
     * @param headers SendRobotMessageHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendRobotMessageResponse
     */
    public SendRobotMessageResponse sendRobotMessageWithOptions(SendRobotMessageRequest request, SendRobotMessageHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.atAll)) {
            body.put("atAll", request.atAll);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.atAppUserId)) {
            body.put("atAppUserId", request.atAppUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.atDingUserId)) {
            body.put("atDingUserId", request.atDingUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgContent)) {
            body.put("msgContent", request.msgContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgType)) {
            body.put("msgType", request.msgType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationIds)) {
            body.put("openConversationIds", request.openConversationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("robotCode", request.robotCode);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendRobotMessage"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/interconnections/robotMessages/send"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new SendRobotMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>机器人发送消息</p>
     * 
     * @param request SendRobotMessageRequest
     * @return SendRobotMessageResponse
     */
    public SendRobotMessageResponse sendRobotMessage(SendRobotMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SendRobotMessageHeaders headers = new SendRobotMessageHeaders();
        return this.sendRobotMessageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发送模板响应式可交互式卡片</p>
     * 
     * @param request SendTemplateInteractiveCardRequest
     * @param headers SendTemplateInteractiveCardHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendTemplateInteractiveCardResponse
     */
    public SendTemplateInteractiveCardResponse sendTemplateInteractiveCardWithOptions(SendTemplateInteractiveCardRequest request, SendTemplateInteractiveCardHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callbackUrl)) {
            body.put("callbackUrl", request.callbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardData)) {
            body.put("cardData", request.cardData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardTemplateId)) {
            body.put("cardTemplateId", request.cardTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTrackId)) {
            body.put("outTrackId", request.outTrackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("robotCode", request.robotCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendOptions)) {
            body.put("sendOptions", request.sendOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.singleChatReceiver)) {
            body.put("singleChatReceiver", request.singleChatReceiver);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendTemplateInteractiveCard"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/interactiveCards/templates/send"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new SendTemplateInteractiveCardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发送模板响应式可交互式卡片</p>
     * 
     * @param request SendTemplateInteractiveCardRequest
     * @return SendTemplateInteractiveCardResponse
     */
    public SendTemplateInteractiveCardResponse sendTemplateInteractiveCard(SendTemplateInteractiveCardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SendTemplateInteractiveCardHeaders headers = new SendTemplateInteractiveCardHeaders();
        return this.sendTemplateInteractiveCardWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置侧边栏</p>
     * 
     * @param request SetRightPanelRequest
     * @param headers SetRightPanelHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetRightPanelResponse
     */
    public SetRightPanelResponse setRightPanelWithOptions(SetRightPanelRequest request, SetRightPanelHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rightPanelClosePermitted)) {
            body.put("rightPanelClosePermitted", request.rightPanelClosePermitted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rightPanelOpenStatus)) {
            body.put("rightPanelOpenStatus", request.rightPanelOpenStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webWndParams)) {
            body.put("webWndParams", request.webWndParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.width)) {
            body.put("width", request.width);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetRightPanel"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/rightPanels/set"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new SetRightPanelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置侧边栏</p>
     * 
     * @param request SetRightPanelRequest
     * @return SetRightPanelResponse
     */
    public SetRightPanelResponse setRightPanel(SetRightPanelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SetRightPanelHeaders headers = new SetRightPanelHeaders();
        return this.setRightPanelWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>钉钉吊顶卡片关闭</p>
     * 
     * @param request TopboxCloseRequest
     * @param headers TopboxCloseHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TopboxCloseResponse
     */
    public TopboxCloseResponse topboxCloseWithOptions(TopboxCloseRequest request, TopboxCloseHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversationType)) {
            body.put("conversationType", request.conversationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coolAppCode)) {
            body.put("coolAppCode", request.coolAppCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTrackId)) {
            body.put("outTrackId", request.outTrackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverUserIdList)) {
            body.put("receiverUserIdList", request.receiverUserIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("robotCode", request.robotCode);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TopboxClose"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/topBoxes/close"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new TopboxCloseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>钉钉吊顶卡片关闭</p>
     * 
     * @param request TopboxCloseRequest
     * @return TopboxCloseResponse
     */
    public TopboxCloseResponse topboxClose(TopboxCloseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TopboxCloseHeaders headers = new TopboxCloseHeaders();
        return this.topboxCloseWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>钉钉吊顶卡片开启</p>
     * 
     * @param request TopboxOpenRequest
     * @param headers TopboxOpenHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TopboxOpenResponse
     */
    public TopboxOpenResponse topboxOpenWithOptions(TopboxOpenRequest request, TopboxOpenHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversationType)) {
            body.put("conversationType", request.conversationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coolAppCode)) {
            body.put("coolAppCode", request.coolAppCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredTime)) {
            body.put("expiredTime", request.expiredTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTrackId)) {
            body.put("outTrackId", request.outTrackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platforms)) {
            body.put("platforms", request.platforms);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverUserIdList)) {
            body.put("receiverUserIdList", request.receiverUserIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("robotCode", request.robotCode);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TopboxOpen"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/topBoxes/open"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new TopboxOpenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>钉钉吊顶卡片开启</p>
     * 
     * @param request TopboxOpenRequest
     * @return TopboxOpenResponse
     */
    public TopboxOpenResponse topboxOpen(TopboxOpenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TopboxOpenHeaders headers = new TopboxOpenHeaders();
        return this.topboxOpenWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改群头像</p>
     * 
     * @param request UpdateGroupAvatarRequest
     * @param headers UpdateGroupAvatarHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGroupAvatarResponse
     */
    public UpdateGroupAvatarResponse updateGroupAvatarWithOptions(UpdateGroupAvatarRequest request, UpdateGroupAvatarHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupAvatar)) {
            body.put("groupAvatar", request.groupAvatar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGroupAvatar"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/interconnections/groups/avatars"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateGroupAvatarResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改群头像</p>
     * 
     * @param request UpdateGroupAvatarRequest
     * @return UpdateGroupAvatarResponse
     */
    public UpdateGroupAvatarResponse updateGroupAvatar(UpdateGroupAvatarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateGroupAvatarHeaders headers = new UpdateGroupAvatarHeaders();
        return this.updateGroupAvatarWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改群名称</p>
     * 
     * @param request UpdateGroupNameRequest
     * @param headers UpdateGroupNameHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGroupNameResponse
     */
    public UpdateGroupNameResponse updateGroupNameWithOptions(UpdateGroupNameRequest request, UpdateGroupNameHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("groupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGroupName"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/interconnections/groups/names"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateGroupNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改群名称</p>
     * 
     * @param request UpdateGroupNameRequest
     * @return UpdateGroupNameResponse
     */
    public UpdateGroupNameResponse updateGroupName(UpdateGroupNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateGroupNameHeaders headers = new UpdateGroupNameHeaders();
        return this.updateGroupNameWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置场景群权限项</p>
     * 
     * @param request UpdateGroupPermissionRequest
     * @param headers UpdateGroupPermissionHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGroupPermissionResponse
     */
    public UpdateGroupPermissionResponse updateGroupPermissionWithOptions(UpdateGroupPermissionRequest request, UpdateGroupPermissionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionGroup)) {
            body.put("permissionGroup", request.permissionGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGroupPermission"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/sceneGroups/permissions"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateGroupPermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置场景群权限项</p>
     * 
     * @param request UpdateGroupPermissionRequest
     * @return UpdateGroupPermissionResponse
     */
    public UpdateGroupPermissionResponse updateGroupPermission(UpdateGroupPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateGroupPermissionHeaders headers = new UpdateGroupPermissionHeaders();
        return this.updateGroupPermissionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新群管理员</p>
     * 
     * @param request UpdateGroupSubAdminRequest
     * @param headers UpdateGroupSubAdminHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGroupSubAdminResponse
     */
    public UpdateGroupSubAdminResponse updateGroupSubAdminWithOptions(UpdateGroupSubAdminRequest request, UpdateGroupSubAdminHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            body.put("role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            body.put("userIds", request.userIds);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGroupSubAdmin"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/sceneGroups/subAdmins"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateGroupSubAdminResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新群管理员</p>
     * 
     * @param request UpdateGroupSubAdminRequest
     * @return UpdateGroupSubAdminResponse
     */
    public UpdateGroupSubAdminResponse updateGroupSubAdmin(UpdateGroupSubAdminRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateGroupSubAdminHeaders headers = new UpdateGroupSubAdminHeaders();
        return this.updateGroupSubAdminWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新可交互式动态卡片</p>
     * 
     * @param request UpdateInteractiveCardRequest
     * @param headers UpdateInteractiveCardHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInteractiveCardResponse
     */
    public UpdateInteractiveCardResponse updateInteractiveCardWithOptions(UpdateInteractiveCardRequest request, UpdateInteractiveCardHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cardData)) {
            body.put("cardData", request.cardData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardOptions)) {
            body.put("cardOptions", request.cardOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTrackId)) {
            body.put("outTrackId", request.outTrackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateData)) {
            body.put("privateData", request.privateData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdType)) {
            body.put("userIdType", request.userIdType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInteractiveCard"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/interactiveCards"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateInteractiveCardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新可交互式动态卡片</p>
     * 
     * @param request UpdateInteractiveCardRequest
     * @return UpdateInteractiveCardResponse
     */
    public UpdateInteractiveCardResponse updateInteractiveCard(UpdateInteractiveCardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateInteractiveCardHeaders headers = new UpdateInteractiveCardHeaders();
        return this.updateInteractiveCardWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置群成员禁言状态</p>
     * 
     * @param request UpdateMemberBanWordsRequest
     * @param headers UpdateMemberBanWordsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMemberBanWordsResponse
     */
    public UpdateMemberBanWordsResponse updateMemberBanWordsWithOptions(UpdateMemberBanWordsRequest request, UpdateMemberBanWordsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.muteDuration)) {
            body.put("muteDuration", request.muteDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.muteStatus)) {
            body.put("muteStatus", request.muteStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdList)) {
            body.put("userIdList", request.userIdList);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMemberBanWords"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/sceneGroups/muteMembers/set"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateMemberBanWordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置群成员禁言状态</p>
     * 
     * @param request UpdateMemberBanWordsRequest
     * @return UpdateMemberBanWordsResponse
     */
    public UpdateMemberBanWordsResponse updateMemberBanWords(UpdateMemberBanWordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateMemberBanWordsHeaders headers = new UpdateMemberBanWordsHeaders();
        return this.updateMemberBanWordsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新群成员的群昵称</p>
     * 
     * @param request UpdateMemberGroupNickRequest
     * @param headers UpdateMemberGroupNickHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMemberGroupNickResponse
     */
    public UpdateMemberGroupNickResponse updateMemberGroupNickWithOptions(UpdateMemberGroupNickRequest request, UpdateMemberGroupNickHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupNick)) {
            body.put("groupNick", request.groupNick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMemberGroupNick"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/sceneGroups/members/groupNicks"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateMemberGroupNickResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新群成员的群昵称</p>
     * 
     * @param request UpdateMemberGroupNickRequest
     * @return UpdateMemberGroupNickResponse
     */
    public UpdateMemberGroupNickResponse updateMemberGroupNick(UpdateMemberGroupNickRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateMemberGroupNickHeaders headers = new UpdateMemberGroupNickHeaders();
        return this.updateMemberGroupNickWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改组织里的机器人</p>
     * 
     * @param request UpdateRobotInOrgRequest
     * @param headers UpdateRobotInOrgHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRobotInOrgResponse
     */
    public UpdateRobotInOrgResponse updateRobotInOrgWithOptions(UpdateRobotInOrgRequest request, UpdateRobotInOrgHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.brief)) {
            body.put("brief", request.brief);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.icon)) {
            body.put("icon", request.icon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outgoingToken)) {
            body.put("outgoingToken", request.outgoingToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outgoingUrl)) {
            body.put("outgoingUrl", request.outgoingUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previewMediaId)) {
            body.put("previewMediaId", request.previewMediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("robotCode", request.robotCode);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRobotInOrg"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/organizations/robots"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateRobotInOrgResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改组织里的机器人</p>
     * 
     * @param request UpdateRobotInOrgRequest
     * @return UpdateRobotInOrgResponse
     */
    public UpdateRobotInOrgResponse updateRobotInOrg(UpdateRobotInOrgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateRobotInOrgHeaders headers = new UpdateRobotInOrgHeaders();
        return this.updateRobotInOrgWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机器人更新可交互式卡片(个人、企业)</p>
     * 
     * @param request UpdateRobotInteractiveCardRequest
     * @param headers UpdateRobotInteractiveCardHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRobotInteractiveCardResponse
     */
    public UpdateRobotInteractiveCardResponse updateRobotInteractiveCardWithOptions(UpdateRobotInteractiveCardRequest request, UpdateRobotInteractiveCardHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cardBizId)) {
            body.put("cardBizId", request.cardBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardData)) {
            body.put("cardData", request.cardData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unionIdPrivateDataMap)) {
            body.put("unionIdPrivateDataMap", request.unionIdPrivateDataMap);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateOptions)) {
            body.put("updateOptions", request.updateOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdPrivateDataMap)) {
            body.put("userIdPrivateDataMap", request.userIdPrivateDataMap);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRobotInteractiveCard"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/robots/interactiveCards"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateRobotInteractiveCardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>机器人更新可交互式卡片(个人、企业)</p>
     * 
     * @param request UpdateRobotInteractiveCardRequest
     * @return UpdateRobotInteractiveCardResponse
     */
    public UpdateRobotInteractiveCardResponse updateRobotInteractiveCard(UpdateRobotInteractiveCardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateRobotInteractiveCardHeaders headers = new UpdateRobotInteractiveCardHeaders();
        return this.updateRobotInteractiveCardWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置群成员的群角色</p>
     * 
     * @param request UpdateTheGroupRolesOfGroupMemberRequest
     * @param headers UpdateTheGroupRolesOfGroupMemberHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTheGroupRolesOfGroupMemberResponse
     */
    public UpdateTheGroupRolesOfGroupMemberResponse updateTheGroupRolesOfGroupMemberWithOptions(UpdateTheGroupRolesOfGroupMemberRequest request, UpdateTheGroupRolesOfGroupMemberHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openRoleIds)) {
            body.put("openRoleIds", request.openRoleIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTheGroupRolesOfGroupMember"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/sceneGroups/members/groupRoles"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateTheGroupRolesOfGroupMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置群成员的群角色</p>
     * 
     * @param request UpdateTheGroupRolesOfGroupMemberRequest
     * @return UpdateTheGroupRolesOfGroupMemberResponse
     */
    public UpdateTheGroupRolesOfGroupMemberResponse updateTheGroupRolesOfGroupMember(UpdateTheGroupRolesOfGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateTheGroupRolesOfGroupMemberHeaders headers = new UpdateTheGroupRolesOfGroupMemberHeaders();
        return this.updateTheGroupRolesOfGroupMemberWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加群成员</p>
     * 
     * @param request AddGroupMemberRequest
     * @param headers AddGroupMemberHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddGroupMemberResponse
     */
    public AddGroupMemberResponse addGroupMemberWithOptions(AddGroupMemberRequest request, AddGroupMemberHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appUserIds)) {
            body.put("appUserIds", request.appUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("operatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            body.put("userIds", request.userIds);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "addGroupMember"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/interconnections/groups/members"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new AddGroupMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加群成员</p>
     * 
     * @param request AddGroupMemberRequest
     * @return AddGroupMemberResponse
     */
    public AddGroupMemberResponse addGroupMember(AddGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddGroupMemberHeaders headers = new AddGroupMemberHeaders();
        return this.addGroupMemberWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>移除群成员</p>
     * 
     * @param request RemoveGroupMemberRequest
     * @param headers RemoveGroupMemberHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveGroupMemberResponse
     */
    public RemoveGroupMemberResponse removeGroupMemberWithOptions(RemoveGroupMemberRequest request, RemoveGroupMemberHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appUserIds)) {
            body.put("appUserIds", request.appUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("operatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            body.put("userIds", request.userIds);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "removeGroupMember"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/interconnections/groups/members/remove"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new RemoveGroupMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>移除群成员</p>
     * 
     * @param request RemoveGroupMemberRequest
     * @return RemoveGroupMemberResponse
     */
    public RemoveGroupMemberResponse removeGroupMember(RemoveGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RemoveGroupMemberHeaders headers = new RemoveGroupMemberHeaders();
        return this.removeGroupMemberWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发送ToC消息</p>
     * 
     * @param request SendDingMessageRequest
     * @param headers SendDingMessageHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendDingMessageResponse
     */
    public SendDingMessageResponse sendDingMessageWithOptions(SendDingMessageRequest request, SendDingMessageHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            body.put("message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageType)) {
            body.put("messageType", request.messageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverId)) {
            body.put("receiverId", request.receiverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderId)) {
            body.put("senderId", request.senderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "sendDingMessage"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/interconnections/dingMessages/send"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new SendDingMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发送ToC消息</p>
     * 
     * @param request SendDingMessageRequest
     * @return SendDingMessageResponse
     */
    public SendDingMessageResponse sendDingMessage(SendDingMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SendDingMessageHeaders headers = new SendDingMessageHeaders();
        return this.sendDingMessageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发送ToB消息</p>
     * 
     * @param request SendMessageRequest
     * @param headers SendMessageHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendMessageResponse
     */
    public SendMessageResponse sendMessageWithOptions(SendMessageRequest request, SendMessageHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            body.put("message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageType)) {
            body.put("messageType", request.messageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverId)) {
            body.put("receiverId", request.receiverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderId)) {
            body.put("senderId", request.senderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceInfos)) {
            body.put("sourceInfos", request.sourceInfos);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "sendMessage"),
            new TeaPair("version", "im_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/im/interconnections/messages/send"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new SendMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发送ToB消息</p>
     * 
     * @param request SendMessageRequest
     * @return SendMessageResponse
     */
    public SendMessageResponse sendMessage(SendMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SendMessageHeaders headers = new SendMessageHeaders();
        return this.sendMessageWithOptions(request, headers, runtime);
    }
}
