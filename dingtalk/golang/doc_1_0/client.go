// This file is auto-generated, don't edit it. Thanks.
/**
 *
 */
package doc_1_0

import (
	openapi "github.com/alibabacloud-go/darabonba-openapi/client"
	openapiutil "github.com/alibabacloud-go/openapi-util/service"
	util "github.com/alibabacloud-go/tea-utils/service"
	"github.com/alibabacloud-go/tea/tea"
)

type BatchGetWorkspaceDocsHeaders struct {
	CommonHeaders           map[string]*string `json:"commonHeaders,omitempty" xml:"commonHeaders,omitempty"`
	XAcsDingtalkAccessToken *string            `json:"x-acs-dingtalk-access-token,omitempty" xml:"x-acs-dingtalk-access-token,omitempty"`
}

func (s BatchGetWorkspaceDocsHeaders) String() string {
	return tea.Prettify(s)
}

func (s BatchGetWorkspaceDocsHeaders) GoString() string {
	return s.String()
}

func (s *BatchGetWorkspaceDocsHeaders) SetCommonHeaders(v map[string]*string) *BatchGetWorkspaceDocsHeaders {
	s.CommonHeaders = v
	return s
}

func (s *BatchGetWorkspaceDocsHeaders) SetXAcsDingtalkAccessToken(v string) *BatchGetWorkspaceDocsHeaders {
	s.XAcsDingtalkAccessToken = &v
	return s
}

type BatchGetWorkspaceDocsRequest struct {
	// 操作用户unionId
	OperatorId *string `json:"operatorId,omitempty" xml:"operatorId,omitempty"`
	// 查询节点Id
	NodeIds             []*string `json:"nodeIds,omitempty" xml:"nodeIds,omitempty" type:"Repeated"`
	DingIsvOrgId        *int64    `json:"dingIsvOrgId,omitempty" xml:"dingIsvOrgId,omitempty"`
	DingOrgId           *int64    `json:"dingOrgId,omitempty" xml:"dingOrgId,omitempty"`
	DingAccessTokenType *string   `json:"dingAccessTokenType,omitempty" xml:"dingAccessTokenType,omitempty"`
	DingUid             *int64    `json:"dingUid,omitempty" xml:"dingUid,omitempty"`
}

func (s BatchGetWorkspaceDocsRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchGetWorkspaceDocsRequest) GoString() string {
	return s.String()
}

func (s *BatchGetWorkspaceDocsRequest) SetOperatorId(v string) *BatchGetWorkspaceDocsRequest {
	s.OperatorId = &v
	return s
}

func (s *BatchGetWorkspaceDocsRequest) SetNodeIds(v []*string) *BatchGetWorkspaceDocsRequest {
	s.NodeIds = v
	return s
}

func (s *BatchGetWorkspaceDocsRequest) SetDingIsvOrgId(v int64) *BatchGetWorkspaceDocsRequest {
	s.DingIsvOrgId = &v
	return s
}

func (s *BatchGetWorkspaceDocsRequest) SetDingOrgId(v int64) *BatchGetWorkspaceDocsRequest {
	s.DingOrgId = &v
	return s
}

func (s *BatchGetWorkspaceDocsRequest) SetDingAccessTokenType(v string) *BatchGetWorkspaceDocsRequest {
	s.DingAccessTokenType = &v
	return s
}

func (s *BatchGetWorkspaceDocsRequest) SetDingUid(v int64) *BatchGetWorkspaceDocsRequest {
	s.DingUid = &v
	return s
}

type BatchGetWorkspaceDocsResponseBody struct {
	Result []*BatchGetWorkspaceDocsResponseBodyResult `json:"result,omitempty" xml:"result,omitempty" type:"Repeated"`
}

func (s BatchGetWorkspaceDocsResponseBody) String() string {
	return tea.Prettify(s)
}

func (s BatchGetWorkspaceDocsResponseBody) GoString() string {
	return s.String()
}

func (s *BatchGetWorkspaceDocsResponseBody) SetResult(v []*BatchGetWorkspaceDocsResponseBodyResult) *BatchGetWorkspaceDocsResponseBody {
	s.Result = v
	return s
}

type BatchGetWorkspaceDocsResponseBodyResult struct {
	NodeBO        *BatchGetWorkspaceDocsResponseBodyResultNodeBO      `json:"nodeBO,omitempty" xml:"nodeBO,omitempty" type:"Struct"`
	WorkspaceBO   *BatchGetWorkspaceDocsResponseBodyResultWorkspaceBO `json:"workspaceBO,omitempty" xml:"workspaceBO,omitempty" type:"Struct"`
	HasPermission *bool                                               `json:"hasPermission,omitempty" xml:"hasPermission,omitempty"`
}

func (s BatchGetWorkspaceDocsResponseBodyResult) String() string {
	return tea.Prettify(s)
}

func (s BatchGetWorkspaceDocsResponseBodyResult) GoString() string {
	return s.String()
}

func (s *BatchGetWorkspaceDocsResponseBodyResult) SetNodeBO(v *BatchGetWorkspaceDocsResponseBodyResultNodeBO) *BatchGetWorkspaceDocsResponseBodyResult {
	s.NodeBO = v
	return s
}

func (s *BatchGetWorkspaceDocsResponseBodyResult) SetWorkspaceBO(v *BatchGetWorkspaceDocsResponseBodyResultWorkspaceBO) *BatchGetWorkspaceDocsResponseBodyResult {
	s.WorkspaceBO = v
	return s
}

func (s *BatchGetWorkspaceDocsResponseBodyResult) SetHasPermission(v bool) *BatchGetWorkspaceDocsResponseBodyResult {
	s.HasPermission = &v
	return s
}

type BatchGetWorkspaceDocsResponseBodyResultNodeBO struct {
	Name    *string `json:"name,omitempty" xml:"name,omitempty"`
	NodeId  *string `json:"nodeId,omitempty" xml:"nodeId,omitempty"`
	Url     *string `json:"url,omitempty" xml:"url,omitempty"`
	Deleted *bool   `json:"deleted,omitempty" xml:"deleted,omitempty"`
}

func (s BatchGetWorkspaceDocsResponseBodyResultNodeBO) String() string {
	return tea.Prettify(s)
}

func (s BatchGetWorkspaceDocsResponseBodyResultNodeBO) GoString() string {
	return s.String()
}

func (s *BatchGetWorkspaceDocsResponseBodyResultNodeBO) SetName(v string) *BatchGetWorkspaceDocsResponseBodyResultNodeBO {
	s.Name = &v
	return s
}

func (s *BatchGetWorkspaceDocsResponseBodyResultNodeBO) SetNodeId(v string) *BatchGetWorkspaceDocsResponseBodyResultNodeBO {
	s.NodeId = &v
	return s
}

func (s *BatchGetWorkspaceDocsResponseBodyResultNodeBO) SetUrl(v string) *BatchGetWorkspaceDocsResponseBodyResultNodeBO {
	s.Url = &v
	return s
}

func (s *BatchGetWorkspaceDocsResponseBodyResultNodeBO) SetDeleted(v bool) *BatchGetWorkspaceDocsResponseBodyResultNodeBO {
	s.Deleted = &v
	return s
}

type BatchGetWorkspaceDocsResponseBodyResultWorkspaceBO struct {
	WorkspaceId *string `json:"workspaceId,omitempty" xml:"workspaceId,omitempty"`
	Name        *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s BatchGetWorkspaceDocsResponseBodyResultWorkspaceBO) String() string {
	return tea.Prettify(s)
}

func (s BatchGetWorkspaceDocsResponseBodyResultWorkspaceBO) GoString() string {
	return s.String()
}

func (s *BatchGetWorkspaceDocsResponseBodyResultWorkspaceBO) SetWorkspaceId(v string) *BatchGetWorkspaceDocsResponseBodyResultWorkspaceBO {
	s.WorkspaceId = &v
	return s
}

func (s *BatchGetWorkspaceDocsResponseBodyResultWorkspaceBO) SetName(v string) *BatchGetWorkspaceDocsResponseBodyResultWorkspaceBO {
	s.Name = &v
	return s
}

type BatchGetWorkspaceDocsResponse struct {
	Headers map[string]*string                 `json:"headers,omitempty" xml:"headers,omitempty" require:"true"`
	Body    *BatchGetWorkspaceDocsResponseBody `json:"body,omitempty" xml:"body,omitempty" require:"true"`
}

func (s BatchGetWorkspaceDocsResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchGetWorkspaceDocsResponse) GoString() string {
	return s.String()
}

func (s *BatchGetWorkspaceDocsResponse) SetHeaders(v map[string]*string) *BatchGetWorkspaceDocsResponse {
	s.Headers = v
	return s
}

func (s *BatchGetWorkspaceDocsResponse) SetBody(v *BatchGetWorkspaceDocsResponseBody) *BatchGetWorkspaceDocsResponse {
	s.Body = v
	return s
}

type UpdateWorkspaceDocMembersHeaders struct {
	CommonHeaders           map[string]*string `json:"commonHeaders,omitempty" xml:"commonHeaders,omitempty"`
	XAcsDingtalkAccessToken *string            `json:"x-acs-dingtalk-access-token,omitempty" xml:"x-acs-dingtalk-access-token,omitempty"`
}

func (s UpdateWorkspaceDocMembersHeaders) String() string {
	return tea.Prettify(s)
}

func (s UpdateWorkspaceDocMembersHeaders) GoString() string {
	return s.String()
}

func (s *UpdateWorkspaceDocMembersHeaders) SetCommonHeaders(v map[string]*string) *UpdateWorkspaceDocMembersHeaders {
	s.CommonHeaders = v
	return s
}

func (s *UpdateWorkspaceDocMembersHeaders) SetXAcsDingtalkAccessToken(v string) *UpdateWorkspaceDocMembersHeaders {
	s.XAcsDingtalkAccessToken = &v
	return s
}

type UpdateWorkspaceDocMembersRequest struct {
	// 发起操作者unionId
	OperatorId *string `json:"operatorId,omitempty" xml:"operatorId,omitempty"`
	// 被操作用户组
	Members []*UpdateWorkspaceDocMembersRequestMembers `json:"members,omitempty" xml:"members,omitempty" type:"Repeated"`
}

func (s UpdateWorkspaceDocMembersRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateWorkspaceDocMembersRequest) GoString() string {
	return s.String()
}

func (s *UpdateWorkspaceDocMembersRequest) SetOperatorId(v string) *UpdateWorkspaceDocMembersRequest {
	s.OperatorId = &v
	return s
}

func (s *UpdateWorkspaceDocMembersRequest) SetMembers(v []*UpdateWorkspaceDocMembersRequestMembers) *UpdateWorkspaceDocMembersRequest {
	s.Members = v
	return s
}

type UpdateWorkspaceDocMembersRequestMembers struct {
	// 被操作用户unionId
	MemberId *string `json:"memberId,omitempty" xml:"memberId,omitempty"`
	// 用户类型
	MemberType *string `json:"memberType,omitempty" xml:"memberType,omitempty"`
	// 用户权限
	RoleType *string `json:"roleType,omitempty" xml:"roleType,omitempty"`
}

func (s UpdateWorkspaceDocMembersRequestMembers) String() string {
	return tea.Prettify(s)
}

func (s UpdateWorkspaceDocMembersRequestMembers) GoString() string {
	return s.String()
}

func (s *UpdateWorkspaceDocMembersRequestMembers) SetMemberId(v string) *UpdateWorkspaceDocMembersRequestMembers {
	s.MemberId = &v
	return s
}

func (s *UpdateWorkspaceDocMembersRequestMembers) SetMemberType(v string) *UpdateWorkspaceDocMembersRequestMembers {
	s.MemberType = &v
	return s
}

func (s *UpdateWorkspaceDocMembersRequestMembers) SetRoleType(v string) *UpdateWorkspaceDocMembersRequestMembers {
	s.RoleType = &v
	return s
}

type UpdateWorkspaceDocMembersResponse struct {
	Headers map[string]*string `json:"headers,omitempty" xml:"headers,omitempty" require:"true"`
}

func (s UpdateWorkspaceDocMembersResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateWorkspaceDocMembersResponse) GoString() string {
	return s.String()
}

func (s *UpdateWorkspaceDocMembersResponse) SetHeaders(v map[string]*string) *UpdateWorkspaceDocMembersResponse {
	s.Headers = v
	return s
}

type CreateWorkspaceDocHeaders struct {
	CommonHeaders           map[string]*string `json:"commonHeaders,omitempty" xml:"commonHeaders,omitempty"`
	XAcsDingtalkAccessToken *string            `json:"x-acs-dingtalk-access-token,omitempty" xml:"x-acs-dingtalk-access-token,omitempty"`
}

func (s CreateWorkspaceDocHeaders) String() string {
	return tea.Prettify(s)
}

func (s CreateWorkspaceDocHeaders) GoString() string {
	return s.String()
}

func (s *CreateWorkspaceDocHeaders) SetCommonHeaders(v map[string]*string) *CreateWorkspaceDocHeaders {
	s.CommonHeaders = v
	return s
}

