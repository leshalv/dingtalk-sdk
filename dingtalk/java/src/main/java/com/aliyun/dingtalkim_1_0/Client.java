// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkim_1_0;

import com.aliyun.tea.*;
import com.aliyun.dingtalkim_1_0.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        if (com.aliyun.teautil.Common.empty(_endpoint)) {
            this._endpoint = "api.dingtalk.com";
        }

    }


    public UpdateGroupPermissionResponse updateGroupPermission(UpdateGroupPermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        UpdateGroupPermissionHeaders headers = new UpdateGroupPermissionHeaders();
        return this.updateGroupPermissionWithOptions(request, headers, runtime);
    }

    public UpdateGroupPermissionResponse updateGroupPermissionWithOptions(UpdateGroupPermissionRequest request, UpdateGroupPermissionHeaders headers, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.dingTokenGrantType)) {
            body.put("dingTokenGrantType", request.dingTokenGrantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingOrgId)) {
            body.put("dingOrgId", request.dingOrgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingIsvOrgId)) {
            body.put("dingIsvOrgId", request.dingIsvOrgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingOauthAppId)) {
            body.put("dingOauthAppId", request.dingOauthAppId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingSuiteKey)) {
            body.put("dingSuiteKey", request.dingSuiteKey);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", headers.xAcsDingtalkAccessToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateGroupPermission", "im_1.0", "HTTP", "PUT", "AK", "/v1.0/im/sceneGroups/permissions", "json", req, runtime), new UpdateGroupPermissionResponse());
    }

    public TopboxCloseResponse topboxClose(TopboxCloseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        TopboxCloseHeaders headers = new TopboxCloseHeaders();
        return this.topboxCloseWithOptions(request, headers, runtime);
    }

    public TopboxCloseResponse topboxCloseWithOptions(TopboxCloseRequest request, TopboxCloseHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dingIsvOrgId)) {
            body.put("dingIsvOrgId", request.dingIsvOrgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingTokenGrantType)) {
            body.put("dingTokenGrantType", request.dingTokenGrantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTrackId)) {
            body.put("outTrackId", request.outTrackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingSuiteKey)) {
            body.put("dingSuiteKey", request.dingSuiteKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingOrgId)) {
            body.put("dingOrgId", request.dingOrgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingOauthAppId)) {
            body.put("dingOauthAppId", request.dingOauthAppId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", headers.xAcsDingtalkAccessToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("TopboxClose", "im_1.0", "HTTP", "POST", "AK", "/v1.0/im/topBoxes/close", "none", req, runtime), new TopboxCloseResponse());
    }

    public SendInteractiveCardResponse sendInteractiveCard(SendInteractiveCardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        SendInteractiveCardHeaders headers = new SendInteractiveCardHeaders();
        return this.sendInteractiveCardWithOptions(request, headers, runtime);
    }

    public SendInteractiveCardResponse sendInteractiveCardWithOptions(SendInteractiveCardRequest request, SendInteractiveCardHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dingIsvOrgId)) {
            body.put("dingIsvOrgId", request.dingIsvOrgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardTemplateId)) {
            body.put("cardTemplateId", request.cardTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverUserIdList)) {
            body.put("receiverUserIdList", request.receiverUserIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingTokenGrantType)) {
            body.put("dingTokenGrantType", request.dingTokenGrantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTrackId)) {
            body.put("outTrackId", request.outTrackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingSuiteKey)) {
            body.put("dingSuiteKey", request.dingSuiteKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("robotCode", request.robotCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingOrgId)) {
            body.put("dingOrgId", request.dingOrgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationType)) {
            body.put("conversationType", request.conversationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackRouteKey)) {
            body.put("callbackRouteKey", request.callbackRouteKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.cardData))) {
            body.put("cardData", request.cardData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateData)) {
            body.put("privateData", request.privateData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingOauthAppId)) {
            body.put("dingOauthAppId", request.dingOauthAppId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatBotId)) {
            body.put("chatBotId", request.chatBotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdType)) {
            body.put("userIdType", request.userIdType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.atOpenIds)) {
            body.put("atOpenIds", request.atOpenIds);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", headers.xAcsDingtalkAccessToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("SendInteractiveCard", "im_1.0", "HTTP", "POST", "AK", "/v1.0/im/interactiveCards/send", "json", req, runtime), new SendInteractiveCardResponse());
    }

    public UpdateInteractiveCardResponse updateInteractiveCard(UpdateInteractiveCardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        UpdateInteractiveCardHeaders headers = new UpdateInteractiveCardHeaders();
        return this.updateInteractiveCardWithOptions(request, headers, runtime);
    }

    public UpdateInteractiveCardResponse updateInteractiveCardWithOptions(UpdateInteractiveCardRequest request, UpdateInteractiveCardHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outTrackId)) {
            body.put("outTrackId", request.outTrackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.cardData))) {
            body.put("cardData", request.cardData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateData)) {
            body.put("privateData", request.privateData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingTokenGrantType)) {
            body.put("dingTokenGrantType", request.dingTokenGrantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingOrgId)) {
            body.put("dingOrgId", request.dingOrgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingIsvOrgId)) {
            body.put("dingIsvOrgId", request.dingIsvOrgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingSuiteKey)) {
            body.put("dingSuiteKey", request.dingSuiteKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingOauthAppId)) {
            body.put("dingOauthAppId", request.dingOauthAppId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdType)) {
            body.put("userIdType", request.userIdType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", headers.xAcsDingtalkAccessToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateInteractiveCard", "im_1.0", "HTTP", "PUT", "AK", "/v1.0/im/interactiveCards", "json", req, runtime), new UpdateInteractiveCardResponse());
    }

    public InteractiveCardCreateInstanceResponse interactiveCardCreateInstance(InteractiveCardCreateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        InteractiveCardCreateInstanceHeaders headers = new InteractiveCardCreateInstanceHeaders();
        return this.interactiveCardCreateInstanceWithOptions(request, headers, runtime);
    }

    public InteractiveCardCreateInstanceResponse interactiveCardCreateInstanceWithOptions(InteractiveCardCreateInstanceRequest request, InteractiveCardCreateInstanceHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dingIsvOrgId)) {
            body.put("dingIsvOrgId", request.dingIsvOrgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardTemplateId)) {
            body.put("cardTemplateId", request.cardTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverUserIdList)) {
            body.put("receiverUserIdList", request.receiverUserIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingTokenGrantType)) {
            body.put("dingTokenGrantType", request.dingTokenGrantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTrackId)) {
            body.put("outTrackId", request.outTrackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingSuiteKey)) {
            body.put("dingSuiteKey", request.dingSuiteKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("robotCode", request.robotCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingOrgId)) {
            body.put("dingOrgId", request.dingOrgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationType)) {
            body.put("conversationType", request.conversationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackRouteKey)) {
            body.put("callbackRouteKey", request.callbackRouteKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.cardData))) {
            body.put("cardData", request.cardData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateData)) {
            body.put("privateData", request.privateData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingOauthAppId)) {
            body.put("dingOauthAppId", request.dingOauthAppId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatBotId)) {
            body.put("chatBotId", request.chatBotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdType)) {
            body.put("userIdType", request.userIdType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", headers.xAcsDingtalkAccessToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("InteractiveCardCreateInstance", "im_1.0", "HTTP", "POST", "AK", "/v1.0/im/interactiveCards/instances", "json", req, runtime), new InteractiveCardCreateInstanceResponse());
    }

    public QueryMembersOfGroupRoleResponse queryMembersOfGroupRole(QueryMembersOfGroupRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        QueryMembersOfGroupRoleHeaders headers = new QueryMembersOfGroupRoleHeaders();
        return this.queryMembersOfGroupRoleWithOptions(request, headers, runtime);
    }

    public QueryMembersOfGroupRoleResponse queryMembersOfGroupRoleWithOptions(QueryMembersOfGroupRoleRequest request, QueryMembersOfGroupRoleHeaders headers, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.dingTokenGrantType)) {
            body.put("dingTokenGrantType", request.dingTokenGrantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingOrgId)) {
            body.put("dingOrgId", request.dingOrgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingIsvOrgId)) {
            body.put("dingIsvOrgId", request.dingIsvOrgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingSuiteKey)) {
            body.put("dingSuiteKey", request.dingSuiteKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingOauthAppId)) {
            body.put("dingOauthAppId", request.dingOauthAppId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", headers.xAcsDingtalkAccessToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("QueryMembersOfGroupRole", "im_1.0", "HTTP", "POST", "AK", "/v1.0/im/sceneGroups/roles/members/query", "json", req, runtime), new QueryMembersOfGroupRoleResponse());
    }

    public TopboxOpenResponse topboxOpen(TopboxOpenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        TopboxOpenHeaders headers = new TopboxOpenHeaders();
        return this.topboxOpenWithOptions(request, headers, runtime);
    }

    public TopboxOpenResponse topboxOpenWithOptions(TopboxOpenRequest request, TopboxOpenHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dingIsvOrgId)) {
            body.put("dingIsvOrgId", request.dingIsvOrgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingTokenGrantType)) {
            body.put("dingTokenGrantType", request.dingTokenGrantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTrackId)) {
            body.put("outTrackId", request.outTrackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingSuiteKey)) {
            body.put("dingSuiteKey", request.dingSuiteKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingOrgId)) {
            body.put("dingOrgId", request.dingOrgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingOauthAppId)) {
            body.put("dingOauthAppId", request.dingOauthAppId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredTime)) {
            body.put("expiredTime", request.expiredTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platforms)) {
            body.put("platforms", request.platforms);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", headers.xAcsDingtalkAccessToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("TopboxOpen", "im_1.0", "HTTP", "POST", "AK", "/v1.0/im/topBoxes/open", "none", req, runtime), new TopboxOpenResponse());
    }

    public UpdateTheGroupRolesOfGroupMemberResponse updateTheGroupRolesOfGroupMember(UpdateTheGroupRolesOfGroupMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        UpdateTheGroupRolesOfGroupMemberHeaders headers = new UpdateTheGroupRolesOfGroupMemberHeaders();
        return this.updateTheGroupRolesOfGroupMemberWithOptions(request, headers, runtime);
    }

    public UpdateTheGroupRolesOfGroupMemberResponse updateTheGroupRolesOfGroupMemberWithOptions(UpdateTheGroupRolesOfGroupMemberRequest request, UpdateTheGroupRolesOfGroupMemberHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openRoleIds)) {
            body.put("openRoleIds", request.openRoleIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingTokenGrantType)) {
            body.put("dingTokenGrantType", request.dingTokenGrantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingOrgId)) {
            body.put("dingOrgId", request.dingOrgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingIsvOrgId)) {
            body.put("dingIsvOrgId", request.dingIsvOrgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingSuiteKey)) {
            body.put("dingSuiteKey", request.dingSuiteKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingOauthAppId)) {
            body.put("dingOauthAppId", request.dingOauthAppId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", headers.xAcsDingtalkAccessToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateTheGroupRolesOfGroupMember", "im_1.0", "HTTP", "PUT", "AK", "/v1.0/im/sceneGroups/members/groupRoles", "json", req, runtime), new UpdateTheGroupRolesOfGroupMemberResponse());
    }

    public SendTemplateInteractiveCardResponse sendTemplateInteractiveCard(SendTemplateInteractiveCardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        SendTemplateInteractiveCardHeaders headers = new SendTemplateInteractiveCardHeaders();
        return this.sendTemplateInteractiveCardWithOptions(request, headers, runtime);
    }

    public SendTemplateInteractiveCardResponse sendTemplateInteractiveCardWithOptions(SendTemplateInteractiveCardRequest request, SendTemplateInteractiveCardHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dingIsvOrgId)) {
            body.put("dingIsvOrgId", request.dingIsvOrgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardTemplateId)) {
            body.put("cardTemplateId", request.cardTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("openConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.singleChatReceiver)) {
            body.put("singleChatReceiver", request.singleChatReceiver);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingTokenGrantType)) {
            body.put("dingTokenGrantType", request.dingTokenGrantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTrackId)) {
            body.put("outTrackId", request.outTrackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingSuiteKey)) {
            body.put("dingSuiteKey", request.dingSuiteKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotCode)) {
            body.put("robotCode", request.robotCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingOrgId)) {
            body.put("dingOrgId", request.dingOrgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackUrl)) {
            body.put("callbackUrl", request.callbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardData)) {
            body.put("cardData", request.cardData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingOauthAppId)) {
            body.put("dingOauthAppId", request.dingOauthAppId);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.sendOptions))) {
            body.put("sendOptions", request.sendOptions);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", headers.xAcsDingtalkAccessToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("SendTemplateInteractiveCard", "im_1.0", "HTTP", "POST", "AK", "/v1.0/im/interactiveCards/templates/send", "json", req, runtime), new SendTemplateInteractiveCardResponse());
    }
}
