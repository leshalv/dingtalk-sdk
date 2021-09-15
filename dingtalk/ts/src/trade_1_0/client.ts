// This file is auto-generated, don't edit it
/**
 *
 */
import Util, * as $Util from '@alicloud/tea-util';
import OpenApi, * as $OpenApi from '@alicloud/openapi-client';
import OpenApiUtil from '@alicloud/openapi-util';
import * as $tea from '@alicloud/tea-typescript';

export class QueryTradeOrderHeaders extends $tea.Model {
  commonHeaders?: { [key: string]: string };
  xAcsDingtalkAccessToken?: string;
  static names(): { [key: string]: string } {
    return {
      commonHeaders: 'commonHeaders',
      xAcsDingtalkAccessToken: 'x-acs-dingtalk-access-token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      commonHeaders: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      xAcsDingtalkAccessToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTradeOrderRequest extends $tea.Model {
  outerOrderId?: string;
  orderId?: number;
  dingIsvOrgId?: number;
  dingSuiteKey?: string;
  static names(): { [key: string]: string } {
    return {
      outerOrderId: 'outerOrderId',
      orderId: 'orderId',
      dingIsvOrgId: 'dingIsvOrgId',
      dingSuiteKey: 'dingSuiteKey',
    };
  }

  static types(): { [key: string]: any } {
    return {
      outerOrderId: 'string',
      orderId: 'number',
      dingIsvOrgId: 'number',
      dingSuiteKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTradeOrderResponseBody extends $tea.Model {
  isvCropId?: string;
  articleName?: string;
  articleCode?: string;
  articleItemName?: string;
  articleItemCode?: string;
  quantity?: number;
  outerOrderId?: string;
  orderId?: number;
  fee?: number;
  payFee?: number;
  createTime?: number;
  refundTime?: number;
  closeTime?: number;
  payTime?: number;
  status?: number;
  static names(): { [key: string]: string } {
    return {
      isvCropId: 'isvCropId',
      articleName: 'articleName',
      articleCode: 'articleCode',
      articleItemName: 'articleItemName',
      articleItemCode: 'articleItemCode',
      quantity: 'quantity',
      outerOrderId: 'outerOrderId',
      orderId: 'orderId',
      fee: 'fee',
      payFee: 'payFee',
      createTime: 'createTime',
      refundTime: 'refundTime',
      closeTime: 'closeTime',
      payTime: 'payTime',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      isvCropId: 'string',
      articleName: 'string',
      articleCode: 'string',
      articleItemName: 'string',
      articleItemCode: 'string',
      quantity: 'number',
      outerOrderId: 'string',
      orderId: 'number',
      fee: 'number',
      payFee: 'number',
      createTime: 'number',
      refundTime: 'number',
      closeTime: 'number',
      payTime: 'number',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTradeOrderResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: QueryTradeOrderResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: QueryTradeOrderResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateOpportunityHeaders extends $tea.Model {
  commonHeaders?: { [key: string]: string };
  xAcsDingtalkAccessToken?: string;
  static names(): { [key: string]: string } {
    return {
      commonHeaders: 'commonHeaders',
      xAcsDingtalkAccessToken: 'x-acs-dingtalk-access-token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      commonHeaders: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      xAcsDingtalkAccessToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateOpportunityRequest extends $tea.Model {
  corpId?: string;
  belongToPhoneNum?: string;
  contactPhoneNum?: string;
  deptId?: number;
  marketCode?: string;
  dingIsvOrgId?: number;
  static names(): { [key: string]: string } {
    return {
      corpId: 'corpId',
      belongToPhoneNum: 'belongToPhoneNum',
      contactPhoneNum: 'contactPhoneNum',
      deptId: 'deptId',
      marketCode: 'marketCode',
      dingIsvOrgId: 'dingIsvOrgId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      corpId: 'string',
      belongToPhoneNum: 'string',
      contactPhoneNum: 'string',
      deptId: 'number',
      marketCode: 'string',
      dingIsvOrgId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateOpportunityResponse extends $tea.Model {
  headers: { [key: string]: string };
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckOpportunityResultHeaders extends $tea.Model {
  commonHeaders?: { [key: string]: string };
  xAcsDingtalkAccessToken?: string;
  static names(): { [key: string]: string } {
    return {
      commonHeaders: 'commonHeaders',
      xAcsDingtalkAccessToken: 'x-acs-dingtalk-access-token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      commonHeaders: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      xAcsDingtalkAccessToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckOpportunityResultRequest extends $tea.Model {
  corpId?: string;
  belongToPhoneNum?: string;
  contactPhoneNum?: string;
  deptId?: number;
  marketCode?: string;
  static names(): { [key: string]: string } {
    return {
      corpId: 'corpId',
      belongToPhoneNum: 'belongToPhoneNum',
      contactPhoneNum: 'contactPhoneNum',
      deptId: 'deptId',
      marketCode: 'marketCode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      corpId: 'string',
      belongToPhoneNum: 'string',
      contactPhoneNum: 'string',
      deptId: 'number',
      marketCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckOpportunityResultResponseBody extends $tea.Model {
  bizSuccess?: boolean;
  static names(): { [key: string]: string } {
    return {
      bizSuccess: 'bizSuccess',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizSuccess: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckOpportunityResultResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: CheckOpportunityResultResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: CheckOpportunityResultResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}


export default class Client extends OpenApi {

  constructor(config: $OpenApi.Config) {
    super(config);
    this._endpointRule = "";
    if (Util.empty(this._endpoint)) {
      this._endpoint = "api.dingtalk.com";
    }

  }


  async queryTradeOrder(request: QueryTradeOrderRequest): Promise<QueryTradeOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new QueryTradeOrderHeaders({ });
    return await this.queryTradeOrderWithOptions(request, headers, runtime);
  }

  async queryTradeOrderWithOptions(request: QueryTradeOrderRequest, headers: QueryTradeOrderHeaders, runtime: $Util.RuntimeOptions): Promise<QueryTradeOrderResponse> {
    Util.validateModel(request);
    let body : {[key: string ]: any} = { };
    if (!Util.isUnset(request.outerOrderId)) {
      body["outerOrderId"] = request.outerOrderId;
    }

    if (!Util.isUnset(request.orderId)) {
      body["orderId"] = request.orderId;
    }

    if (!Util.isUnset(request.dingIsvOrgId)) {
      body["dingIsvOrgId"] = request.dingIsvOrgId;
    }

    if (!Util.isUnset(request.dingSuiteKey)) {
      body["dingSuiteKey"] = request.dingSuiteKey;
    }

    let realHeaders : {[key: string ]: string} = { };
    if (!Util.isUnset(headers.commonHeaders)) {
      realHeaders = headers.commonHeaders;
    }

    if (!Util.isUnset(headers.xAcsDingtalkAccessToken)) {
      realHeaders["x-acs-dingtalk-access-token"] = headers.xAcsDingtalkAccessToken;
    }

    let req = new $OpenApi.OpenApiRequest({
      headers: realHeaders,
      body: OpenApiUtil.parseToMap(body),
    });
    return $tea.cast<QueryTradeOrderResponse>(await this.doROARequest("QueryTradeOrder", "trade_1.0", "HTTP", "POST", "AK", `/v1.0/trade/orders/query`, "json", req, runtime), new QueryTradeOrderResponse({}));
  }

  async createOpportunity(request: CreateOpportunityRequest): Promise<CreateOpportunityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new CreateOpportunityHeaders({ });
    return await this.createOpportunityWithOptions(request, headers, runtime);
  }

  async createOpportunityWithOptions(request: CreateOpportunityRequest, headers: CreateOpportunityHeaders, runtime: $Util.RuntimeOptions): Promise<CreateOpportunityResponse> {
    Util.validateModel(request);
    let body : {[key: string ]: any} = { };
    if (!Util.isUnset(request.corpId)) {
      body["corpId"] = request.corpId;
    }

    if (!Util.isUnset(request.belongToPhoneNum)) {
      body["belongToPhoneNum"] = request.belongToPhoneNum;
    }

    if (!Util.isUnset(request.contactPhoneNum)) {
      body["contactPhoneNum"] = request.contactPhoneNum;
    }

    if (!Util.isUnset(request.deptId)) {
      body["deptId"] = request.deptId;
    }

    if (!Util.isUnset(request.marketCode)) {
      body["marketCode"] = request.marketCode;
    }

    if (!Util.isUnset(request.dingIsvOrgId)) {
      body["dingIsvOrgId"] = request.dingIsvOrgId;
    }

    let realHeaders : {[key: string ]: string} = { };
    if (!Util.isUnset(headers.commonHeaders)) {
      realHeaders = headers.commonHeaders;
    }

    if (!Util.isUnset(headers.xAcsDingtalkAccessToken)) {
      realHeaders["x-acs-dingtalk-access-token"] = headers.xAcsDingtalkAccessToken;
    }

    let req = new $OpenApi.OpenApiRequest({
      headers: realHeaders,
      body: OpenApiUtil.parseToMap(body),
    });
    return $tea.cast<CreateOpportunityResponse>(await this.doROARequest("CreateOpportunity", "trade_1.0", "HTTP", "POST", "AK", `/v1.0/trade/opportunities`, "none", req, runtime), new CreateOpportunityResponse({}));
  }

  async checkOpportunityResult(request: CheckOpportunityResultRequest): Promise<CheckOpportunityResultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new CheckOpportunityResultHeaders({ });
    return await this.checkOpportunityResultWithOptions(request, headers, runtime);
  }

  async checkOpportunityResultWithOptions(request: CheckOpportunityResultRequest, headers: CheckOpportunityResultHeaders, runtime: $Util.RuntimeOptions): Promise<CheckOpportunityResultResponse> {
    Util.validateModel(request);
    let query : {[key: string ]: any} = { };
    if (!Util.isUnset(request.corpId)) {
      query["corpId"] = request.corpId;
    }

    if (!Util.isUnset(request.belongToPhoneNum)) {
      query["belongToPhoneNum"] = request.belongToPhoneNum;
    }

    if (!Util.isUnset(request.contactPhoneNum)) {
      query["contactPhoneNum"] = request.contactPhoneNum;
    }

    if (!Util.isUnset(request.deptId)) {
      query["deptId"] = request.deptId;
    }

    if (!Util.isUnset(request.marketCode)) {
      query["marketCode"] = request.marketCode;
    }

    let realHeaders : {[key: string ]: string} = { };
    if (!Util.isUnset(headers.commonHeaders)) {
      realHeaders = headers.commonHeaders;
    }

    if (!Util.isUnset(headers.xAcsDingtalkAccessToken)) {
      realHeaders["x-acs-dingtalk-access-token"] = headers.xAcsDingtalkAccessToken;
    }

    let req = new $OpenApi.OpenApiRequest({
      headers: realHeaders,
      query: OpenApiUtil.query(query),
    });
    return $tea.cast<CheckOpportunityResultResponse>(await this.doROARequest("CheckOpportunityResult", "trade_1.0", "HTTP", "GET", "AK", `/v1.0/trade/opportunity/check`, "json", req, runtime), new CheckOpportunityResultResponse({}));
  }

}