func (s *CreateWorkspaceDocHeaders) SetXAcsDingtalkAccessToken(v string) *CreateWorkspaceDocHeaders {
	s.XAcsDingtalkAccessToken = &v
	return s
}

type CreateWorkspaceDocRequest struct {
	// 文档名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 文档类型
	DocType *string `json:"docType,omitempty" xml:"docType,omitempty"`
	// 操作人unionId
	OperatorId *string `json:"operatorId,omitempty" xml:"operatorId,omitempty"`
}

func (s CreateWorkspaceDocRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateWorkspaceDocRequest) GoString() string {
	return s.String()
}

func (s *CreateWorkspaceDocRequest) SetName(v string) *CreateWorkspaceDocRequest {
	s.Name = &v
	return s
}

func (s *CreateWorkspaceDocRequest) SetDocType(v string) *CreateWorkspaceDocRequest {
	s.DocType = &v
	return s
}

func (s *CreateWorkspaceDocRequest) SetOperatorId(v string) *CreateWorkspaceDocRequest {
	s.OperatorId = &v
	return s
}

type CreateWorkspaceDocResponseBody struct {
	// 团队空间Id
	WorkspaceId *string `json:"workspaceId,omitempty" xml:"workspaceId,omitempty"`
	// 文档Id
	NodeId *string `json:"nodeId,omitempty" xml:"nodeId,omitempty"`
	// 文档docKey
	DocKey *string `json:"docKey,omitempty" xml:"docKey,omitempty"`
	// 文档打开url
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s CreateWorkspaceDocResponseBody) String() string {
	return tea.Prettify(s)
}

func (s CreateWorkspaceDocResponseBody) GoString() string {
	return s.String()
}

func (s *CreateWorkspaceDocResponseBody) SetWorkspaceId(v string) *CreateWorkspaceDocResponseBody {
	s.WorkspaceId = &v
	return s
}

func (s *CreateWorkspaceDocResponseBody) SetNodeId(v string) *CreateWorkspaceDocResponseBody {
	s.NodeId = &v
	return s
}

func (s *CreateWorkspaceDocResponseBody) SetDocKey(v string) *CreateWorkspaceDocResponseBody {
	s.DocKey = &v
	return s
}

func (s *CreateWorkspaceDocResponseBody) SetUrl(v string) *CreateWorkspaceDocResponseBody {
	s.Url = &v
	return s
}

type CreateWorkspaceDocResponse struct {
	Headers map[string]*string              `json:"headers,omitempty" xml:"headers,omitempty" require:"true"`
	Body    *CreateWorkspaceDocResponseBody `json:"body,omitempty" xml:"body,omitempty" require:"true"`
}

func (s CreateWorkspaceDocResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateWorkspaceDocResponse) GoString() string {
	return s.String()
}

func (s *CreateWorkspaceDocResponse) SetHeaders(v map[string]*string) *CreateWorkspaceDocResponse {
	s.Headers = v
	return s
}

func (s *CreateWorkspaceDocResponse) SetBody(v *CreateWorkspaceDocResponseBody) *CreateWorkspaceDocResponse {
	s.Body = v
	return s
}

type CreateWorkspaceHeaders struct {
	CommonHeaders           map[string]*string `json:"commonHeaders,omitempty" xml:"commonHeaders,omitempty"`
	XAcsDingtalkAccessToken *string            `json:"x-acs-dingtalk-access-token,omitempty" xml:"x-acs-dingtalk-access-token,omitempty"`
}

func (s CreateWorkspaceHeaders) String() string {
	return tea.Prettify(s)
}

func (s CreateWorkspaceHeaders) GoString() string {
	return s.String()
}

func (s *CreateWorkspaceHeaders) SetCommonHeaders(v map[string]*string) *CreateWorkspaceHeaders {
	s.CommonHeaders = v
	return s
}

func (s *CreateWorkspaceHeaders) SetXAcsDingtalkAccessToken(v string) *CreateWorkspaceHeaders {
	s.XAcsDingtalkAccessToken = &v
	return s
}

type CreateWorkspaceRequest struct {
	// 团队空间名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 团队空间描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 用户id
	OperatorId          *string `json:"operatorId,omitempty" xml:"operatorId,omitempty"`
	DingOrgId           *int64  `json:"dingOrgId,omitempty" xml:"dingOrgId,omitempty"`
	DingUid             *int64  `json:"dingUid,omitempty" xml:"dingUid,omitempty"`
	DingAccessTokenType *string `json:"dingAccessTokenType,omitempty" xml:"dingAccessTokenType,omitempty"`
	DingIsvOrgId        *int64  `json:"dingIsvOrgId,omitempty" xml:"dingIsvOrgId,omitempty"`
}

func (s CreateWorkspaceRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateWorkspaceRequest) GoString() string {
	return s.String()
}

func (s *CreateWorkspaceRequest) SetName(v string) *CreateWorkspaceRequest {
	s.Name = &v
	return s
}

func (s *CreateWorkspaceRequest) SetDescription(v string) *CreateWorkspaceRequest {
	s.Description = &v
	return s
}

func (s *CreateWorkspaceRequest) SetOperatorId(v string) *CreateWorkspaceRequest {
	s.OperatorId = &v
	return s
}

func (s *CreateWorkspaceRequest) SetDingOrgId(v int64) *CreateWorkspaceRequest {
	s.DingOrgId = &v
	return s
}

func (s *CreateWorkspaceRequest) SetDingUid(v int64) *CreateWorkspaceRequest {
	s.DingUid = &v
	return s
}

func (s *CreateWorkspaceRequest) SetDingAccessTokenType(v string) *CreateWorkspaceRequest {
	s.DingAccessTokenType = &v
	return s
}

func (s *CreateWorkspaceRequest) SetDingIsvOrgId(v int64) *CreateWorkspaceRequest {
	s.DingIsvOrgId = &v
	return s
}

type CreateWorkspaceResponseBody struct {
	// 工作空间id
	WorkspaceId *string `json:"workspaceId,omitempty" xml:"workspaceId,omitempty"`
	// 工作空间名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 工作空间描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 工作空间打开url
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s CreateWorkspaceResponseBody) String() string {
	return tea.Prettify(s)
}

func (s CreateWorkspaceResponseBody) GoString() string {
	return s.String()
}

func (s *CreateWorkspaceResponseBody) SetWorkspaceId(v string) *CreateWorkspaceResponseBody {
	s.WorkspaceId = &v
	return s
}

func (s *CreateWorkspaceResponseBody) SetName(v string) *CreateWorkspaceResponseBody {
	s.Name = &v
	return s
}

func (s *CreateWorkspaceResponseBody) SetDescription(v string) *CreateWorkspaceResponseBody {
	s.Description = &v
	return s
}

func (s *CreateWorkspaceResponseBody) SetUrl(v string) *CreateWorkspaceResponseBody {
	s.Url = &v
	return s
}

type CreateWorkspaceResponse struct {
	Headers map[string]*string           `json:"headers,omitempty" xml:"headers,omitempty" require:"true"`
	Body    *CreateWorkspaceResponseBody `json:"body,omitempty" xml:"body,omitempty" require:"true"`
}

func (s CreateWorkspaceResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateWorkspaceResponse) GoString() string {
	return s.String()
}

func (s *CreateWorkspaceResponse) SetHeaders(v map[string]*string) *CreateWorkspaceResponse {
	s.Headers = v
	return s
}

func (s *CreateWorkspaceResponse) SetBody(v *CreateWorkspaceResponseBody) *CreateWorkspaceResponse {
	s.Body = v
	return s
}

type DeleteWorkspaceDocMembersHeaders struct {
	CommonHeaders           map[string]*string `json:"commonHeaders,omitempty" xml:"commonHeaders,omitempty"`
	XAcsDingtalkAccessToken *string            `json:"x-acs-dingtalk-access-token,omitempty" xml:"x-acs-dingtalk-access-token,omitempty"`
}

func (s DeleteWorkspaceDocMembersHeaders) String() string {
	return tea.Prettify(s)
}

func (s DeleteWorkspaceDocMembersHeaders) GoString() string {
	return s.String()
}

func (s *DeleteWorkspaceDocMembersHeaders) SetCommonHeaders(v map[string]*string) *DeleteWorkspaceDocMembersHeaders {
	s.CommonHeaders = v
	return s
}

func (s *DeleteWorkspaceDocMembersHeaders) SetXAcsDingtalkAccessToken(v string) *DeleteWorkspaceDocMembersHeaders {
	s.XAcsDingtalkAccessToken = &v
	return s
}

type DeleteWorkspaceDocMembersRequest struct {
	// 发起操作者unionId
	OperatorId *string `json:"operatorId,omitempty" xml:"operatorId,omitempty"`
	// 被操作用户组
	Members []*DeleteWorkspaceDocMembersRequestMembers `json:"members,omitempty" xml:"members,omitempty" type:"Repeated"`
}

func (s DeleteWorkspaceDocMembersRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteWorkspaceDocMembersRequest) GoString() string {
	return s.String()
}

func (s *DeleteWorkspaceDocMembersRequest) SetOperatorId(v string) *DeleteWorkspaceDocMembersRequest {
	s.OperatorId = &v
	return s
}

func (s *DeleteWorkspaceDocMembersRequest) SetMembers(v []*DeleteWorkspaceDocMembersRequestMembers) *DeleteWorkspaceDocMembersRequest {
	s.Members = v
	return s
}

type DeleteWorkspaceDocMembersRequestMembers struct {
	// 被操作用户unionId
	MemberId *string `json:"memberId,omitempty" xml:"memberId,omitempty"`
	// 用户类型
	MemberType *string `json:"memberType,omitempty" xml:"memberType,omitempty"`
}

func (s DeleteWorkspaceDocMembersRequestMembers) String() string {
	return tea.Prettify(s)
}

func (s DeleteWorkspaceDocMembersRequestMembers) GoString() string {
	return s.String()
}

func (s *DeleteWorkspaceDocMembersRequestMembers) SetMemberId(v string) *DeleteWorkspaceDocMembersRequestMembers {
	s.MemberId = &v
	return s
}

func (s *DeleteWorkspaceDocMembersRequestMembers) SetMemberType(v string) *DeleteWorkspaceDocMembersRequestMembers {
	s.MemberType = &v
	return s
}

type DeleteWorkspaceDocMembersResponse struct {
	Headers map[string]*string `json:"headers,omitempty" xml:"headers,omitempty" require:"true"`
}

func (s DeleteWorkspaceDocMembersResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteWorkspaceDocMembersResponse) GoString() string {
	return s.String()
}

func (s *DeleteWorkspaceDocMembersResponse) SetHeaders(v map[string]*string) *DeleteWorkspaceDocMembersResponse {
	s.Headers = v
	return s
}

type GetWorkspaceHeaders struct {
	CommonHeaders           map[string]*string `json:"commonHeaders,omitempty" xml:"commonHeaders,omitempty"`
	XAcsDingtalkAccessToken *string            `json:"x-acs-dingtalk-access-token,omitempty" xml:"x-acs-dingtalk-access-token,omitempty"`
}

func (s GetWorkspaceHeaders) String() string {
	return tea.Prettify(s)
}

func (s GetWorkspaceHeaders) GoString() string {
	return s.String()
}

func (s *GetWorkspaceHeaders) SetCommonHeaders(v map[string]*string) *GetWorkspaceHeaders {
	s.CommonHeaders = v
	return s
}

func (s *GetWorkspaceHeaders) SetXAcsDingtalkAccessToken(v string) *GetWorkspaceHeaders {
	s.XAcsDingtalkAccessToken = &v
	return s
}

type GetWorkspaceResponseBody struct {
	Url       *string `json:"url,omitempty" xml:"url,omitempty"`
	IsDeleted *bool   `json:"isDeleted,omitempty" xml:"isDeleted,omitempty"`
	Owner     *string `json:"owner,omitempty" xml:"owner,omitempty"`
}

func (s GetWorkspaceResponseBody) String() string {
	return tea.Prettify(s)
}

func (s GetWorkspaceResponseBody) GoString() string {
	return s.String()
}

func (s *GetWorkspaceResponseBody) SetUrl(v string) *GetWorkspaceResponseBody {
	s.Url = &v
	return s
}

func (s *GetWorkspaceResponseBody) SetIsDeleted(v bool) *GetWorkspaceResponseBody {
	s.IsDeleted = &v
	return s
}

func (s *GetWorkspaceResponseBody) SetOwner(v string) *GetWorkspaceResponseBody {
	s.Owner = &v
	return s
}

type GetWorkspaceResponse struct {
	Headers map[string]*string        `json:"headers,omitempty" xml:"headers,omitempty" require:"true"`
	Body    *GetWorkspaceResponseBody `json:"body,omitempty" xml:"body,omitempty" require:"true"`
}

func (s GetWorkspaceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetWorkspaceResponse) GoString() string {
	return s.String()
}

