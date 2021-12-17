<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models;

use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\StartProcessInstanceRequest\approvers;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\StartProcessInstanceRequest\formComponentValues;
use AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\StartProcessInstanceRequest\targetSelectActioners;
use AlibabaCloud\Tea\Model;

class StartProcessInstanceRequest extends Model
{
    /**
     * @description 审批发起人的userId
     *
     * @var string
     */
    public $originatorUserId;

    /**
     * @description 审批流的唯一码
     *
     * @var string
     */
    public $processCode;

    /**
     * @description 部门ID
     *
     * @var int
     */
    public $deptId;

    /**
     * @description 企业微应用标识
     *
     * @var int
     */
    public $microappAgentId;

    /**
     * @description 不使用审批流模板时，直接指定审批人列表
     *
     * @var approvers[]
     */
    public $approvers;

    /**
     * @description 抄送人userId列表
     *
     * @var string[]
     */
    public $ccList;

    /**
     * @description 抄送时间
     *
     * @var string
     */
    public $ccPosition;

    /**
     * @description 使用审批流模板时，模板上的自选操作人列表
     *
     * @var targetSelectActioners[]
     */
    public $targetSelectActioners;

    /**
     * @description 表单数据内容，控件列表
     *
     * @var formComponentValues[]
     */
    public $formComponentValues;

    /**
     * @var string
     */
    public $requestId;

    /**
     * @var string
     */
    public $dingCorpId;

    /**
     * @var int
     */
    public $dingOrgId;

    /**
     * @var int
     */
    public $dingIsvOrgId;

    /**
     * @var string
     */
    public $dingSuiteKey;

    /**
     * @var int
     */
    public $dingTokenGrantType;
    protected $_name = [
        'originatorUserId'      => 'originatorUserId',
        'processCode'           => 'processCode',
        'deptId'                => 'deptId',
        'microappAgentId'       => 'microappAgentId',
        'approvers'             => 'approvers',
        'ccList'                => 'ccList',
        'ccPosition'            => 'ccPosition',
        'targetSelectActioners' => 'targetSelectActioners',
        'formComponentValues'   => 'formComponentValues',
        'requestId'             => 'RequestId',
        'dingCorpId'            => 'dingCorpId',
        'dingOrgId'             => 'dingOrgId',
        'dingIsvOrgId'          => 'dingIsvOrgId',
        'dingSuiteKey'          => 'dingSuiteKey',
        'dingTokenGrantType'    => 'dingTokenGrantType',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->originatorUserId) {
            $res['originatorUserId'] = $this->originatorUserId;
        }
        if (null !== $this->processCode) {
            $res['processCode'] = $this->processCode;
        }
        if (null !== $this->deptId) {
            $res['deptId'] = $this->deptId;
        }
        if (null !== $this->microappAgentId) {
            $res['microappAgentId'] = $this->microappAgentId;
        }
        if (null !== $this->approvers) {
            $res['approvers'] = [];
            if (null !== $this->approvers && \is_array($this->approvers)) {
                $n = 0;
                foreach ($this->approvers as $item) {
                    $res['approvers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->ccList) {
            $res['ccList'] = $this->ccList;
        }
        if (null !== $this->ccPosition) {
            $res['ccPosition'] = $this->ccPosition;
        }
        if (null !== $this->targetSelectActioners) {
            $res['targetSelectActioners'] = [];
            if (null !== $this->targetSelectActioners && \is_array($this->targetSelectActioners)) {
                $n = 0;
                foreach ($this->targetSelectActioners as $item) {
                    $res['targetSelectActioners'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->formComponentValues) {
            $res['formComponentValues'] = [];
            if (null !== $this->formComponentValues && \is_array($this->formComponentValues)) {
                $n = 0;
                foreach ($this->formComponentValues as $item) {
                    $res['formComponentValues'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->requestId) {
            $res['RequestId'] = $this->requestId;
        }
        if (null !== $this->dingCorpId) {
            $res['dingCorpId'] = $this->dingCorpId;
        }
        if (null !== $this->dingOrgId) {
            $res['dingOrgId'] = $this->dingOrgId;
        }
        if (null !== $this->dingIsvOrgId) {
            $res['dingIsvOrgId'] = $this->dingIsvOrgId;
        }
        if (null !== $this->dingSuiteKey) {
            $res['dingSuiteKey'] = $this->dingSuiteKey;
        }
        if (null !== $this->dingTokenGrantType) {
            $res['dingTokenGrantType'] = $this->dingTokenGrantType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartProcessInstanceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['originatorUserId'])) {
            $model->originatorUserId = $map['originatorUserId'];
        }
        if (isset($map['processCode'])) {
            $model->processCode = $map['processCode'];
        }
        if (isset($map['deptId'])) {
            $model->deptId = $map['deptId'];
        }
        if (isset($map['microappAgentId'])) {
            $model->microappAgentId = $map['microappAgentId'];
        }
        if (isset($map['approvers'])) {
            if (!empty($map['approvers'])) {
                $model->approvers = [];
                $n                = 0;
                foreach ($map['approvers'] as $item) {
                    $model->approvers[$n++] = null !== $item ? approvers::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ccList'])) {
            if (!empty($map['ccList'])) {
                $model->ccList = $map['ccList'];
            }
        }
        if (isset($map['ccPosition'])) {
            $model->ccPosition = $map['ccPosition'];
        }
        if (isset($map['targetSelectActioners'])) {
            if (!empty($map['targetSelectActioners'])) {
                $model->targetSelectActioners = [];
                $n                            = 0;
                foreach ($map['targetSelectActioners'] as $item) {
                    $model->targetSelectActioners[$n++] = null !== $item ? targetSelectActioners::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['formComponentValues'])) {
            if (!empty($map['formComponentValues'])) {
                $model->formComponentValues = [];
                $n                          = 0;
                foreach ($map['formComponentValues'] as $item) {
                    $model->formComponentValues[$n++] = null !== $item ? formComponentValues::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['RequestId'])) {
            $model->requestId = $map['RequestId'];
        }
        if (isset($map['dingCorpId'])) {
            $model->dingCorpId = $map['dingCorpId'];
        }
        if (isset($map['dingOrgId'])) {
            $model->dingOrgId = $map['dingOrgId'];
        }
        if (isset($map['dingIsvOrgId'])) {
            $model->dingIsvOrgId = $map['dingIsvOrgId'];
        }
        if (isset($map['dingSuiteKey'])) {
            $model->dingSuiteKey = $map['dingSuiteKey'];
        }
        if (isset($map['dingTokenGrantType'])) {
            $model->dingTokenGrantType = $map['dingTokenGrantType'];
        }

        return $model;
    }
}
