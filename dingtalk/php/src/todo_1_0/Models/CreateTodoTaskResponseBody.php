<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\Dingtalk\Vtodo_1_0\Models;

use AlibabaCloud\SDK\Dingtalk\Vtodo_1_0\Models\CreateTodoTaskResponseBody\detailUrl;
use AlibabaCloud\SDK\Dingtalk\Vtodo_1_0\Models\CreateTodoTaskResponseBody\notifyConfigs;
use AlibabaCloud\SDK\Dingtalk\Vtodo_1_0\Models\CreateTodoTaskResponseBody\reminder;
use AlibabaCloud\Tea\Model;

class CreateTodoTaskResponseBody extends Model
{
    /**
     * @description id
     *
     * @var string
     */
    public $id;

    /**
     * @description 标题
     *
     * @var string
     */
    public $subject;

    /**
     * @description 描述
     *
     * @var string
     */
    public $description;

    /**
     * @description 开始时间
     *
     * @var int
     */
    public $startTime;

    /**
     * @description 截止时间
     *
     * @var int
     */
    public $dueTime;

    /**
     * @description 完成时间
     *
     * @var int
     */
    public $finishTime;

    /**
     * @description 完成状态
     *
     * @var bool
     */
    public $done;

    /**
     * @description 执行者列表
     *
     * @var string[]
     */
    public $executorIds;

    /**
     * @description 参与者列表
     *
     * @var string[]
     */
    public $participantIds;

    /**
     * @description 提醒规则
     *
     * @var reminder
     */
    public $reminder;

    /**
     * @description 待办通知配置（包含单聊卡片、ding通知、群聊卡片、同步日历、同步系统消息等通知能力）
     *
     * @var notifyConfigs
     */
    public $notifyConfigs;

    /**
     * @description 自定义详情页跳转配置
     *
     * @var detailUrl
     */
    public $detailUrl;

    /**
     * @description 重复规则
     *
     * @var string
     */
    public $recurrence;

    /**
     * @description 业务来源
     *
     * @var string
     */
    public $source;

    /**
     * @description 业务来源id
     *
     * @var string
     */
    public $sourceId;

    /**
     * @description 创建时间
     *
     * @var int
     */
    public $createdTime;

    /**
     * @description 更新时间
     *
     * @var int
     */
    public $modifiedTime;

    /**
     * @description 创建者
     *
     * @var string
     */
    public $creatorId;

    /**
     * @description 更新者
     *
     * @var string
     */
    public $modifierId;

    /**
     * @description 租户id
     *
     * @var string
     */
    public $tenantId;

    /**
     * @description 接入应用标识
     *
     * @var string
     */
    public $bizTag;

    /**
     * @description requestId
     *
     * @var string
     */
    public $requestId;
    protected $_name = [
        'id'             => 'id',
        'subject'        => 'subject',
        'description'    => 'description',
        'startTime'      => 'startTime',
        'dueTime'        => 'dueTime',
        'finishTime'     => 'finishTime',
        'done'           => 'done',
        'executorIds'    => 'executorIds',
        'participantIds' => 'participantIds',
        'reminder'       => 'reminder',
        'notifyConfigs'  => 'notifyConfigs',
        'detailUrl'      => 'detailUrl',
        'recurrence'     => 'recurrence',
        'source'         => 'source',
        'sourceId'       => 'sourceId',
        'createdTime'    => 'createdTime',
        'modifiedTime'   => 'modifiedTime',
        'creatorId'      => 'creatorId',
        'modifierId'     => 'modifierId',
        'tenantId'       => 'tenantId',
        'bizTag'         => 'bizTag',
        'requestId'      => 'requestId',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->subject) {
            $res['subject'] = $this->subject;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->startTime) {
            $res['startTime'] = $this->startTime;
        }
        if (null !== $this->dueTime) {
            $res['dueTime'] = $this->dueTime;
        }
        if (null !== $this->finishTime) {
            $res['finishTime'] = $this->finishTime;
        }
        if (null !== $this->done) {
            $res['done'] = $this->done;
        }
        if (null !== $this->executorIds) {
            $res['executorIds'] = $this->executorIds;
        }
        if (null !== $this->participantIds) {
            $res['participantIds'] = $this->participantIds;
        }
        if (null !== $this->reminder) {
            $res['reminder'] = null !== $this->reminder ? $this->reminder->toMap() : null;
        }
        if (null !== $this->notifyConfigs) {
            $res['notifyConfigs'] = null !== $this->notifyConfigs ? $this->notifyConfigs->toMap() : null;
        }
        if (null !== $this->detailUrl) {
            $res['detailUrl'] = null !== $this->detailUrl ? $this->detailUrl->toMap() : null;
        }
        if (null !== $this->recurrence) {
            $res['recurrence'] = $this->recurrence;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->sourceId) {
            $res['sourceId'] = $this->sourceId;
        }
        if (null !== $this->createdTime) {
            $res['createdTime'] = $this->createdTime;
        }
        if (null !== $this->modifiedTime) {
            $res['modifiedTime'] = $this->modifiedTime;
        }
        if (null !== $this->creatorId) {
            $res['creatorId'] = $this->creatorId;
        }
        if (null !== $this->modifierId) {
            $res['modifierId'] = $this->modifierId;
        }
        if (null !== $this->tenantId) {
            $res['tenantId'] = $this->tenantId;
        }
        if (null !== $this->bizTag) {
            $res['bizTag'] = $this->bizTag;
        }
        if (null !== $this->requestId) {
            $res['requestId'] = $this->requestId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateTodoTaskResponseBody
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['subject'])) {
            $model->subject = $map['subject'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['startTime'])) {
            $model->startTime = $map['startTime'];
        }
        if (isset($map['dueTime'])) {
            $model->dueTime = $map['dueTime'];
        }
        if (isset($map['finishTime'])) {
            $model->finishTime = $map['finishTime'];
        }
        if (isset($map['done'])) {
            $model->done = $map['done'];
        }
        if (isset($map['executorIds'])) {
            if (!empty($map['executorIds'])) {
                $model->executorIds = $map['executorIds'];
            }
        }
        if (isset($map['participantIds'])) {
            if (!empty($map['participantIds'])) {
                $model->participantIds = $map['participantIds'];
            }
        }
        if (isset($map['reminder'])) {
            $model->reminder = reminder::fromMap($map['reminder']);
        }
        if (isset($map['notifyConfigs'])) {
            $model->notifyConfigs = notifyConfigs::fromMap($map['notifyConfigs']);
        }
        if (isset($map['detailUrl'])) {
            $model->detailUrl = detailUrl::fromMap($map['detailUrl']);
        }
        if (isset($map['recurrence'])) {
            $model->recurrence = $map['recurrence'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['sourceId'])) {
            $model->sourceId = $map['sourceId'];
        }
        if (isset($map['createdTime'])) {
            $model->createdTime = $map['createdTime'];
        }
        if (isset($map['modifiedTime'])) {
            $model->modifiedTime = $map['modifiedTime'];
        }
        if (isset($map['creatorId'])) {
            $model->creatorId = $map['creatorId'];
        }
        if (isset($map['modifierId'])) {
            $model->modifierId = $map['modifierId'];
        }
        if (isset($map['tenantId'])) {
            $model->tenantId = $map['tenantId'];
        }
        if (isset($map['bizTag'])) {
            $model->bizTag = $map['bizTag'];
        }
        if (isset($map['requestId'])) {
            $model->requestId = $map['requestId'];
        }

        return $model;
    }
}