func (s *GetWorkspaceResponse) SetHeaders(v map[string]*string) *GetWorkspaceResponse {
	s.Headers = v
	return s
}

func (s *GetWorkspaceResponse) SetBody(v *GetWorkspaceResponseBody) *GetWorkspaceResponse {
	s.Body = v
	return s
}

type SearchWorkspaceDocsHeaders struct {
	CommonHeaders           map[string]*string `json:"commonHeaders,omitempty" xml:"commonHeaders,omitempty"`
	XAcsDingtalkAccessToken *string            `json:"x-acs-dingtalk-access-token,omitempty" xml:"x-acs-dingtalk-access-token,omitempty"`
}

func (s SearchWorkspaceDocsHeaders) String() string {
	return tea.Prettify(s)
}

func (s SearchWorkspaceDocsHeaders) GoString() string {
	return s.String()
}

func (s *SearchWorkspaceDocsHeaders) SetCommonHeaders(v map[string]*string) *SearchWorkspaceDocsHeaders {
	s.CommonHeaders = v
	return s
}

func (s *SearchWorkspaceDocsHeaders) SetXAcsDingtalkAccessToken(v string) *SearchWorkspaceDocsHeaders {
	s.XAcsDingtalkAccessToken = &v
	return s
}

type SearchWorkspaceDocsRequest struct {
	// 发起操作用户unionId
	OperatorId *string `json:"operatorId,omitempty" xml:"operatorId,omitempty"`
	// 搜索关键字
	Keyword *string `json:"keyword,omitempty" xml:"keyword,omitempty"`
	// 搜索数量
	Size *int32 `json:"size,omitempty" xml:"size,omitempty"`
	// 翻页Id
	LoadMoreId *string `json:"loadMoreId,omitempty" xml:"loadMoreId,omitempty"`
}

func (s SearchWorkspaceDocsRequest) String() string {
	return tea.Prettify(s)
}

func (s SearchWorkspaceDocsRequest) GoString() string {
	return s.String()
}

func (s *SearchWorkspaceDocsRequest) SetOperatorId(v string) *SearchWorkspaceDocsRequest {
	s.OperatorId = &v
	return s
}

func (s *SearchWorkspaceDocsRequest) SetKeyword(v string) *SearchWorkspaceDocsRequest {
	s.Keyword = &v
	return s
}

func (s *SearchWorkspaceDocsRequest) SetSize(v int32) *SearchWorkspaceDocsRequest {
	s.Size = &v
	return s
}

func (s *SearchWorkspaceDocsRequest) SetLoadMoreId(v string) *SearchWorkspaceDocsRequest {
	s.LoadMoreId = &v
	return s
}

type SearchWorkspaceDocsResponseBody struct {
	// 是否还有可搜索内容
	HasMore    *bool                                  `json:"hasMore,omitempty" xml:"hasMore,omitempty"`
	LoadMoreId *string                                `json:"loadMoreId,omitempty" xml:"loadMoreId,omitempty"`
	Docs       []*SearchWorkspaceDocsResponseBodyDocs `json:"docs,omitempty" xml:"docs,omitempty" type:"Repeated"`
}

func (s SearchWorkspaceDocsResponseBody) String() string {
	return tea.Prettify(s)
}

func (s SearchWorkspaceDocsResponseBody) GoString() string {
	return s.String()
}

func (s *SearchWorkspaceDocsResponseBody) SetHasMore(v bool) *SearchWorkspaceDocsResponseBody {
	s.HasMore = &v
	return s
}

func (s *SearchWorkspaceDocsResponseBody) SetLoadMoreId(v string) *SearchWorkspaceDocsResponseBody {
	s.LoadMoreId = &v
	return s
}

func (s *SearchWorkspaceDocsResponseBody) SetDocs(v []*SearchWorkspaceDocsResponseBodyDocs) *SearchWorkspaceDocsResponseBody {
	s.Docs = v
	return s
}

type SearchWorkspaceDocsResponseBodyDocs struct {
	NodeBO      *SearchWorkspaceDocsResponseBodyDocsNodeBO      `json:"nodeBO,omitempty" xml:"nodeBO,omitempty" type:"Struct"`
	WorkspaceBO *SearchWorkspaceDocsResponseBodyDocsWorkspaceBO `json:"workspaceBO,omitempty" xml:"workspaceBO,omitempty" type:"Struct"`
}

func (s SearchWorkspaceDocsResponseBodyDocs) String() string {
	return tea.Prettify(s)
}

func (s SearchWorkspaceDocsResponseBodyDocs) GoString() string {
	return s.String()
}

func (s *SearchWorkspaceDocsResponseBodyDocs) SetNodeBO(v *SearchWorkspaceDocsResponseBodyDocsNodeBO) *SearchWorkspaceDocsResponseBodyDocs {
	s.NodeBO = v
	return s
}

func (s *SearchWorkspaceDocsResponseBodyDocs) SetWorkspaceBO(v *SearchWorkspaceDocsResponseBodyDocsWorkspaceBO) *SearchWorkspaceDocsResponseBodyDocs {
	s.WorkspaceBO = v
	return s
}

type SearchWorkspaceDocsResponseBodyDocsNodeBO struct {
	// 节点名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 节点Id
	NodeId *string `json:"nodeId,omitempty" xml:"nodeId,omitempty"`
	// 节点打开url
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 最近编辑时间
	LastEditTime *int64 `json:"lastEditTime,omitempty" xml:"lastEditTime,omitempty"`
}

func (s SearchWorkspaceDocsResponseBodyDocsNodeBO) String() string {
	return tea.Prettify(s)
}

func (s SearchWorkspaceDocsResponseBodyDocsNodeBO) GoString() string {
	return s.String()
}

func (s *SearchWorkspaceDocsResponseBodyDocsNodeBO) SetName(v string) *SearchWorkspaceDocsResponseBodyDocsNodeBO {
	s.Name = &v
	return s
}

func (s *SearchWorkspaceDocsResponseBodyDocsNodeBO) SetNodeId(v string) *SearchWorkspaceDocsResponseBodyDocsNodeBO {
	s.NodeId = &v
	return s
}

func (s *SearchWorkspaceDocsResponseBodyDocsNodeBO) SetUrl(v string) *SearchWorkspaceDocsResponseBodyDocsNodeBO {
	s.Url = &v
	return s
}

func (s *SearchWorkspaceDocsResponseBodyDocsNodeBO) SetLastEditTime(v int64) *SearchWorkspaceDocsResponseBodyDocsNodeBO {
	s.LastEditTime = &v
	return s
}

type SearchWorkspaceDocsResponseBodyDocsWorkspaceBO struct {
	// 团队空间Id
	WorkspaceId *string `json:"workspaceId,omitempty" xml:"workspaceId,omitempty"`
	// 团队空间名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s SearchWorkspaceDocsResponseBodyDocsWorkspaceBO) String() string {
	return tea.Prettify(s)
}

func (s SearchWorkspaceDocsResponseBodyDocsWorkspaceBO) GoString() string {
	return s.String()
}

func (s *SearchWorkspaceDocsResponseBodyDocsWorkspaceBO) SetWorkspaceId(v string) *SearchWorkspaceDocsResponseBodyDocsWorkspaceBO {
	s.WorkspaceId = &v
	return s
}

func (s *SearchWorkspaceDocsResponseBodyDocsWorkspaceBO) SetName(v string) *SearchWorkspaceDocsResponseBodyDocsWorkspaceBO {
	s.Name = &v
	return s
}

type SearchWorkspaceDocsResponse struct {
	Headers map[string]*string               `json:"headers,omitempty" xml:"headers,omitempty" require:"true"`
	Body    *SearchWorkspaceDocsResponseBody `json:"body,omitempty" xml:"body,omitempty" require:"true"`
}

func (s SearchWorkspaceDocsResponse) String() string {
	return tea.Prettify(s)
}

func (s SearchWorkspaceDocsResponse) GoString() string {
	return s.String()
}

func (s *SearchWorkspaceDocsResponse) SetHeaders(v map[string]*string) *SearchWorkspaceDocsResponse {
	s.Headers = v
	return s
}

func (s *SearchWorkspaceDocsResponse) SetBody(v *SearchWorkspaceDocsResponseBody) *SearchWorkspaceDocsResponse {
	s.Body = v
	return s
}

type BatchGetWorkspacesHeaders struct {
	CommonHeaders           map[string]*string `json:"commonHeaders,omitempty" xml:"commonHeaders,omitempty"`
	XAcsDingtalkAccessToken *string            `json:"x-acs-dingtalk-access-token,omitempty" xml:"x-acs-dingtalk-access-token,omitempty"`
}

func (s BatchGetWorkspacesHeaders) String() string {
	return tea.Prettify(s)
}

func (s BatchGetWorkspacesHeaders) GoString() string {
	return s.String()
}

func (s *BatchGetWorkspacesHeaders) SetCommonHeaders(v map[string]*string) *BatchGetWorkspacesHeaders {
	s.CommonHeaders = v
	return s
}

func (s *BatchGetWorkspacesHeaders) SetXAcsDingtalkAccessToken(v string) *BatchGetWorkspacesHeaders {
	s.XAcsDingtalkAccessToken = &v
	return s
}

type BatchGetWorkspacesRequest struct {
	// 操作用户unionId
	OperatorId *string `json:"operatorId,omitempty" xml:"operatorId,omitempty"`
	// 是否查询最近访问文档
	IncludeRecent *bool `json:"includeRecent,omitempty" xml:"includeRecent,omitempty"`
	// 待查询空间Id
	WorkspaceIds        []*string `json:"workspaceIds,omitempty" xml:"workspaceIds,omitempty" type:"Repeated"`
	DingOrgId           *int64    `json:"dingOrgId,omitempty" xml:"dingOrgId,omitempty"`
	DingIsvOrgId        *int64    `json:"dingIsvOrgId,omitempty" xml:"dingIsvOrgId,omitempty"`
	DingUid             *int64    `json:"dingUid,omitempty" xml:"dingUid,omitempty"`
	DingAccessTokenType *string   `json:"dingAccessTokenType,omitempty" xml:"dingAccessTokenType,omitempty"`
}

func (s BatchGetWorkspacesRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchGetWorkspacesRequest) GoString() string {
	return s.String()
}

func (s *BatchGetWorkspacesRequest) SetOperatorId(v string) *BatchGetWorkspacesRequest {
	s.OperatorId = &v
	return s
}

func (s *BatchGetWorkspacesRequest) SetIncludeRecent(v bool) *BatchGetWorkspacesRequest {
	s.IncludeRecent = &v
	return s
}

func (s *BatchGetWorkspacesRequest) SetWorkspaceIds(v []*string) *BatchGetWorkspacesRequest {
	s.WorkspaceIds = v
	return s
}

func (s *BatchGetWorkspacesRequest) SetDingOrgId(v int64) *BatchGetWorkspacesRequest {
	s.DingOrgId = &v
	return s
}

func (s *BatchGetWorkspacesRequest) SetDingIsvOrgId(v int64) *BatchGetWorkspacesRequest {
	s.DingIsvOrgId = &v
	return s
}

func (s *BatchGetWorkspacesRequest) SetDingUid(v int64) *BatchGetWorkspacesRequest {
	s.DingUid = &v
	return s
}

func (s *BatchGetWorkspacesRequest) SetDingAccessTokenType(v string) *BatchGetWorkspacesRequest {
	s.DingAccessTokenType = &v
	return s
}

type BatchGetWorkspacesResponseBody struct {
	// workspace信息
	Workspaces []*BatchGetWorkspacesResponseBodyWorkspaces `json:"workspaces,omitempty" xml:"workspaces,omitempty" type:"Repeated"`
}

func (s BatchGetWorkspacesResponseBody) String() string {
	return tea.Prettify(s)
}

func (s BatchGetWorkspacesResponseBody) GoString() string {
	return s.String()
}

func (s *BatchGetWorkspacesResponseBody) SetWorkspaces(v []*BatchGetWorkspacesResponseBodyWorkspaces) *BatchGetWorkspacesResponseBody {
	s.Workspaces = v
	return s
}

type BatchGetWorkspacesResponseBodyWorkspaces struct {
	// 是否有访问团队空间权限
	HasPermission *bool `json:"hasPermission,omitempty" xml:"hasPermission,omitempty"`
	// 团队空间信息
	Workspace *BatchGetWorkspacesResponseBodyWorkspacesWorkspace `json:"workspace,omitempty" xml:"workspace,omitempty" type:"Struct"`
}

func (s BatchGetWorkspacesResponseBodyWorkspaces) String() string {
	return tea.Prettify(s)
}

func (s BatchGetWorkspacesResponseBodyWorkspaces) GoString() string {
	return s.String()
}

func (s *BatchGetWorkspacesResponseBodyWorkspaces) SetHasPermission(v bool) *BatchGetWorkspacesResponseBodyWorkspaces {
	s.HasPermission = &v
	return s
}

