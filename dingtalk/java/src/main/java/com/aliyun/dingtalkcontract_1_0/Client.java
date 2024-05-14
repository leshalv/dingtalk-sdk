// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkcontract_1_0;

import com.aliyun.tea.*;
import com.aliyun.dingtalkcontract_1_0.models.*;

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
     * @summary 合同权益核销
     *
     * @param request ContractBenefitConsumeRequest
     * @param headers ContractBenefitConsumeHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ContractBenefitConsumeResponse
     */
    public ContractBenefitConsumeResponse contractBenefitConsumeWithOptions(ContractBenefitConsumeRequest request, ContractBenefitConsumeHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.benefitPoint)) {
            body.put("benefitPoint", request.benefitPoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRequestId)) {
            body.put("bizRequestId", request.bizRequestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumeQuota)) {
            body.put("consumeQuota", request.consumeQuota);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("corpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extParams)) {
            body.put("extParams", request.extParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCorpId)) {
            body.put("isvCorpId", request.isvCorpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optUnionId)) {
            body.put("optUnionId", request.optUnionId);
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
            new TeaPair("action", "ContractBenefitConsume"),
            new TeaPair("version", "contract_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/contract/benefits/consume"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ContractBenefitConsumeResponse());
    }

    /**
     * @summary 合同权益核销
     *
     * @param request ContractBenefitConsumeRequest
     * @return ContractBenefitConsumeResponse
     */
    public ContractBenefitConsumeResponse contractBenefitConsume(ContractBenefitConsumeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ContractBenefitConsumeHeaders headers = new ContractBenefitConsumeHeaders();
        return this.contractBenefitConsumeWithOptions(request, headers, runtime);
    }

    /**
     * @summary 天谷侧查询审批单
     *
     * @param request EsignQueryApprovalInfoRequest
     * @param headers EsignQueryApprovalInfoHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return EsignQueryApprovalInfoResponse
     */
    public EsignQueryApprovalInfoResponse esignQueryApprovalInfoWithOptions(EsignQueryApprovalInfoRequest request, EsignQueryApprovalInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("corpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.esignFlowId)) {
            body.put("esignFlowId", request.esignFlowId);
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
            new TeaPair("action", "EsignQueryApprovalInfo"),
            new TeaPair("version", "contract_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/contract/esign/approvalInfos/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new EsignQueryApprovalInfoResponse());
    }

    /**
     * @summary 天谷侧查询审批单
     *
     * @param request EsignQueryApprovalInfoRequest
     * @return EsignQueryApprovalInfoResponse
     */
    public EsignQueryApprovalInfoResponse esignQueryApprovalInfo(EsignQueryApprovalInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        EsignQueryApprovalInfoHeaders headers = new EsignQueryApprovalInfoHeaders();
        return this.esignQueryApprovalInfoWithOptions(request, headers, runtime);
    }

    /**
     * @summary 天谷侧查询授权信息接口
     *
     * @param request EsignQueryGrantInfoRequest
     * @param headers EsignQueryGrantInfoHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return EsignQueryGrantInfoResponse
     */
    public EsignQueryGrantInfoResponse esignQueryGrantInfoWithOptions(EsignQueryGrantInfoRequest request, EsignQueryGrantInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("corpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extension)) {
            body.put("extension", request.extension);
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
            new TeaPair("action", "EsignQueryGrantInfo"),
            new TeaPair("version", "contract_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/contract/esign/anthInfos/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new EsignQueryGrantInfoResponse());
    }

    /**
     * @summary 天谷侧查询授权信息接口
     *
     * @param request EsignQueryGrantInfoRequest
     * @return EsignQueryGrantInfoResponse
     */
    public EsignQueryGrantInfoResponse esignQueryGrantInfo(EsignQueryGrantInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        EsignQueryGrantInfoHeaders headers = new EsignQueryGrantInfoHeaders();
        return this.esignQueryGrantInfoWithOptions(request, headers, runtime);
    }

    /**
     * @summary 天谷侧查询获取免登信息
     *
     * @param request EsignQueryIdentityByTicketRequest
     * @param headers EsignQueryIdentityByTicketHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return EsignQueryIdentityByTicketResponse
     */
    public EsignQueryIdentityByTicketResponse esignQueryIdentityByTicketWithOptions(EsignQueryIdentityByTicketRequest request, EsignQueryIdentityByTicketHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("corpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extension)) {
            body.put("extension", request.extension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticket)) {
            body.put("ticket", request.ticket);
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
            new TeaPair("action", "EsignQueryIdentityByTicket"),
            new TeaPair("version", "contract_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/contract/esign/tickets/identities/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new EsignQueryIdentityByTicketResponse());
    }

    /**
     * @summary 天谷侧查询获取免登信息
     *
     * @param request EsignQueryIdentityByTicketRequest
     * @return EsignQueryIdentityByTicketResponse
     */
    public EsignQueryIdentityByTicketResponse esignQueryIdentityByTicket(EsignQueryIdentityByTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        EsignQueryIdentityByTicketHeaders headers = new EsignQueryIdentityByTicketHeaders();
        return this.esignQueryIdentityByTicketWithOptions(request, headers, runtime);
    }

    /**
     * @summary e签宝电子签事件同步回传接口
     *
     * @param request EsignSyncEventRequest
     * @param headers EsignSyncEventHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return EsignSyncEventResponse
     */
    public EsignSyncEventResponse esignSyncEventWithOptions(EsignSyncEventRequest request, EsignSyncEventHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            body.put("action", request.action);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("corpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.esignData)) {
            body.put("esignData", request.esignData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extension)) {
            body.put("extension", request.extension);
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
            new TeaPair("action", "EsignSyncEvent"),
            new TeaPair("version", "contract_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/contract/esign/events/sync"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new EsignSyncEventResponse());
    }

    /**
     * @summary e签宝电子签事件同步回传接口
     *
     * @param request EsignSyncEventRequest
     * @return EsignSyncEventResponse
     */
    public EsignSyncEventResponse esignSyncEvent(EsignSyncEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        EsignSyncEventHeaders headers = new EsignSyncEventHeaders();
        return this.esignSyncEventWithOptions(request, headers, runtime);
    }

    /**
     * @summary e签宝查询智能合同版本接口
     *
     * @param request QueryAdvancedContractVersionRequest
     * @param headers QueryAdvancedContractVersionHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAdvancedContractVersionResponse
     */
    public QueryAdvancedContractVersionResponse queryAdvancedContractVersionWithOptions(QueryAdvancedContractVersionRequest request, QueryAdvancedContractVersionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("corpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extension)) {
            body.put("extension", request.extension);
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
            new TeaPair("action", "QueryAdvancedContractVersion"),
            new TeaPair("version", "contract_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/contract/versions/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new QueryAdvancedContractVersionResponse());
    }

    /**
     * @summary e签宝查询智能合同版本接口
     *
     * @param request QueryAdvancedContractVersionRequest
     * @return QueryAdvancedContractVersionResponse
     */
    public QueryAdvancedContractVersionResponse queryAdvancedContractVersion(QueryAdvancedContractVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryAdvancedContractVersionHeaders headers = new QueryAdvancedContractVersionHeaders();
        return this.queryAdvancedContractVersionWithOptions(request, headers, runtime);
    }

    /**
     * @summary 发送合同相关卡片
     *
     * @param request SendContractCardRequest
     * @param headers SendContractCardHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendContractCardResponse
     */
    public SendContractCardResponse sendContractCardWithOptions(SendContractCardRequest request, SendContractCardHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cardType)) {
            body.put("cardType", request.cardType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contractInfo)) {
            body.put("contractInfo", request.contractInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("corpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extension)) {
            body.put("extension", request.extension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processInstanceId)) {
            body.put("processInstanceId", request.processInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiveGroups)) {
            body.put("receiveGroups", request.receiveGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receivers)) {
            body.put("receivers", request.receivers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sender)) {
            body.put("sender", request.sender);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncSingleChat)) {
            body.put("syncSingleChat", request.syncSingleChat);
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
            new TeaPair("action", "SendContractCard"),
            new TeaPair("version", "contract_1.0"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/v1.0/contract/cards/send"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new SendContractCardResponse());
    }

    /**
     * @summary 发送合同相关卡片
     *
     * @param request SendContractCardRequest
     * @return SendContractCardResponse
     */
    public SendContractCardResponse sendContractCard(SendContractCardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SendContractCardHeaders headers = new SendContractCardHeaders();
        return this.sendContractCardWithOptions(request, headers, runtime);
    }
}
