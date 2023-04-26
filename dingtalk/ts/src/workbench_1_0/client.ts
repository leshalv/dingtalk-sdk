// This file is auto-generated, don't edit it
/**
 *
 */
import Util, * as $Util from '@alicloud/tea-util';
import SPI from '@alicloud/gateway-spi';
import GatewayClient from '@alicloud/gateway-dingtalk';
import OpenApi, * as $OpenApi from '@alicloud/openapi-client';
import OpenApiUtil from '@alicloud/openapi-util';
import * as $tea from '@alicloud/tea-typescript';

export class GetDingPortalDetailHeaders extends $tea.Model {
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

export class GetDingPortalDetailResponseBody extends $tea.Model {
  appUuid?: string;
  dingPortalName?: string;
  pages?: GetDingPortalDetailResponseBodyPages[];
  static names(): { [key: string]: string } {
    return {
      appUuid: 'appUuid',
      dingPortalName: 'dingPortalName',
      pages: 'pages',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appUuid: 'string',
      dingPortalName: 'string',
      pages: { 'type': 'array', 'itemType': GetDingPortalDetailResponseBodyPages },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDingPortalDetailResponse extends $tea.Model {
  headers: { [key: string]: string };
  statusCode: number;
  body: GetDingPortalDetailResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      statusCode: 'statusCode',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      statusCode: 'number',
      body: GetDingPortalDetailResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPluginPermissionPointHeaders extends $tea.Model {
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

export class GetPluginPermissionPointRequest extends $tea.Model {
  miniAppId?: string;
  static names(): { [key: string]: string } {
    return {
      miniAppId: 'miniAppId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      miniAppId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPluginPermissionPointResponseBody extends $tea.Model {
  permissionPointList?: string[];
  static names(): { [key: string]: string } {
    return {
      permissionPointList: 'permissionPointList',
    };
  }

  static types(): { [key: string]: any } {
    return {
      permissionPointList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPluginPermissionPointResponse extends $tea.Model {
  headers: { [key: string]: string };
  statusCode: number;
  body: GetPluginPermissionPointResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      statusCode: 'statusCode',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      statusCode: 'number',
      body: GetPluginPermissionPointResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPluginRuleCheckInfoHeaders extends $tea.Model {
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

export class GetPluginRuleCheckInfoRequest extends $tea.Model {
  miniAppId?: string;
  static names(): { [key: string]: string } {
    return {
      miniAppId: 'miniAppId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      miniAppId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPluginRuleCheckInfoResponseBody extends $tea.Model {
  packCode?: string;
  pluginRuleCheckDetail?: string;
  static names(): { [key: string]: string } {
    return {
      packCode: 'packCode',
      pluginRuleCheckDetail: 'pluginRuleCheckDetail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      packCode: 'string',
      pluginRuleCheckDetail: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPluginRuleCheckInfoResponse extends $tea.Model {
  headers: { [key: string]: string };
  statusCode: number;
  body: GetPluginRuleCheckInfoResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      statusCode: 'statusCode',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      statusCode: 'number',
      body: GetPluginRuleCheckInfoResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListWorkBenchGroupHeaders extends $tea.Model {
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

export class ListWorkBenchGroupRequest extends $tea.Model {
  ecologicalCorpId?: string;
  groupType?: string;
  opUnionId?: string;
  static names(): { [key: string]: string } {
    return {
      ecologicalCorpId: 'ecologicalCorpId',
      groupType: 'groupType',
      opUnionId: 'opUnionId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ecologicalCorpId: 'string',
      groupType: 'string',
      opUnionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListWorkBenchGroupResponseBody extends $tea.Model {
  groupList?: ListWorkBenchGroupResponseBodyGroupList[];
  static names(): { [key: string]: string } {
    return {
      groupList: 'groupList',
    };
  }

  static types(): { [key: string]: any } {
    return {
      groupList: { 'type': 'array', 'itemType': ListWorkBenchGroupResponseBodyGroupList },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListWorkBenchGroupResponse extends $tea.Model {
  headers: { [key: string]: string };
  statusCode: number;
  body: ListWorkBenchGroupResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      statusCode: 'statusCode',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      statusCode: 'number',
      body: ListWorkBenchGroupResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryComponentScopesHeaders extends $tea.Model {
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

export class QueryComponentScopesResponseBody extends $tea.Model {
  deptVisibleScopes?: number[];
  userVisibleScopes?: string[];
  static names(): { [key: string]: string } {
    return {
      deptVisibleScopes: 'deptVisibleScopes',
      userVisibleScopes: 'userVisibleScopes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deptVisibleScopes: { 'type': 'array', 'itemType': 'number' },
      userVisibleScopes: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryComponentScopesResponse extends $tea.Model {
  headers: { [key: string]: string };
  statusCode: number;
  body: QueryComponentScopesResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      statusCode: 'statusCode',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      statusCode: 'number',
      body: QueryComponentScopesResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryShortcutScopesHeaders extends $tea.Model {
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

export class QueryShortcutScopesResponseBody extends $tea.Model {
  deptVisibleScopes?: number[];
  userVisibleScopes?: string[];
  static names(): { [key: string]: string } {
    return {
      deptVisibleScopes: 'deptVisibleScopes',
      userVisibleScopes: 'userVisibleScopes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deptVisibleScopes: { 'type': 'array', 'itemType': 'number' },
      userVisibleScopes: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryShortcutScopesResponse extends $tea.Model {
  headers: { [key: string]: string };
  statusCode: number;
  body: QueryShortcutScopesResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      statusCode: 'statusCode',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      statusCode: 'number',
      body: QueryShortcutScopesResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDingPortalPageScopeHeaders extends $tea.Model {
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

export class UpdateDingPortalPageScopeRequest extends $tea.Model {
  allVisible?: boolean;
  deptIds?: number[];
  roleIds?: number[];
  userids?: string[];
  static names(): { [key: string]: string } {
    return {
      allVisible: 'allVisible',
      deptIds: 'deptIds',
      roleIds: 'roleIds',
      userids: 'userids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      allVisible: 'boolean',
      deptIds: { 'type': 'array', 'itemType': 'number' },
      roleIds: { 'type': 'array', 'itemType': 'number' },
      userids: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDingPortalPageScopeResponse extends $tea.Model {
  headers: { [key: string]: string };
  statusCode: number;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      statusCode: 'statusCode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      statusCode: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDingPortalDetailResponseBodyPages extends $tea.Model {
  allVisible?: boolean;
  deptIds?: number[];
  pageName?: string;
  pageUuid?: string;
  roleIds?: number[];
  userids?: string[];
  static names(): { [key: string]: string } {
    return {
      allVisible: 'allVisible',
      deptIds: 'deptIds',
      pageName: 'pageName',
      pageUuid: 'pageUuid',
      roleIds: 'roleIds',
      userids: 'userids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      allVisible: 'boolean',
      deptIds: { 'type': 'array', 'itemType': 'number' },
      pageName: 'string',
      pageUuid: 'string',
      roleIds: { 'type': 'array', 'itemType': 'number' },
      userids: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListWorkBenchGroupResponseBodyGroupList extends $tea.Model {
  componentId?: string;
  name?: string;
  static names(): { [key: string]: string } {
    return {
      componentId: 'componentId',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      componentId: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}


export default class Client extends OpenApi {
  _client: SPI;

  constructor(config: $OpenApi.Config) {
    super(config);
    this._client = new GatewayClient();
    this._spi = this._client;
    this._endpointRule = "";
    if (Util.empty(this._endpoint)) {
      this._endpoint = "api.dingtalk.com";
    }

  }


  async getDingPortalDetailWithOptions(appUuid: string, headers: GetDingPortalDetailHeaders, runtime: $Util.RuntimeOptions): Promise<GetDingPortalDetailResponse> {
    let realHeaders : {[key: string ]: string} = { };
    if (!Util.isUnset(headers.commonHeaders)) {
      realHeaders = headers.commonHeaders;
    }

    if (!Util.isUnset(headers.xAcsDingtalkAccessToken)) {
      realHeaders["x-acs-dingtalk-access-token"] = Util.toJSONString(headers.xAcsDingtalkAccessToken);
    }

    let req = new $OpenApi.OpenApiRequest({
      headers: realHeaders,
    });
    let params = new $OpenApi.Params({
      action: "GetDingPortalDetail",
      version: "workbench_1.0",
      protocol: "HTTP",
      pathname: `/v1.0/workbench/dingPortals/${appUuid}`,
      method: "GET",
      authType: "AK",
      style: "ROA",
      reqBodyType: "json",
      bodyType: "json",
    });
    return $tea.cast<GetDingPortalDetailResponse>(await this.execute(params, req, runtime), new GetDingPortalDetailResponse({}));
  }

  async getDingPortalDetail(appUuid: string): Promise<GetDingPortalDetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new GetDingPortalDetailHeaders({ });
    return await this.getDingPortalDetailWithOptions(appUuid, headers, runtime);
  }

  async getPluginPermissionPointWithOptions(request: GetPluginPermissionPointRequest, headers: GetPluginPermissionPointHeaders, runtime: $Util.RuntimeOptions): Promise<GetPluginPermissionPointResponse> {
    Util.validateModel(request);
    let query : {[key: string ]: any} = { };
    if (!Util.isUnset(request.miniAppId)) {
      query["miniAppId"] = request.miniAppId;
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
    let params = new $OpenApi.Params({
      action: "GetPluginPermissionPoint",
      version: "workbench_1.0",
      protocol: "HTTP",
      pathname: `/v1.0/workbench/plugins/permissions`,
      method: "GET",
      authType: "AK",
      style: "ROA",
      reqBodyType: "json",
      bodyType: "json",
    });
    return $tea.cast<GetPluginPermissionPointResponse>(await this.execute(params, req, runtime), new GetPluginPermissionPointResponse({}));
  }

  async getPluginPermissionPoint(request: GetPluginPermissionPointRequest): Promise<GetPluginPermissionPointResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new GetPluginPermissionPointHeaders({ });
    return await this.getPluginPermissionPointWithOptions(request, headers, runtime);
  }

  async getPluginRuleCheckInfoWithOptions(request: GetPluginRuleCheckInfoRequest, headers: GetPluginRuleCheckInfoHeaders, runtime: $Util.RuntimeOptions): Promise<GetPluginRuleCheckInfoResponse> {
    Util.validateModel(request);
    let query : {[key: string ]: any} = { };
    if (!Util.isUnset(request.miniAppId)) {
      query["miniAppId"] = request.miniAppId;
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
    let params = new $OpenApi.Params({
      action: "GetPluginRuleCheckInfo",
      version: "workbench_1.0",
      protocol: "HTTP",
      pathname: `/v1.0/workbench/plugins/validationRules`,
      method: "GET",
      authType: "AK",
      style: "ROA",
      reqBodyType: "json",
      bodyType: "json",
    });
    return $tea.cast<GetPluginRuleCheckInfoResponse>(await this.execute(params, req, runtime), new GetPluginRuleCheckInfoResponse({}));
  }

  async getPluginRuleCheckInfo(request: GetPluginRuleCheckInfoRequest): Promise<GetPluginRuleCheckInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new GetPluginRuleCheckInfoHeaders({ });
    return await this.getPluginRuleCheckInfoWithOptions(request, headers, runtime);
  }

  async listWorkBenchGroupWithOptions(request: ListWorkBenchGroupRequest, headers: ListWorkBenchGroupHeaders, runtime: $Util.RuntimeOptions): Promise<ListWorkBenchGroupResponse> {
    Util.validateModel(request);
    let query : {[key: string ]: any} = { };
    if (!Util.isUnset(request.ecologicalCorpId)) {
      query["ecologicalCorpId"] = request.ecologicalCorpId;
    }

    if (!Util.isUnset(request.groupType)) {
      query["groupType"] = request.groupType;
    }

    if (!Util.isUnset(request.opUnionId)) {
      query["opUnionId"] = request.opUnionId;
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
    let params = new $OpenApi.Params({
      action: "ListWorkBenchGroup",
      version: "workbench_1.0",
      protocol: "HTTP",
      pathname: `/v1.0/workbench/groups`,
      method: "GET",
      authType: "AK",
      style: "ROA",
      reqBodyType: "none",
      bodyType: "json",
    });
    return $tea.cast<ListWorkBenchGroupResponse>(await this.execute(params, req, runtime), new ListWorkBenchGroupResponse({}));
  }

  async listWorkBenchGroup(request: ListWorkBenchGroupRequest): Promise<ListWorkBenchGroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new ListWorkBenchGroupHeaders({ });
    return await this.listWorkBenchGroupWithOptions(request, headers, runtime);
  }

  async queryComponentScopesWithOptions(componentId: string, headers: QueryComponentScopesHeaders, runtime: $Util.RuntimeOptions): Promise<QueryComponentScopesResponse> {
    let realHeaders : {[key: string ]: string} = { };
    if (!Util.isUnset(headers.commonHeaders)) {
      realHeaders = headers.commonHeaders;
    }

    if (!Util.isUnset(headers.xAcsDingtalkAccessToken)) {
      realHeaders["x-acs-dingtalk-access-token"] = Util.toJSONString(headers.xAcsDingtalkAccessToken);
    }

    let req = new $OpenApi.OpenApiRequest({
      headers: realHeaders,
    });
    let params = new $OpenApi.Params({
      action: "QueryComponentScopes",
      version: "workbench_1.0",
      protocol: "HTTP",
      pathname: `/v1.0/workbench/components/${componentId}/scopes`,
      method: "GET",
      authType: "AK",
      style: "ROA",
      reqBodyType: "json",
      bodyType: "json",
    });
    return $tea.cast<QueryComponentScopesResponse>(await this.execute(params, req, runtime), new QueryComponentScopesResponse({}));
  }

  async queryComponentScopes(componentId: string): Promise<QueryComponentScopesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new QueryComponentScopesHeaders({ });
    return await this.queryComponentScopesWithOptions(componentId, headers, runtime);
  }

  async queryShortcutScopesWithOptions(shortcutKey: string, headers: QueryShortcutScopesHeaders, runtime: $Util.RuntimeOptions): Promise<QueryShortcutScopesResponse> {
    let realHeaders : {[key: string ]: string} = { };
    if (!Util.isUnset(headers.commonHeaders)) {
      realHeaders = headers.commonHeaders;
    }

    if (!Util.isUnset(headers.xAcsDingtalkAccessToken)) {
      realHeaders["x-acs-dingtalk-access-token"] = Util.toJSONString(headers.xAcsDingtalkAccessToken);
    }

    let req = new $OpenApi.OpenApiRequest({
      headers: realHeaders,
    });
    let params = new $OpenApi.Params({
      action: "QueryShortcutScopes",
      version: "workbench_1.0",
      protocol: "HTTP",
      pathname: `/v1.0/workbench/shortcuts/${shortcutKey}/scopes`,
      method: "GET",
      authType: "AK",
      style: "ROA",
      reqBodyType: "json",
      bodyType: "json",
    });
    return $tea.cast<QueryShortcutScopesResponse>(await this.execute(params, req, runtime), new QueryShortcutScopesResponse({}));
  }

  async queryShortcutScopes(shortcutKey: string): Promise<QueryShortcutScopesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new QueryShortcutScopesHeaders({ });
    return await this.queryShortcutScopesWithOptions(shortcutKey, headers, runtime);
  }

  async updateDingPortalPageScopeWithOptions(pageUuid: string, appUuid: string, request: UpdateDingPortalPageScopeRequest, headers: UpdateDingPortalPageScopeHeaders, runtime: $Util.RuntimeOptions): Promise<UpdateDingPortalPageScopeResponse> {
    Util.validateModel(request);
    let body : {[key: string ]: any} = { };
    if (!Util.isUnset(request.allVisible)) {
      body["allVisible"] = request.allVisible;
    }

    if (!Util.isUnset(request.deptIds)) {
      body["deptIds"] = request.deptIds;
    }

    if (!Util.isUnset(request.roleIds)) {
      body["roleIds"] = request.roleIds;
    }

    if (!Util.isUnset(request.userids)) {
      body["userids"] = request.userids;
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
    let params = new $OpenApi.Params({
      action: "UpdateDingPortalPageScope",
      version: "workbench_1.0",
      protocol: "HTTP",
      pathname: `/v1.0/workbench/dingPortals/${appUuid}/pageScopes/${pageUuid}`,
      method: "PUT",
      authType: "AK",
      style: "ROA",
      reqBodyType: "json",
      bodyType: "json",
    });
    return $tea.cast<UpdateDingPortalPageScopeResponse>(await this.execute(params, req, runtime), new UpdateDingPortalPageScopeResponse({}));
  }

  async updateDingPortalPageScope(pageUuid: string, appUuid: string, request: UpdateDingPortalPageScopeRequest): Promise<UpdateDingPortalPageScopeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new UpdateDingPortalPageScopeHeaders({ });
    return await this.updateDingPortalPageScopeWithOptions(pageUuid, appUuid, request, headers, runtime);
  }

}
