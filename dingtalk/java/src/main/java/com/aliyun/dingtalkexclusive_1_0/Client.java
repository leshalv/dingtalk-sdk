// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkexclusive_1_0;

import com.aliyun.tea.*;
import com.aliyun.dingtalkexclusive_1_0.models.*;
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


    public GetConferenceDetailResponse getConferenceDetail(String conferenceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetConferenceDetailHeaders headers = new GetConferenceDetailHeaders();
        return this.getConferenceDetailWithOptions(conferenceId, headers, runtime);
    }

    public GetConferenceDetailResponse getConferenceDetailWithOptions(String conferenceId, GetConferenceDetailHeaders headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", headers.xAcsDingtalkAccessToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        return TeaModel.toModel(this.doROARequest("GetConferenceDetail", "exclusive_1.0", "HTTP", "GET", "AK", "/v1.0/exclusive/data/conferences/" + conferenceId + "", "json", req, runtime), new GetConferenceDetailResponse());
    }

    public GetUserAppVersionSummaryResponse getUserAppVersionSummary(String dataId, GetUserAppVersionSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetUserAppVersionSummaryHeaders headers = new GetUserAppVersionSummaryHeaders();
        return this.getUserAppVersionSummaryWithOptions(dataId, request, headers, runtime);
    }

    public GetUserAppVersionSummaryResponse getUserAppVersionSummaryWithOptions(String dataId, GetUserAppVersionSummaryRequest request, GetUserAppVersionSummaryHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageStart)) {
            query.put("pageStart", request.pageStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetUserAppVersionSummary", "exclusive_1.0", "HTTP", "GET", "AK", "/v1.0/exclusive/data/appVersion/org/" + dataId + "", "json", req, runtime), new GetUserAppVersionSummaryResponse());
    }

    public DeleteCommentResponse deleteComment(String publisherId, String commentId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        DeleteCommentHeaders headers = new DeleteCommentHeaders();
        return this.deleteCommentWithOptions(publisherId, commentId, headers, runtime);
    }

    public DeleteCommentResponse deleteCommentWithOptions(String publisherId, String commentId, DeleteCommentHeaders headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", headers.xAcsDingtalkAccessToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteComment", "exclusive_1.0", "HTTP", "DELETE", "AK", "/v1.0/exclusive/publishers/" + publisherId + "/comments/" + commentId + "", "boolean", req, runtime), new DeleteCommentResponse());
    }

    public GetAllLabelableDeptsResponse getAllLabelableDepts() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetAllLabelableDeptsHeaders headers = new GetAllLabelableDeptsHeaders();
        return this.getAllLabelableDeptsWithOptions(headers, runtime);
    }

    public GetAllLabelableDeptsResponse getAllLabelableDeptsWithOptions(GetAllLabelableDeptsHeaders headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", headers.xAcsDingtalkAccessToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        return TeaModel.toModel(this.doROARequest("GetAllLabelableDepts", "exclusive_1.0", "HTTP", "GET", "AK", "/v1.0/exclusive/partnerDepartments", "json", req, runtime), new GetAllLabelableDeptsResponse());
    }

    public GetPublisherSummaryResponse getPublisherSummary(String dataId, GetPublisherSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetPublisherSummaryHeaders headers = new GetPublisherSummaryHeaders();
        return this.getPublisherSummaryWithOptions(dataId, request, headers, runtime);
    }

    public GetPublisherSummaryResponse getPublisherSummaryWithOptions(String dataId, GetPublisherSummaryRequest request, GetPublisherSummaryHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageStart)) {
            query.put("pageStart", request.pageStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetPublisherSummary", "exclusive_1.0", "HTTP", "GET", "AK", "/v1.0/exclusive/data/publisher/" + dataId + "", "json", req, runtime), new GetPublisherSummaryResponse());
    }

    public GetDocCreatedDeptSummaryResponse getDocCreatedDeptSummary(String dataId, GetDocCreatedDeptSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetDocCreatedDeptSummaryHeaders headers = new GetDocCreatedDeptSummaryHeaders();
        return this.getDocCreatedDeptSummaryWithOptions(dataId, request, headers, runtime);
    }

    public GetDocCreatedDeptSummaryResponse getDocCreatedDeptSummaryWithOptions(String dataId, GetDocCreatedDeptSummaryRequest request, GetDocCreatedDeptSummaryHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageStart)) {
            query.put("pageStart", request.pageStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetDocCreatedDeptSummary", "exclusive_1.0", "HTTP", "GET", "AK", "/v1.0/exclusive/data/doc/dept/" + dataId + "", "json", req, runtime), new GetDocCreatedDeptSummaryResponse());
    }

    public GetGeneralFormCreatedSummaryResponse getGeneralFormCreatedSummary(String dataId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetGeneralFormCreatedSummaryHeaders headers = new GetGeneralFormCreatedSummaryHeaders();
        return this.getGeneralFormCreatedSummaryWithOptions(dataId, headers, runtime);
    }

    public GetGeneralFormCreatedSummaryResponse getGeneralFormCreatedSummaryWithOptions(String dataId, GetGeneralFormCreatedSummaryHeaders headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", headers.xAcsDingtalkAccessToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        return TeaModel.toModel(this.doROARequest("GetGeneralFormCreatedSummary", "exclusive_1.0", "HTTP", "GET", "AK", "/v1.0/exclusive/data/generalForm/org/" + dataId + "", "json", req, runtime), new GetGeneralFormCreatedSummaryResponse());
    }

    public CreateTrustedDeviceResponse createTrustedDevice(CreateTrustedDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        CreateTrustedDeviceHeaders headers = new CreateTrustedDeviceHeaders();
        return this.createTrustedDeviceWithOptions(request, headers, runtime);
    }

    public CreateTrustedDeviceResponse createTrustedDeviceWithOptions(CreateTrustedDeviceRequest request, CreateTrustedDeviceHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            body.put("platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.macAddress)) {
            body.put("macAddress", request.macAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
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
        return TeaModel.toModel(this.doROARequest("CreateTrustedDevice", "exclusive_1.0", "HTTP", "POST", "AK", "/v1.0/exclusive/trustedDevices", "json", req, runtime), new CreateTrustedDeviceResponse());
    }

    public GetDocCreatedSummaryResponse getDocCreatedSummary(String dataId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetDocCreatedSummaryHeaders headers = new GetDocCreatedSummaryHeaders();
        return this.getDocCreatedSummaryWithOptions(dataId, headers, runtime);
    }

    public GetDocCreatedSummaryResponse getDocCreatedSummaryWithOptions(String dataId, GetDocCreatedSummaryHeaders headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", headers.xAcsDingtalkAccessToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        return TeaModel.toModel(this.doROARequest("GetDocCreatedSummary", "exclusive_1.0", "HTTP", "GET", "AK", "/v1.0/exclusive/data/doc/org/" + dataId + "", "json", req, runtime), new GetDocCreatedSummaryResponse());
    }

    public GetPartnerTypeByParentIdResponse getPartnerTypeByParentId(String parentId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetPartnerTypeByParentIdHeaders headers = new GetPartnerTypeByParentIdHeaders();
        return this.getPartnerTypeByParentIdWithOptions(parentId, headers, runtime);
    }

    public GetPartnerTypeByParentIdResponse getPartnerTypeByParentIdWithOptions(String parentId, GetPartnerTypeByParentIdHeaders headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", headers.xAcsDingtalkAccessToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        return TeaModel.toModel(this.doROARequest("GetPartnerTypeByParentId", "exclusive_1.0", "HTTP", "GET", "AK", "/v1.0/exclusive/partnerLabels/" + parentId + "", "json", req, runtime), new GetPartnerTypeByParentIdResponse());
    }

    public SetDeptPartnerTypeAndNumResponse setDeptPartnerTypeAndNum(SetDeptPartnerTypeAndNumRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        SetDeptPartnerTypeAndNumHeaders headers = new SetDeptPartnerTypeAndNumHeaders();
        return this.setDeptPartnerTypeAndNumWithOptions(request, headers, runtime);
    }

    public SetDeptPartnerTypeAndNumResponse setDeptPartnerTypeAndNumWithOptions(SetDeptPartnerTypeAndNumRequest request, SetDeptPartnerTypeAndNumHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deptId)) {
            body.put("deptId", request.deptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partnerNum)) {
            body.put("partnerNum", request.partnerNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelIds)) {
            body.put("labelIds", request.labelIds);
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
        return TeaModel.toModel(this.doROARequest("SetDeptPartnerTypeAndNum", "exclusive_1.0", "HTTP", "POST", "AK", "/v1.0/exclusive/partnerDepartments", "none", req, runtime), new SetDeptPartnerTypeAndNumResponse());
    }

    public GetActiveUserSummaryResponse getActiveUserSummary(String dataId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetActiveUserSummaryHeaders headers = new GetActiveUserSummaryHeaders();
        return this.getActiveUserSummaryWithOptions(dataId, headers, runtime);
    }

    public GetActiveUserSummaryResponse getActiveUserSummaryWithOptions(String dataId, GetActiveUserSummaryHeaders headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", headers.xAcsDingtalkAccessToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        return TeaModel.toModel(this.doROARequest("GetActiveUserSummary", "exclusive_1.0", "HTTP", "GET", "AK", "/v1.0/exclusive/data/dau/org/" + dataId + "", "json", req, runtime), new GetActiveUserSummaryResponse());
    }

    public GetOaOperatorLogListResponse getOaOperatorLogList(GetOaOperatorLogListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetOaOperatorLogListHeaders headers = new GetOaOperatorLogListHeaders();
        return this.getOaOperatorLogListWithOptions(request, headers, runtime);
    }

    public GetOaOperatorLogListResponse getOaOperatorLogListWithOptions(GetOaOperatorLogListRequest request, GetOaOperatorLogListHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opUserId)) {
            body.put("opUserId", request.opUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryList)) {
            body.put("categoryList", request.categoryList);
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
        return TeaModel.toModel(this.doROARequest("GetOaOperatorLogList", "exclusive_1.0", "HTTP", "POST", "AK", "/v1.0/exclusive/oaOperatorLogs/query", "json", req, runtime), new GetOaOperatorLogListResponse());
    }

    public GetDingReportDeptSummaryResponse getDingReportDeptSummary(String dataId, GetDingReportDeptSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetDingReportDeptSummaryHeaders headers = new GetDingReportDeptSummaryHeaders();
        return this.getDingReportDeptSummaryWithOptions(dataId, request, headers, runtime);
    }

    public GetDingReportDeptSummaryResponse getDingReportDeptSummaryWithOptions(String dataId, GetDingReportDeptSummaryRequest request, GetDingReportDeptSummaryHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageStart)) {
            query.put("pageStart", request.pageStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetDingReportDeptSummary", "exclusive_1.0", "HTTP", "GET", "AK", "/v1.0/exclusive/data/report/dept/" + dataId + "", "json", req, runtime), new GetDingReportDeptSummaryResponse());
    }

    public GetTrustDeviceListResponse getTrustDeviceList(GetTrustDeviceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetTrustDeviceListHeaders headers = new GetTrustDeviceListHeaders();
        return this.getTrustDeviceListWithOptions(request, headers, runtime);
    }

    public GetTrustDeviceListResponse getTrustDeviceListWithOptions(GetTrustDeviceListRequest request, GetTrustDeviceListHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            body.put("userIds", request.userIds);
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
        return TeaModel.toModel(this.doROARequest("GetTrustDeviceList", "exclusive_1.0", "HTTP", "POST", "AK", "/v1.0/exclusive/trustedDevices/query", "json", req, runtime), new GetTrustDeviceListResponse());
    }

    public GetGeneralFormCreatedDeptSummaryResponse getGeneralFormCreatedDeptSummary(String dataId, GetGeneralFormCreatedDeptSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetGeneralFormCreatedDeptSummaryHeaders headers = new GetGeneralFormCreatedDeptSummaryHeaders();
        return this.getGeneralFormCreatedDeptSummaryWithOptions(dataId, request, headers, runtime);
    }

    public GetGeneralFormCreatedDeptSummaryResponse getGeneralFormCreatedDeptSummaryWithOptions(String dataId, GetGeneralFormCreatedDeptSummaryRequest request, GetGeneralFormCreatedDeptSummaryHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageStart)) {
            query.put("pageStart", request.pageStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetGeneralFormCreatedDeptSummary", "exclusive_1.0", "HTTP", "GET", "AK", "/v1.0/exclusive/data/generalForm/dept/" + dataId + "", "json", req, runtime), new GetGeneralFormCreatedDeptSummaryResponse());
    }

    public SearchOrgInnerGroupInfoResponse searchOrgInnerGroupInfo(SearchOrgInnerGroupInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        SearchOrgInnerGroupInfoHeaders headers = new SearchOrgInnerGroupInfoHeaders();
        return this.searchOrgInnerGroupInfoWithOptions(request, headers, runtime);
    }

    public SearchOrgInnerGroupInfoResponse searchOrgInnerGroupInfoWithOptions(SearchOrgInnerGroupInfoRequest request, SearchOrgInnerGroupInfoHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupMembersCountEnd)) {
            query.put("groupMembersCountEnd", request.groupMembersCountEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncToDingpan)) {
            query.put("syncToDingpan", request.syncToDingpan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupOwner)) {
            query.put("groupOwner", request.groupOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeEnd)) {
            query.put("createTimeEnd", request.createTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeStart)) {
            query.put("createTimeStart", request.createTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("uuid", request.uuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupMembersCountStart)) {
            query.put("groupMembersCountStart", request.groupMembersCountStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastActiveTimeEnd)) {
            query.put("lastActiveTimeEnd", request.lastActiveTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorUserId)) {
            query.put("operatorUserId", request.operatorUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("groupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageStart)) {
            query.put("pageStart", request.pageStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastActiveTimeStart)) {
            query.put("lastActiveTimeStart", request.lastActiveTimeStart);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("SearchOrgInnerGroupInfo", "exclusive_1.0", "HTTP", "GET", "AK", "/v1.0/exclusive/securities/orgGroupInfos", "json", req, runtime), new SearchOrgInnerGroupInfoResponse());
    }

    public GetCalenderSummaryResponse getCalenderSummary(String dataId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetCalenderSummaryHeaders headers = new GetCalenderSummaryHeaders();
        return this.getCalenderSummaryWithOptions(dataId, headers, runtime);
    }

    public GetCalenderSummaryResponse getCalenderSummaryWithOptions(String dataId, GetCalenderSummaryHeaders headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", headers.xAcsDingtalkAccessToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        return TeaModel.toModel(this.doROARequest("GetCalenderSummary", "exclusive_1.0", "HTTP", "GET", "AK", "/v1.0/exclusive/data/calendar/org/" + dataId + "", "json", req, runtime), new GetCalenderSummaryResponse());
    }

    public GetGroupActiveInfoResponse getGroupActiveInfo(GetGroupActiveInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetGroupActiveInfoHeaders headers = new GetGroupActiveInfoHeaders();
        return this.getGroupActiveInfoWithOptions(request, headers, runtime);
    }

    public GetGroupActiveInfoResponse getGroupActiveInfoWithOptions(GetGroupActiveInfoRequest request, GetGroupActiveInfoHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.statDate)) {
            query.put("statDate", request.statDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingGroupId)) {
            query.put("dingGroupId", request.dingGroupId);
        }

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
            realHeaders.put("x-acs-dingtalk-access-token", headers.xAcsDingtalkAccessToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetGroupActiveInfo", "exclusive_1.0", "HTTP", "GET", "AK", "/v1.0/exclusive/data/activeGroups", "json", req, runtime), new GetGroupActiveInfoResponse());
    }

    public GetCommentListResponse getCommentList(String publisherId, GetCommentListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetCommentListHeaders headers = new GetCommentListHeaders();
        return this.getCommentListWithOptions(publisherId, request, headers, runtime);
    }

    public GetCommentListResponse getCommentListWithOptions(String publisherId, GetCommentListRequest request, GetCommentListHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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
            realHeaders.put("x-acs-dingtalk-access-token", headers.xAcsDingtalkAccessToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetCommentList", "exclusive_1.0", "HTTP", "GET", "AK", "/v1.0/exclusive/publishers/" + publisherId + "/comments/list", "json", req, runtime), new GetCommentListResponse());
    }
}
