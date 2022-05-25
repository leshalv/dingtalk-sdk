// This file is auto-generated, don't edit it
/**
 *
 */
import Util, * as $Util from '@alicloud/tea-util';
import OpenApi, * as $OpenApi from '@alicloud/openapi-client';
import OpenApiUtil from '@alicloud/openapi-util';
import * as $tea from '@alicloud/tea-typescript';

export class DentryOpenVO extends $tea.Model {
  contentType?: string;
  createdTime?: number;
  creator?: DentryOpenVOCreator;
  dentryId?: string;
  dentryType?: string;
  dentryUuid?: string;
  extension?: string;
  hasChildren?: boolean;
  linkSourceInfo?: LinkSourceInfo;
  name?: string;
  space?: SpaceOpenVO;
  spaceId?: string;
  updatedTime?: number;
  updater?: DentryOpenVOUpdater;
  visitorInfo?: DentryOpenVOVisitorInfo;
  static names(): { [key: string]: string } {
    return {
      contentType: 'contentType',
      createdTime: 'createdTime',
      creator: 'creator',
      dentryId: 'dentryId',
      dentryType: 'dentryType',
      dentryUuid: 'dentryUuid',
      extension: 'extension',
      hasChildren: 'hasChildren',
      linkSourceInfo: 'linkSourceInfo',
      name: 'name',
      space: 'space',
      spaceId: 'spaceId',
      updatedTime: 'updatedTime',
      updater: 'updater',
      visitorInfo: 'visitorInfo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contentType: 'string',
      createdTime: 'number',
      creator: DentryOpenVOCreator,
      dentryId: 'string',
      dentryType: 'string',
      dentryUuid: 'string',
      extension: 'string',
      hasChildren: 'boolean',
      linkSourceInfo: LinkSourceInfo,
      name: 'string',
      space: SpaceOpenVO,
      spaceId: 'string',
      updatedTime: 'number',
      updater: DentryOpenVOUpdater,
      visitorInfo: DentryOpenVOVisitorInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DentryOpenVOResult extends $tea.Model {
  contentType?: string;
  createdTime?: number;
  creator?: DentryOpenVOResultCreator;
  dentryId?: string;
  dentryType?: string;
  dentryUuid?: string;
  extension?: string;
  hasChildren?: boolean;
  linkSourceInfo?: LinkSourceInfo;
  name?: string;
  space?: SpaceOpenVO;
  spaceId?: string;
  updatedTime?: number;
  updater?: DentryOpenVOResultUpdater;
  visitorInfo?: DentryOpenVOResultVisitorInfo;
  static names(): { [key: string]: string } {
    return {
      contentType: 'contentType',
      createdTime: 'createdTime',
      creator: 'creator',
      dentryId: 'dentryId',
      dentryType: 'dentryType',
      dentryUuid: 'dentryUuid',
      extension: 'extension',
      hasChildren: 'hasChildren',
      linkSourceInfo: 'linkSourceInfo',
      name: 'name',
      space: 'space',
      spaceId: 'spaceId',
      updatedTime: 'updatedTime',
      updater: 'updater',
      visitorInfo: 'visitorInfo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contentType: 'string',
      createdTime: 'number',
      creator: DentryOpenVOResultCreator,
      dentryId: 'string',
      dentryType: 'string',
      dentryUuid: 'string',
      extension: 'string',
      hasChildren: 'boolean',
      linkSourceInfo: LinkSourceInfo,
      name: 'string',
      space: SpaceOpenVO,
      spaceId: 'string',
      updatedTime: 'number',
      updater: DentryOpenVOResultUpdater,
      visitorInfo: DentryOpenVOResultVisitorInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class LinkSourceInfo extends $tea.Model {
  extension?: string;
  iconUrl?: LinkSourceInfoIconUrl;
  id?: string;
  linkType?: number;
  spaceId?: string;
  static names(): { [key: string]: string } {
    return {
      extension: 'extension',
      iconUrl: 'iconUrl',
      id: 'id',
      linkType: 'linkType',
      spaceId: 'spaceId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      extension: 'string',
      iconUrl: LinkSourceInfoIconUrl,
      id: 'string',
      linkType: 'number',
      spaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SpaceOpenVO extends $tea.Model {
  id?: string;
  name?: string;
  owner?: SpaceOpenVOOwner;
  visitorInfo?: SpaceOpenVOVisitorInfo;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      owner: 'owner',
      visitorInfo: 'visitorInfo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      owner: SpaceOpenVOOwner,
      visitorInfo: SpaceOpenVOVisitorInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SpaceOpenVOResult extends $tea.Model {
  id?: string;
  name?: string;
  owner?: SpaceOpenVOResultOwner;
  visitorInfo?: SpaceOpenVOResultVisitorInfo;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      owner: 'owner',
      visitorInfo: 'visitorInfo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      owner: SpaceOpenVOResultOwner,
      visitorInfo: SpaceOpenVOResultVisitorInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDentryHeaders extends $tea.Model {
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

export class CreateDentryRequest extends $tea.Model {
  dentryType?: string;
  documentType?: number;
  name?: string;
  operatorId?: string;
  parentDentryId?: string;
  static names(): { [key: string]: string } {
    return {
      dentryType: 'dentryType',
      documentType: 'documentType',
      name: 'name',
      operatorId: 'operatorId',
      parentDentryId: 'parentDentryId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dentryType: 'string',
      documentType: 'number',
      name: 'string',
      operatorId: 'string',
      parentDentryId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDentryResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: DentryOpenVOResult;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: DentryOpenVOResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSpaceDirectoriesHeaders extends $tea.Model {
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

export class GetSpaceDirectoriesRequest extends $tea.Model {
  dentryId?: string;
  maxResults?: number;
  nextToken?: string;
  operatorId?: string;
  static names(): { [key: string]: string } {
    return {
      dentryId: 'dentryId',
      maxResults: 'maxResults',
      nextToken: 'nextToken',
      operatorId: 'operatorId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dentryId: 'string',
      maxResults: 'number',
      nextToken: 'string',
      operatorId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSpaceDirectoriesResponseBody extends $tea.Model {
  children?: DentryOpenVO[];
  hasMore?: boolean;
  nextToken?: string;
  static names(): { [key: string]: string } {
    return {
      children: 'children',
      hasMore: 'hasMore',
      nextToken: 'nextToken',
    };
  }

  static types(): { [key: string]: any } {
    return {
      children: { 'type': 'array', 'itemType': DentryOpenVO },
      hasMore: 'boolean',
      nextToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSpaceDirectoriesResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: GetSpaceDirectoriesResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: GetSpaceDirectoriesResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class MoveDentryHeaders extends $tea.Model {
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

export class MoveDentryRequest extends $tea.Model {
  operatorId?: string;
  targetSpaceId?: string;
  toNextDentryId?: string;
  toParentDentryId?: string;
  toPrevDentryId?: string;
  static names(): { [key: string]: string } {
    return {
      operatorId: 'operatorId',
      targetSpaceId: 'targetSpaceId',
      toNextDentryId: 'toNextDentryId',
      toParentDentryId: 'toParentDentryId',
      toPrevDentryId: 'toPrevDentryId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      operatorId: 'string',
      targetSpaceId: 'string',
      toNextDentryId: 'string',
      toParentDentryId: 'string',
      toPrevDentryId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class MoveDentryResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: DentryOpenVOResult;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: DentryOpenVOResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDentryHeaders extends $tea.Model {
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

export class QueryDentryRequest extends $tea.Model {
  includeSpace?: boolean;
  operatorId?: string;
  static names(): { [key: string]: string } {
    return {
      includeSpace: 'includeSpace',
      operatorId: 'operatorId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      includeSpace: 'boolean',
      operatorId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDentryResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: DentryOpenVOResult;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: DentryOpenVOResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySpaceHeaders extends $tea.Model {
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

export class QuerySpaceRequest extends $tea.Model {
  operatorId?: string;
  static names(): { [key: string]: string } {
    return {
      operatorId: 'operatorId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      operatorId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySpaceResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: SpaceOpenVOResult;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: SpaceOpenVOResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DentryOpenVOCreator extends $tea.Model {
  name?: string;
  unionId?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      unionId: 'unionId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      unionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DentryOpenVOUpdater extends $tea.Model {
  name?: string;
  unionId?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      unionId: 'unionId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      unionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DentryOpenVOVisitorInfo extends $tea.Model {
  dentryActions?: string[];
  spaceActions?: string[];
  static names(): { [key: string]: string } {
    return {
      dentryActions: 'dentryActions',
      spaceActions: 'spaceActions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dentryActions: { 'type': 'array', 'itemType': 'string' },
      spaceActions: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DentryOpenVOResultCreator extends $tea.Model {
  name?: string;
  unionId?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      unionId: 'unionId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      unionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DentryOpenVOResultUpdater extends $tea.Model {
  name?: string;
  unionId?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      unionId: 'unionId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      unionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DentryOpenVOResultVisitorInfo extends $tea.Model {
  dentryActions?: string[];
  spaceActions?: string[];
  static names(): { [key: string]: string } {
    return {
      dentryActions: 'dentryActions',
      spaceActions: 'spaceActions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dentryActions: { 'type': 'array', 'itemType': 'string' },
      spaceActions: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class LinkSourceInfoIconUrl extends $tea.Model {
  line?: string;
  small?: string;
  static names(): { [key: string]: string } {
    return {
      line: 'line',
      small: 'small',
    };
  }

  static types(): { [key: string]: any } {
    return {
      line: 'string',
      small: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SpaceOpenVOOwner extends $tea.Model {
  name?: string;
  unionId?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      unionId: 'unionId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      unionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SpaceOpenVOVisitorInfo extends $tea.Model {
  dentryActions?: string[];
  spaceActions?: string[];
  static names(): { [key: string]: string } {
    return {
      dentryActions: 'dentryActions',
      spaceActions: 'spaceActions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dentryActions: { 'type': 'array', 'itemType': 'string' },
      spaceActions: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SpaceOpenVOResultOwner extends $tea.Model {
  name?: string;
  unionId?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      unionId: 'unionId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      unionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SpaceOpenVOResultVisitorInfo extends $tea.Model {
  dentryActions?: string[];
  spaceActions?: string[];
  static names(): { [key: string]: string } {
    return {
      dentryActions: 'dentryActions',
      spaceActions: 'spaceActions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dentryActions: { 'type': 'array', 'itemType': 'string' },
      spaceActions: { 'type': 'array', 'itemType': 'string' },
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


  async createDentry(spaceId: string, request: CreateDentryRequest): Promise<CreateDentryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new CreateDentryHeaders({ });
    return await this.createDentryWithOptions(spaceId, request, headers, runtime);
  }

  async createDentryWithOptions(spaceId: string, request: CreateDentryRequest, headers: CreateDentryHeaders, runtime: $Util.RuntimeOptions): Promise<CreateDentryResponse> {
    Util.validateModel(request);
    spaceId = OpenApiUtil.getEncodeParam(spaceId);
    let body : {[key: string ]: any} = { };
    if (!Util.isUnset(request.dentryType)) {
      body["dentryType"] = request.dentryType;
    }

    if (!Util.isUnset(request.documentType)) {
      body["documentType"] = request.documentType;
    }

    if (!Util.isUnset(request.name)) {
      body["name"] = request.name;
    }

    if (!Util.isUnset(request.operatorId)) {
      body["operatorId"] = request.operatorId;
    }

    if (!Util.isUnset(request.parentDentryId)) {
      body["parentDentryId"] = request.parentDentryId;
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
    return $tea.cast<CreateDentryResponse>(await this.doROARequest("CreateDentry", "doc_2.0", "HTTP", "POST", "AK", `/v2.0/doc/spaces/${spaceId}/dentries`, "json", req, runtime), new CreateDentryResponse({}));
  }

  async getSpaceDirectories(spaceId: string, request: GetSpaceDirectoriesRequest): Promise<GetSpaceDirectoriesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new GetSpaceDirectoriesHeaders({ });
    return await this.getSpaceDirectoriesWithOptions(spaceId, request, headers, runtime);
  }

  async getSpaceDirectoriesWithOptions(spaceId: string, request: GetSpaceDirectoriesRequest, headers: GetSpaceDirectoriesHeaders, runtime: $Util.RuntimeOptions): Promise<GetSpaceDirectoriesResponse> {
    Util.validateModel(request);
    spaceId = OpenApiUtil.getEncodeParam(spaceId);
    let query : {[key: string ]: any} = { };
    if (!Util.isUnset(request.dentryId)) {
      query["dentryId"] = request.dentryId;
    }

    if (!Util.isUnset(request.maxResults)) {
      query["maxResults"] = request.maxResults;
    }

    if (!Util.isUnset(request.nextToken)) {
      query["nextToken"] = request.nextToken;
    }

    if (!Util.isUnset(request.operatorId)) {
      query["operatorId"] = request.operatorId;
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
    return $tea.cast<GetSpaceDirectoriesResponse>(await this.doROARequest("GetSpaceDirectories", "doc_2.0", "HTTP", "GET", "AK", `/v2.0/doc/spaces/${spaceId}/directories`, "json", req, runtime), new GetSpaceDirectoriesResponse({}));
  }

  async moveDentry(spaceId: string, dentryId: string, request: MoveDentryRequest): Promise<MoveDentryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new MoveDentryHeaders({ });
    return await this.moveDentryWithOptions(spaceId, dentryId, request, headers, runtime);
  }

  async moveDentryWithOptions(spaceId: string, dentryId: string, request: MoveDentryRequest, headers: MoveDentryHeaders, runtime: $Util.RuntimeOptions): Promise<MoveDentryResponse> {
    Util.validateModel(request);
    spaceId = OpenApiUtil.getEncodeParam(spaceId);
    dentryId = OpenApiUtil.getEncodeParam(dentryId);
    let body : {[key: string ]: any} = { };
    if (!Util.isUnset(request.operatorId)) {
      body["operatorId"] = request.operatorId;
    }

    if (!Util.isUnset(request.targetSpaceId)) {
      body["targetSpaceId"] = request.targetSpaceId;
    }

    if (!Util.isUnset(request.toNextDentryId)) {
      body["toNextDentryId"] = request.toNextDentryId;
    }

    if (!Util.isUnset(request.toParentDentryId)) {
      body["toParentDentryId"] = request.toParentDentryId;
    }

    if (!Util.isUnset(request.toPrevDentryId)) {
      body["toPrevDentryId"] = request.toPrevDentryId;
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
    return $tea.cast<MoveDentryResponse>(await this.doROARequest("MoveDentry", "doc_2.0", "HTTP", "POST", "AK", `/v2.0/doc/spaces/${spaceId}/dentries/${dentryId}/move`, "json", req, runtime), new MoveDentryResponse({}));
  }

  async queryDentry(spaceId: string, dentryId: string, request: QueryDentryRequest): Promise<QueryDentryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new QueryDentryHeaders({ });
    return await this.queryDentryWithOptions(spaceId, dentryId, request, headers, runtime);
  }

  async queryDentryWithOptions(spaceId: string, dentryId: string, request: QueryDentryRequest, headers: QueryDentryHeaders, runtime: $Util.RuntimeOptions): Promise<QueryDentryResponse> {
    Util.validateModel(request);
    spaceId = OpenApiUtil.getEncodeParam(spaceId);
    dentryId = OpenApiUtil.getEncodeParam(dentryId);
    let query : {[key: string ]: any} = { };
    if (!Util.isUnset(request.includeSpace)) {
      query["includeSpace"] = request.includeSpace;
    }

    if (!Util.isUnset(request.operatorId)) {
      query["operatorId"] = request.operatorId;
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
    return $tea.cast<QueryDentryResponse>(await this.doROARequest("QueryDentry", "doc_2.0", "HTTP", "GET", "AK", `/v2.0/doc/spaces/${spaceId}/dentries/${dentryId}`, "json", req, runtime), new QueryDentryResponse({}));
  }

  async querySpace(spaceId: string, request: QuerySpaceRequest): Promise<QuerySpaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new QuerySpaceHeaders({ });
    return await this.querySpaceWithOptions(spaceId, request, headers, runtime);
  }

  async querySpaceWithOptions(spaceId: string, request: QuerySpaceRequest, headers: QuerySpaceHeaders, runtime: $Util.RuntimeOptions): Promise<QuerySpaceResponse> {
    Util.validateModel(request);
    spaceId = OpenApiUtil.getEncodeParam(spaceId);
    let query : {[key: string ]: any} = { };
    if (!Util.isUnset(request.operatorId)) {
      query["operatorId"] = request.operatorId;
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
    return $tea.cast<QuerySpaceResponse>(await this.doROARequest("QuerySpace", "doc_2.0", "HTTP", "GET", "AK", `/v2.0/doc/spaces/${spaceId}`, "json", req, runtime), new QuerySpaceResponse({}));
  }

}
