<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0;

use AlibabaCloud\OpenApiUtil\OpenApiUtilClient;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\AddApproveDentryAuthHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\AddApproveDentryAuthRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\AddApproveDentryAuthResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\AddProcessInstanceCommentHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\AddProcessInstanceCommentRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\AddProcessInstanceCommentResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\BatchExecuteProcessInstancesHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\BatchExecuteProcessInstancesRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\BatchExecuteProcessInstancesResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\BatchUpdateProcessInstanceHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\BatchUpdateProcessInstanceRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\BatchUpdateProcessInstanceResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\CancelIntegratedTaskHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\CancelIntegratedTaskRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\CancelIntegratedTaskResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\CleanProcessDataHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\CleanProcessDataRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\CleanProcessDataResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\CopyProcessHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\CopyProcessRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\CopyProcessResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\CreateIntegratedTaskHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\CreateIntegratedTaskRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\CreateIntegratedTaskResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\DeleteProcessHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\DeleteProcessRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\DeleteProcessResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\ExecuteProcessInstanceHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\ExecuteProcessInstanceRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\ExecuteProcessInstanceResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\FormCreateHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\FormCreateRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\FormCreateResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetAttachmentSpaceHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetAttachmentSpaceRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetAttachmentSpaceResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetConditionFormComponentHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetConditionFormComponentRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetConditionFormComponentResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetCrmProcCodesHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetCrmProcCodesResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetFieldModifiedHistoryHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetFieldModifiedHistoryRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetFieldModifiedHistoryResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetManageProcessByStaffIdHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetManageProcessByStaffIdRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetManageProcessByStaffIdResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetProcessCodeByNameHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetProcessCodeByNameRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetProcessCodeByNameResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetProcessConfigHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetProcessConfigRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetProcessConfigResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetProcessInstanceHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetProcessInstanceRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetProcessInstanceResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetSchemaAndProcessconfigBatchllyHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetSchemaAndProcessconfigBatchllyRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetSchemaAndProcessconfigBatchllyResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetSchemaAndProcessconfigBatchllyShrinkRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetSpaceWithDownloadAuthHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetSpaceWithDownloadAuthRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetSpaceWithDownloadAuthResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetUserTodoTaskSumHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetUserTodoTaskSumRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GetUserTodoTaskSumResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GrantCspaceAuthorizationHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GrantCspaceAuthorizationRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GrantCspaceAuthorizationResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GrantProcessInstanceForDownloadFileHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GrantProcessInstanceForDownloadFileRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\GrantProcessInstanceForDownloadFileResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\InstallAppHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\InstallAppRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\InstallAppResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\ListProcessInstanceIdsHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\ListProcessInstanceIdsRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\ListProcessInstanceIdsResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\ListTodoWorkRecordsHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\ListTodoWorkRecordsRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\ListTodoWorkRecordsResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\ListUserVisibleBpmsProcessesHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\ListUserVisibleBpmsProcessesRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\ListUserVisibleBpmsProcessesResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\PagesExportInstancesHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\PagesExportInstancesRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\PagesExportInstancesResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\ProcessForecastHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\ProcessForecastRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\ProcessForecastResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\QueryAllFormInstancesHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\QueryAllFormInstancesRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\QueryAllFormInstancesResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\QueryAllProcessInstancesHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\QueryAllProcessInstancesRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\QueryAllProcessInstancesResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\QueryFormByBizTypeHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\QueryFormByBizTypeRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\QueryFormByBizTypeResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\QueryFormInstanceHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\QueryFormInstanceRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\QueryFormInstanceResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\QueryIntegratedTodoTaskHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\QueryIntegratedTodoTaskRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\QueryIntegratedTodoTaskResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\QueryProcessByBizCategoryIdHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\QueryProcessByBizCategoryIdRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\QueryProcessByBizCategoryIdResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\QuerySchemaAndProcessHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\QuerySchemaAndProcessRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\QuerySchemaAndProcessResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\QuerySchemaByProcessCodeHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\QuerySchemaByProcessCodeRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\QuerySchemaByProcessCodeResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\RedirectWorkflowTaskHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\RedirectWorkflowTaskRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\RedirectWorkflowTaskResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\SaveIntegratedInstanceHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\SaveIntegratedInstanceRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\SaveIntegratedInstanceResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\SaveProcessHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\SaveProcessRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\SaveProcessResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\StartProcessInstanceHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\StartProcessInstanceRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\StartProcessInstanceResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\TerminateProcessInstanceHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\TerminateProcessInstanceRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\TerminateProcessInstanceResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\UpdateIntegratedTaskHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\UpdateIntegratedTaskRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\UpdateIntegratedTaskResponse;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\UpdateProcessInstanceHeaders;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\UpdateProcessInstanceRequest;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\UpdateProcessInstanceResponse;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use Darabonba\GatewayDingTalk\Client as DarabonbaGatewayDingTalkClient;
use Darabonba\OpenApi\Models\OpenApiRequest;
use Darabonba\OpenApi\Models\Params;
use Darabonba\OpenApi\OpenApiClient;

class Dingtalk extends OpenApiClient
{
    protected $_client;

    public function __construct($config)
    {
        parent::__construct($config);
        $this->_client       = new DarabonbaGatewayDingTalkClient();
        $this->_spi          = $this->_client;
        $this->_endpointRule = '';
        if (Utils::empty_($this->_endpoint)) {
            $this->_endpoint = 'api.dingtalk.com';
        }
    }

