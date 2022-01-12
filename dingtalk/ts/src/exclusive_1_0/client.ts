// This file is auto-generated, don't edit it
/**
 *
 */
import Util, * as $Util from '@alicloud/tea-util';
import OpenApi, * as $OpenApi from '@alicloud/openapi-client';
import OpenApiUtil from '@alicloud/openapi-util';
import * as $tea from '@alicloud/tea-typescript';

export class CreateTrustedDeviceHeaders extends $tea.Model {
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

export class CreateTrustedDeviceRequest extends $tea.Model {
  macAddress?: string;
  platform?: string;
  status?: number;
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      macAddress: 'macAddress',
      platform: 'platform',
      status: 'status',
      userId: 'userId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      macAddress: 'string',
      platform: 'string',
      status: 'number',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTrustedDeviceResponseBody extends $tea.Model {
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTrustedDeviceResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: CreateTrustedDeviceResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: CreateTrustedDeviceResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteCommentHeaders extends $tea.Model {
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

export class DeleteCommentResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: boolean;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetActiveUserSummaryHeaders extends $tea.Model {
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

export class GetActiveUserSummaryResponseBody extends $tea.Model {
  actUsrCnt1m?: string;
  static names(): { [key: string]: string } {
    return {
      actUsrCnt1m: 'actUsrCnt1m',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actUsrCnt1m: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetActiveUserSummaryResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: GetActiveUserSummaryResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: GetActiveUserSummaryResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAllLabelableDeptsHeaders extends $tea.Model {
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

export class GetAllLabelableDeptsResponseBody extends $tea.Model {
  data?: GetAllLabelableDeptsResponseBodyData[];
  static names(): { [key: string]: string } {
    return {
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: { 'type': 'array', 'itemType': GetAllLabelableDeptsResponseBodyData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAllLabelableDeptsResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: GetAllLabelableDeptsResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: GetAllLabelableDeptsResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCalenderSummaryHeaders extends $tea.Model {
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

export class GetCalenderSummaryResponseBody extends $tea.Model {
  calendarCreateUserCnt?: string;
  static names(): { [key: string]: string } {
    return {
      calendarCreateUserCnt: 'calendarCreateUserCnt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      calendarCreateUserCnt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCalenderSummaryResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: GetCalenderSummaryResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: GetCalenderSummaryResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCommentListHeaders extends $tea.Model {
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

export class GetCommentListRequest extends $tea.Model {
  pageNumber?: number;
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      pageNumber: 'pageNumber',
      pageSize: 'pageSize',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageNumber: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCommentListResponseBody extends $tea.Model {
  data?: GetCommentListResponseBodyData[];
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      data: 'data',
      totalCount: 'totalCount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: { 'type': 'array', 'itemType': GetCommentListResponseBodyData },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCommentListResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: GetCommentListResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: GetCommentListResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetConferenceDetailHeaders extends $tea.Model {
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

export class GetConferenceDetailResponseBody extends $tea.Model {
  attendeeNum?: number;
  attendeePercentage?: string;
  callerId?: string;
  callerName?: string;
  confStartTime?: number;
  conferenceId?: string;
  duration?: number;
  memberList?: GetConferenceDetailResponseBodyMemberList[];
  title?: string;
  totalNum?: number;
  static names(): { [key: string]: string } {
    return {
      attendeeNum: 'attendeeNum',
      attendeePercentage: 'attendeePercentage',
      callerId: 'callerId',
      callerName: 'callerName',
      confStartTime: 'confStartTime',
      conferenceId: 'conferenceId',
      duration: 'duration',
      memberList: 'memberList',
      title: 'title',
      totalNum: 'totalNum',
    };
  }

  static types(): { [key: string]: any } {
    return {
      attendeeNum: 'number',
      attendeePercentage: 'string',
      callerId: 'string',
      callerName: 'string',
      confStartTime: 'number',
      conferenceId: 'string',
      duration: 'number',
      memberList: { 'type': 'array', 'itemType': GetConferenceDetailResponseBodyMemberList },
      title: 'string',
      totalNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetConferenceDetailResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: GetConferenceDetailResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: GetConferenceDetailResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDingReportDeptSummaryHeaders extends $tea.Model {
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

export class GetDingReportDeptSummaryRequest extends $tea.Model {
  maxResults?: number;
  nextToken?: number;
  static names(): { [key: string]: string } {
    return {
      maxResults: 'maxResults',
      nextToken: 'nextToken',
    };
  }

  static types(): { [key: string]: any } {
    return {
      maxResults: 'number',
      nextToken: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDingReportDeptSummaryResponseBody extends $tea.Model {
  data?: GetDingReportDeptSummaryResponseBodyData[];
  hasMore?: boolean;
  nextToken?: number;
  static names(): { [key: string]: string } {
    return {
      data: 'data',
      hasMore: 'hasMore',
      nextToken: 'nextToken',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: { 'type': 'array', 'itemType': GetDingReportDeptSummaryResponseBodyData },
      hasMore: 'boolean',
      nextToken: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDingReportDeptSummaryResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: GetDingReportDeptSummaryResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: GetDingReportDeptSummaryResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDocCreatedDeptSummaryHeaders extends $tea.Model {
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

export class GetDocCreatedDeptSummaryRequest extends $tea.Model {
  maxResults?: number;
  nextToken?: number;
  static names(): { [key: string]: string } {
    return {
      maxResults: 'maxResults',
      nextToken: 'nextToken',
    };
  }

  static types(): { [key: string]: any } {
    return {
      maxResults: 'number',
      nextToken: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDocCreatedDeptSummaryResponseBody extends $tea.Model {
  data?: GetDocCreatedDeptSummaryResponseBodyData[];
  hasMore?: boolean;
  nextToken?: number;
  static names(): { [key: string]: string } {
    return {
      data: 'data',
      hasMore: 'hasMore',
      nextToken: 'nextToken',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: { 'type': 'array', 'itemType': GetDocCreatedDeptSummaryResponseBodyData },
      hasMore: 'boolean',
      nextToken: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDocCreatedDeptSummaryResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: GetDocCreatedDeptSummaryResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: GetDocCreatedDeptSummaryResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDocCreatedSummaryHeaders extends $tea.Model {
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

export class GetDocCreatedSummaryResponseBody extends $tea.Model {
  docCreatedCnt?: string;
  static names(): { [key: string]: string } {
    return {
      docCreatedCnt: 'docCreatedCnt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      docCreatedCnt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDocCreatedSummaryResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: GetDocCreatedSummaryResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: GetDocCreatedSummaryResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGeneralFormCreatedDeptSummaryHeaders extends $tea.Model {
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

export class GetGeneralFormCreatedDeptSummaryRequest extends $tea.Model {
  maxResults?: number;
  nextToken?: number;
  static names(): { [key: string]: string } {
    return {
      maxResults: 'maxResults',
      nextToken: 'nextToken',
    };
  }

  static types(): { [key: string]: any } {
    return {
      maxResults: 'number',
      nextToken: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGeneralFormCreatedDeptSummaryResponseBody extends $tea.Model {
  data?: GetGeneralFormCreatedDeptSummaryResponseBodyData[];
  hasMore?: boolean;
  nextToken?: number;
  static names(): { [key: string]: string } {
    return {
      data: 'data',
      hasMore: 'hasMore',
      nextToken: 'nextToken',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: { 'type': 'array', 'itemType': GetGeneralFormCreatedDeptSummaryResponseBodyData },
      hasMore: 'boolean',
      nextToken: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGeneralFormCreatedDeptSummaryResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: GetGeneralFormCreatedDeptSummaryResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: GetGeneralFormCreatedDeptSummaryResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGeneralFormCreatedSummaryHeaders extends $tea.Model {
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

export class GetGeneralFormCreatedSummaryResponseBody extends $tea.Model {
  generalFormCreatedCnt?: string;
  static names(): { [key: string]: string } {
    return {
      generalFormCreatedCnt: 'generalFormCreatedCnt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      generalFormCreatedCnt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGeneralFormCreatedSummaryResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: GetGeneralFormCreatedSummaryResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: GetGeneralFormCreatedSummaryResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGroupActiveInfoHeaders extends $tea.Model {
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

export class GetGroupActiveInfoRequest extends $tea.Model {
  dingGroupId?: string;
  pageNumber?: number;
  pageSize?: number;
  statDate?: string;
  static names(): { [key: string]: string } {
    return {
      dingGroupId: 'dingGroupId',
      pageNumber: 'pageNumber',
      pageSize: 'pageSize',
      statDate: 'statDate',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dingGroupId: 'string',
      pageNumber: 'number',
      pageSize: 'number',
      statDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGroupActiveInfoResponseBody extends $tea.Model {
  data?: GetGroupActiveInfoResponseBodyData[];
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      data: 'data',
      totalCount: 'totalCount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: { 'type': 'array', 'itemType': GetGroupActiveInfoResponseBodyData },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGroupActiveInfoResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: GetGroupActiveInfoResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: GetGroupActiveInfoResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInActiveUserListHeaders extends $tea.Model {
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

export class GetInActiveUserListRequest extends $tea.Model {
  deptIds?: string[];
  pageNumber?: number;
  pageSize?: number;
  statDate?: string;
  static names(): { [key: string]: string } {
    return {
      deptIds: 'deptIds',
      pageNumber: 'pageNumber',
      pageSize: 'pageSize',
      statDate: 'statDate',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deptIds: { 'type': 'array', 'itemType': 'string' },
      pageNumber: 'number',
      pageSize: 'number',
      statDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInActiveUserListResponseBody extends $tea.Model {
  dataList?: { [key: string]: any }[];
  metaList?: GetInActiveUserListResponseBodyMetaList[];
  static names(): { [key: string]: string } {
    return {
      dataList: 'dataList',
      metaList: 'metaList',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dataList: { 'type': 'array', 'itemType': { 'type': 'map', 'keyType': 'string', 'valueType': 'any' } },
      metaList: { 'type': 'array', 'itemType': GetInActiveUserListResponseBodyMetaList },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInActiveUserListResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: GetInActiveUserListResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: GetInActiveUserListResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetOaOperatorLogListHeaders extends $tea.Model {
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

export class GetOaOperatorLogListRequest extends $tea.Model {
  categoryList?: string[];
  endTime?: number;
  opUserId?: string;
  pageNumber?: number;
  pageSize?: number;
  startTime?: number;
  static names(): { [key: string]: string } {
    return {
      categoryList: 'categoryList',
      endTime: 'endTime',
      opUserId: 'opUserId',
      pageNumber: 'pageNumber',
      pageSize: 'pageSize',
      startTime: 'startTime',
    };
  }

  static types(): { [key: string]: any } {
    return {
      categoryList: { 'type': 'array', 'itemType': 'string' },
      endTime: 'number',
      opUserId: 'string',
      pageNumber: 'number',
      pageSize: 'number',
      startTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetOaOperatorLogListResponseBody extends $tea.Model {
  data?: GetOaOperatorLogListResponseBodyData[];
  itemCount?: number;
  static names(): { [key: string]: string } {
    return {
      data: 'data',
      itemCount: 'itemCount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: { 'type': 'array', 'itemType': GetOaOperatorLogListResponseBodyData },
      itemCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetOaOperatorLogListResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: GetOaOperatorLogListResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: GetOaOperatorLogListResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPartnerTypeByParentIdHeaders extends $tea.Model {
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

export class GetPartnerTypeByParentIdResponseBody extends $tea.Model {
  data?: GetPartnerTypeByParentIdResponseBodyData[];
  static names(): { [key: string]: string } {
    return {
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: { 'type': 'array', 'itemType': GetPartnerTypeByParentIdResponseBodyData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPartnerTypeByParentIdResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: GetPartnerTypeByParentIdResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: GetPartnerTypeByParentIdResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPublisherSummaryHeaders extends $tea.Model {
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

export class GetPublisherSummaryRequest extends $tea.Model {
  maxResults?: number;
  nextToken?: number;
  static names(): { [key: string]: string } {
    return {
      maxResults: 'maxResults',
      nextToken: 'nextToken',
    };
  }

  static types(): { [key: string]: any } {
    return {
      maxResults: 'number',
      nextToken: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPublisherSummaryResponseBody extends $tea.Model {
  data?: GetPublisherSummaryResponseBodyData[];
  hasMore?: boolean;
  nextToken?: number;
  publisherArticleCntStd?: string;
  publisherArticlePvCntStd?: string;
  publisherArticlePvTop5?: GetPublisherSummaryResponseBodyPublisherArticlePvTop5[];
  publisherCntStd?: string;
  static names(): { [key: string]: string } {
    return {
      data: 'data',
      hasMore: 'hasMore',
      nextToken: 'nextToken',
      publisherArticleCntStd: 'publisherArticleCntStd',
      publisherArticlePvCntStd: 'publisherArticlePvCntStd',
      publisherArticlePvTop5: 'publisherArticlePvTop5',
      publisherCntStd: 'publisherCntStd',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: { 'type': 'array', 'itemType': GetPublisherSummaryResponseBodyData },
      hasMore: 'boolean',
      nextToken: 'number',
      publisherArticleCntStd: 'string',
      publisherArticlePvCntStd: 'string',
      publisherArticlePvTop5: { 'type': 'array', 'itemType': GetPublisherSummaryResponseBodyPublisherArticlePvTop5 },
      publisherCntStd: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPublisherSummaryResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: GetPublisherSummaryResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: GetPublisherSummaryResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTrustDeviceListHeaders extends $tea.Model {
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

export class GetTrustDeviceListRequest extends $tea.Model {
  userIds?: string[];
  static names(): { [key: string]: string } {
    return {
      userIds: 'userIds',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTrustDeviceListResponseBody extends $tea.Model {
  data?: GetTrustDeviceListResponseBodyData[];
  static names(): { [key: string]: string } {
    return {
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: { 'type': 'array', 'itemType': GetTrustDeviceListResponseBodyData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTrustDeviceListResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: GetTrustDeviceListResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: GetTrustDeviceListResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUserAppVersionSummaryHeaders extends $tea.Model {
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

export class GetUserAppVersionSummaryRequest extends $tea.Model {
  maxResults?: number;
  nextToken?: number;
  static names(): { [key: string]: string } {
    return {
      maxResults: 'maxResults',
      nextToken: 'nextToken',
    };
  }

  static types(): { [key: string]: any } {
    return {
      maxResults: 'number',
      nextToken: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUserAppVersionSummaryResponseBody extends $tea.Model {
  data?: GetUserAppVersionSummaryResponseBodyData[];
  hasMore?: boolean;
  nextToken?: number;
  static names(): { [key: string]: string } {
    return {
      data: 'data',
      hasMore: 'hasMore',
      nextToken: 'nextToken',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: { 'type': 'array', 'itemType': GetUserAppVersionSummaryResponseBodyData },
      hasMore: 'boolean',
      nextToken: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUserAppVersionSummaryResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: GetUserAppVersionSummaryResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: GetUserAppVersionSummaryResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListMiniAppAvailableVersionHeaders extends $tea.Model {
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

export class ListMiniAppAvailableVersionRequest extends $tea.Model {
  miniAppId?: string;
  pageNumber?: number;
  pageSize?: number;
  versionTypeSet?: number[];
  static names(): { [key: string]: string } {
    return {
      miniAppId: 'miniAppId',
      pageNumber: 'pageNumber',
      pageSize: 'pageSize',
      versionTypeSet: 'versionTypeSet',
    };
  }

  static types(): { [key: string]: any } {
    return {
      miniAppId: 'string',
      pageNumber: 'number',
      pageSize: 'number',
      versionTypeSet: { 'type': 'array', 'itemType': 'number' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListMiniAppAvailableVersionResponseBody extends $tea.Model {
  list?: ListMiniAppAvailableVersionResponseBodyList[];
  static names(): { [key: string]: string } {
    return {
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': ListMiniAppAvailableVersionResponseBodyList },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListMiniAppAvailableVersionResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: ListMiniAppAvailableVersionResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: ListMiniAppAvailableVersionResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListMiniAppHistoryVersionHeaders extends $tea.Model {
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

export class ListMiniAppHistoryVersionRequest extends $tea.Model {
  miniAppId?: string;
  pageNumber?: number;
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      miniAppId: 'miniAppId',
      pageNumber: 'pageNumber',
      pageSize: 'pageSize',
    };
  }

  static types(): { [key: string]: any } {
    return {
      miniAppId: 'string',
      pageNumber: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListMiniAppHistoryVersionResponseBody extends $tea.Model {
  list?: ListMiniAppHistoryVersionResponseBodyList[];
  static names(): { [key: string]: string } {
    return {
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': ListMiniAppHistoryVersionResponseBodyList },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListMiniAppHistoryVersionResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: ListMiniAppHistoryVersionResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: ListMiniAppHistoryVersionResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishFileChangeNoticeHeaders extends $tea.Model {
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

export class PublishFileChangeNoticeRequest extends $tea.Model {
  fileId?: string;
  operateType?: string;
  operatorUnionId?: string;
  spaceId?: string;
  static names(): { [key: string]: string } {
    return {
      fileId: 'fileId',
      operateType: 'operateType',
      operatorUnionId: 'operatorUnionId',
      spaceId: 'spaceId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileId: 'string',
      operateType: 'string',
      operatorUnionId: 'string',
      spaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishFileChangeNoticeResponse extends $tea.Model {
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

export class RollbackMiniAppVersionHeaders extends $tea.Model {
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

export class RollbackMiniAppVersionRequest extends $tea.Model {
  miniAppId?: string;
  rollbackVersion?: string;
  targetVersion?: string;
  static names(): { [key: string]: string } {
    return {
      miniAppId: 'miniAppId',
      rollbackVersion: 'rollbackVersion',
      targetVersion: 'targetVersion',
    };
  }

  static types(): { [key: string]: any } {
    return {
      miniAppId: 'string',
      rollbackVersion: 'string',
      targetVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RollbackMiniAppVersionResponseBody extends $tea.Model {
  cause?: string;
  code?: number;
  static names(): { [key: string]: string } {
    return {
      cause: 'cause',
      code: 'code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cause: 'string',
      code: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RollbackMiniAppVersionResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: RollbackMiniAppVersionResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: RollbackMiniAppVersionResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SearchOrgInnerGroupInfoHeaders extends $tea.Model {
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

export class SearchOrgInnerGroupInfoRequest extends $tea.Model {
  createTimeEnd?: number;
  createTimeStart?: number;
  groupMembersCountEnd?: number;
  groupMembersCountStart?: number;
  groupName?: string;
  groupOwner?: string;
  lastActiveTimeEnd?: number;
  lastActiveTimeStart?: number;
  operatorUserId?: string;
  pageSize?: number;
  pageStart?: number;
  syncToDingpan?: number;
  uuid?: string;
  static names(): { [key: string]: string } {
    return {
      createTimeEnd: 'createTimeEnd',
      createTimeStart: 'createTimeStart',
      groupMembersCountEnd: 'groupMembersCountEnd',
      groupMembersCountStart: 'groupMembersCountStart',
      groupName: 'groupName',
      groupOwner: 'groupOwner',
      lastActiveTimeEnd: 'lastActiveTimeEnd',
      lastActiveTimeStart: 'lastActiveTimeStart',
      operatorUserId: 'operatorUserId',
      pageSize: 'pageSize',
      pageStart: 'pageStart',
      syncToDingpan: 'syncToDingpan',
      uuid: 'uuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      createTimeEnd: 'number',
      createTimeStart: 'number',
      groupMembersCountEnd: 'number',
      groupMembersCountStart: 'number',
      groupName: 'string',
      groupOwner: 'string',
      lastActiveTimeEnd: 'number',
      lastActiveTimeStart: 'number',
      operatorUserId: 'string',
      pageSize: 'number',
      pageStart: 'number',
      syncToDingpan: 'number',
      uuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SearchOrgInnerGroupInfoResponseBody extends $tea.Model {
  itemCount?: number;
  items?: SearchOrgInnerGroupInfoResponseBodyItems[];
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      itemCount: 'itemCount',
      items: 'items',
      totalCount: 'totalCount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      itemCount: 'number',
      items: { 'type': 'array', 'itemType': SearchOrgInnerGroupInfoResponseBodyItems },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SearchOrgInnerGroupInfoResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: SearchOrgInnerGroupInfoResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: SearchOrgInnerGroupInfoResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendAppDingHeaders extends $tea.Model {
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

export class SendAppDingRequest extends $tea.Model {
  content?: string;
  userids?: string[];
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      userids: 'userids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: 'string',
      userids: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendAppDingResponse extends $tea.Model {
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

export class SendInvitationHeaders extends $tea.Model {
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

export class SendInvitationRequest extends $tea.Model {
  deptId?: string;
  orgAlias?: string;
  partnerLabelId?: number;
  partnerNum?: string;
  phone?: string;
  static names(): { [key: string]: string } {
    return {
      deptId: 'deptId',
      orgAlias: 'orgAlias',
      partnerLabelId: 'partnerLabelId',
      partnerNum: 'partnerNum',
      phone: 'phone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deptId: 'string',
      orgAlias: 'string',
      partnerLabelId: 'number',
      partnerNum: 'string',
      phone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendInvitationResponse extends $tea.Model {
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

export class SetDeptPartnerTypeAndNumHeaders extends $tea.Model {
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

export class SetDeptPartnerTypeAndNumRequest extends $tea.Model {
  deptId?: string;
  labelIds?: string[];
  partnerNum?: string;
  static names(): { [key: string]: string } {
    return {
      deptId: 'deptId',
      labelIds: 'labelIds',
      partnerNum: 'partnerNum',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deptId: 'string',
      labelIds: { 'type': 'array', 'itemType': 'string' },
      partnerNum: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetDeptPartnerTypeAndNumResponse extends $tea.Model {
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

export class UpdateMiniAppVersionStatusHeaders extends $tea.Model {
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

export class UpdateMiniAppVersionStatusRequest extends $tea.Model {
  miniAppId?: string;
  version?: string;
  versionType?: number;
  static names(): { [key: string]: string } {
    return {
      miniAppId: 'miniAppId',
      version: 'version',
      versionType: 'versionType',
    };
  }

  static types(): { [key: string]: any } {
    return {
      miniAppId: 'string',
      version: 'string',
      versionType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMiniAppVersionStatusResponseBody extends $tea.Model {
  cause?: string;
  code?: string;
  static names(): { [key: string]: string } {
    return {
      cause: 'cause',
      code: 'code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cause: 'string',
      code: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMiniAppVersionStatusResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: UpdateMiniAppVersionStatusResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: UpdateMiniAppVersionStatusResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdatePartnerVisibilityHeaders extends $tea.Model {
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

export class UpdatePartnerVisibilityRequest extends $tea.Model {
  deptIds?: number[];
  labelId?: number;
  userIds?: string[];
  static names(): { [key: string]: string } {
    return {
      deptIds: 'deptIds',
      labelId: 'labelId',
      userIds: 'userIds',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deptIds: { 'type': 'array', 'itemType': 'number' },
      labelId: 'number',
      userIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdatePartnerVisibilityResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: boolean;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateRoleVisibilityHeaders extends $tea.Model {
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

export class UpdateRoleVisibilityRequest extends $tea.Model {
  deptIds?: number[];
  labelId?: number;
  userIds?: string[];
  static names(): { [key: string]: string } {
    return {
      deptIds: 'deptIds',
      labelId: 'labelId',
      userIds: 'userIds',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deptIds: { 'type': 'array', 'itemType': 'number' },
      labelId: 'number',
      userIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateRoleVisibilityResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: boolean;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAllLabelableDeptsResponseBodyDataPartnerLabelVOLevel1 extends $tea.Model {
  labelId?: number;
  labelName?: string;
  levelNum?: number;
  static names(): { [key: string]: string } {
    return {
      labelId: 'labelId',
      labelName: 'labelName',
      levelNum: 'levelNum',
    };
  }

  static types(): { [key: string]: any } {
    return {
      labelId: 'number',
      labelName: 'string',
      levelNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAllLabelableDeptsResponseBodyDataPartnerLabelVOLevel2 extends $tea.Model {
  labelId?: number;
  labelName?: string;
  levelNum?: number;
  static names(): { [key: string]: string } {
    return {
      labelId: 'labelId',
      labelName: 'labelName',
      levelNum: 'levelNum',
    };
  }

  static types(): { [key: string]: any } {
    return {
      labelId: 'number',
      labelName: 'string',
      levelNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAllLabelableDeptsResponseBodyDataPartnerLabelVOLevel3 extends $tea.Model {
  labelId?: number;
  labelName?: string;
  levelNum?: number;
  static names(): { [key: string]: string } {
    return {
      labelId: 'labelId',
      labelName: 'labelName',
      levelNum: 'levelNum',
    };
  }

  static types(): { [key: string]: any } {
    return {
      labelId: 'number',
      labelName: 'string',
      levelNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAllLabelableDeptsResponseBodyDataPartnerLabelVOLevel4 extends $tea.Model {
  labelId?: number;
  labelName?: string;
  levelNum?: number;
  static names(): { [key: string]: string } {
    return {
      labelId: 'labelId',
      labelName: 'labelName',
      levelNum: 'levelNum',
    };
  }

  static types(): { [key: string]: any } {
    return {
      labelId: 'number',
      labelName: 'string',
      levelNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAllLabelableDeptsResponseBodyDataPartnerLabelVOLevel5 extends $tea.Model {
  labelId?: number;
  labelName?: string;
  levelNum?: number;
  static names(): { [key: string]: string } {
    return {
      labelId: 'labelId',
      labelName: 'labelName',
      levelNum: 'levelNum',
    };
  }

  static types(): { [key: string]: any } {
    return {
      labelId: 'number',
      labelName: 'string',
      levelNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAllLabelableDeptsResponseBodyData extends $tea.Model {
  deptId?: string;
  deptName?: string;
  memberCount?: number;
  partnerLabelVOLevel1?: GetAllLabelableDeptsResponseBodyDataPartnerLabelVOLevel1;
  partnerLabelVOLevel2?: GetAllLabelableDeptsResponseBodyDataPartnerLabelVOLevel2;
  partnerLabelVOLevel3?: GetAllLabelableDeptsResponseBodyDataPartnerLabelVOLevel3;
  partnerLabelVOLevel4?: GetAllLabelableDeptsResponseBodyDataPartnerLabelVOLevel4;
  partnerLabelVOLevel5?: GetAllLabelableDeptsResponseBodyDataPartnerLabelVOLevel5;
  partnerNum?: string;
  superDeptId?: string;
  static names(): { [key: string]: string } {
    return {
      deptId: 'deptId',
      deptName: 'deptName',
      memberCount: 'memberCount',
      partnerLabelVOLevel1: 'partnerLabelVOLevel1',
      partnerLabelVOLevel2: 'partnerLabelVOLevel2',
      partnerLabelVOLevel3: 'partnerLabelVOLevel3',
      partnerLabelVOLevel4: 'partnerLabelVOLevel4',
      partnerLabelVOLevel5: 'partnerLabelVOLevel5',
      partnerNum: 'partnerNum',
      superDeptId: 'superDeptId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deptId: 'string',
      deptName: 'string',
      memberCount: 'number',
      partnerLabelVOLevel1: GetAllLabelableDeptsResponseBodyDataPartnerLabelVOLevel1,
      partnerLabelVOLevel2: GetAllLabelableDeptsResponseBodyDataPartnerLabelVOLevel2,
      partnerLabelVOLevel3: GetAllLabelableDeptsResponseBodyDataPartnerLabelVOLevel3,
      partnerLabelVOLevel4: GetAllLabelableDeptsResponseBodyDataPartnerLabelVOLevel4,
      partnerLabelVOLevel5: GetAllLabelableDeptsResponseBodyDataPartnerLabelVOLevel5,
      partnerNum: 'string',
      superDeptId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCommentListResponseBodyData extends $tea.Model {
  commentId?: string;
  commentTime?: number;
  commentUserName?: string;
  content?: string;
  static names(): { [key: string]: string } {
    return {
      commentId: 'commentId',
      commentTime: 'commentTime',
      commentUserName: 'commentUserName',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      commentId: 'string',
      commentTime: 'number',
      commentUserName: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetConferenceDetailResponseBodyMemberList extends $tea.Model {
  attendDuration?: number;
  name?: string;
  staffId?: string;
  unionId?: string;
  static names(): { [key: string]: string } {
    return {
      attendDuration: 'attendDuration',
      name: 'name',
      staffId: 'staffId',
      unionId: 'unionId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      attendDuration: 'number',
      name: 'string',
      staffId: 'string',
      unionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDingReportDeptSummaryResponseBodyData extends $tea.Model {
  deptId?: string;
  deptName?: string;
  dingReportSendCnt?: string;
  dingReportSendUsrCnt?: string;
  static names(): { [key: string]: string } {
    return {
      deptId: 'deptId',
      deptName: 'deptName',
      dingReportSendCnt: 'dingReportSendCnt',
      dingReportSendUsrCnt: 'dingReportSendUsrCnt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deptId: 'string',
      deptName: 'string',
      dingReportSendCnt: 'string',
      dingReportSendUsrCnt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDocCreatedDeptSummaryResponseBodyData extends $tea.Model {
  deptId?: string;
  deptName?: string;
  docCreatedCnt?: string;
  static names(): { [key: string]: string } {
    return {
      deptId: 'deptId',
      deptName: 'deptName',
      docCreatedCnt: 'docCreatedCnt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deptId: 'string',
      deptName: 'string',
      docCreatedCnt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGeneralFormCreatedDeptSummaryResponseBodyData extends $tea.Model {
  deptId?: string;
  deptName?: string;
  generalFormCreateCnt1d?: string;
  static names(): { [key: string]: string } {
    return {
      deptId: 'deptId',
      deptName: 'deptName',
      generalFormCreateCnt1d: 'generalFormCreateCnt1d',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deptId: 'string',
      deptName: 'string',
      generalFormCreateCnt1d: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGroupActiveInfoResponseBodyData extends $tea.Model {
  dingGroupId?: string;
  groupCreateTime?: string;
  groupCreateUserId?: string;
  groupCreateUserName?: string;
  groupName?: string;
  groupType?: number;
  groupUserCnt1d?: number;
  openConvUv1d?: number;
  sendMessageCnt1d?: number;
  sendMessageUserCnt1d?: number;
  statDate?: string;
  static names(): { [key: string]: string } {
    return {
      dingGroupId: 'dingGroupId',
      groupCreateTime: 'groupCreateTime',
      groupCreateUserId: 'groupCreateUserId',
      groupCreateUserName: 'groupCreateUserName',
      groupName: 'groupName',
      groupType: 'groupType',
      groupUserCnt1d: 'groupUserCnt1d',
      openConvUv1d: 'openConvUv1d',
      sendMessageCnt1d: 'sendMessageCnt1d',
      sendMessageUserCnt1d: 'sendMessageUserCnt1d',
      statDate: 'statDate',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dingGroupId: 'string',
      groupCreateTime: 'string',
      groupCreateUserId: 'string',
      groupCreateUserName: 'string',
      groupName: 'string',
      groupType: 'number',
      groupUserCnt1d: 'number',
      openConvUv1d: 'number',
      sendMessageCnt1d: 'number',
      sendMessageUserCnt1d: 'number',
      statDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInActiveUserListResponseBodyMetaList extends $tea.Model {
  kpiCaliber?: string;
  kpiId?: string;
  kpiName?: string;
  period?: string;
  unit?: string;
  static names(): { [key: string]: string } {
    return {
      kpiCaliber: 'kpiCaliber',
      kpiId: 'kpiId',
      kpiName: 'kpiName',
      period: 'period',
      unit: 'unit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      kpiCaliber: 'string',
      kpiId: 'string',
      kpiName: 'string',
      period: 'string',
      unit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetOaOperatorLogListResponseBodyData extends $tea.Model {
  category1Name?: string;
  category2Name?: string;
  content?: string;
  opName?: string;
  opTime?: number;
  opUserId?: string;
  static names(): { [key: string]: string } {
    return {
      category1Name: 'category1Name',
      category2Name: 'category2Name',
      content: 'content',
      opName: 'opName',
      opTime: 'opTime',
      opUserId: 'opUserId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      category1Name: 'string',
      category2Name: 'string',
      content: 'string',
      opName: 'string',
      opTime: 'number',
      opUserId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPartnerTypeByParentIdResponseBodyData extends $tea.Model {
  typeId?: number;
  typeName?: string;
  static names(): { [key: string]: string } {
    return {
      typeId: 'typeId',
      typeName: 'typeName',
    };
  }

  static types(): { [key: string]: any } {
    return {
      typeId: 'number',
      typeName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPublisherSummaryResponseBodyData extends $tea.Model {
  publisherArticleCntStd?: string;
  publisherArticlePvCntStd?: string;
  publisherName?: string;
  unionId?: string;
  static names(): { [key: string]: string } {
    return {
      publisherArticleCntStd: 'publisherArticleCntStd',
      publisherArticlePvCntStd: 'publisherArticlePvCntStd',
      publisherName: 'publisherName',
      unionId: 'unionId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      publisherArticleCntStd: 'string',
      publisherArticlePvCntStd: 'string',
      publisherName: 'string',
      unionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPublisherSummaryResponseBodyPublisherArticlePvTop5 extends $tea.Model {
  name?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTrustDeviceListResponseBodyData extends $tea.Model {
  createTime?: number;
  macAddress?: string;
  platform?: string;
  status?: number;
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      createTime: 'createTime',
      macAddress: 'macAddress',
      platform: 'platform',
      status: 'status',
      userId: 'userId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      createTime: 'number',
      macAddress: 'string',
      platform: 'string',
      status: 'number',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUserAppVersionSummaryResponseBodyData extends $tea.Model {
  appVersion?: string;
  client?: string;
  orgName?: string;
  statDate?: string;
  userCnt?: number;
  static names(): { [key: string]: string } {
    return {
      appVersion: 'appVersion',
      client: 'client',
      orgName: 'orgName',
      statDate: 'statDate',
      userCnt: 'userCnt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appVersion: 'string',
      client: 'string',
      orgName: 'string',
      statDate: 'string',
      userCnt: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListMiniAppAvailableVersionResponseBodyList extends $tea.Model {
  buildStatus?: number;
  version?: string;
  static names(): { [key: string]: string } {
    return {
      buildStatus: 'buildStatus',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      buildStatus: 'number',
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListMiniAppHistoryVersionResponseBodyList extends $tea.Model {
  buildStatus?: number;
  h5Bundle?: string;
  packageSize?: string;
  packageUrl?: string;
  version?: string;
  static names(): { [key: string]: string } {
    return {
      buildStatus: 'buildStatus',
      h5Bundle: 'h5Bundle',
      packageSize: 'packageSize',
      packageUrl: 'packageUrl',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      buildStatus: 'number',
      h5Bundle: 'string',
      packageSize: 'string',
      packageUrl: 'string',
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SearchOrgInnerGroupInfoResponseBodyItems extends $tea.Model {
  groupAdminsCount?: number;
  groupCreateTime?: number;
  groupLastActiveTime?: number;
  groupLastActiveTimeShow?: string;
  groupMembersCount?: number;
  groupName?: string;
  groupOwner?: string;
  groupOwnerUserId?: string;
  openConversationId?: string;
  status?: number;
  syncToDingpan?: number;
  templateId?: string;
  templateName?: string;
  usedQuota?: number;
  static names(): { [key: string]: string } {
    return {
      groupAdminsCount: 'groupAdminsCount',
      groupCreateTime: 'groupCreateTime',
      groupLastActiveTime: 'groupLastActiveTime',
      groupLastActiveTimeShow: 'groupLastActiveTimeShow',
      groupMembersCount: 'groupMembersCount',
      groupName: 'groupName',
      groupOwner: 'groupOwner',
      groupOwnerUserId: 'groupOwnerUserId',
      openConversationId: 'openConversationId',
      status: 'status',
      syncToDingpan: 'syncToDingpan',
      templateId: 'templateId',
      templateName: 'templateName',
      usedQuota: 'usedQuota',
    };
  }

  static types(): { [key: string]: any } {
    return {
      groupAdminsCount: 'number',
      groupCreateTime: 'number',
      groupLastActiveTime: 'number',
      groupLastActiveTimeShow: 'string',
      groupMembersCount: 'number',
      groupName: 'string',
      groupOwner: 'string',
      groupOwnerUserId: 'string',
      openConversationId: 'string',
      status: 'number',
      syncToDingpan: 'number',
      templateId: 'string',
      templateName: 'string',
      usedQuota: 'number',
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


  async createTrustedDevice(request: CreateTrustedDeviceRequest): Promise<CreateTrustedDeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new CreateTrustedDeviceHeaders({ });
    return await this.createTrustedDeviceWithOptions(request, headers, runtime);
  }

  async createTrustedDeviceWithOptions(request: CreateTrustedDeviceRequest, headers: CreateTrustedDeviceHeaders, runtime: $Util.RuntimeOptions): Promise<CreateTrustedDeviceResponse> {
    Util.validateModel(request);
    let body : {[key: string ]: any} = { };
    if (!Util.isUnset(request.macAddress)) {
      body["macAddress"] = request.macAddress;
    }

    if (!Util.isUnset(request.platform)) {
      body["platform"] = request.platform;
    }

    if (!Util.isUnset(request.status)) {
      body["status"] = request.status;
    }

    if (!Util.isUnset(request.userId)) {
      body["userId"] = request.userId;
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
    return $tea.cast<CreateTrustedDeviceResponse>(await this.doROARequest("CreateTrustedDevice", "exclusive_1.0", "HTTP", "POST", "AK", `/v1.0/exclusive/trustedDevices`, "json", req, runtime), new CreateTrustedDeviceResponse({}));
  }

  async deleteComment(publisherId: string, commentId: string): Promise<DeleteCommentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new DeleteCommentHeaders({ });
    return await this.deleteCommentWithOptions(publisherId, commentId, headers, runtime);
  }

  async deleteCommentWithOptions(publisherId: string, commentId: string, headers: DeleteCommentHeaders, runtime: $Util.RuntimeOptions): Promise<DeleteCommentResponse> {
    publisherId = OpenApiUtil.getEncodeParam(publisherId);
    commentId = OpenApiUtil.getEncodeParam(commentId);
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
    return $tea.cast<DeleteCommentResponse>(await this.doROARequest("DeleteComment", "exclusive_1.0", "HTTP", "DELETE", "AK", `/v1.0/exclusive/publishers/${publisherId}/comments/${commentId}`, "boolean", req, runtime), new DeleteCommentResponse({}));
  }

  async getActiveUserSummary(dataId: string): Promise<GetActiveUserSummaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new GetActiveUserSummaryHeaders({ });
    return await this.getActiveUserSummaryWithOptions(dataId, headers, runtime);
  }

  async getActiveUserSummaryWithOptions(dataId: string, headers: GetActiveUserSummaryHeaders, runtime: $Util.RuntimeOptions): Promise<GetActiveUserSummaryResponse> {
    dataId = OpenApiUtil.getEncodeParam(dataId);
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
    return $tea.cast<GetActiveUserSummaryResponse>(await this.doROARequest("GetActiveUserSummary", "exclusive_1.0", "HTTP", "GET", "AK", `/v1.0/exclusive/data/dau/org/${dataId}`, "json", req, runtime), new GetActiveUserSummaryResponse({}));
  }

  async getAllLabelableDepts(): Promise<GetAllLabelableDeptsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new GetAllLabelableDeptsHeaders({ });
    return await this.getAllLabelableDeptsWithOptions(headers, runtime);
  }

  async getAllLabelableDeptsWithOptions(headers: GetAllLabelableDeptsHeaders, runtime: $Util.RuntimeOptions): Promise<GetAllLabelableDeptsResponse> {
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
    return $tea.cast<GetAllLabelableDeptsResponse>(await this.doROARequest("GetAllLabelableDepts", "exclusive_1.0", "HTTP", "GET", "AK", `/v1.0/exclusive/partnerDepartments`, "json", req, runtime), new GetAllLabelableDeptsResponse({}));
  }

  async getCalenderSummary(dataId: string): Promise<GetCalenderSummaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new GetCalenderSummaryHeaders({ });
    return await this.getCalenderSummaryWithOptions(dataId, headers, runtime);
  }

  async getCalenderSummaryWithOptions(dataId: string, headers: GetCalenderSummaryHeaders, runtime: $Util.RuntimeOptions): Promise<GetCalenderSummaryResponse> {
    dataId = OpenApiUtil.getEncodeParam(dataId);
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
    return $tea.cast<GetCalenderSummaryResponse>(await this.doROARequest("GetCalenderSummary", "exclusive_1.0", "HTTP", "GET", "AK", `/v1.0/exclusive/data/calendar/org/${dataId}`, "json", req, runtime), new GetCalenderSummaryResponse({}));
  }

  async getCommentList(publisherId: string, request: GetCommentListRequest): Promise<GetCommentListResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new GetCommentListHeaders({ });
    return await this.getCommentListWithOptions(publisherId, request, headers, runtime);
  }

  async getCommentListWithOptions(publisherId: string, request: GetCommentListRequest, headers: GetCommentListHeaders, runtime: $Util.RuntimeOptions): Promise<GetCommentListResponse> {
    Util.validateModel(request);
    publisherId = OpenApiUtil.getEncodeParam(publisherId);
    let query : {[key: string ]: any} = { };
    if (!Util.isUnset(request.pageNumber)) {
      query["pageNumber"] = request.pageNumber;
    }

    if (!Util.isUnset(request.pageSize)) {
      query["pageSize"] = request.pageSize;
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
    return $tea.cast<GetCommentListResponse>(await this.doROARequest("GetCommentList", "exclusive_1.0", "HTTP", "GET", "AK", `/v1.0/exclusive/publishers/${publisherId}/comments/list`, "json", req, runtime), new GetCommentListResponse({}));
  }

  async getConferenceDetail(conferenceId: string): Promise<GetConferenceDetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new GetConferenceDetailHeaders({ });
    return await this.getConferenceDetailWithOptions(conferenceId, headers, runtime);
  }

  async getConferenceDetailWithOptions(conferenceId: string, headers: GetConferenceDetailHeaders, runtime: $Util.RuntimeOptions): Promise<GetConferenceDetailResponse> {
    conferenceId = OpenApiUtil.getEncodeParam(conferenceId);
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
    return $tea.cast<GetConferenceDetailResponse>(await this.doROARequest("GetConferenceDetail", "exclusive_1.0", "HTTP", "GET", "AK", `/v1.0/exclusive/data/conferences/${conferenceId}`, "json", req, runtime), new GetConferenceDetailResponse({}));
  }

  async getDingReportDeptSummary(dataId: string, request: GetDingReportDeptSummaryRequest): Promise<GetDingReportDeptSummaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new GetDingReportDeptSummaryHeaders({ });
    return await this.getDingReportDeptSummaryWithOptions(dataId, request, headers, runtime);
  }

  async getDingReportDeptSummaryWithOptions(dataId: string, request: GetDingReportDeptSummaryRequest, headers: GetDingReportDeptSummaryHeaders, runtime: $Util.RuntimeOptions): Promise<GetDingReportDeptSummaryResponse> {
    Util.validateModel(request);
    dataId = OpenApiUtil.getEncodeParam(dataId);
    let query : {[key: string ]: any} = { };
    if (!Util.isUnset(request.maxResults)) {
      query["maxResults"] = request.maxResults;
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
    return $tea.cast<GetDingReportDeptSummaryResponse>(await this.doROARequest("GetDingReportDeptSummary", "exclusive_1.0", "HTTP", "GET", "AK", `/v1.0/exclusive/data/report/dept/${dataId}`, "json", req, runtime), new GetDingReportDeptSummaryResponse({}));
  }

  async getDocCreatedDeptSummary(dataId: string, request: GetDocCreatedDeptSummaryRequest): Promise<GetDocCreatedDeptSummaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new GetDocCreatedDeptSummaryHeaders({ });
    return await this.getDocCreatedDeptSummaryWithOptions(dataId, request, headers, runtime);
  }

  async getDocCreatedDeptSummaryWithOptions(dataId: string, request: GetDocCreatedDeptSummaryRequest, headers: GetDocCreatedDeptSummaryHeaders, runtime: $Util.RuntimeOptions): Promise<GetDocCreatedDeptSummaryResponse> {
    Util.validateModel(request);
    dataId = OpenApiUtil.getEncodeParam(dataId);
    let query : {[key: string ]: any} = { };
    if (!Util.isUnset(request.maxResults)) {
      query["maxResults"] = request.maxResults;
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
    return $tea.cast<GetDocCreatedDeptSummaryResponse>(await this.doROARequest("GetDocCreatedDeptSummary", "exclusive_1.0", "HTTP", "GET", "AK", `/v1.0/exclusive/data/doc/dept/${dataId}`, "json", req, runtime), new GetDocCreatedDeptSummaryResponse({}));
  }

  async getDocCreatedSummary(dataId: string): Promise<GetDocCreatedSummaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new GetDocCreatedSummaryHeaders({ });
    return await this.getDocCreatedSummaryWithOptions(dataId, headers, runtime);
  }

  async getDocCreatedSummaryWithOptions(dataId: string, headers: GetDocCreatedSummaryHeaders, runtime: $Util.RuntimeOptions): Promise<GetDocCreatedSummaryResponse> {
    dataId = OpenApiUtil.getEncodeParam(dataId);
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
    return $tea.cast<GetDocCreatedSummaryResponse>(await this.doROARequest("GetDocCreatedSummary", "exclusive_1.0", "HTTP", "GET", "AK", `/v1.0/exclusive/data/doc/org/${dataId}`, "json", req, runtime), new GetDocCreatedSummaryResponse({}));
  }

  async getGeneralFormCreatedDeptSummary(dataId: string, request: GetGeneralFormCreatedDeptSummaryRequest): Promise<GetGeneralFormCreatedDeptSummaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new GetGeneralFormCreatedDeptSummaryHeaders({ });
    return await this.getGeneralFormCreatedDeptSummaryWithOptions(dataId, request, headers, runtime);
  }

  async getGeneralFormCreatedDeptSummaryWithOptions(dataId: string, request: GetGeneralFormCreatedDeptSummaryRequest, headers: GetGeneralFormCreatedDeptSummaryHeaders, runtime: $Util.RuntimeOptions): Promise<GetGeneralFormCreatedDeptSummaryResponse> {
    Util.validateModel(request);
    dataId = OpenApiUtil.getEncodeParam(dataId);
    let query : {[key: string ]: any} = { };
    if (!Util.isUnset(request.maxResults)) {
      query["maxResults"] = request.maxResults;
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
    return $tea.cast<GetGeneralFormCreatedDeptSummaryResponse>(await this.doROARequest("GetGeneralFormCreatedDeptSummary", "exclusive_1.0", "HTTP", "GET", "AK", `/v1.0/exclusive/data/generalForm/dept/${dataId}`, "json", req, runtime), new GetGeneralFormCreatedDeptSummaryResponse({}));
  }

  async getGeneralFormCreatedSummary(dataId: string): Promise<GetGeneralFormCreatedSummaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new GetGeneralFormCreatedSummaryHeaders({ });
    return await this.getGeneralFormCreatedSummaryWithOptions(dataId, headers, runtime);
  }

  async getGeneralFormCreatedSummaryWithOptions(dataId: string, headers: GetGeneralFormCreatedSummaryHeaders, runtime: $Util.RuntimeOptions): Promise<GetGeneralFormCreatedSummaryResponse> {
    dataId = OpenApiUtil.getEncodeParam(dataId);
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
    return $tea.cast<GetGeneralFormCreatedSummaryResponse>(await this.doROARequest("GetGeneralFormCreatedSummary", "exclusive_1.0", "HTTP", "GET", "AK", `/v1.0/exclusive/data/generalForm/org/${dataId}`, "json", req, runtime), new GetGeneralFormCreatedSummaryResponse({}));
  }

  async getGroupActiveInfo(request: GetGroupActiveInfoRequest): Promise<GetGroupActiveInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new GetGroupActiveInfoHeaders({ });
    return await this.getGroupActiveInfoWithOptions(request, headers, runtime);
  }

  async getGroupActiveInfoWithOptions(request: GetGroupActiveInfoRequest, headers: GetGroupActiveInfoHeaders, runtime: $Util.RuntimeOptions): Promise<GetGroupActiveInfoResponse> {
    Util.validateModel(request);
    let query : {[key: string ]: any} = { };
    if (!Util.isUnset(request.dingGroupId)) {
      query["dingGroupId"] = request.dingGroupId;
    }

    if (!Util.isUnset(request.pageNumber)) {
      query["pageNumber"] = request.pageNumber;
    }

    if (!Util.isUnset(request.pageSize)) {
      query["pageSize"] = request.pageSize;
    }

    if (!Util.isUnset(request.statDate)) {
      query["statDate"] = request.statDate;
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
    return $tea.cast<GetGroupActiveInfoResponse>(await this.doROARequest("GetGroupActiveInfo", "exclusive_1.0", "HTTP", "GET", "AK", `/v1.0/exclusive/data/activeGroups`, "json", req, runtime), new GetGroupActiveInfoResponse({}));
  }

  async getInActiveUserList(request: GetInActiveUserListRequest): Promise<GetInActiveUserListResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new GetInActiveUserListHeaders({ });
    return await this.getInActiveUserListWithOptions(request, headers, runtime);
  }

  async getInActiveUserListWithOptions(request: GetInActiveUserListRequest, headers: GetInActiveUserListHeaders, runtime: $Util.RuntimeOptions): Promise<GetInActiveUserListResponse> {
    Util.validateModel(request);
    let body : {[key: string ]: any} = { };
    if (!Util.isUnset(request.deptIds)) {
      body["deptIds"] = request.deptIds;
    }

    if (!Util.isUnset(request.pageNumber)) {
      body["pageNumber"] = request.pageNumber;
    }

    if (!Util.isUnset(request.pageSize)) {
      body["pageSize"] = request.pageSize;
    }

    if (!Util.isUnset(request.statDate)) {
      body["statDate"] = request.statDate;
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
    return $tea.cast<GetInActiveUserListResponse>(await this.doROARequest("GetInActiveUserList", "exclusive_1.0", "HTTP", "POST", "AK", `/v1.0/exclusive/inactives/users/query`, "json", req, runtime), new GetInActiveUserListResponse({}));
  }

  async getOaOperatorLogList(request: GetOaOperatorLogListRequest): Promise<GetOaOperatorLogListResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new GetOaOperatorLogListHeaders({ });
    return await this.getOaOperatorLogListWithOptions(request, headers, runtime);
  }

  async getOaOperatorLogListWithOptions(request: GetOaOperatorLogListRequest, headers: GetOaOperatorLogListHeaders, runtime: $Util.RuntimeOptions): Promise<GetOaOperatorLogListResponse> {
    Util.validateModel(request);
    let body : {[key: string ]: any} = { };
    if (!Util.isUnset(request.categoryList)) {
      body["categoryList"] = request.categoryList;
    }

    if (!Util.isUnset(request.endTime)) {
      body["endTime"] = request.endTime;
    }

    if (!Util.isUnset(request.opUserId)) {
      body["opUserId"] = request.opUserId;
    }

    if (!Util.isUnset(request.pageNumber)) {
      body["pageNumber"] = request.pageNumber;
    }

    if (!Util.isUnset(request.pageSize)) {
      body["pageSize"] = request.pageSize;
    }

    if (!Util.isUnset(request.startTime)) {
      body["startTime"] = request.startTime;
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
    return $tea.cast<GetOaOperatorLogListResponse>(await this.doROARequest("GetOaOperatorLogList", "exclusive_1.0", "HTTP", "POST", "AK", `/v1.0/exclusive/oaOperatorLogs/query`, "json", req, runtime), new GetOaOperatorLogListResponse({}));
  }

  async getPartnerTypeByParentId(parentId: string): Promise<GetPartnerTypeByParentIdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new GetPartnerTypeByParentIdHeaders({ });
    return await this.getPartnerTypeByParentIdWithOptions(parentId, headers, runtime);
  }

  async getPartnerTypeByParentIdWithOptions(parentId: string, headers: GetPartnerTypeByParentIdHeaders, runtime: $Util.RuntimeOptions): Promise<GetPartnerTypeByParentIdResponse> {
    parentId = OpenApiUtil.getEncodeParam(parentId);
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
    return $tea.cast<GetPartnerTypeByParentIdResponse>(await this.doROARequest("GetPartnerTypeByParentId", "exclusive_1.0", "HTTP", "GET", "AK", `/v1.0/exclusive/partnerLabels/${parentId}`, "json", req, runtime), new GetPartnerTypeByParentIdResponse({}));
  }

  async getPublisherSummary(dataId: string, request: GetPublisherSummaryRequest): Promise<GetPublisherSummaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new GetPublisherSummaryHeaders({ });
    return await this.getPublisherSummaryWithOptions(dataId, request, headers, runtime);
  }

  async getPublisherSummaryWithOptions(dataId: string, request: GetPublisherSummaryRequest, headers: GetPublisherSummaryHeaders, runtime: $Util.RuntimeOptions): Promise<GetPublisherSummaryResponse> {
    Util.validateModel(request);
    dataId = OpenApiUtil.getEncodeParam(dataId);
    let query : {[key: string ]: any} = { };
    if (!Util.isUnset(request.maxResults)) {
      query["maxResults"] = request.maxResults;
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
    return $tea.cast<GetPublisherSummaryResponse>(await this.doROARequest("GetPublisherSummary", "exclusive_1.0", "HTTP", "GET", "AK", `/v1.0/exclusive/data/publisher/${dataId}`, "json", req, runtime), new GetPublisherSummaryResponse({}));
  }

  async getTrustDeviceList(request: GetTrustDeviceListRequest): Promise<GetTrustDeviceListResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new GetTrustDeviceListHeaders({ });
    return await this.getTrustDeviceListWithOptions(request, headers, runtime);
  }

  async getTrustDeviceListWithOptions(request: GetTrustDeviceListRequest, headers: GetTrustDeviceListHeaders, runtime: $Util.RuntimeOptions): Promise<GetTrustDeviceListResponse> {
    Util.validateModel(request);
    let body : {[key: string ]: any} = { };
    if (!Util.isUnset(request.userIds)) {
      body["userIds"] = request.userIds;
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
    return $tea.cast<GetTrustDeviceListResponse>(await this.doROARequest("GetTrustDeviceList", "exclusive_1.0", "HTTP", "POST", "AK", `/v1.0/exclusive/trustedDevices/query`, "json", req, runtime), new GetTrustDeviceListResponse({}));
  }

  async getUserAppVersionSummary(dataId: string, request: GetUserAppVersionSummaryRequest): Promise<GetUserAppVersionSummaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new GetUserAppVersionSummaryHeaders({ });
    return await this.getUserAppVersionSummaryWithOptions(dataId, request, headers, runtime);
  }

  async getUserAppVersionSummaryWithOptions(dataId: string, request: GetUserAppVersionSummaryRequest, headers: GetUserAppVersionSummaryHeaders, runtime: $Util.RuntimeOptions): Promise<GetUserAppVersionSummaryResponse> {
    Util.validateModel(request);
    dataId = OpenApiUtil.getEncodeParam(dataId);
    let query : {[key: string ]: any} = { };
    if (!Util.isUnset(request.maxResults)) {
      query["maxResults"] = request.maxResults;
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
    return $tea.cast<GetUserAppVersionSummaryResponse>(await this.doROARequest("GetUserAppVersionSummary", "exclusive_1.0", "HTTP", "GET", "AK", `/v1.0/exclusive/data/appVersion/org/${dataId}`, "json", req, runtime), new GetUserAppVersionSummaryResponse({}));
  }

  async listMiniAppAvailableVersion(request: ListMiniAppAvailableVersionRequest): Promise<ListMiniAppAvailableVersionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new ListMiniAppAvailableVersionHeaders({ });
    return await this.listMiniAppAvailableVersionWithOptions(request, headers, runtime);
  }

  async listMiniAppAvailableVersionWithOptions(request: ListMiniAppAvailableVersionRequest, headers: ListMiniAppAvailableVersionHeaders, runtime: $Util.RuntimeOptions): Promise<ListMiniAppAvailableVersionResponse> {
    Util.validateModel(request);
    let body : {[key: string ]: any} = { };
    if (!Util.isUnset(request.miniAppId)) {
      body["miniAppId"] = request.miniAppId;
    }

    if (!Util.isUnset(request.pageNumber)) {
      body["pageNumber"] = request.pageNumber;
    }

    if (!Util.isUnset(request.pageSize)) {
      body["pageSize"] = request.pageSize;
    }

    if (!Util.isUnset(request.versionTypeSet)) {
      body["versionTypeSet"] = request.versionTypeSet;
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
    return $tea.cast<ListMiniAppAvailableVersionResponse>(await this.doROARequest("ListMiniAppAvailableVersion", "exclusive_1.0", "HTTP", "POST", "AK", `/v1.0/exclusive/miniApps/versions/availableLists`, "json", req, runtime), new ListMiniAppAvailableVersionResponse({}));
  }

  async listMiniAppHistoryVersion(request: ListMiniAppHistoryVersionRequest): Promise<ListMiniAppHistoryVersionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new ListMiniAppHistoryVersionHeaders({ });
    return await this.listMiniAppHistoryVersionWithOptions(request, headers, runtime);
  }

  async listMiniAppHistoryVersionWithOptions(request: ListMiniAppHistoryVersionRequest, headers: ListMiniAppHistoryVersionHeaders, runtime: $Util.RuntimeOptions): Promise<ListMiniAppHistoryVersionResponse> {
    Util.validateModel(request);
    let query : {[key: string ]: any} = { };
    if (!Util.isUnset(request.miniAppId)) {
      query["miniAppId"] = request.miniAppId;
    }

    if (!Util.isUnset(request.pageNumber)) {
      query["pageNumber"] = request.pageNumber;
    }

    if (!Util.isUnset(request.pageSize)) {
      query["pageSize"] = request.pageSize;
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
    return $tea.cast<ListMiniAppHistoryVersionResponse>(await this.doROARequest("ListMiniAppHistoryVersion", "exclusive_1.0", "HTTP", "GET", "AK", `/v1.0/exclusive/miniApps/versions/historyLists`, "json", req, runtime), new ListMiniAppHistoryVersionResponse({}));
  }

  async publishFileChangeNotice(request: PublishFileChangeNoticeRequest): Promise<PublishFileChangeNoticeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new PublishFileChangeNoticeHeaders({ });
    return await this.publishFileChangeNoticeWithOptions(request, headers, runtime);
  }

  async publishFileChangeNoticeWithOptions(request: PublishFileChangeNoticeRequest, headers: PublishFileChangeNoticeHeaders, runtime: $Util.RuntimeOptions): Promise<PublishFileChangeNoticeResponse> {
    Util.validateModel(request);
    let body : {[key: string ]: any} = { };
    if (!Util.isUnset(request.fileId)) {
      body["fileId"] = request.fileId;
    }

    if (!Util.isUnset(request.operateType)) {
      body["operateType"] = request.operateType;
    }

    if (!Util.isUnset(request.operatorUnionId)) {
      body["operatorUnionId"] = request.operatorUnionId;
    }

    if (!Util.isUnset(request.spaceId)) {
      body["spaceId"] = request.spaceId;
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
    return $tea.cast<PublishFileChangeNoticeResponse>(await this.doROARequest("PublishFileChangeNotice", "exclusive_1.0", "HTTP", "POST", "AK", `/v1.0/exclusive/comments/send`, "none", req, runtime), new PublishFileChangeNoticeResponse({}));
  }

  async rollbackMiniAppVersion(request: RollbackMiniAppVersionRequest): Promise<RollbackMiniAppVersionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new RollbackMiniAppVersionHeaders({ });
    return await this.rollbackMiniAppVersionWithOptions(request, headers, runtime);
  }

  async rollbackMiniAppVersionWithOptions(request: RollbackMiniAppVersionRequest, headers: RollbackMiniAppVersionHeaders, runtime: $Util.RuntimeOptions): Promise<RollbackMiniAppVersionResponse> {
    Util.validateModel(request);
    let body : {[key: string ]: any} = { };
    if (!Util.isUnset(request.miniAppId)) {
      body["miniAppId"] = request.miniAppId;
    }

    if (!Util.isUnset(request.rollbackVersion)) {
      body["rollbackVersion"] = request.rollbackVersion;
    }

    if (!Util.isUnset(request.targetVersion)) {
      body["targetVersion"] = request.targetVersion;
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
    return $tea.cast<RollbackMiniAppVersionResponse>(await this.doROARequest("RollbackMiniAppVersion", "exclusive_1.0", "HTTP", "POST", "AK", `/v1.0/exclusive/miniApps/versions/rollback`, "json", req, runtime), new RollbackMiniAppVersionResponse({}));
  }

  async searchOrgInnerGroupInfo(request: SearchOrgInnerGroupInfoRequest): Promise<SearchOrgInnerGroupInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new SearchOrgInnerGroupInfoHeaders({ });
    return await this.searchOrgInnerGroupInfoWithOptions(request, headers, runtime);
  }

  async searchOrgInnerGroupInfoWithOptions(request: SearchOrgInnerGroupInfoRequest, headers: SearchOrgInnerGroupInfoHeaders, runtime: $Util.RuntimeOptions): Promise<SearchOrgInnerGroupInfoResponse> {
    Util.validateModel(request);
    let query : {[key: string ]: any} = { };
    if (!Util.isUnset(request.createTimeEnd)) {
      query["createTimeEnd"] = request.createTimeEnd;
    }

    if (!Util.isUnset(request.createTimeStart)) {
      query["createTimeStart"] = request.createTimeStart;
    }

    if (!Util.isUnset(request.groupMembersCountEnd)) {
      query["groupMembersCountEnd"] = request.groupMembersCountEnd;
    }

    if (!Util.isUnset(request.groupMembersCountStart)) {
      query["groupMembersCountStart"] = request.groupMembersCountStart;
    }

    if (!Util.isUnset(request.groupName)) {
      query["groupName"] = request.groupName;
    }

    if (!Util.isUnset(request.groupOwner)) {
      query["groupOwner"] = request.groupOwner;
    }

    if (!Util.isUnset(request.lastActiveTimeEnd)) {
      query["lastActiveTimeEnd"] = request.lastActiveTimeEnd;
    }

    if (!Util.isUnset(request.lastActiveTimeStart)) {
      query["lastActiveTimeStart"] = request.lastActiveTimeStart;
    }

    if (!Util.isUnset(request.operatorUserId)) {
      query["operatorUserId"] = request.operatorUserId;
    }

    if (!Util.isUnset(request.pageSize)) {
      query["pageSize"] = request.pageSize;
    }

    if (!Util.isUnset(request.pageStart)) {
      query["pageStart"] = request.pageStart;
    }

    if (!Util.isUnset(request.syncToDingpan)) {
      query["syncToDingpan"] = request.syncToDingpan;
    }

    if (!Util.isUnset(request.uuid)) {
      query["uuid"] = request.uuid;
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
    return $tea.cast<SearchOrgInnerGroupInfoResponse>(await this.doROARequest("SearchOrgInnerGroupInfo", "exclusive_1.0", "HTTP", "GET", "AK", `/v1.0/exclusive/securities/orgGroupInfos`, "json", req, runtime), new SearchOrgInnerGroupInfoResponse({}));
  }

  async sendAppDing(request: SendAppDingRequest): Promise<SendAppDingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new SendAppDingHeaders({ });
    return await this.sendAppDingWithOptions(request, headers, runtime);
  }

  async sendAppDingWithOptions(request: SendAppDingRequest, headers: SendAppDingHeaders, runtime: $Util.RuntimeOptions): Promise<SendAppDingResponse> {
    Util.validateModel(request);
    let body : {[key: string ]: any} = { };
    if (!Util.isUnset(request.content)) {
      body["content"] = request.content;
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
    return $tea.cast<SendAppDingResponse>(await this.doROARequest("SendAppDing", "exclusive_1.0", "HTTP", "POST", "AK", `/v1.0/exclusive/appDings/send`, "none", req, runtime), new SendAppDingResponse({}));
  }

  async sendInvitation(request: SendInvitationRequest): Promise<SendInvitationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new SendInvitationHeaders({ });
    return await this.sendInvitationWithOptions(request, headers, runtime);
  }

  async sendInvitationWithOptions(request: SendInvitationRequest, headers: SendInvitationHeaders, runtime: $Util.RuntimeOptions): Promise<SendInvitationResponse> {
    Util.validateModel(request);
    let body : {[key: string ]: any} = { };
    if (!Util.isUnset(request.deptId)) {
      body["deptId"] = request.deptId;
    }

    if (!Util.isUnset(request.orgAlias)) {
      body["orgAlias"] = request.orgAlias;
    }

    if (!Util.isUnset(request.partnerLabelId)) {
      body["partnerLabelId"] = request.partnerLabelId;
    }

    if (!Util.isUnset(request.partnerNum)) {
      body["partnerNum"] = request.partnerNum;
    }

    if (!Util.isUnset(request.phone)) {
      body["phone"] = request.phone;
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
    return $tea.cast<SendInvitationResponse>(await this.doROARequest("SendInvitation", "exclusive_1.0", "HTTP", "POST", "AK", `/v1.0/exclusive/partnerDepartments/invitations/send`, "none", req, runtime), new SendInvitationResponse({}));
  }

  async setDeptPartnerTypeAndNum(request: SetDeptPartnerTypeAndNumRequest): Promise<SetDeptPartnerTypeAndNumResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new SetDeptPartnerTypeAndNumHeaders({ });
    return await this.setDeptPartnerTypeAndNumWithOptions(request, headers, runtime);
  }

  async setDeptPartnerTypeAndNumWithOptions(request: SetDeptPartnerTypeAndNumRequest, headers: SetDeptPartnerTypeAndNumHeaders, runtime: $Util.RuntimeOptions): Promise<SetDeptPartnerTypeAndNumResponse> {
    Util.validateModel(request);
    let body : {[key: string ]: any} = { };
    if (!Util.isUnset(request.deptId)) {
      body["deptId"] = request.deptId;
    }

    if (!Util.isUnset(request.labelIds)) {
      body["labelIds"] = request.labelIds;
    }

    if (!Util.isUnset(request.partnerNum)) {
      body["partnerNum"] = request.partnerNum;
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
    return $tea.cast<SetDeptPartnerTypeAndNumResponse>(await this.doROARequest("SetDeptPartnerTypeAndNum", "exclusive_1.0", "HTTP", "POST", "AK", `/v1.0/exclusive/partnerDepartments`, "none", req, runtime), new SetDeptPartnerTypeAndNumResponse({}));
  }

  async updateMiniAppVersionStatus(request: UpdateMiniAppVersionStatusRequest): Promise<UpdateMiniAppVersionStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new UpdateMiniAppVersionStatusHeaders({ });
    return await this.updateMiniAppVersionStatusWithOptions(request, headers, runtime);
  }

  async updateMiniAppVersionStatusWithOptions(request: UpdateMiniAppVersionStatusRequest, headers: UpdateMiniAppVersionStatusHeaders, runtime: $Util.RuntimeOptions): Promise<UpdateMiniAppVersionStatusResponse> {
    Util.validateModel(request);
    let body : {[key: string ]: any} = { };
    if (!Util.isUnset(request.miniAppId)) {
      body["miniAppId"] = request.miniAppId;
    }

    if (!Util.isUnset(request.version)) {
      body["version"] = request.version;
    }

    if (!Util.isUnset(request.versionType)) {
      body["versionType"] = request.versionType;
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
    return $tea.cast<UpdateMiniAppVersionStatusResponse>(await this.doROARequest("UpdateMiniAppVersionStatus", "exclusive_1.0", "HTTP", "POST", "AK", `/v1.0/exclusive/miniApps/versions/versionStatus`, "json", req, runtime), new UpdateMiniAppVersionStatusResponse({}));
  }

  async updatePartnerVisibility(request: UpdatePartnerVisibilityRequest): Promise<UpdatePartnerVisibilityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new UpdatePartnerVisibilityHeaders({ });
    return await this.updatePartnerVisibilityWithOptions(request, headers, runtime);
  }

  async updatePartnerVisibilityWithOptions(request: UpdatePartnerVisibilityRequest, headers: UpdatePartnerVisibilityHeaders, runtime: $Util.RuntimeOptions): Promise<UpdatePartnerVisibilityResponse> {
    Util.validateModel(request);
    let body : {[key: string ]: any} = { };
    if (!Util.isUnset(request.deptIds)) {
      body["deptIds"] = request.deptIds;
    }

    if (!Util.isUnset(request.labelId)) {
      body["labelId"] = request.labelId;
    }

    if (!Util.isUnset(request.userIds)) {
      body["userIds"] = request.userIds;
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
    return $tea.cast<UpdatePartnerVisibilityResponse>(await this.doROARequest("UpdatePartnerVisibility", "exclusive_1.0", "HTTP", "PUT", "AK", `/v1.0/exclusive/partnerDepartments/visibilityPartners`, "boolean", req, runtime), new UpdatePartnerVisibilityResponse({}));
  }

  async updateRoleVisibility(request: UpdateRoleVisibilityRequest): Promise<UpdateRoleVisibilityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers = new UpdateRoleVisibilityHeaders({ });
    return await this.updateRoleVisibilityWithOptions(request, headers, runtime);
  }

  async updateRoleVisibilityWithOptions(request: UpdateRoleVisibilityRequest, headers: UpdateRoleVisibilityHeaders, runtime: $Util.RuntimeOptions): Promise<UpdateRoleVisibilityResponse> {
    Util.validateModel(request);
    let body : {[key: string ]: any} = { };
    if (!Util.isUnset(request.deptIds)) {
      body["deptIds"] = request.deptIds;
    }

    if (!Util.isUnset(request.labelId)) {
      body["labelId"] = request.labelId;
    }

    if (!Util.isUnset(request.userIds)) {
      body["userIds"] = request.userIds;
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
    return $tea.cast<UpdateRoleVisibilityResponse>(await this.doROARequest("UpdateRoleVisibility", "exclusive_1.0", "HTTP", "PUT", "AK", `/v1.0/exclusive/partnerDepartments/visibilityRoles`, "boolean", req, runtime), new UpdateRoleVisibilityResponse({}));
  }

}
