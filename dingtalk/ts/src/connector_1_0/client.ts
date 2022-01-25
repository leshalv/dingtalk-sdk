// This file is auto-generated, don't edit it
/**
 *
 */
import Util, * as $Util from '@alicloud/tea-util';
import OpenApi, * as $OpenApi from '@alicloud/openapi-client';
import OpenApiUtil from '@alicloud/openapi-util';
import * as $tea from '@alicloud/tea-typescript';

export class CreateActionHeaders extends $tea.Model {
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

export class CreateActionRequest extends $tea.Model {
  actionInfo?: CreateActionRequestActionInfo[];
  static names(): { [key: string]: string } {
    return {
      actionInfo: 'actionInfo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actionInfo: { 'type': 'array', 'itemType': CreateActionRequestActionInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateActionResponseBody extends $tea.Model {
  item?: CreateActionResponseBodyItem[];
  static names(): { [key: string]: string } {
    return {
      item: 'item',
    };
  }

  static types(): { [key: string]: any } {
    return {
      item: { 'type': 'array', 'itemType': CreateActionResponseBodyItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateActionResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: CreateActionResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: CreateActionResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateConnectorHeaders extends $tea.Model {
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

export class CreateConnectorRequest extends $tea.Model {
  connectorInfo?: CreateConnectorRequestConnectorInfo[];
  static names(): { [key: string]: string } {
    return {
      connectorInfo: 'connectorInfo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      connectorInfo: { 'type': 'array', 'itemType': CreateConnectorRequestConnectorInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateConnectorResponseBody extends $tea.Model {
  item?: CreateConnectorResponseBodyItem[];
  static names(): { [key: string]: string } {
    return {
      item: 'item',
    };
  }

  static types(): { [key: string]: any } {
    return {
      item: { 'type': 'array', 'itemType': CreateConnectorResponseBodyItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateConnectorResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: CreateConnectorResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: CreateConnectorResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTriggerHeaders extends $tea.Model {
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

export class CreateTriggerRequest extends $tea.Model {
  triggerInfo?: CreateTriggerRequestTriggerInfo[];
  static names(): { [key: string]: string } {
    return {
      triggerInfo: 'triggerInfo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      triggerInfo: { 'type': 'array', 'itemType': CreateTriggerRequestTriggerInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTriggerResponseBody extends $tea.Model {
  item?: CreateTriggerResponseBodyItem[];
  static names(): { [key: string]: string } {
    return {
      item: 'item',
    };
  }

  static types(): { [key: string]: any } {
    return {
      item: { 'type': 'array', 'itemType': CreateTriggerResponseBodyItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTriggerResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: CreateTriggerResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: CreateTriggerResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PullDataByPageHeaders extends $tea.Model {
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

export class PullDataByPageRequest extends $tea.Model {
  appId?: string;
  dataModelId?: string;
  datetimeFilterField?: string;
  maxDatetime?: number;
  maxResults?: number;
  minDatetime?: number;
  nextToken?: string;
  static names(): { [key: string]: string } {
    return {
      appId: 'appId',
      dataModelId: 'dataModelId',
      datetimeFilterField: 'datetimeFilterField',
      maxDatetime: 'maxDatetime',
      maxResults: 'maxResults',
      minDatetime: 'minDatetime',
      nextToken: 'nextToken',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appId: 'string',
      dataModelId: 'string',
      datetimeFilterField: 'string',
      maxDatetime: 'number',
      maxResults: 'number',
      minDatetime: 'number',
      nextToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PullDataByPageResponseBody extends $tea.Model {
  list?: PullDataByPageResponseBodyList[];
  maxResults?: number;
  nextToken?: string;
  static names(): { [key: string]: string } {
    return {
      list: 'list',
      maxResults: 'maxResults',
      nextToken: 'nextToken',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': PullDataByPageResponseBodyList },
      maxResults: 'number',
      nextToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PullDataByPageResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: PullDataByPageResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: PullDataByPageResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PullDataByPkHeaders extends $tea.Model {
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

export class PullDataByPkRequest extends $tea.Model {
  appId?: string;
  primaryKey?: string;
  static names(): { [key: string]: string } {
    return {
      appId: 'appId',
      primaryKey: 'primaryKey',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appId: 'string',
      primaryKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PullDataByPkResponseBody extends $tea.Model {
  dataCreateAppId?: string;
  dataCreateAppType?: string;
  dataGmtCreate?: number;
  dataGmtModified?: number;
  dataModifiedAppId?: string;
  dataModifiedAppType?: string;
  jsonData?: string;
  static names(): { [key: string]: string } {
    return {
      dataCreateAppId: 'dataCreateAppId',
      dataCreateAppType: 'dataCreateAppType',
      dataGmtCreate: 'dataGmtCreate',
      dataGmtModified: 'dataGmtModified',
      dataModifiedAppId: 'dataModifiedAppId',
      dataModifiedAppType: 'dataModifiedAppType',
      jsonData: 'jsonData',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dataCreateAppId: 'string',
      dataCreateAppType: 'string',
      dataGmtCreate: 'number',
      dataGmtModified: 'number',
      dataModifiedAppId: 'string',
      dataModifiedAppType: 'string',
      jsonData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PullDataByPkResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: PullDataByPkResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: PullDataByPkResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncDataHeaders extends $tea.Model {
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

export class SyncDataRequest extends $tea.Model {
  appId?: string;
  triggerDataList?: SyncDataRequestTriggerDataList[];
  static names(): { [key: string]: string } {
    return {
      appId: 'appId',
      triggerDataList: 'triggerDataList',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appId: 'string',
      triggerDataList: { 'type': 'array', 'itemType': SyncDataRequestTriggerDataList },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncDataResponseBody extends $tea.Model {
  list?: SyncDataResponseBodyList[];
  static names(): { [key: string]: string } {
    return {
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': SyncDataResponseBodyList },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncDataResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: SyncDataResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: SyncDataResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateActionRequestActionInfo extends $tea.Model {
  apiPath?: string;
  apiSecret?: string;
  apiUrl?: string;
  description?: string;
  dingConnectorId?: string;
  inputSchema?: string;
  integratorActionId?: string;
  integratorConnectorId?: string;
  name?: string;
  outputSchema?: string;
  static names(): { [key: string]: string } {
    return {
      apiPath: 'apiPath',
      apiSecret: 'apiSecret',
      apiUrl: 'apiUrl',
      description: 'description',
      dingConnectorId: 'dingConnectorId',
      inputSchema: 'inputSchema',
      integratorActionId: 'integratorActionId',
      integratorConnectorId: 'integratorConnectorId',
      name: 'name',
      outputSchema: 'outputSchema',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiPath: 'string',
      apiSecret: 'string',
      apiUrl: 'string',
      description: 'string',
      dingConnectorId: 'string',
      inputSchema: 'string',
      integratorActionId: 'string',
      integratorConnectorId: 'string',
      name: 'string',
      outputSchema: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateActionResponseBodyItem extends $tea.Model {
  dingActionId?: string;
  dingConnectorId?: string;
  integratorActionId?: string;
  integratorConnectorId?: string;
  subErrCode?: string;
  subErrMsg?: string;
  success?: string;
  static names(): { [key: string]: string } {
    return {
      dingActionId: 'dingActionId',
      dingConnectorId: 'dingConnectorId',
      integratorActionId: 'integratorActionId',
      integratorConnectorId: 'integratorConnectorId',
      subErrCode: 'subErrCode',
      subErrMsg: 'subErrMsg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dingActionId: 'string',
      dingConnectorId: 'string',
      integratorActionId: 'string',
      integratorConnectorId: 'string',
      subErrCode: 'string',
      subErrMsg: 'string',
      success: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateConnectorRequestConnectorInfo extends $tea.Model {
  apiDomain?: string;
  apiSecret?: string;
  appId?: number;
  baseVariables?: string[];
  description?: string;
  iconMediaId?: string;
  integratorConnectorId?: string;
  name?: string;
  static names(): { [key: string]: string } {
    return {
      apiDomain: 'apiDomain',
      apiSecret: 'apiSecret',
      appId: 'appId',
      baseVariables: 'baseVariables',
      description: 'description',
      iconMediaId: 'iconMediaId',
      integratorConnectorId: 'integratorConnectorId',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiDomain: 'string',
      apiSecret: 'string',
      appId: 'number',
      baseVariables: { 'type': 'array', 'itemType': 'string' },
      description: 'string',
      iconMediaId: 'string',
      integratorConnectorId: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateConnectorResponseBodyItem extends $tea.Model {
  dingConnectorId?: string;
  integratorConnectorId?: string;
  subErrCode?: string;
  subErrMsg?: string;
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      dingConnectorId: 'dingConnectorId',
      integratorConnectorId: 'integratorConnectorId',
      subErrCode: 'subErrCode',
      subErrMsg: 'subErrMsg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dingConnectorId: 'string',
      integratorConnectorId: 'string',
      subErrCode: 'string',
      subErrMsg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTriggerRequestTriggerInfo extends $tea.Model {
  description?: string;
  dingConnectorId?: string;
  inputSchema?: string;
  integratorConnectorId?: string;
  integratorTriggerId?: string;
  name?: string;
  static names(): { [key: string]: string } {
    return {
      description: 'description',
      dingConnectorId: 'dingConnectorId',
      inputSchema: 'inputSchema',
      integratorConnectorId: 'integratorConnectorId',
      integratorTriggerId: 'integratorTriggerId',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
      dingConnectorId: 'string',
      inputSchema: 'string',
      integratorConnectorId: 'string',
      integratorTriggerId: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTriggerResponseBodyItem extends $tea.Model {
  dingConnectorId?: string;
  dingTriggerId?: string;
  integratorConnectorId?: string;
  integratorTriggerId?: string;
  subErrCode?: string;
  subErrMsg?: string;
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      dingConnectorId: 'dingConnectorId',
      dingTriggerId: 'dingTriggerId',
      integratorConnectorId: 'integratorConnectorId',
      integratorTriggerId: 'integratorTriggerId',
      subErrCode: 'subErrCode',
      subErrMsg: 'subErrMsg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dingConnectorId: 'string',
      dingTriggerId: 'string',
      integratorConnectorId: 'string',
      integratorTriggerId: 'string',
      subErrCode: 'string',
      subErrMsg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PullDataByPageResponseBodyList extends $tea.Model {
  dataCreateAppId?: string;
  dataCreateAppType?: string;
  dataGmtCreate?: number;
  dataGmtModified?: number;
  dataModifiedAppId?: string;
  dataModifiedAppType?: string;
  jsonData?: string;
  static names(): { [key: string]: string } {
    return {
      dataCreateAppId: 'dataCreateAppId',
      dataCreateAppType: 'dataCreateAppType',
      dataGmtCreate: 'dataGmtCreate',
      dataGmtModified: 'dataGmtModified',
      dataModifiedAppId: 'dataModifiedAppId',
      dataModifiedAppType: 'dataModifiedAppType',
      jsonData: 'jsonData',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dataCreateAppId: 'string',
      dataCreateAppType: 'string',
      dataGmtCreate: 'number',
      dataGmtModified: 'number',
      dataModifiedAppId: 'string',
      dataModifiedAppType: 'string',
      jsonData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncDataRequestTriggerDataList extends $tea.Model {
  action?: string;
  customTriggerId?: string;
  dataGmtCreate?: number;
  dataGmtModified?: number;
  jsonData?: string;
  triggerId?: string;
  static names(): { [key: string]: string } {
    return {
      action: 'action',
      customTriggerId: 'customTriggerId',
      dataGmtCreate: 'dataGmtCreate',
      dataGmtModified: 'dataGmtModified',
      jsonData: 'jsonData',
      triggerId: 'triggerId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      action: 'string',
      customTriggerId: 'string',
      dataGmtCreate: 'number',
      dataGmtModified: 'number',
      jsonData: 'string',
      triggerId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncDataResponseBodyList extends $tea.Model {
  bizPrimaryKey?: string;
  subErrCode?: string;
  subErrMsg?: string;
  success?: boolean;
  triggerId?: string;
  static names(): { [key: string]: string } {
    return {
      bizPrimaryKey: 'bizPrimaryKey',
      subErrCode: 'subErrCode',
      subErrMsg: 'subErrMsg',
      success: 'success',
      triggerId: 'triggerId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizPrimaryKey: 'string',
      subErrCode: 'string',
      subErrMsg: 'string',
      success: 'boolean',
      triggerId: 'string',
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


  async createAction(request: CreateActionRequest): Promise<CreateActionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new CreateActionHeaders({ });
    return await this.createActionWithOptions(request, headers, runtime);
  }

  async createActionWithOptions(request: CreateActionRequest, headers: CreateActionHeaders, runtime: $Util.RuntimeOptions): Promise<CreateActionResponse> {
    Util.validateModel(request);
    let body : {[key: string ]: any} = { };
    if (!Util.isUnset(request.actionInfo)) {
      body["actionInfo"] = request.actionInfo;
    }

    let realHeaders : {[key: string ]: string} = { };
    if (!Util.isUnset(headers.commonHeaders)) {
      realHeaders = headers.commonHeaders;
    }

    if (!Util.isUnset(headers.xAcsDingtalkAccessToken)) {
      realHeaders["x-acs-dingtalk-access-token"] = Util.toJSONString(headers.xAcsDingtalkAccessToken);
    }

    let req = new $OpenApi.OpenApiRequest({
      headers: realHeaders,
      body: OpenApiUtil.parseToMap(body),
    });
    return $tea.cast<CreateActionResponse>(await this.doROARequest("CreateAction", "connector_1.0", "HTTP", "POST", "AK", `/v1.0/connector/actions`, "json", req, runtime), new CreateActionResponse({}));
  }

  async createConnector(request: CreateConnectorRequest): Promise<CreateConnectorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new CreateConnectorHeaders({ });
    return await this.createConnectorWithOptions(request, headers, runtime);
  }

  async createConnectorWithOptions(request: CreateConnectorRequest, headers: CreateConnectorHeaders, runtime: $Util.RuntimeOptions): Promise<CreateConnectorResponse> {
    Util.validateModel(request);
    let body : {[key: string ]: any} = { };
    if (!Util.isUnset(request.connectorInfo)) {
      body["connectorInfo"] = request.connectorInfo;
    }

    let realHeaders : {[key: string ]: string} = { };
    if (!Util.isUnset(headers.commonHeaders)) {
      realHeaders = headers.commonHeaders;
    }

    if (!Util.isUnset(headers.xAcsDingtalkAccessToken)) {
      realHeaders["x-acs-dingtalk-access-token"] = Util.toJSONString(headers.xAcsDingtalkAccessToken);
    }

    let req = new $OpenApi.OpenApiRequest({
      headers: realHeaders,
      body: OpenApiUtil.parseToMap(body),
    });
    return $tea.cast<CreateConnectorResponse>(await this.doROARequest("CreateConnector", "connector_1.0", "HTTP", "POST", "AK", `/v1.0/connector/connectors`, "json", req, runtime), new CreateConnectorResponse({}));
  }

  async createTrigger(request: CreateTriggerRequest): Promise<CreateTriggerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new CreateTriggerHeaders({ });
    return await this.createTriggerWithOptions(request, headers, runtime);
  }

  async createTriggerWithOptions(request: CreateTriggerRequest, headers: CreateTriggerHeaders, runtime: $Util.RuntimeOptions): Promise<CreateTriggerResponse> {
    Util.validateModel(request);
    let body : {[key: string ]: any} = { };
    if (!Util.isUnset(request.triggerInfo)) {
      body["triggerInfo"] = request.triggerInfo;
    }

    let realHeaders : {[key: string ]: string} = { };
    if (!Util.isUnset(headers.commonHeaders)) {
      realHeaders = headers.commonHeaders;
    }

    if (!Util.isUnset(headers.xAcsDingtalkAccessToken)) {
      realHeaders["x-acs-dingtalk-access-token"] = Util.toJSONString(headers.xAcsDingtalkAccessToken);
    }

    let req = new $OpenApi.OpenApiRequest({
      headers: realHeaders,
      body: OpenApiUtil.parseToMap(body),
    });
    return $tea.cast<CreateTriggerResponse>(await this.doROARequest("CreateTrigger", "connector_1.0", "HTTP", "POST", "AK", `/v1.0/connector/triggers`, "json", req, runtime), new CreateTriggerResponse({}));
  }

  async pullDataByPage(request: PullDataByPageRequest): Promise<PullDataByPageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new PullDataByPageHeaders({ });
    return await this.pullDataByPageWithOptions(request, headers, runtime);
  }

  async pullDataByPageWithOptions(request: PullDataByPageRequest, headers: PullDataByPageHeaders, runtime: $Util.RuntimeOptions): Promise<PullDataByPageResponse> {
    Util.validateModel(request);
    let query : {[key: string ]: any} = { };
    if (!Util.isUnset(request.appId)) {
      query["appId"] = request.appId;
    }

    if (!Util.isUnset(request.dataModelId)) {
      query["dataModelId"] = request.dataModelId;
    }

    if (!Util.isUnset(request.datetimeFilterField)) {
      query["datetimeFilterField"] = request.datetimeFilterField;
    }

    if (!Util.isUnset(request.maxDatetime)) {
      query["maxDatetime"] = request.maxDatetime;
    }

    if (!Util.isUnset(request.maxResults)) {
      query["maxResults"] = request.maxResults;
    }

    if (!Util.isUnset(request.minDatetime)) {
      query["minDatetime"] = request.minDatetime;
    }

    if (!Util.isUnset(request.nextToken)) {
      query["nextToken"] = request.nextToken;
    }

    let realHeaders : {[key: string ]: string} = { };
    if (!Util.isUnset(headers.commonHeaders)) {
      realHeaders = headers.commonHeaders;
    }

    if (!Util.isUnset(headers.xAcsDingtalkAccessToken)) {
      realHeaders["x-acs-dingtalk-access-token"] = Util.toJSONString(headers.xAcsDingtalkAccessToken);
    }

    let req = new $OpenApi.OpenApiRequest({
      headers: realHeaders,
      query: OpenApiUtil.query(query),
    });
    return $tea.cast<PullDataByPageResponse>(await this.doROARequest("PullDataByPage", "connector_1.0", "HTTP", "GET", "AK", `/v1.0/connector/data`, "json", req, runtime), new PullDataByPageResponse({}));
  }

  async pullDataByPk(dataModelId: string, request: PullDataByPkRequest): Promise<PullDataByPkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new PullDataByPkHeaders({ });
    return await this.pullDataByPkWithOptions(dataModelId, request, headers, runtime);
  }

  async pullDataByPkWithOptions(dataModelId: string, request: PullDataByPkRequest, headers: PullDataByPkHeaders, runtime: $Util.RuntimeOptions): Promise<PullDataByPkResponse> {
    Util.validateModel(request);
    dataModelId = OpenApiUtil.getEncodeParam(dataModelId);
    let query : {[key: string ]: any} = { };
    if (!Util.isUnset(request.appId)) {
      query["appId"] = request.appId;
    }

    if (!Util.isUnset(request.primaryKey)) {
      query["primaryKey"] = request.primaryKey;
    }

    let realHeaders : {[key: string ]: string} = { };
    if (!Util.isUnset(headers.commonHeaders)) {
      realHeaders = headers.commonHeaders;
    }

    if (!Util.isUnset(headers.xAcsDingtalkAccessToken)) {
      realHeaders["x-acs-dingtalk-access-token"] = Util.toJSONString(headers.xAcsDingtalkAccessToken);
    }

    let req = new $OpenApi.OpenApiRequest({
      headers: realHeaders,
      query: OpenApiUtil.query(query),
    });
    return $tea.cast<PullDataByPkResponse>(await this.doROARequest("PullDataByPk", "connector_1.0", "HTTP", "GET", "AK", `/v1.0/connector/data/${dataModelId}`, "json", req, runtime), new PullDataByPkResponse({}));
  }

  async syncData(request: SyncDataRequest): Promise<SyncDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new SyncDataHeaders({ });
    return await this.syncDataWithOptions(request, headers, runtime);
  }

  async syncDataWithOptions(request: SyncDataRequest, headers: SyncDataHeaders, runtime: $Util.RuntimeOptions): Promise<SyncDataResponse> {
    Util.validateModel(request);
    let body : {[key: string ]: any} = { };
    if (!Util.isUnset(request.appId)) {
      body["appId"] = request.appId;
    }

    if (!Util.isUnset(request.triggerDataList)) {
      body["triggerDataList"] = request.triggerDataList;
    }

    let realHeaders : {[key: string ]: string} = { };
    if (!Util.isUnset(headers.commonHeaders)) {
      realHeaders = headers.commonHeaders;
    }

    if (!Util.isUnset(headers.xAcsDingtalkAccessToken)) {
      realHeaders["x-acs-dingtalk-access-token"] = Util.toJSONString(headers.xAcsDingtalkAccessToken);
    }

    let req = new $OpenApi.OpenApiRequest({
      headers: realHeaders,
      body: OpenApiUtil.parseToMap(body),
    });
    return $tea.cast<SyncDataResponse>(await this.doROARequest("SyncData", "connector_1.0", "HTTP", "POST", "AK", `/v1.0/connector/triggers/data/sync`, "json", req, runtime), new SyncDataResponse({}));
  }

}
