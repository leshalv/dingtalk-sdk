// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkfinance_1_0;

import com.aliyun.tea.*;
import com.aliyun.dingtalkfinance_1_0.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        if (com.aliyun.teautil.Common.empty(_endpoint)) {
            this._endpoint = "api.dingtalk.com";
        }

    }


    public ApplyBatchPayResponse applyBatchPay(ApplyBatchPayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ApplyBatchPayHeaders headers = new ApplyBatchPayHeaders();
        return this.applyBatchPayWithOptions(request, headers, runtime);
    }

    public ApplyBatchPayResponse applyBatchPayWithOptions(ApplyBatchPayRequest request, ApplyBatchPayHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("accountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderNo)) {
            body.put("orderNo", request.orderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passBackParams)) {
            body.put("passBackParams", request.passBackParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payTerminal)) {
            body.put("payTerminal", request.payTerminal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnUrl)) {
            body.put("returnUrl", request.returnUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.staffId)) {
            body.put("staffId", request.staffId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transAmount)) {
            body.put("transAmount", request.transAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transExpireTime)) {
            body.put("transExpireTime", request.transExpireTime);
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
        return TeaModel.toModel(this.doROARequest("ApplyBatchPay", "finance_1.0", "HTTP", "POST", "AK", "/v1.0/finance/batchTrades/orders/pay", "json", req, runtime), new ApplyBatchPayResponse());
    }

    public CloseLoanEntranceResponse closeLoanEntrance(CloseLoanEntranceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CloseLoanEntranceHeaders headers = new CloseLoanEntranceHeaders();
        return this.closeLoanEntranceWithOptions(request, headers, runtime);
    }

    public CloseLoanEntranceResponse closeLoanEntranceWithOptions(CloseLoanEntranceRequest request, CloseLoanEntranceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
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
        return TeaModel.toModel(this.doROARequest("CloseLoanEntrance", "finance_1.0", "HTTP", "POST", "AK", "/v1.0/finance/loans/entrances/close", "json", req, runtime), new CloseLoanEntranceResponse());
    }

    public ConsultCreateSubInstitutionResponse consultCreateSubInstitution(ConsultCreateSubInstitutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ConsultCreateSubInstitutionHeaders headers = new ConsultCreateSubInstitutionHeaders();
        return this.consultCreateSubInstitutionWithOptions(request, headers, runtime);
    }

    public ConsultCreateSubInstitutionResponse consultCreateSubInstitutionWithOptions(ConsultCreateSubInstitutionRequest request, ConsultCreateSubInstitutionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bindingAlipayLogonId)) {
            body.put("bindingAlipayLogonId", request.bindingAlipayLogonId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactInfo)) {
            body.put("contactInfo", request.contactInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instId)) {
            body.put("instId", request.instId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonCertInfo)) {
            body.put("legalPersonCertInfo", request.legalPersonCertInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTradeNo)) {
            body.put("outTradeNo", request.outTradeNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payChannel)) {
            body.put("payChannel", request.payChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualificationInfos)) {
            body.put("qualificationInfos", request.qualificationInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.services)) {
            body.put("services", request.services);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.settleInfo)) {
            body.put("settleInfo", request.settleInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solution)) {
            body.put("solution", request.solution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstAddressInfo)) {
            body.put("subInstAddressInfo", request.subInstAddressInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstAuthInfo)) {
            body.put("subInstAuthInfo", request.subInstAuthInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstBasicInfo)) {
            body.put("subInstBasicInfo", request.subInstBasicInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstCertifyInfo)) {
            body.put("subInstCertifyInfo", request.subInstCertifyInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstId)) {
            body.put("subInstId", request.subInstId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstInvoiceInfo)) {
            body.put("subInstInvoiceInfo", request.subInstInvoiceInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstShopInfo)) {
            body.put("subInstShopInfo", request.subInstShopInfo);
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
        return TeaModel.toModel(this.doROARequest("ConsultCreateSubInstitution", "finance_1.0", "HTTP", "POST", "AK", "/v1.0/finance/institutions/subInstitutions/consult", "json", req, runtime), new ConsultCreateSubInstitutionResponse());
    }

    public CreatWithholdingOrderAndPayResponse creatWithholdingOrderAndPay(CreatWithholdingOrderAndPayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreatWithholdingOrderAndPayHeaders headers = new CreatWithholdingOrderAndPayHeaders();
        return this.creatWithholdingOrderAndPayWithOptions(request, headers, runtime);
    }

    public CreatWithholdingOrderAndPayResponse creatWithholdingOrderAndPayWithOptions(CreatWithholdingOrderAndPayRequest request, CreatWithholdingOrderAndPayHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            body.put("amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instId)) {
            body.put("instId", request.instId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otherPayChannelDetailInfoList)) {
            body.put("otherPayChannelDetailInfoList", request.otherPayChannelDetailInfoList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTradeNo)) {
            body.put("outTradeNo", request.outTradeNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payChannel)) {
            body.put("payChannel", request.payChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payerUserId)) {
            body.put("payerUserId", request.payerUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstId)) {
            body.put("subInstId", request.subInstId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeOutExpress)) {
            body.put("timeOutExpress", request.timeOutExpress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
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
        return TeaModel.toModel(this.doROARequest("CreatWithholdingOrderAndPay", "finance_1.0", "HTTP", "POST", "AK", "/v1.0/finance/withholdingOrders", "json", req, runtime), new CreatWithholdingOrderAndPayResponse());
    }

    public CreateAcquireRefundOrderResponse createAcquireRefundOrder(CreateAcquireRefundOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateAcquireRefundOrderHeaders headers = new CreateAcquireRefundOrderHeaders();
        return this.createAcquireRefundOrderWithOptions(request, headers, runtime);
    }

    public CreateAcquireRefundOrderResponse createAcquireRefundOrderWithOptions(CreateAcquireRefundOrderRequest request, CreateAcquireRefundOrderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instId)) {
            body.put("instId", request.instId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorUserId)) {
            body.put("operatorUserId", request.operatorUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originOutTradeNo)) {
            body.put("originOutTradeNo", request.originOutTradeNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otherPayChannelDetailInfoList)) {
            body.put("otherPayChannelDetailInfoList", request.otherPayChannelDetailInfoList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outRefundNo)) {
            body.put("outRefundNo", request.outRefundNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundAmount)) {
            body.put("refundAmount", request.refundAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstId)) {
            body.put("subInstId", request.subInstId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
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
        return TeaModel.toModel(this.doROARequest("CreateAcquireRefundOrder", "finance_1.0", "HTTP", "POST", "AK", "/v1.0/finance/acquireOrders/refund", "json", req, runtime), new CreateAcquireRefundOrderResponse());
    }

    public CreateBatchTradeOrderResponse createBatchTradeOrder(CreateBatchTradeOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateBatchTradeOrderHeaders headers = new CreateBatchTradeOrderHeaders();
        return this.createBatchTradeOrderWithOptions(request, headers, runtime);
    }

    public CreateBatchTradeOrderResponse createBatchTradeOrderWithOptions(CreateBatchTradeOrderRequest request, CreateBatchTradeOrderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("accountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("accountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchRemark)) {
            body.put("batchRemark", request.batchRemark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchTradeDetails)) {
            body.put("batchTradeDetails", request.batchTradeDetails);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outBatchNo)) {
            body.put("outBatchNo", request.outBatchNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.staffId)) {
            body.put("staffId", request.staffId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalAmount)) {
            body.put("totalAmount", request.totalAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalCount)) {
            body.put("totalCount", request.totalCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tradeTitle)) {
            body.put("tradeTitle", request.tradeTitle);
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
        return TeaModel.toModel(this.doROARequest("CreateBatchTradeOrder", "finance_1.0", "HTTP", "POST", "AK", "/v1.0/finance/batchTrades/orders", "json", req, runtime), new CreateBatchTradeOrderResponse());
    }

    public CreateSubInstitutionResponse createSubInstitution(CreateSubInstitutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateSubInstitutionHeaders headers = new CreateSubInstitutionHeaders();
        return this.createSubInstitutionWithOptions(request, headers, runtime);
    }

    public CreateSubInstitutionResponse createSubInstitutionWithOptions(CreateSubInstitutionRequest request, CreateSubInstitutionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bindingAlipayLogonId)) {
            body.put("bindingAlipayLogonId", request.bindingAlipayLogonId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactInfo)) {
            body.put("contactInfo", request.contactInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instId)) {
            body.put("instId", request.instId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonCertInfo)) {
            body.put("legalPersonCertInfo", request.legalPersonCertInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTradeNo)) {
            body.put("outTradeNo", request.outTradeNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payChannel)) {
            body.put("payChannel", request.payChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualificationInfos)) {
            body.put("qualificationInfos", request.qualificationInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.services)) {
            body.put("services", request.services);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.settleInfo)) {
            body.put("settleInfo", request.settleInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solution)) {
            body.put("solution", request.solution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstAddressInfo)) {
            body.put("subInstAddressInfo", request.subInstAddressInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstAuthInfo)) {
            body.put("subInstAuthInfo", request.subInstAuthInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstBasicInfo)) {
            body.put("subInstBasicInfo", request.subInstBasicInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstCertifyInfo)) {
            body.put("subInstCertifyInfo", request.subInstCertifyInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstId)) {
            body.put("subInstId", request.subInstId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstInvoiceInfo)) {
            body.put("subInstInvoiceInfo", request.subInstInvoiceInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstShopInfo)) {
            body.put("subInstShopInfo", request.subInstShopInfo);
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
        return TeaModel.toModel(this.doROARequest("CreateSubInstitution", "finance_1.0", "HTTP", "POST", "AK", "/v1.0/finance/institutions/subInstitutions", "json", req, runtime), new CreateSubInstitutionResponse());
    }

    public CreateUserCodeInstanceResponse createUserCodeInstance(CreateUserCodeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateUserCodeInstanceHeaders headers = new CreateUserCodeInstanceHeaders();
        return this.createUserCodeInstanceWithOptions(request, headers, runtime);
    }

    public CreateUserCodeInstanceResponse createUserCodeInstanceWithOptions(CreateUserCodeInstanceRequest request, CreateUserCodeInstanceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.availableTimes)) {
            body.put("availableTimes", request.availableTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeIdentity)) {
            body.put("codeIdentity", request.codeIdentity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeValue)) {
            body.put("codeValue", request.codeValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeValueType)) {
            body.put("codeValueType", request.codeValueType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("corpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            body.put("extInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtExpired)) {
            body.put("gmtExpired", request.gmtExpired);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCorpRelationType)) {
            body.put("userCorpRelationType", request.userCorpRelationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdentity)) {
            body.put("userIdentity", request.userIdentity);
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
        return TeaModel.toModel(this.doROARequest("CreateUserCodeInstance", "finance_1.0", "HTTP", "POST", "AK", "/v1.0/finance/payCodes/userInstances", "json", req, runtime), new CreateUserCodeInstanceResponse());
    }

    public DecodePayCodeResponse decodePayCode(DecodePayCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DecodePayCodeHeaders headers = new DecodePayCodeHeaders();
        return this.decodePayCodeWithOptions(request, headers, runtime);
    }

    public DecodePayCodeResponse decodePayCodeWithOptions(DecodePayCodeRequest request, DecodePayCodeHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.payCode)) {
            body.put("payCode", request.payCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
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
        return TeaModel.toModel(this.doROARequest("DecodePayCode", "finance_1.0", "HTTP", "POST", "AK", "/v1.0/finance/payCodes/decode", "json", req, runtime), new DecodePayCodeResponse());
    }

    public ModifySubInstitutionResponse modifySubInstitution(ModifySubInstitutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ModifySubInstitutionHeaders headers = new ModifySubInstitutionHeaders();
        return this.modifySubInstitutionWithOptions(request, headers, runtime);
    }

    public ModifySubInstitutionResponse modifySubInstitutionWithOptions(ModifySubInstitutionRequest request, ModifySubInstitutionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bindingAlipayLogonId)) {
            body.put("bindingAlipayLogonId", request.bindingAlipayLogonId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactInfo)) {
            body.put("contactInfo", request.contactInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instId)) {
            body.put("instId", request.instId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonCertInfo)) {
            body.put("legalPersonCertInfo", request.legalPersonCertInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTradeNo)) {
            body.put("outTradeNo", request.outTradeNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payChannel)) {
            body.put("payChannel", request.payChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualificationInfos)) {
            body.put("qualificationInfos", request.qualificationInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.services)) {
            body.put("services", request.services);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.settleInfo)) {
            body.put("settleInfo", request.settleInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstAddressInfo)) {
            body.put("subInstAddressInfo", request.subInstAddressInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstAuthInfo)) {
            body.put("subInstAuthInfo", request.subInstAuthInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstBasicInfo)) {
            body.put("subInstBasicInfo", request.subInstBasicInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstCertifyInfo)) {
            body.put("subInstCertifyInfo", request.subInstCertifyInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstId)) {
            body.put("subInstId", request.subInstId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstInvoiceInfo)) {
            body.put("subInstInvoiceInfo", request.subInstInvoiceInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstShopInfo)) {
            body.put("subInstShopInfo", request.subInstShopInfo);
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
        return TeaModel.toModel(this.doROARequest("ModifySubInstitution", "finance_1.0", "HTTP", "POST", "AK", "/v1.0/finance/institutions/subInstitutions/modify", "json", req, runtime), new ModifySubInstitutionResponse());
    }

    public NotifyPayCodePayResultResponse notifyPayCodePayResult(NotifyPayCodePayResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        NotifyPayCodePayResultHeaders headers = new NotifyPayCodePayResultHeaders();
        return this.notifyPayCodePayResultWithOptions(request, headers, runtime);
    }

    public NotifyPayCodePayResultResponse notifyPayCodePayResultWithOptions(NotifyPayCodePayResultRequest request, NotifyPayCodePayResultHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            body.put("amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeAmount)) {
            body.put("chargeAmount", request.chargeAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("corpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            body.put("extInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtTradeCreate)) {
            body.put("gmtTradeCreate", request.gmtTradeCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtTradeFinish)) {
            body.put("gmtTradeFinish", request.gmtTradeFinish);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantName)) {
            body.put("merchantName", request.merchantName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payChannelDetailList)) {
            body.put("payChannelDetailList", request.payChannelDetailList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payCode)) {
            body.put("payCode", request.payCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionAmount)) {
            body.put("promotionAmount", request.promotionAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tradeErrorCode)) {
            body.put("tradeErrorCode", request.tradeErrorCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tradeErrorMsg)) {
            body.put("tradeErrorMsg", request.tradeErrorMsg);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tradeNo)) {
            body.put("tradeNo", request.tradeNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tradeStatus)) {
            body.put("tradeStatus", request.tradeStatus);
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
        return TeaModel.toModel(this.doROARequest("NotifyPayCodePayResult", "finance_1.0", "HTTP", "POST", "AK", "/v1.0/finance/payCodes/payResults/notify", "json", req, runtime), new NotifyPayCodePayResultResponse());
    }

    public NotifyPayCodeRefundResultResponse notifyPayCodeRefundResult(NotifyPayCodeRefundResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        NotifyPayCodeRefundResultHeaders headers = new NotifyPayCodeRefundResultHeaders();
        return this.notifyPayCodeRefundResultWithOptions(request, headers, runtime);
    }

    public NotifyPayCodeRefundResultResponse notifyPayCodeRefundResultWithOptions(NotifyPayCodeRefundResultRequest request, NotifyPayCodeRefundResultHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("corpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtRefund)) {
            body.put("gmtRefund", request.gmtRefund);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payChannelDetailList)) {
            body.put("payChannelDetailList", request.payChannelDetailList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payCode)) {
            body.put("payCode", request.payCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundAmount)) {
            body.put("refundAmount", request.refundAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundOrderNo)) {
            body.put("refundOrderNo", request.refundOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundPromotionAmount)) {
            body.put("refundPromotionAmount", request.refundPromotionAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tradeNo)) {
            body.put("tradeNo", request.tradeNo);
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
        return TeaModel.toModel(this.doROARequest("NotifyPayCodeRefundResult", "finance_1.0", "HTTP", "POST", "AK", "/v1.0/finance/payCodes/refundResults/notify", "json", req, runtime), new NotifyPayCodeRefundResultResponse());
    }

    public NotifyVerifyResultResponse notifyVerifyResult(NotifyVerifyResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        NotifyVerifyResultHeaders headers = new NotifyVerifyResultHeaders();
        return this.notifyVerifyResultWithOptions(request, headers, runtime);
    }

    public NotifyVerifyResultResponse notifyVerifyResultWithOptions(NotifyVerifyResultRequest request, NotifyVerifyResultHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("corpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payCode)) {
            body.put("payCode", request.payCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCorpRelationType)) {
            body.put("userCorpRelationType", request.userCorpRelationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdentity)) {
            body.put("userIdentity", request.userIdentity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyEvent)) {
            body.put("verifyEvent", request.verifyEvent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyLocation)) {
            body.put("verifyLocation", request.verifyLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyNo)) {
            body.put("verifyNo", request.verifyNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyResult)) {
            body.put("verifyResult", request.verifyResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyTime)) {
            body.put("verifyTime", request.verifyTime);
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
        return TeaModel.toModel(this.doROARequest("NotifyVerifyResult", "finance_1.0", "HTTP", "POST", "AK", "/v1.0/finance/payCodes/verifyResults/notify", "json", req, runtime), new NotifyVerifyResultResponse());
    }

    public QueryAcquireRefundOrderResponse queryAcquireRefundOrder(QueryAcquireRefundOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryAcquireRefundOrderHeaders headers = new QueryAcquireRefundOrderHeaders();
        return this.queryAcquireRefundOrderWithOptions(request, headers, runtime);
    }

    public QueryAcquireRefundOrderResponse queryAcquireRefundOrderWithOptions(QueryAcquireRefundOrderRequest request, QueryAcquireRefundOrderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outRefundNo)) {
            query.put("outRefundNo", request.outRefundNo);
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
        return TeaModel.toModel(this.doROARequest("QueryAcquireRefundOrder", "finance_1.0", "HTTP", "GET", "AK", "/v1.0/finance/acquireOrders/refunds", "json", req, runtime), new QueryAcquireRefundOrderResponse());
    }

    public QueryBatchTradeDetailListResponse queryBatchTradeDetailList(QueryBatchTradeDetailListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryBatchTradeDetailListHeaders headers = new QueryBatchTradeDetailListHeaders();
        return this.queryBatchTradeDetailListWithOptions(request, headers, runtime);
    }

    public QueryBatchTradeDetailListResponse queryBatchTradeDetailListWithOptions(QueryBatchTradeDetailListRequest request, QueryBatchTradeDetailListHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outBatchNo)) {
            query.put("outBatchNo", request.outBatchNo);
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
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("QueryBatchTradeDetailList", "finance_1.0", "HTTP", "GET", "AK", "/v1.0/finance/batchTrades/details", "json", req, runtime), new QueryBatchTradeDetailListResponse());
    }

    public QueryBatchTradeOrderResponse queryBatchTradeOrder(QueryBatchTradeOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryBatchTradeOrderHeaders headers = new QueryBatchTradeOrderHeaders();
        return this.queryBatchTradeOrderWithOptions(request, headers, runtime);
    }

    public QueryBatchTradeOrderResponse queryBatchTradeOrderWithOptions(QueryBatchTradeOrderRequest request, QueryBatchTradeOrderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outBatchNos)) {
            body.put("outBatchNos", request.outBatchNos);
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
        return TeaModel.toModel(this.doROARequest("QueryBatchTradeOrder", "finance_1.0", "HTTP", "POST", "AK", "/v1.0/finance/batchTrades/orders/query", "json", req, runtime), new QueryBatchTradeOrderResponse());
    }

    public QueryPayAccountListResponse queryPayAccountList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryPayAccountListHeaders headers = new QueryPayAccountListHeaders();
        return this.queryPayAccountListWithOptions(headers, runtime);
    }

    public QueryPayAccountListResponse queryPayAccountListWithOptions(QueryPayAccountListHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
        return TeaModel.toModel(this.doROARequest("QueryPayAccountList", "finance_1.0", "HTTP", "GET", "AK", "/v1.0/finance/payAccounts", "json", req, runtime), new QueryPayAccountListResponse());
    }

    public QueryRegisterOrderResponse queryRegisterOrder(QueryRegisterOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryRegisterOrderHeaders headers = new QueryRegisterOrderHeaders();
        return this.queryRegisterOrderWithOptions(request, headers, runtime);
    }

    public QueryRegisterOrderResponse queryRegisterOrderWithOptions(QueryRegisterOrderRequest request, QueryRegisterOrderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instId)) {
            query.put("instId", request.instId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("orderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTradeNo)) {
            query.put("outTradeNo", request.outTradeNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstId)) {
            query.put("subInstId", request.subInstId);
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
        return TeaModel.toModel(this.doROARequest("QueryRegisterOrder", "finance_1.0", "HTTP", "GET", "AK", "/v1.0/finance/institutions/subInstitutions/orders", "json", req, runtime), new QueryRegisterOrderResponse());
    }

    public QueryUserAgreementResponse queryUserAgreement(QueryUserAgreementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryUserAgreementHeaders headers = new QueryUserAgreementHeaders();
        return this.queryUserAgreementWithOptions(request, headers, runtime);
    }

    public QueryUserAgreementResponse queryUserAgreementWithOptions(QueryUserAgreementRequest request, QueryUserAgreementHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("bizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizScene)) {
            query.put("bizScene", request.bizScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instId)) {
            query.put("instId", request.instId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstId)) {
            query.put("subInstId", request.subInstId);
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
        return TeaModel.toModel(this.doROARequest("QueryUserAgreement", "finance_1.0", "HTTP", "GET", "AK", "/v1.0/finance/userAgreements", "json", req, runtime), new QueryUserAgreementResponse());
    }

    public QueryUserAlipayAccountResponse queryUserAlipayAccount() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryUserAlipayAccountHeaders headers = new QueryUserAlipayAccountHeaders();
        return this.queryUserAlipayAccountWithOptions(headers, runtime);
    }

    public QueryUserAlipayAccountResponse queryUserAlipayAccountWithOptions(QueryUserAlipayAccountHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
        return TeaModel.toModel(this.doROARequest("QueryUserAlipayAccount", "finance_1.0", "HTTP", "GET", "AK", "/v1.0/finance/userAlipayAccounts", "json", req, runtime), new QueryUserAlipayAccountResponse());
    }

    public QueryWithholdingOrderResponse queryWithholdingOrder(QueryWithholdingOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryWithholdingOrderHeaders headers = new QueryWithholdingOrderHeaders();
        return this.queryWithholdingOrderWithOptions(request, headers, runtime);
    }

    public QueryWithholdingOrderResponse queryWithholdingOrderWithOptions(QueryWithholdingOrderRequest request, QueryWithholdingOrderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outTradeNo)) {
            query.put("outTradeNo", request.outTradeNo);
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
        return TeaModel.toModel(this.doROARequest("QueryWithholdingOrder", "finance_1.0", "HTTP", "GET", "AK", "/v1.0/finance/withholdingOrders", "json", req, runtime), new QueryWithholdingOrderResponse());
    }

    public SaveCorpPayCodeResponse saveCorpPayCode(SaveCorpPayCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SaveCorpPayCodeHeaders headers = new SaveCorpPayCodeHeaders();
        return this.saveCorpPayCodeWithOptions(request, headers, runtime);
    }

    public SaveCorpPayCodeResponse saveCorpPayCodeWithOptions(SaveCorpPayCodeRequest request, SaveCorpPayCodeHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.codeIdentity)) {
            body.put("codeIdentity", request.codeIdentity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("corpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            body.put("extInfo", request.extInfo);
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
        return TeaModel.toModel(this.doROARequest("SaveCorpPayCode", "finance_1.0", "HTTP", "POST", "AK", "/v1.0/finance/payCodes/corpSettings", "json", req, runtime), new SaveCorpPayCodeResponse());
    }

    public UnsignUserAgreementResponse unsignUserAgreement(UnsignUserAgreementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UnsignUserAgreementHeaders headers = new UnsignUserAgreementHeaders();
        return this.unsignUserAgreementWithOptions(request, headers, runtime);
    }

    public UnsignUserAgreementResponse unsignUserAgreementWithOptions(UnsignUserAgreementRequest request, UnsignUserAgreementHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agreementNo)) {
            body.put("agreementNo", request.agreementNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            body.put("bizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizScene)) {
            body.put("bizScene", request.bizScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instId)) {
            body.put("instId", request.instId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstId)) {
            body.put("subInstId", request.subInstId);
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
        return TeaModel.toModel(this.doROARequest("UnsignUserAgreement", "finance_1.0", "HTTP", "POST", "AK", "/v1.0/finance/userAgreements/unsign", "none", req, runtime), new UnsignUserAgreementResponse());
    }

    public UpateUserCodeInstanceResponse upateUserCodeInstance(UpateUserCodeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpateUserCodeInstanceHeaders headers = new UpateUserCodeInstanceHeaders();
        return this.upateUserCodeInstanceWithOptions(request, headers, runtime);
    }

    public UpateUserCodeInstanceResponse upateUserCodeInstanceWithOptions(UpateUserCodeInstanceRequest request, UpateUserCodeInstanceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.availableTimes)) {
            body.put("availableTimes", request.availableTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeId)) {
            body.put("codeId", request.codeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeIdentity)) {
            body.put("codeIdentity", request.codeIdentity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeValue)) {
            body.put("codeValue", request.codeValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("corpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            body.put("extInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtExpired)) {
            body.put("gmtExpired", request.gmtExpired);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCorpRelationType)) {
            body.put("userCorpRelationType", request.userCorpRelationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdentity)) {
            body.put("userIdentity", request.userIdentity);
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
        return TeaModel.toModel(this.doROARequest("UpateUserCodeInstance", "finance_1.0", "HTTP", "PUT", "AK", "/v1.0/finance/payCodes/userInstances", "json", req, runtime), new UpateUserCodeInstanceResponse());
    }

    public UpdateInvoiceVerifyStatusResponse updateInvoiceVerifyStatus(UpdateInvoiceVerifyStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateInvoiceVerifyStatusHeaders headers = new UpdateInvoiceVerifyStatusHeaders();
        return this.updateInvoiceVerifyStatusWithOptions(request, headers, runtime);
    }

    public UpdateInvoiceVerifyStatusResponse updateInvoiceVerifyStatusWithOptions(UpdateInvoiceVerifyStatusRequest request, UpdateInvoiceVerifyStatusHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("bizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkingResult)) {
            body.put("checkingResult", request.checkingResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkingStatus)) {
            body.put("checkingStatus", request.checkingStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("corpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extension)) {
            body.put("extension", request.extension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceCode)) {
            body.put("invoiceCode", request.invoiceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceNo)) {
            body.put("invoiceNo", request.invoiceNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceStatus)) {
            body.put("invoiceStatus", request.invoiceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceVerifyId)) {
            body.put("invoiceVerifyId", request.invoiceVerifyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msg)) {
            body.put("msg", request.msg);
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
        return TeaModel.toModel(this.doROARequest("UpdateInvoiceVerifyStatus", "finance_1.0", "HTTP", "PUT", "AK", "/v1.0/finance/invoices/verifyStatus", "json", req, runtime), new UpdateInvoiceVerifyStatusResponse());
    }

    public UploadInvoiceResponse uploadInvoice(UploadInvoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UploadInvoiceHeaders headers = new UploadInvoiceHeaders();
        return this.uploadInvoiceWithOptions(request, headers, runtime);
    }

    public UploadInvoiceResponse uploadInvoiceWithOptions(UploadInvoiceRequest request, UploadInvoiceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extension)) {
            body.put("extension", request.extension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoices)) {
            body.put("invoices", request.invoices);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdentity)) {
            body.put("userIdentity", request.userIdentity);
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
        return TeaModel.toModel(this.doROARequest("UploadInvoice", "finance_1.0", "HTTP", "POST", "AK", "/v1.0/finance/invoices/upload", "json", req, runtime), new UploadInvoiceResponse());
    }

    public UploadInvoiceByAuthResponse uploadInvoiceByAuth(UploadInvoiceByAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UploadInvoiceByAuthHeaders headers = new UploadInvoiceByAuthHeaders();
        return this.uploadInvoiceByAuthWithOptions(request, headers, runtime);
    }

    public UploadInvoiceByAuthResponse uploadInvoiceByAuthWithOptions(UploadInvoiceByAuthRequest request, UploadInvoiceByAuthHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extension)) {
            body.put("extension", request.extension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoices)) {
            body.put("invoices", request.invoices);
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
        return TeaModel.toModel(this.doROARequest("UploadInvoiceByAuth", "finance_1.0", "HTTP", "POST", "AK", "/v1.0/finance/invoices/authorizations/upload", "json", req, runtime), new UploadInvoiceByAuthResponse());
    }

    public UploadInvoiceByMobileResponse uploadInvoiceByMobile(UploadInvoiceByMobileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UploadInvoiceByMobileHeaders headers = new UploadInvoiceByMobileHeaders();
        return this.uploadInvoiceByMobileWithOptions(request, headers, runtime);
    }

    public UploadInvoiceByMobileResponse uploadInvoiceByMobileWithOptions(UploadInvoiceByMobileRequest request, UploadInvoiceByMobileHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.invoices)) {
            body.put("invoices", request.invoices);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            body.put("mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobileStateCode)) {
            body.put("mobileStateCode", request.mobileStateCode);
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
        return TeaModel.toModel(this.doROARequest("UploadInvoiceByMobile", "finance_1.0", "HTTP", "POST", "AK", "/v1.0/finance/invoices/mobiles/upload", "json", req, runtime), new UploadInvoiceByMobileResponse());
    }

    public UploadRegisterImageResponse uploadRegisterImage(UploadRegisterImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UploadRegisterImageHeaders headers = new UploadRegisterImageHeaders();
        return this.uploadRegisterImageWithOptions(request, headers, runtime);
    }

    public UploadRegisterImageResponse uploadRegisterImageWithOptions(UploadRegisterImageRequest request, UploadRegisterImageHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageContent)) {
            body.put("imageContent", request.imageContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            body.put("imageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageType)) {
            body.put("imageType", request.imageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instId)) {
            body.put("instId", request.instId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payChannel)) {
            body.put("payChannel", request.payChannel);
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
        return TeaModel.toModel(this.doROARequest("UploadRegisterImage", "finance_1.0", "HTTP", "POST", "AK", "/v1.0/finance/institutions/images", "json", req, runtime), new UploadRegisterImageResponse());
    }

    public UserAgreementPageSignResponse userAgreementPageSign(UserAgreementPageSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UserAgreementPageSignHeaders headers = new UserAgreementPageSignHeaders();
        return this.userAgreementPageSignWithOptions(request, headers, runtime);
    }

    public UserAgreementPageSignResponse userAgreementPageSignWithOptions(UserAgreementPageSignRequest request, UserAgreementPageSignHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            body.put("bizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizScene)) {
            body.put("bizScene", request.bizScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instId)) {
            body.put("instId", request.instId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payChannel)) {
            body.put("payChannel", request.payChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnUrl)) {
            body.put("returnUrl", request.returnUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signScene)) {
            body.put("signScene", request.signScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstId)) {
            body.put("subInstId", request.subInstId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subMerchantName)) {
            body.put("subMerchantName", request.subMerchantName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subMerchantServiceDesc)) {
            body.put("subMerchantServiceDesc", request.subMerchantServiceDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subMerchantServiceName)) {
            body.put("subMerchantServiceName", request.subMerchantServiceName);
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
        return TeaModel.toModel(this.doROARequest("UserAgreementPageSign", "finance_1.0", "HTTP", "POST", "AK", "/v1.0/finance/userAgreements", "json", req, runtime), new UserAgreementPageSignResponse());
    }
}