func (s *BatchGetWorkspacesResponseBodyWorkspaces) SetWorkspace(v *BatchGetWorkspacesResponseBodyWorkspacesWorkspace) *BatchGetWorkspacesResponseBodyWorkspaces {
	s.Workspace = v
	return s
}

type BatchGetWorkspacesResponseBodyWorkspacesWorkspace struct {
	// 团队空间Id
	WorkspaceId *string `json:"workspaceId,omitempty" xml:"workspaceId,omitempty"`
	// 团队空间名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 团队空间打开url
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 最近访问列表
	RecentList []*BatchGetWorkspacesResponseBodyWorkspacesWorkspaceRecentList `json:"recentList,omitempty" xml:"recentList,omitempty" type:"Repeated"`
	// 是否全员公开
	OrgPublished *bool `json:"orgPublished,omitempty" xml:"orgPublished,omitempty"`
}

func (s BatchGetWorkspacesResponseBodyWorkspacesWorkspace) String() string {
	return tea.Prettify(s)
}

func (s BatchGetWorkspacesResponseBodyWorkspacesWorkspace) GoString() string {
	return s.String()
}

func (s *BatchGetWorkspacesResponseBodyWorkspacesWorkspace) SetWorkspaceId(v string) *BatchGetWorkspacesResponseBodyWorkspacesWorkspace {
	s.WorkspaceId = &v
	return s
}

func (s *BatchGetWorkspacesResponseBodyWorkspacesWorkspace) SetName(v string) *BatchGetWorkspacesResponseBodyWorkspacesWorkspace {
	s.Name = &v
	return s
}

func (s *BatchGetWorkspacesResponseBodyWorkspacesWorkspace) SetUrl(v string) *BatchGetWorkspacesResponseBodyWorkspacesWorkspace {
	s.Url = &v
	return s
}

func (s *BatchGetWorkspacesResponseBodyWorkspacesWorkspace) SetRecentList(v []*BatchGetWorkspacesResponseBodyWorkspacesWorkspaceRecentList) *BatchGetWorkspacesResponseBodyWorkspacesWorkspace {
	s.RecentList = v
	return s
}

func (s *BatchGetWorkspacesResponseBodyWorkspacesWorkspace) SetOrgPublished(v bool) *BatchGetWorkspacesResponseBodyWorkspacesWorkspace {
	s.OrgPublished = &v
	return s
}

type BatchGetWorkspacesResponseBodyWorkspacesWorkspaceRecentList struct {
	// 文档Id
	NodeId *string `json:"nodeId,omitempty" xml:"nodeId,omitempty"`
	// 文档名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 文档打开url
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s BatchGetWorkspacesResponseBodyWorkspacesWorkspaceRecentList) String() string {
	return tea.Prettify(s)
}

func (s BatchGetWorkspacesResponseBodyWorkspacesWorkspaceRecentList) GoString() string {
	return s.String()
}

func (s *BatchGetWorkspacesResponseBodyWorkspacesWorkspaceRecentList) SetNodeId(v string) *BatchGetWorkspacesResponseBodyWorkspacesWorkspaceRecentList {
	s.NodeId = &v
	return s
}

func (s *BatchGetWorkspacesResponseBodyWorkspacesWorkspaceRecentList) SetName(v string) *BatchGetWorkspacesResponseBodyWorkspacesWorkspaceRecentList {
	s.Name = &v
	return s
}

func (s *BatchGetWorkspacesResponseBodyWorkspacesWorkspaceRecentList) SetUrl(v string) *BatchGetWorkspacesResponseBodyWorkspacesWorkspaceRecentList {
	s.Url = &v
	return s
}

type BatchGetWorkspacesResponse struct {
	Headers map[string]*string              `json:"headers,omitempty" xml:"headers,omitempty" require:"true"`
	Body    *BatchGetWorkspacesResponseBody `json:"body,omitempty" xml:"body,omitempty" require:"true"`
}

func (s BatchGetWorkspacesResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchGetWorkspacesResponse) GoString() string {
	return s.String()
}

func (s *BatchGetWorkspacesResponse) SetHeaders(v map[string]*string) *BatchGetWorkspacesResponse {
	s.Headers = v
	return s
}

func (s *BatchGetWorkspacesResponse) SetBody(v *BatchGetWorkspacesResponseBody) *BatchGetWorkspacesResponse {
	s.Body = v
	return s
}

type DeleteWorkspaceMembersHeaders struct {
	CommonHeaders           map[string]*string `json:"commonHeaders,omitempty" xml:"commonHeaders,omitempty"`
	XAcsDingtalkAccessToken *string            `json:"x-acs-dingtalk-access-token,omitempty" xml:"x-acs-dingtalk-access-token,omitempty"`
}

func (s DeleteWorkspaceMembersHeaders) String() string {
	return tea.Prettify(s)
}

func (s DeleteWorkspaceMembersHeaders) GoString() string {
	return s.String()
}

func (s *DeleteWorkspaceMembersHeaders) SetCommonHeaders(v map[string]*string) *DeleteWorkspaceMembersHeaders {
	s.CommonHeaders = v
	return s
}

func (s *DeleteWorkspaceMembersHeaders) SetXAcsDingtalkAccessToken(v string) *DeleteWorkspaceMembersHeaders {
	s.XAcsDingtalkAccessToken = &v
	return s
}

type DeleteWorkspaceMembersRequest struct {
	// 发起操作者unionId
	OperatorId *string `json:"operatorId,omitempty" xml:"operatorId,omitempty"`
	// 被操作用户组
	Members []*DeleteWorkspaceMembersRequestMembers `json:"members,omitempty" xml:"members,omitempty" type:"Repeated"`
}

func (s DeleteWorkspaceMembersRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteWorkspaceMembersRequest) GoString() string {
	return s.String()
}

func (s *DeleteWorkspaceMembersRequest) SetOperatorId(v string) *DeleteWorkspaceMembersRequest {
	s.OperatorId = &v
	return s
}

func (s *DeleteWorkspaceMembersRequest) SetMembers(v []*DeleteWorkspaceMembersRequestMembers) *DeleteWorkspaceMembersRequest {
	s.Members = v
	return s
}

type DeleteWorkspaceMembersRequestMembers struct {
	// 被操作用户unionId
	MemberId *string `json:"memberId,omitempty" xml:"memberId,omitempty"`
	// 用户类型
	MemberType *string `json:"memberType,omitempty" xml:"memberType,omitempty"`
}

func (s DeleteWorkspaceMembersRequestMembers) String() string {
	return tea.Prettify(s)
}

func (s DeleteWorkspaceMembersRequestMembers) GoString() string {
	return s.String()
}

func (s *DeleteWorkspaceMembersRequestMembers) SetMemberId(v string) *DeleteWorkspaceMembersRequestMembers {
	s.MemberId = &v
	return s
}

func (s *DeleteWorkspaceMembersRequestMembers) SetMemberType(v string) *DeleteWorkspaceMembersRequestMembers {
	s.MemberType = &v
	return s
}

type DeleteWorkspaceMembersResponse struct {
	Headers map[string]*string `json:"headers,omitempty" xml:"headers,omitempty" require:"true"`
}

func (s DeleteWorkspaceMembersResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteWorkspaceMembersResponse) GoString() string {
	return s.String()
}

func (s *DeleteWorkspaceMembersResponse) SetHeaders(v map[string]*string) *DeleteWorkspaceMembersResponse {
	s.Headers = v
	return s
}

type AddWorkspaceDocMembersHeaders struct {
	CommonHeaders           map[string]*string `json:"commonHeaders,omitempty" xml:"commonHeaders,omitempty"`
	XAcsDingtalkAccessToken *string            `json:"x-acs-dingtalk-access-token,omitempty" xml:"x-acs-dingtalk-access-token,omitempty"`
}

func (s AddWorkspaceDocMembersHeaders) String() string {
	return tea.Prettify(s)
}

func (s AddWorkspaceDocMembersHeaders) GoString() string {
	return s.String()
}

func (s *AddWorkspaceDocMembersHeaders) SetCommonHeaders(v map[string]*string) *AddWorkspaceDocMembersHeaders {
	s.CommonHeaders = v
	return s
}

func (s *AddWorkspaceDocMembersHeaders) SetXAcsDingtalkAccessToken(v string) *AddWorkspaceDocMembersHeaders {
	s.XAcsDingtalkAccessToken = &v
	return s
}

type AddWorkspaceDocMembersRequest struct {
	// 发起操作者unionId
	OperatorId *string `json:"operatorId,omitempty" xml:"operatorId,omitempty"`
	// 被操作用户组
	Members []*AddWorkspaceDocMembersRequestMembers `json:"members,omitempty" xml:"members,omitempty" type:"Repeated"`
}

func (s AddWorkspaceDocMembersRequest) String() string {
	return tea.Prettify(s)
}

func (s AddWorkspaceDocMembersRequest) GoString() string {
	return s.String()
}

func (s *AddWorkspaceDocMembersRequest) SetOperatorId(v string) *AddWorkspaceDocMembersRequest {
	s.OperatorId = &v
	return s
}

func (s *AddWorkspaceDocMembersRequest) SetMembers(v []*AddWorkspaceDocMembersRequestMembers) *AddWorkspaceDocMembersRequest {
	s.Members = v
	return s
}

type AddWorkspaceDocMembersRequestMembers struct {
	// 被操作用户unionId
	MemberId *string `json:"memberId,omitempty" xml:"memberId,omitempty"`
	// 用户类型
	MemberType *string `json:"memberType,omitempty" xml:"memberType,omitempty"`
	// 用户权限
	RoleType *string `json:"roleType,omitempty" xml:"roleType,omitempty"`
}

func (s AddWorkspaceDocMembersRequestMembers) String() string {
	return tea.Prettify(s)
}

func (s AddWorkspaceDocMembersRequestMembers) GoString() string {
	return s.String()
}

func (s *AddWorkspaceDocMembersRequestMembers) SetMemberId(v string) *AddWorkspaceDocMembersRequestMembers {
	s.MemberId = &v
	return s
}

func (s *AddWorkspaceDocMembersRequestMembers) SetMemberType(v string) *AddWorkspaceDocMembersRequestMembers {
	s.MemberType = &v
	return s
}

func (s *AddWorkspaceDocMembersRequestMembers) SetRoleType(v string) *AddWorkspaceDocMembersRequestMembers {
	s.RoleType = &v
	return s
}

type AddWorkspaceDocMembersResponse struct {
	Headers map[string]*string `json:"headers,omitempty" xml:"headers,omitempty" require:"true"`
}

func (s AddWorkspaceDocMembersResponse) String() string {
	return tea.Prettify(s)
}

func (s AddWorkspaceDocMembersResponse) GoString() string {
	return s.String()
}

func (s *AddWorkspaceDocMembersResponse) SetHeaders(v map[string]*string) *AddWorkspaceDocMembersResponse {
	s.Headers = v
	return s
}

type UpdateWorkspaceMembersHeaders struct {
	CommonHeaders           map[string]*string `json:"commonHeaders,omitempty" xml:"commonHeaders,omitempty"`
	XAcsDingtalkAccessToken *string            `json:"x-acs-dingtalk-access-token,omitempty" xml:"x-acs-dingtalk-access-token,omitempty"`
}

func (s UpdateWorkspaceMembersHeaders) String() string {
	return tea.Prettify(s)
}

func (s UpdateWorkspaceMembersHeaders) GoString() string {
	return s.String()
}

func (s *UpdateWorkspaceMembersHeaders) SetCommonHeaders(v map[string]*string) *UpdateWorkspaceMembersHeaders {
	s.CommonHeaders = v
	return s
}

func (s *UpdateWorkspaceMembersHeaders) SetXAcsDingtalkAccessToken(v string) *UpdateWorkspaceMembersHeaders {
	s.XAcsDingtalkAccessToken = &v
	return s
}

type UpdateWorkspaceMembersRequest struct {
	// 发起操作者unionId
	OperatorId *string `json:"operatorId,omitempty" xml:"operatorId,omitempty"`
	// 被操作用户组
	Members []*UpdateWorkspaceMembersRequestMembers `json:"members,omitempty" xml:"members,omitempty" type:"Repeated"`
}

func (s UpdateWorkspaceMembersRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateWorkspaceMembersRequest) GoString() string {
	return s.String()
}

func (s *UpdateWorkspaceMembersRequest) SetOperatorId(v string) *UpdateWorkspaceMembersRequest {
	s.OperatorId = &v
	return s
}

func (s *UpdateWorkspaceMembersRequest) SetMembers(v []*UpdateWorkspaceMembersRequestMembers) *UpdateWorkspaceMembersRequest {
	s.Members = v
	return s
}

type UpdateWorkspaceMembersRequestMembers struct {
	// 被操作用户unionId
	MemberId *string `json:"memberId,omitempty" xml:"memberId,omitempty"`
	// 用户类型
	MemberType *string `json:"memberType,omitempty" xml:"memberType,omitempty"`
	// 用户权限
	RoleType *string `json:"roleType,omitempty" xml:"roleType,omitempty"`
}

