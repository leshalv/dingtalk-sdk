// This file is auto-generated, don't edit it
/**
 *
 */
import Util, * as $Util from '@alicloud/tea-util';
import OpenApi, * as $OpenApi from '@alicloud/openapi-client';
import OpenApiUtil from '@alicloud/openapi-util';
import * as $tea from '@alicloud/tea-typescript';

export class QueryFormInstanceHeaders extends $tea.Model {
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

export class QueryFormInstanceRequest extends $tea.Model {
  formInstanceId?: string;
  formCode?: string;
  appUuid?: string;
  static names(): { [key: string]: string } {
    return {
      formInstanceId: 'formInstanceId',
      formCode: 'formCode',
      appUuid: 'appUuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      formInstanceId: 'string',
      formCode: 'string',
      appUuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFormInstanceResponseBody extends $tea.Model {
  formInstanceId?: string;
  formInstDataList?: QueryFormInstanceResponseBodyFormInstDataList[];
  appUuid?: string;
  formCode?: string;
  title?: string;
  creator?: string;
  modifier?: string;
  createTimestamp?: number;
  modifyTimestamp?: number;
  outInstanceId?: string;
  outBizCode?: string;
  attributes?: { [key: string]: any };
  static names(): { [key: string]: string } {
    return {
      formInstanceId: 'formInstanceId',
      formInstDataList: 'formInstDataList',
      appUuid: 'appUuid',
      formCode: 'formCode',
      title: 'title',
      creator: 'creator',
      modifier: 'modifier',
      createTimestamp: 'createTimestamp',
      modifyTimestamp: 'modifyTimestamp',
      outInstanceId: 'outInstanceId',
      outBizCode: 'outBizCode',
      attributes: 'attributes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      formInstanceId: 'string',
      formInstDataList: { 'type': 'array', 'itemType': QueryFormInstanceResponseBodyFormInstDataList },
      appUuid: 'string',
      formCode: 'string',
      title: 'string',
      creator: 'string',
      modifier: 'string',
      createTimestamp: 'number',
      modifyTimestamp: 'number',
      outInstanceId: 'string',
      outBizCode: 'string',
      attributes: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFormInstanceResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: QueryFormInstanceResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: QueryFormInstanceResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ProcessForecastHeaders extends $tea.Model {
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

export class ProcessForecastRequest extends $tea.Model {
  dingCorpId?: string;
  dingOrgId?: number;
  dingIsvOrgId?: number;
  dingSuiteKey?: string;
  dingTokenGrantType?: number;
  requestId?: string;
  processCode?: string;
  deptId?: number;
  userId?: string;
  formComponentValues?: ProcessForecastRequestFormComponentValues[];
  static names(): { [key: string]: string } {
    return {
      dingCorpId: 'dingCorpId',
      dingOrgId: 'dingOrgId',
      dingIsvOrgId: 'dingIsvOrgId',
      dingSuiteKey: 'dingSuiteKey',
      dingTokenGrantType: 'dingTokenGrantType',
      requestId: 'RequestId',
      processCode: 'processCode',
      deptId: 'deptId',
      userId: 'userId',
      formComponentValues: 'formComponentValues',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dingCorpId: 'string',
      dingOrgId: 'number',
      dingIsvOrgId: 'number',
      dingSuiteKey: 'string',
      dingTokenGrantType: 'number',
      requestId: 'string',
      processCode: 'string',
      deptId: 'number',
      userId: 'string',
      formComponentValues: { 'type': 'array', 'itemType': ProcessForecastRequestFormComponentValues },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ProcessForecastResponseBody extends $tea.Model {
  result?: ProcessForecastResponseBodyResult;
  static names(): { [key: string]: string } {
    return {
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      result: ProcessForecastResponseBodyResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ProcessForecastResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: ProcessForecastResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: ProcessForecastResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAllProcessInstancesHeaders extends $tea.Model {
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

export class QueryAllProcessInstancesRequest extends $tea.Model {
  nextToken?: string;
  maxResults?: number;
  startTimeInMills?: number;
  endTimeInMills?: number;
  processCode?: string;
  appUuid?: string;
  static names(): { [key: string]: string } {
    return {
      nextToken: 'nextToken',
      maxResults: 'maxResults',
      startTimeInMills: 'startTimeInMills',
      endTimeInMills: 'endTimeInMills',
      processCode: 'processCode',
      appUuid: 'appUuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nextToken: 'string',
      maxResults: 'number',
      startTimeInMills: 'number',
      endTimeInMills: 'number',
      processCode: 'string',
      appUuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAllProcessInstancesResponseBody extends $tea.Model {
  result?: QueryAllProcessInstancesResponseBodyResult;
  static names(): { [key: string]: string } {
    return {
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      result: QueryAllProcessInstancesResponseBodyResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAllProcessInstancesResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: QueryAllProcessInstancesResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: QueryAllProcessInstancesResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAllFormInstancesHeaders extends $tea.Model {
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

export class QueryAllFormInstancesRequest extends $tea.Model {
  nextToken?: string;
  maxResults?: number;
  appUuid?: string;
  formCode?: string;
  static names(): { [key: string]: string } {
    return {
      nextToken: 'nextToken',
      maxResults: 'maxResults',
      appUuid: 'appUuid',
      formCode: 'formCode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nextToken: 'string',
      maxResults: 'number',
      appUuid: 'string',
      formCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAllFormInstancesResponseBody extends $tea.Model {
  result?: QueryAllFormInstancesResponseBodyResult;
  static names(): { [key: string]: string } {
    return {
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      result: QueryAllFormInstancesResponseBodyResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAllFormInstancesResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: QueryAllFormInstancesResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: QueryAllFormInstancesResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFormByBizTypeHeaders extends $tea.Model {
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

export class QueryFormByBizTypeRequest extends $tea.Model {
  appUuid?: string;
  bizTypes?: string[];
  static names(): { [key: string]: string } {
    return {
      appUuid: 'appUuid',
      bizTypes: 'bizTypes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appUuid: 'string',
      bizTypes: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFormByBizTypeResponseBody extends $tea.Model {
  result?: QueryFormByBizTypeResponseBodyResult[];
  static names(): { [key: string]: string } {
    return {
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      result: { 'type': 'array', 'itemType': QueryFormByBizTypeResponseBodyResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFormByBizTypeResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: QueryFormByBizTypeResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: QueryFormByBizTypeResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateHeaders extends $tea.Model {
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

export class FormCreateRequest extends $tea.Model {
  dingCorpId?: string;
  dingOrgId?: number;
  dingIsvOrgId?: number;
  dingSuiteKey?: string;
  dingTokenGrantType?: number;
  requestId?: string;
  processCode?: string;
  name?: string;
  description?: string;
  formComponents?: FormCreateRequestFormComponents[];
  static names(): { [key: string]: string } {
    return {
      dingCorpId: 'dingCorpId',
      dingOrgId: 'dingOrgId',
      dingIsvOrgId: 'dingIsvOrgId',
      dingSuiteKey: 'dingSuiteKey',
      dingTokenGrantType: 'dingTokenGrantType',
      requestId: 'RequestId',
      processCode: 'processCode',
      name: 'name',
      description: 'description',
      formComponents: 'formComponents',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dingCorpId: 'string',
      dingOrgId: 'number',
      dingIsvOrgId: 'number',
      dingSuiteKey: 'string',
      dingTokenGrantType: 'number',
      requestId: 'string',
      processCode: 'string',
      name: 'string',
      description: 'string',
      formComponents: { 'type': 'array', 'itemType': FormCreateRequestFormComponents },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateResponseBody extends $tea.Model {
  result?: FormCreateResponseBodyResult;
  static names(): { [key: string]: string } {
    return {
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      result: FormCreateResponseBodyResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: FormCreateResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: FormCreateResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartProcessInstanceHeaders extends $tea.Model {
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

export class StartProcessInstanceRequest extends $tea.Model {
  originatorUserId?: string;
  processCode?: string;
  deptId?: number;
  microappAgentId?: number;
  approvers?: StartProcessInstanceRequestApprovers[];
  ccList?: string[];
  ccPosition?: string;
  targetSelectActioners?: StartProcessInstanceRequestTargetSelectActioners[];
  formComponentValues?: StartProcessInstanceRequestFormComponentValues[];
  requestId?: string;
  dingCorpId?: string;
  dingOrgId?: number;
  dingIsvOrgId?: number;
  dingSuiteKey?: string;
  dingTokenGrantType?: number;
  static names(): { [key: string]: string } {
    return {
      originatorUserId: 'originatorUserId',
      processCode: 'processCode',
      deptId: 'deptId',
      microappAgentId: 'microappAgentId',
      approvers: 'approvers',
      ccList: 'ccList',
      ccPosition: 'ccPosition',
      targetSelectActioners: 'targetSelectActioners',
      formComponentValues: 'formComponentValues',
      requestId: 'RequestId',
      dingCorpId: 'dingCorpId',
      dingOrgId: 'dingOrgId',
      dingIsvOrgId: 'dingIsvOrgId',
      dingSuiteKey: 'dingSuiteKey',
      dingTokenGrantType: 'dingTokenGrantType',
    };
  }

  static types(): { [key: string]: any } {
    return {
      originatorUserId: 'string',
      processCode: 'string',
      deptId: 'number',
      microappAgentId: 'number',
      approvers: { 'type': 'array', 'itemType': StartProcessInstanceRequestApprovers },
      ccList: { 'type': 'array', 'itemType': 'string' },
      ccPosition: 'string',
      targetSelectActioners: { 'type': 'array', 'itemType': StartProcessInstanceRequestTargetSelectActioners },
      formComponentValues: { 'type': 'array', 'itemType': StartProcessInstanceRequestFormComponentValues },
      requestId: 'string',
      dingCorpId: 'string',
      dingOrgId: 'number',
      dingIsvOrgId: 'number',
      dingSuiteKey: 'string',
      dingTokenGrantType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartProcessInstanceResponseBody extends $tea.Model {
  instanceId?: string;
  static names(): { [key: string]: string } {
    return {
      instanceId: 'instanceId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartProcessInstanceResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: StartProcessInstanceResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: StartProcessInstanceResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFormInstanceResponseBodyFormInstDataList extends $tea.Model {
  componentType?: string;
  bizAlias?: string;
  extendValue?: string;
  label?: string;
  value?: string;
  key?: string;
  static names(): { [key: string]: string } {
    return {
      componentType: 'componentType',
      bizAlias: 'bizAlias',
      extendValue: 'extendValue',
      label: 'label',
      value: 'value',
      key: 'key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      componentType: 'string',
      bizAlias: 'string',
      extendValue: 'string',
      label: 'string',
      value: 'string',
      key: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ProcessForecastRequestFormComponentValuesDetailsDetails extends $tea.Model {
  id?: string;
  bizAlias?: string;
  name?: string;
  value?: string;
  extValue?: string;
  componentType?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      bizAlias: 'bizAlias',
      name: 'name',
      value: 'value',
      extValue: 'extValue',
      componentType: 'componentType',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      bizAlias: 'string',
      name: 'string',
      value: 'string',
      extValue: 'string',
      componentType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ProcessForecastRequestFormComponentValuesDetails extends $tea.Model {
  id?: string;
  bizAlias?: string;
  name?: string;
  value?: string;
  extValue?: string;
  details?: ProcessForecastRequestFormComponentValuesDetailsDetails[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      bizAlias: 'bizAlias',
      name: 'name',
      value: 'value',
      extValue: 'extValue',
      details: 'details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      bizAlias: 'string',
      name: 'string',
      value: 'string',
      extValue: 'string',
      details: { 'type': 'array', 'itemType': ProcessForecastRequestFormComponentValuesDetailsDetails },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ProcessForecastRequestFormComponentValues extends $tea.Model {
  id?: string;
  bizAlias?: string;
  name?: string;
  value?: string;
  extValue?: string;
  componentType?: string;
  details?: ProcessForecastRequestFormComponentValuesDetails[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      bizAlias: 'bizAlias',
      name: 'name',
      value: 'value',
      extValue: 'extValue',
      componentType: 'componentType',
      details: 'details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      bizAlias: 'string',
      name: 'string',
      value: 'string',
      extValue: 'string',
      componentType: 'string',
      details: { 'type': 'array', 'itemType': ProcessForecastRequestFormComponentValuesDetails },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ProcessForecastResponseBodyResultWorkflowActivityRulesWorkflowActorActorSelectionRangeApprovals extends $tea.Model {
  workNo?: string;
  userName?: string;
  static names(): { [key: string]: string } {
    return {
      workNo: 'workNo',
      userName: 'userName',
    };
  }

  static types(): { [key: string]: any } {
    return {
      workNo: 'string',
      userName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ProcessForecastResponseBodyResultWorkflowActivityRulesWorkflowActorActorSelectionRangeLabels extends $tea.Model {
  labels?: string;
  labelNames?: string;
  static names(): { [key: string]: string } {
    return {
      labels: 'labels',
      labelNames: 'labelNames',
    };
  }

  static types(): { [key: string]: any } {
    return {
      labels: 'string',
      labelNames: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ProcessForecastResponseBodyResultWorkflowActivityRulesWorkflowActorActorSelectionRange extends $tea.Model {
  approvals?: ProcessForecastResponseBodyResultWorkflowActivityRulesWorkflowActorActorSelectionRangeApprovals[];
  labels?: ProcessForecastResponseBodyResultWorkflowActivityRulesWorkflowActorActorSelectionRangeLabels[];
  static names(): { [key: string]: string } {
    return {
      approvals: 'approvals',
      labels: 'labels',
    };
  }

  static types(): { [key: string]: any } {
    return {
      approvals: { 'type': 'array', 'itemType': ProcessForecastResponseBodyResultWorkflowActivityRulesWorkflowActorActorSelectionRangeApprovals },
      labels: { 'type': 'array', 'itemType': ProcessForecastResponseBodyResultWorkflowActivityRulesWorkflowActorActorSelectionRangeLabels },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ProcessForecastResponseBodyResultWorkflowActivityRulesWorkflowActor extends $tea.Model {
  actorKey?: string;
  actorType?: string;
  actorSelectionType?: string;
  actorSelectionRange?: ProcessForecastResponseBodyResultWorkflowActivityRulesWorkflowActorActorSelectionRange;
  allowedMulti?: boolean;
  approvalType?: string;
  approvalMethod?: string;
  actorActivateType?: string;
  required?: boolean;
  static names(): { [key: string]: string } {
    return {
      actorKey: 'actorKey',
      actorType: 'actorType',
      actorSelectionType: 'actorSelectionType',
      actorSelectionRange: 'actorSelectionRange',
      allowedMulti: 'allowedMulti',
      approvalType: 'approvalType',
      approvalMethod: 'approvalMethod',
      actorActivateType: 'actorActivateType',
      required: 'required',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actorKey: 'string',
      actorType: 'string',
      actorSelectionType: 'string',
      actorSelectionRange: ProcessForecastResponseBodyResultWorkflowActivityRulesWorkflowActorActorSelectionRange,
      allowedMulti: 'boolean',
      approvalType: 'string',
      approvalMethod: 'string',
      actorActivateType: 'string',
      required: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ProcessForecastResponseBodyResultWorkflowActivityRules extends $tea.Model {
  activityId?: string;
  prevActivityId?: string;
  activityName?: string;
  activityType?: string;
  isTargetSelect?: boolean;
  workflowActor?: ProcessForecastResponseBodyResultWorkflowActivityRulesWorkflowActor;
  static names(): { [key: string]: string } {
    return {
      activityId: 'activityId',
      prevActivityId: 'prevActivityId',
      activityName: 'activityName',
      activityType: 'activityType',
      isTargetSelect: 'isTargetSelect',
      workflowActor: 'workflowActor',
    };
  }

  static types(): { [key: string]: any } {
    return {
      activityId: 'string',
      prevActivityId: 'string',
      activityName: 'string',
      activityType: 'string',
      isTargetSelect: 'boolean',
      workflowActor: ProcessForecastResponseBodyResultWorkflowActivityRulesWorkflowActor,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ProcessForecastResponseBodyResultWorkflowForecastNodes extends $tea.Model {
  activityId?: string;
  outId?: string;
  static names(): { [key: string]: string } {
    return {
      activityId: 'activityId',
      outId: 'outId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      activityId: 'string',
      outId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ProcessForecastResponseBodyResult extends $tea.Model {
  isForecastSuccess?: boolean;
  processCode?: string;
  userId?: string;
  processId?: number;
  isStaticWorkflow?: boolean;
  workflowActivityRules?: ProcessForecastResponseBodyResultWorkflowActivityRules[];
  workflowForecastNodes?: ProcessForecastResponseBodyResultWorkflowForecastNodes[];
  static names(): { [key: string]: string } {
    return {
      isForecastSuccess: 'isForecastSuccess',
      processCode: 'processCode',
      userId: 'userId',
      processId: 'processId',
      isStaticWorkflow: 'isStaticWorkflow',
      workflowActivityRules: 'workflowActivityRules',
      workflowForecastNodes: 'workflowForecastNodes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      isForecastSuccess: 'boolean',
      processCode: 'string',
      userId: 'string',
      processId: 'number',
      isStaticWorkflow: 'boolean',
      workflowActivityRules: { 'type': 'array', 'itemType': ProcessForecastResponseBodyResultWorkflowActivityRules },
      workflowForecastNodes: { 'type': 'array', 'itemType': ProcessForecastResponseBodyResultWorkflowForecastNodes },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAllProcessInstancesResponseBodyResultListFormComponentValues extends $tea.Model {
  name?: string;
  id?: string;
  value?: string;
  extValue?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      id: 'id',
      value: 'value',
      extValue: 'extValue',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      id: 'string',
      value: 'string',
      extValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAllProcessInstancesResponseBodyResultList extends $tea.Model {
  processInstanceId?: string;
  mainProcessInstanceId?: string;
  finishTime?: number;
  attachedProcessInstanceIds?: string;
  businessId?: string;
  title?: string;
  originatorDeptId?: string;
  result?: string;
  createTime?: number;
  originatorUserid?: string;
  status?: string;
  formComponentValues?: QueryAllProcessInstancesResponseBodyResultListFormComponentValues[];
  static names(): { [key: string]: string } {
    return {
      processInstanceId: 'processInstanceId',
      mainProcessInstanceId: 'mainProcessInstanceId',
      finishTime: 'finishTime',
      attachedProcessInstanceIds: 'attachedProcessInstanceIds',
      businessId: 'businessId',
      title: 'title',
      originatorDeptId: 'originatorDeptId',
      result: 'result',
      createTime: 'createTime',
      originatorUserid: 'originatorUserid',
      status: 'status',
      formComponentValues: 'formComponentValues',
    };
  }

  static types(): { [key: string]: any } {
    return {
      processInstanceId: 'string',
      mainProcessInstanceId: 'string',
      finishTime: 'number',
      attachedProcessInstanceIds: 'string',
      businessId: 'string',
      title: 'string',
      originatorDeptId: 'string',
      result: 'string',
      createTime: 'number',
      originatorUserid: 'string',
      status: 'string',
      formComponentValues: { 'type': 'array', 'itemType': QueryAllProcessInstancesResponseBodyResultListFormComponentValues },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAllProcessInstancesResponseBodyResult extends $tea.Model {
  nextToken?: string;
  hasMore?: boolean;
  maxResults?: number;
  list?: QueryAllProcessInstancesResponseBodyResultList[];
  static names(): { [key: string]: string } {
    return {
      nextToken: 'nextToken',
      hasMore: 'hasMore',
      maxResults: 'maxResults',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nextToken: 'string',
      hasMore: 'boolean',
      maxResults: 'number',
      list: { 'type': 'array', 'itemType': QueryAllProcessInstancesResponseBodyResultList },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAllFormInstancesResponseBodyResultValuesFormInstDataList extends $tea.Model {
  componentType?: string;
  bizAlias?: string;
  extendValue?: string;
  label?: string;
  value?: string;
  key?: string;
  static names(): { [key: string]: string } {
    return {
      componentType: 'componentType',
      bizAlias: 'bizAlias',
      extendValue: 'extendValue',
      label: 'label',
      value: 'value',
      key: 'key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      componentType: 'string',
      bizAlias: 'string',
      extendValue: 'string',
      label: 'string',
      value: 'string',
      key: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAllFormInstancesResponseBodyResultValues extends $tea.Model {
  formInstanceId?: string;
  appUuid?: string;
  formCode?: string;
  title?: string;
  creator?: string;
  modifier?: string;
  createTimestamp?: number;
  modifyTimestamp?: number;
  outInstanceId?: string;
  outBizCode?: string;
  attributes?: { [key: string]: any };
  formInstDataList?: QueryAllFormInstancesResponseBodyResultValuesFormInstDataList[];
  static names(): { [key: string]: string } {
    return {
      formInstanceId: 'formInstanceId',
      appUuid: 'appUuid',
      formCode: 'formCode',
      title: 'title',
      creator: 'creator',
      modifier: 'modifier',
      createTimestamp: 'createTimestamp',
      modifyTimestamp: 'modifyTimestamp',
      outInstanceId: 'outInstanceId',
      outBizCode: 'outBizCode',
      attributes: 'attributes',
      formInstDataList: 'formInstDataList',
    };
  }

  static types(): { [key: string]: any } {
    return {
      formInstanceId: 'string',
      appUuid: 'string',
      formCode: 'string',
      title: 'string',
      creator: 'string',
      modifier: 'string',
      createTimestamp: 'number',
      modifyTimestamp: 'number',
      outInstanceId: 'string',
      outBizCode: 'string',
      attributes: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      formInstDataList: { 'type': 'array', 'itemType': QueryAllFormInstancesResponseBodyResultValuesFormInstDataList },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAllFormInstancesResponseBodyResult extends $tea.Model {
  nextToken?: string;
  hasMore?: boolean;
  maxResults?: number;
  values?: QueryAllFormInstancesResponseBodyResultValues[];
  static names(): { [key: string]: string } {
    return {
      nextToken: 'nextToken',
      hasMore: 'hasMore',
      maxResults: 'maxResults',
      values: 'values',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nextToken: 'string',
      hasMore: 'boolean',
      maxResults: 'number',
      values: { 'type': 'array', 'itemType': QueryAllFormInstancesResponseBodyResultValues },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFormByBizTypeResponseBodyResult extends $tea.Model {
  creator?: string;
  appUuid?: string;
  formCode?: string;
  formUuid?: string;
  name?: string;
  memo?: string;
  ownerId?: string;
  appType?: number;
  bizType?: string;
  status?: string;
  createTime?: number;
  modifedTime?: number;
  content?: string;
  static names(): { [key: string]: string } {
    return {
      creator: 'creator',
      appUuid: 'appUuid',
      formCode: 'formCode',
      formUuid: 'formUuid',
      name: 'name',
      memo: 'memo',
      ownerId: 'ownerId',
      appType: 'appType',
      bizType: 'bizType',
      status: 'status',
      createTime: 'createTime',
      modifedTime: 'modifedTime',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      creator: 'string',
      appUuid: 'string',
      formCode: 'string',
      formUuid: 'string',
      name: 'string',
      memo: 'string',
      ownerId: 'string',
      appType: 'number',
      bizType: 'string',
      status: 'string',
      createTime: 'number',
      modifedTime: 'number',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsPropsOptions extends $tea.Model {
  value?: string;
  key?: string;
  static names(): { [key: string]: string } {
    return {
      value: 'value',
      key: 'key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      value: 'string',
      key: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsPropsStatField extends $tea.Model {
  componentId?: string;
  label?: string;
  upper?: boolean;
  payEnable?: string;
  static names(): { [key: string]: string } {
    return {
      componentId: 'componentId',
      label: 'label',
      upper: 'upper',
      payEnable: 'payEnable',
    };
  }

  static types(): { [key: string]: any } {
    return {
      componentId: 'string',
      label: 'string',
      upper: 'boolean',
      payEnable: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsPropsDataSourceTarget extends $tea.Model {
  appUuid?: string;
  appType?: number;
  bizType?: string;
  formCode?: string;
  static names(): { [key: string]: string } {
    return {
      appUuid: 'appUuid',
      appType: 'appType',
      bizType: 'bizType',
      formCode: 'formCode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appUuid: 'string',
      appType: 'number',
      bizType: 'string',
      formCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsPropsDataSource extends $tea.Model {
  type?: string;
  target?: FormCreateRequestFormComponentsPropsDataSourceTarget;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      target: 'target',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      target: FormCreateRequestFormComponentsPropsDataSourceTarget,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsPropsFieldsPropsOptions extends $tea.Model {
  key?: string;
  value?: string;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsPropsFieldsProps extends $tea.Model {
  componentId?: string;
  label?: string;
  labelEditableFreeze?: boolean;
  required?: boolean;
  requiredEditableFreeze?: boolean;
  print?: string;
  content?: string;
  format?: string;
  options?: FormCreateRequestFormComponentsPropsFieldsPropsOptions[];
  upper?: string;
  unit?: string;
  placeholder?: string;
  bizAlias?: string;
  bizType?: string;
  duration?: boolean;
  choice?: string;
  disabled?: boolean;
  align?: string;
  static names(): { [key: string]: string } {
    return {
      componentId: 'componentId',
      label: 'label',
      labelEditableFreeze: 'labelEditableFreeze',
      required: 'required',
      requiredEditableFreeze: 'requiredEditableFreeze',
      print: 'print',
      content: 'content',
      format: 'format',
      options: 'options',
      upper: 'upper',
      unit: 'unit',
      placeholder: 'placeholder',
      bizAlias: 'bizAlias',
      bizType: 'bizType',
      duration: 'duration',
      choice: 'choice',
      disabled: 'disabled',
      align: 'align',
    };
  }

  static types(): { [key: string]: any } {
    return {
      componentId: 'string',
      label: 'string',
      labelEditableFreeze: 'boolean',
      required: 'boolean',
      requiredEditableFreeze: 'boolean',
      print: 'string',
      content: 'string',
      format: 'string',
      options: { 'type': 'array', 'itemType': FormCreateRequestFormComponentsPropsFieldsPropsOptions },
      upper: 'string',
      unit: 'string',
      placeholder: 'string',
      bizAlias: 'string',
      bizType: 'string',
      duration: 'boolean',
      choice: 'string',
      disabled: 'boolean',
      align: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsPropsFields extends $tea.Model {
  componentType?: string;
  props?: FormCreateRequestFormComponentsPropsFieldsProps;
  static names(): { [key: string]: string } {
    return {
      componentType: 'componentType',
      props: 'props',
    };
  }

  static types(): { [key: string]: any } {
    return {
      componentType: 'string',
      props: FormCreateRequestFormComponentsPropsFieldsProps,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsPropsAvailableTemplates extends $tea.Model {
  name?: string;
  processCode?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      processCode: 'processCode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      processCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsProps extends $tea.Model {
  componentId?: string;
  label?: string;
  asyncCondition?: boolean;
  required?: boolean;
  content?: string;
  format?: string;
  upper?: string;
  unit?: string;
  placeholder?: string;
  bizAlias?: string;
  bizType?: string;
  duration?: boolean;
  choice?: string;
  disabled?: boolean;
  align?: string;
  invisible?: boolean;
  link?: string;
  verticalPrint?: boolean;
  formula?: string;
  commonBizType?: string;
  options?: FormCreateRequestFormComponentsPropsOptions[];
  print?: string;
  statField?: FormCreateRequestFormComponentsPropsStatField[];
  dataSource?: FormCreateRequestFormComponentsPropsDataSource;
  fields?: FormCreateRequestFormComponentsPropsFields[];
  addressModel?: string;
  multiple?: boolean;
  limit?: number;
  availableTemplates?: FormCreateRequestFormComponentsPropsAvailableTemplates[];
  tableViewMode?: string;
  static names(): { [key: string]: string } {
    return {
      componentId: 'componentId',
      label: 'label',
      asyncCondition: 'asyncCondition',
      required: 'required',
      content: 'content',
      format: 'format',
      upper: 'upper',
      unit: 'unit',
      placeholder: 'placeholder',
      bizAlias: 'bizAlias',
      bizType: 'bizType',
      duration: 'duration',
      choice: 'choice',
      disabled: 'disabled',
      align: 'align',
      invisible: 'invisible',
      link: 'link',
      verticalPrint: 'verticalPrint',
      formula: 'formula',
      commonBizType: 'commonBizType',
      options: 'options',
      print: 'print',
      statField: 'statField',
      dataSource: 'dataSource',
      fields: 'fields',
      addressModel: 'addressModel',
      multiple: 'multiple',
      limit: 'limit',
      availableTemplates: 'availableTemplates',
      tableViewMode: 'tableViewMode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      componentId: 'string',
      label: 'string',
      asyncCondition: 'boolean',
      required: 'boolean',
      content: 'string',
      format: 'string',
      upper: 'string',
      unit: 'string',
      placeholder: 'string',
      bizAlias: 'string',
      bizType: 'string',
      duration: 'boolean',
      choice: 'string',
      disabled: 'boolean',
      align: 'string',
      invisible: 'boolean',
      link: 'string',
      verticalPrint: 'boolean',
      formula: 'string',
      commonBizType: 'string',
      options: { 'type': 'array', 'itemType': FormCreateRequestFormComponentsPropsOptions },
      print: 'string',
      statField: { 'type': 'array', 'itemType': FormCreateRequestFormComponentsPropsStatField },
      dataSource: FormCreateRequestFormComponentsPropsDataSource,
      fields: { 'type': 'array', 'itemType': FormCreateRequestFormComponentsPropsFields },
      addressModel: 'string',
      multiple: 'boolean',
      limit: 'number',
      availableTemplates: { 'type': 'array', 'itemType': FormCreateRequestFormComponentsPropsAvailableTemplates },
      tableViewMode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsChildrenPropsOptions extends $tea.Model {
  value?: string;
  key?: string;
  static names(): { [key: string]: string } {
    return {
      value: 'value',
      key: 'key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      value: 'string',
      key: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsChildrenPropsStatField extends $tea.Model {
  componentId?: string;
  label?: string;
  upper?: boolean;
  payEnable?: string;
  static names(): { [key: string]: string } {
    return {
      componentId: 'componentId',
      label: 'label',
      upper: 'upper',
      payEnable: 'payEnable',
    };
  }

  static types(): { [key: string]: any } {
    return {
      componentId: 'string',
      label: 'string',
      upper: 'boolean',
      payEnable: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsChildrenPropsDataSourceTarget extends $tea.Model {
  appUuid?: string;
  appType?: number;
  bizType?: string;
  formCode?: string;
  static names(): { [key: string]: string } {
    return {
      appUuid: 'appUuid',
      appType: 'appType',
      bizType: 'bizType',
      formCode: 'formCode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appUuid: 'string',
      appType: 'number',
      bizType: 'string',
      formCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsChildrenPropsDataSource extends $tea.Model {
  type?: string;
  target?: FormCreateRequestFormComponentsChildrenPropsDataSourceTarget;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      target: 'target',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      target: FormCreateRequestFormComponentsChildrenPropsDataSourceTarget,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsChildrenPropsFieldsPropsOptions extends $tea.Model {
  key?: string;
  value?: string;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsChildrenPropsFieldsProps extends $tea.Model {
  componentId?: string;
  label?: string;
  labelEditableFreeze?: boolean;
  required?: boolean;
  requiredEditableFreeze?: boolean;
  print?: string;
  content?: string;
  format?: string;
  options?: FormCreateRequestFormComponentsChildrenPropsFieldsPropsOptions[];
  notUpper?: string;
  unit?: string;
  placeholder?: string;
  bizAlias?: string;
  bizType?: string;
  duration?: boolean;
  choice?: string;
  disabled?: boolean;
  align?: string;
  static names(): { [key: string]: string } {
    return {
      componentId: 'componentId',
      label: 'label',
      labelEditableFreeze: 'labelEditableFreeze',
      required: 'required',
      requiredEditableFreeze: 'requiredEditableFreeze',
      print: 'print',
      content: 'content',
      format: 'format',
      options: 'options',
      notUpper: 'notUpper',
      unit: 'unit',
      placeholder: 'placeholder',
      bizAlias: 'bizAlias',
      bizType: 'bizType',
      duration: 'duration',
      choice: 'choice',
      disabled: 'disabled',
      align: 'align',
    };
  }

  static types(): { [key: string]: any } {
    return {
      componentId: 'string',
      label: 'string',
      labelEditableFreeze: 'boolean',
      required: 'boolean',
      requiredEditableFreeze: 'boolean',
      print: 'string',
      content: 'string',
      format: 'string',
      options: { 'type': 'array', 'itemType': FormCreateRequestFormComponentsChildrenPropsFieldsPropsOptions },
      notUpper: 'string',
      unit: 'string',
      placeholder: 'string',
      bizAlias: 'string',
      bizType: 'string',
      duration: 'boolean',
      choice: 'string',
      disabled: 'boolean',
      align: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsChildrenPropsFields extends $tea.Model {
  componentType?: string;
  props?: FormCreateRequestFormComponentsChildrenPropsFieldsProps;
  static names(): { [key: string]: string } {
    return {
      componentType: 'componentType',
      props: 'props',
    };
  }

  static types(): { [key: string]: any } {
    return {
      componentType: 'string',
      props: FormCreateRequestFormComponentsChildrenPropsFieldsProps,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsChildrenPropsAvailableTemplates extends $tea.Model {
  name?: string;
  processCode?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      processCode: 'processCode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      processCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsChildrenProps extends $tea.Model {
  componentId?: string;
  label?: string;
  asyncCondition?: boolean;
  required?: boolean;
  content?: string;
  format?: string;
  upper?: string;
  unit?: string;
  placeholder?: string;
  bizAlias?: string;
  bizType?: string;
  duration?: boolean;
  choice?: string;
  disabled?: boolean;
  align?: string;
  invisible?: boolean;
  link?: string;
  verticalPrint?: boolean;
  formula?: string;
  commonBizType?: string;
  options?: FormCreateRequestFormComponentsChildrenPropsOptions[];
  print?: string;
  statField?: FormCreateRequestFormComponentsChildrenPropsStatField[];
  dataSource?: FormCreateRequestFormComponentsChildrenPropsDataSource;
  fields?: FormCreateRequestFormComponentsChildrenPropsFields[];
  addressModel?: string;
  multiple?: boolean;
  limit?: number;
  availableTemplates?: FormCreateRequestFormComponentsChildrenPropsAvailableTemplates[];
  tableViewMode?: string;
  static names(): { [key: string]: string } {
    return {
      componentId: 'componentId',
      label: 'label',
      asyncCondition: 'asyncCondition',
      required: 'required',
      content: 'content',
      format: 'format',
      upper: 'upper',
      unit: 'unit',
      placeholder: 'placeholder',
      bizAlias: 'bizAlias',
      bizType: 'bizType',
      duration: 'duration',
      choice: 'choice',
      disabled: 'disabled',
      align: 'align',
      invisible: 'invisible',
      link: 'link',
      verticalPrint: 'verticalPrint',
      formula: 'formula',
      commonBizType: 'commonBizType',
      options: 'options',
      print: 'print',
      statField: 'statField',
      dataSource: 'dataSource',
      fields: 'fields',
      addressModel: 'addressModel',
      multiple: 'multiple',
      limit: 'limit',
      availableTemplates: 'availableTemplates',
      tableViewMode: 'tableViewMode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      componentId: 'string',
      label: 'string',
      asyncCondition: 'boolean',
      required: 'boolean',
      content: 'string',
      format: 'string',
      upper: 'string',
      unit: 'string',
      placeholder: 'string',
      bizAlias: 'string',
      bizType: 'string',
      duration: 'boolean',
      choice: 'string',
      disabled: 'boolean',
      align: 'string',
      invisible: 'boolean',
      link: 'string',
      verticalPrint: 'boolean',
      formula: 'string',
      commonBizType: 'string',
      options: { 'type': 'array', 'itemType': FormCreateRequestFormComponentsChildrenPropsOptions },
      print: 'string',
      statField: { 'type': 'array', 'itemType': FormCreateRequestFormComponentsChildrenPropsStatField },
      dataSource: FormCreateRequestFormComponentsChildrenPropsDataSource,
      fields: { 'type': 'array', 'itemType': FormCreateRequestFormComponentsChildrenPropsFields },
      addressModel: 'string',
      multiple: 'boolean',
      limit: 'number',
      availableTemplates: { 'type': 'array', 'itemType': FormCreateRequestFormComponentsChildrenPropsAvailableTemplates },
      tableViewMode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsChildrenChildrenPropsOptions extends $tea.Model {
  value?: string;
  key?: string;
  static names(): { [key: string]: string } {
    return {
      value: 'value',
      key: 'key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      value: 'string',
      key: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsChildrenChildrenPropsStatField extends $tea.Model {
  componentId?: string;
  label?: string;
  upper?: boolean;
  payEnable?: string;
  static names(): { [key: string]: string } {
    return {
      componentId: 'componentId',
      label: 'label',
      upper: 'upper',
      payEnable: 'payEnable',
    };
  }

  static types(): { [key: string]: any } {
    return {
      componentId: 'string',
      label: 'string',
      upper: 'boolean',
      payEnable: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsChildrenChildrenPropsDataSourceTarget extends $tea.Model {
  appUuid?: string;
  appType?: number;
  bizType?: string;
  formCode?: string;
  static names(): { [key: string]: string } {
    return {
      appUuid: 'appUuid',
      appType: 'appType',
      bizType: 'bizType',
      formCode: 'formCode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appUuid: 'string',
      appType: 'number',
      bizType: 'string',
      formCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsChildrenChildrenPropsDataSource extends $tea.Model {
  type?: string;
  target?: FormCreateRequestFormComponentsChildrenChildrenPropsDataSourceTarget;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      target: 'target',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      target: FormCreateRequestFormComponentsChildrenChildrenPropsDataSourceTarget,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsChildrenChildrenPropsFieldsPropsOptions extends $tea.Model {
  key?: string;
  value?: string;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsChildrenChildrenPropsFieldsProps extends $tea.Model {
  componentId?: string;
  label?: string;
  required?: boolean;
  print?: string;
  content?: string;
  format?: string;
  options?: FormCreateRequestFormComponentsChildrenChildrenPropsFieldsPropsOptions[];
  upper?: string;
  unit?: string;
  placeholder?: string;
  bizAlias?: string;
  bizType?: string;
  duration?: boolean;
  choice?: string;
  disabled?: boolean;
  align?: string;
  static names(): { [key: string]: string } {
    return {
      componentId: 'componentId',
      label: 'label',
      required: 'required',
      print: 'print',
      content: 'content',
      format: 'format',
      options: 'options',
      upper: 'upper',
      unit: 'unit',
      placeholder: 'placeholder',
      bizAlias: 'bizAlias',
      bizType: 'bizType',
      duration: 'duration',
      choice: 'choice',
      disabled: 'disabled',
      align: 'align',
    };
  }

  static types(): { [key: string]: any } {
    return {
      componentId: 'string',
      label: 'string',
      required: 'boolean',
      print: 'string',
      content: 'string',
      format: 'string',
      options: { 'type': 'array', 'itemType': FormCreateRequestFormComponentsChildrenChildrenPropsFieldsPropsOptions },
      upper: 'string',
      unit: 'string',
      placeholder: 'string',
      bizAlias: 'string',
      bizType: 'string',
      duration: 'boolean',
      choice: 'string',
      disabled: 'boolean',
      align: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsChildrenChildrenPropsFields extends $tea.Model {
  componentType?: string;
  props?: FormCreateRequestFormComponentsChildrenChildrenPropsFieldsProps;
  static names(): { [key: string]: string } {
    return {
      componentType: 'componentType',
      props: 'props',
    };
  }

  static types(): { [key: string]: any } {
    return {
      componentType: 'string',
      props: FormCreateRequestFormComponentsChildrenChildrenPropsFieldsProps,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsChildrenChildrenProps extends $tea.Model {
  componentId?: string;
  label?: string;
  asyncCondition?: boolean;
  required?: boolean;
  content?: string;
  format?: string;
  upper?: string;
  unit?: string;
  placeholder?: string;
  bizAlias?: string;
  bizType?: string;
  duration?: boolean;
  choice?: string;
  disabled?: boolean;
  align?: string;
  invisible?: boolean;
  link?: string;
  verticalPrint?: boolean;
  formula?: string;
  commonBizType?: string;
  options?: FormCreateRequestFormComponentsChildrenChildrenPropsOptions[];
  print?: string;
  statField?: FormCreateRequestFormComponentsChildrenChildrenPropsStatField[];
  dataSource?: FormCreateRequestFormComponentsChildrenChildrenPropsDataSource;
  fields?: FormCreateRequestFormComponentsChildrenChildrenPropsFields[];
  static names(): { [key: string]: string } {
    return {
      componentId: 'componentId',
      label: 'label',
      asyncCondition: 'asyncCondition',
      required: 'required',
      content: 'content',
      format: 'format',
      upper: 'upper',
      unit: 'unit',
      placeholder: 'placeholder',
      bizAlias: 'bizAlias',
      bizType: 'bizType',
      duration: 'duration',
      choice: 'choice',
      disabled: 'disabled',
      align: 'align',
      invisible: 'invisible',
      link: 'link',
      verticalPrint: 'verticalPrint',
      formula: 'formula',
      commonBizType: 'commonBizType',
      options: 'options',
      print: 'print',
      statField: 'statField',
      dataSource: 'dataSource',
      fields: 'fields',
    };
  }

  static types(): { [key: string]: any } {
    return {
      componentId: 'string',
      label: 'string',
      asyncCondition: 'boolean',
      required: 'boolean',
      content: 'string',
      format: 'string',
      upper: 'string',
      unit: 'string',
      placeholder: 'string',
      bizAlias: 'string',
      bizType: 'string',
      duration: 'boolean',
      choice: 'string',
      disabled: 'boolean',
      align: 'string',
      invisible: 'boolean',
      link: 'string',
      verticalPrint: 'boolean',
      formula: 'string',
      commonBizType: 'string',
      options: { 'type': 'array', 'itemType': FormCreateRequestFormComponentsChildrenChildrenPropsOptions },
      print: 'string',
      statField: { 'type': 'array', 'itemType': FormCreateRequestFormComponentsChildrenChildrenPropsStatField },
      dataSource: FormCreateRequestFormComponentsChildrenChildrenPropsDataSource,
      fields: { 'type': 'array', 'itemType': FormCreateRequestFormComponentsChildrenChildrenPropsFields },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsChildrenChildren extends $tea.Model {
  componentType?: string;
  props?: FormCreateRequestFormComponentsChildrenChildrenProps;
  static names(): { [key: string]: string } {
    return {
      componentType: 'componentType',
      props: 'props',
    };
  }

  static types(): { [key: string]: any } {
    return {
      componentType: 'string',
      props: FormCreateRequestFormComponentsChildrenChildrenProps,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponentsChildren extends $tea.Model {
  componentType?: string;
  props?: FormCreateRequestFormComponentsChildrenProps;
  children?: FormCreateRequestFormComponentsChildrenChildren[];
  static names(): { [key: string]: string } {
    return {
      componentType: 'componentType',
      props: 'props',
      children: 'children',
    };
  }

  static types(): { [key: string]: any } {
    return {
      componentType: 'string',
      props: FormCreateRequestFormComponentsChildrenProps,
      children: { 'type': 'array', 'itemType': FormCreateRequestFormComponentsChildrenChildren },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateRequestFormComponents extends $tea.Model {
  componentType?: string;
  props?: FormCreateRequestFormComponentsProps;
  children?: FormCreateRequestFormComponentsChildren[];
  static names(): { [key: string]: string } {
    return {
      componentType: 'componentType',
      props: 'props',
      children: 'children',
    };
  }

  static types(): { [key: string]: any } {
    return {
      componentType: 'string',
      props: FormCreateRequestFormComponentsProps,
      children: { 'type': 'array', 'itemType': FormCreateRequestFormComponentsChildren },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FormCreateResponseBodyResult extends $tea.Model {
  processCode?: string;
  static names(): { [key: string]: string } {
    return {
      processCode: 'processCode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      processCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartProcessInstanceRequestApprovers extends $tea.Model {
  actionType?: string;
  userIds?: string[];
  static names(): { [key: string]: string } {
    return {
      actionType: 'actionType',
      userIds: 'userIds',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actionType: 'string',
      userIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartProcessInstanceRequestTargetSelectActioners extends $tea.Model {
  actionerKey?: string;
  actionerUserIds?: string[];
  static names(): { [key: string]: string } {
    return {
      actionerKey: 'actionerKey',
      actionerUserIds: 'actionerUserIds',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actionerKey: 'string',
      actionerUserIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartProcessInstanceRequestFormComponentValuesDetailsDetails extends $tea.Model {
  id?: string;
  bizAlias?: string;
  name?: string;
  value?: string;
  extValue?: string;
  componentType?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      bizAlias: 'bizAlias',
      name: 'name',
      value: 'value',
      extValue: 'extValue',
      componentType: 'componentType',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      bizAlias: 'string',
      name: 'string',
      value: 'string',
      extValue: 'string',
      componentType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartProcessInstanceRequestFormComponentValuesDetails extends $tea.Model {
  id?: string;
  bizAlias?: string;
  name?: string;
  value?: string;
  extValue?: string;
  details?: StartProcessInstanceRequestFormComponentValuesDetailsDetails[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      bizAlias: 'bizAlias',
      name: 'name',
      value: 'value',
      extValue: 'extValue',
      details: 'details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      bizAlias: 'string',
      name: 'string',
      value: 'string',
      extValue: 'string',
      details: { 'type': 'array', 'itemType': StartProcessInstanceRequestFormComponentValuesDetailsDetails },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartProcessInstanceRequestFormComponentValues extends $tea.Model {
  id?: string;
  bizAlias?: string;
  name?: string;
  value?: string;
  extValue?: string;
  componentType?: string;
  details?: StartProcessInstanceRequestFormComponentValuesDetails[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      bizAlias: 'bizAlias',
      name: 'name',
      value: 'value',
      extValue: 'extValue',
      componentType: 'componentType',
      details: 'details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      bizAlias: 'string',
      name: 'string',
      value: 'string',
      extValue: 'string',
      componentType: 'string',
      details: { 'type': 'array', 'itemType': StartProcessInstanceRequestFormComponentValuesDetails },
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


  async queryFormInstance(request: QueryFormInstanceRequest): Promise<QueryFormInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new QueryFormInstanceHeaders({ });
    return await this.queryFormInstanceWithOptions(request, headers, runtime);
  }

  async queryFormInstanceWithOptions(request: QueryFormInstanceRequest, headers: QueryFormInstanceHeaders, runtime: $Util.RuntimeOptions): Promise<QueryFormInstanceResponse> {
    Util.validateModel(request);
    let query : {[key: string ]: any} = { };
    if (!Util.isUnset(request.formInstanceId)) {
      query["formInstanceId"] = request.formInstanceId;
    }

    if (!Util.isUnset(request.formCode)) {
      query["formCode"] = request.formCode;
    }

    if (!Util.isUnset(request.appUuid)) {
      query["appUuid"] = request.appUuid;
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
    return $tea.cast<QueryFormInstanceResponse>(await this.doROARequest("QueryFormInstance", "workflow_1.0", "HTTP", "GET", "AK", `/v1.0/workflow/forms/instances`, "json", req, runtime), new QueryFormInstanceResponse({}));
  }

  async processForecast(request: ProcessForecastRequest): Promise<ProcessForecastResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new ProcessForecastHeaders({ });
    return await this.processForecastWithOptions(request, headers, runtime);
  }

  async processForecastWithOptions(request: ProcessForecastRequest, headers: ProcessForecastHeaders, runtime: $Util.RuntimeOptions): Promise<ProcessForecastResponse> {
    Util.validateModel(request);
    let body : {[key: string ]: any} = { };
    if (!Util.isUnset(request.dingCorpId)) {
      body["dingCorpId"] = request.dingCorpId;
    }

    if (!Util.isUnset(request.dingOrgId)) {
      body["dingOrgId"] = request.dingOrgId;
    }

    if (!Util.isUnset(request.dingIsvOrgId)) {
      body["dingIsvOrgId"] = request.dingIsvOrgId;
    }

    if (!Util.isUnset(request.dingSuiteKey)) {
      body["dingSuiteKey"] = request.dingSuiteKey;
    }

    if (!Util.isUnset(request.dingTokenGrantType)) {
      body["dingTokenGrantType"] = request.dingTokenGrantType;
    }

    if (!Util.isUnset(request.requestId)) {
      body["RequestId"] = request.requestId;
    }

    if (!Util.isUnset(request.processCode)) {
      body["processCode"] = request.processCode;
    }

    if (!Util.isUnset(request.deptId)) {
      body["deptId"] = request.deptId;
    }

    if (!Util.isUnset(request.userId)) {
      body["userId"] = request.userId;
    }

    if (!Util.isUnset(request.formComponentValues)) {
      body["formComponentValues"] = request.formComponentValues;
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
    return $tea.cast<ProcessForecastResponse>(await this.doROARequest("ProcessForecast", "workflow_1.0", "HTTP", "POST", "AK", `/v1.0/workflow/processes/forecast`, "json", req, runtime), new ProcessForecastResponse({}));
  }

  async queryAllProcessInstances(request: QueryAllProcessInstancesRequest): Promise<QueryAllProcessInstancesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new QueryAllProcessInstancesHeaders({ });
    return await this.queryAllProcessInstancesWithOptions(request, headers, runtime);
  }

  async queryAllProcessInstancesWithOptions(request: QueryAllProcessInstancesRequest, headers: QueryAllProcessInstancesHeaders, runtime: $Util.RuntimeOptions): Promise<QueryAllProcessInstancesResponse> {
    Util.validateModel(request);
    let query : {[key: string ]: any} = { };
    if (!Util.isUnset(request.nextToken)) {
      query["nextToken"] = request.nextToken;
    }

    if (!Util.isUnset(request.maxResults)) {
      query["maxResults"] = request.maxResults;
    }

    if (!Util.isUnset(request.startTimeInMills)) {
      query["startTimeInMills"] = request.startTimeInMills;
    }

    if (!Util.isUnset(request.endTimeInMills)) {
      query["endTimeInMills"] = request.endTimeInMills;
    }

    if (!Util.isUnset(request.processCode)) {
      query["processCode"] = request.processCode;
    }

    if (!Util.isUnset(request.appUuid)) {
      query["appUuid"] = request.appUuid;
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
    return $tea.cast<QueryAllProcessInstancesResponse>(await this.doROARequest("QueryAllProcessInstances", "workflow_1.0", "HTTP", "GET", "AK", `/v1.0/workflow/processes/pages/instances`, "json", req, runtime), new QueryAllProcessInstancesResponse({}));
  }

  async queryAllFormInstances(request: QueryAllFormInstancesRequest): Promise<QueryAllFormInstancesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new QueryAllFormInstancesHeaders({ });
    return await this.queryAllFormInstancesWithOptions(request, headers, runtime);
  }

  async queryAllFormInstancesWithOptions(request: QueryAllFormInstancesRequest, headers: QueryAllFormInstancesHeaders, runtime: $Util.RuntimeOptions): Promise<QueryAllFormInstancesResponse> {
    Util.validateModel(request);
    let query : {[key: string ]: any} = { };
    if (!Util.isUnset(request.nextToken)) {
      query["nextToken"] = request.nextToken;
    }

    if (!Util.isUnset(request.maxResults)) {
      query["maxResults"] = request.maxResults;
    }

    if (!Util.isUnset(request.appUuid)) {
      query["appUuid"] = request.appUuid;
    }

    if (!Util.isUnset(request.formCode)) {
      query["formCode"] = request.formCode;
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
    return $tea.cast<QueryAllFormInstancesResponse>(await this.doROARequest("QueryAllFormInstances", "workflow_1.0", "HTTP", "GET", "AK", `/v1.0/workflow/forms/pages/instances`, "json", req, runtime), new QueryAllFormInstancesResponse({}));
  }

  async queryFormByBizType(request: QueryFormByBizTypeRequest): Promise<QueryFormByBizTypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new QueryFormByBizTypeHeaders({ });
    return await this.queryFormByBizTypeWithOptions(request, headers, runtime);
  }

  async queryFormByBizTypeWithOptions(request: QueryFormByBizTypeRequest, headers: QueryFormByBizTypeHeaders, runtime: $Util.RuntimeOptions): Promise<QueryFormByBizTypeResponse> {
    Util.validateModel(request);
    let body : {[key: string ]: any} = { };
    if (!Util.isUnset(request.appUuid)) {
      body["appUuid"] = request.appUuid;
    }

    if (!Util.isUnset(request.bizTypes)) {
      body["bizTypes"] = request.bizTypes;
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
    return $tea.cast<QueryFormByBizTypeResponse>(await this.doROARequest("QueryFormByBizType", "workflow_1.0", "HTTP", "POST", "AK", `/v1.0/workflow/forms/forminfos/query`, "json", req, runtime), new QueryFormByBizTypeResponse({}));
  }

  async formCreate(request: FormCreateRequest): Promise<FormCreateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new FormCreateHeaders({ });
    return await this.formCreateWithOptions(request, headers, runtime);
  }

  async formCreateWithOptions(request: FormCreateRequest, headers: FormCreateHeaders, runtime: $Util.RuntimeOptions): Promise<FormCreateResponse> {
    Util.validateModel(request);
    let body : {[key: string ]: any} = { };
    if (!Util.isUnset(request.dingCorpId)) {
      body["dingCorpId"] = request.dingCorpId;
    }

    if (!Util.isUnset(request.dingOrgId)) {
      body["dingOrgId"] = request.dingOrgId;
    }

    if (!Util.isUnset(request.dingIsvOrgId)) {
      body["dingIsvOrgId"] = request.dingIsvOrgId;
    }

    if (!Util.isUnset(request.dingSuiteKey)) {
      body["dingSuiteKey"] = request.dingSuiteKey;
    }

    if (!Util.isUnset(request.dingTokenGrantType)) {
      body["dingTokenGrantType"] = request.dingTokenGrantType;
    }

    if (!Util.isUnset(request.requestId)) {
      body["RequestId"] = request.requestId;
    }

    if (!Util.isUnset(request.processCode)) {
      body["processCode"] = request.processCode;
    }

    if (!Util.isUnset(request.name)) {
      body["name"] = request.name;
    }

    if (!Util.isUnset(request.description)) {
      body["description"] = request.description;
    }

    if (!Util.isUnset(request.formComponents)) {
      body["formComponents"] = request.formComponents;
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
    return $tea.cast<FormCreateResponse>(await this.doROARequest("FormCreate", "workflow_1.0", "HTTP", "POST", "AK", `/v1.0/workflow/forms`, "json", req, runtime), new FormCreateResponse({}));
  }

  async startProcessInstance(request: StartProcessInstanceRequest): Promise<StartProcessInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new StartProcessInstanceHeaders({ });
    return await this.startProcessInstanceWithOptions(request, headers, runtime);
  }

  async startProcessInstanceWithOptions(request: StartProcessInstanceRequest, headers: StartProcessInstanceHeaders, runtime: $Util.RuntimeOptions): Promise<StartProcessInstanceResponse> {
    Util.validateModel(request);
    let body : {[key: string ]: any} = { };
    if (!Util.isUnset(request.originatorUserId)) {
      body["originatorUserId"] = request.originatorUserId;
    }

    if (!Util.isUnset(request.processCode)) {
      body["processCode"] = request.processCode;
    }

    if (!Util.isUnset(request.deptId)) {
      body["deptId"] = request.deptId;
    }

    if (!Util.isUnset(request.microappAgentId)) {
      body["microappAgentId"] = request.microappAgentId;
    }

    if (!Util.isUnset(request.approvers)) {
      body["approvers"] = request.approvers;
    }

    if (!Util.isUnset(request.ccList)) {
      body["ccList"] = request.ccList;
    }

    if (!Util.isUnset(request.ccPosition)) {
      body["ccPosition"] = request.ccPosition;
    }

    if (!Util.isUnset(request.targetSelectActioners)) {
      body["targetSelectActioners"] = request.targetSelectActioners;
    }

    if (!Util.isUnset(request.formComponentValues)) {
      body["formComponentValues"] = request.formComponentValues;
    }

    if (!Util.isUnset(request.requestId)) {
      body["RequestId"] = request.requestId;
    }

    if (!Util.isUnset(request.dingCorpId)) {
      body["dingCorpId"] = request.dingCorpId;
    }

    if (!Util.isUnset(request.dingOrgId)) {
      body["dingOrgId"] = request.dingOrgId;
    }

    if (!Util.isUnset(request.dingIsvOrgId)) {
      body["dingIsvOrgId"] = request.dingIsvOrgId;
    }

    if (!Util.isUnset(request.dingSuiteKey)) {
      body["dingSuiteKey"] = request.dingSuiteKey;
    }

    if (!Util.isUnset(request.dingTokenGrantType)) {
      body["dingTokenGrantType"] = request.dingTokenGrantType;
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
    return $tea.cast<StartProcessInstanceResponse>(await this.doROARequest("StartProcessInstance", "workflow_1.0", "HTTP", "POST", "AK", `/v1.0/workflow/processInstances`, "json", req, runtime), new StartProcessInstanceResponse({}));
  }

}
