// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkproject_1_0;

import com.aliyun.tea.*;
import com.aliyun.dingtalkproject_1_0.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        if (com.aliyun.teautil.Common.empty(_endpoint)) {
            this._endpoint = "api.dingtalk.com";
        }

    }


    public AddProjectMemberResponse addProjectMember(String userId, String projectId, AddProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddProjectMemberHeaders headers = new AddProjectMemberHeaders();
        return this.addProjectMemberWithOptions(userId, projectId, request, headers, runtime);
    }

    public AddProjectMemberResponse addProjectMemberWithOptions(String userId, String projectId, AddProjectMemberRequest request, AddProjectMemberHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        projectId = com.aliyun.openapiutil.Client.getEncodeParam(projectId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
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
        return TeaModel.toModel(this.doROARequest("AddProjectMember", "project_1.0", "HTTP", "POST", "AK", "/v1.0/project/users/" + userId + "/projects/" + projectId + "/members", "json", req, runtime), new AddProjectMemberResponse());
    }

    public ArchiveProjectResponse archiveProject(String userId, String projectId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ArchiveProjectHeaders headers = new ArchiveProjectHeaders();
        return this.archiveProjectWithOptions(userId, projectId, headers, runtime);
    }

    public ArchiveProjectResponse archiveProjectWithOptions(String userId, String projectId, ArchiveProjectHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        projectId = com.aliyun.openapiutil.Client.getEncodeParam(projectId);
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
        return TeaModel.toModel(this.doROARequest("ArchiveProject", "project_1.0", "HTTP", "POST", "AK", "/v1.0/project/users/" + userId + "/projects/" + projectId + "/archive", "json", req, runtime), new ArchiveProjectResponse());
    }

    public ArchiveTaskResponse archiveTask(String userId, String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ArchiveTaskHeaders headers = new ArchiveTaskHeaders();
        return this.archiveTaskWithOptions(userId, taskId, headers, runtime);
    }

    public ArchiveTaskResponse archiveTaskWithOptions(String userId, String taskId, ArchiveTaskHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        taskId = com.aliyun.openapiutil.Client.getEncodeParam(taskId);
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
        return TeaModel.toModel(this.doROARequest("ArchiveTask", "project_1.0", "HTTP", "POST", "AK", "/v1.0/project/users/" + userId + "/tasks/" + taskId + "/archive", "json", req, runtime), new ArchiveTaskResponse());
    }

    public CreateOrganizationTaskResponse createOrganizationTask(String userId, CreateOrganizationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateOrganizationTaskHeaders headers = new CreateOrganizationTaskHeaders();
        return this.createOrganizationTaskWithOptions(userId, request, headers, runtime);
    }

    public CreateOrganizationTaskResponse createOrganizationTaskWithOptions(String userId, CreateOrganizationTaskRequest request, CreateOrganizationTaskHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTime)) {
            body.put("createTime", request.createTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableActivity)) {
            body.put("disableActivity", request.disableActivity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableNotification)) {
            body.put("disableNotification", request.disableNotification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dueDate)) {
            body.put("dueDate", request.dueDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executorId)) {
            body.put("executorId", request.executorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.involveMembers)) {
            body.put("involveMembers", request.involveMembers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            body.put("note", request.note);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visible)) {
            body.put("visible", request.visible);
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
        return TeaModel.toModel(this.doROARequest("CreateOrganizationTask", "project_1.0", "HTTP", "POST", "AK", "/v1.0/project/organizations/users/" + userId + "/tasks", "json", req, runtime), new CreateOrganizationTaskResponse());
    }

    public CreatePlanTimeResponse createPlanTime(String userId, CreatePlanTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreatePlanTimeHeaders headers = new CreatePlanTimeHeaders();
        return this.createPlanTimeWithOptions(userId, request, headers, runtime);
    }

    public CreatePlanTimeResponse createPlanTimeWithOptions(String userId, CreatePlanTimeRequest request, CreatePlanTimeHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantType)) {
            query.put("tenantType", request.tenantType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("endDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executorId)) {
            body.put("executorId", request.executorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includesHolidays)) {
            body.put("includesHolidays", request.includesHolidays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDuration)) {
            body.put("isDuration", request.isDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            body.put("objectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            body.put("objectType", request.objectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planTime)) {
            body.put("planTime", request.planTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("startDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.submitterId)) {
            body.put("submitterId", request.submitterId);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreatePlanTime", "project_1.0", "HTTP", "POST", "AK", "/v1.0/project/users/" + userId + "/planTimes", "json", req, runtime), new CreatePlanTimeResponse());
    }

    public CreateProjectResponse createProject(String userId, CreateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateProjectHeaders headers = new CreateProjectHeaders();
        return this.createProjectWithOptions(userId, request, headers, runtime);
    }

    public CreateProjectResponse createProjectWithOptions(String userId, CreateProjectRequest request, CreateProjectHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
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
        return TeaModel.toModel(this.doROARequest("CreateProject", "project_1.0", "HTTP", "POST", "AK", "/v1.0/project/users/" + userId + "/projects", "json", req, runtime), new CreateProjectResponse());
    }

    public CreateProjectByTemplateResponse createProjectByTemplate(String userId, CreateProjectByTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateProjectByTemplateHeaders headers = new CreateProjectByTemplateHeaders();
        return this.createProjectByTemplateWithOptions(userId, request, headers, runtime);
    }

    public CreateProjectByTemplateResponse createProjectByTemplateWithOptions(String userId, CreateProjectByTemplateRequest request, CreateProjectByTemplateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

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
        return TeaModel.toModel(this.doROARequest("CreateProjectByTemplate", "project_1.0", "HTTP", "POST", "AK", "/v1.0/project/users/" + userId + "/templates/projects", "json", req, runtime), new CreateProjectByTemplateResponse());
    }

    public CreateProjectCustomfieldStatusResponse createProjectCustomfieldStatus(String userId, String projectId, CreateProjectCustomfieldStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateProjectCustomfieldStatusHeaders headers = new CreateProjectCustomfieldStatusHeaders();
        return this.createProjectCustomfieldStatusWithOptions(userId, projectId, request, headers, runtime);
    }

    public CreateProjectCustomfieldStatusResponse createProjectCustomfieldStatusWithOptions(String userId, String projectId, CreateProjectCustomfieldStatusRequest request, CreateProjectCustomfieldStatusHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        projectId = com.aliyun.openapiutil.Client.getEncodeParam(projectId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customfieldId)) {
            body.put("customfieldId", request.customfieldId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customfieldInstanceId)) {
            body.put("customfieldInstanceId", request.customfieldInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customfieldName)) {
            body.put("customfieldName", request.customfieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("value", request.value);
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
        return TeaModel.toModel(this.doROARequest("CreateProjectCustomfieldStatus", "project_1.0", "HTTP", "PUT", "AK", "/v1.0/project/users/" + userId + "/projects/" + projectId + "/customfields", "json", req, runtime), new CreateProjectCustomfieldStatusResponse());
    }

    public CreateTaskResponse createTask(String userId, CreateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateTaskHeaders headers = new CreateTaskHeaders();
        return this.createTaskWithOptions(userId, request, headers, runtime);
    }

    public CreateTaskResponse createTaskWithOptions(String userId, CreateTaskRequest request, CreateTaskHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customfields)) {
            body.put("customfields", request.customfields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dueDate)) {
            body.put("dueDate", request.dueDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executorId)) {
            body.put("executorId", request.executorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            body.put("note", request.note);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentTaskId)) {
            body.put("parentTaskId", request.parentTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenariofieldconfigId)) {
            body.put("scenariofieldconfigId", request.scenariofieldconfigId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageId)) {
            body.put("stageId", request.stageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("startDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visible)) {
            body.put("visible", request.visible);
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
        return TeaModel.toModel(this.doROARequest("CreateTask", "project_1.0", "HTTP", "POST", "AK", "/v1.0/project/users/" + userId + "/tasks", "json", req, runtime), new CreateTaskResponse());
    }

    public CreateTaskObjectLinkResponse createTaskObjectLink(String userId, String taskId, CreateTaskObjectLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateTaskObjectLinkHeaders headers = new CreateTaskObjectLinkHeaders();
        return this.createTaskObjectLinkWithOptions(userId, taskId, request, headers, runtime);
    }

    public CreateTaskObjectLinkResponse createTaskObjectLinkWithOptions(String userId, String taskId, CreateTaskObjectLinkRequest request, CreateTaskObjectLinkHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        taskId = com.aliyun.openapiutil.Client.getEncodeParam(taskId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.linkedData)) {
            body.put("linkedData", request.linkedData);
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
        return TeaModel.toModel(this.doROARequest("CreateTaskObjectLink", "project_1.0", "HTTP", "POST", "AK", "/v1.0/project/users/" + userId + "/tasks/" + taskId + "/objectLinks", "json", req, runtime), new CreateTaskObjectLinkResponse());
    }

    public CreateWorkTimeResponse createWorkTime(String userId, CreateWorkTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateWorkTimeHeaders headers = new CreateWorkTimeHeaders();
        return this.createWorkTimeWithOptions(userId, request, headers, runtime);
    }

    public CreateWorkTimeResponse createWorkTimeWithOptions(String userId, CreateWorkTimeRequest request, CreateWorkTimeHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantType)) {
            query.put("tenantType", request.tenantType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("endDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executorId)) {
            body.put("executorId", request.executorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includesHolidays)) {
            body.put("includesHolidays", request.includesHolidays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDuration)) {
            body.put("isDuration", request.isDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            body.put("objectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            body.put("objectType", request.objectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("startDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.submitterId)) {
            body.put("submitterId", request.submitterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workTime)) {
            body.put("workTime", request.workTime);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateWorkTime", "project_1.0", "HTTP", "POST", "AK", "/v1.0/project/users/" + userId + "/workTimes", "json", req, runtime), new CreateWorkTimeResponse());
    }

    public DeleteProjectMemberResponse deleteProjectMember(String userId, String projectId, DeleteProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteProjectMemberHeaders headers = new DeleteProjectMemberHeaders();
        return this.deleteProjectMemberWithOptions(userId, projectId, request, headers, runtime);
    }

    public DeleteProjectMemberResponse deleteProjectMemberWithOptions(String userId, String projectId, DeleteProjectMemberRequest request, DeleteProjectMemberHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        projectId = com.aliyun.openapiutil.Client.getEncodeParam(projectId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
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
        return TeaModel.toModel(this.doROARequest("DeleteProjectMember", "project_1.0", "HTTP", "POST", "AK", "/v1.0/project/users/" + userId + "/projects/" + projectId + "/members/remove", "json", req, runtime), new DeleteProjectMemberResponse());
    }

    public DeleteTaskResponse deleteTask(String userId, String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteTaskHeaders headers = new DeleteTaskHeaders();
        return this.deleteTaskWithOptions(userId, taskId, headers, runtime);
    }

    public DeleteTaskResponse deleteTaskWithOptions(String userId, String taskId, DeleteTaskHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        taskId = com.aliyun.openapiutil.Client.getEncodeParam(taskId);
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
        return TeaModel.toModel(this.doROARequest("DeleteTask", "project_1.0", "HTTP", "DELETE", "AK", "/v1.0/project/users/" + userId + "/tasks/" + taskId + "", "json", req, runtime), new DeleteTaskResponse());
    }

    public GetDeptsByOrgIdResponse getDeptsByOrgId(GetDeptsByOrgIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetDeptsByOrgIdHeaders headers = new GetDeptsByOrgIdHeaders();
        return this.getDeptsByOrgIdWithOptions(request, headers, runtime);
    }

    public GetDeptsByOrgIdResponse getDeptsByOrgIdWithOptions(GetDeptsByOrgIdRequest request, GetDeptsByOrgIdHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.dingAccessTokenType)) {
            realHeaders.put("dingAccessTokenType", com.aliyun.teautil.Common.toJSONString(headers.dingAccessTokenType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.dingOrgId)) {
            realHeaders.put("dingOrgId", com.aliyun.teautil.Common.toJSONString(headers.dingOrgId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetDeptsByOrgId", "project_1.0", "HTTP", "GET", "AK", "/v1.0/project/orgs/depts", "json", req, runtime), new GetDeptsByOrgIdResponse());
    }

    public GetEmpsByOrgIdResponse getEmpsByOrgId(GetEmpsByOrgIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetEmpsByOrgIdHeaders headers = new GetEmpsByOrgIdHeaders();
        return this.getEmpsByOrgIdWithOptions(request, headers, runtime);
    }

    public GetEmpsByOrgIdResponse getEmpsByOrgIdWithOptions(GetEmpsByOrgIdRequest request, GetEmpsByOrgIdHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needDept)) {
            query.put("needDept", request.needDept);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.dingAccessTokenType)) {
            realHeaders.put("dingAccessTokenType", com.aliyun.teautil.Common.toJSONString(headers.dingAccessTokenType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.dingOrgId)) {
            realHeaders.put("dingOrgId", com.aliyun.teautil.Common.toJSONString(headers.dingOrgId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetEmpsByOrgId", "project_1.0", "HTTP", "GET", "AK", "/v1.0/project/orgs/employees", "json", req, runtime), new GetEmpsByOrgIdResponse());
    }

    public GetOrganizatioTaskByIdsResponse getOrganizatioTaskByIds(String userId, GetOrganizatioTaskByIdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetOrganizatioTaskByIdsHeaders headers = new GetOrganizatioTaskByIdsHeaders();
        return this.getOrganizatioTaskByIdsWithOptions(userId, request, headers, runtime);
    }

    public GetOrganizatioTaskByIdsResponse getOrganizatioTaskByIdsWithOptions(String userId, GetOrganizatioTaskByIdsRequest request, GetOrganizatioTaskByIdsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskIds)) {
            query.put("taskIds", request.taskIds);
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
        return TeaModel.toModel(this.doROARequest("GetOrganizatioTaskByIds", "project_1.0", "HTTP", "GET", "AK", "/v1.0/project/organizations/users/" + userId + "/tasks", "json", req, runtime), new GetOrganizatioTaskByIdsResponse());
    }

    public GetOrganizationPriorityListResponse getOrganizationPriorityList(String userId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetOrganizationPriorityListHeaders headers = new GetOrganizationPriorityListHeaders();
        return this.getOrganizationPriorityListWithOptions(userId, headers, runtime);
    }

    public GetOrganizationPriorityListResponse getOrganizationPriorityListWithOptions(String userId, GetOrganizationPriorityListHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
        return TeaModel.toModel(this.doROARequest("GetOrganizationPriorityList", "project_1.0", "HTTP", "GET", "AK", "/v1.0/project/organizations/users/" + userId + "/priorities", "json", req, runtime), new GetOrganizationPriorityListResponse());
    }

    public GetOrganizationTaskResponse getOrganizationTask(String taskId, String userId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetOrganizationTaskHeaders headers = new GetOrganizationTaskHeaders();
        return this.getOrganizationTaskWithOptions(taskId, userId, headers, runtime);
    }

    public GetOrganizationTaskResponse getOrganizationTaskWithOptions(String taskId, String userId, GetOrganizationTaskHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        taskId = com.aliyun.openapiutil.Client.getEncodeParam(taskId);
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
        return TeaModel.toModel(this.doROARequest("GetOrganizationTask", "project_1.0", "HTTP", "GET", "AK", "/v1.0/project/organizations/users/" + userId + "/tasks/" + taskId + "", "json", req, runtime), new GetOrganizationTaskResponse());
    }

    public GetProjectGroupResponse getProjectGroup(String userId, GetProjectGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetProjectGroupHeaders headers = new GetProjectGroupHeaders();
        return this.getProjectGroupWithOptions(userId, request, headers, runtime);
    }

    public GetProjectGroupResponse getProjectGroupWithOptions(String userId, GetProjectGroupRequest request, GetProjectGroupHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.viewerId)) {
            query.put("viewerId", request.viewerId);
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
        return TeaModel.toModel(this.doROARequest("GetProjectGroup", "project_1.0", "HTTP", "GET", "AK", "/v1.0/project/organizations/users/" + userId + "/groups", "json", req, runtime), new GetProjectGroupResponse());
    }

    public GetProjectMemebersResponse getProjectMemebers(String userId, String projectId, GetProjectMemebersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetProjectMemebersHeaders headers = new GetProjectMemebersHeaders();
        return this.getProjectMemebersWithOptions(userId, projectId, request, headers, runtime);
    }

    public GetProjectMemebersResponse getProjectMemebersWithOptions(String userId, String projectId, GetProjectMemebersRequest request, GetProjectMemebersHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        projectId = com.aliyun.openapiutil.Client.getEncodeParam(projectId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectRoleId)) {
            query.put("projectRoleId", request.projectRoleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skip)) {
            query.put("skip", request.skip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            query.put("userIds", request.userIds);
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
        return TeaModel.toModel(this.doROARequest("GetProjectMemebers", "project_1.0", "HTTP", "GET", "AK", "/v1.0/project/users/" + userId + "/projects/" + projectId + "/members", "json", req, runtime), new GetProjectMemebersResponse());
    }

    public GetProjectStatusListResponse getProjectStatusList(String userId, String projectId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetProjectStatusListHeaders headers = new GetProjectStatusListHeaders();
        return this.getProjectStatusListWithOptions(userId, projectId, headers, runtime);
    }

    public GetProjectStatusListResponse getProjectStatusListWithOptions(String userId, String projectId, GetProjectStatusListHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        projectId = com.aliyun.openapiutil.Client.getEncodeParam(projectId);
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
        return TeaModel.toModel(this.doROARequest("GetProjectStatusList", "project_1.0", "HTTP", "GET", "AK", "/v1.0/project/users/" + userId + "/projects/" + projectId + "/statuses", "json", req, runtime), new GetProjectStatusListResponse());
    }

    public GetTaskByIdsResponse getTaskByIds(String userId, GetTaskByIdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetTaskByIdsHeaders headers = new GetTaskByIdsHeaders();
        return this.getTaskByIdsWithOptions(userId, request, headers, runtime);
    }

    public GetTaskByIdsResponse getTaskByIdsWithOptions(String userId, GetTaskByIdsRequest request, GetTaskByIdsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.parentTaskId)) {
            query.put("parentTaskId", request.parentTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
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
        return TeaModel.toModel(this.doROARequest("GetTaskByIds", "project_1.0", "HTTP", "GET", "AK", "/v1.0/project/users/" + userId + "/tasks", "json", req, runtime), new GetTaskByIdsResponse());
    }

    public GetTbOrgIdByDingOrgIdResponse getTbOrgIdByDingOrgId(GetTbOrgIdByDingOrgIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetTbOrgIdByDingOrgIdHeaders headers = new GetTbOrgIdByDingOrgIdHeaders();
        return this.getTbOrgIdByDingOrgIdWithOptions(request, headers, runtime);
    }

    public GetTbOrgIdByDingOrgIdResponse getTbOrgIdByDingOrgIdWithOptions(GetTbOrgIdByDingOrgIdRequest request, GetTbOrgIdByDingOrgIdHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.optUserId)) {
            query.put("optUserId", request.optUserId);
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
        return TeaModel.toModel(this.doROARequest("GetTbOrgIdByDingOrgId", "project_1.0", "HTTP", "GET", "AK", "/v1.0/project/teambition/organizations", "json", req, runtime), new GetTbOrgIdByDingOrgIdResponse());
    }

    public GetTbProjectGrayResponse getTbProjectGray(GetTbProjectGrayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetTbProjectGrayHeaders headers = new GetTbProjectGrayHeaders();
        return this.getTbProjectGrayWithOptions(request, headers, runtime);
    }

    public GetTbProjectGrayResponse getTbProjectGrayWithOptions(GetTbProjectGrayRequest request, GetTbProjectGrayHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            body.put("label", request.label);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.dingAccessTokenType)) {
            realHeaders.put("dingAccessTokenType", com.aliyun.teautil.Common.toJSONString(headers.dingAccessTokenType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.dingCorpId)) {
            realHeaders.put("dingCorpId", com.aliyun.teautil.Common.toJSONString(headers.dingCorpId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.dingIsvOrgId)) {
            realHeaders.put("dingIsvOrgId", com.aliyun.teautil.Common.toJSONString(headers.dingIsvOrgId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.dingOrgId)) {
            realHeaders.put("dingOrgId", com.aliyun.teautil.Common.toJSONString(headers.dingOrgId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.dingSuiteKey)) {
            realHeaders.put("dingSuiteKey", com.aliyun.teautil.Common.toJSONString(headers.dingSuiteKey));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("GetTbProjectGray", "project_1.0", "HTTP", "POST", "AK", "/v1.0/project/projects/gray", "json", req, runtime), new GetTbProjectGrayResponse());
    }

    public GetTbProjectSourceResponse getTbProjectSource() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetTbProjectSourceHeaders headers = new GetTbProjectSourceHeaders();
        return this.getTbProjectSourceWithOptions(headers, runtime);
    }

    public GetTbProjectSourceResponse getTbProjectSourceWithOptions(GetTbProjectSourceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.dingAccessTokenType)) {
            realHeaders.put("dingAccessTokenType", com.aliyun.teautil.Common.toJSONString(headers.dingAccessTokenType));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.dingCorpId)) {
            realHeaders.put("dingCorpId", com.aliyun.teautil.Common.toJSONString(headers.dingCorpId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.dingIsvOrgId)) {
            realHeaders.put("dingIsvOrgId", com.aliyun.teautil.Common.toJSONString(headers.dingIsvOrgId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.dingOrgId)) {
            realHeaders.put("dingOrgId", com.aliyun.teautil.Common.toJSONString(headers.dingOrgId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.dingSuiteKey)) {
            realHeaders.put("dingSuiteKey", com.aliyun.teautil.Common.toJSONString(headers.dingSuiteKey));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        return TeaModel.toModel(this.doROARequest("GetTbProjectSource", "project_1.0", "HTTP", "POST", "AK", "/v1.0/project/projects/source", "json", req, runtime), new GetTbProjectSourceResponse());
    }

    public GetTbUserIdByStaffIdResponse getTbUserIdByStaffId(GetTbUserIdByStaffIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetTbUserIdByStaffIdHeaders headers = new GetTbUserIdByStaffIdHeaders();
        return this.getTbUserIdByStaffIdWithOptions(request, headers, runtime);
    }

    public GetTbUserIdByStaffIdResponse getTbUserIdByStaffIdWithOptions(GetTbUserIdByStaffIdRequest request, GetTbUserIdByStaffIdHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.optUserId)) {
            query.put("optUserId", request.optUserId);
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
        return TeaModel.toModel(this.doROARequest("GetTbUserIdByStaffId", "project_1.0", "HTTP", "GET", "AK", "/v1.0/project/teambition/users", "json", req, runtime), new GetTbUserIdByStaffIdResponse());
    }

    public GetUserJoinedProjectResponse getUserJoinedProject(String userId, GetUserJoinedProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetUserJoinedProjectHeaders headers = new GetUserJoinedProjectHeaders();
        return this.getUserJoinedProjectWithOptions(userId, request, headers, runtime);
    }

    public GetUserJoinedProjectResponse getUserJoinedProjectWithOptions(String userId, GetUserJoinedProjectRequest request, GetUserJoinedProjectHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
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
        return TeaModel.toModel(this.doROARequest("GetUserJoinedProject", "project_1.0", "HTTP", "GET", "AK", "/v1.0/project/users/" + userId + "/joinProjects", "json", req, runtime), new GetUserJoinedProjectResponse());
    }

    public QueryProjectResponse queryProject(String userId, QueryProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryProjectHeaders headers = new QueryProjectHeaders();
        return this.queryProjectWithOptions(userId, request, headers, runtime);
    }

    public QueryProjectResponse queryProjectWithOptions(String userId, QueryProjectRequest request, QueryProjectHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIds)) {
            query.put("projectIds", request.projectIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("sourceId", request.sourceId);
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
        return TeaModel.toModel(this.doROARequest("QueryProject", "project_1.0", "HTTP", "POST", "AK", "/v1.0/project/users/" + userId + "/projects/query", "json", req, runtime), new QueryProjectResponse());
    }

    public QueryTaskOfProjectResponse queryTaskOfProject(String userId, String projectId, QueryTaskOfProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryTaskOfProjectHeaders headers = new QueryTaskOfProjectHeaders();
        return this.queryTaskOfProjectWithOptions(userId, projectId, request, headers, runtime);
    }

    public QueryTaskOfProjectResponse queryTaskOfProjectWithOptions(String userId, String projectId, QueryTaskOfProjectRequest request, QueryTaskOfProjectHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        projectId = com.aliyun.openapiutil.Client.getEncodeParam(projectId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
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
        return TeaModel.toModel(this.doROARequest("QueryTaskOfProject", "project_1.0", "HTTP", "GET", "AK", "/v1.0/project/users/" + userId + "/projectIds/" + projectId + "/tasks", "json", req, runtime), new QueryTaskOfProjectResponse());
    }

    public SeachTaskStageResponse seachTaskStage(String userId, String projectId, SeachTaskStageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SeachTaskStageHeaders headers = new SeachTaskStageHeaders();
        return this.seachTaskStageWithOptions(userId, projectId, request, headers, runtime);
    }

    public SeachTaskStageResponse seachTaskStageWithOptions(String userId, String projectId, SeachTaskStageRequest request, SeachTaskStageHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        projectId = com.aliyun.openapiutil.Client.getEncodeParam(projectId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stageIds)) {
            query.put("stageIds", request.stageIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskListId)) {
            query.put("taskListId", request.taskListId);
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
        return TeaModel.toModel(this.doROARequest("SeachTaskStage", "project_1.0", "HTTP", "POST", "AK", "/v1.0/project/users/" + userId + "/projects/" + projectId + "/taskStages/search", "json", req, runtime), new SeachTaskStageResponse());
    }

    public SearchOranizationCustomfieldResponse searchOranizationCustomfield(String userId, SearchOranizationCustomfieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SearchOranizationCustomfieldHeaders headers = new SearchOranizationCustomfieldHeaders();
        return this.searchOranizationCustomfieldWithOptions(userId, request, headers, runtime);
    }

    public SearchOranizationCustomfieldResponse searchOranizationCustomfieldWithOptions(String userId, SearchOranizationCustomfieldRequest request, SearchOranizationCustomfieldHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customfieldIds)) {
            query.put("customfieldIds", request.customfieldIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("instanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIds)) {
            query.put("projectIds", request.projectIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("scope", request.scope);
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
        return TeaModel.toModel(this.doROARequest("SearchOranizationCustomfield", "project_1.0", "HTTP", "POST", "AK", "/v1.0/project/organizations/users/" + userId + "/customfields/search", "json", req, runtime), new SearchOranizationCustomfieldResponse());
    }

    public SearchProjectCustomfieldResponse searchProjectCustomfield(String userId, String projectId, SearchProjectCustomfieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SearchProjectCustomfieldHeaders headers = new SearchProjectCustomfieldHeaders();
        return this.searchProjectCustomfieldWithOptions(userId, projectId, request, headers, runtime);
    }

    public SearchProjectCustomfieldResponse searchProjectCustomfieldWithOptions(String userId, String projectId, SearchProjectCustomfieldRequest request, SearchProjectCustomfieldHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        projectId = com.aliyun.openapiutil.Client.getEncodeParam(projectId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customfieldIds)) {
            query.put("customfieldIds", request.customfieldIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("instanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenariofieldconfigId)) {
            query.put("scenariofieldconfigId", request.scenariofieldconfigId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("scope", request.scope);
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
        return TeaModel.toModel(this.doROARequest("SearchProjectCustomfield", "project_1.0", "HTTP", "POST", "AK", "/v1.0/project/users/" + userId + "/projects/" + projectId + "/customfields/search", "json", req, runtime), new SearchProjectCustomfieldResponse());
    }

    public SearchProjectTemplateResponse searchProjectTemplate(String userId, SearchProjectTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SearchProjectTemplateHeaders headers = new SearchProjectTemplateHeaders();
        return this.searchProjectTemplateWithOptions(userId, request, headers, runtime);
    }

    public SearchProjectTemplateResponse searchProjectTemplateWithOptions(String userId, SearchProjectTemplateRequest request, SearchProjectTemplateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
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
        return TeaModel.toModel(this.doROARequest("SearchProjectTemplate", "project_1.0", "HTTP", "GET", "AK", "/v1.0/project/organizations/users/" + userId + "/templates", "json", req, runtime), new SearchProjectTemplateResponse());
    }

    public SearchTaskFlowResponse searchTaskFlow(String userId, String projectId, SearchTaskFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SearchTaskFlowHeaders headers = new SearchTaskFlowHeaders();
        return this.searchTaskFlowWithOptions(userId, projectId, request, headers, runtime);
    }

    public SearchTaskFlowResponse searchTaskFlowWithOptions(String userId, String projectId, SearchTaskFlowRequest request, SearchTaskFlowHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        projectId = com.aliyun.openapiutil.Client.getEncodeParam(projectId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskflowIds)) {
            query.put("taskflowIds", request.taskflowIds);
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
        return TeaModel.toModel(this.doROARequest("SearchTaskFlow", "project_1.0", "HTTP", "POST", "AK", "/v1.0/project/users/" + userId + "/projects/" + projectId + "/taskflows/search", "json", req, runtime), new SearchTaskFlowResponse());
    }

    public SearchTaskListResponse searchTaskList(String userId, String projectId, SearchTaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SearchTaskListHeaders headers = new SearchTaskListHeaders();
        return this.searchTaskListWithOptions(userId, projectId, request, headers, runtime);
    }

    public SearchTaskListResponse searchTaskListWithOptions(String userId, String projectId, SearchTaskListRequest request, SearchTaskListHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        projectId = com.aliyun.openapiutil.Client.getEncodeParam(projectId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskListIds)) {
            query.put("taskListIds", request.taskListIds);
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
        return TeaModel.toModel(this.doROARequest("SearchTaskList", "project_1.0", "HTTP", "POST", "AK", "/v1.0/project/users/" + userId + "/projects/" + projectId + "/taskLists/search", "json", req, runtime), new SearchTaskListResponse());
    }

    public SearchTaskflowStatusResponse searchTaskflowStatus(String userId, String projectId, SearchTaskflowStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SearchTaskflowStatusHeaders headers = new SearchTaskflowStatusHeaders();
        return this.searchTaskflowStatusWithOptions(userId, projectId, request, headers, runtime);
    }

    public SearchTaskflowStatusResponse searchTaskflowStatusWithOptions(String userId, String projectId, SearchTaskflowStatusRequest request, SearchTaskflowStatusHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        projectId = com.aliyun.openapiutil.Client.getEncodeParam(projectId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tfIds)) {
            query.put("tfIds", request.tfIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tfsIds)) {
            query.put("tfsIds", request.tfsIds);
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
        return TeaModel.toModel(this.doROARequest("SearchTaskflowStatus", "project_1.0", "HTTP", "GET", "AK", "/v1.0/project/users/" + userId + "/projects/" + projectId + "/taskflowStatuses/search", "json", req, runtime), new SearchTaskflowStatusResponse());
    }

    public SearchUserTaskResponse searchUserTask(String userId, SearchUserTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SearchUserTaskHeaders headers = new SearchUserTaskHeaders();
        return this.searchUserTaskWithOptions(userId, request, headers, runtime);
    }

    public SearchUserTaskResponse searchUserTaskWithOptions(String userId, SearchUserTaskRequest request, SearchUserTaskHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tql)) {
            query.put("tql", request.tql);
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
        return TeaModel.toModel(this.doROARequest("SearchUserTask", "project_1.0", "HTTP", "POST", "AK", "/v1.0/project/users/" + userId + "/tasks/search", "json", req, runtime), new SearchUserTaskResponse());
    }

    public SuspendProjectResponse suspendProject(String projectId, String userId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SuspendProjectHeaders headers = new SuspendProjectHeaders();
        return this.suspendProjectWithOptions(projectId, userId, headers, runtime);
    }

    public SuspendProjectResponse suspendProjectWithOptions(String projectId, String userId, SuspendProjectHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        projectId = com.aliyun.openapiutil.Client.getEncodeParam(projectId);
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
        return TeaModel.toModel(this.doROARequest("SuspendProject", "project_1.0", "HTTP", "POST", "AK", "/v1.0/project/users/" + userId + "/projects/" + projectId + "/suspend", "json", req, runtime), new SuspendProjectResponse());
    }

    public UnSuspendProjectResponse unSuspendProject(String projectId, String userId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UnSuspendProjectHeaders headers = new UnSuspendProjectHeaders();
        return this.unSuspendProjectWithOptions(projectId, userId, headers, runtime);
    }

    public UnSuspendProjectResponse unSuspendProjectWithOptions(String projectId, String userId, UnSuspendProjectHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        projectId = com.aliyun.openapiutil.Client.getEncodeParam(projectId);
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
        return TeaModel.toModel(this.doROARequest("UnSuspendProject", "project_1.0", "HTTP", "POST", "AK", "/v1.0/project/users/" + userId + "/projects/" + projectId + "/unsuspend", "json", req, runtime), new UnSuspendProjectResponse());
    }

    public UpdateCustomfieldValueResponse updateCustomfieldValue(String userId, String taskId, UpdateCustomfieldValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateCustomfieldValueHeaders headers = new UpdateCustomfieldValueHeaders();
        return this.updateCustomfieldValueWithOptions(userId, taskId, request, headers, runtime);
    }

    public UpdateCustomfieldValueResponse updateCustomfieldValueWithOptions(String userId, String taskId, UpdateCustomfieldValueRequest request, UpdateCustomfieldValueHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        taskId = com.aliyun.openapiutil.Client.getEncodeParam(taskId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customfieldId)) {
            body.put("customfieldId", request.customfieldId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customfieldName)) {
            body.put("customfieldName", request.customfieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("value", request.value);
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
        return TeaModel.toModel(this.doROARequest("UpdateCustomfieldValue", "project_1.0", "HTTP", "PUT", "AK", "/v1.0/project/users/" + userId + "/tasks/" + taskId + "/customFields", "json", req, runtime), new UpdateCustomfieldValueResponse());
    }

    public UpdateOrganizationTaskContentResponse updateOrganizationTaskContent(String taskId, String userId, UpdateOrganizationTaskContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateOrganizationTaskContentHeaders headers = new UpdateOrganizationTaskContentHeaders();
        return this.updateOrganizationTaskContentWithOptions(taskId, userId, request, headers, runtime);
    }

    public UpdateOrganizationTaskContentResponse updateOrganizationTaskContentWithOptions(String taskId, String userId, UpdateOrganizationTaskContentRequest request, UpdateOrganizationTaskContentHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        taskId = com.aliyun.openapiutil.Client.getEncodeParam(taskId);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableActivity)) {
            body.put("disableActivity", request.disableActivity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableNotification)) {
            body.put("disableNotification", request.disableNotification);
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
        return TeaModel.toModel(this.doROARequest("UpdateOrganizationTaskContent", "project_1.0", "HTTP", "PUT", "AK", "/v1.0/project/organizations/users/" + userId + "/tasks/" + taskId + "/contents", "json", req, runtime), new UpdateOrganizationTaskContentResponse());
    }

    public UpdateOrganizationTaskDueDateResponse updateOrganizationTaskDueDate(String taskId, String userId, UpdateOrganizationTaskDueDateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateOrganizationTaskDueDateHeaders headers = new UpdateOrganizationTaskDueDateHeaders();
        return this.updateOrganizationTaskDueDateWithOptions(taskId, userId, request, headers, runtime);
    }

    public UpdateOrganizationTaskDueDateResponse updateOrganizationTaskDueDateWithOptions(String taskId, String userId, UpdateOrganizationTaskDueDateRequest request, UpdateOrganizationTaskDueDateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        taskId = com.aliyun.openapiutil.Client.getEncodeParam(taskId);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disableActivity)) {
            body.put("disableActivity", request.disableActivity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableNotification)) {
            body.put("disableNotification", request.disableNotification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dueDate)) {
            body.put("dueDate", request.dueDate);
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
        return TeaModel.toModel(this.doROARequest("UpdateOrganizationTaskDueDate", "project_1.0", "HTTP", "PUT", "AK", "/v1.0/project/organizations/users/" + userId + "/tasks/" + taskId + "/dueDates", "json", req, runtime), new UpdateOrganizationTaskDueDateResponse());
    }

    public UpdateOrganizationTaskExecutorResponse updateOrganizationTaskExecutor(String taskId, String userId, UpdateOrganizationTaskExecutorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateOrganizationTaskExecutorHeaders headers = new UpdateOrganizationTaskExecutorHeaders();
        return this.updateOrganizationTaskExecutorWithOptions(taskId, userId, request, headers, runtime);
    }

    public UpdateOrganizationTaskExecutorResponse updateOrganizationTaskExecutorWithOptions(String taskId, String userId, UpdateOrganizationTaskExecutorRequest request, UpdateOrganizationTaskExecutorHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        taskId = com.aliyun.openapiutil.Client.getEncodeParam(taskId);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disableActivity)) {
            body.put("disableActivity", request.disableActivity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableNotification)) {
            body.put("disableNotification", request.disableNotification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executorId)) {
            body.put("executorId", request.executorId);
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
        return TeaModel.toModel(this.doROARequest("UpdateOrganizationTaskExecutor", "project_1.0", "HTTP", "PUT", "AK", "/v1.0/project/organizations/users/" + userId + "/tasks/" + taskId + "/executors", "json", req, runtime), new UpdateOrganizationTaskExecutorResponse());
    }

    public UpdateOrganizationTaskInvolveMembersResponse updateOrganizationTaskInvolveMembers(String taskId, String userId, UpdateOrganizationTaskInvolveMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateOrganizationTaskInvolveMembersHeaders headers = new UpdateOrganizationTaskInvolveMembersHeaders();
        return this.updateOrganizationTaskInvolveMembersWithOptions(taskId, userId, request, headers, runtime);
    }

    public UpdateOrganizationTaskInvolveMembersResponse updateOrganizationTaskInvolveMembersWithOptions(String taskId, String userId, UpdateOrganizationTaskInvolveMembersRequest request, UpdateOrganizationTaskInvolveMembersHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        taskId = com.aliyun.openapiutil.Client.getEncodeParam(taskId);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addInvolvers)) {
            body.put("addInvolvers", request.addInvolvers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delInvolvers)) {
            body.put("delInvolvers", request.delInvolvers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableActivity)) {
            body.put("disableActivity", request.disableActivity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableNotification)) {
            body.put("disableNotification", request.disableNotification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.involveMembers)) {
            body.put("involveMembers", request.involveMembers);
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
        return TeaModel.toModel(this.doROARequest("UpdateOrganizationTaskInvolveMembers", "project_1.0", "HTTP", "PUT", "AK", "/v1.0/project/organizations/users/" + userId + "/tasks/" + taskId + "/involveMembers", "json", req, runtime), new UpdateOrganizationTaskInvolveMembersResponse());
    }

    public UpdateOrganizationTaskNoteResponse updateOrganizationTaskNote(String taskId, String userId, UpdateOrganizationTaskNoteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateOrganizationTaskNoteHeaders headers = new UpdateOrganizationTaskNoteHeaders();
        return this.updateOrganizationTaskNoteWithOptions(taskId, userId, request, headers, runtime);
    }

    public UpdateOrganizationTaskNoteResponse updateOrganizationTaskNoteWithOptions(String taskId, String userId, UpdateOrganizationTaskNoteRequest request, UpdateOrganizationTaskNoteHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        taskId = com.aliyun.openapiutil.Client.getEncodeParam(taskId);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disableActivity)) {
            body.put("disableActivity", request.disableActivity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableNotification)) {
            body.put("disableNotification", request.disableNotification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            body.put("note", request.note);
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
        return TeaModel.toModel(this.doROARequest("UpdateOrganizationTaskNote", "project_1.0", "HTTP", "PUT", "AK", "/v1.0/project/organizations/users/" + userId + "/tasks/" + taskId + "/notes", "json", req, runtime), new UpdateOrganizationTaskNoteResponse());
    }

    public UpdateOrganizationTaskPriorityResponse updateOrganizationTaskPriority(String taskId, String userId, UpdateOrganizationTaskPriorityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateOrganizationTaskPriorityHeaders headers = new UpdateOrganizationTaskPriorityHeaders();
        return this.updateOrganizationTaskPriorityWithOptions(taskId, userId, request, headers, runtime);
    }

    public UpdateOrganizationTaskPriorityResponse updateOrganizationTaskPriorityWithOptions(String taskId, String userId, UpdateOrganizationTaskPriorityRequest request, UpdateOrganizationTaskPriorityHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        taskId = com.aliyun.openapiutil.Client.getEncodeParam(taskId);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disableActivity)) {
            body.put("disableActivity", request.disableActivity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableNotification)) {
            body.put("disableNotification", request.disableNotification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("priority", request.priority);
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
        return TeaModel.toModel(this.doROARequest("UpdateOrganizationTaskPriority", "project_1.0", "HTTP", "PUT", "AK", "/v1.0/project/organizations/users/" + userId + "/tasks/" + taskId + "/priorities", "json", req, runtime), new UpdateOrganizationTaskPriorityResponse());
    }

    public UpdateOrganizationTaskStatusResponse updateOrganizationTaskStatus(String taskId, String userId, UpdateOrganizationTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateOrganizationTaskStatusHeaders headers = new UpdateOrganizationTaskStatusHeaders();
        return this.updateOrganizationTaskStatusWithOptions(taskId, userId, request, headers, runtime);
    }

    public UpdateOrganizationTaskStatusResponse updateOrganizationTaskStatusWithOptions(String taskId, String userId, UpdateOrganizationTaskStatusRequest request, UpdateOrganizationTaskStatusHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        taskId = com.aliyun.openapiutil.Client.getEncodeParam(taskId);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disableActivity)) {
            body.put("disableActivity", request.disableActivity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableNotification)) {
            body.put("disableNotification", request.disableNotification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDone)) {
            body.put("isDone", request.isDone);
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
        return TeaModel.toModel(this.doROARequest("UpdateOrganizationTaskStatus", "project_1.0", "HTTP", "PUT", "AK", "/v1.0/project/organizations/users/" + userId + "/tasks/" + taskId + "/states", "json", req, runtime), new UpdateOrganizationTaskStatusResponse());
    }

    public UpdateProjectGroupResponse updateProjectGroup(String userId, String projectId, UpdateProjectGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateProjectGroupHeaders headers = new UpdateProjectGroupHeaders();
        return this.updateProjectGroupWithOptions(userId, projectId, request, headers, runtime);
    }

    public UpdateProjectGroupResponse updateProjectGroupWithOptions(String userId, String projectId, UpdateProjectGroupRequest request, UpdateProjectGroupHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        projectId = com.aliyun.openapiutil.Client.getEncodeParam(projectId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addProjectGroupIds)) {
            body.put("addProjectGroupIds", request.addProjectGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delProjectGroupIds)) {
            body.put("delProjectGroupIds", request.delProjectGroupIds);
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
        return TeaModel.toModel(this.doROARequest("UpdateProjectGroup", "project_1.0", "HTTP", "PUT", "AK", "/v1.0/project/users/" + userId + "/projects/" + projectId + "/groups", "json", req, runtime), new UpdateProjectGroupResponse());
    }

    public UpdateTaskContentResponse updateTaskContent(String userId, String taskId, UpdateTaskContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateTaskContentHeaders headers = new UpdateTaskContentHeaders();
        return this.updateTaskContentWithOptions(userId, taskId, request, headers, runtime);
    }

    public UpdateTaskContentResponse updateTaskContentWithOptions(String userId, String taskId, UpdateTaskContentRequest request, UpdateTaskContentHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        taskId = com.aliyun.openapiutil.Client.getEncodeParam(taskId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
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
        return TeaModel.toModel(this.doROARequest("UpdateTaskContent", "project_1.0", "HTTP", "PUT", "AK", "/v1.0/project/users/" + userId + "/tasks/" + taskId + "/contents", "json", req, runtime), new UpdateTaskContentResponse());
    }

    public UpdateTaskDueDateResponse updateTaskDueDate(String userId, String taskId, UpdateTaskDueDateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateTaskDueDateHeaders headers = new UpdateTaskDueDateHeaders();
        return this.updateTaskDueDateWithOptions(userId, taskId, request, headers, runtime);
    }

    public UpdateTaskDueDateResponse updateTaskDueDateWithOptions(String userId, String taskId, UpdateTaskDueDateRequest request, UpdateTaskDueDateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        taskId = com.aliyun.openapiutil.Client.getEncodeParam(taskId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dueDate)) {
            body.put("dueDate", request.dueDate);
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
        return TeaModel.toModel(this.doROARequest("UpdateTaskDueDate", "project_1.0", "HTTP", "PUT", "AK", "/v1.0/project/users/" + userId + "/tasks/" + taskId + "/dueDates", "json", req, runtime), new UpdateTaskDueDateResponse());
    }

    public UpdateTaskExecutorResponse updateTaskExecutor(String userId, String taskId, UpdateTaskExecutorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateTaskExecutorHeaders headers = new UpdateTaskExecutorHeaders();
        return this.updateTaskExecutorWithOptions(userId, taskId, request, headers, runtime);
    }

    public UpdateTaskExecutorResponse updateTaskExecutorWithOptions(String userId, String taskId, UpdateTaskExecutorRequest request, UpdateTaskExecutorHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        taskId = com.aliyun.openapiutil.Client.getEncodeParam(taskId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.executorId)) {
            body.put("executorId", request.executorId);
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
        return TeaModel.toModel(this.doROARequest("UpdateTaskExecutor", "project_1.0", "HTTP", "PUT", "AK", "/v1.0/project/users/" + userId + "/tasks/" + taskId + "/executors", "json", req, runtime), new UpdateTaskExecutorResponse());
    }

    public UpdateTaskInvolvemembersResponse updateTaskInvolvemembers(String userId, String taskId, UpdateTaskInvolvemembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateTaskInvolvemembersHeaders headers = new UpdateTaskInvolvemembersHeaders();
        return this.updateTaskInvolvemembersWithOptions(userId, taskId, request, headers, runtime);
    }

    public UpdateTaskInvolvemembersResponse updateTaskInvolvemembersWithOptions(String userId, String taskId, UpdateTaskInvolvemembersRequest request, UpdateTaskInvolvemembersHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        taskId = com.aliyun.openapiutil.Client.getEncodeParam(taskId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addInvolvers)) {
            body.put("addInvolvers", request.addInvolvers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delInvolvers)) {
            body.put("delInvolvers", request.delInvolvers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.involveMembers)) {
            body.put("involveMembers", request.involveMembers);
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
        return TeaModel.toModel(this.doROARequest("UpdateTaskInvolvemembers", "project_1.0", "HTTP", "PUT", "AK", "/v1.0/project/users/" + userId + "/tasks/" + taskId + "/involveMembers", "json", req, runtime), new UpdateTaskInvolvemembersResponse());
    }

    public UpdateTaskNoteResponse updateTaskNote(String userId, String taskId, UpdateTaskNoteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateTaskNoteHeaders headers = new UpdateTaskNoteHeaders();
        return this.updateTaskNoteWithOptions(userId, taskId, request, headers, runtime);
    }

    public UpdateTaskNoteResponse updateTaskNoteWithOptions(String userId, String taskId, UpdateTaskNoteRequest request, UpdateTaskNoteHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        taskId = com.aliyun.openapiutil.Client.getEncodeParam(taskId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            body.put("note", request.note);
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
        return TeaModel.toModel(this.doROARequest("UpdateTaskNote", "project_1.0", "HTTP", "PUT", "AK", "/v1.0/project/users/" + userId + "/tasks/" + taskId + "/notes", "json", req, runtime), new UpdateTaskNoteResponse());
    }

    public UpdateTaskPriorityResponse updateTaskPriority(String userId, String taskId, UpdateTaskPriorityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateTaskPriorityHeaders headers = new UpdateTaskPriorityHeaders();
        return this.updateTaskPriorityWithOptions(userId, taskId, request, headers, runtime);
    }

    public UpdateTaskPriorityResponse updateTaskPriorityWithOptions(String userId, String taskId, UpdateTaskPriorityRequest request, UpdateTaskPriorityHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        taskId = com.aliyun.openapiutil.Client.getEncodeParam(taskId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("priority", request.priority);
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
        return TeaModel.toModel(this.doROARequest("UpdateTaskPriority", "project_1.0", "HTTP", "PUT", "AK", "/v1.0/project/users/" + userId + "/tasks/" + taskId + "/priorities", "json", req, runtime), new UpdateTaskPriorityResponse());
    }

    public UpdateTaskStageResponse updateTaskStage(String userId, String taskId, UpdateTaskStageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateTaskStageHeaders headers = new UpdateTaskStageHeaders();
        return this.updateTaskStageWithOptions(userId, taskId, request, headers, runtime);
    }

    public UpdateTaskStageResponse updateTaskStageWithOptions(String userId, String taskId, UpdateTaskStageRequest request, UpdateTaskStageHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        taskId = com.aliyun.openapiutil.Client.getEncodeParam(taskId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.stageId)) {
            body.put("stageId", request.stageId);
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
        return TeaModel.toModel(this.doROARequest("UpdateTaskStage", "project_1.0", "HTTP", "PUT", "AK", "/v1.0/project/users/" + userId + "/tasks/" + taskId + "/stages", "json", req, runtime), new UpdateTaskStageResponse());
    }

    public UpdateTaskStartdateResponse updateTaskStartdate(String userId, String taskId, UpdateTaskStartdateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateTaskStartdateHeaders headers = new UpdateTaskStartdateHeaders();
        return this.updateTaskStartdateWithOptions(userId, taskId, request, headers, runtime);
    }

    public UpdateTaskStartdateResponse updateTaskStartdateWithOptions(String userId, String taskId, UpdateTaskStartdateRequest request, UpdateTaskStartdateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        taskId = com.aliyun.openapiutil.Client.getEncodeParam(taskId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("startDate", request.startDate);
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
        return TeaModel.toModel(this.doROARequest("UpdateTaskStartdate", "project_1.0", "HTTP", "PUT", "AK", "/v1.0/project/users/" + userId + "/tasks/" + taskId + "/startDates", "json", req, runtime), new UpdateTaskStartdateResponse());
    }

    public UpdateTaskTaskflowstatusResponse updateTaskTaskflowstatus(String userId, String taskId, UpdateTaskTaskflowstatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateTaskTaskflowstatusHeaders headers = new UpdateTaskTaskflowstatusHeaders();
        return this.updateTaskTaskflowstatusWithOptions(userId, taskId, request, headers, runtime);
    }

    public UpdateTaskTaskflowstatusResponse updateTaskTaskflowstatusWithOptions(String userId, String taskId, UpdateTaskTaskflowstatusRequest request, UpdateTaskTaskflowstatusHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        taskId = com.aliyun.openapiutil.Client.getEncodeParam(taskId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskflowStatusId)) {
            body.put("taskflowStatusId", request.taskflowStatusId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tfsUpdateNote)) {
            body.put("tfsUpdateNote", request.tfsUpdateNote);
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
        return TeaModel.toModel(this.doROARequest("UpdateTaskTaskflowstatus", "project_1.0", "HTTP", "PUT", "AK", "/v1.0/project/users/" + userId + "/tasks/" + taskId + "/taskflowStatuses", "json", req, runtime), new UpdateTaskTaskflowstatusResponse());
    }
}