func (s UpdateWorkspaceMembersRequestMembers) String() string {
	return tea.Prettify(s)
}

func (s UpdateWorkspaceMembersRequestMembers) GoString() string {
	return s.String()
}

func (s *UpdateWorkspaceMembersRequestMembers) SetMemberId(v string) *UpdateWorkspaceMembersRequestMembers {
	s.MemberId = &v
	return s
}

func (s *UpdateWorkspaceMembersRequestMembers) SetMemberType(v string) *UpdateWorkspaceMembersRequestMembers {
	s.MemberType = &v
	return s
}

func (s *UpdateWorkspaceMembersRequestMembers) SetRoleType(v string) *UpdateWorkspaceMembersRequestMembers {
	s.RoleType = &v
	return s
}

type UpdateWorkspaceMembersResponse struct {
	Headers map[string]*string `json:"headers,omitempty" xml:"headers,omitempty" require:"true"`
}

func (s UpdateWorkspaceMembersResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateWorkspaceMembersResponse) GoString() string {
	return s.String()
}

func (s *UpdateWorkspaceMembersResponse) SetHeaders(v map[string]*string) *UpdateWorkspaceMembersResponse {
	s.Headers = v
	return s
}

type GetRelatedWorkspacesHeaders struct {
	CommonHeaders           map[string]*string `json:"commonHeaders,omitempty" xml:"commonHeaders,omitempty"`
	XAcsDingtalkAccessToken *string            `json:"x-acs-dingtalk-access-token,omitempty" xml:"x-acs-dingtalk-access-token,omitempty"`
}

func (s GetRelatedWorkspacesHeaders) String() string {
	return tea.Prettify(s)
}

func (s GetRelatedWorkspacesHeaders) GoString() string {
	return s.String()
}

func (s *GetRelatedWorkspacesHeaders) SetCommonHeaders(v map[string]*string) *GetRelatedWorkspacesHeaders {
	s.CommonHeaders = v
	return s
}

func (s *GetRelatedWorkspacesHeaders) SetXAcsDingtalkAccessToken(v string) *GetRelatedWorkspacesHeaders {
	s.XAcsDingtalkAccessToken = &v
	return s
}

type GetRelatedWorkspacesRequest struct {
	// 发起操作用户unionId
	OperatorId *string `json:"operatorId,omitempty" xml:"operatorId,omitempty"`
	// 是否查询最近访问文档列表
	IncludeRecent *bool `json:"includeRecent,omitempty" xml:"includeRecent,omitempty"`
}

func (s GetRelatedWorkspacesRequest) String() string {
	return tea.Prettify(s)
}

func (s GetRelatedWorkspacesRequest) GoString() string {
	return s.String()
}

func (s *GetRelatedWorkspacesRequest) SetOperatorId(v string) *GetRelatedWorkspacesRequest {
	s.OperatorId = &v
	return s
}

func (s *GetRelatedWorkspacesRequest) SetIncludeRecent(v bool) *GetRelatedWorkspacesRequest {
	s.IncludeRecent = &v
	return s
}

type GetRelatedWorkspacesResponseBody struct {
	// 团队空间结果集
	Workspaces []*GetRelatedWorkspacesResponseBodyWorkspaces `json:"workspaces,omitempty" xml:"workspaces,omitempty" type:"Repeated"`
}

func (s GetRelatedWorkspacesResponseBody) String() string {
	return tea.Prettify(s)
}

func (s GetRelatedWorkspacesResponseBody) GoString() string {
	return s.String()
}

func (s *GetRelatedWorkspacesResponseBody) SetWorkspaces(v []*GetRelatedWorkspacesResponseBodyWorkspaces) *GetRelatedWorkspacesResponseBody {
	s.Workspaces = v
	return s
}

type GetRelatedWorkspacesResponseBodyWorkspaces struct {
	// 团队空间Id
	WorkspaceId *string `json:"workspaceId,omitempty" xml:"workspaceId,omitempty"`
	// 团队空间打开url
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 团队空间是否被删除
	Deleted *bool   `json:"deleted,omitempty" xml:"deleted,omitempty"`
	Owner   *string `json:"owner,omitempty" xml:"owner,omitempty"`
	// 团队空间名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 团队空间最近访问文档列表
	RecentList []*GetRelatedWorkspacesResponseBodyWorkspacesRecentList `json:"recentList,omitempty" xml:"recentList,omitempty" type:"Repeated"`
}

func (s GetRelatedWorkspacesResponseBodyWorkspaces) String() string {
	return tea.Prettify(s)
}

func (s GetRelatedWorkspacesResponseBodyWorkspaces) GoString() string {
	return s.String()
}

func (s *GetRelatedWorkspacesResponseBodyWorkspaces) SetWorkspaceId(v string) *GetRelatedWorkspacesResponseBodyWorkspaces {
	s.WorkspaceId = &v
	return s
}

func (s *GetRelatedWorkspacesResponseBodyWorkspaces) SetUrl(v string) *GetRelatedWorkspacesResponseBodyWorkspaces {
	s.Url = &v
	return s
}

func (s *GetRelatedWorkspacesResponseBodyWorkspaces) SetDeleted(v bool) *GetRelatedWorkspacesResponseBodyWorkspaces {
	s.Deleted = &v
	return s
}

func (s *GetRelatedWorkspacesResponseBodyWorkspaces) SetOwner(v string) *GetRelatedWorkspacesResponseBodyWorkspaces {
	s.Owner = &v
	return s
}

func (s *GetRelatedWorkspacesResponseBodyWorkspaces) SetName(v string) *GetRelatedWorkspacesResponseBodyWorkspaces {
	s.Name = &v
	return s
}

func (s *GetRelatedWorkspacesResponseBodyWorkspaces) SetRecentList(v []*GetRelatedWorkspacesResponseBodyWorkspacesRecentList) *GetRelatedWorkspacesResponseBodyWorkspaces {
	s.RecentList = v
	return s
}

type GetRelatedWorkspacesResponseBodyWorkspacesRecentList struct {
	// 文档id
	NodeId *string `json:"nodeId,omitempty" xml:"nodeId,omitempty"`
	// 文档名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 文档打开url
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s GetRelatedWorkspacesResponseBodyWorkspacesRecentList) String() string {
	return tea.Prettify(s)
}

func (s GetRelatedWorkspacesResponseBodyWorkspacesRecentList) GoString() string {
	return s.String()
}

func (s *GetRelatedWorkspacesResponseBodyWorkspacesRecentList) SetNodeId(v string) *GetRelatedWorkspacesResponseBodyWorkspacesRecentList {
	s.NodeId = &v
	return s
}

func (s *GetRelatedWorkspacesResponseBodyWorkspacesRecentList) SetName(v string) *GetRelatedWorkspacesResponseBodyWorkspacesRecentList {
	s.Name = &v
	return s
}

func (s *GetRelatedWorkspacesResponseBodyWorkspacesRecentList) SetUrl(v string) *GetRelatedWorkspacesResponseBodyWorkspacesRecentList {
	s.Url = &v
	return s
}

type GetRelatedWorkspacesResponse struct {
	Headers map[string]*string                `json:"headers,omitempty" xml:"headers,omitempty" require:"true"`
	Body    *GetRelatedWorkspacesResponseBody `json:"body,omitempty" xml:"body,omitempty" require:"true"`
}

func (s GetRelatedWorkspacesResponse) String() string {
	return tea.Prettify(s)
}

func (s GetRelatedWorkspacesResponse) GoString() string {
	return s.String()
}

func (s *GetRelatedWorkspacesResponse) SetHeaders(v map[string]*string) *GetRelatedWorkspacesResponse {
	s.Headers = v
	return s
}

func (s *GetRelatedWorkspacesResponse) SetBody(v *GetRelatedWorkspacesResponseBody) *GetRelatedWorkspacesResponse {
	s.Body = v
	return s
}

type GetRecentEditDocsHeaders struct {
	CommonHeaders           map[string]*string `json:"commonHeaders,omitempty" xml:"commonHeaders,omitempty"`
	XAcsDingtalkAccessToken *string            `json:"x-acs-dingtalk-access-token,omitempty" xml:"x-acs-dingtalk-access-token,omitempty"`
}

func (s GetRecentEditDocsHeaders) String() string {
	return tea.Prettify(s)
}

func (s GetRecentEditDocsHeaders) GoString() string {
	return s.String()
}

func (s *GetRecentEditDocsHeaders) SetCommonHeaders(v map[string]*string) *GetRecentEditDocsHeaders {
	s.CommonHeaders = v
	return s
}

func (s *GetRecentEditDocsHeaders) SetXAcsDingtalkAccessToken(v string) *GetRecentEditDocsHeaders {
	s.XAcsDingtalkAccessToken = &v
	return s
}

type GetRecentEditDocsRequest struct {
	// 发起操作用户unionId
	OperatorId *string `json:"operatorId,omitempty" xml:"operatorId,omitempty"`
	// 查询size
	Size       *int32  `json:"size,omitempty" xml:"size,omitempty"`
	LoadMoreId *string `json:"loadMoreId,omitempty" xml:"loadMoreId,omitempty"`
}

func (s GetRecentEditDocsRequest) String() string {
	return tea.Prettify(s)
}

func (s GetRecentEditDocsRequest) GoString() string {
	return s.String()
}

func (s *GetRecentEditDocsRequest) SetOperatorId(v string) *GetRecentEditDocsRequest {
	s.OperatorId = &v
	return s
}

func (s *GetRecentEditDocsRequest) SetSize(v int32) *GetRecentEditDocsRequest {
	s.Size = &v
	return s
}

func (s *GetRecentEditDocsRequest) SetLoadMoreId(v string) *GetRecentEditDocsRequest {
	s.LoadMoreId = &v
	return s
}

type GetRecentEditDocsResponseBody struct {
	// 查询结果
	RecentList []*GetRecentEditDocsResponseBodyRecentList `json:"recentList,omitempty" xml:"recentList,omitempty" type:"Repeated"`
	LoadMoreId *string                                    `json:"loadMoreId,omitempty" xml:"loadMoreId,omitempty"`
}

func (s GetRecentEditDocsResponseBody) String() string {
	return tea.Prettify(s)
}

func (s GetRecentEditDocsResponseBody) GoString() string {
	return s.String()
}

func (s *GetRecentEditDocsResponseBody) SetRecentList(v []*GetRecentEditDocsResponseBodyRecentList) *GetRecentEditDocsResponseBody {
	s.RecentList = v
	return s
}

func (s *GetRecentEditDocsResponseBody) SetLoadMoreId(v string) *GetRecentEditDocsResponseBody {
	s.LoadMoreId = &v
	return s
}

type GetRecentEditDocsResponseBodyRecentList struct {
	// 文档信息
	NodeBO *GetRecentEditDocsResponseBodyRecentListNodeBO `json:"nodeBO,omitempty" xml:"nodeBO,omitempty" type:"Struct"`
	// 团队空间信息
	WorkspaceBO *GetRecentEditDocsResponseBodyRecentListWorkspaceBO `json:"workspaceBO,omitempty" xml:"workspaceBO,omitempty" type:"Struct"`
}

func (s GetRecentEditDocsResponseBodyRecentList) String() string {
	return tea.Prettify(s)
}

func (s GetRecentEditDocsResponseBodyRecentList) GoString() string {
	return s.String()
}

func (s *GetRecentEditDocsResponseBodyRecentList) SetNodeBO(v *GetRecentEditDocsResponseBodyRecentListNodeBO) *GetRecentEditDocsResponseBodyRecentList {
	s.NodeBO = v
	return s
}

func (s *GetRecentEditDocsResponseBodyRecentList) SetWorkspaceBO(v *GetRecentEditDocsResponseBodyRecentListWorkspaceBO) *GetRecentEditDocsResponseBodyRecentList {
	s.WorkspaceBO = v
	return s
}

type GetRecentEditDocsResponseBodyRecentListNodeBO struct {
	// 文档Id
	NodeId *string `json:"nodeId,omitempty" xml:"nodeId,omitempty"`
	// 文档名称
	NodeName *string `json:"nodeName,omitempty" xml:"nodeName,omitempty"`
	// 文档打开url
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 最后编辑时间
	LastEditTime *int64 `json:"lastEditTime,omitempty" xml:"lastEditTime,omitempty"`
}

func (s GetRecentEditDocsResponseBodyRecentListNodeBO) String() string {
	return tea.Prettify(s)
}

func (s GetRecentEditDocsResponseBodyRecentListNodeBO) GoString() string {
	return s.String()
}

func (s *GetRecentEditDocsResponseBodyRecentListNodeBO) SetNodeId(v string) *GetRecentEditDocsResponseBodyRecentListNodeBO {
	s.NodeId = &v
	return s
}

func (s *GetRecentEditDocsResponseBodyRecentListNodeBO) SetNodeName(v string) *GetRecentEditDocsResponseBodyRecentListNodeBO {
	s.NodeName = &v
	return s
}

