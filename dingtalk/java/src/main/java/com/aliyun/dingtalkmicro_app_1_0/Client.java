// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkmicro_app_1_0;

import com.aliyun.tea.*;
import com.aliyun.dingtalkmicro_app_1_0.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        if (com.aliyun.teautil.Common.empty(_endpoint)) {
            this._endpoint = "api.dingtalk.com";
        }

    }


    public AddAppRolesToMemberResponse addAppRolesToMember(String agentId, AddAppRolesToMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddAppRolesToMemberHeaders headers = new AddAppRolesToMemberHeaders();
        return this.addAppRolesToMemberWithOptions(agentId, request, headers, runtime);
    }

    public AddAppRolesToMemberResponse addAppRolesToMemberWithOptions(String agentId, AddAppRolesToMemberRequest request, AddAppRolesToMemberHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        agentId = com.aliyun.openapiutil.Client.getEncodeParam(agentId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            body.put("memberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberType)) {
            body.put("memberType", request.memberType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opUserId)) {
            body.put("opUserId", request.opUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleList)) {
            body.put("roleList", request.roleList);
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
        return TeaModel.toModel(this.doROARequest("AddAppRolesToMember", "microApp_1.0", "HTTP", "PUT", "AK", "/v1.0/microApp/apps/" + agentId + "/members/roles", "json", req, runtime), new AddAppRolesToMemberResponse());
    }

    public AddAppToWorkBenchGroupResponse addAppToWorkBenchGroup(String agentId, AddAppToWorkBenchGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddAppToWorkBenchGroupHeaders headers = new AddAppToWorkBenchGroupHeaders();
        return this.addAppToWorkBenchGroupWithOptions(agentId, request, headers, runtime);
    }

    public AddAppToWorkBenchGroupResponse addAppToWorkBenchGroupWithOptions(String agentId, AddAppToWorkBenchGroupRequest request, AddAppToWorkBenchGroupHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        agentId = com.aliyun.openapiutil.Client.getEncodeParam(agentId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentId)) {
            body.put("componentId", request.componentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecologicalCorpId)) {
            body.put("ecologicalCorpId", request.ecologicalCorpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opUnionId)) {
            body.put("opUnionId", request.opUnionId);
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
        return TeaModel.toModel(this.doROARequest("AddAppToWorkBenchGroup", "microApp_1.0", "HTTP", "POST", "AK", "/v1.0/microApp/apps/" + agentId + "/addToWorkBenchGroup", "json", req, runtime), new AddAppToWorkBenchGroupResponse());
    }

    public AddMemberToAppRoleResponse addMemberToAppRole(String agentId, String roleId, AddMemberToAppRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddMemberToAppRoleHeaders headers = new AddMemberToAppRoleHeaders();
        return this.addMemberToAppRoleWithOptions(agentId, roleId, request, headers, runtime);
    }

    public AddMemberToAppRoleResponse addMemberToAppRoleWithOptions(String agentId, String roleId, AddMemberToAppRoleRequest request, AddMemberToAppRoleHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        agentId = com.aliyun.openapiutil.Client.getEncodeParam(agentId);
        roleId = com.aliyun.openapiutil.Client.getEncodeParam(roleId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deptIdList)) {
            body.put("deptIdList", request.deptIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opUserId)) {
            body.put("opUserId", request.opUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopeVersion)) {
            body.put("scopeVersion", request.scopeVersion);
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
        return TeaModel.toModel(this.doROARequest("AddMemberToAppRole", "microApp_1.0", "HTTP", "POST", "AK", "/v1.0/microApp/apps/" + agentId + "/roles/" + roleId + "/members", "json", req, runtime), new AddMemberToAppRoleResponse());
    }

    public CreateApaasAppResponse createApaasApp(CreateApaasAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateApaasAppHeaders headers = new CreateApaasAppHeaders();
        return this.createApaasAppWithOptions(request, headers, runtime);
    }

    public CreateApaasAppResponse createApaasAppWithOptions(CreateApaasAppRequest request, CreateApaasAppHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appDesc)) {
            body.put("appDesc", request.appDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appIcon)) {
            body.put("appIcon", request.appIcon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("appName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizAppId)) {
            body.put("bizAppId", request.bizAppId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.homepageEditLink)) {
            body.put("homepageEditLink", request.homepageEditLink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.homepageLink)) {
            body.put("homepageLink", request.homepageLink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isShortCut)) {
            body.put("isShortCut", request.isShortCut);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ompLink)) {
            body.put("ompLink", request.ompLink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opUserId)) {
            body.put("opUserId", request.opUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pcHomepageEditLink)) {
            body.put("pcHomepageEditLink", request.pcHomepageEditLink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pcHomepageLink)) {
            body.put("pcHomepageLink", request.pcHomepageLink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateKey)) {
            body.put("templateKey", request.templateKey);
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
        return TeaModel.toModel(this.doROARequest("CreateApaasApp", "microApp_1.0", "HTTP", "POST", "AK", "/v1.0/microApp/apaasApps", "json", req, runtime), new CreateApaasAppResponse());
    }

    public CreateInnerAppResponse createInnerApp(CreateInnerAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateInnerAppHeaders headers = new CreateInnerAppHeaders();
        return this.createInnerAppWithOptions(request, headers, runtime);
    }

    public CreateInnerAppResponse createInnerAppWithOptions(CreateInnerAppRequest request, CreateInnerAppHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            body.put("desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.developType)) {
            body.put("developType", request.developType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.homepageLink)) {
            body.put("homepageLink", request.homepageLink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.icon)) {
            body.put("icon", request.icon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipWhiteList)) {
            body.put("ipWhiteList", request.ipWhiteList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ompLink)) {
            body.put("ompLink", request.ompLink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opUnionId)) {
            body.put("opUnionId", request.opUnionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pcHomepageLink)) {
            body.put("pcHomepageLink", request.pcHomepageLink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopeType)) {
            body.put("scopeType", request.scopeType);
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
        return TeaModel.toModel(this.doROARequest("CreateInnerApp", "microApp_1.0", "HTTP", "POST", "AK", "/v1.0/microApp/apps", "json", req, runtime), new CreateInnerAppResponse());
    }

    public DeleteAppRoleResponse deleteAppRole(String agentId, String roleId, DeleteAppRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteAppRoleHeaders headers = new DeleteAppRoleHeaders();
        return this.deleteAppRoleWithOptions(agentId, roleId, request, headers, runtime);
    }

    public DeleteAppRoleResponse deleteAppRoleWithOptions(String agentId, String roleId, DeleteAppRoleRequest request, DeleteAppRoleHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        agentId = com.aliyun.openapiutil.Client.getEncodeParam(agentId);
        roleId = com.aliyun.openapiutil.Client.getEncodeParam(roleId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opUserId)) {
            query.put("opUserId", request.opUserId);
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
        return TeaModel.toModel(this.doROARequest("DeleteAppRole", "microApp_1.0", "HTTP", "DELETE", "AK", "/v1.0/microApp/apps/" + agentId + "/roles/" + roleId + "", "json", req, runtime), new DeleteAppRoleResponse());
    }

    public DeleteInnerAppResponse deleteInnerApp(String agentId, DeleteInnerAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteInnerAppHeaders headers = new DeleteInnerAppHeaders();
        return this.deleteInnerAppWithOptions(agentId, request, headers, runtime);
    }

    public DeleteInnerAppResponse deleteInnerAppWithOptions(String agentId, DeleteInnerAppRequest request, DeleteInnerAppHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        agentId = com.aliyun.openapiutil.Client.getEncodeParam(agentId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opUnionId)) {
            query.put("opUnionId", request.opUnionId);
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
        return TeaModel.toModel(this.doROARequest("DeleteInnerApp", "microApp_1.0", "HTTP", "DELETE", "AK", "/v1.0/microApp/apps/" + agentId + "", "json", req, runtime), new DeleteInnerAppResponse());
    }

    public GetApaasAppResponse getApaasApp(String bizAppId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetApaasAppHeaders headers = new GetApaasAppHeaders();
        return this.getApaasAppWithOptions(bizAppId, headers, runtime);
    }

    public GetApaasAppResponse getApaasAppWithOptions(String bizAppId, GetApaasAppHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        bizAppId = com.aliyun.openapiutil.Client.getEncodeParam(bizAppId);
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
        return TeaModel.toModel(this.doROARequest("GetApaasApp", "microApp_1.0", "HTTP", "GET", "AK", "/v1.0/microApp/apaasApps/" + bizAppId + "", "json", req, runtime), new GetApaasAppResponse());
    }

    public GetAppRoleScopeByRoleIdResponse getAppRoleScopeByRoleId(String agentId, String roleId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetAppRoleScopeByRoleIdHeaders headers = new GetAppRoleScopeByRoleIdHeaders();
        return this.getAppRoleScopeByRoleIdWithOptions(agentId, roleId, headers, runtime);
    }

    public GetAppRoleScopeByRoleIdResponse getAppRoleScopeByRoleIdWithOptions(String agentId, String roleId, GetAppRoleScopeByRoleIdHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        agentId = com.aliyun.openapiutil.Client.getEncodeParam(agentId);
        roleId = com.aliyun.openapiutil.Client.getEncodeParam(roleId);
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
        return TeaModel.toModel(this.doROARequest("GetAppRoleScopeByRoleId", "microApp_1.0", "HTTP", "GET", "AK", "/v1.0/microApp/apps/" + agentId + "/roles/" + roleId + "/scopes", "json", req, runtime), new GetAppRoleScopeByRoleIdResponse());
    }

    public GetInnerAppResponse getInnerApp(String agentId, GetInnerAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetInnerAppHeaders headers = new GetInnerAppHeaders();
        return this.getInnerAppWithOptions(agentId, request, headers, runtime);
    }

    public GetInnerAppResponse getInnerAppWithOptions(String agentId, GetInnerAppRequest request, GetInnerAppHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        agentId = com.aliyun.openapiutil.Client.getEncodeParam(agentId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ecologicalCorpId)) {
            query.put("ecologicalCorpId", request.ecologicalCorpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opUnionId)) {
            query.put("opUnionId", request.opUnionId);
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
        return TeaModel.toModel(this.doROARequest("GetInnerApp", "microApp_1.0", "HTTP", "GET", "AK", "/v1.0/microApp/apps/" + agentId + "", "json", req, runtime), new GetInnerAppResponse());
    }

    public GetMicroAppScopeResponse getMicroAppScope(String agentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetMicroAppScopeHeaders headers = new GetMicroAppScopeHeaders();
        return this.getMicroAppScopeWithOptions(agentId, headers, runtime);
    }

    public GetMicroAppScopeResponse getMicroAppScopeWithOptions(String agentId, GetMicroAppScopeHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        agentId = com.aliyun.openapiutil.Client.getEncodeParam(agentId);
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
        return TeaModel.toModel(this.doROARequest("GetMicroAppScope", "microApp_1.0", "HTTP", "GET", "AK", "/v1.0/microApp/apps/" + agentId + "/scopes", "json", req, runtime), new GetMicroAppScopeResponse());
    }

    public GetMicroAppUserAccessResponse getMicroAppUserAccess(String agentId, String userId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetMicroAppUserAccessHeaders headers = new GetMicroAppUserAccessHeaders();
        return this.getMicroAppUserAccessWithOptions(agentId, userId, headers, runtime);
    }

    public GetMicroAppUserAccessResponse getMicroAppUserAccessWithOptions(String agentId, String userId, GetMicroAppUserAccessHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        agentId = com.aliyun.openapiutil.Client.getEncodeParam(agentId);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
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
        return TeaModel.toModel(this.doROARequest("GetMicroAppUserAccess", "microApp_1.0", "HTTP", "GET", "AK", "/v1.0/microApp/apps/" + agentId + "/users/" + userId + "/adminAccess", "json", req, runtime), new GetMicroAppUserAccessResponse());
    }

    public ListAllAppResponse listAllApp() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListAllAppHeaders headers = new ListAllAppHeaders();
        return this.listAllAppWithOptions(headers, runtime);
    }

    public ListAllAppResponse listAllAppWithOptions(ListAllAppHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
        return TeaModel.toModel(this.doROARequest("ListAllApp", "microApp_1.0", "HTTP", "GET", "AK", "/v1.0/microApp/allApps", "json", req, runtime), new ListAllAppResponse());
    }

    public ListAllInnerAppsResponse listAllInnerApps() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListAllInnerAppsHeaders headers = new ListAllInnerAppsHeaders();
        return this.listAllInnerAppsWithOptions(headers, runtime);
    }

    public ListAllInnerAppsResponse listAllInnerAppsWithOptions(ListAllInnerAppsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
        return TeaModel.toModel(this.doROARequest("ListAllInnerApps", "microApp_1.0", "HTTP", "GET", "AK", "/v1.0/microApp/allInnerApps", "json", req, runtime), new ListAllInnerAppsResponse());
    }

    public ListAppRoleScopesResponse listAppRoleScopes(String agentId, ListAppRoleScopesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListAppRoleScopesHeaders headers = new ListAppRoleScopesHeaders();
        return this.listAppRoleScopesWithOptions(agentId, request, headers, runtime);
    }

    public ListAppRoleScopesResponse listAppRoleScopesWithOptions(String agentId, ListAppRoleScopesRequest request, ListAppRoleScopesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        agentId = com.aliyun.openapiutil.Client.getEncodeParam(agentId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
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
        return TeaModel.toModel(this.doROARequest("ListAppRoleScopes", "microApp_1.0", "HTTP", "GET", "AK", "/v1.0/microApp/apps/" + agentId + "/roles", "json", req, runtime), new ListAppRoleScopesResponse());
    }

    public ListInnerAppResponse listInnerApp(ListInnerAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListInnerAppHeaders headers = new ListInnerAppHeaders();
        return this.listInnerAppWithOptions(request, headers, runtime);
    }

    public ListInnerAppResponse listInnerAppWithOptions(ListInnerAppRequest request, ListInnerAppHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ecologicalCorpId)) {
            query.put("ecologicalCorpId", request.ecologicalCorpId);
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
        return TeaModel.toModel(this.doROARequest("ListInnerApp", "microApp_1.0", "HTTP", "GET", "AK", "/v1.0/microApp/apps", "json", req, runtime), new ListInnerAppResponse());
    }

    public ListInnerAppVersionResponse listInnerAppVersion(String agentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListInnerAppVersionHeaders headers = new ListInnerAppVersionHeaders();
        return this.listInnerAppVersionWithOptions(agentId, headers, runtime);
    }

    public ListInnerAppVersionResponse listInnerAppVersionWithOptions(String agentId, ListInnerAppVersionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        agentId = com.aliyun.openapiutil.Client.getEncodeParam(agentId);
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
        return TeaModel.toModel(this.doROARequest("ListInnerAppVersion", "microApp_1.0", "HTTP", "GET", "AK", "/v1.0/microApp/innerMiniApps/" + agentId + "/versions", "json", req, runtime), new ListInnerAppVersionResponse());
    }

    public ListRoleInfoByUserResponse listRoleInfoByUser(String agentId, String userId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListRoleInfoByUserHeaders headers = new ListRoleInfoByUserHeaders();
        return this.listRoleInfoByUserWithOptions(agentId, userId, headers, runtime);
    }

    public ListRoleInfoByUserResponse listRoleInfoByUserWithOptions(String agentId, String userId, ListRoleInfoByUserHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        agentId = com.aliyun.openapiutil.Client.getEncodeParam(agentId);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
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
        return TeaModel.toModel(this.doROARequest("ListRoleInfoByUser", "microApp_1.0", "HTTP", "GET", "AK", "/v1.0/microApp/apps/" + agentId + "/users/" + userId + "/roles", "json", req, runtime), new ListRoleInfoByUserResponse());
    }

    public ListUserVilebleAppResponse listUserVilebleApp(String userId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListUserVilebleAppHeaders headers = new ListUserVilebleAppHeaders();
        return this.listUserVilebleAppWithOptions(userId, headers, runtime);
    }

    public ListUserVilebleAppResponse listUserVilebleAppWithOptions(String userId, ListUserVilebleAppHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
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
        return TeaModel.toModel(this.doROARequest("ListUserVilebleApp", "microApp_1.0", "HTTP", "GET", "AK", "/v1.0/microApp/users/" + userId + "/apps", "json", req, runtime), new ListUserVilebleAppResponse());
    }

    public PageInnerAppHistoryVersionResponse pageInnerAppHistoryVersion(String agentId, PageInnerAppHistoryVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PageInnerAppHistoryVersionHeaders headers = new PageInnerAppHistoryVersionHeaders();
        return this.pageInnerAppHistoryVersionWithOptions(agentId, request, headers, runtime);
    }

    public PageInnerAppHistoryVersionResponse pageInnerAppHistoryVersionWithOptions(String agentId, PageInnerAppHistoryVersionRequest request, PageInnerAppHistoryVersionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        agentId = com.aliyun.openapiutil.Client.getEncodeParam(agentId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
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
        return TeaModel.toModel(this.doROARequest("PageInnerAppHistoryVersion", "microApp_1.0", "HTTP", "GET", "AK", "/v1.0/microApp/innerMiniApps/" + agentId + "/historyVersions", "json", req, runtime), new PageInnerAppHistoryVersionResponse());
    }

    public PublishInnerAppVersionResponse publishInnerAppVersion(String agentId, PublishInnerAppVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PublishInnerAppVersionHeaders headers = new PublishInnerAppVersionHeaders();
        return this.publishInnerAppVersionWithOptions(agentId, request, headers, runtime);
    }

    public PublishInnerAppVersionResponse publishInnerAppVersionWithOptions(String agentId, PublishInnerAppVersionRequest request, PublishInnerAppVersionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        agentId = com.aliyun.openapiutil.Client.getEncodeParam(agentId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.miniAppOnPc)) {
            body.put("miniAppOnPc", request.miniAppOnPc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opUnionId)) {
            body.put("opUnionId", request.opUnionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishType)) {
            body.put("publishType", request.publishType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            body.put("versionId", request.versionId);
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
        return TeaModel.toModel(this.doROARequest("PublishInnerAppVersion", "microApp_1.0", "HTTP", "POST", "AK", "/v1.0/microApp/innerMiniApps/" + agentId + "/versions/publish", "json", req, runtime), new PublishInnerAppVersionResponse());
    }

    public RebuildRoleScopeForAppRoleResponse rebuildRoleScopeForAppRole(String agentId, String roleId, RebuildRoleScopeForAppRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RebuildRoleScopeForAppRoleHeaders headers = new RebuildRoleScopeForAppRoleHeaders();
        return this.rebuildRoleScopeForAppRoleWithOptions(agentId, roleId, request, headers, runtime);
    }

    public RebuildRoleScopeForAppRoleResponse rebuildRoleScopeForAppRoleWithOptions(String agentId, String roleId, RebuildRoleScopeForAppRoleRequest request, RebuildRoleScopeForAppRoleHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        agentId = com.aliyun.openapiutil.Client.getEncodeParam(agentId);
        roleId = com.aliyun.openapiutil.Client.getEncodeParam(roleId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deptIdList)) {
            body.put("deptIdList", request.deptIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opUserId)) {
            body.put("opUserId", request.opUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopeType)) {
            body.put("scopeType", request.scopeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopeVersion)) {
            body.put("scopeVersion", request.scopeVersion);
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
        return TeaModel.toModel(this.doROARequest("RebuildRoleScopeForAppRole", "microApp_1.0", "HTTP", "POST", "AK", "/v1.0/microApp/apps/" + agentId + "/roles/" + roleId + "/scopes/rebuild", "json", req, runtime), new RebuildRoleScopeForAppRoleResponse());
    }

    public RegisterCustomAppRoleResponse registerCustomAppRole(String agentId, RegisterCustomAppRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RegisterCustomAppRoleHeaders headers = new RegisterCustomAppRoleHeaders();
        return this.registerCustomAppRoleWithOptions(agentId, request, headers, runtime);
    }

    public RegisterCustomAppRoleResponse registerCustomAppRoleWithOptions(String agentId, RegisterCustomAppRoleRequest request, RegisterCustomAppRoleHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        agentId = com.aliyun.openapiutil.Client.getEncodeParam(agentId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.canManageRole)) {
            body.put("canManageRole", request.canManageRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opUserId)) {
            body.put("opUserId", request.opUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("roleName", request.roleName);
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
        return TeaModel.toModel(this.doROARequest("RegisterCustomAppRole", "microApp_1.0", "HTTP", "POST", "AK", "/v1.0/microApp/apps/" + agentId + "/roles", "json", req, runtime), new RegisterCustomAppRoleResponse());
    }

    public RemoveApaasAppResponse removeApaasApp(RemoveApaasAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RemoveApaasAppHeaders headers = new RemoveApaasAppHeaders();
        return this.removeApaasAppWithOptions(request, headers, runtime);
    }

    public RemoveApaasAppResponse removeApaasAppWithOptions(RemoveApaasAppRequest request, RemoveApaasAppHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizAppId)) {
            body.put("bizAppId", request.bizAppId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opUserId)) {
            body.put("opUserId", request.opUserId);
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
        return TeaModel.toModel(this.doROARequest("RemoveApaasApp", "microApp_1.0", "HTTP", "POST", "AK", "/v1.0/microApp/apaasApps/remove", "json", req, runtime), new RemoveApaasAppResponse());
    }

    public RemoveMemberForAppRoleResponse removeMemberForAppRole(String agentId, String roleId, RemoveMemberForAppRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RemoveMemberForAppRoleHeaders headers = new RemoveMemberForAppRoleHeaders();
        return this.removeMemberForAppRoleWithOptions(agentId, roleId, request, headers, runtime);
    }

    public RemoveMemberForAppRoleResponse removeMemberForAppRoleWithOptions(String agentId, String roleId, RemoveMemberForAppRoleRequest request, RemoveMemberForAppRoleHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        agentId = com.aliyun.openapiutil.Client.getEncodeParam(agentId);
        roleId = com.aliyun.openapiutil.Client.getEncodeParam(roleId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deptIdList)) {
            body.put("deptIdList", request.deptIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opUserId)) {
            body.put("opUserId", request.opUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopeVersion)) {
            body.put("scopeVersion", request.scopeVersion);
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
        return TeaModel.toModel(this.doROARequest("RemoveMemberForAppRole", "microApp_1.0", "HTTP", "POST", "AK", "/v1.0/microApp/apps/" + agentId + "/roles/" + roleId + "/members/batchRemove", "json", req, runtime), new RemoveMemberForAppRoleResponse());
    }

    public RollbackInnerAppVersionResponse rollbackInnerAppVersion(String agentId, RollbackInnerAppVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RollbackInnerAppVersionHeaders headers = new RollbackInnerAppVersionHeaders();
        return this.rollbackInnerAppVersionWithOptions(agentId, request, headers, runtime);
    }

    public RollbackInnerAppVersionResponse rollbackInnerAppVersionWithOptions(String agentId, RollbackInnerAppVersionRequest request, RollbackInnerAppVersionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        agentId = com.aliyun.openapiutil.Client.getEncodeParam(agentId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opUnionId)) {
            body.put("opUnionId", request.opUnionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            body.put("versionId", request.versionId);
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
        return TeaModel.toModel(this.doROARequest("RollbackInnerAppVersion", "microApp_1.0", "HTTP", "POST", "AK", "/v1.0/microApp/innerMiniApps/" + agentId + "/versions/rollback", "json", req, runtime), new RollbackInnerAppVersionResponse());
    }

    public SetMicroAppScopeResponse setMicroAppScope(String agentId, SetMicroAppScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SetMicroAppScopeHeaders headers = new SetMicroAppScopeHeaders();
        return this.setMicroAppScopeWithOptions(agentId, request, headers, runtime);
    }

    public SetMicroAppScopeResponse setMicroAppScopeWithOptions(String agentId, SetMicroAppScopeRequest request, SetMicroAppScopeHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        agentId = com.aliyun.openapiutil.Client.getEncodeParam(agentId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addDeptIds)) {
            body.put("addDeptIds", request.addDeptIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addRoleIds)) {
            body.put("addRoleIds", request.addRoleIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addUserIds)) {
            body.put("addUserIds", request.addUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delDeptIds)) {
            body.put("delDeptIds", request.delDeptIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delRoleIds)) {
            body.put("delRoleIds", request.delRoleIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delUserIds)) {
            body.put("delUserIds", request.delUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlyAdminVisible)) {
            body.put("onlyAdminVisible", request.onlyAdminVisible);
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
        return TeaModel.toModel(this.doROARequest("SetMicroAppScope", "microApp_1.0", "HTTP", "POST", "AK", "/v1.0/microApp/apps/" + agentId + "/scopes", "json", req, runtime), new SetMicroAppScopeResponse());
    }

    public UpdateApaasAppResponse updateApaasApp(UpdateApaasAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateApaasAppHeaders headers = new UpdateApaasAppHeaders();
        return this.updateApaasAppWithOptions(request, headers, runtime);
    }

    public UpdateApaasAppResponse updateApaasAppWithOptions(UpdateApaasAppRequest request, UpdateApaasAppHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIcon)) {
            body.put("appIcon", request.appIcon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("appName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appStatus)) {
            body.put("appStatus", request.appStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizAppId)) {
            body.put("bizAppId", request.bizAppId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opUserId)) {
            body.put("opUserId", request.opUserId);
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
        return TeaModel.toModel(this.doROARequest("UpdateApaasApp", "microApp_1.0", "HTTP", "PUT", "AK", "/v1.0/microApp/apaasApps", "json", req, runtime), new UpdateApaasAppResponse());
    }

    public UpdateAppRoleInfoResponse updateAppRoleInfo(String agentId, String roleId, UpdateAppRoleInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateAppRoleInfoHeaders headers = new UpdateAppRoleInfoHeaders();
        return this.updateAppRoleInfoWithOptions(agentId, roleId, request, headers, runtime);
    }

    public UpdateAppRoleInfoResponse updateAppRoleInfoWithOptions(String agentId, String roleId, UpdateAppRoleInfoRequest request, UpdateAppRoleInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        agentId = com.aliyun.openapiutil.Client.getEncodeParam(agentId);
        roleId = com.aliyun.openapiutil.Client.getEncodeParam(roleId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.canManageRole)) {
            body.put("canManageRole", request.canManageRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newRoleName)) {
            body.put("newRoleName", request.newRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opUserId)) {
            body.put("opUserId", request.opUserId);
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
        return TeaModel.toModel(this.doROARequest("UpdateAppRoleInfo", "microApp_1.0", "HTTP", "PUT", "AK", "/v1.0/microApp/apps/" + agentId + "/roles/" + roleId + "", "json", req, runtime), new UpdateAppRoleInfoResponse());
    }

    public UpdateInnerAppResponse updateInnerApp(String agentId, UpdateInnerAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateInnerAppHeaders headers = new UpdateInnerAppHeaders();
        return this.updateInnerAppWithOptions(agentId, request, headers, runtime);
    }

    public UpdateInnerAppResponse updateInnerAppWithOptions(String agentId, UpdateInnerAppRequest request, UpdateInnerAppHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        agentId = com.aliyun.openapiutil.Client.getEncodeParam(agentId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            body.put("desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.homepageLink)) {
            body.put("homepageLink", request.homepageLink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.icon)) {
            body.put("icon", request.icon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipWhiteList)) {
            body.put("ipWhiteList", request.ipWhiteList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ompLink)) {
            body.put("ompLink", request.ompLink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opUnionId)) {
            body.put("opUnionId", request.opUnionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pcHomepageLink)) {
            body.put("pcHomepageLink", request.pcHomepageLink);
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
        return TeaModel.toModel(this.doROARequest("UpdateInnerApp", "microApp_1.0", "HTTP", "PUT", "AK", "/v1.0/microApp/apps/" + agentId + "", "json", req, runtime), new UpdateInnerAppResponse());
    }
}