    /**
     * @summary 授权下载审批钉盘文件
     *  *
     * @param AddApproveDentryAuthRequest $request AddApproveDentryAuthRequest
     * @param AddApproveDentryAuthHeaders $headers AddApproveDentryAuthHeaders
     * @param RuntimeOptions              $runtime runtime options for this request RuntimeOptions
     *
     * @return AddApproveDentryAuthResponse AddApproveDentryAuthResponse
     */
    public function addApproveDentryAuthWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $body = [];
        if (!Utils::isUnset($request->fileInfos)) {
            $body['fileInfos'] = $request->fileInfos;
        }
        if (!Utils::isUnset($request->userId)) {
            $body['userId'] = $request->userId;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'body'    => OpenApiUtilClient::parseToMap($body),
        ]);
        $params = new Params([
            'action'      => 'AddApproveDentryAuth',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processInstances/spaces/files/authDownload',
            'method'      => 'POST',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return AddApproveDentryAuthResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 授权下载审批钉盘文件
     *  *
     * @param AddApproveDentryAuthRequest $request AddApproveDentryAuthRequest
     *
     * @return AddApproveDentryAuthResponse AddApproveDentryAuthResponse
     */
    public function addApproveDentryAuth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new AddApproveDentryAuthHeaders([]);

        return $this->addApproveDentryAuthWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 添加审批评论
     *  *
     * @param AddProcessInstanceCommentRequest $request AddProcessInstanceCommentRequest
     * @param AddProcessInstanceCommentHeaders $headers AddProcessInstanceCommentHeaders
     * @param RuntimeOptions                   $runtime runtime options for this request RuntimeOptions
     *
     * @return AddProcessInstanceCommentResponse AddProcessInstanceCommentResponse
     */
    public function addProcessInstanceCommentWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $body = [];
        if (!Utils::isUnset($request->commentUserId)) {
            $body['commentUserId'] = $request->commentUserId;
        }
        if (!Utils::isUnset($request->file)) {
            $body['file'] = $request->file;
        }
        if (!Utils::isUnset($request->processInstanceId)) {
            $body['processInstanceId'] = $request->processInstanceId;
        }
        if (!Utils::isUnset($request->text)) {
            $body['text'] = $request->text;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'body'    => OpenApiUtilClient::parseToMap($body),
        ]);
        $params = new Params([
            'action'      => 'AddProcessInstanceComment',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processInstances/comments',
            'method'      => 'POST',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return AddProcessInstanceCommentResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 添加审批评论
     *  *
     * @param AddProcessInstanceCommentRequest $request AddProcessInstanceCommentRequest
     *
     * @return AddProcessInstanceCommentResponse AddProcessInstanceCommentResponse
     */
    public function addProcessInstanceComment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new AddProcessInstanceCommentHeaders([]);

        return $this->addProcessInstanceCommentWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 批量同意或拒绝审批任务
     *  *
     * @param BatchExecuteProcessInstancesRequest $request BatchExecuteProcessInstancesRequest
     * @param BatchExecuteProcessInstancesHeaders $headers BatchExecuteProcessInstancesHeaders
     * @param RuntimeOptions                      $runtime runtime options for this request RuntimeOptions
     *
     * @return BatchExecuteProcessInstancesResponse BatchExecuteProcessInstancesResponse
     */
    public function batchExecuteProcessInstancesWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $body = [];
        if (!Utils::isUnset($request->actionerUserId)) {
            $body['actionerUserId'] = $request->actionerUserId;
        }
        if (!Utils::isUnset($request->remark)) {
            $body['remark'] = $request->remark;
        }
        if (!Utils::isUnset($request->result)) {
            $body['result'] = $request->result;
        }
        if (!Utils::isUnset($request->taskInfoList)) {
            $body['taskInfoList'] = $request->taskInfoList;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'body'    => OpenApiUtilClient::parseToMap($body),
        ]);
        $params = new Params([
            'action'      => 'BatchExecuteProcessInstances',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processInstances/batchExecute',
            'method'      => 'POST',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return BatchExecuteProcessInstancesResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 批量同意或拒绝审批任务
     *  *
     * @param BatchExecuteProcessInstancesRequest $request BatchExecuteProcessInstancesRequest
     *
     * @return BatchExecuteProcessInstancesResponse BatchExecuteProcessInstancesResponse
     */
    public function batchExecuteProcessInstances($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new BatchExecuteProcessInstancesHeaders([]);

        return $this->batchExecuteProcessInstancesWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 批量更新实例状态
     *  *
     * @param BatchUpdateProcessInstanceRequest $request BatchUpdateProcessInstanceRequest
     * @param BatchUpdateProcessInstanceHeaders $headers BatchUpdateProcessInstanceHeaders
     * @param RuntimeOptions                    $runtime runtime options for this request RuntimeOptions
     *
     * @return BatchUpdateProcessInstanceResponse BatchUpdateProcessInstanceResponse
     */
    public function batchUpdateProcessInstanceWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $body = [];
        if (!Utils::isUnset($request->updateProcessInstanceRequests)) {
            $body['updateProcessInstanceRequests'] = $request->updateProcessInstanceRequests;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'body'    => OpenApiUtilClient::parseToMap($body),
        ]);
        $params = new Params([
            'action'      => 'BatchUpdateProcessInstance',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processCentres/instances/batch',
            'method'      => 'PUT',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return BatchUpdateProcessInstanceResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 批量更新实例状态
     *  *
     * @param BatchUpdateProcessInstanceRequest $request BatchUpdateProcessInstanceRequest
     *
     * @return BatchUpdateProcessInstanceResponse BatchUpdateProcessInstanceResponse
     */
    public function batchUpdateProcessInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new BatchUpdateProcessInstanceHeaders([]);

        return $this->batchUpdateProcessInstanceWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 批量取消流程中心待处理任务
     *  *
     * @param CancelIntegratedTaskRequest $request CancelIntegratedTaskRequest
     * @param CancelIntegratedTaskHeaders $headers CancelIntegratedTaskHeaders
     * @param RuntimeOptions              $runtime runtime options for this request RuntimeOptions
     *
     * @return CancelIntegratedTaskResponse CancelIntegratedTaskResponse
     */
    public function cancelIntegratedTaskWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $body = [];
        if (!Utils::isUnset($request->activityId)) {
            $body['activityId'] = $request->activityId;
        }
        if (!Utils::isUnset($request->activityIds)) {
            $body['activityIds'] = $request->activityIds;
        }
        if (!Utils::isUnset($request->processInstanceId)) {
            $body['processInstanceId'] = $request->processInstanceId;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'body'    => OpenApiUtilClient::parseToMap($body),
        ]);
        $params = new Params([
            'action'      => 'CancelIntegratedTask',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processCentres/tasks/cancel',
            'method'      => 'POST',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return CancelIntegratedTaskResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 批量取消流程中心待处理任务
     *  *
     * @param CancelIntegratedTaskRequest $request CancelIntegratedTaskRequest
     *
     * @return CancelIntegratedTaskResponse CancelIntegratedTaskResponse
     */
    public function cancelIntegratedTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new CancelIntegratedTaskHeaders([]);

        return $this->cancelIntegratedTaskWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 清理审批数据
     *  *
     * @param CleanProcessDataRequest $request CleanProcessDataRequest
     * @param CleanProcessDataHeaders $headers CleanProcessDataHeaders
     * @param RuntimeOptions          $runtime runtime options for this request RuntimeOptions
     *
     * @return CleanProcessDataResponse CleanProcessDataResponse
     */
    public function cleanProcessDataWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $body = [];
        if (!Utils::isUnset($request->corpId)) {
            $body['corpId'] = $request->corpId;
        }
        if (!Utils::isUnset($request->processCode)) {
            $body['processCode'] = $request->processCode;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'body'    => OpenApiUtilClient::parseToMap($body),
        ]);
        $params = new Params([
            'action'      => 'CleanProcessData',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processes/clean',
            'method'      => 'POST',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return CleanProcessDataResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 清理审批数据
     *  *
     * @param CleanProcessDataRequest $request CleanProcessDataRequest
     *
     * @return CleanProcessDataResponse CleanProcessDataResponse
     */
    public function cleanProcessData($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new CleanProcessDataHeaders([]);

        return $this->cleanProcessDataWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 复制审批流
     *  *
     * @param CopyProcessRequest $request CopyProcessRequest
     * @param CopyProcessHeaders $headers CopyProcessHeaders
     * @param RuntimeOptions     $runtime runtime options for this request RuntimeOptions
     *
     * @return CopyProcessResponse CopyProcessResponse
     */
    public function copyProcessWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $body = [];
        if (!Utils::isUnset($request->copyOptions)) {
            $body['copyOptions'] = $request->copyOptions;
        }
        if (!Utils::isUnset($request->sourceCorpId)) {
            $body['sourceCorpId'] = $request->sourceCorpId;
        }
        if (!Utils::isUnset($request->sourceProcessVOList)) {
            $body['sourceProcessVOList'] = $request->sourceProcessVOList;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'body'    => OpenApiUtilClient::parseToMap($body),
        ]);
        $params = new Params([
            'action'      => 'CopyProcess',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processes/copy',
            'method'      => 'POST',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return CopyProcessResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 复制审批流
     *  *
     * @param CopyProcessRequest $request CopyProcessRequest
     *
     * @return CopyProcessResponse CopyProcessResponse
     */
    public function copyProcess($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new CopyProcessHeaders([]);

        return $this->copyProcessWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 创建流程中心待处理任务
     *  *
     * @param CreateIntegratedTaskRequest $request CreateIntegratedTaskRequest
     * @param CreateIntegratedTaskHeaders $headers CreateIntegratedTaskHeaders
     * @param RuntimeOptions              $runtime runtime options for this request RuntimeOptions
     *
     * @return CreateIntegratedTaskResponse CreateIntegratedTaskResponse
     */
    public function createIntegratedTaskWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $body = [];
        if (!Utils::isUnset($request->activityId)) {
            $body['activityId'] = $request->activityId;
        }
        if (!Utils::isUnset($request->processInstanceId)) {
            $body['processInstanceId'] = $request->processInstanceId;
        }
        if (!Utils::isUnset($request->tasks)) {
            $body['tasks'] = $request->tasks;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'body'    => OpenApiUtilClient::parseToMap($body),
        ]);
        $params = new Params([
            'action'      => 'CreateIntegratedTask',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processCentres/tasks',
            'method'      => 'POST',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return CreateIntegratedTaskResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 创建流程中心待处理任务
     *  *
     * @param CreateIntegratedTaskRequest $request CreateIntegratedTaskRequest
     *
     * @return CreateIntegratedTaskResponse CreateIntegratedTaskResponse
     */
    public function createIntegratedTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new CreateIntegratedTaskHeaders([]);

        return $this->createIntegratedTaskWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 删除模板
     *  *
     * @param DeleteProcessRequest $request DeleteProcessRequest
     * @param DeleteProcessHeaders $headers DeleteProcessHeaders
     * @param RuntimeOptions       $runtime runtime options for this request RuntimeOptions
     *
     * @return DeleteProcessResponse DeleteProcessResponse
     */
    public function deleteProcessWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $query = [];
        if (!Utils::isUnset($request->cleanRunningTask)) {
            $query['cleanRunningTask'] = $request->cleanRunningTask;
        }
        if (!Utils::isUnset($request->processCode)) {
            $query['processCode'] = $request->processCode;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'query'   => OpenApiUtilClient::query($query),
        ]);
        $params = new Params([
            'action'      => 'DeleteProcess',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processCentres/schemas',
            'method'      => 'DELETE',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return DeleteProcessResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 删除模板
     *  *
     * @param DeleteProcessRequest $request DeleteProcessRequest
     *
     * @return DeleteProcessResponse DeleteProcessResponse
     */
    public function deleteProcess($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new DeleteProcessHeaders([]);

        return $this->deleteProcessWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 同意或拒绝审批任务
     *  *
     * @param ExecuteProcessInstanceRequest $request ExecuteProcessInstanceRequest
     * @param ExecuteProcessInstanceHeaders $headers ExecuteProcessInstanceHeaders
     * @param RuntimeOptions                $runtime runtime options for this request RuntimeOptions
     *
     * @return ExecuteProcessInstanceResponse ExecuteProcessInstanceResponse
     */
    public function executeProcessInstanceWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $body = [];
        if (!Utils::isUnset($request->actionerUserId)) {
            $body['actionerUserId'] = $request->actionerUserId;
        }
        if (!Utils::isUnset($request->file)) {
            $body['file'] = $request->file;
        }
        if (!Utils::isUnset($request->processInstanceId)) {
            $body['processInstanceId'] = $request->processInstanceId;
        }
        if (!Utils::isUnset($request->remark)) {
            $body['remark'] = $request->remark;
        }
        if (!Utils::isUnset($request->result)) {
            $body['result'] = $request->result;
        }
        if (!Utils::isUnset($request->taskId)) {
            $body['taskId'] = $request->taskId;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'body'    => OpenApiUtilClient::parseToMap($body),
        ]);
        $params = new Params([
            'action'      => 'ExecuteProcessInstance',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processInstances/execute',
            'method'      => 'POST',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return ExecuteProcessInstanceResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 同意或拒绝审批任务
     *  *
     * @param ExecuteProcessInstanceRequest $request ExecuteProcessInstanceRequest
     *
     * @return ExecuteProcessInstanceResponse ExecuteProcessInstanceResponse
     */
    public function executeProcessInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new ExecuteProcessInstanceHeaders([]);

        return $this->executeProcessInstanceWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 创建或更新审批表单模板
     *  *
     * @param FormCreateRequest $request FormCreateRequest
     * @param FormCreateHeaders $headers FormCreateHeaders
     * @param RuntimeOptions    $runtime runtime options for this request RuntimeOptions
     *
     * @return FormCreateResponse FormCreateResponse
     */
    public function formCreateWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $body = [];
        if (!Utils::isUnset($request->description)) {
            $body['description'] = $request->description;
        }
        if (!Utils::isUnset($request->formComponents)) {
            $body['formComponents'] = $request->formComponents;
        }
        if (!Utils::isUnset($request->name)) {
            $body['name'] = $request->name;
        }
        if (!Utils::isUnset($request->processCode)) {
            $body['processCode'] = $request->processCode;
        }
        if (!Utils::isUnset($request->templateConfig)) {
            $body['templateConfig'] = $request->templateConfig;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'body'    => OpenApiUtilClient::parseToMap($body),
        ]);
        $params = new Params([
            'action'      => 'FormCreate',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/forms',
            'method'      => 'POST',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return FormCreateResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 创建或更新审批表单模板
     *  *
     * @param FormCreateRequest $request FormCreateRequest
     *
     * @return FormCreateResponse FormCreateResponse
     */
    public function formCreate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new FormCreateHeaders([]);

        return $this->formCreateWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 获取审批钉盘空间信息
     *  *
     * @param GetAttachmentSpaceRequest $request GetAttachmentSpaceRequest
     * @param GetAttachmentSpaceHeaders $headers GetAttachmentSpaceHeaders
     * @param RuntimeOptions            $runtime runtime options for this request RuntimeOptions
     *
     * @return GetAttachmentSpaceResponse GetAttachmentSpaceResponse
     */
    public function getAttachmentSpaceWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $body = [];
        if (!Utils::isUnset($request->agentId)) {
            $body['agentId'] = $request->agentId;
        }
        if (!Utils::isUnset($request->userId)) {
            $body['userId'] = $request->userId;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'body'    => OpenApiUtilClient::parseToMap($body),
        ]);
        $params = new Params([
            'action'      => 'GetAttachmentSpace',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processInstances/spaces/infos/query',
            'method'      => 'POST',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return GetAttachmentSpaceResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 获取审批钉盘空间信息
     *  *
     * @param GetAttachmentSpaceRequest $request GetAttachmentSpaceRequest
     *
     * @return GetAttachmentSpaceResponse GetAttachmentSpaceResponse
     */
    public function getAttachmentSpace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new GetAttachmentSpaceHeaders([]);

        return $this->getAttachmentSpaceWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 查询已设置为条件的表单组件
     *  *
     * @param GetConditionFormComponentRequest $request GetConditionFormComponentRequest
     * @param GetConditionFormComponentHeaders $headers GetConditionFormComponentHeaders
     * @param RuntimeOptions                   $runtime runtime options for this request RuntimeOptions
     *
     * @return GetConditionFormComponentResponse GetConditionFormComponentResponse
     */
    public function getConditionFormComponentWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $query = [];
        if (!Utils::isUnset($request->agentId)) {
            $query['agentId'] = $request->agentId;
        }
        if (!Utils::isUnset($request->processCode)) {
            $query['processCode'] = $request->processCode;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'query'   => OpenApiUtilClient::query($query),
        ]);
        $params = new Params([
            'action'      => 'GetConditionFormComponent',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processes/conditions/components',
            'method'      => 'GET',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return GetConditionFormComponentResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 查询已设置为条件的表单组件
     *  *
     * @param GetConditionFormComponentRequest $request GetConditionFormComponentRequest
     *
     * @return GetConditionFormComponentResponse GetConditionFormComponentResponse
     */
    public function getConditionFormComponent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new GetConditionFormComponentHeaders([]);

        return $this->getConditionFormComponentWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 获取CRM所有流程code
     *  *
     * @param GetCrmProcCodesHeaders $headers GetCrmProcCodesHeaders
     * @param RuntimeOptions         $runtime runtime options for this request RuntimeOptions
     *
     * @return GetCrmProcCodesResponse GetCrmProcCodesResponse
     */
    public function getCrmProcCodesWithOptions($headers, $runtime)
    {
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
        ]);
        $params = new Params([
            'action'      => 'GetCrmProcCodes',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/crm/processes',
            'method'      => 'GET',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return GetCrmProcCodesResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 获取CRM所有流程code
     *  *
     * @return GetCrmProcCodesResponse GetCrmProcCodesResponse
     */
    public function getCrmProcCodes()
    {
        $runtime = new RuntimeOptions([]);
        $headers = new GetCrmProcCodesHeaders([]);

        return $this->getCrmProcCodesWithOptions($headers, $runtime);
    }

    /**
     * @summary 获取表单字段修改历史
     *  *
     * @param GetFieldModifiedHistoryRequest $request GetFieldModifiedHistoryRequest
     * @param GetFieldModifiedHistoryHeaders $headers GetFieldModifiedHistoryHeaders
     * @param RuntimeOptions                 $runtime runtime options for this request RuntimeOptions
     *
     * @return GetFieldModifiedHistoryResponse GetFieldModifiedHistoryResponse
     */
    public function getFieldModifiedHistoryWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $body = [];
        if (!Utils::isUnset($request->fieldId)) {
            $body['fieldId'] = $request->fieldId;
        }
        if (!Utils::isUnset($request->processInstanceId)) {
            $body['processInstanceId'] = $request->processInstanceId;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'body'    => OpenApiUtilClient::parseToMap($body),
        ]);
        $params = new Params([
            'action'      => 'GetFieldModifiedHistory',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processes/fields/modifiedRecords/query',
            'method'      => 'POST',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return GetFieldModifiedHistoryResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 获取表单字段修改历史
     *  *
     * @param GetFieldModifiedHistoryRequest $request GetFieldModifiedHistoryRequest
     *
     * @return GetFieldModifiedHistoryResponse GetFieldModifiedHistoryResponse
     */
    public function getFieldModifiedHistory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new GetFieldModifiedHistoryHeaders([]);

        return $this->getFieldModifiedHistoryWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 获取当前企业所有可管理的表单
     *  *
     * @param GetManageProcessByStaffIdRequest $request GetManageProcessByStaffIdRequest
     * @param GetManageProcessByStaffIdHeaders $headers GetManageProcessByStaffIdHeaders
     * @param RuntimeOptions                   $runtime runtime options for this request RuntimeOptions
     *
     * @return GetManageProcessByStaffIdResponse GetManageProcessByStaffIdResponse
     */
    public function getManageProcessByStaffIdWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $query = [];
        if (!Utils::isUnset($request->userId)) {
            $query['userId'] = $request->userId;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'query'   => OpenApiUtilClient::query($query),
        ]);
        $params = new Params([
            'action'      => 'GetManageProcessByStaffId',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processes/managements/templates',
            'method'      => 'GET',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return GetManageProcessByStaffIdResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 获取当前企业所有可管理的表单
     *  *
     * @param GetManageProcessByStaffIdRequest $request GetManageProcessByStaffIdRequest
     *
     * @return GetManageProcessByStaffIdResponse GetManageProcessByStaffIdResponse
     */
    public function getManageProcessByStaffId($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new GetManageProcessByStaffIdHeaders([]);

        return $this->getManageProcessByStaffIdWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 获取模板code
     *  *
     * @param GetProcessCodeByNameRequest $request GetProcessCodeByNameRequest
     * @param GetProcessCodeByNameHeaders $headers GetProcessCodeByNameHeaders
     * @param RuntimeOptions              $runtime runtime options for this request RuntimeOptions
     *
     * @return GetProcessCodeByNameResponse GetProcessCodeByNameResponse
     */
    public function getProcessCodeByNameWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $query = [];
        if (!Utils::isUnset($request->name)) {
            $query['name'] = $request->name;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'query'   => OpenApiUtilClient::query($query),
        ]);
        $params = new Params([
            'action'      => 'GetProcessCodeByName',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processCentres/schemaNames/processCodes',
            'method'      => 'GET',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return GetProcessCodeByNameResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 获取模板code
     *  *
     * @param GetProcessCodeByNameRequest $request GetProcessCodeByNameRequest
     *
     * @return GetProcessCodeByNameResponse GetProcessCodeByNameResponse
     */
    public function getProcessCodeByName($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new GetProcessCodeByNameHeaders([]);

        return $this->getProcessCodeByNameWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 获取流程配置
     *  *
     * @param GetProcessConfigRequest $request GetProcessConfigRequest
     * @param GetProcessConfigHeaders $headers GetProcessConfigHeaders
     * @param RuntimeOptions          $runtime runtime options for this request RuntimeOptions
     *
     * @return GetProcessConfigResponse GetProcessConfigResponse
     */
    public function getProcessConfigWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $query = [];
        if (!Utils::isUnset($request->procCode)) {
            $query['procCode'] = $request->procCode;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'query'   => OpenApiUtilClient::query($query),
        ]);
        $params = new Params([
            'action'      => 'GetProcessConfig',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/crm/processes/configurations',
            'method'      => 'GET',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return GetProcessConfigResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 获取流程配置
     *  *
     * @param GetProcessConfigRequest $request GetProcessConfigRequest
     *
     * @return GetProcessConfigResponse GetProcessConfigResponse
     */
    public function getProcessConfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new GetProcessConfigHeaders([]);

        return $this->getProcessConfigWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 获取单个审批实例详情
     *  *
     * @param GetProcessInstanceRequest $request GetProcessInstanceRequest
     * @param GetProcessInstanceHeaders $headers GetProcessInstanceHeaders
     * @param RuntimeOptions            $runtime runtime options for this request RuntimeOptions
     *
     * @return GetProcessInstanceResponse GetProcessInstanceResponse
     */
    public function getProcessInstanceWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $query = [];
        if (!Utils::isUnset($request->processInstanceId)) {
            $query['processInstanceId'] = $request->processInstanceId;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'query'   => OpenApiUtilClient::query($query),
        ]);
        $params = new Params([
            'action'      => 'GetProcessInstance',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processInstances',
            'method'      => 'GET',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return GetProcessInstanceResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 获取单个审批实例详情
     *  *
     * @param GetProcessInstanceRequest $request GetProcessInstanceRequest
     *
     * @return GetProcessInstanceResponse GetProcessInstanceResponse
     */
    public function getProcessInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new GetProcessInstanceHeaders([]);

        return $this->getProcessInstanceWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 根据模版code列表批量查询模板最新表单和流程配置
     *  *
     * @param GetSchemaAndProcessconfigBatchllyRequest $tmpReq  GetSchemaAndProcessconfigBatchllyRequest
     * @param GetSchemaAndProcessconfigBatchllyHeaders $headers GetSchemaAndProcessconfigBatchllyHeaders
     * @param RuntimeOptions                           $runtime runtime options for this request RuntimeOptions
     *
     * @return GetSchemaAndProcessconfigBatchllyResponse GetSchemaAndProcessconfigBatchllyResponse
     */
    public function getSchemaAndProcessconfigBatchllyWithOptions($tmpReq, $headers, $runtime)
    {
        Utils::validateModel($tmpReq);
        $request = new GetSchemaAndProcessconfigBatchllyShrinkRequest([]);
        OpenApiUtilClient::convert($tmpReq, $request);
        if (!Utils::isUnset($tmpReq->processCodes)) {
            $request->processCodesShrink = OpenApiUtilClient::arrayToStringWithSpecifiedStyle($tmpReq->processCodes, 'processCodes', 'json');
        }
        $query = [];
        if (!Utils::isUnset($request->processCodesShrink)) {
            $query['processCodes'] = $request->processCodesShrink;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'query'   => OpenApiUtilClient::query($query),
        ]);
        $params = new Params([
            'action'      => 'GetSchemaAndProcessconfigBatchlly',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processes/templates/batchQuery',
            'method'      => 'POST',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return GetSchemaAndProcessconfigBatchllyResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 根据模版code列表批量查询模板最新表单和流程配置
     *  *
     * @param GetSchemaAndProcessconfigBatchllyRequest $request GetSchemaAndProcessconfigBatchllyRequest
     *
     * @return GetSchemaAndProcessconfigBatchllyResponse GetSchemaAndProcessconfigBatchllyResponse
     */
    public function getSchemaAndProcessconfigBatchlly($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new GetSchemaAndProcessconfigBatchllyHeaders([]);

        return $this->getSchemaAndProcessconfigBatchllyWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 授权预览审批附件
     *  *
     * @param GetSpaceWithDownloadAuthRequest $request GetSpaceWithDownloadAuthRequest
     * @param GetSpaceWithDownloadAuthHeaders $headers GetSpaceWithDownloadAuthHeaders
     * @param RuntimeOptions                  $runtime runtime options for this request RuntimeOptions
     *
     * @return GetSpaceWithDownloadAuthResponse GetSpaceWithDownloadAuthResponse
     */
    public function getSpaceWithDownloadAuthWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $body = [];
        if (!Utils::isUnset($request->agentId)) {
            $body['agentId'] = $request->agentId;
        }
        if (!Utils::isUnset($request->fileId)) {
            $body['fileId'] = $request->fileId;
        }
        if (!Utils::isUnset($request->fileIdList)) {
            $body['fileIdList'] = $request->fileIdList;
        }
        if (!Utils::isUnset($request->processInstanceId)) {
            $body['processInstanceId'] = $request->processInstanceId;
        }
        if (!Utils::isUnset($request->userId)) {
            $body['userId'] = $request->userId;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'body'    => OpenApiUtilClient::parseToMap($body),
        ]);
        $params = new Params([
            'action'      => 'GetSpaceWithDownloadAuth',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processInstances/spaces/authPreview',
            'method'      => 'POST',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return GetSpaceWithDownloadAuthResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 授权预览审批附件
     *  *
     * @param GetSpaceWithDownloadAuthRequest $request GetSpaceWithDownloadAuthRequest
     *
     * @return GetSpaceWithDownloadAuthResponse GetSpaceWithDownloadAuthResponse
     */
    public function getSpaceWithDownloadAuth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new GetSpaceWithDownloadAuthHeaders([]);

        return $this->getSpaceWithDownloadAuthWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 获取用户待审批数量
     *  *
     * @param GetUserTodoTaskSumRequest $request GetUserTodoTaskSumRequest
     * @param GetUserTodoTaskSumHeaders $headers GetUserTodoTaskSumHeaders
     * @param RuntimeOptions            $runtime runtime options for this request RuntimeOptions
     *
     * @return GetUserTodoTaskSumResponse GetUserTodoTaskSumResponse
     */
    public function getUserTodoTaskSumWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $query = [];
        if (!Utils::isUnset($request->userId)) {
            $query['userId'] = $request->userId;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'query'   => OpenApiUtilClient::query($query),
        ]);
        $params = new Params([
            'action'      => 'GetUserTodoTaskSum',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processes/todoTasks/numbers',
            'method'      => 'GET',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return GetUserTodoTaskSumResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 获取用户待审批数量
     *  *
     * @param GetUserTodoTaskSumRequest $request GetUserTodoTaskSumRequest
     *
     * @return GetUserTodoTaskSumResponse GetUserTodoTaskSumResponse
     */
    public function getUserTodoTaskSum($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new GetUserTodoTaskSumHeaders([]);

        return $this->getUserTodoTaskSumWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary  授权用户钉盘空间权限
     *  *
     * @param GrantCspaceAuthorizationRequest $request GrantCspaceAuthorizationRequest
     * @param GrantCspaceAuthorizationHeaders $headers GrantCspaceAuthorizationHeaders
     * @param RuntimeOptions                  $runtime runtime options for this request RuntimeOptions
     *
     * @return GrantCspaceAuthorizationResponse GrantCspaceAuthorizationResponse
     */
    public function grantCspaceAuthorizationWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $body = [];
        if (!Utils::isUnset($request->durationSeconds)) {
            $body['durationSeconds'] = $request->durationSeconds;
        }
        if (!Utils::isUnset($request->spaceId)) {
            $body['spaceId'] = $request->spaceId;
        }
        if (!Utils::isUnset($request->type)) {
            $body['type'] = $request->type;
        }
        if (!Utils::isUnset($request->userId)) {
            $body['userId'] = $request->userId;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'body'    => OpenApiUtilClient::parseToMap($body),
        ]);
        $params = new Params([
            'action'      => 'GrantCspaceAuthorization',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/spaces/authorize',
            'method'      => 'POST',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'none',
        ]);

        return GrantCspaceAuthorizationResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary  授权用户钉盘空间权限
     *  *
     * @param GrantCspaceAuthorizationRequest $request GrantCspaceAuthorizationRequest
     *
     * @return GrantCspaceAuthorizationResponse GrantCspaceAuthorizationResponse
     */
    public function grantCspaceAuthorization($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new GrantCspaceAuthorizationHeaders([]);

        return $this->grantCspaceAuthorizationWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 下载审批附件
     *  *
     * @param GrantProcessInstanceForDownloadFileRequest $request GrantProcessInstanceForDownloadFileRequest
     * @param GrantProcessInstanceForDownloadFileHeaders $headers GrantProcessInstanceForDownloadFileHeaders
     * @param RuntimeOptions                             $runtime runtime options for this request RuntimeOptions
     *
     * @return GrantProcessInstanceForDownloadFileResponse GrantProcessInstanceForDownloadFileResponse
     */
    public function grantProcessInstanceForDownloadFileWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $body = [];
        if (!Utils::isUnset($request->fileId)) {
            $body['fileId'] = $request->fileId;
        }
        if (!Utils::isUnset($request->processInstanceId)) {
            $body['processInstanceId'] = $request->processInstanceId;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'body'    => OpenApiUtilClient::parseToMap($body),
        ]);
        $params = new Params([
            'action'      => 'GrantProcessInstanceForDownloadFile',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processInstances/spaces/files/urls/download',
            'method'      => 'POST',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return GrantProcessInstanceForDownloadFileResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 下载审批附件
     *  *
     * @param GrantProcessInstanceForDownloadFileRequest $request GrantProcessInstanceForDownloadFileRequest
     *
     * @return GrantProcessInstanceForDownloadFileResponse GrantProcessInstanceForDownloadFileResponse
     */
    public function grantProcessInstanceForDownloadFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new GrantProcessInstanceForDownloadFileHeaders([]);

        return $this->grantProcessInstanceForDownloadFileWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 应用安装
     *  *
     * @param InstallAppRequest $request InstallAppRequest
     * @param InstallAppHeaders $headers InstallAppHeaders
     * @param RuntimeOptions    $runtime runtime options for this request RuntimeOptions
     *
     * @return InstallAppResponse InstallAppResponse
     */
    public function installAppWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $body = [];
        if (!Utils::isUnset($request->bizGroup)) {
            $body['bizGroup'] = $request->bizGroup;
        }
        if (!Utils::isUnset($request->installOption)) {
            $body['installOption'] = $request->installOption;
        }
        if (!Utils::isUnset($request->sourceDirName)) {
            $body['sourceDirName'] = $request->sourceDirName;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'body'    => OpenApiUtilClient::parseToMap($body),
        ]);
        $params = new Params([
            'action'      => 'InstallApp',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processes/apps/install',
            'method'      => 'POST',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return InstallAppResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 应用安装
     *  *
     * @param InstallAppRequest $request InstallAppRequest
     *
     * @return InstallAppResponse InstallAppResponse
     */
    public function installApp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new InstallAppHeaders([]);

        return $this->installAppWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 获取审批实例ID列表
     *  *
     * @param ListProcessInstanceIdsRequest $request ListProcessInstanceIdsRequest
     * @param ListProcessInstanceIdsHeaders $headers ListProcessInstanceIdsHeaders
     * @param RuntimeOptions                $runtime runtime options for this request RuntimeOptions
     *
     * @return ListProcessInstanceIdsResponse ListProcessInstanceIdsResponse
     */
    public function listProcessInstanceIdsWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $body = [];
        if (!Utils::isUnset($request->endTime)) {
            $body['endTime'] = $request->endTime;
        }
        if (!Utils::isUnset($request->maxResults)) {
            $body['maxResults'] = $request->maxResults;
        }
        if (!Utils::isUnset($request->nextToken)) {
            $body['nextToken'] = $request->nextToken;
        }
        if (!Utils::isUnset($request->processCode)) {
            $body['processCode'] = $request->processCode;
        }
        if (!Utils::isUnset($request->startTime)) {
            $body['startTime'] = $request->startTime;
        }
        if (!Utils::isUnset($request->statuses)) {
            $body['statuses'] = $request->statuses;
        }
        if (!Utils::isUnset($request->userIds)) {
            $body['userIds'] = $request->userIds;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'body'    => OpenApiUtilClient::parseToMap($body),
        ]);
        $params = new Params([
            'action'      => 'ListProcessInstanceIds',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processes/instanceIds/query',
            'method'      => 'POST',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return ListProcessInstanceIdsResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 获取审批实例ID列表
     *  *
     * @param ListProcessInstanceIdsRequest $request ListProcessInstanceIdsRequest
     *
     * @return ListProcessInstanceIdsResponse ListProcessInstanceIdsResponse
     */
    public function listProcessInstanceIds($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new ListProcessInstanceIdsHeaders([]);

        return $this->listProcessInstanceIdsWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 查询用户待办事项
     *  *
     * @param ListTodoWorkRecordsRequest $request ListTodoWorkRecordsRequest
     * @param ListTodoWorkRecordsHeaders $headers ListTodoWorkRecordsHeaders
     * @param RuntimeOptions             $runtime runtime options for this request RuntimeOptions
     *
     * @return ListTodoWorkRecordsResponse ListTodoWorkRecordsResponse
     */
    public function listTodoWorkRecordsWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $query = [];
        if (!Utils::isUnset($request->maxResults)) {
            $query['maxResults'] = $request->maxResults;
        }
        if (!Utils::isUnset($request->nextToken)) {
            $query['nextToken'] = $request->nextToken;
        }
        if (!Utils::isUnset($request->status)) {
            $query['status'] = $request->status;
        }
        if (!Utils::isUnset($request->userId)) {
            $query['userId'] = $request->userId;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'query'   => OpenApiUtilClient::query($query),
        ]);
        $params = new Params([
            'action'      => 'ListTodoWorkRecords',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/workRecords/todoTasks',
            'method'      => 'GET',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return ListTodoWorkRecordsResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 查询用户待办事项
     *  *
     * @param ListTodoWorkRecordsRequest $request ListTodoWorkRecordsRequest
     *
     * @return ListTodoWorkRecordsResponse ListTodoWorkRecordsResponse
     */
    public function listTodoWorkRecords($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new ListTodoWorkRecordsHeaders([]);

        return $this->listTodoWorkRecordsWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 获取指定用户可见的审批表单列表
     *  *
     * @param ListUserVisibleBpmsProcessesRequest $request ListUserVisibleBpmsProcessesRequest
     * @param ListUserVisibleBpmsProcessesHeaders $headers ListUserVisibleBpmsProcessesHeaders
     * @param RuntimeOptions                      $runtime runtime options for this request RuntimeOptions
     *
     * @return ListUserVisibleBpmsProcessesResponse ListUserVisibleBpmsProcessesResponse
     */
    public function listUserVisibleBpmsProcessesWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $query = [];
        if (!Utils::isUnset($request->maxResults)) {
            $query['maxResults'] = $request->maxResults;
        }
        if (!Utils::isUnset($request->nextToken)) {
            $query['nextToken'] = $request->nextToken;
        }
        if (!Utils::isUnset($request->userId)) {
            $query['userId'] = $request->userId;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'query'   => OpenApiUtilClient::query($query),
        ]);
        $params = new Params([
            'action'      => 'ListUserVisibleBpmsProcesses',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processes/userVisibilities/templates',
            'method'      => 'GET',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return ListUserVisibleBpmsProcessesResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 获取指定用户可见的审批表单列表
     *  *
     * @param ListUserVisibleBpmsProcessesRequest $request ListUserVisibleBpmsProcessesRequest
     *
     * @return ListUserVisibleBpmsProcessesResponse ListUserVisibleBpmsProcessesResponse
     */
    public function listUserVisibleBpmsProcesses($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new ListUserVisibleBpmsProcessesHeaders([]);

        return $this->listUserVisibleBpmsProcessesWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 分页查询实例数据
     *  *
     * @param PagesExportInstancesRequest $request PagesExportInstancesRequest
     * @param PagesExportInstancesHeaders $headers PagesExportInstancesHeaders
     * @param RuntimeOptions              $runtime runtime options for this request RuntimeOptions
     *
     * @return PagesExportInstancesResponse PagesExportInstancesResponse
     */
    public function pagesExportInstancesWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $query = [];
        if (!Utils::isUnset($request->endTimeInMills)) {
            $query['endTimeInMills'] = $request->endTimeInMills;
        }
        if (!Utils::isUnset($request->maxResults)) {
            $query['maxResults'] = $request->maxResults;
        }
        if (!Utils::isUnset($request->nextToken)) {
            $query['nextToken'] = $request->nextToken;
        }
        if (!Utils::isUnset($request->orderBy)) {
            $query['orderBy'] = $request->orderBy;
        }
        if (!Utils::isUnset($request->processCode)) {
            $query['processCode'] = $request->processCode;
        }
        if (!Utils::isUnset($request->startTimeInMills)) {
            $query['startTimeInMills'] = $request->startTimeInMills;
        }
        if (!Utils::isUnset($request->status)) {
            $query['status'] = $request->status;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'query'   => OpenApiUtilClient::query($query),
        ]);
        $params = new Params([
            'action'      => 'PagesExportInstances',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/instances/datas',
            'method'      => 'POST',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return PagesExportInstancesResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 分页查询实例数据
     *  *
     * @param PagesExportInstancesRequest $request PagesExportInstancesRequest
     *
     * @return PagesExportInstancesResponse PagesExportInstancesResponse
     */
    public function pagesExportInstances($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new PagesExportInstancesHeaders([]);

        return $this->pagesExportInstancesWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 审批流程预测
     *  *
     * @param ProcessForecastRequest $request ProcessForecastRequest
     * @param ProcessForecastHeaders $headers ProcessForecastHeaders
     * @param RuntimeOptions         $runtime runtime options for this request RuntimeOptions
     *
     * @return ProcessForecastResponse ProcessForecastResponse
     */
    public function processForecastWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $body = [];
        if (!Utils::isUnset($request->deptId)) {
            $body['deptId'] = $request->deptId;
        }
        if (!Utils::isUnset($request->formComponentValues)) {
            $body['formComponentValues'] = $request->formComponentValues;
        }
        if (!Utils::isUnset($request->processCode)) {
            $body['processCode'] = $request->processCode;
        }
        if (!Utils::isUnset($request->userId)) {
            $body['userId'] = $request->userId;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'body'    => OpenApiUtilClient::parseToMap($body),
        ]);
        $params = new Params([
            'action'      => 'ProcessForecast',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processes/forecast',
            'method'      => 'POST',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return ProcessForecastResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 审批流程预测
     *  *
     * @param ProcessForecastRequest $request ProcessForecastRequest
     *
     * @return ProcessForecastResponse ProcessForecastResponse
     */
    public function processForecast($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new ProcessForecastHeaders([]);

        return $this->processForecastWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 根据processCode分页获取表单数据
     *  *
     * @param QueryAllFormInstancesRequest $request QueryAllFormInstancesRequest
     * @param QueryAllFormInstancesHeaders $headers QueryAllFormInstancesHeaders
     * @param RuntimeOptions               $runtime runtime options for this request RuntimeOptions
     *
     * @return QueryAllFormInstancesResponse QueryAllFormInstancesResponse
     */
    public function queryAllFormInstancesWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $query = [];
        if (!Utils::isUnset($request->appUuid)) {
            $query['appUuid'] = $request->appUuid;
        }
        if (!Utils::isUnset($request->formCode)) {
            $query['formCode'] = $request->formCode;
        }
        if (!Utils::isUnset($request->maxResults)) {
            $query['maxResults'] = $request->maxResults;
        }
        if (!Utils::isUnset($request->nextToken)) {
            $query['nextToken'] = $request->nextToken;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'query'   => OpenApiUtilClient::query($query),
        ]);
        $params = new Params([
            'action'      => 'QueryAllFormInstances',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/forms/pages/instances',
            'method'      => 'GET',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return QueryAllFormInstancesResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 根据processCode分页获取表单数据
     *  *
     * @param QueryAllFormInstancesRequest $request QueryAllFormInstancesRequest
     *
     * @return QueryAllFormInstancesResponse QueryAllFormInstancesResponse
     */
    public function queryAllFormInstances($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new QueryAllFormInstancesHeaders([]);

        return $this->queryAllFormInstancesWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 批量查询审批流程实例
     *  *
     * @param QueryAllProcessInstancesRequest $request QueryAllProcessInstancesRequest
     * @param QueryAllProcessInstancesHeaders $headers QueryAllProcessInstancesHeaders
     * @param RuntimeOptions                  $runtime runtime options for this request RuntimeOptions
     *
     * @return QueryAllProcessInstancesResponse QueryAllProcessInstancesResponse
     */
    public function queryAllProcessInstancesWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $query = [];
        if (!Utils::isUnset($request->appUuid)) {
            $query['appUuid'] = $request->appUuid;
        }
        if (!Utils::isUnset($request->endTimeInMills)) {
            $query['endTimeInMills'] = $request->endTimeInMills;
        }
        if (!Utils::isUnset($request->maxResults)) {
            $query['maxResults'] = $request->maxResults;
        }
        if (!Utils::isUnset($request->nextToken)) {
            $query['nextToken'] = $request->nextToken;
        }
        if (!Utils::isUnset($request->processCode)) {
            $query['processCode'] = $request->processCode;
        }
        if (!Utils::isUnset($request->startTimeInMills)) {
            $query['startTimeInMills'] = $request->startTimeInMills;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'query'   => OpenApiUtilClient::query($query),
        ]);
        $params = new Params([
            'action'      => 'QueryAllProcessInstances',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processes/pages/instances',
            'method'      => 'GET',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return QueryAllProcessInstancesResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 批量查询审批流程实例
     *  *
     * @param QueryAllProcessInstancesRequest $request QueryAllProcessInstancesRequest
     *
     * @return QueryAllProcessInstancesResponse QueryAllProcessInstancesResponse
     */
    public function queryAllProcessInstances($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new QueryAllProcessInstancesHeaders([]);

        return $this->queryAllProcessInstancesWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 根据业务标识查询表单描述信息
     *  *
     * @param QueryFormByBizTypeRequest $request QueryFormByBizTypeRequest
     * @param QueryFormByBizTypeHeaders $headers QueryFormByBizTypeHeaders
     * @param RuntimeOptions            $runtime runtime options for this request RuntimeOptions
     *
     * @return QueryFormByBizTypeResponse QueryFormByBizTypeResponse
     */
    public function queryFormByBizTypeWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $body = [];
        if (!Utils::isUnset($request->appUuid)) {
            $body['appUuid'] = $request->appUuid;
        }
        if (!Utils::isUnset($request->bizTypes)) {
            $body['bizTypes'] = $request->bizTypes;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'body'    => OpenApiUtilClient::parseToMap($body),
        ]);
        $params = new Params([
            'action'      => 'QueryFormByBizType',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/forms/forminfos/query',
            'method'      => 'POST',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return QueryFormByBizTypeResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 根据业务标识查询表单描述信息
     *  *
     * @param QueryFormByBizTypeRequest $request QueryFormByBizTypeRequest
     *
     * @return QueryFormByBizTypeResponse QueryFormByBizTypeResponse
     */
    public function queryFormByBizType($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new QueryFormByBizTypeHeaders([]);

        return $this->queryFormByBizTypeWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 查询数据表单
     *  *
     * @param QueryFormInstanceRequest $request QueryFormInstanceRequest
     * @param QueryFormInstanceHeaders $headers QueryFormInstanceHeaders
     * @param RuntimeOptions           $runtime runtime options for this request RuntimeOptions
     *
     * @return QueryFormInstanceResponse QueryFormInstanceResponse
     */
    public function queryFormInstanceWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $query = [];
        if (!Utils::isUnset($request->appUuid)) {
            $query['appUuid'] = $request->appUuid;
        }
        if (!Utils::isUnset($request->formCode)) {
            $query['formCode'] = $request->formCode;
        }
        if (!Utils::isUnset($request->formInstanceId)) {
            $query['formInstanceId'] = $request->formInstanceId;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'query'   => OpenApiUtilClient::query($query),
        ]);
        $params = new Params([
            'action'      => 'QueryFormInstance',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/forms/instances',
            'method'      => 'GET',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return QueryFormInstanceResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 查询数据表单
     *  *
     * @param QueryFormInstanceRequest $request QueryFormInstanceRequest
     *
     * @return QueryFormInstanceResponse QueryFormInstanceResponse
     */
    public function queryFormInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new QueryFormInstanceHeaders([]);

        return $this->queryFormInstanceWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 查询通过流程中心集成的OA审批任务
     *  *
     * @param QueryIntegratedTodoTaskRequest $request QueryIntegratedTodoTaskRequest
     * @param QueryIntegratedTodoTaskHeaders $headers QueryIntegratedTodoTaskHeaders
     * @param RuntimeOptions                 $runtime runtime options for this request RuntimeOptions
     *
     * @return QueryIntegratedTodoTaskResponse QueryIntegratedTodoTaskResponse
     */
    public function queryIntegratedTodoTaskWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $query = [];
        if (!Utils::isUnset($request->createBefore)) {
            $query['createBefore'] = $request->createBefore;
        }
        if (!Utils::isUnset($request->pageNumber)) {
            $query['pageNumber'] = $request->pageNumber;
        }
        if (!Utils::isUnset($request->pageSize)) {
            $query['pageSize'] = $request->pageSize;
        }
        if (!Utils::isUnset($request->userId)) {
            $query['userId'] = $request->userId;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'query'   => OpenApiUtilClient::query($query),
        ]);
        $params = new Params([
            'action'      => 'QueryIntegratedTodoTask',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processCentres/todoTasks',
            'method'      => 'GET',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return QueryIntegratedTodoTaskResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 查询通过流程中心集成的OA审批任务
     *  *
     * @param QueryIntegratedTodoTaskRequest $request QueryIntegratedTodoTaskRequest
     *
     * @return QueryIntegratedTodoTaskResponse QueryIntegratedTodoTaskResponse
     */
    public function queryIntegratedTodoTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new QueryIntegratedTodoTaskHeaders([]);

        return $this->queryIntegratedTodoTaskWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 根据业务标识查询模板
     *  *
     * @param QueryProcessByBizCategoryIdRequest $request QueryProcessByBizCategoryIdRequest
     * @param QueryProcessByBizCategoryIdHeaders $headers QueryProcessByBizCategoryIdHeaders
     * @param RuntimeOptions                     $runtime runtime options for this request RuntimeOptions
     *
     * @return QueryProcessByBizCategoryIdResponse QueryProcessByBizCategoryIdResponse
     */
    public function queryProcessByBizCategoryIdWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $query = [];
        if (!Utils::isUnset($request->bizType)) {
            $query['bizType'] = $request->bizType;
        }
        if (!Utils::isUnset($request->userId)) {
            $query['userId'] = $request->userId;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'query'   => OpenApiUtilClient::query($query),
        ]);
        $params = new Params([
            'action'      => 'QueryProcessByBizCategoryId',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processes/categories/templates',
            'method'      => 'GET',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return QueryProcessByBizCategoryIdResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 根据业务标识查询模板
     *  *
     * @param QueryProcessByBizCategoryIdRequest $request QueryProcessByBizCategoryIdRequest
     *
     * @return QueryProcessByBizCategoryIdResponse QueryProcessByBizCategoryIdResponse
     */
    public function queryProcessByBizCategoryId($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new QueryProcessByBizCategoryIdHeaders([]);

        return $this->queryProcessByBizCategoryIdWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 蓝凌获取schema和流程信息
     *  *
     * @param QuerySchemaAndProcessRequest $request QuerySchemaAndProcessRequest
     * @param QuerySchemaAndProcessHeaders $headers QuerySchemaAndProcessHeaders
     * @param RuntimeOptions               $runtime runtime options for this request RuntimeOptions
     *
     * @return QuerySchemaAndProcessResponse QuerySchemaAndProcessResponse
     */
    public function querySchemaAndProcessWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $query = [];
        if (!Utils::isUnset($request->appUuid)) {
            $query['appUuid'] = $request->appUuid;
        }
        if (!Utils::isUnset($request->processCode)) {
            $query['processCode'] = $request->processCode;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'query'   => OpenApiUtilClient::query($query),
        ]);
        $params = new Params([
            'action'      => 'QuerySchemaAndProcess',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/forms/schemaAndProcess',
            'method'      => 'GET',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return QuerySchemaAndProcessResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 蓝凌获取schema和流程信息
     *  *
     * @param QuerySchemaAndProcessRequest $request QuerySchemaAndProcessRequest
     *
     * @return QuerySchemaAndProcessResponse QuerySchemaAndProcessResponse
     */
    public function querySchemaAndProcess($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new QuerySchemaAndProcessHeaders([]);

        return $this->querySchemaAndProcessWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary  通过 processCode 获取表单 schema 信息
     *  *
     * @param QuerySchemaByProcessCodeRequest $request QuerySchemaByProcessCodeRequest
     * @param QuerySchemaByProcessCodeHeaders $headers QuerySchemaByProcessCodeHeaders
     * @param RuntimeOptions                  $runtime runtime options for this request RuntimeOptions
     *
     * @return QuerySchemaByProcessCodeResponse QuerySchemaByProcessCodeResponse
     */
    public function querySchemaByProcessCodeWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $query = [];
        if (!Utils::isUnset($request->appUuid)) {
            $query['appUuid'] = $request->appUuid;
        }
        if (!Utils::isUnset($request->processCode)) {
            $query['processCode'] = $request->processCode;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'query'   => OpenApiUtilClient::query($query),
        ]);
        $params = new Params([
            'action'      => 'QuerySchemaByProcessCode',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/forms/schemas/processCodes',
            'method'      => 'GET',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return QuerySchemaByProcessCodeResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary  通过 processCode 获取表单 schema 信息
     *  *
     * @param QuerySchemaByProcessCodeRequest $request QuerySchemaByProcessCodeRequest
     *
     * @return QuerySchemaByProcessCodeResponse QuerySchemaByProcessCodeResponse
     */
    public function querySchemaByProcessCode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new QuerySchemaByProcessCodeHeaders([]);

        return $this->querySchemaByProcessCodeWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 转交OA审批任务
     *  *
     * @param RedirectWorkflowTaskRequest $request RedirectWorkflowTaskRequest
     * @param RedirectWorkflowTaskHeaders $headers RedirectWorkflowTaskHeaders
     * @param RuntimeOptions              $runtime runtime options for this request RuntimeOptions
     *
     * @return RedirectWorkflowTaskResponse RedirectWorkflowTaskResponse
     */
    public function redirectWorkflowTaskWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $body = [];
        if (!Utils::isUnset($request->actionName)) {
            $body['actionName'] = $request->actionName;
        }
        if (!Utils::isUnset($request->file)) {
            $body['file'] = $request->file;
        }
        if (!Utils::isUnset($request->operateUserId)) {
            $body['operateUserId'] = $request->operateUserId;
        }
        if (!Utils::isUnset($request->remark)) {
            $body['remark'] = $request->remark;
        }
        if (!Utils::isUnset($request->taskId)) {
            $body['taskId'] = $request->taskId;
        }
        if (!Utils::isUnset($request->toUserId)) {
            $body['toUserId'] = $request->toUserId;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'body'    => OpenApiUtilClient::parseToMap($body),
        ]);
        $params = new Params([
            'action'      => 'RedirectWorkflowTask',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/tasks/redirect',
            'method'      => 'POST',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return RedirectWorkflowTaskResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 转交OA审批任务
     *  *
     * @param RedirectWorkflowTaskRequest $request RedirectWorkflowTaskRequest
     *
     * @return RedirectWorkflowTaskResponse RedirectWorkflowTaskResponse
     */
    public function redirectWorkflowTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new RedirectWorkflowTaskHeaders([]);

        return $this->redirectWorkflowTaskWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 创建实例
     *  *
     * @param SaveIntegratedInstanceRequest $request SaveIntegratedInstanceRequest
     * @param SaveIntegratedInstanceHeaders $headers SaveIntegratedInstanceHeaders
     * @param RuntimeOptions                $runtime runtime options for this request RuntimeOptions
     *
     * @return SaveIntegratedInstanceResponse SaveIntegratedInstanceResponse
     */
    public function saveIntegratedInstanceWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $body = [];
        if (!Utils::isUnset($request->bizData)) {
            $body['bizData'] = $request->bizData;
        }
        if (!Utils::isUnset($request->formComponentValueList)) {
            $body['formComponentValueList'] = $request->formComponentValueList;
        }
        if (!Utils::isUnset($request->notifiers)) {
            $body['notifiers'] = $request->notifiers;
        }
        if (!Utils::isUnset($request->originatorUserId)) {
            $body['originatorUserId'] = $request->originatorUserId;
        }
        if (!Utils::isUnset($request->processCode)) {
            $body['processCode'] = $request->processCode;
        }
        if (!Utils::isUnset($request->title)) {
            $body['title'] = $request->title;
        }
        if (!Utils::isUnset($request->url)) {
            $body['url'] = $request->url;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'body'    => OpenApiUtilClient::parseToMap($body),
        ]);
        $params = new Params([
            'action'      => 'SaveIntegratedInstance',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processCentres/instances',
            'method'      => 'POST',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return SaveIntegratedInstanceResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 创建实例
     *  *
     * @param SaveIntegratedInstanceRequest $request SaveIntegratedInstanceRequest
     *
     * @return SaveIntegratedInstanceResponse SaveIntegratedInstanceResponse
     */
    public function saveIntegratedInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new SaveIntegratedInstanceHeaders([]);

        return $this->saveIntegratedInstanceWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 创建或更新审批模板
     *  *
     * @param SaveProcessRequest $request SaveProcessRequest
     * @param SaveProcessHeaders $headers SaveProcessHeaders
     * @param RuntimeOptions     $runtime runtime options for this request RuntimeOptions
     *
     * @return SaveProcessResponse SaveProcessResponse
     */
    public function saveProcessWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $body = [];
        if (!Utils::isUnset($request->description)) {
            $body['description'] = $request->description;
        }
        if (!Utils::isUnset($request->formComponents)) {
            $body['formComponents'] = $request->formComponents;
        }
        if (!Utils::isUnset($request->name)) {
            $body['name'] = $request->name;
        }
        if (!Utils::isUnset($request->processCode)) {
            $body['processCode'] = $request->processCode;
        }
        if (!Utils::isUnset($request->processFeatureConfig)) {
            $body['processFeatureConfig'] = $request->processFeatureConfig;
        }
        if (!Utils::isUnset($request->templateConfig)) {
            $body['templateConfig'] = $request->templateConfig;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'body'    => OpenApiUtilClient::parseToMap($body),
        ]);
        $params = new Params([
            'action'      => 'SaveProcess',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processCentres/schemas',
            'method'      => 'POST',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return SaveProcessResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 创建或更新审批模板
     *  *
     * @param SaveProcessRequest $request SaveProcessRequest
     *
     * @return SaveProcessResponse SaveProcessResponse
     */
    public function saveProcess($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new SaveProcessHeaders([]);

        return $this->saveProcessWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 创建审批实例
     *  *
     * @param StartProcessInstanceRequest $request StartProcessInstanceRequest
     * @param StartProcessInstanceHeaders $headers StartProcessInstanceHeaders
     * @param RuntimeOptions              $runtime runtime options for this request RuntimeOptions
     *
     * @return StartProcessInstanceResponse StartProcessInstanceResponse
     */
    public function startProcessInstanceWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $body = [];
        if (!Utils::isUnset($request->approvers)) {
            $body['approvers'] = $request->approvers;
        }
        if (!Utils::isUnset($request->ccList)) {
            $body['ccList'] = $request->ccList;
        }
        if (!Utils::isUnset($request->ccPosition)) {
            $body['ccPosition'] = $request->ccPosition;
        }
        if (!Utils::isUnset($request->deptId)) {
            $body['deptId'] = $request->deptId;
        }
        if (!Utils::isUnset($request->formComponentValues)) {
            $body['formComponentValues'] = $request->formComponentValues;
        }
        if (!Utils::isUnset($request->microappAgentId)) {
            $body['microappAgentId'] = $request->microappAgentId;
        }
        if (!Utils::isUnset($request->originatorUserId)) {
            $body['originatorUserId'] = $request->originatorUserId;
        }
        if (!Utils::isUnset($request->processCode)) {
            $body['processCode'] = $request->processCode;
        }
        if (!Utils::isUnset($request->targetSelectActioners)) {
            $body['targetSelectActioners'] = $request->targetSelectActioners;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'body'    => OpenApiUtilClient::parseToMap($body),
        ]);
        $params = new Params([
            'action'      => 'StartProcessInstance',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processInstances',
            'method'      => 'POST',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return StartProcessInstanceResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 创建审批实例
     *  *
     * @param StartProcessInstanceRequest $request StartProcessInstanceRequest
     *
     * @return StartProcessInstanceResponse StartProcessInstanceResponse
     */
    public function startProcessInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new StartProcessInstanceHeaders([]);

        return $this->startProcessInstanceWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 撤销审批实例
     *  *
     * @param TerminateProcessInstanceRequest $request TerminateProcessInstanceRequest
     * @param TerminateProcessInstanceHeaders $headers TerminateProcessInstanceHeaders
     * @param RuntimeOptions                  $runtime runtime options for this request RuntimeOptions
     *
     * @return TerminateProcessInstanceResponse TerminateProcessInstanceResponse
     */
    public function terminateProcessInstanceWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $body = [];
        if (!Utils::isUnset($request->isSystem)) {
            $body['isSystem'] = $request->isSystem;
        }
        if (!Utils::isUnset($request->operatingUserId)) {
            $body['operatingUserId'] = $request->operatingUserId;
        }
        if (!Utils::isUnset($request->processInstanceId)) {
            $body['processInstanceId'] = $request->processInstanceId;
        }
        if (!Utils::isUnset($request->remark)) {
            $body['remark'] = $request->remark;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'body'    => OpenApiUtilClient::parseToMap($body),
        ]);
        $params = new Params([
            'action'      => 'TerminateProcessInstance',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processInstances/terminate',
            'method'      => 'POST',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return TerminateProcessInstanceResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 撤销审批实例
     *  *
     * @param TerminateProcessInstanceRequest $request TerminateProcessInstanceRequest
     *
     * @return TerminateProcessInstanceResponse TerminateProcessInstanceResponse
     */
    public function terminateProcessInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new TerminateProcessInstanceHeaders([]);

        return $this->terminateProcessInstanceWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 更新流程中心任务状态
     *  *
     * @param UpdateIntegratedTaskRequest $request UpdateIntegratedTaskRequest
     * @param UpdateIntegratedTaskHeaders $headers UpdateIntegratedTaskHeaders
     * @param RuntimeOptions              $runtime runtime options for this request RuntimeOptions
     *
     * @return UpdateIntegratedTaskResponse UpdateIntegratedTaskResponse
     */
    public function updateIntegratedTaskWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $body = [];
        if (!Utils::isUnset($request->processInstanceId)) {
            $body['processInstanceId'] = $request->processInstanceId;
        }
        if (!Utils::isUnset($request->tasks)) {
            $body['tasks'] = $request->tasks;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'body'    => OpenApiUtilClient::parseToMap($body),
        ]);
        $params = new Params([
            'action'      => 'UpdateIntegratedTask',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processCentres/tasks',
            'method'      => 'PUT',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return UpdateIntegratedTaskResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 更新流程中心任务状态
     *  *
     * @param UpdateIntegratedTaskRequest $request UpdateIntegratedTaskRequest
     *
     * @return UpdateIntegratedTaskResponse UpdateIntegratedTaskResponse
     */
    public function updateIntegratedTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new UpdateIntegratedTaskHeaders([]);

        return $this->updateIntegratedTaskWithOptions($request, $headers, $runtime);
    }

    /**
     * @summary 更新实例状态
     *  *
     * @param UpdateProcessInstanceRequest $request UpdateProcessInstanceRequest
     * @param UpdateProcessInstanceHeaders $headers UpdateProcessInstanceHeaders
     * @param RuntimeOptions               $runtime runtime options for this request RuntimeOptions
     *
     * @return UpdateProcessInstanceResponse UpdateProcessInstanceResponse
     */
    public function updateProcessInstanceWithOptions($request, $headers, $runtime)
    {
        Utils::validateModel($request);
        $body = [];
        if (!Utils::isUnset($request->notifiers)) {
            $body['notifiers'] = $request->notifiers;
        }
        if (!Utils::isUnset($request->processInstanceId)) {
            $body['processInstanceId'] = $request->processInstanceId;
        }
        if (!Utils::isUnset($request->result)) {
            $body['result'] = $request->result;
        }
        if (!Utils::isUnset($request->status)) {
            $body['status'] = $request->status;
        }
        $realHeaders = [];
        if (!Utils::isUnset($headers->commonHeaders)) {
            $realHeaders = $headers->commonHeaders;
        }
        if (!Utils::isUnset($headers->xAcsDingtalkAccessToken)) {
            $realHeaders['x-acs-dingtalk-access-token'] = Utils::toJSONString($headers->xAcsDingtalkAccessToken);
        }
        $req = new OpenApiRequest([
            'headers' => $realHeaders,
            'body'    => OpenApiUtilClient::parseToMap($body),
        ]);
        $params = new Params([
            'action'      => 'UpdateProcessInstance',
            'version'     => 'workflow_1.0',
            'protocol'    => 'HTTP',
            'pathname'    => '/v1.0/workflow/processCentres/instances',
            'method'      => 'PUT',
            'authType'    => 'AK',
            'style'       => 'ROA',
            'reqBodyType' => 'none',
            'bodyType'    => 'json',
        ]);

        return UpdateProcessInstanceResponse::fromMap($this->execute($params, $req, $runtime));
    }

    /**
     * @summary 更新实例状态
     *  *
     * @param UpdateProcessInstanceRequest $request UpdateProcessInstanceRequest
     *
     * @return UpdateProcessInstanceResponse UpdateProcessInstanceResponse
     */
    public function updateProcessInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = new UpdateProcessInstanceHeaders([]);

        return $this->updateProcessInstanceWithOptions($request, $headers, $runtime);
    }
}
