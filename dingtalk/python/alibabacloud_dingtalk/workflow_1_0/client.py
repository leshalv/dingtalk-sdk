# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.core import TeaCore

from alibabacloud_gateway_spi.client import Client as SPIClient
from alibabacloud_tea_openapi.client import Client as OpenApiClient
from alibabacloud_tea_openapi import models as open_api_models
from alibabacloud_gateway_dingtalk.client import Client as GatewayClientClient
from alibabacloud_tea_util.client import Client as UtilClient
from alibabacloud_dingtalk.workflow_1_0 import models as dingtalkworkflow__1__0_models
from alibabacloud_tea_util import models as util_models
from alibabacloud_openapi_util.client import Client as OpenApiUtilClient


class Client(OpenApiClient):
    """
    *\
    """
    _client: SPIClient = None

    def __init__(
        self, 
        config: open_api_models.Config,
    ):
        super().__init__(config)
        self._client = GatewayClientClient()
        self._spi = self._client
        self._endpoint_rule = ''
        if UtilClient.empty(self._endpoint):
            self._endpoint = 'api.dingtalk.com'

    def add_approve_dentry_auth_with_options(
        self,
        request: dingtalkworkflow__1__0_models.AddApproveDentryAuthRequest,
        headers: dingtalkworkflow__1__0_models.AddApproveDentryAuthHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.AddApproveDentryAuthResponse:
        """
        @summary 授权下载审批钉盘文件
        
        @param request: AddApproveDentryAuthRequest
        @param headers: AddApproveDentryAuthHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: AddApproveDentryAuthResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.file_infos):
            body['fileInfos'] = request.file_infos
        if not UtilClient.is_unset(request.user_id):
            body['userId'] = request.user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='AddApproveDentryAuth',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processInstances/spaces/files/authDownload',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.AddApproveDentryAuthResponse(),
            self.execute(params, req, runtime)
        )

    async def add_approve_dentry_auth_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.AddApproveDentryAuthRequest,
        headers: dingtalkworkflow__1__0_models.AddApproveDentryAuthHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.AddApproveDentryAuthResponse:
        """
        @summary 授权下载审批钉盘文件
        
        @param request: AddApproveDentryAuthRequest
        @param headers: AddApproveDentryAuthHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: AddApproveDentryAuthResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.file_infos):
            body['fileInfos'] = request.file_infos
        if not UtilClient.is_unset(request.user_id):
            body['userId'] = request.user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='AddApproveDentryAuth',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processInstances/spaces/files/authDownload',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.AddApproveDentryAuthResponse(),
            await self.execute_async(params, req, runtime)
        )

    def add_approve_dentry_auth(
        self,
        request: dingtalkworkflow__1__0_models.AddApproveDentryAuthRequest,
    ) -> dingtalkworkflow__1__0_models.AddApproveDentryAuthResponse:
        """
        @summary 授权下载审批钉盘文件
        
        @param request: AddApproveDentryAuthRequest
        @return: AddApproveDentryAuthResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.AddApproveDentryAuthHeaders()
        return self.add_approve_dentry_auth_with_options(request, headers, runtime)

    async def add_approve_dentry_auth_async(
        self,
        request: dingtalkworkflow__1__0_models.AddApproveDentryAuthRequest,
    ) -> dingtalkworkflow__1__0_models.AddApproveDentryAuthResponse:
        """
        @summary 授权下载审批钉盘文件
        
        @param request: AddApproveDentryAuthRequest
        @return: AddApproveDentryAuthResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.AddApproveDentryAuthHeaders()
        return await self.add_approve_dentry_auth_with_options_async(request, headers, runtime)

    def add_process_instance_comment_with_options(
        self,
        request: dingtalkworkflow__1__0_models.AddProcessInstanceCommentRequest,
        headers: dingtalkworkflow__1__0_models.AddProcessInstanceCommentHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.AddProcessInstanceCommentResponse:
        """
        @summary 添加审批评论
        
        @param request: AddProcessInstanceCommentRequest
        @param headers: AddProcessInstanceCommentHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: AddProcessInstanceCommentResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.comment_user_id):
            body['commentUserId'] = request.comment_user_id
        if not UtilClient.is_unset(request.file):
            body['file'] = request.file
        if not UtilClient.is_unset(request.process_instance_id):
            body['processInstanceId'] = request.process_instance_id
        if not UtilClient.is_unset(request.text):
            body['text'] = request.text
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='AddProcessInstanceComment',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processInstances/comments',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.AddProcessInstanceCommentResponse(),
            self.execute(params, req, runtime)
        )

    async def add_process_instance_comment_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.AddProcessInstanceCommentRequest,
        headers: dingtalkworkflow__1__0_models.AddProcessInstanceCommentHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.AddProcessInstanceCommentResponse:
        """
        @summary 添加审批评论
        
        @param request: AddProcessInstanceCommentRequest
        @param headers: AddProcessInstanceCommentHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: AddProcessInstanceCommentResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.comment_user_id):
            body['commentUserId'] = request.comment_user_id
        if not UtilClient.is_unset(request.file):
            body['file'] = request.file
        if not UtilClient.is_unset(request.process_instance_id):
            body['processInstanceId'] = request.process_instance_id
        if not UtilClient.is_unset(request.text):
            body['text'] = request.text
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='AddProcessInstanceComment',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processInstances/comments',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.AddProcessInstanceCommentResponse(),
            await self.execute_async(params, req, runtime)
        )

    def add_process_instance_comment(
        self,
        request: dingtalkworkflow__1__0_models.AddProcessInstanceCommentRequest,
    ) -> dingtalkworkflow__1__0_models.AddProcessInstanceCommentResponse:
        """
        @summary 添加审批评论
        
        @param request: AddProcessInstanceCommentRequest
        @return: AddProcessInstanceCommentResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.AddProcessInstanceCommentHeaders()
        return self.add_process_instance_comment_with_options(request, headers, runtime)

    async def add_process_instance_comment_async(
        self,
        request: dingtalkworkflow__1__0_models.AddProcessInstanceCommentRequest,
    ) -> dingtalkworkflow__1__0_models.AddProcessInstanceCommentResponse:
        """
        @summary 添加审批评论
        
        @param request: AddProcessInstanceCommentRequest
        @return: AddProcessInstanceCommentResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.AddProcessInstanceCommentHeaders()
        return await self.add_process_instance_comment_with_options_async(request, headers, runtime)

    def batch_execute_process_instances_with_options(
        self,
        request: dingtalkworkflow__1__0_models.BatchExecuteProcessInstancesRequest,
        headers: dingtalkworkflow__1__0_models.BatchExecuteProcessInstancesHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.BatchExecuteProcessInstancesResponse:
        """
        @summary 批量同意或拒绝审批任务
        
        @param request: BatchExecuteProcessInstancesRequest
        @param headers: BatchExecuteProcessInstancesHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: BatchExecuteProcessInstancesResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.actioner_user_id):
            body['actionerUserId'] = request.actioner_user_id
        if not UtilClient.is_unset(request.remark):
            body['remark'] = request.remark
        if not UtilClient.is_unset(request.result):
            body['result'] = request.result
        if not UtilClient.is_unset(request.task_info_list):
            body['taskInfoList'] = request.task_info_list
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='BatchExecuteProcessInstances',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processInstances/batchExecute',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.BatchExecuteProcessInstancesResponse(),
            self.execute(params, req, runtime)
        )

    async def batch_execute_process_instances_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.BatchExecuteProcessInstancesRequest,
        headers: dingtalkworkflow__1__0_models.BatchExecuteProcessInstancesHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.BatchExecuteProcessInstancesResponse:
        """
        @summary 批量同意或拒绝审批任务
        
        @param request: BatchExecuteProcessInstancesRequest
        @param headers: BatchExecuteProcessInstancesHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: BatchExecuteProcessInstancesResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.actioner_user_id):
            body['actionerUserId'] = request.actioner_user_id
        if not UtilClient.is_unset(request.remark):
            body['remark'] = request.remark
        if not UtilClient.is_unset(request.result):
            body['result'] = request.result
        if not UtilClient.is_unset(request.task_info_list):
            body['taskInfoList'] = request.task_info_list
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='BatchExecuteProcessInstances',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processInstances/batchExecute',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.BatchExecuteProcessInstancesResponse(),
            await self.execute_async(params, req, runtime)
        )

    def batch_execute_process_instances(
        self,
        request: dingtalkworkflow__1__0_models.BatchExecuteProcessInstancesRequest,
    ) -> dingtalkworkflow__1__0_models.BatchExecuteProcessInstancesResponse:
        """
        @summary 批量同意或拒绝审批任务
        
        @param request: BatchExecuteProcessInstancesRequest
        @return: BatchExecuteProcessInstancesResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.BatchExecuteProcessInstancesHeaders()
        return self.batch_execute_process_instances_with_options(request, headers, runtime)

    async def batch_execute_process_instances_async(
        self,
        request: dingtalkworkflow__1__0_models.BatchExecuteProcessInstancesRequest,
    ) -> dingtalkworkflow__1__0_models.BatchExecuteProcessInstancesResponse:
        """
        @summary 批量同意或拒绝审批任务
        
        @param request: BatchExecuteProcessInstancesRequest
        @return: BatchExecuteProcessInstancesResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.BatchExecuteProcessInstancesHeaders()
        return await self.batch_execute_process_instances_with_options_async(request, headers, runtime)

    def batch_update_process_instance_with_options(
        self,
        request: dingtalkworkflow__1__0_models.BatchUpdateProcessInstanceRequest,
        headers: dingtalkworkflow__1__0_models.BatchUpdateProcessInstanceHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.BatchUpdateProcessInstanceResponse:
        """
        @summary 批量更新实例状态
        
        @param request: BatchUpdateProcessInstanceRequest
        @param headers: BatchUpdateProcessInstanceHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: BatchUpdateProcessInstanceResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.update_process_instance_requests):
            body['updateProcessInstanceRequests'] = request.update_process_instance_requests
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='BatchUpdateProcessInstance',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processCentres/instances/batch',
            method='PUT',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.BatchUpdateProcessInstanceResponse(),
            self.execute(params, req, runtime)
        )

    async def batch_update_process_instance_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.BatchUpdateProcessInstanceRequest,
        headers: dingtalkworkflow__1__0_models.BatchUpdateProcessInstanceHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.BatchUpdateProcessInstanceResponse:
        """
        @summary 批量更新实例状态
        
        @param request: BatchUpdateProcessInstanceRequest
        @param headers: BatchUpdateProcessInstanceHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: BatchUpdateProcessInstanceResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.update_process_instance_requests):
            body['updateProcessInstanceRequests'] = request.update_process_instance_requests
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='BatchUpdateProcessInstance',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processCentres/instances/batch',
            method='PUT',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.BatchUpdateProcessInstanceResponse(),
            await self.execute_async(params, req, runtime)
        )

    def batch_update_process_instance(
        self,
        request: dingtalkworkflow__1__0_models.BatchUpdateProcessInstanceRequest,
    ) -> dingtalkworkflow__1__0_models.BatchUpdateProcessInstanceResponse:
        """
        @summary 批量更新实例状态
        
        @param request: BatchUpdateProcessInstanceRequest
        @return: BatchUpdateProcessInstanceResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.BatchUpdateProcessInstanceHeaders()
        return self.batch_update_process_instance_with_options(request, headers, runtime)

    async def batch_update_process_instance_async(
        self,
        request: dingtalkworkflow__1__0_models.BatchUpdateProcessInstanceRequest,
    ) -> dingtalkworkflow__1__0_models.BatchUpdateProcessInstanceResponse:
        """
        @summary 批量更新实例状态
        
        @param request: BatchUpdateProcessInstanceRequest
        @return: BatchUpdateProcessInstanceResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.BatchUpdateProcessInstanceHeaders()
        return await self.batch_update_process_instance_with_options_async(request, headers, runtime)

    def cancel_integrated_task_with_options(
        self,
        request: dingtalkworkflow__1__0_models.CancelIntegratedTaskRequest,
        headers: dingtalkworkflow__1__0_models.CancelIntegratedTaskHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.CancelIntegratedTaskResponse:
        """
        @summary 批量取消流程中心待处理任务
        
        @param request: CancelIntegratedTaskRequest
        @param headers: CancelIntegratedTaskHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: CancelIntegratedTaskResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.activity_id):
            body['activityId'] = request.activity_id
        if not UtilClient.is_unset(request.activity_ids):
            body['activityIds'] = request.activity_ids
        if not UtilClient.is_unset(request.process_instance_id):
            body['processInstanceId'] = request.process_instance_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='CancelIntegratedTask',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processCentres/tasks/cancel',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.CancelIntegratedTaskResponse(),
            self.execute(params, req, runtime)
        )

    async def cancel_integrated_task_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.CancelIntegratedTaskRequest,
        headers: dingtalkworkflow__1__0_models.CancelIntegratedTaskHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.CancelIntegratedTaskResponse:
        """
        @summary 批量取消流程中心待处理任务
        
        @param request: CancelIntegratedTaskRequest
        @param headers: CancelIntegratedTaskHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: CancelIntegratedTaskResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.activity_id):
            body['activityId'] = request.activity_id
        if not UtilClient.is_unset(request.activity_ids):
            body['activityIds'] = request.activity_ids
        if not UtilClient.is_unset(request.process_instance_id):
            body['processInstanceId'] = request.process_instance_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='CancelIntegratedTask',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processCentres/tasks/cancel',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.CancelIntegratedTaskResponse(),
            await self.execute_async(params, req, runtime)
        )

    def cancel_integrated_task(
        self,
        request: dingtalkworkflow__1__0_models.CancelIntegratedTaskRequest,
    ) -> dingtalkworkflow__1__0_models.CancelIntegratedTaskResponse:
        """
        @summary 批量取消流程中心待处理任务
        
        @param request: CancelIntegratedTaskRequest
        @return: CancelIntegratedTaskResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.CancelIntegratedTaskHeaders()
        return self.cancel_integrated_task_with_options(request, headers, runtime)

    async def cancel_integrated_task_async(
        self,
        request: dingtalkworkflow__1__0_models.CancelIntegratedTaskRequest,
    ) -> dingtalkworkflow__1__0_models.CancelIntegratedTaskResponse:
        """
        @summary 批量取消流程中心待处理任务
        
        @param request: CancelIntegratedTaskRequest
        @return: CancelIntegratedTaskResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.CancelIntegratedTaskHeaders()
        return await self.cancel_integrated_task_with_options_async(request, headers, runtime)

    def clean_process_data_with_options(
        self,
        request: dingtalkworkflow__1__0_models.CleanProcessDataRequest,
        headers: dingtalkworkflow__1__0_models.CleanProcessDataHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.CleanProcessDataResponse:
        """
        @summary 清理审批数据
        
        @param request: CleanProcessDataRequest
        @param headers: CleanProcessDataHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: CleanProcessDataResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.corp_id):
            body['corpId'] = request.corp_id
        if not UtilClient.is_unset(request.process_code):
            body['processCode'] = request.process_code
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='CleanProcessData',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processes/clean',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.CleanProcessDataResponse(),
            self.execute(params, req, runtime)
        )

    async def clean_process_data_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.CleanProcessDataRequest,
        headers: dingtalkworkflow__1__0_models.CleanProcessDataHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.CleanProcessDataResponse:
        """
        @summary 清理审批数据
        
        @param request: CleanProcessDataRequest
        @param headers: CleanProcessDataHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: CleanProcessDataResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.corp_id):
            body['corpId'] = request.corp_id
        if not UtilClient.is_unset(request.process_code):
            body['processCode'] = request.process_code
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='CleanProcessData',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processes/clean',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.CleanProcessDataResponse(),
            await self.execute_async(params, req, runtime)
        )

    def clean_process_data(
        self,
        request: dingtalkworkflow__1__0_models.CleanProcessDataRequest,
    ) -> dingtalkworkflow__1__0_models.CleanProcessDataResponse:
        """
        @summary 清理审批数据
        
        @param request: CleanProcessDataRequest
        @return: CleanProcessDataResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.CleanProcessDataHeaders()
        return self.clean_process_data_with_options(request, headers, runtime)

    async def clean_process_data_async(
        self,
        request: dingtalkworkflow__1__0_models.CleanProcessDataRequest,
    ) -> dingtalkworkflow__1__0_models.CleanProcessDataResponse:
        """
        @summary 清理审批数据
        
        @param request: CleanProcessDataRequest
        @return: CleanProcessDataResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.CleanProcessDataHeaders()
        return await self.clean_process_data_with_options_async(request, headers, runtime)

    def copy_process_with_options(
        self,
        request: dingtalkworkflow__1__0_models.CopyProcessRequest,
        headers: dingtalkworkflow__1__0_models.CopyProcessHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.CopyProcessResponse:
        """
        @summary 复制审批流
        
        @param request: CopyProcessRequest
        @param headers: CopyProcessHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: CopyProcessResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.copy_options):
            body['copyOptions'] = request.copy_options
        if not UtilClient.is_unset(request.source_corp_id):
            body['sourceCorpId'] = request.source_corp_id
        if not UtilClient.is_unset(request.source_process_volist):
            body['sourceProcessVOList'] = request.source_process_volist
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='CopyProcess',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processes/copy',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.CopyProcessResponse(),
            self.execute(params, req, runtime)
        )

    async def copy_process_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.CopyProcessRequest,
        headers: dingtalkworkflow__1__0_models.CopyProcessHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.CopyProcessResponse:
        """
        @summary 复制审批流
        
        @param request: CopyProcessRequest
        @param headers: CopyProcessHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: CopyProcessResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.copy_options):
            body['copyOptions'] = request.copy_options
        if not UtilClient.is_unset(request.source_corp_id):
            body['sourceCorpId'] = request.source_corp_id
        if not UtilClient.is_unset(request.source_process_volist):
            body['sourceProcessVOList'] = request.source_process_volist
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='CopyProcess',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processes/copy',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.CopyProcessResponse(),
            await self.execute_async(params, req, runtime)
        )

    def copy_process(
        self,
        request: dingtalkworkflow__1__0_models.CopyProcessRequest,
    ) -> dingtalkworkflow__1__0_models.CopyProcessResponse:
        """
        @summary 复制审批流
        
        @param request: CopyProcessRequest
        @return: CopyProcessResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.CopyProcessHeaders()
        return self.copy_process_with_options(request, headers, runtime)

    async def copy_process_async(
        self,
        request: dingtalkworkflow__1__0_models.CopyProcessRequest,
    ) -> dingtalkworkflow__1__0_models.CopyProcessResponse:
        """
        @summary 复制审批流
        
        @param request: CopyProcessRequest
        @return: CopyProcessResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.CopyProcessHeaders()
        return await self.copy_process_with_options_async(request, headers, runtime)

    def create_integrated_task_with_options(
        self,
        request: dingtalkworkflow__1__0_models.CreateIntegratedTaskRequest,
        headers: dingtalkworkflow__1__0_models.CreateIntegratedTaskHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.CreateIntegratedTaskResponse:
        """
        @summary 创建流程中心待处理任务
        
        @param request: CreateIntegratedTaskRequest
        @param headers: CreateIntegratedTaskHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: CreateIntegratedTaskResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.activity_id):
            body['activityId'] = request.activity_id
        if not UtilClient.is_unset(request.feature_config):
            body['featureConfig'] = request.feature_config
        if not UtilClient.is_unset(request.process_instance_id):
            body['processInstanceId'] = request.process_instance_id
        if not UtilClient.is_unset(request.tasks):
            body['tasks'] = request.tasks
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='CreateIntegratedTask',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processCentres/tasks',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.CreateIntegratedTaskResponse(),
            self.execute(params, req, runtime)
        )

    async def create_integrated_task_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.CreateIntegratedTaskRequest,
        headers: dingtalkworkflow__1__0_models.CreateIntegratedTaskHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.CreateIntegratedTaskResponse:
        """
        @summary 创建流程中心待处理任务
        
        @param request: CreateIntegratedTaskRequest
        @param headers: CreateIntegratedTaskHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: CreateIntegratedTaskResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.activity_id):
            body['activityId'] = request.activity_id
        if not UtilClient.is_unset(request.feature_config):
            body['featureConfig'] = request.feature_config
        if not UtilClient.is_unset(request.process_instance_id):
            body['processInstanceId'] = request.process_instance_id
        if not UtilClient.is_unset(request.tasks):
            body['tasks'] = request.tasks
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='CreateIntegratedTask',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processCentres/tasks',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.CreateIntegratedTaskResponse(),
            await self.execute_async(params, req, runtime)
        )

    def create_integrated_task(
        self,
        request: dingtalkworkflow__1__0_models.CreateIntegratedTaskRequest,
    ) -> dingtalkworkflow__1__0_models.CreateIntegratedTaskResponse:
        """
        @summary 创建流程中心待处理任务
        
        @param request: CreateIntegratedTaskRequest
        @return: CreateIntegratedTaskResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.CreateIntegratedTaskHeaders()
        return self.create_integrated_task_with_options(request, headers, runtime)

    async def create_integrated_task_async(
        self,
        request: dingtalkworkflow__1__0_models.CreateIntegratedTaskRequest,
    ) -> dingtalkworkflow__1__0_models.CreateIntegratedTaskResponse:
        """
        @summary 创建流程中心待处理任务
        
        @param request: CreateIntegratedTaskRequest
        @return: CreateIntegratedTaskResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.CreateIntegratedTaskHeaders()
        return await self.create_integrated_task_with_options_async(request, headers, runtime)

    def delete_dir_with_options(
        self,
        request: dingtalkworkflow__1__0_models.DeleteDirRequest,
        headers: dingtalkworkflow__1__0_models.DeleteDirHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.DeleteDirResponse:
        """
        @summary 删除分组
        
        @param request: DeleteDirRequest
        @param headers: DeleteDirHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: DeleteDirResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.dir_id):
            query['dirId'] = request.dir_id
        if not UtilClient.is_unset(request.operate_user_id):
            query['operateUserId'] = request.operate_user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='DeleteDir',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processCentres/directories',
            method='DELETE',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.DeleteDirResponse(),
            self.execute(params, req, runtime)
        )

    async def delete_dir_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.DeleteDirRequest,
        headers: dingtalkworkflow__1__0_models.DeleteDirHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.DeleteDirResponse:
        """
        @summary 删除分组
        
        @param request: DeleteDirRequest
        @param headers: DeleteDirHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: DeleteDirResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.dir_id):
            query['dirId'] = request.dir_id
        if not UtilClient.is_unset(request.operate_user_id):
            query['operateUserId'] = request.operate_user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='DeleteDir',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processCentres/directories',
            method='DELETE',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.DeleteDirResponse(),
            await self.execute_async(params, req, runtime)
        )

    def delete_dir(
        self,
        request: dingtalkworkflow__1__0_models.DeleteDirRequest,
    ) -> dingtalkworkflow__1__0_models.DeleteDirResponse:
        """
        @summary 删除分组
        
        @param request: DeleteDirRequest
        @return: DeleteDirResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.DeleteDirHeaders()
        return self.delete_dir_with_options(request, headers, runtime)

    async def delete_dir_async(
        self,
        request: dingtalkworkflow__1__0_models.DeleteDirRequest,
    ) -> dingtalkworkflow__1__0_models.DeleteDirResponse:
        """
        @summary 删除分组
        
        @param request: DeleteDirRequest
        @return: DeleteDirResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.DeleteDirHeaders()
        return await self.delete_dir_with_options_async(request, headers, runtime)

    def delete_process_with_options(
        self,
        request: dingtalkworkflow__1__0_models.DeleteProcessRequest,
        headers: dingtalkworkflow__1__0_models.DeleteProcessHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.DeleteProcessResponse:
        """
        @summary 删除模板
        
        @param request: DeleteProcessRequest
        @param headers: DeleteProcessHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: DeleteProcessResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.clean_running_task):
            query['cleanRunningTask'] = request.clean_running_task
        if not UtilClient.is_unset(request.process_code):
            query['processCode'] = request.process_code
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='DeleteProcess',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processCentres/schemas',
            method='DELETE',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.DeleteProcessResponse(),
            self.execute(params, req, runtime)
        )

    async def delete_process_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.DeleteProcessRequest,
        headers: dingtalkworkflow__1__0_models.DeleteProcessHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.DeleteProcessResponse:
        """
        @summary 删除模板
        
        @param request: DeleteProcessRequest
        @param headers: DeleteProcessHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: DeleteProcessResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.clean_running_task):
            query['cleanRunningTask'] = request.clean_running_task
        if not UtilClient.is_unset(request.process_code):
            query['processCode'] = request.process_code
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='DeleteProcess',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processCentres/schemas',
            method='DELETE',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.DeleteProcessResponse(),
            await self.execute_async(params, req, runtime)
        )

    def delete_process(
        self,
        request: dingtalkworkflow__1__0_models.DeleteProcessRequest,
    ) -> dingtalkworkflow__1__0_models.DeleteProcessResponse:
        """
        @summary 删除模板
        
        @param request: DeleteProcessRequest
        @return: DeleteProcessResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.DeleteProcessHeaders()
        return self.delete_process_with_options(request, headers, runtime)

    async def delete_process_async(
        self,
        request: dingtalkworkflow__1__0_models.DeleteProcessRequest,
    ) -> dingtalkworkflow__1__0_models.DeleteProcessResponse:
        """
        @summary 删除模板
        
        @param request: DeleteProcessRequest
        @return: DeleteProcessResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.DeleteProcessHeaders()
        return await self.delete_process_with_options_async(request, headers, runtime)

    def execute_process_instance_with_options(
        self,
        request: dingtalkworkflow__1__0_models.ExecuteProcessInstanceRequest,
        headers: dingtalkworkflow__1__0_models.ExecuteProcessInstanceHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.ExecuteProcessInstanceResponse:
        """
        @summary 同意或拒绝审批任务
        
        @param request: ExecuteProcessInstanceRequest
        @param headers: ExecuteProcessInstanceHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: ExecuteProcessInstanceResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.actioner_user_id):
            body['actionerUserId'] = request.actioner_user_id
        if not UtilClient.is_unset(request.file):
            body['file'] = request.file
        if not UtilClient.is_unset(request.process_instance_id):
            body['processInstanceId'] = request.process_instance_id
        if not UtilClient.is_unset(request.remark):
            body['remark'] = request.remark
        if not UtilClient.is_unset(request.result):
            body['result'] = request.result
        if not UtilClient.is_unset(request.task_id):
            body['taskId'] = request.task_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='ExecuteProcessInstance',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processInstances/execute',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.ExecuteProcessInstanceResponse(),
            self.execute(params, req, runtime)
        )

    async def execute_process_instance_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.ExecuteProcessInstanceRequest,
        headers: dingtalkworkflow__1__0_models.ExecuteProcessInstanceHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.ExecuteProcessInstanceResponse:
        """
        @summary 同意或拒绝审批任务
        
        @param request: ExecuteProcessInstanceRequest
        @param headers: ExecuteProcessInstanceHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: ExecuteProcessInstanceResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.actioner_user_id):
            body['actionerUserId'] = request.actioner_user_id
        if not UtilClient.is_unset(request.file):
            body['file'] = request.file
        if not UtilClient.is_unset(request.process_instance_id):
            body['processInstanceId'] = request.process_instance_id
        if not UtilClient.is_unset(request.remark):
            body['remark'] = request.remark
        if not UtilClient.is_unset(request.result):
            body['result'] = request.result
        if not UtilClient.is_unset(request.task_id):
            body['taskId'] = request.task_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='ExecuteProcessInstance',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processInstances/execute',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.ExecuteProcessInstanceResponse(),
            await self.execute_async(params, req, runtime)
        )

    def execute_process_instance(
        self,
        request: dingtalkworkflow__1__0_models.ExecuteProcessInstanceRequest,
    ) -> dingtalkworkflow__1__0_models.ExecuteProcessInstanceResponse:
        """
        @summary 同意或拒绝审批任务
        
        @param request: ExecuteProcessInstanceRequest
        @return: ExecuteProcessInstanceResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.ExecuteProcessInstanceHeaders()
        return self.execute_process_instance_with_options(request, headers, runtime)

    async def execute_process_instance_async(
        self,
        request: dingtalkworkflow__1__0_models.ExecuteProcessInstanceRequest,
    ) -> dingtalkworkflow__1__0_models.ExecuteProcessInstanceResponse:
        """
        @summary 同意或拒绝审批任务
        
        @param request: ExecuteProcessInstanceRequest
        @return: ExecuteProcessInstanceResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.ExecuteProcessInstanceHeaders()
        return await self.execute_process_instance_with_options_async(request, headers, runtime)

    def form_create_with_options(
        self,
        request: dingtalkworkflow__1__0_models.FormCreateRequest,
        headers: dingtalkworkflow__1__0_models.FormCreateHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.FormCreateResponse:
        """
        @summary 创建或更新审批表单模板
        
        @param request: FormCreateRequest
        @param headers: FormCreateHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: FormCreateResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.description):
            body['description'] = request.description
        if not UtilClient.is_unset(request.form_components):
            body['formComponents'] = request.form_components
        if not UtilClient.is_unset(request.name):
            body['name'] = request.name
        if not UtilClient.is_unset(request.process_code):
            body['processCode'] = request.process_code
        if not UtilClient.is_unset(request.template_config):
            body['templateConfig'] = request.template_config
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='FormCreate',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/forms',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.FormCreateResponse(),
            self.execute(params, req, runtime)
        )

    async def form_create_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.FormCreateRequest,
        headers: dingtalkworkflow__1__0_models.FormCreateHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.FormCreateResponse:
        """
        @summary 创建或更新审批表单模板
        
        @param request: FormCreateRequest
        @param headers: FormCreateHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: FormCreateResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.description):
            body['description'] = request.description
        if not UtilClient.is_unset(request.form_components):
            body['formComponents'] = request.form_components
        if not UtilClient.is_unset(request.name):
            body['name'] = request.name
        if not UtilClient.is_unset(request.process_code):
            body['processCode'] = request.process_code
        if not UtilClient.is_unset(request.template_config):
            body['templateConfig'] = request.template_config
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='FormCreate',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/forms',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.FormCreateResponse(),
            await self.execute_async(params, req, runtime)
        )

    def form_create(
        self,
        request: dingtalkworkflow__1__0_models.FormCreateRequest,
    ) -> dingtalkworkflow__1__0_models.FormCreateResponse:
        """
        @summary 创建或更新审批表单模板
        
        @param request: FormCreateRequest
        @return: FormCreateResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.FormCreateHeaders()
        return self.form_create_with_options(request, headers, runtime)

    async def form_create_async(
        self,
        request: dingtalkworkflow__1__0_models.FormCreateRequest,
    ) -> dingtalkworkflow__1__0_models.FormCreateResponse:
        """
        @summary 创建或更新审批表单模板
        
        @param request: FormCreateRequest
        @return: FormCreateResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.FormCreateHeaders()
        return await self.form_create_with_options_async(request, headers, runtime)

    def get_attachment_space_with_options(
        self,
        request: dingtalkworkflow__1__0_models.GetAttachmentSpaceRequest,
        headers: dingtalkworkflow__1__0_models.GetAttachmentSpaceHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.GetAttachmentSpaceResponse:
        """
        @summary 获取审批钉盘空间信息
        
        @param request: GetAttachmentSpaceRequest
        @param headers: GetAttachmentSpaceHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: GetAttachmentSpaceResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.agent_id):
            body['agentId'] = request.agent_id
        if not UtilClient.is_unset(request.user_id):
            body['userId'] = request.user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='GetAttachmentSpace',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processInstances/spaces/infos/query',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.GetAttachmentSpaceResponse(),
            self.execute(params, req, runtime)
        )

    async def get_attachment_space_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.GetAttachmentSpaceRequest,
        headers: dingtalkworkflow__1__0_models.GetAttachmentSpaceHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.GetAttachmentSpaceResponse:
        """
        @summary 获取审批钉盘空间信息
        
        @param request: GetAttachmentSpaceRequest
        @param headers: GetAttachmentSpaceHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: GetAttachmentSpaceResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.agent_id):
            body['agentId'] = request.agent_id
        if not UtilClient.is_unset(request.user_id):
            body['userId'] = request.user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='GetAttachmentSpace',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processInstances/spaces/infos/query',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.GetAttachmentSpaceResponse(),
            await self.execute_async(params, req, runtime)
        )

    def get_attachment_space(
        self,
        request: dingtalkworkflow__1__0_models.GetAttachmentSpaceRequest,
    ) -> dingtalkworkflow__1__0_models.GetAttachmentSpaceResponse:
        """
        @summary 获取审批钉盘空间信息
        
        @param request: GetAttachmentSpaceRequest
        @return: GetAttachmentSpaceResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.GetAttachmentSpaceHeaders()
        return self.get_attachment_space_with_options(request, headers, runtime)

    async def get_attachment_space_async(
        self,
        request: dingtalkworkflow__1__0_models.GetAttachmentSpaceRequest,
    ) -> dingtalkworkflow__1__0_models.GetAttachmentSpaceResponse:
        """
        @summary 获取审批钉盘空间信息
        
        @param request: GetAttachmentSpaceRequest
        @return: GetAttachmentSpaceResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.GetAttachmentSpaceHeaders()
        return await self.get_attachment_space_with_options_async(request, headers, runtime)

    def get_condition_form_component_with_options(
        self,
        request: dingtalkworkflow__1__0_models.GetConditionFormComponentRequest,
        headers: dingtalkworkflow__1__0_models.GetConditionFormComponentHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.GetConditionFormComponentResponse:
        """
        @summary 查询已设置为条件的表单组件
        
        @param request: GetConditionFormComponentRequest
        @param headers: GetConditionFormComponentHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: GetConditionFormComponentResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.agent_id):
            query['agentId'] = request.agent_id
        if not UtilClient.is_unset(request.process_code):
            query['processCode'] = request.process_code
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='GetConditionFormComponent',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processes/conditions/components',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.GetConditionFormComponentResponse(),
            self.execute(params, req, runtime)
        )

    async def get_condition_form_component_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.GetConditionFormComponentRequest,
        headers: dingtalkworkflow__1__0_models.GetConditionFormComponentHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.GetConditionFormComponentResponse:
        """
        @summary 查询已设置为条件的表单组件
        
        @param request: GetConditionFormComponentRequest
        @param headers: GetConditionFormComponentHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: GetConditionFormComponentResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.agent_id):
            query['agentId'] = request.agent_id
        if not UtilClient.is_unset(request.process_code):
            query['processCode'] = request.process_code
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='GetConditionFormComponent',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processes/conditions/components',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.GetConditionFormComponentResponse(),
            await self.execute_async(params, req, runtime)
        )

    def get_condition_form_component(
        self,
        request: dingtalkworkflow__1__0_models.GetConditionFormComponentRequest,
    ) -> dingtalkworkflow__1__0_models.GetConditionFormComponentResponse:
        """
        @summary 查询已设置为条件的表单组件
        
        @param request: GetConditionFormComponentRequest
        @return: GetConditionFormComponentResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.GetConditionFormComponentHeaders()
        return self.get_condition_form_component_with_options(request, headers, runtime)

    async def get_condition_form_component_async(
        self,
        request: dingtalkworkflow__1__0_models.GetConditionFormComponentRequest,
    ) -> dingtalkworkflow__1__0_models.GetConditionFormComponentResponse:
        """
        @summary 查询已设置为条件的表单组件
        
        @param request: GetConditionFormComponentRequest
        @return: GetConditionFormComponentResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.GetConditionFormComponentHeaders()
        return await self.get_condition_form_component_with_options_async(request, headers, runtime)

    def get_crm_proc_codes_with_options(
        self,
        headers: dingtalkworkflow__1__0_models.GetCrmProcCodesHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.GetCrmProcCodesResponse:
        """
        @summary 获取CRM所有流程code
        
        @param headers: GetCrmProcCodesHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: GetCrmProcCodesResponse
        """
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers
        )
        params = open_api_models.Params(
            action='GetCrmProcCodes',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/crm/processes',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.GetCrmProcCodesResponse(),
            self.execute(params, req, runtime)
        )

    async def get_crm_proc_codes_with_options_async(
        self,
        headers: dingtalkworkflow__1__0_models.GetCrmProcCodesHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.GetCrmProcCodesResponse:
        """
        @summary 获取CRM所有流程code
        
        @param headers: GetCrmProcCodesHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: GetCrmProcCodesResponse
        """
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers
        )
        params = open_api_models.Params(
            action='GetCrmProcCodes',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/crm/processes',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.GetCrmProcCodesResponse(),
            await self.execute_async(params, req, runtime)
        )

    def get_crm_proc_codes(self) -> dingtalkworkflow__1__0_models.GetCrmProcCodesResponse:
        """
        @summary 获取CRM所有流程code
        
        @return: GetCrmProcCodesResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.GetCrmProcCodesHeaders()
        return self.get_crm_proc_codes_with_options(headers, runtime)

    async def get_crm_proc_codes_async(self) -> dingtalkworkflow__1__0_models.GetCrmProcCodesResponse:
        """
        @summary 获取CRM所有流程code
        
        @return: GetCrmProcCodesResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.GetCrmProcCodesHeaders()
        return await self.get_crm_proc_codes_with_options_async(headers, runtime)

    def get_field_modified_history_with_options(
        self,
        request: dingtalkworkflow__1__0_models.GetFieldModifiedHistoryRequest,
        headers: dingtalkworkflow__1__0_models.GetFieldModifiedHistoryHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.GetFieldModifiedHistoryResponse:
        """
        @summary 获取表单字段修改历史
        
        @param request: GetFieldModifiedHistoryRequest
        @param headers: GetFieldModifiedHistoryHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: GetFieldModifiedHistoryResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.field_id):
            body['fieldId'] = request.field_id
        if not UtilClient.is_unset(request.process_instance_id):
            body['processInstanceId'] = request.process_instance_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='GetFieldModifiedHistory',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processes/fields/modifiedRecords/query',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.GetFieldModifiedHistoryResponse(),
            self.execute(params, req, runtime)
        )

    async def get_field_modified_history_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.GetFieldModifiedHistoryRequest,
        headers: dingtalkworkflow__1__0_models.GetFieldModifiedHistoryHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.GetFieldModifiedHistoryResponse:
        """
        @summary 获取表单字段修改历史
        
        @param request: GetFieldModifiedHistoryRequest
        @param headers: GetFieldModifiedHistoryHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: GetFieldModifiedHistoryResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.field_id):
            body['fieldId'] = request.field_id
        if not UtilClient.is_unset(request.process_instance_id):
            body['processInstanceId'] = request.process_instance_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='GetFieldModifiedHistory',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processes/fields/modifiedRecords/query',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.GetFieldModifiedHistoryResponse(),
            await self.execute_async(params, req, runtime)
        )

    def get_field_modified_history(
        self,
        request: dingtalkworkflow__1__0_models.GetFieldModifiedHistoryRequest,
    ) -> dingtalkworkflow__1__0_models.GetFieldModifiedHistoryResponse:
        """
        @summary 获取表单字段修改历史
        
        @param request: GetFieldModifiedHistoryRequest
        @return: GetFieldModifiedHistoryResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.GetFieldModifiedHistoryHeaders()
        return self.get_field_modified_history_with_options(request, headers, runtime)

    async def get_field_modified_history_async(
        self,
        request: dingtalkworkflow__1__0_models.GetFieldModifiedHistoryRequest,
    ) -> dingtalkworkflow__1__0_models.GetFieldModifiedHistoryResponse:
        """
        @summary 获取表单字段修改历史
        
        @param request: GetFieldModifiedHistoryRequest
        @return: GetFieldModifiedHistoryResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.GetFieldModifiedHistoryHeaders()
        return await self.get_field_modified_history_with_options_async(request, headers, runtime)

    def get_manage_process_by_staff_id_with_options(
        self,
        request: dingtalkworkflow__1__0_models.GetManageProcessByStaffIdRequest,
        headers: dingtalkworkflow__1__0_models.GetManageProcessByStaffIdHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.GetManageProcessByStaffIdResponse:
        """
        @summary 获取当前企业所有可管理的表单
        
        @param request: GetManageProcessByStaffIdRequest
        @param headers: GetManageProcessByStaffIdHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: GetManageProcessByStaffIdResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.user_id):
            query['userId'] = request.user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='GetManageProcessByStaffId',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processes/managements/templates',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.GetManageProcessByStaffIdResponse(),
            self.execute(params, req, runtime)
        )

    async def get_manage_process_by_staff_id_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.GetManageProcessByStaffIdRequest,
        headers: dingtalkworkflow__1__0_models.GetManageProcessByStaffIdHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.GetManageProcessByStaffIdResponse:
        """
        @summary 获取当前企业所有可管理的表单
        
        @param request: GetManageProcessByStaffIdRequest
        @param headers: GetManageProcessByStaffIdHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: GetManageProcessByStaffIdResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.user_id):
            query['userId'] = request.user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='GetManageProcessByStaffId',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processes/managements/templates',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.GetManageProcessByStaffIdResponse(),
            await self.execute_async(params, req, runtime)
        )

    def get_manage_process_by_staff_id(
        self,
        request: dingtalkworkflow__1__0_models.GetManageProcessByStaffIdRequest,
    ) -> dingtalkworkflow__1__0_models.GetManageProcessByStaffIdResponse:
        """
        @summary 获取当前企业所有可管理的表单
        
        @param request: GetManageProcessByStaffIdRequest
        @return: GetManageProcessByStaffIdResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.GetManageProcessByStaffIdHeaders()
        return self.get_manage_process_by_staff_id_with_options(request, headers, runtime)

    async def get_manage_process_by_staff_id_async(
        self,
        request: dingtalkworkflow__1__0_models.GetManageProcessByStaffIdRequest,
    ) -> dingtalkworkflow__1__0_models.GetManageProcessByStaffIdResponse:
        """
        @summary 获取当前企业所有可管理的表单
        
        @param request: GetManageProcessByStaffIdRequest
        @return: GetManageProcessByStaffIdResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.GetManageProcessByStaffIdHeaders()
        return await self.get_manage_process_by_staff_id_with_options_async(request, headers, runtime)

    def get_process_code_by_name_with_options(
        self,
        request: dingtalkworkflow__1__0_models.GetProcessCodeByNameRequest,
        headers: dingtalkworkflow__1__0_models.GetProcessCodeByNameHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.GetProcessCodeByNameResponse:
        """
        @summary 获取模板code
        
        @param request: GetProcessCodeByNameRequest
        @param headers: GetProcessCodeByNameHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: GetProcessCodeByNameResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.name):
            query['name'] = request.name
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='GetProcessCodeByName',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processCentres/schemaNames/processCodes',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.GetProcessCodeByNameResponse(),
            self.execute(params, req, runtime)
        )

    async def get_process_code_by_name_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.GetProcessCodeByNameRequest,
        headers: dingtalkworkflow__1__0_models.GetProcessCodeByNameHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.GetProcessCodeByNameResponse:
        """
        @summary 获取模板code
        
        @param request: GetProcessCodeByNameRequest
        @param headers: GetProcessCodeByNameHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: GetProcessCodeByNameResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.name):
            query['name'] = request.name
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='GetProcessCodeByName',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processCentres/schemaNames/processCodes',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.GetProcessCodeByNameResponse(),
            await self.execute_async(params, req, runtime)
        )

    def get_process_code_by_name(
        self,
        request: dingtalkworkflow__1__0_models.GetProcessCodeByNameRequest,
    ) -> dingtalkworkflow__1__0_models.GetProcessCodeByNameResponse:
        """
        @summary 获取模板code
        
        @param request: GetProcessCodeByNameRequest
        @return: GetProcessCodeByNameResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.GetProcessCodeByNameHeaders()
        return self.get_process_code_by_name_with_options(request, headers, runtime)

    async def get_process_code_by_name_async(
        self,
        request: dingtalkworkflow__1__0_models.GetProcessCodeByNameRequest,
    ) -> dingtalkworkflow__1__0_models.GetProcessCodeByNameResponse:
        """
        @summary 获取模板code
        
        @param request: GetProcessCodeByNameRequest
        @return: GetProcessCodeByNameResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.GetProcessCodeByNameHeaders()
        return await self.get_process_code_by_name_with_options_async(request, headers, runtime)

    def get_process_config_with_options(
        self,
        request: dingtalkworkflow__1__0_models.GetProcessConfigRequest,
        headers: dingtalkworkflow__1__0_models.GetProcessConfigHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.GetProcessConfigResponse:
        """
        @summary 获取流程配置
        
        @param request: GetProcessConfigRequest
        @param headers: GetProcessConfigHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: GetProcessConfigResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.proc_code):
            query['procCode'] = request.proc_code
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='GetProcessConfig',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/crm/processes/configurations',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.GetProcessConfigResponse(),
            self.execute(params, req, runtime)
        )

    async def get_process_config_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.GetProcessConfigRequest,
        headers: dingtalkworkflow__1__0_models.GetProcessConfigHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.GetProcessConfigResponse:
        """
        @summary 获取流程配置
        
        @param request: GetProcessConfigRequest
        @param headers: GetProcessConfigHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: GetProcessConfigResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.proc_code):
            query['procCode'] = request.proc_code
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='GetProcessConfig',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/crm/processes/configurations',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.GetProcessConfigResponse(),
            await self.execute_async(params, req, runtime)
        )

    def get_process_config(
        self,
        request: dingtalkworkflow__1__0_models.GetProcessConfigRequest,
    ) -> dingtalkworkflow__1__0_models.GetProcessConfigResponse:
        """
        @summary 获取流程配置
        
        @param request: GetProcessConfigRequest
        @return: GetProcessConfigResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.GetProcessConfigHeaders()
        return self.get_process_config_with_options(request, headers, runtime)

    async def get_process_config_async(
        self,
        request: dingtalkworkflow__1__0_models.GetProcessConfigRequest,
    ) -> dingtalkworkflow__1__0_models.GetProcessConfigResponse:
        """
        @summary 获取流程配置
        
        @param request: GetProcessConfigRequest
        @return: GetProcessConfigResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.GetProcessConfigHeaders()
        return await self.get_process_config_with_options_async(request, headers, runtime)

    def get_process_instance_with_options(
        self,
        request: dingtalkworkflow__1__0_models.GetProcessInstanceRequest,
        headers: dingtalkworkflow__1__0_models.GetProcessInstanceHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.GetProcessInstanceResponse:
        """
        @summary 获取单个审批实例详情
        
        @param request: GetProcessInstanceRequest
        @param headers: GetProcessInstanceHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: GetProcessInstanceResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.process_instance_id):
            query['processInstanceId'] = request.process_instance_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='GetProcessInstance',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processInstances',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.GetProcessInstanceResponse(),
            self.execute(params, req, runtime)
        )

    async def get_process_instance_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.GetProcessInstanceRequest,
        headers: dingtalkworkflow__1__0_models.GetProcessInstanceHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.GetProcessInstanceResponse:
        """
        @summary 获取单个审批实例详情
        
        @param request: GetProcessInstanceRequest
        @param headers: GetProcessInstanceHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: GetProcessInstanceResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.process_instance_id):
            query['processInstanceId'] = request.process_instance_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='GetProcessInstance',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processInstances',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.GetProcessInstanceResponse(),
            await self.execute_async(params, req, runtime)
        )

    def get_process_instance(
        self,
        request: dingtalkworkflow__1__0_models.GetProcessInstanceRequest,
    ) -> dingtalkworkflow__1__0_models.GetProcessInstanceResponse:
        """
        @summary 获取单个审批实例详情
        
        @param request: GetProcessInstanceRequest
        @return: GetProcessInstanceResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.GetProcessInstanceHeaders()
        return self.get_process_instance_with_options(request, headers, runtime)

    async def get_process_instance_async(
        self,
        request: dingtalkworkflow__1__0_models.GetProcessInstanceRequest,
    ) -> dingtalkworkflow__1__0_models.GetProcessInstanceResponse:
        """
        @summary 获取单个审批实例详情
        
        @param request: GetProcessInstanceRequest
        @return: GetProcessInstanceResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.GetProcessInstanceHeaders()
        return await self.get_process_instance_with_options_async(request, headers, runtime)

    def get_schema_and_processconfig_batchlly_with_options(
        self,
        tmp_req: dingtalkworkflow__1__0_models.GetSchemaAndProcessconfigBatchllyRequest,
        headers: dingtalkworkflow__1__0_models.GetSchemaAndProcessconfigBatchllyHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.GetSchemaAndProcessconfigBatchllyResponse:
        """
        @summary 根据模版code列表批量查询模板最新表单和流程配置
        
        @param tmp_req: GetSchemaAndProcessconfigBatchllyRequest
        @param headers: GetSchemaAndProcessconfigBatchllyHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: GetSchemaAndProcessconfigBatchllyResponse
        """
        UtilClient.validate_model(tmp_req)
        request = dingtalkworkflow__1__0_models.GetSchemaAndProcessconfigBatchllyShrinkRequest()
        OpenApiUtilClient.convert(tmp_req, request)
        if not UtilClient.is_unset(tmp_req.process_codes):
            request.process_codes_shrink = OpenApiUtilClient.array_to_string_with_specified_style(tmp_req.process_codes, 'processCodes', 'json')
        query = {}
        if not UtilClient.is_unset(request.process_codes_shrink):
            query['processCodes'] = request.process_codes_shrink
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='GetSchemaAndProcessconfigBatchlly',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processes/templates/batchQuery',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.GetSchemaAndProcessconfigBatchllyResponse(),
            self.execute(params, req, runtime)
        )

    async def get_schema_and_processconfig_batchlly_with_options_async(
        self,
        tmp_req: dingtalkworkflow__1__0_models.GetSchemaAndProcessconfigBatchllyRequest,
        headers: dingtalkworkflow__1__0_models.GetSchemaAndProcessconfigBatchllyHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.GetSchemaAndProcessconfigBatchllyResponse:
        """
        @summary 根据模版code列表批量查询模板最新表单和流程配置
        
        @param tmp_req: GetSchemaAndProcessconfigBatchllyRequest
        @param headers: GetSchemaAndProcessconfigBatchllyHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: GetSchemaAndProcessconfigBatchllyResponse
        """
        UtilClient.validate_model(tmp_req)
        request = dingtalkworkflow__1__0_models.GetSchemaAndProcessconfigBatchllyShrinkRequest()
        OpenApiUtilClient.convert(tmp_req, request)
        if not UtilClient.is_unset(tmp_req.process_codes):
            request.process_codes_shrink = OpenApiUtilClient.array_to_string_with_specified_style(tmp_req.process_codes, 'processCodes', 'json')
        query = {}
        if not UtilClient.is_unset(request.process_codes_shrink):
            query['processCodes'] = request.process_codes_shrink
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='GetSchemaAndProcessconfigBatchlly',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processes/templates/batchQuery',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.GetSchemaAndProcessconfigBatchllyResponse(),
            await self.execute_async(params, req, runtime)
        )

    def get_schema_and_processconfig_batchlly(
        self,
        request: dingtalkworkflow__1__0_models.GetSchemaAndProcessconfigBatchllyRequest,
    ) -> dingtalkworkflow__1__0_models.GetSchemaAndProcessconfigBatchllyResponse:
        """
        @summary 根据模版code列表批量查询模板最新表单和流程配置
        
        @param request: GetSchemaAndProcessconfigBatchllyRequest
        @return: GetSchemaAndProcessconfigBatchllyResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.GetSchemaAndProcessconfigBatchllyHeaders()
        return self.get_schema_and_processconfig_batchlly_with_options(request, headers, runtime)

    async def get_schema_and_processconfig_batchlly_async(
        self,
        request: dingtalkworkflow__1__0_models.GetSchemaAndProcessconfigBatchllyRequest,
    ) -> dingtalkworkflow__1__0_models.GetSchemaAndProcessconfigBatchllyResponse:
        """
        @summary 根据模版code列表批量查询模板最新表单和流程配置
        
        @param request: GetSchemaAndProcessconfigBatchllyRequest
        @return: GetSchemaAndProcessconfigBatchllyResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.GetSchemaAndProcessconfigBatchllyHeaders()
        return await self.get_schema_and_processconfig_batchlly_with_options_async(request, headers, runtime)

    def get_space_with_download_auth_with_options(
        self,
        request: dingtalkworkflow__1__0_models.GetSpaceWithDownloadAuthRequest,
        headers: dingtalkworkflow__1__0_models.GetSpaceWithDownloadAuthHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.GetSpaceWithDownloadAuthResponse:
        """
        @summary 授权预览审批附件
        
        @param request: GetSpaceWithDownloadAuthRequest
        @param headers: GetSpaceWithDownloadAuthHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: GetSpaceWithDownloadAuthResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.agent_id):
            body['agentId'] = request.agent_id
        if not UtilClient.is_unset(request.file_id):
            body['fileId'] = request.file_id
        if not UtilClient.is_unset(request.file_id_list):
            body['fileIdList'] = request.file_id_list
        if not UtilClient.is_unset(request.process_instance_id):
            body['processInstanceId'] = request.process_instance_id
        if not UtilClient.is_unset(request.user_id):
            body['userId'] = request.user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='GetSpaceWithDownloadAuth',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processInstances/spaces/authPreview',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.GetSpaceWithDownloadAuthResponse(),
            self.execute(params, req, runtime)
        )

    async def get_space_with_download_auth_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.GetSpaceWithDownloadAuthRequest,
        headers: dingtalkworkflow__1__0_models.GetSpaceWithDownloadAuthHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.GetSpaceWithDownloadAuthResponse:
        """
        @summary 授权预览审批附件
        
        @param request: GetSpaceWithDownloadAuthRequest
        @param headers: GetSpaceWithDownloadAuthHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: GetSpaceWithDownloadAuthResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.agent_id):
            body['agentId'] = request.agent_id
        if not UtilClient.is_unset(request.file_id):
            body['fileId'] = request.file_id
        if not UtilClient.is_unset(request.file_id_list):
            body['fileIdList'] = request.file_id_list
        if not UtilClient.is_unset(request.process_instance_id):
            body['processInstanceId'] = request.process_instance_id
        if not UtilClient.is_unset(request.user_id):
            body['userId'] = request.user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='GetSpaceWithDownloadAuth',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processInstances/spaces/authPreview',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.GetSpaceWithDownloadAuthResponse(),
            await self.execute_async(params, req, runtime)
        )

    def get_space_with_download_auth(
        self,
        request: dingtalkworkflow__1__0_models.GetSpaceWithDownloadAuthRequest,
    ) -> dingtalkworkflow__1__0_models.GetSpaceWithDownloadAuthResponse:
        """
        @summary 授权预览审批附件
        
        @param request: GetSpaceWithDownloadAuthRequest
        @return: GetSpaceWithDownloadAuthResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.GetSpaceWithDownloadAuthHeaders()
        return self.get_space_with_download_auth_with_options(request, headers, runtime)

    async def get_space_with_download_auth_async(
        self,
        request: dingtalkworkflow__1__0_models.GetSpaceWithDownloadAuthRequest,
    ) -> dingtalkworkflow__1__0_models.GetSpaceWithDownloadAuthResponse:
        """
        @summary 授权预览审批附件
        
        @param request: GetSpaceWithDownloadAuthRequest
        @return: GetSpaceWithDownloadAuthResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.GetSpaceWithDownloadAuthHeaders()
        return await self.get_space_with_download_auth_with_options_async(request, headers, runtime)

    def get_user_todo_task_sum_with_options(
        self,
        request: dingtalkworkflow__1__0_models.GetUserTodoTaskSumRequest,
        headers: dingtalkworkflow__1__0_models.GetUserTodoTaskSumHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.GetUserTodoTaskSumResponse:
        """
        @summary 获取用户待审批数量
        
        @param request: GetUserTodoTaskSumRequest
        @param headers: GetUserTodoTaskSumHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: GetUserTodoTaskSumResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.user_id):
            query['userId'] = request.user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='GetUserTodoTaskSum',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processes/todoTasks/numbers',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.GetUserTodoTaskSumResponse(),
            self.execute(params, req, runtime)
        )

    async def get_user_todo_task_sum_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.GetUserTodoTaskSumRequest,
        headers: dingtalkworkflow__1__0_models.GetUserTodoTaskSumHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.GetUserTodoTaskSumResponse:
        """
        @summary 获取用户待审批数量
        
        @param request: GetUserTodoTaskSumRequest
        @param headers: GetUserTodoTaskSumHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: GetUserTodoTaskSumResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.user_id):
            query['userId'] = request.user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='GetUserTodoTaskSum',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processes/todoTasks/numbers',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.GetUserTodoTaskSumResponse(),
            await self.execute_async(params, req, runtime)
        )

    def get_user_todo_task_sum(
        self,
        request: dingtalkworkflow__1__0_models.GetUserTodoTaskSumRequest,
    ) -> dingtalkworkflow__1__0_models.GetUserTodoTaskSumResponse:
        """
        @summary 获取用户待审批数量
        
        @param request: GetUserTodoTaskSumRequest
        @return: GetUserTodoTaskSumResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.GetUserTodoTaskSumHeaders()
        return self.get_user_todo_task_sum_with_options(request, headers, runtime)

    async def get_user_todo_task_sum_async(
        self,
        request: dingtalkworkflow__1__0_models.GetUserTodoTaskSumRequest,
    ) -> dingtalkworkflow__1__0_models.GetUserTodoTaskSumResponse:
        """
        @summary 获取用户待审批数量
        
        @param request: GetUserTodoTaskSumRequest
        @return: GetUserTodoTaskSumResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.GetUserTodoTaskSumHeaders()
        return await self.get_user_todo_task_sum_with_options_async(request, headers, runtime)

    def grant_cspace_authorization_with_options(
        self,
        request: dingtalkworkflow__1__0_models.GrantCspaceAuthorizationRequest,
        headers: dingtalkworkflow__1__0_models.GrantCspaceAuthorizationHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.GrantCspaceAuthorizationResponse:
        """
        @summary  授权用户钉盘空间权限
        
        @param request: GrantCspaceAuthorizationRequest
        @param headers: GrantCspaceAuthorizationHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: GrantCspaceAuthorizationResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.duration_seconds):
            body['durationSeconds'] = request.duration_seconds
        if not UtilClient.is_unset(request.space_id):
            body['spaceId'] = request.space_id
        if not UtilClient.is_unset(request.type):
            body['type'] = request.type
        if not UtilClient.is_unset(request.user_id):
            body['userId'] = request.user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='GrantCspaceAuthorization',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/spaces/authorize',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='none'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.GrantCspaceAuthorizationResponse(),
            self.execute(params, req, runtime)
        )

    async def grant_cspace_authorization_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.GrantCspaceAuthorizationRequest,
        headers: dingtalkworkflow__1__0_models.GrantCspaceAuthorizationHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.GrantCspaceAuthorizationResponse:
        """
        @summary  授权用户钉盘空间权限
        
        @param request: GrantCspaceAuthorizationRequest
        @param headers: GrantCspaceAuthorizationHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: GrantCspaceAuthorizationResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.duration_seconds):
            body['durationSeconds'] = request.duration_seconds
        if not UtilClient.is_unset(request.space_id):
            body['spaceId'] = request.space_id
        if not UtilClient.is_unset(request.type):
            body['type'] = request.type
        if not UtilClient.is_unset(request.user_id):
            body['userId'] = request.user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='GrantCspaceAuthorization',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/spaces/authorize',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='none'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.GrantCspaceAuthorizationResponse(),
            await self.execute_async(params, req, runtime)
        )

    def grant_cspace_authorization(
        self,
        request: dingtalkworkflow__1__0_models.GrantCspaceAuthorizationRequest,
    ) -> dingtalkworkflow__1__0_models.GrantCspaceAuthorizationResponse:
        """
        @summary  授权用户钉盘空间权限
        
        @param request: GrantCspaceAuthorizationRequest
        @return: GrantCspaceAuthorizationResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.GrantCspaceAuthorizationHeaders()
        return self.grant_cspace_authorization_with_options(request, headers, runtime)

    async def grant_cspace_authorization_async(
        self,
        request: dingtalkworkflow__1__0_models.GrantCspaceAuthorizationRequest,
    ) -> dingtalkworkflow__1__0_models.GrantCspaceAuthorizationResponse:
        """
        @summary  授权用户钉盘空间权限
        
        @param request: GrantCspaceAuthorizationRequest
        @return: GrantCspaceAuthorizationResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.GrantCspaceAuthorizationHeaders()
        return await self.grant_cspace_authorization_with_options_async(request, headers, runtime)

    def grant_process_instance_for_download_file_with_options(
        self,
        request: dingtalkworkflow__1__0_models.GrantProcessInstanceForDownloadFileRequest,
        headers: dingtalkworkflow__1__0_models.GrantProcessInstanceForDownloadFileHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.GrantProcessInstanceForDownloadFileResponse:
        """
        @summary 下载审批附件
        
        @param request: GrantProcessInstanceForDownloadFileRequest
        @param headers: GrantProcessInstanceForDownloadFileHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: GrantProcessInstanceForDownloadFileResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.file_id):
            body['fileId'] = request.file_id
        if not UtilClient.is_unset(request.process_instance_id):
            body['processInstanceId'] = request.process_instance_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='GrantProcessInstanceForDownloadFile',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processInstances/spaces/files/urls/download',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.GrantProcessInstanceForDownloadFileResponse(),
            self.execute(params, req, runtime)
        )

    async def grant_process_instance_for_download_file_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.GrantProcessInstanceForDownloadFileRequest,
        headers: dingtalkworkflow__1__0_models.GrantProcessInstanceForDownloadFileHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.GrantProcessInstanceForDownloadFileResponse:
        """
        @summary 下载审批附件
        
        @param request: GrantProcessInstanceForDownloadFileRequest
        @param headers: GrantProcessInstanceForDownloadFileHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: GrantProcessInstanceForDownloadFileResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.file_id):
            body['fileId'] = request.file_id
        if not UtilClient.is_unset(request.process_instance_id):
            body['processInstanceId'] = request.process_instance_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='GrantProcessInstanceForDownloadFile',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processInstances/spaces/files/urls/download',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.GrantProcessInstanceForDownloadFileResponse(),
            await self.execute_async(params, req, runtime)
        )

    def grant_process_instance_for_download_file(
        self,
        request: dingtalkworkflow__1__0_models.GrantProcessInstanceForDownloadFileRequest,
    ) -> dingtalkworkflow__1__0_models.GrantProcessInstanceForDownloadFileResponse:
        """
        @summary 下载审批附件
        
        @param request: GrantProcessInstanceForDownloadFileRequest
        @return: GrantProcessInstanceForDownloadFileResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.GrantProcessInstanceForDownloadFileHeaders()
        return self.grant_process_instance_for_download_file_with_options(request, headers, runtime)

    async def grant_process_instance_for_download_file_async(
        self,
        request: dingtalkworkflow__1__0_models.GrantProcessInstanceForDownloadFileRequest,
    ) -> dingtalkworkflow__1__0_models.GrantProcessInstanceForDownloadFileResponse:
        """
        @summary 下载审批附件
        
        @param request: GrantProcessInstanceForDownloadFileRequest
        @return: GrantProcessInstanceForDownloadFileResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.GrantProcessInstanceForDownloadFileHeaders()
        return await self.grant_process_instance_for_download_file_with_options_async(request, headers, runtime)

    def insert_or_update_dir_with_options(
        self,
        request: dingtalkworkflow__1__0_models.InsertOrUpdateDirRequest,
        headers: dingtalkworkflow__1__0_models.InsertOrUpdateDirHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.InsertOrUpdateDirResponse:
        """
        @summary 创建或更新分组
        
        @param request: InsertOrUpdateDirRequest
        @param headers: InsertOrUpdateDirHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: InsertOrUpdateDirResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.biz_group):
            body['bizGroup'] = request.biz_group
        if not UtilClient.is_unset(request.description):
            body['description'] = request.description
        if not UtilClient.is_unset(request.name):
            body['name'] = request.name
        if not UtilClient.is_unset(request.name_18n):
            body['name18n'] = request.name_18n
        if not UtilClient.is_unset(request.operate_user_id):
            body['operateUserId'] = request.operate_user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='InsertOrUpdateDir',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processCentres/directories',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.InsertOrUpdateDirResponse(),
            self.execute(params, req, runtime)
        )

    async def insert_or_update_dir_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.InsertOrUpdateDirRequest,
        headers: dingtalkworkflow__1__0_models.InsertOrUpdateDirHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.InsertOrUpdateDirResponse:
        """
        @summary 创建或更新分组
        
        @param request: InsertOrUpdateDirRequest
        @param headers: InsertOrUpdateDirHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: InsertOrUpdateDirResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.biz_group):
            body['bizGroup'] = request.biz_group
        if not UtilClient.is_unset(request.description):
            body['description'] = request.description
        if not UtilClient.is_unset(request.name):
            body['name'] = request.name
        if not UtilClient.is_unset(request.name_18n):
            body['name18n'] = request.name_18n
        if not UtilClient.is_unset(request.operate_user_id):
            body['operateUserId'] = request.operate_user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='InsertOrUpdateDir',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processCentres/directories',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.InsertOrUpdateDirResponse(),
            await self.execute_async(params, req, runtime)
        )

    def insert_or_update_dir(
        self,
        request: dingtalkworkflow__1__0_models.InsertOrUpdateDirRequest,
    ) -> dingtalkworkflow__1__0_models.InsertOrUpdateDirResponse:
        """
        @summary 创建或更新分组
        
        @param request: InsertOrUpdateDirRequest
        @return: InsertOrUpdateDirResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.InsertOrUpdateDirHeaders()
        return self.insert_or_update_dir_with_options(request, headers, runtime)

    async def insert_or_update_dir_async(
        self,
        request: dingtalkworkflow__1__0_models.InsertOrUpdateDirRequest,
    ) -> dingtalkworkflow__1__0_models.InsertOrUpdateDirResponse:
        """
        @summary 创建或更新分组
        
        @param request: InsertOrUpdateDirRequest
        @return: InsertOrUpdateDirResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.InsertOrUpdateDirHeaders()
        return await self.insert_or_update_dir_with_options_async(request, headers, runtime)

    def install_app_with_options(
        self,
        request: dingtalkworkflow__1__0_models.InstallAppRequest,
        headers: dingtalkworkflow__1__0_models.InstallAppHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.InstallAppResponse:
        """
        @summary 应用安装
        
        @param request: InstallAppRequest
        @param headers: InstallAppHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: InstallAppResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.biz_group):
            body['bizGroup'] = request.biz_group
        if not UtilClient.is_unset(request.install_option):
            body['installOption'] = request.install_option
        if not UtilClient.is_unset(request.source_dir_name):
            body['sourceDirName'] = request.source_dir_name
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='InstallApp',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processes/apps/install',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.InstallAppResponse(),
            self.execute(params, req, runtime)
        )

    async def install_app_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.InstallAppRequest,
        headers: dingtalkworkflow__1__0_models.InstallAppHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.InstallAppResponse:
        """
        @summary 应用安装
        
        @param request: InstallAppRequest
        @param headers: InstallAppHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: InstallAppResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.biz_group):
            body['bizGroup'] = request.biz_group
        if not UtilClient.is_unset(request.install_option):
            body['installOption'] = request.install_option
        if not UtilClient.is_unset(request.source_dir_name):
            body['sourceDirName'] = request.source_dir_name
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='InstallApp',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processes/apps/install',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.InstallAppResponse(),
            await self.execute_async(params, req, runtime)
        )

    def install_app(
        self,
        request: dingtalkworkflow__1__0_models.InstallAppRequest,
    ) -> dingtalkworkflow__1__0_models.InstallAppResponse:
        """
        @summary 应用安装
        
        @param request: InstallAppRequest
        @return: InstallAppResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.InstallAppHeaders()
        return self.install_app_with_options(request, headers, runtime)

    async def install_app_async(
        self,
        request: dingtalkworkflow__1__0_models.InstallAppRequest,
    ) -> dingtalkworkflow__1__0_models.InstallAppResponse:
        """
        @summary 应用安装
        
        @param request: InstallAppRequest
        @return: InstallAppResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.InstallAppHeaders()
        return await self.install_app_with_options_async(request, headers, runtime)

    def list_process_instance_ids_with_options(
        self,
        request: dingtalkworkflow__1__0_models.ListProcessInstanceIdsRequest,
        headers: dingtalkworkflow__1__0_models.ListProcessInstanceIdsHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.ListProcessInstanceIdsResponse:
        """
        @summary 获取审批实例ID列表
        
        @param request: ListProcessInstanceIdsRequest
        @param headers: ListProcessInstanceIdsHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: ListProcessInstanceIdsResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.end_time):
            body['endTime'] = request.end_time
        if not UtilClient.is_unset(request.max_results):
            body['maxResults'] = request.max_results
        if not UtilClient.is_unset(request.next_token):
            body['nextToken'] = request.next_token
        if not UtilClient.is_unset(request.process_code):
            body['processCode'] = request.process_code
        if not UtilClient.is_unset(request.start_time):
            body['startTime'] = request.start_time
        if not UtilClient.is_unset(request.statuses):
            body['statuses'] = request.statuses
        if not UtilClient.is_unset(request.user_ids):
            body['userIds'] = request.user_ids
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='ListProcessInstanceIds',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processes/instanceIds/query',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.ListProcessInstanceIdsResponse(),
            self.execute(params, req, runtime)
        )

    async def list_process_instance_ids_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.ListProcessInstanceIdsRequest,
        headers: dingtalkworkflow__1__0_models.ListProcessInstanceIdsHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.ListProcessInstanceIdsResponse:
        """
        @summary 获取审批实例ID列表
        
        @param request: ListProcessInstanceIdsRequest
        @param headers: ListProcessInstanceIdsHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: ListProcessInstanceIdsResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.end_time):
            body['endTime'] = request.end_time
        if not UtilClient.is_unset(request.max_results):
            body['maxResults'] = request.max_results
        if not UtilClient.is_unset(request.next_token):
            body['nextToken'] = request.next_token
        if not UtilClient.is_unset(request.process_code):
            body['processCode'] = request.process_code
        if not UtilClient.is_unset(request.start_time):
            body['startTime'] = request.start_time
        if not UtilClient.is_unset(request.statuses):
            body['statuses'] = request.statuses
        if not UtilClient.is_unset(request.user_ids):
            body['userIds'] = request.user_ids
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='ListProcessInstanceIds',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processes/instanceIds/query',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.ListProcessInstanceIdsResponse(),
            await self.execute_async(params, req, runtime)
        )

    def list_process_instance_ids(
        self,
        request: dingtalkworkflow__1__0_models.ListProcessInstanceIdsRequest,
    ) -> dingtalkworkflow__1__0_models.ListProcessInstanceIdsResponse:
        """
        @summary 获取审批实例ID列表
        
        @param request: ListProcessInstanceIdsRequest
        @return: ListProcessInstanceIdsResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.ListProcessInstanceIdsHeaders()
        return self.list_process_instance_ids_with_options(request, headers, runtime)

    async def list_process_instance_ids_async(
        self,
        request: dingtalkworkflow__1__0_models.ListProcessInstanceIdsRequest,
    ) -> dingtalkworkflow__1__0_models.ListProcessInstanceIdsResponse:
        """
        @summary 获取审批实例ID列表
        
        @param request: ListProcessInstanceIdsRequest
        @return: ListProcessInstanceIdsResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.ListProcessInstanceIdsHeaders()
        return await self.list_process_instance_ids_with_options_async(request, headers, runtime)

    def list_todo_work_records_with_options(
        self,
        request: dingtalkworkflow__1__0_models.ListTodoWorkRecordsRequest,
        headers: dingtalkworkflow__1__0_models.ListTodoWorkRecordsHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.ListTodoWorkRecordsResponse:
        """
        @summary 查询用户待办事项
        
        @param request: ListTodoWorkRecordsRequest
        @param headers: ListTodoWorkRecordsHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: ListTodoWorkRecordsResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.max_results):
            query['maxResults'] = request.max_results
        if not UtilClient.is_unset(request.next_token):
            query['nextToken'] = request.next_token
        if not UtilClient.is_unset(request.status):
            query['status'] = request.status
        if not UtilClient.is_unset(request.user_id):
            query['userId'] = request.user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='ListTodoWorkRecords',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/workRecords/todoTasks',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.ListTodoWorkRecordsResponse(),
            self.execute(params, req, runtime)
        )

    async def list_todo_work_records_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.ListTodoWorkRecordsRequest,
        headers: dingtalkworkflow__1__0_models.ListTodoWorkRecordsHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.ListTodoWorkRecordsResponse:
        """
        @summary 查询用户待办事项
        
        @param request: ListTodoWorkRecordsRequest
        @param headers: ListTodoWorkRecordsHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: ListTodoWorkRecordsResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.max_results):
            query['maxResults'] = request.max_results
        if not UtilClient.is_unset(request.next_token):
            query['nextToken'] = request.next_token
        if not UtilClient.is_unset(request.status):
            query['status'] = request.status
        if not UtilClient.is_unset(request.user_id):
            query['userId'] = request.user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='ListTodoWorkRecords',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/workRecords/todoTasks',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.ListTodoWorkRecordsResponse(),
            await self.execute_async(params, req, runtime)
        )

    def list_todo_work_records(
        self,
        request: dingtalkworkflow__1__0_models.ListTodoWorkRecordsRequest,
    ) -> dingtalkworkflow__1__0_models.ListTodoWorkRecordsResponse:
        """
        @summary 查询用户待办事项
        
        @param request: ListTodoWorkRecordsRequest
        @return: ListTodoWorkRecordsResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.ListTodoWorkRecordsHeaders()
        return self.list_todo_work_records_with_options(request, headers, runtime)

    async def list_todo_work_records_async(
        self,
        request: dingtalkworkflow__1__0_models.ListTodoWorkRecordsRequest,
    ) -> dingtalkworkflow__1__0_models.ListTodoWorkRecordsResponse:
        """
        @summary 查询用户待办事项
        
        @param request: ListTodoWorkRecordsRequest
        @return: ListTodoWorkRecordsResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.ListTodoWorkRecordsHeaders()
        return await self.list_todo_work_records_with_options_async(request, headers, runtime)

    def list_user_visible_bpms_processes_with_options(
        self,
        request: dingtalkworkflow__1__0_models.ListUserVisibleBpmsProcessesRequest,
        headers: dingtalkworkflow__1__0_models.ListUserVisibleBpmsProcessesHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.ListUserVisibleBpmsProcessesResponse:
        """
        @summary 获取指定用户可见的审批表单列表
        
        @param request: ListUserVisibleBpmsProcessesRequest
        @param headers: ListUserVisibleBpmsProcessesHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: ListUserVisibleBpmsProcessesResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.max_results):
            query['maxResults'] = request.max_results
        if not UtilClient.is_unset(request.next_token):
            query['nextToken'] = request.next_token
        if not UtilClient.is_unset(request.user_id):
            query['userId'] = request.user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='ListUserVisibleBpmsProcesses',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processes/userVisibilities/templates',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.ListUserVisibleBpmsProcessesResponse(),
            self.execute(params, req, runtime)
        )

    async def list_user_visible_bpms_processes_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.ListUserVisibleBpmsProcessesRequest,
        headers: dingtalkworkflow__1__0_models.ListUserVisibleBpmsProcessesHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.ListUserVisibleBpmsProcessesResponse:
        """
        @summary 获取指定用户可见的审批表单列表
        
        @param request: ListUserVisibleBpmsProcessesRequest
        @param headers: ListUserVisibleBpmsProcessesHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: ListUserVisibleBpmsProcessesResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.max_results):
            query['maxResults'] = request.max_results
        if not UtilClient.is_unset(request.next_token):
            query['nextToken'] = request.next_token
        if not UtilClient.is_unset(request.user_id):
            query['userId'] = request.user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='ListUserVisibleBpmsProcesses',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processes/userVisibilities/templates',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.ListUserVisibleBpmsProcessesResponse(),
            await self.execute_async(params, req, runtime)
        )

    def list_user_visible_bpms_processes(
        self,
        request: dingtalkworkflow__1__0_models.ListUserVisibleBpmsProcessesRequest,
    ) -> dingtalkworkflow__1__0_models.ListUserVisibleBpmsProcessesResponse:
        """
        @summary 获取指定用户可见的审批表单列表
        
        @param request: ListUserVisibleBpmsProcessesRequest
        @return: ListUserVisibleBpmsProcessesResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.ListUserVisibleBpmsProcessesHeaders()
        return self.list_user_visible_bpms_processes_with_options(request, headers, runtime)

    async def list_user_visible_bpms_processes_async(
        self,
        request: dingtalkworkflow__1__0_models.ListUserVisibleBpmsProcessesRequest,
    ) -> dingtalkworkflow__1__0_models.ListUserVisibleBpmsProcessesResponse:
        """
        @summary 获取指定用户可见的审批表单列表
        
        @param request: ListUserVisibleBpmsProcessesRequest
        @return: ListUserVisibleBpmsProcessesResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.ListUserVisibleBpmsProcessesHeaders()
        return await self.list_user_visible_bpms_processes_with_options_async(request, headers, runtime)

    def pages_export_instances_with_options(
        self,
        request: dingtalkworkflow__1__0_models.PagesExportInstancesRequest,
        headers: dingtalkworkflow__1__0_models.PagesExportInstancesHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.PagesExportInstancesResponse:
        """
        @summary 分页查询实例数据
        
        @param request: PagesExportInstancesRequest
        @param headers: PagesExportInstancesHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: PagesExportInstancesResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.end_time_in_mills):
            query['endTimeInMills'] = request.end_time_in_mills
        if not UtilClient.is_unset(request.max_results):
            query['maxResults'] = request.max_results
        if not UtilClient.is_unset(request.next_token):
            query['nextToken'] = request.next_token
        if not UtilClient.is_unset(request.order_by):
            query['orderBy'] = request.order_by
        if not UtilClient.is_unset(request.process_code):
            query['processCode'] = request.process_code
        if not UtilClient.is_unset(request.start_time_in_mills):
            query['startTimeInMills'] = request.start_time_in_mills
        if not UtilClient.is_unset(request.status):
            query['status'] = request.status
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='PagesExportInstances',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/instances/datas',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.PagesExportInstancesResponse(),
            self.execute(params, req, runtime)
        )

    async def pages_export_instances_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.PagesExportInstancesRequest,
        headers: dingtalkworkflow__1__0_models.PagesExportInstancesHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.PagesExportInstancesResponse:
        """
        @summary 分页查询实例数据
        
        @param request: PagesExportInstancesRequest
        @param headers: PagesExportInstancesHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: PagesExportInstancesResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.end_time_in_mills):
            query['endTimeInMills'] = request.end_time_in_mills
        if not UtilClient.is_unset(request.max_results):
            query['maxResults'] = request.max_results
        if not UtilClient.is_unset(request.next_token):
            query['nextToken'] = request.next_token
        if not UtilClient.is_unset(request.order_by):
            query['orderBy'] = request.order_by
        if not UtilClient.is_unset(request.process_code):
            query['processCode'] = request.process_code
        if not UtilClient.is_unset(request.start_time_in_mills):
            query['startTimeInMills'] = request.start_time_in_mills
        if not UtilClient.is_unset(request.status):
            query['status'] = request.status
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='PagesExportInstances',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/instances/datas',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.PagesExportInstancesResponse(),
            await self.execute_async(params, req, runtime)
        )

    def pages_export_instances(
        self,
        request: dingtalkworkflow__1__0_models.PagesExportInstancesRequest,
    ) -> dingtalkworkflow__1__0_models.PagesExportInstancesResponse:
        """
        @summary 分页查询实例数据
        
        @param request: PagesExportInstancesRequest
        @return: PagesExportInstancesResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.PagesExportInstancesHeaders()
        return self.pages_export_instances_with_options(request, headers, runtime)

    async def pages_export_instances_async(
        self,
        request: dingtalkworkflow__1__0_models.PagesExportInstancesRequest,
    ) -> dingtalkworkflow__1__0_models.PagesExportInstancesResponse:
        """
        @summary 分页查询实例数据
        
        @param request: PagesExportInstancesRequest
        @return: PagesExportInstancesResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.PagesExportInstancesHeaders()
        return await self.pages_export_instances_with_options_async(request, headers, runtime)

    def process_forecast_with_options(
        self,
        request: dingtalkworkflow__1__0_models.ProcessForecastRequest,
        headers: dingtalkworkflow__1__0_models.ProcessForecastHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.ProcessForecastResponse:
        """
        @summary 审批流程预测
        
        @param request: ProcessForecastRequest
        @param headers: ProcessForecastHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: ProcessForecastResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.dept_id):
            body['deptId'] = request.dept_id
        if not UtilClient.is_unset(request.form_component_values):
            body['formComponentValues'] = request.form_component_values
        if not UtilClient.is_unset(request.process_code):
            body['processCode'] = request.process_code
        if not UtilClient.is_unset(request.user_id):
            body['userId'] = request.user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='ProcessForecast',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processes/forecast',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.ProcessForecastResponse(),
            self.execute(params, req, runtime)
        )

    async def process_forecast_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.ProcessForecastRequest,
        headers: dingtalkworkflow__1__0_models.ProcessForecastHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.ProcessForecastResponse:
        """
        @summary 审批流程预测
        
        @param request: ProcessForecastRequest
        @param headers: ProcessForecastHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: ProcessForecastResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.dept_id):
            body['deptId'] = request.dept_id
        if not UtilClient.is_unset(request.form_component_values):
            body['formComponentValues'] = request.form_component_values
        if not UtilClient.is_unset(request.process_code):
            body['processCode'] = request.process_code
        if not UtilClient.is_unset(request.user_id):
            body['userId'] = request.user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='ProcessForecast',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processes/forecast',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.ProcessForecastResponse(),
            await self.execute_async(params, req, runtime)
        )

    def process_forecast(
        self,
        request: dingtalkworkflow__1__0_models.ProcessForecastRequest,
    ) -> dingtalkworkflow__1__0_models.ProcessForecastResponse:
        """
        @summary 审批流程预测
        
        @param request: ProcessForecastRequest
        @return: ProcessForecastResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.ProcessForecastHeaders()
        return self.process_forecast_with_options(request, headers, runtime)

    async def process_forecast_async(
        self,
        request: dingtalkworkflow__1__0_models.ProcessForecastRequest,
    ) -> dingtalkworkflow__1__0_models.ProcessForecastResponse:
        """
        @summary 审批流程预测
        
        @param request: ProcessForecastRequest
        @return: ProcessForecastResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.ProcessForecastHeaders()
        return await self.process_forecast_with_options_async(request, headers, runtime)

    def query_all_form_instances_with_options(
        self,
        request: dingtalkworkflow__1__0_models.QueryAllFormInstancesRequest,
        headers: dingtalkworkflow__1__0_models.QueryAllFormInstancesHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.QueryAllFormInstancesResponse:
        """
        @summary 根据processCode分页获取表单数据
        
        @param request: QueryAllFormInstancesRequest
        @param headers: QueryAllFormInstancesHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: QueryAllFormInstancesResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.app_uuid):
            query['appUuid'] = request.app_uuid
        if not UtilClient.is_unset(request.form_code):
            query['formCode'] = request.form_code
        if not UtilClient.is_unset(request.max_results):
            query['maxResults'] = request.max_results
        if not UtilClient.is_unset(request.next_token):
            query['nextToken'] = request.next_token
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='QueryAllFormInstances',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/forms/pages/instances',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.QueryAllFormInstancesResponse(),
            self.execute(params, req, runtime)
        )

    async def query_all_form_instances_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.QueryAllFormInstancesRequest,
        headers: dingtalkworkflow__1__0_models.QueryAllFormInstancesHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.QueryAllFormInstancesResponse:
        """
        @summary 根据processCode分页获取表单数据
        
        @param request: QueryAllFormInstancesRequest
        @param headers: QueryAllFormInstancesHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: QueryAllFormInstancesResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.app_uuid):
            query['appUuid'] = request.app_uuid
        if not UtilClient.is_unset(request.form_code):
            query['formCode'] = request.form_code
        if not UtilClient.is_unset(request.max_results):
            query['maxResults'] = request.max_results
        if not UtilClient.is_unset(request.next_token):
            query['nextToken'] = request.next_token
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='QueryAllFormInstances',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/forms/pages/instances',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.QueryAllFormInstancesResponse(),
            await self.execute_async(params, req, runtime)
        )

    def query_all_form_instances(
        self,
        request: dingtalkworkflow__1__0_models.QueryAllFormInstancesRequest,
    ) -> dingtalkworkflow__1__0_models.QueryAllFormInstancesResponse:
        """
        @summary 根据processCode分页获取表单数据
        
        @param request: QueryAllFormInstancesRequest
        @return: QueryAllFormInstancesResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.QueryAllFormInstancesHeaders()
        return self.query_all_form_instances_with_options(request, headers, runtime)

    async def query_all_form_instances_async(
        self,
        request: dingtalkworkflow__1__0_models.QueryAllFormInstancesRequest,
    ) -> dingtalkworkflow__1__0_models.QueryAllFormInstancesResponse:
        """
        @summary 根据processCode分页获取表单数据
        
        @param request: QueryAllFormInstancesRequest
        @return: QueryAllFormInstancesResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.QueryAllFormInstancesHeaders()
        return await self.query_all_form_instances_with_options_async(request, headers, runtime)

    def query_all_process_instances_with_options(
        self,
        request: dingtalkworkflow__1__0_models.QueryAllProcessInstancesRequest,
        headers: dingtalkworkflow__1__0_models.QueryAllProcessInstancesHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.QueryAllProcessInstancesResponse:
        """
        @summary 批量查询审批流程实例
        
        @param request: QueryAllProcessInstancesRequest
        @param headers: QueryAllProcessInstancesHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: QueryAllProcessInstancesResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.app_uuid):
            query['appUuid'] = request.app_uuid
        if not UtilClient.is_unset(request.end_time_in_mills):
            query['endTimeInMills'] = request.end_time_in_mills
        if not UtilClient.is_unset(request.max_results):
            query['maxResults'] = request.max_results
        if not UtilClient.is_unset(request.next_token):
            query['nextToken'] = request.next_token
        if not UtilClient.is_unset(request.process_code):
            query['processCode'] = request.process_code
        if not UtilClient.is_unset(request.start_time_in_mills):
            query['startTimeInMills'] = request.start_time_in_mills
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='QueryAllProcessInstances',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processes/pages/instances',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.QueryAllProcessInstancesResponse(),
            self.execute(params, req, runtime)
        )

    async def query_all_process_instances_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.QueryAllProcessInstancesRequest,
        headers: dingtalkworkflow__1__0_models.QueryAllProcessInstancesHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.QueryAllProcessInstancesResponse:
        """
        @summary 批量查询审批流程实例
        
        @param request: QueryAllProcessInstancesRequest
        @param headers: QueryAllProcessInstancesHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: QueryAllProcessInstancesResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.app_uuid):
            query['appUuid'] = request.app_uuid
        if not UtilClient.is_unset(request.end_time_in_mills):
            query['endTimeInMills'] = request.end_time_in_mills
        if not UtilClient.is_unset(request.max_results):
            query['maxResults'] = request.max_results
        if not UtilClient.is_unset(request.next_token):
            query['nextToken'] = request.next_token
        if not UtilClient.is_unset(request.process_code):
            query['processCode'] = request.process_code
        if not UtilClient.is_unset(request.start_time_in_mills):
            query['startTimeInMills'] = request.start_time_in_mills
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='QueryAllProcessInstances',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processes/pages/instances',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.QueryAllProcessInstancesResponse(),
            await self.execute_async(params, req, runtime)
        )

    def query_all_process_instances(
        self,
        request: dingtalkworkflow__1__0_models.QueryAllProcessInstancesRequest,
    ) -> dingtalkworkflow__1__0_models.QueryAllProcessInstancesResponse:
        """
        @summary 批量查询审批流程实例
        
        @param request: QueryAllProcessInstancesRequest
        @return: QueryAllProcessInstancesResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.QueryAllProcessInstancesHeaders()
        return self.query_all_process_instances_with_options(request, headers, runtime)

    async def query_all_process_instances_async(
        self,
        request: dingtalkworkflow__1__0_models.QueryAllProcessInstancesRequest,
    ) -> dingtalkworkflow__1__0_models.QueryAllProcessInstancesResponse:
        """
        @summary 批量查询审批流程实例
        
        @param request: QueryAllProcessInstancesRequest
        @return: QueryAllProcessInstancesResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.QueryAllProcessInstancesHeaders()
        return await self.query_all_process_instances_with_options_async(request, headers, runtime)

    def query_form_by_biz_type_with_options(
        self,
        request: dingtalkworkflow__1__0_models.QueryFormByBizTypeRequest,
        headers: dingtalkworkflow__1__0_models.QueryFormByBizTypeHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.QueryFormByBizTypeResponse:
        """
        @summary 根据业务标识查询表单描述信息
        
        @param request: QueryFormByBizTypeRequest
        @param headers: QueryFormByBizTypeHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: QueryFormByBizTypeResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.app_uuid):
            body['appUuid'] = request.app_uuid
        if not UtilClient.is_unset(request.biz_types):
            body['bizTypes'] = request.biz_types
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='QueryFormByBizType',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/forms/forminfos/query',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.QueryFormByBizTypeResponse(),
            self.execute(params, req, runtime)
        )

    async def query_form_by_biz_type_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.QueryFormByBizTypeRequest,
        headers: dingtalkworkflow__1__0_models.QueryFormByBizTypeHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.QueryFormByBizTypeResponse:
        """
        @summary 根据业务标识查询表单描述信息
        
        @param request: QueryFormByBizTypeRequest
        @param headers: QueryFormByBizTypeHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: QueryFormByBizTypeResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.app_uuid):
            body['appUuid'] = request.app_uuid
        if not UtilClient.is_unset(request.biz_types):
            body['bizTypes'] = request.biz_types
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='QueryFormByBizType',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/forms/forminfos/query',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.QueryFormByBizTypeResponse(),
            await self.execute_async(params, req, runtime)
        )

    def query_form_by_biz_type(
        self,
        request: dingtalkworkflow__1__0_models.QueryFormByBizTypeRequest,
    ) -> dingtalkworkflow__1__0_models.QueryFormByBizTypeResponse:
        """
        @summary 根据业务标识查询表单描述信息
        
        @param request: QueryFormByBizTypeRequest
        @return: QueryFormByBizTypeResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.QueryFormByBizTypeHeaders()
        return self.query_form_by_biz_type_with_options(request, headers, runtime)

    async def query_form_by_biz_type_async(
        self,
        request: dingtalkworkflow__1__0_models.QueryFormByBizTypeRequest,
    ) -> dingtalkworkflow__1__0_models.QueryFormByBizTypeResponse:
        """
        @summary 根据业务标识查询表单描述信息
        
        @param request: QueryFormByBizTypeRequest
        @return: QueryFormByBizTypeResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.QueryFormByBizTypeHeaders()
        return await self.query_form_by_biz_type_with_options_async(request, headers, runtime)

    def query_form_instance_with_options(
        self,
        request: dingtalkworkflow__1__0_models.QueryFormInstanceRequest,
        headers: dingtalkworkflow__1__0_models.QueryFormInstanceHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.QueryFormInstanceResponse:
        """
        @summary 查询数据表单
        
        @param request: QueryFormInstanceRequest
        @param headers: QueryFormInstanceHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: QueryFormInstanceResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.app_uuid):
            query['appUuid'] = request.app_uuid
        if not UtilClient.is_unset(request.form_code):
            query['formCode'] = request.form_code
        if not UtilClient.is_unset(request.form_instance_id):
            query['formInstanceId'] = request.form_instance_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='QueryFormInstance',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/forms/instances',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.QueryFormInstanceResponse(),
            self.execute(params, req, runtime)
        )

    async def query_form_instance_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.QueryFormInstanceRequest,
        headers: dingtalkworkflow__1__0_models.QueryFormInstanceHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.QueryFormInstanceResponse:
        """
        @summary 查询数据表单
        
        @param request: QueryFormInstanceRequest
        @param headers: QueryFormInstanceHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: QueryFormInstanceResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.app_uuid):
            query['appUuid'] = request.app_uuid
        if not UtilClient.is_unset(request.form_code):
            query['formCode'] = request.form_code
        if not UtilClient.is_unset(request.form_instance_id):
            query['formInstanceId'] = request.form_instance_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='QueryFormInstance',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/forms/instances',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.QueryFormInstanceResponse(),
            await self.execute_async(params, req, runtime)
        )

    def query_form_instance(
        self,
        request: dingtalkworkflow__1__0_models.QueryFormInstanceRequest,
    ) -> dingtalkworkflow__1__0_models.QueryFormInstanceResponse:
        """
        @summary 查询数据表单
        
        @param request: QueryFormInstanceRequest
        @return: QueryFormInstanceResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.QueryFormInstanceHeaders()
        return self.query_form_instance_with_options(request, headers, runtime)

    async def query_form_instance_async(
        self,
        request: dingtalkworkflow__1__0_models.QueryFormInstanceRequest,
    ) -> dingtalkworkflow__1__0_models.QueryFormInstanceResponse:
        """
        @summary 查询数据表单
        
        @param request: QueryFormInstanceRequest
        @return: QueryFormInstanceResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.QueryFormInstanceHeaders()
        return await self.query_form_instance_with_options_async(request, headers, runtime)

    def query_integrated_todo_task_with_options(
        self,
        request: dingtalkworkflow__1__0_models.QueryIntegratedTodoTaskRequest,
        headers: dingtalkworkflow__1__0_models.QueryIntegratedTodoTaskHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.QueryIntegratedTodoTaskResponse:
        """
        @summary 查询通过流程中心集成的OA审批任务
        
        @param request: QueryIntegratedTodoTaskRequest
        @param headers: QueryIntegratedTodoTaskHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: QueryIntegratedTodoTaskResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.create_before):
            query['createBefore'] = request.create_before
        if not UtilClient.is_unset(request.page_number):
            query['pageNumber'] = request.page_number
        if not UtilClient.is_unset(request.page_size):
            query['pageSize'] = request.page_size
        if not UtilClient.is_unset(request.user_id):
            query['userId'] = request.user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='QueryIntegratedTodoTask',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processCentres/todoTasks',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.QueryIntegratedTodoTaskResponse(),
            self.execute(params, req, runtime)
        )

    async def query_integrated_todo_task_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.QueryIntegratedTodoTaskRequest,
        headers: dingtalkworkflow__1__0_models.QueryIntegratedTodoTaskHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.QueryIntegratedTodoTaskResponse:
        """
        @summary 查询通过流程中心集成的OA审批任务
        
        @param request: QueryIntegratedTodoTaskRequest
        @param headers: QueryIntegratedTodoTaskHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: QueryIntegratedTodoTaskResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.create_before):
            query['createBefore'] = request.create_before
        if not UtilClient.is_unset(request.page_number):
            query['pageNumber'] = request.page_number
        if not UtilClient.is_unset(request.page_size):
            query['pageSize'] = request.page_size
        if not UtilClient.is_unset(request.user_id):
            query['userId'] = request.user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='QueryIntegratedTodoTask',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processCentres/todoTasks',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.QueryIntegratedTodoTaskResponse(),
            await self.execute_async(params, req, runtime)
        )

    def query_integrated_todo_task(
        self,
        request: dingtalkworkflow__1__0_models.QueryIntegratedTodoTaskRequest,
    ) -> dingtalkworkflow__1__0_models.QueryIntegratedTodoTaskResponse:
        """
        @summary 查询通过流程中心集成的OA审批任务
        
        @param request: QueryIntegratedTodoTaskRequest
        @return: QueryIntegratedTodoTaskResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.QueryIntegratedTodoTaskHeaders()
        return self.query_integrated_todo_task_with_options(request, headers, runtime)

    async def query_integrated_todo_task_async(
        self,
        request: dingtalkworkflow__1__0_models.QueryIntegratedTodoTaskRequest,
    ) -> dingtalkworkflow__1__0_models.QueryIntegratedTodoTaskResponse:
        """
        @summary 查询通过流程中心集成的OA审批任务
        
        @param request: QueryIntegratedTodoTaskRequest
        @return: QueryIntegratedTodoTaskResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.QueryIntegratedTodoTaskHeaders()
        return await self.query_integrated_todo_task_with_options_async(request, headers, runtime)

    def query_process_by_biz_category_id_with_options(
        self,
        request: dingtalkworkflow__1__0_models.QueryProcessByBizCategoryIdRequest,
        headers: dingtalkworkflow__1__0_models.QueryProcessByBizCategoryIdHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.QueryProcessByBizCategoryIdResponse:
        """
        @summary 根据业务标识查询模板
        
        @param request: QueryProcessByBizCategoryIdRequest
        @param headers: QueryProcessByBizCategoryIdHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: QueryProcessByBizCategoryIdResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.biz_type):
            query['bizType'] = request.biz_type
        if not UtilClient.is_unset(request.user_id):
            query['userId'] = request.user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='QueryProcessByBizCategoryId',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processes/categories/templates',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.QueryProcessByBizCategoryIdResponse(),
            self.execute(params, req, runtime)
        )

    async def query_process_by_biz_category_id_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.QueryProcessByBizCategoryIdRequest,
        headers: dingtalkworkflow__1__0_models.QueryProcessByBizCategoryIdHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.QueryProcessByBizCategoryIdResponse:
        """
        @summary 根据业务标识查询模板
        
        @param request: QueryProcessByBizCategoryIdRequest
        @param headers: QueryProcessByBizCategoryIdHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: QueryProcessByBizCategoryIdResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.biz_type):
            query['bizType'] = request.biz_type
        if not UtilClient.is_unset(request.user_id):
            query['userId'] = request.user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='QueryProcessByBizCategoryId',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processes/categories/templates',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.QueryProcessByBizCategoryIdResponse(),
            await self.execute_async(params, req, runtime)
        )

    def query_process_by_biz_category_id(
        self,
        request: dingtalkworkflow__1__0_models.QueryProcessByBizCategoryIdRequest,
    ) -> dingtalkworkflow__1__0_models.QueryProcessByBizCategoryIdResponse:
        """
        @summary 根据业务标识查询模板
        
        @param request: QueryProcessByBizCategoryIdRequest
        @return: QueryProcessByBizCategoryIdResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.QueryProcessByBizCategoryIdHeaders()
        return self.query_process_by_biz_category_id_with_options(request, headers, runtime)

    async def query_process_by_biz_category_id_async(
        self,
        request: dingtalkworkflow__1__0_models.QueryProcessByBizCategoryIdRequest,
    ) -> dingtalkworkflow__1__0_models.QueryProcessByBizCategoryIdResponse:
        """
        @summary 根据业务标识查询模板
        
        @param request: QueryProcessByBizCategoryIdRequest
        @return: QueryProcessByBizCategoryIdResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.QueryProcessByBizCategoryIdHeaders()
        return await self.query_process_by_biz_category_id_with_options_async(request, headers, runtime)

    def query_schema_and_process_with_options(
        self,
        request: dingtalkworkflow__1__0_models.QuerySchemaAndProcessRequest,
        headers: dingtalkworkflow__1__0_models.QuerySchemaAndProcessHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.QuerySchemaAndProcessResponse:
        """
        @summary 蓝凌获取schema和流程信息
        
        @param request: QuerySchemaAndProcessRequest
        @param headers: QuerySchemaAndProcessHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: QuerySchemaAndProcessResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.app_uuid):
            query['appUuid'] = request.app_uuid
        if not UtilClient.is_unset(request.process_code):
            query['processCode'] = request.process_code
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='QuerySchemaAndProcess',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/forms/schemaAndProcess',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.QuerySchemaAndProcessResponse(),
            self.execute(params, req, runtime)
        )

    async def query_schema_and_process_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.QuerySchemaAndProcessRequest,
        headers: dingtalkworkflow__1__0_models.QuerySchemaAndProcessHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.QuerySchemaAndProcessResponse:
        """
        @summary 蓝凌获取schema和流程信息
        
        @param request: QuerySchemaAndProcessRequest
        @param headers: QuerySchemaAndProcessHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: QuerySchemaAndProcessResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.app_uuid):
            query['appUuid'] = request.app_uuid
        if not UtilClient.is_unset(request.process_code):
            query['processCode'] = request.process_code
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='QuerySchemaAndProcess',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/forms/schemaAndProcess',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.QuerySchemaAndProcessResponse(),
            await self.execute_async(params, req, runtime)
        )

    def query_schema_and_process(
        self,
        request: dingtalkworkflow__1__0_models.QuerySchemaAndProcessRequest,
    ) -> dingtalkworkflow__1__0_models.QuerySchemaAndProcessResponse:
        """
        @summary 蓝凌获取schema和流程信息
        
        @param request: QuerySchemaAndProcessRequest
        @return: QuerySchemaAndProcessResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.QuerySchemaAndProcessHeaders()
        return self.query_schema_and_process_with_options(request, headers, runtime)

    async def query_schema_and_process_async(
        self,
        request: dingtalkworkflow__1__0_models.QuerySchemaAndProcessRequest,
    ) -> dingtalkworkflow__1__0_models.QuerySchemaAndProcessResponse:
        """
        @summary 蓝凌获取schema和流程信息
        
        @param request: QuerySchemaAndProcessRequest
        @return: QuerySchemaAndProcessResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.QuerySchemaAndProcessHeaders()
        return await self.query_schema_and_process_with_options_async(request, headers, runtime)

    def query_schema_by_process_code_with_options(
        self,
        request: dingtalkworkflow__1__0_models.QuerySchemaByProcessCodeRequest,
        headers: dingtalkworkflow__1__0_models.QuerySchemaByProcessCodeHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.QuerySchemaByProcessCodeResponse:
        """
        @summary  通过 processCode 获取表单 schema 信息
        
        @param request: QuerySchemaByProcessCodeRequest
        @param headers: QuerySchemaByProcessCodeHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: QuerySchemaByProcessCodeResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.app_uuid):
            query['appUuid'] = request.app_uuid
        if not UtilClient.is_unset(request.process_code):
            query['processCode'] = request.process_code
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='QuerySchemaByProcessCode',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/forms/schemas/processCodes',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.QuerySchemaByProcessCodeResponse(),
            self.execute(params, req, runtime)
        )

    async def query_schema_by_process_code_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.QuerySchemaByProcessCodeRequest,
        headers: dingtalkworkflow__1__0_models.QuerySchemaByProcessCodeHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.QuerySchemaByProcessCodeResponse:
        """
        @summary  通过 processCode 获取表单 schema 信息
        
        @param request: QuerySchemaByProcessCodeRequest
        @param headers: QuerySchemaByProcessCodeHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: QuerySchemaByProcessCodeResponse
        """
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.app_uuid):
            query['appUuid'] = request.app_uuid
        if not UtilClient.is_unset(request.process_code):
            query['processCode'] = request.process_code
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        params = open_api_models.Params(
            action='QuerySchemaByProcessCode',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/forms/schemas/processCodes',
            method='GET',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.QuerySchemaByProcessCodeResponse(),
            await self.execute_async(params, req, runtime)
        )

    def query_schema_by_process_code(
        self,
        request: dingtalkworkflow__1__0_models.QuerySchemaByProcessCodeRequest,
    ) -> dingtalkworkflow__1__0_models.QuerySchemaByProcessCodeResponse:
        """
        @summary  通过 processCode 获取表单 schema 信息
        
        @param request: QuerySchemaByProcessCodeRequest
        @return: QuerySchemaByProcessCodeResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.QuerySchemaByProcessCodeHeaders()
        return self.query_schema_by_process_code_with_options(request, headers, runtime)

    async def query_schema_by_process_code_async(
        self,
        request: dingtalkworkflow__1__0_models.QuerySchemaByProcessCodeRequest,
    ) -> dingtalkworkflow__1__0_models.QuerySchemaByProcessCodeResponse:
        """
        @summary  通过 processCode 获取表单 schema 信息
        
        @param request: QuerySchemaByProcessCodeRequest
        @return: QuerySchemaByProcessCodeResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.QuerySchemaByProcessCodeHeaders()
        return await self.query_schema_by_process_code_with_options_async(request, headers, runtime)

    def redirect_workflow_task_with_options(
        self,
        request: dingtalkworkflow__1__0_models.RedirectWorkflowTaskRequest,
        headers: dingtalkworkflow__1__0_models.RedirectWorkflowTaskHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.RedirectWorkflowTaskResponse:
        """
        @summary 转交OA审批任务
        
        @param request: RedirectWorkflowTaskRequest
        @param headers: RedirectWorkflowTaskHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: RedirectWorkflowTaskResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.action_name):
            body['actionName'] = request.action_name
        if not UtilClient.is_unset(request.file):
            body['file'] = request.file
        if not UtilClient.is_unset(request.operate_user_id):
            body['operateUserId'] = request.operate_user_id
        if not UtilClient.is_unset(request.remark):
            body['remark'] = request.remark
        if not UtilClient.is_unset(request.task_id):
            body['taskId'] = request.task_id
        if not UtilClient.is_unset(request.to_user_id):
            body['toUserId'] = request.to_user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='RedirectWorkflowTask',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/tasks/redirect',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.RedirectWorkflowTaskResponse(),
            self.execute(params, req, runtime)
        )

    async def redirect_workflow_task_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.RedirectWorkflowTaskRequest,
        headers: dingtalkworkflow__1__0_models.RedirectWorkflowTaskHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.RedirectWorkflowTaskResponse:
        """
        @summary 转交OA审批任务
        
        @param request: RedirectWorkflowTaskRequest
        @param headers: RedirectWorkflowTaskHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: RedirectWorkflowTaskResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.action_name):
            body['actionName'] = request.action_name
        if not UtilClient.is_unset(request.file):
            body['file'] = request.file
        if not UtilClient.is_unset(request.operate_user_id):
            body['operateUserId'] = request.operate_user_id
        if not UtilClient.is_unset(request.remark):
            body['remark'] = request.remark
        if not UtilClient.is_unset(request.task_id):
            body['taskId'] = request.task_id
        if not UtilClient.is_unset(request.to_user_id):
            body['toUserId'] = request.to_user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='RedirectWorkflowTask',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/tasks/redirect',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.RedirectWorkflowTaskResponse(),
            await self.execute_async(params, req, runtime)
        )

    def redirect_workflow_task(
        self,
        request: dingtalkworkflow__1__0_models.RedirectWorkflowTaskRequest,
    ) -> dingtalkworkflow__1__0_models.RedirectWorkflowTaskResponse:
        """
        @summary 转交OA审批任务
        
        @param request: RedirectWorkflowTaskRequest
        @return: RedirectWorkflowTaskResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.RedirectWorkflowTaskHeaders()
        return self.redirect_workflow_task_with_options(request, headers, runtime)

    async def redirect_workflow_task_async(
        self,
        request: dingtalkworkflow__1__0_models.RedirectWorkflowTaskRequest,
    ) -> dingtalkworkflow__1__0_models.RedirectWorkflowTaskResponse:
        """
        @summary 转交OA审批任务
        
        @param request: RedirectWorkflowTaskRequest
        @return: RedirectWorkflowTaskResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.RedirectWorkflowTaskHeaders()
        return await self.redirect_workflow_task_with_options_async(request, headers, runtime)

    def save_integrated_instance_with_options(
        self,
        request: dingtalkworkflow__1__0_models.SaveIntegratedInstanceRequest,
        headers: dingtalkworkflow__1__0_models.SaveIntegratedInstanceHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.SaveIntegratedInstanceResponse:
        """
        @summary 创建实例
        
        @param request: SaveIntegratedInstanceRequest
        @param headers: SaveIntegratedInstanceHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: SaveIntegratedInstanceResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.biz_data):
            body['bizData'] = request.biz_data
        if not UtilClient.is_unset(request.feature_config):
            body['featureConfig'] = request.feature_config
        if not UtilClient.is_unset(request.form_component_value_list):
            body['formComponentValueList'] = request.form_component_value_list
        if not UtilClient.is_unset(request.notifiers):
            body['notifiers'] = request.notifiers
        if not UtilClient.is_unset(request.originator_user_id):
            body['originatorUserId'] = request.originator_user_id
        if not UtilClient.is_unset(request.process_code):
            body['processCode'] = request.process_code
        if not UtilClient.is_unset(request.title):
            body['title'] = request.title
        if not UtilClient.is_unset(request.url):
            body['url'] = request.url
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='SaveIntegratedInstance',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processCentres/instances',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.SaveIntegratedInstanceResponse(),
            self.execute(params, req, runtime)
        )

    async def save_integrated_instance_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.SaveIntegratedInstanceRequest,
        headers: dingtalkworkflow__1__0_models.SaveIntegratedInstanceHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.SaveIntegratedInstanceResponse:
        """
        @summary 创建实例
        
        @param request: SaveIntegratedInstanceRequest
        @param headers: SaveIntegratedInstanceHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: SaveIntegratedInstanceResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.biz_data):
            body['bizData'] = request.biz_data
        if not UtilClient.is_unset(request.feature_config):
            body['featureConfig'] = request.feature_config
        if not UtilClient.is_unset(request.form_component_value_list):
            body['formComponentValueList'] = request.form_component_value_list
        if not UtilClient.is_unset(request.notifiers):
            body['notifiers'] = request.notifiers
        if not UtilClient.is_unset(request.originator_user_id):
            body['originatorUserId'] = request.originator_user_id
        if not UtilClient.is_unset(request.process_code):
            body['processCode'] = request.process_code
        if not UtilClient.is_unset(request.title):
            body['title'] = request.title
        if not UtilClient.is_unset(request.url):
            body['url'] = request.url
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='SaveIntegratedInstance',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processCentres/instances',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.SaveIntegratedInstanceResponse(),
            await self.execute_async(params, req, runtime)
        )

    def save_integrated_instance(
        self,
        request: dingtalkworkflow__1__0_models.SaveIntegratedInstanceRequest,
    ) -> dingtalkworkflow__1__0_models.SaveIntegratedInstanceResponse:
        """
        @summary 创建实例
        
        @param request: SaveIntegratedInstanceRequest
        @return: SaveIntegratedInstanceResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.SaveIntegratedInstanceHeaders()
        return self.save_integrated_instance_with_options(request, headers, runtime)

    async def save_integrated_instance_async(
        self,
        request: dingtalkworkflow__1__0_models.SaveIntegratedInstanceRequest,
    ) -> dingtalkworkflow__1__0_models.SaveIntegratedInstanceResponse:
        """
        @summary 创建实例
        
        @param request: SaveIntegratedInstanceRequest
        @return: SaveIntegratedInstanceResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.SaveIntegratedInstanceHeaders()
        return await self.save_integrated_instance_with_options_async(request, headers, runtime)

    def save_process_with_options(
        self,
        request: dingtalkworkflow__1__0_models.SaveProcessRequest,
        headers: dingtalkworkflow__1__0_models.SaveProcessHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.SaveProcessResponse:
        """
        @summary 创建或更新审批模板
        
        @param request: SaveProcessRequest
        @param headers: SaveProcessHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: SaveProcessResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.description):
            body['description'] = request.description
        if not UtilClient.is_unset(request.form_components):
            body['formComponents'] = request.form_components
        if not UtilClient.is_unset(request.name):
            body['name'] = request.name
        if not UtilClient.is_unset(request.process_code):
            body['processCode'] = request.process_code
        if not UtilClient.is_unset(request.process_feature_config):
            body['processFeatureConfig'] = request.process_feature_config
        if not UtilClient.is_unset(request.template_config):
            body['templateConfig'] = request.template_config
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='SaveProcess',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processCentres/schemas',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.SaveProcessResponse(),
            self.execute(params, req, runtime)
        )

    async def save_process_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.SaveProcessRequest,
        headers: dingtalkworkflow__1__0_models.SaveProcessHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.SaveProcessResponse:
        """
        @summary 创建或更新审批模板
        
        @param request: SaveProcessRequest
        @param headers: SaveProcessHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: SaveProcessResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.description):
            body['description'] = request.description
        if not UtilClient.is_unset(request.form_components):
            body['formComponents'] = request.form_components
        if not UtilClient.is_unset(request.name):
            body['name'] = request.name
        if not UtilClient.is_unset(request.process_code):
            body['processCode'] = request.process_code
        if not UtilClient.is_unset(request.process_feature_config):
            body['processFeatureConfig'] = request.process_feature_config
        if not UtilClient.is_unset(request.template_config):
            body['templateConfig'] = request.template_config
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='SaveProcess',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processCentres/schemas',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.SaveProcessResponse(),
            await self.execute_async(params, req, runtime)
        )

    def save_process(
        self,
        request: dingtalkworkflow__1__0_models.SaveProcessRequest,
    ) -> dingtalkworkflow__1__0_models.SaveProcessResponse:
        """
        @summary 创建或更新审批模板
        
        @param request: SaveProcessRequest
        @return: SaveProcessResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.SaveProcessHeaders()
        return self.save_process_with_options(request, headers, runtime)

    async def save_process_async(
        self,
        request: dingtalkworkflow__1__0_models.SaveProcessRequest,
    ) -> dingtalkworkflow__1__0_models.SaveProcessResponse:
        """
        @summary 创建或更新审批模板
        
        @param request: SaveProcessRequest
        @return: SaveProcessResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.SaveProcessHeaders()
        return await self.save_process_with_options_async(request, headers, runtime)

    def start_process_instance_with_options(
        self,
        request: dingtalkworkflow__1__0_models.StartProcessInstanceRequest,
        headers: dingtalkworkflow__1__0_models.StartProcessInstanceHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.StartProcessInstanceResponse:
        """
        @summary 创建审批实例
        
        @param request: StartProcessInstanceRequest
        @param headers: StartProcessInstanceHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: StartProcessInstanceResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.approvers):
            body['approvers'] = request.approvers
        if not UtilClient.is_unset(request.cc_list):
            body['ccList'] = request.cc_list
        if not UtilClient.is_unset(request.cc_position):
            body['ccPosition'] = request.cc_position
        if not UtilClient.is_unset(request.dept_id):
            body['deptId'] = request.dept_id
        if not UtilClient.is_unset(request.form_component_values):
            body['formComponentValues'] = request.form_component_values
        if not UtilClient.is_unset(request.microapp_agent_id):
            body['microappAgentId'] = request.microapp_agent_id
        if not UtilClient.is_unset(request.originator_user_id):
            body['originatorUserId'] = request.originator_user_id
        if not UtilClient.is_unset(request.process_code):
            body['processCode'] = request.process_code
        if not UtilClient.is_unset(request.target_select_actioners):
            body['targetSelectActioners'] = request.target_select_actioners
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='StartProcessInstance',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processInstances',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.StartProcessInstanceResponse(),
            self.execute(params, req, runtime)
        )

    async def start_process_instance_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.StartProcessInstanceRequest,
        headers: dingtalkworkflow__1__0_models.StartProcessInstanceHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.StartProcessInstanceResponse:
        """
        @summary 创建审批实例
        
        @param request: StartProcessInstanceRequest
        @param headers: StartProcessInstanceHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: StartProcessInstanceResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.approvers):
            body['approvers'] = request.approvers
        if not UtilClient.is_unset(request.cc_list):
            body['ccList'] = request.cc_list
        if not UtilClient.is_unset(request.cc_position):
            body['ccPosition'] = request.cc_position
        if not UtilClient.is_unset(request.dept_id):
            body['deptId'] = request.dept_id
        if not UtilClient.is_unset(request.form_component_values):
            body['formComponentValues'] = request.form_component_values
        if not UtilClient.is_unset(request.microapp_agent_id):
            body['microappAgentId'] = request.microapp_agent_id
        if not UtilClient.is_unset(request.originator_user_id):
            body['originatorUserId'] = request.originator_user_id
        if not UtilClient.is_unset(request.process_code):
            body['processCode'] = request.process_code
        if not UtilClient.is_unset(request.target_select_actioners):
            body['targetSelectActioners'] = request.target_select_actioners
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='StartProcessInstance',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processInstances',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.StartProcessInstanceResponse(),
            await self.execute_async(params, req, runtime)
        )

    def start_process_instance(
        self,
        request: dingtalkworkflow__1__0_models.StartProcessInstanceRequest,
    ) -> dingtalkworkflow__1__0_models.StartProcessInstanceResponse:
        """
        @summary 创建审批实例
        
        @param request: StartProcessInstanceRequest
        @return: StartProcessInstanceResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.StartProcessInstanceHeaders()
        return self.start_process_instance_with_options(request, headers, runtime)

    async def start_process_instance_async(
        self,
        request: dingtalkworkflow__1__0_models.StartProcessInstanceRequest,
    ) -> dingtalkworkflow__1__0_models.StartProcessInstanceResponse:
        """
        @summary 创建审批实例
        
        @param request: StartProcessInstanceRequest
        @return: StartProcessInstanceResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.StartProcessInstanceHeaders()
        return await self.start_process_instance_with_options_async(request, headers, runtime)

    def terminate_process_instance_with_options(
        self,
        request: dingtalkworkflow__1__0_models.TerminateProcessInstanceRequest,
        headers: dingtalkworkflow__1__0_models.TerminateProcessInstanceHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.TerminateProcessInstanceResponse:
        """
        @summary 撤销审批实例
        
        @param request: TerminateProcessInstanceRequest
        @param headers: TerminateProcessInstanceHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: TerminateProcessInstanceResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.is_system):
            body['isSystem'] = request.is_system
        if not UtilClient.is_unset(request.operating_user_id):
            body['operatingUserId'] = request.operating_user_id
        if not UtilClient.is_unset(request.process_instance_id):
            body['processInstanceId'] = request.process_instance_id
        if not UtilClient.is_unset(request.remark):
            body['remark'] = request.remark
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='TerminateProcessInstance',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processInstances/terminate',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.TerminateProcessInstanceResponse(),
            self.execute(params, req, runtime)
        )

    async def terminate_process_instance_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.TerminateProcessInstanceRequest,
        headers: dingtalkworkflow__1__0_models.TerminateProcessInstanceHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.TerminateProcessInstanceResponse:
        """
        @summary 撤销审批实例
        
        @param request: TerminateProcessInstanceRequest
        @param headers: TerminateProcessInstanceHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: TerminateProcessInstanceResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.is_system):
            body['isSystem'] = request.is_system
        if not UtilClient.is_unset(request.operating_user_id):
            body['operatingUserId'] = request.operating_user_id
        if not UtilClient.is_unset(request.process_instance_id):
            body['processInstanceId'] = request.process_instance_id
        if not UtilClient.is_unset(request.remark):
            body['remark'] = request.remark
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='TerminateProcessInstance',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processInstances/terminate',
            method='POST',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.TerminateProcessInstanceResponse(),
            await self.execute_async(params, req, runtime)
        )

    def terminate_process_instance(
        self,
        request: dingtalkworkflow__1__0_models.TerminateProcessInstanceRequest,
    ) -> dingtalkworkflow__1__0_models.TerminateProcessInstanceResponse:
        """
        @summary 撤销审批实例
        
        @param request: TerminateProcessInstanceRequest
        @return: TerminateProcessInstanceResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.TerminateProcessInstanceHeaders()
        return self.terminate_process_instance_with_options(request, headers, runtime)

    async def terminate_process_instance_async(
        self,
        request: dingtalkworkflow__1__0_models.TerminateProcessInstanceRequest,
    ) -> dingtalkworkflow__1__0_models.TerminateProcessInstanceResponse:
        """
        @summary 撤销审批实例
        
        @param request: TerminateProcessInstanceRequest
        @return: TerminateProcessInstanceResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.TerminateProcessInstanceHeaders()
        return await self.terminate_process_instance_with_options_async(request, headers, runtime)

    def update_integrated_task_with_options(
        self,
        request: dingtalkworkflow__1__0_models.UpdateIntegratedTaskRequest,
        headers: dingtalkworkflow__1__0_models.UpdateIntegratedTaskHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.UpdateIntegratedTaskResponse:
        """
        @summary 更新流程中心任务状态
        
        @param request: UpdateIntegratedTaskRequest
        @param headers: UpdateIntegratedTaskHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: UpdateIntegratedTaskResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.process_instance_id):
            body['processInstanceId'] = request.process_instance_id
        if not UtilClient.is_unset(request.tasks):
            body['tasks'] = request.tasks
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='UpdateIntegratedTask',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processCentres/tasks',
            method='PUT',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.UpdateIntegratedTaskResponse(),
            self.execute(params, req, runtime)
        )

    async def update_integrated_task_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.UpdateIntegratedTaskRequest,
        headers: dingtalkworkflow__1__0_models.UpdateIntegratedTaskHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.UpdateIntegratedTaskResponse:
        """
        @summary 更新流程中心任务状态
        
        @param request: UpdateIntegratedTaskRequest
        @param headers: UpdateIntegratedTaskHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: UpdateIntegratedTaskResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.process_instance_id):
            body['processInstanceId'] = request.process_instance_id
        if not UtilClient.is_unset(request.tasks):
            body['tasks'] = request.tasks
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='UpdateIntegratedTask',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processCentres/tasks',
            method='PUT',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.UpdateIntegratedTaskResponse(),
            await self.execute_async(params, req, runtime)
        )

    def update_integrated_task(
        self,
        request: dingtalkworkflow__1__0_models.UpdateIntegratedTaskRequest,
    ) -> dingtalkworkflow__1__0_models.UpdateIntegratedTaskResponse:
        """
        @summary 更新流程中心任务状态
        
        @param request: UpdateIntegratedTaskRequest
        @return: UpdateIntegratedTaskResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.UpdateIntegratedTaskHeaders()
        return self.update_integrated_task_with_options(request, headers, runtime)

    async def update_integrated_task_async(
        self,
        request: dingtalkworkflow__1__0_models.UpdateIntegratedTaskRequest,
    ) -> dingtalkworkflow__1__0_models.UpdateIntegratedTaskResponse:
        """
        @summary 更新流程中心任务状态
        
        @param request: UpdateIntegratedTaskRequest
        @return: UpdateIntegratedTaskResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.UpdateIntegratedTaskHeaders()
        return await self.update_integrated_task_with_options_async(request, headers, runtime)

    def update_process_instance_with_options(
        self,
        request: dingtalkworkflow__1__0_models.UpdateProcessInstanceRequest,
        headers: dingtalkworkflow__1__0_models.UpdateProcessInstanceHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.UpdateProcessInstanceResponse:
        """
        @summary 更新实例状态
        
        @param request: UpdateProcessInstanceRequest
        @param headers: UpdateProcessInstanceHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: UpdateProcessInstanceResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.notifiers):
            body['notifiers'] = request.notifiers
        if not UtilClient.is_unset(request.process_instance_id):
            body['processInstanceId'] = request.process_instance_id
        if not UtilClient.is_unset(request.result):
            body['result'] = request.result
        if not UtilClient.is_unset(request.status):
            body['status'] = request.status
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='UpdateProcessInstance',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processCentres/instances',
            method='PUT',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.UpdateProcessInstanceResponse(),
            self.execute(params, req, runtime)
        )

    async def update_process_instance_with_options_async(
        self,
        request: dingtalkworkflow__1__0_models.UpdateProcessInstanceRequest,
        headers: dingtalkworkflow__1__0_models.UpdateProcessInstanceHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkworkflow__1__0_models.UpdateProcessInstanceResponse:
        """
        @summary 更新实例状态
        
        @param request: UpdateProcessInstanceRequest
        @param headers: UpdateProcessInstanceHeaders
        @param runtime: runtime options for this request RuntimeOptions
        @return: UpdateProcessInstanceResponse
        """
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.notifiers):
            body['notifiers'] = request.notifiers
        if not UtilClient.is_unset(request.process_instance_id):
            body['processInstanceId'] = request.process_instance_id
        if not UtilClient.is_unset(request.result):
            body['result'] = request.result
        if not UtilClient.is_unset(request.status):
            body['status'] = request.status
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        params = open_api_models.Params(
            action='UpdateProcessInstance',
            version='workflow_1.0',
            protocol='HTTP',
            pathname=f'/v1.0/workflow/processCentres/instances',
            method='PUT',
            auth_type='AK',
            style='ROA',
            req_body_type='none',
            body_type='json'
        )
        return TeaCore.from_map(
            dingtalkworkflow__1__0_models.UpdateProcessInstanceResponse(),
            await self.execute_async(params, req, runtime)
        )

    def update_process_instance(
        self,
        request: dingtalkworkflow__1__0_models.UpdateProcessInstanceRequest,
    ) -> dingtalkworkflow__1__0_models.UpdateProcessInstanceResponse:
        """
        @summary 更新实例状态
        
        @param request: UpdateProcessInstanceRequest
        @return: UpdateProcessInstanceResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.UpdateProcessInstanceHeaders()
        return self.update_process_instance_with_options(request, headers, runtime)

    async def update_process_instance_async(
        self,
        request: dingtalkworkflow__1__0_models.UpdateProcessInstanceRequest,
    ) -> dingtalkworkflow__1__0_models.UpdateProcessInstanceResponse:
        """
        @summary 更新实例状态
        
        @param request: UpdateProcessInstanceRequest
        @return: UpdateProcessInstanceResponse
        """
        runtime = util_models.RuntimeOptions()
        headers = dingtalkworkflow__1__0_models.UpdateProcessInstanceHeaders()
        return await self.update_process_instance_with_options_async(request, headers, runtime)