func (s *GetRecentEditDocsResponseBodyRecentListNodeBO) SetUrl(v string) *GetRecentEditDocsResponseBodyRecentListNodeBO {
	s.Url = &v
	return s
}

func (s *GetRecentEditDocsResponseBodyRecentListNodeBO) SetLastEditTime(v int64) *GetRecentEditDocsResponseBodyRecentListNodeBO {
	s.LastEditTime = &v
	return s
}

type GetRecentEditDocsResponseBodyRecentListWorkspaceBO struct {
	// 团队空间Id
	WorkspaceId *string `json:"workspaceId,omitempty" xml:"workspaceId,omitempty"`
	// 团队空间名称
	WorkspaceName *string `json:"workspaceName,omitempty" xml:"workspaceName,omitempty"`
}

func (s GetRecentEditDocsResponseBodyRecentListWorkspaceBO) String() string {
	return tea.Prettify(s)
}

func (s GetRecentEditDocsResponseBodyRecentListWorkspaceBO) GoString() string {
	return s.String()
}

func (s *GetRecentEditDocsResponseBodyRecentListWorkspaceBO) SetWorkspaceId(v string) *GetRecentEditDocsResponseBodyRecentListWorkspaceBO {
	s.WorkspaceId = &v
	return s
}

func (s *GetRecentEditDocsResponseBodyRecentListWorkspaceBO) SetWorkspaceName(v string) *GetRecentEditDocsResponseBodyRecentListWorkspaceBO {
	s.WorkspaceName = &v
	return s
}

type GetRecentEditDocsResponse struct {
	Headers map[string]*string             `json:"headers,omitempty" xml:"headers,omitempty" require:"true"`
	Body    *GetRecentEditDocsResponseBody `json:"body,omitempty" xml:"body,omitempty" require:"true"`
}

func (s GetRecentEditDocsResponse) String() string {
	return tea.Prettify(s)
}

func (s GetRecentEditDocsResponse) GoString() string {
	return s.String()
}

func (s *GetRecentEditDocsResponse) SetHeaders(v map[string]*string) *GetRecentEditDocsResponse {
	s.Headers = v
	return s
}

func (s *GetRecentEditDocsResponse) SetBody(v *GetRecentEditDocsResponseBody) *GetRecentEditDocsResponse {
	s.Body = v
	return s
}

type AddWorkspaceMembersHeaders struct {
	CommonHeaders           map[string]*string `json:"commonHeaders,omitempty" xml:"commonHeaders,omitempty"`
	XAcsDingtalkAccessToken *string            `json:"x-acs-dingtalk-access-token,omitempty" xml:"x-acs-dingtalk-access-token,omitempty"`
}

func (s AddWorkspaceMembersHeaders) String() string {
	return tea.Prettify(s)
}

func (s AddWorkspaceMembersHeaders) GoString() string {
	return s.String()
}

func (s *AddWorkspaceMembersHeaders) SetCommonHeaders(v map[string]*string) *AddWorkspaceMembersHeaders {
	s.CommonHeaders = v
	return s
}

func (s *AddWorkspaceMembersHeaders) SetXAcsDingtalkAccessToken(v string) *AddWorkspaceMembersHeaders {
	s.XAcsDingtalkAccessToken = &v
	return s
}

type AddWorkspaceMembersRequest struct {
	// 发起操作者unionId
	OperatorId *string `json:"operatorId,omitempty" xml:"operatorId,omitempty"`
	// 被操作用户组
	Members []*AddWorkspaceMembersRequestMembers `json:"members,omitempty" xml:"members,omitempty" type:"Repeated"`
}

func (s AddWorkspaceMembersRequest) String() string {
	return tea.Prettify(s)
}

func (s AddWorkspaceMembersRequest) GoString() string {
	return s.String()
}

func (s *AddWorkspaceMembersRequest) SetOperatorId(v string) *AddWorkspaceMembersRequest {
	s.OperatorId = &v
	return s
}

func (s *AddWorkspaceMembersRequest) SetMembers(v []*AddWorkspaceMembersRequestMembers) *AddWorkspaceMembersRequest {
	s.Members = v
	return s
}

type AddWorkspaceMembersRequestMembers struct {
	// 被操作用户unionId
	MemberId *string `json:"memberId,omitempty" xml:"memberId,omitempty"`
	// 用户类型
	MemberType *string `json:"memberType,omitempty" xml:"memberType,omitempty"`
	// 用户权限
	RoleType *string `json:"roleType,omitempty" xml:"roleType,omitempty"`
}

func (s AddWorkspaceMembersRequestMembers) String() string {
	return tea.Prettify(s)
}

func (s AddWorkspaceMembersRequestMembers) GoString() string {
	return s.String()
}

func (s *AddWorkspaceMembersRequestMembers) SetMemberId(v string) *AddWorkspaceMembersRequestMembers {
	s.MemberId = &v
	return s
}

func (s *AddWorkspaceMembersRequestMembers) SetMemberType(v string) *AddWorkspaceMembersRequestMembers {
	s.MemberType = &v
	return s
}

func (s *AddWorkspaceMembersRequestMembers) SetRoleType(v string) *AddWorkspaceMembersRequestMembers {
	s.RoleType = &v
	return s
}

type AddWorkspaceMembersResponseBody struct {
	NotInOrgList []*string `json:"notInOrgList,omitempty" xml:"notInOrgList,omitempty" type:"Repeated"`
}

func (s AddWorkspaceMembersResponseBody) String() string {
	return tea.Prettify(s)
}

func (s AddWorkspaceMembersResponseBody) GoString() string {
	return s.String()
}

func (s *AddWorkspaceMembersResponseBody) SetNotInOrgList(v []*string) *AddWorkspaceMembersResponseBody {
	s.NotInOrgList = v
	return s
}

type AddWorkspaceMembersResponse struct {
	Headers map[string]*string               `json:"headers,omitempty" xml:"headers,omitempty" require:"true"`
	Body    *AddWorkspaceMembersResponseBody `json:"body,omitempty" xml:"body,omitempty" require:"true"`
}

func (s AddWorkspaceMembersResponse) String() string {
	return tea.Prettify(s)
}

func (s AddWorkspaceMembersResponse) GoString() string {
	return s.String()
}

func (s *AddWorkspaceMembersResponse) SetHeaders(v map[string]*string) *AddWorkspaceMembersResponse {
	s.Headers = v
	return s
}

func (s *AddWorkspaceMembersResponse) SetBody(v *AddWorkspaceMembersResponseBody) *AddWorkspaceMembersResponse {
	s.Body = v
	return s
}

type GetWorkspaceNodeHeaders struct {
	CommonHeaders           map[string]*string `json:"commonHeaders,omitempty" xml:"commonHeaders,omitempty"`
	XAcsDingtalkAccessToken *string            `json:"x-acs-dingtalk-access-token,omitempty" xml:"x-acs-dingtalk-access-token,omitempty"`
}

func (s GetWorkspaceNodeHeaders) String() string {
	return tea.Prettify(s)
}

func (s GetWorkspaceNodeHeaders) GoString() string {
	return s.String()
}

func (s *GetWorkspaceNodeHeaders) SetCommonHeaders(v map[string]*string) *GetWorkspaceNodeHeaders {
	s.CommonHeaders = v
	return s
}

func (s *GetWorkspaceNodeHeaders) SetXAcsDingtalkAccessToken(v string) *GetWorkspaceNodeHeaders {
	s.XAcsDingtalkAccessToken = &v
	return s
}

type GetWorkspaceNodeRequest struct {
	// 操作用户unionId
	OperatorId *string `json:"operatorId,omitempty" xml:"operatorId,omitempty"`
}

func (s GetWorkspaceNodeRequest) String() string {
	return tea.Prettify(s)
}

func (s GetWorkspaceNodeRequest) GoString() string {
	return s.String()
}

func (s *GetWorkspaceNodeRequest) SetOperatorId(v string) *GetWorkspaceNodeRequest {
	s.OperatorId = &v
	return s
}

type GetWorkspaceNodeResponseBody struct {
	// 节点信息
	NodeBO map[string]interface{} `json:"nodeBO,omitempty" xml:"nodeBO,omitempty"`
	// 节点所属团队空间信息
	WorkspaceBO map[string]interface{} `json:"workspaceBO,omitempty" xml:"workspaceBO,omitempty"`
	// 是否有权限
	HasPermission *bool `json:"hasPermission,omitempty" xml:"hasPermission,omitempty"`
}

func (s GetWorkspaceNodeResponseBody) String() string {
	return tea.Prettify(s)
}

func (s GetWorkspaceNodeResponseBody) GoString() string {
	return s.String()
}

func (s *GetWorkspaceNodeResponseBody) SetNodeBO(v map[string]interface{}) *GetWorkspaceNodeResponseBody {
	s.NodeBO = v
	return s
}

func (s *GetWorkspaceNodeResponseBody) SetWorkspaceBO(v map[string]interface{}) *GetWorkspaceNodeResponseBody {
	s.WorkspaceBO = v
	return s
}

func (s *GetWorkspaceNodeResponseBody) SetHasPermission(v bool) *GetWorkspaceNodeResponseBody {
	s.HasPermission = &v
	return s
}

type GetWorkspaceNodeResponse struct {
	Headers map[string]*string            `json:"headers,omitempty" xml:"headers,omitempty" require:"true"`
	Body    *GetWorkspaceNodeResponseBody `json:"body,omitempty" xml:"body,omitempty" require:"true"`
}

func (s GetWorkspaceNodeResponse) String() string {
	return tea.Prettify(s)
}

func (s GetWorkspaceNodeResponse) GoString() string {
	return s.String()
}

func (s *GetWorkspaceNodeResponse) SetHeaders(v map[string]*string) *GetWorkspaceNodeResponse {
	s.Headers = v
	return s
}

func (s *GetWorkspaceNodeResponse) SetBody(v *GetWorkspaceNodeResponseBody) *GetWorkspaceNodeResponse {
	s.Body = v
	return s
}

type Client struct {
	openapi.Client
}

func NewClient(config *openapi.Config) (*Client, error) {
	client := new(Client)
	err := client.Init(config)
	return client, err
}

func (client *Client) Init(config *openapi.Config) (_err error) {
	_err = client.Client.Init(config)
	if _err != nil {
		return _err
	}
	client.EndpointRule = tea.String("")
	if tea.BoolValue(util.Empty(client.Endpoint)) {
		client.Endpoint = tea.String("api.dingtalk.com")
	}

	return nil
}

func (client *Client) BatchGetWorkspaceDocs(request *BatchGetWorkspaceDocsRequest) (_result *BatchGetWorkspaceDocsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := &BatchGetWorkspaceDocsHeaders{}
	_result = &BatchGetWorkspaceDocsResponse{}
	_body, _err := client.BatchGetWorkspaceDocsWithOptions(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

func (client *Client) BatchGetWorkspaceDocsWithOptions(request *BatchGetWorkspaceDocsRequest, headers *BatchGetWorkspaceDocsHeaders, runtime *util.RuntimeOptions) (_result *BatchGetWorkspaceDocsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	body := map[string]interface{}{}
	if !tea.BoolValue(util.IsUnset(request.OperatorId)) {
		body["operatorId"] = request.OperatorId
	}

	if !tea.BoolValue(util.IsUnset(request.NodeIds)) {
		body["nodeIds"] = request.NodeIds
	}

	if !tea.BoolValue(util.IsUnset(request.DingIsvOrgId)) {
		body["dingIsvOrgId"] = request.DingIsvOrgId
	}

	if !tea.BoolValue(util.IsUnset(request.DingOrgId)) {
		body["dingOrgId"] = request.DingOrgId
	}

	if !tea.BoolValue(util.IsUnset(request.DingAccessTokenType)) {
		body["dingAccessTokenType"] = request.DingAccessTokenType
	}

	if !tea.BoolValue(util.IsUnset(request.DingUid)) {
		body["dingUid"] = request.DingUid
	}

	realHeaders := make(map[string]*string)
	if !tea.BoolValue(util.IsUnset(headers.CommonHeaders)) {
		realHeaders = headers.CommonHeaders
	}

	if !tea.BoolValue(util.IsUnset(headers.XAcsDingtalkAccessToken)) {
		realHeaders["x-acs-dingtalk-access-token"] = headers.XAcsDingtalkAccessToken
	}

	req := &openapi.OpenApiRequest{
		Headers: realHeaders,
		Body:    openapiutil.ParseToMap(body),
	}
	_result = &BatchGetWorkspaceDocsResponse{}
	_body, _err := client.DoROARequest(tea.String("BatchGetWorkspaceDocs"), tea.String("doc_1.0"), tea.String("HTTP"), tea.String("POST"), tea.String("AK"), tea.String("/v1.0/doc/workspaces/docs/infos/query"), tea.String("json"), req, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

func (client *Client) UpdateWorkspaceDocMembers(workspaceId *string, nodeId *string, request *UpdateWorkspaceDocMembersRequest) (_result *UpdateWorkspaceDocMembersResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := &UpdateWorkspaceDocMembersHeaders{}
	_result = &UpdateWorkspaceDocMembersResponse{}
	_body, _err := client.UpdateWorkspaceDocMembersWithOptions(workspaceId, nodeId, request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

func (client *Client) UpdateWorkspaceDocMembersWithOptions(workspaceId *string, nodeId *string, request *UpdateWorkspaceDocMembersRequest, headers *UpdateWorkspaceDocMembersHeaders, runtime *util.RuntimeOptions) (_result *UpdateWorkspaceDocMembersResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	body := map[string]interface{}{}
	if !tea.BoolValue(util.IsUnset(request.OperatorId)) {
		body["operatorId"] = request.OperatorId
	}

	if !tea.BoolValue(util.IsUnset(request.Members)) {
		body["members"] = request.Members
	}

	realHeaders := make(map[string]*string)
	if !tea.BoolValue(util.IsUnset(headers.CommonHeaders)) {
		realHeaders = headers.CommonHeaders
	}

	if !tea.BoolValue(util.IsUnset(headers.XAcsDingtalkAccessToken)) {
		realHeaders["x-acs-dingtalk-access-token"] = headers.XAcsDingtalkAccessToken
	}

	req := &openapi.OpenApiRequest{
		Headers: realHeaders,
		Body:    openapiutil.ParseToMap(body),
	}
	_result = &UpdateWorkspaceDocMembersResponse{}
	_body, _err := client.DoROARequest(tea.String("UpdateWorkspaceDocMembers"), tea.String("doc_1.0"), tea.String("HTTP"), tea.String("PUT"), tea.String("AK"), tea.String("/v1.0/doc/workspaces/"+tea.StringValue(workspaceId)+"/docs/"+tea.StringValue(nodeId)+"/members"), tea.String("none"), req, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

func (client *Client) CreateWorkspaceDoc(workspaceId *string, request *CreateWorkspaceDocRequest) (_result *CreateWorkspaceDocResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := &CreateWorkspaceDocHeaders{}
	_result = &CreateWorkspaceDocResponse{}
	_body, _err := client.CreateWorkspaceDocWithOptions(workspaceId, request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

func (client *Client) CreateWorkspaceDocWithOptions(workspaceId *string, request *CreateWorkspaceDocRequest, headers *CreateWorkspaceDocHeaders, runtime *util.RuntimeOptions) (_result *CreateWorkspaceDocResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	body := map[string]interface{}{}
	if !tea.BoolValue(util.IsUnset(request.Name)) {
		body["name"] = request.Name
	}

	if !tea.BoolValue(util.IsUnset(request.DocType)) {
		body["docType"] = request.DocType
	}

	if !tea.BoolValue(util.IsUnset(request.OperatorId)) {
		body["operatorId"] = request.OperatorId
	}

	realHeaders := make(map[string]*string)
	if !tea.BoolValue(util.IsUnset(headers.CommonHeaders)) {
		realHeaders = headers.CommonHeaders
	}

	if !tea.BoolValue(util.IsUnset(headers.XAcsDingtalkAccessToken)) {
		realHeaders["x-acs-dingtalk-access-token"] = headers.XAcsDingtalkAccessToken
	}

	req := &openapi.OpenApiRequest{
		Headers: realHeaders,
		Body:    openapiutil.ParseToMap(body),
	}
	_result = &CreateWorkspaceDocResponse{}
	_body, _err := client.DoROARequest(tea.String("CreateWorkspaceDoc"), tea.String("doc_1.0"), tea.String("HTTP"), tea.String("POST"), tea.String("AK"), tea.String("/v1.0/doc/workspaces/"+tea.StringValue(workspaceId)+"/docs"), tea.String("json"), req, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

func (client *Client) CreateWorkspace(request *CreateWorkspaceRequest) (_result *CreateWorkspaceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := &CreateWorkspaceHeaders{}
	_result = &CreateWorkspaceResponse{}
	_body, _err := client.CreateWorkspaceWithOptions(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

func (client *Client) CreateWorkspaceWithOptions(request *CreateWorkspaceRequest, headers *CreateWorkspaceHeaders, runtime *util.RuntimeOptions) (_result *CreateWorkspaceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	body := map[string]interface{}{}
	if !tea.BoolValue(util.IsUnset(request.Name)) {
		body["name"] = request.Name
	}

	if !tea.BoolValue(util.IsUnset(request.Description)) {
		body["description"] = request.Description
	}

	if !tea.BoolValue(util.IsUnset(request.OperatorId)) {
		body["operatorId"] = request.OperatorId
	}

	if !tea.BoolValue(util.IsUnset(request.DingOrgId)) {
		body["dingOrgId"] = request.DingOrgId
	}

	if !tea.BoolValue(util.IsUnset(request.DingUid)) {
		body["dingUid"] = request.DingUid
	}

	if !tea.BoolValue(util.IsUnset(request.DingAccessTokenType)) {
		body["dingAccessTokenType"] = request.DingAccessTokenType
	}

	if !tea.BoolValue(util.IsUnset(request.DingIsvOrgId)) {
		body["dingIsvOrgId"] = request.DingIsvOrgId
	}

	realHeaders := make(map[string]*string)
	if !tea.BoolValue(util.IsUnset(headers.CommonHeaders)) {
		realHeaders = headers.CommonHeaders
	}

	if !tea.BoolValue(util.IsUnset(headers.XAcsDingtalkAccessToken)) {
		realHeaders["x-acs-dingtalk-access-token"] = headers.XAcsDingtalkAccessToken
	}

	req := &openapi.OpenApiRequest{
		Headers: realHeaders,
		Body:    openapiutil.ParseToMap(body),
	}
	_result = &CreateWorkspaceResponse{}
	_body, _err := client.DoROARequest(tea.String("CreateWorkspace"), tea.String("doc_1.0"), tea.String("HTTP"), tea.String("POST"), tea.String("AK"), tea.String("/v1.0/doc/workspaces"), tea.String("json"), req, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

func (client *Client) DeleteWorkspaceDocMembers(workspaceId *string, nodeId *string, request *DeleteWorkspaceDocMembersRequest) (_result *DeleteWorkspaceDocMembersResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := &DeleteWorkspaceDocMembersHeaders{}
	_result = &DeleteWorkspaceDocMembersResponse{}
	_body, _err := client.DeleteWorkspaceDocMembersWithOptions(workspaceId, nodeId, request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

func (client *Client) DeleteWorkspaceDocMembersWithOptions(workspaceId *string, nodeId *string, request *DeleteWorkspaceDocMembersRequest, headers *DeleteWorkspaceDocMembersHeaders, runtime *util.RuntimeOptions) (_result *DeleteWorkspaceDocMembersResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	body := map[string]interface{}{}
	if !tea.BoolValue(util.IsUnset(request.OperatorId)) {
		body["operatorId"] = request.OperatorId
	}

	if !tea.BoolValue(util.IsUnset(request.Members)) {
		body["members"] = request.Members
	}

	realHeaders := make(map[string]*string)
	if !tea.BoolValue(util.IsUnset(headers.CommonHeaders)) {
		realHeaders = headers.CommonHeaders
	}

	if !tea.BoolValue(util.IsUnset(headers.XAcsDingtalkAccessToken)) {
		realHeaders["x-acs-dingtalk-access-token"] = headers.XAcsDingtalkAccessToken
	}

	req := &openapi.OpenApiRequest{
		Headers: realHeaders,
		Body:    openapiutil.ParseToMap(body),
	}
	_result = &DeleteWorkspaceDocMembersResponse{}
	_body, _err := client.DoROARequest(tea.String("DeleteWorkspaceDocMembers"), tea.String("doc_1.0"), tea.String("HTTP"), tea.String("POST"), tea.String("AK"), tea.String("/v1.0/doc/workspaces/"+tea.StringValue(workspaceId)+"/docs/"+tea.StringValue(nodeId)+"/members/remove"), tea.String("none"), req, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

func (client *Client) GetWorkspace(workspaceId *string) (_result *GetWorkspaceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := &GetWorkspaceHeaders{}
	_result = &GetWorkspaceResponse{}
	_body, _err := client.GetWorkspaceWithOptions(workspaceId, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

func (client *Client) GetWorkspaceWithOptions(workspaceId *string, headers *GetWorkspaceHeaders, runtime *util.RuntimeOptions) (_result *GetWorkspaceResponse, _err error) {
	realHeaders := make(map[string]*string)
	if !tea.BoolValue(util.IsUnset(headers.CommonHeaders)) {
		realHeaders = headers.CommonHeaders
	}

	if !tea.BoolValue(util.IsUnset(headers.XAcsDingtalkAccessToken)) {
		realHeaders["x-acs-dingtalk-access-token"] = headers.XAcsDingtalkAccessToken
	}

	req := &openapi.OpenApiRequest{
		Headers: realHeaders,
	}
	_result = &GetWorkspaceResponse{}
	_body, _err := client.DoROARequest(tea.String("GetWorkspace"), tea.String("doc_1.0"), tea.String("HTTP"), tea.String("GET"), tea.String("AK"), tea.String("/v1.0/doc/workspaces/"+tea.StringValue(workspaceId)), tea.String("json"), req, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

func (client *Client) SearchWorkspaceDocs(workspaceId *string, request *SearchWorkspaceDocsRequest) (_result *SearchWorkspaceDocsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := &SearchWorkspaceDocsHeaders{}
	_result = &SearchWorkspaceDocsResponse{}
	_body, _err := client.SearchWorkspaceDocsWithOptions(workspaceId, request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

func (client *Client) SearchWorkspaceDocsWithOptions(workspaceId *string, request *SearchWorkspaceDocsRequest, headers *SearchWorkspaceDocsHeaders, runtime *util.RuntimeOptions) (_result *SearchWorkspaceDocsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	query := map[string]interface{}{}
	if !tea.BoolValue(util.IsUnset(request.OperatorId)) {
		query["operatorId"] = request.OperatorId
	}

	if !tea.BoolValue(util.IsUnset(request.Keyword)) {
		query["keyword"] = request.Keyword
	}

	if !tea.BoolValue(util.IsUnset(request.Size)) {
		query["size"] = request.Size
	}

	if !tea.BoolValue(util.IsUnset(request.LoadMoreId)) {
		query["loadMoreId"] = request.LoadMoreId
	}

	realHeaders := make(map[string]*string)
	if !tea.BoolValue(util.IsUnset(headers.CommonHeaders)) {
		realHeaders = headers.CommonHeaders
	}

	if !tea.BoolValue(util.IsUnset(headers.XAcsDingtalkAccessToken)) {
		realHeaders["x-acs-dingtalk-access-token"] = headers.XAcsDingtalkAccessToken
	}

	req := &openapi.OpenApiRequest{
		Headers: realHeaders,
		Query:   openapiutil.Query(query),
	}
	_result = &SearchWorkspaceDocsResponse{}
	_body, _err := client.DoROARequest(tea.String("SearchWorkspaceDocs"), tea.String("doc_1.0"), tea.String("HTTP"), tea.String("GET"), tea.String("AK"), tea.String("/v1.0/doc/workspaces/"+tea.StringValue(workspaceId)+"/docs"), tea.String("json"), req, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

func (client *Client) BatchGetWorkspaces(request *BatchGetWorkspacesRequest) (_result *BatchGetWorkspacesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := &BatchGetWorkspacesHeaders{}
	_result = &BatchGetWorkspacesResponse{}
	_body, _err := client.BatchGetWorkspacesWithOptions(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

func (client *Client) BatchGetWorkspacesWithOptions(request *BatchGetWorkspacesRequest, headers *BatchGetWorkspacesHeaders, runtime *util.RuntimeOptions) (_result *BatchGetWorkspacesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	body := map[string]interface{}{}
	if !tea.BoolValue(util.IsUnset(request.OperatorId)) {
		body["operatorId"] = request.OperatorId
	}

	if !tea.BoolValue(util.IsUnset(request.IncludeRecent)) {
		body["includeRecent"] = request.IncludeRecent
	}

	if !tea.BoolValue(util.IsUnset(request.WorkspaceIds)) {
		body["workspaceIds"] = request.WorkspaceIds
	}

	if !tea.BoolValue(util.IsUnset(request.DingOrgId)) {
		body["dingOrgId"] = request.DingOrgId
	}

	if !tea.BoolValue(util.IsUnset(request.DingIsvOrgId)) {
		body["dingIsvOrgId"] = request.DingIsvOrgId
	}

	if !tea.BoolValue(util.IsUnset(request.DingUid)) {
		body["dingUid"] = request.DingUid
	}

	if !tea.BoolValue(util.IsUnset(request.DingAccessTokenType)) {
		body["dingAccessTokenType"] = request.DingAccessTokenType
	}

	realHeaders := make(map[string]*string)
	if !tea.BoolValue(util.IsUnset(headers.CommonHeaders)) {
		realHeaders = headers.CommonHeaders
	}

	if !tea.BoolValue(util.IsUnset(headers.XAcsDingtalkAccessToken)) {
		realHeaders["x-acs-dingtalk-access-token"] = headers.XAcsDingtalkAccessToken
	}

	req := &openapi.OpenApiRequest{
		Headers: realHeaders,
		Body:    openapiutil.ParseToMap(body),
	}
	_result = &BatchGetWorkspacesResponse{}
	_body, _err := client.DoROARequest(tea.String("BatchGetWorkspaces"), tea.String("doc_1.0"), tea.String("HTTP"), tea.String("POST"), tea.String("AK"), tea.String("/v1.0/doc/workspaces/infos/query"), tea.String("json"), req, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

func (client *Client) DeleteWorkspaceMembers(workspaceId *string, request *DeleteWorkspaceMembersRequest) (_result *DeleteWorkspaceMembersResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := &DeleteWorkspaceMembersHeaders{}
	_result = &DeleteWorkspaceMembersResponse{}
	_body, _err := client.DeleteWorkspaceMembersWithOptions(workspaceId, request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

func (client *Client) DeleteWorkspaceMembersWithOptions(workspaceId *string, request *DeleteWorkspaceMembersRequest, headers *DeleteWorkspaceMembersHeaders, runtime *util.RuntimeOptions) (_result *DeleteWorkspaceMembersResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	body := map[string]interface{}{}
	if !tea.BoolValue(util.IsUnset(request.OperatorId)) {
		body["operatorId"] = request.OperatorId
	}

	if !tea.BoolValue(util.IsUnset(request.Members)) {
		body["members"] = request.Members
	}

	realHeaders := make(map[string]*string)
	if !tea.BoolValue(util.IsUnset(headers.CommonHeaders)) {
		realHeaders = headers.CommonHeaders
	}

	if !tea.BoolValue(util.IsUnset(headers.XAcsDingtalkAccessToken)) {
		realHeaders["x-acs-dingtalk-access-token"] = headers.XAcsDingtalkAccessToken
	}

	req := &openapi.OpenApiRequest{
		Headers: realHeaders,
		Body:    openapiutil.ParseToMap(body),
	}
	_result = &DeleteWorkspaceMembersResponse{}
	_body, _err := client.DoROARequest(tea.String("DeleteWorkspaceMembers"), tea.String("doc_1.0"), tea.String("HTTP"), tea.String("POST"), tea.String("AK"), tea.String("/v1.0/doc/workspaces/"+tea.StringValue(workspaceId)+"/members/remove"), tea.String("none"), req, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

func (client *Client) AddWorkspaceDocMembers(workspaceId *string, nodeId *string, request *AddWorkspaceDocMembersRequest) (_result *AddWorkspaceDocMembersResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := &AddWorkspaceDocMembersHeaders{}
	_result = &AddWorkspaceDocMembersResponse{}
	_body, _err := client.AddWorkspaceDocMembersWithOptions(workspaceId, nodeId, request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

func (client *Client) AddWorkspaceDocMembersWithOptions(workspaceId *string, nodeId *string, request *AddWorkspaceDocMembersRequest, headers *AddWorkspaceDocMembersHeaders, runtime *util.RuntimeOptions) (_result *AddWorkspaceDocMembersResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	body := map[string]interface{}{}
	if !tea.BoolValue(util.IsUnset(request.OperatorId)) {
		body["operatorId"] = request.OperatorId
	}

	if !tea.BoolValue(util.IsUnset(request.Members)) {
		body["members"] = request.Members
	}

	realHeaders := make(map[string]*string)
	if !tea.BoolValue(util.IsUnset(headers.CommonHeaders)) {
		realHeaders = headers.CommonHeaders
	}

	if !tea.BoolValue(util.IsUnset(headers.XAcsDingtalkAccessToken)) {
		realHeaders["x-acs-dingtalk-access-token"] = headers.XAcsDingtalkAccessToken
	}

	req := &openapi.OpenApiRequest{
		Headers: realHeaders,
		Body:    openapiutil.ParseToMap(body),
	}
	_result = &AddWorkspaceDocMembersResponse{}
	_body, _err := client.DoROARequest(tea.String("AddWorkspaceDocMembers"), tea.String("doc_1.0"), tea.String("HTTP"), tea.String("POST"), tea.String("AK"), tea.String("/v1.0/doc/workspaces/"+tea.StringValue(workspaceId)+"/docs/"+tea.StringValue(nodeId)+"/members"), tea.String("none"), req, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

func (client *Client) UpdateWorkspaceMembers(workspaceId *string, request *UpdateWorkspaceMembersRequest) (_result *UpdateWorkspaceMembersResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := &UpdateWorkspaceMembersHeaders{}
	_result = &UpdateWorkspaceMembersResponse{}
	_body, _err := client.UpdateWorkspaceMembersWithOptions(workspaceId, request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

func (client *Client) UpdateWorkspaceMembersWithOptions(workspaceId *string, request *UpdateWorkspaceMembersRequest, headers *UpdateWorkspaceMembersHeaders, runtime *util.RuntimeOptions) (_result *UpdateWorkspaceMembersResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	body := map[string]interface{}{}
	if !tea.BoolValue(util.IsUnset(request.OperatorId)) {
		body["operatorId"] = request.OperatorId
	}

	if !tea.BoolValue(util.IsUnset(request.Members)) {
		body["members"] = request.Members
	}

	realHeaders := make(map[string]*string)
	if !tea.BoolValue(util.IsUnset(headers.CommonHeaders)) {
		realHeaders = headers.CommonHeaders
	}

	if !tea.BoolValue(util.IsUnset(headers.XAcsDingtalkAccessToken)) {
		realHeaders["x-acs-dingtalk-access-token"] = headers.XAcsDingtalkAccessToken
	}

	req := &openapi.OpenApiRequest{
		Headers: realHeaders,
		Body:    openapiutil.ParseToMap(body),
	}
	_result = &UpdateWorkspaceMembersResponse{}
	_body, _err := client.DoROARequest(tea.String("UpdateWorkspaceMembers"), tea.String("doc_1.0"), tea.String("HTTP"), tea.String("PUT"), tea.String("AK"), tea.String("/v1.0/doc/workspaces/"+tea.StringValue(workspaceId)+"/members"), tea.String("none"), req, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

func (client *Client) GetRelatedWorkspaces(request *GetRelatedWorkspacesRequest) (_result *GetRelatedWorkspacesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := &GetRelatedWorkspacesHeaders{}
	_result = &GetRelatedWorkspacesResponse{}
	_body, _err := client.GetRelatedWorkspacesWithOptions(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

func (client *Client) GetRelatedWorkspacesWithOptions(request *GetRelatedWorkspacesRequest, headers *GetRelatedWorkspacesHeaders, runtime *util.RuntimeOptions) (_result *GetRelatedWorkspacesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	query := map[string]interface{}{}
	if !tea.BoolValue(util.IsUnset(request.OperatorId)) {
		query["operatorId"] = request.OperatorId
	}

	if !tea.BoolValue(util.IsUnset(request.IncludeRecent)) {
		query["includeRecent"] = request.IncludeRecent
	}

	realHeaders := make(map[string]*string)
	if !tea.BoolValue(util.IsUnset(headers.CommonHeaders)) {
		realHeaders = headers.CommonHeaders
	}

	if !tea.BoolValue(util.IsUnset(headers.XAcsDingtalkAccessToken)) {
		realHeaders["x-acs-dingtalk-access-token"] = headers.XAcsDingtalkAccessToken
	}

	req := &openapi.OpenApiRequest{
		Headers: realHeaders,
		Query:   openapiutil.Query(query),
	}
	_result = &GetRelatedWorkspacesResponse{}
	_body, _err := client.DoROARequest(tea.String("GetRelatedWorkspaces"), tea.String("doc_1.0"), tea.String("HTTP"), tea.String("GET"), tea.String("AK"), tea.String("/v1.0/doc/workspaces"), tea.String("json"), req, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

func (client *Client) GetRecentEditDocs(request *GetRecentEditDocsRequest) (_result *GetRecentEditDocsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := &GetRecentEditDocsHeaders{}
	_result = &GetRecentEditDocsResponse{}
	_body, _err := client.GetRecentEditDocsWithOptions(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

func (client *Client) GetRecentEditDocsWithOptions(request *GetRecentEditDocsRequest, headers *GetRecentEditDocsHeaders, runtime *util.RuntimeOptions) (_result *GetRecentEditDocsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	query := map[string]interface{}{}
	if !tea.BoolValue(util.IsUnset(request.OperatorId)) {
		query["operatorId"] = request.OperatorId
	}

	if !tea.BoolValue(util.IsUnset(request.Size)) {
		query["size"] = request.Size
	}

	if !tea.BoolValue(util.IsUnset(request.LoadMoreId)) {
		query["loadMoreId"] = request.LoadMoreId
	}

	realHeaders := make(map[string]*string)
	if !tea.BoolValue(util.IsUnset(headers.CommonHeaders)) {
		realHeaders = headers.CommonHeaders
	}

	if !tea.BoolValue(util.IsUnset(headers.XAcsDingtalkAccessToken)) {
		realHeaders["x-acs-dingtalk-access-token"] = headers.XAcsDingtalkAccessToken
	}

	req := &openapi.OpenApiRequest{
		Headers: realHeaders,
		Query:   openapiutil.Query(query),
	}
	_result = &GetRecentEditDocsResponse{}
	_body, _err := client.DoROARequest(tea.String("GetRecentEditDocs"), tea.String("doc_1.0"), tea.String("HTTP"), tea.String("GET"), tea.String("AK"), tea.String("/v1.0/doc/workspaces/docs/recentEditDocs"), tea.String("json"), req, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

func (client *Client) AddWorkspaceMembers(workspaceId *string, request *AddWorkspaceMembersRequest) (_result *AddWorkspaceMembersResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := &AddWorkspaceMembersHeaders{}
	_result = &AddWorkspaceMembersResponse{}
	_body, _err := client.AddWorkspaceMembersWithOptions(workspaceId, request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

func (client *Client) AddWorkspaceMembersWithOptions(workspaceId *string, request *AddWorkspaceMembersRequest, headers *AddWorkspaceMembersHeaders, runtime *util.RuntimeOptions) (_result *AddWorkspaceMembersResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	body := map[string]interface{}{}
	if !tea.BoolValue(util.IsUnset(request.OperatorId)) {
		body["operatorId"] = request.OperatorId
	}

	if !tea.BoolValue(util.IsUnset(request.Members)) {
		body["members"] = request.Members
	}

	realHeaders := make(map[string]*string)
	if !tea.BoolValue(util.IsUnset(headers.CommonHeaders)) {
		realHeaders = headers.CommonHeaders
	}

	if !tea.BoolValue(util.IsUnset(headers.XAcsDingtalkAccessToken)) {
		realHeaders["x-acs-dingtalk-access-token"] = headers.XAcsDingtalkAccessToken
	}

	req := &openapi.OpenApiRequest{
		Headers: realHeaders,
		Body:    openapiutil.ParseToMap(body),
	}
	_result = &AddWorkspaceMembersResponse{}
	_body, _err := client.DoROARequest(tea.String("AddWorkspaceMembers"), tea.String("doc_1.0"), tea.String("HTTP"), tea.String("POST"), tea.String("AK"), tea.String("/v1.0/doc/workspaces/"+tea.StringValue(workspaceId)+"/members"), tea.String("json"), req, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

func (client *Client) GetWorkspaceNode(workspaceId *string, nodeId *string, request *GetWorkspaceNodeRequest) (_result *GetWorkspaceNodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := &GetWorkspaceNodeHeaders{}
	_result = &GetWorkspaceNodeResponse{}
	_body, _err := client.GetWorkspaceNodeWithOptions(workspaceId, nodeId, request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

func (client *Client) GetWorkspaceNodeWithOptions(workspaceId *string, nodeId *string, request *GetWorkspaceNodeRequest, headers *GetWorkspaceNodeHeaders, runtime *util.RuntimeOptions) (_result *GetWorkspaceNodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	query := map[string]interface{}{}
	if !tea.BoolValue(util.IsUnset(request.OperatorId)) {
		query["operatorId"] = request.OperatorId
	}

	realHeaders := make(map[string]*string)
	if !tea.BoolValue(util.IsUnset(headers.CommonHeaders)) {
		realHeaders = headers.CommonHeaders
	}

	if !tea.BoolValue(util.IsUnset(headers.XAcsDingtalkAccessToken)) {
		realHeaders["x-acs-dingtalk-access-token"] = headers.XAcsDingtalkAccessToken
	}

	req := &openapi.OpenApiRequest{
		Headers: realHeaders,
		Query:   openapiutil.Query(query),
	}
	_result = &GetWorkspaceNodeResponse{}
	_body, _err := client.DoROARequest(tea.String("GetWorkspaceNode"), tea.String("doc_1.0"), tea.String("HTTP"), tea.String("GET"), tea.String("AK"), tea.String("/v1.0/doc/workspaces/"+tea.StringValue(workspaceId)+"/docs/"+tea.StringValue(nodeId)), tea.String("json"), req, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
