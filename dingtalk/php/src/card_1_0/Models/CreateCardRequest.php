<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\Dingtalk\Vcard_1_0\Models;

use AlibabaCloud\SDK\Dingtalk\Vcard_1_0\Models\CreateCardRequest\cardData;
use AlibabaCloud\SDK\Dingtalk\Vcard_1_0\Models\CreateCardRequest\coFeedOpenSpaceModel;
use AlibabaCloud\SDK\Dingtalk\Vcard_1_0\Models\CreateCardRequest\imGroupOpenSpaceModel;
use AlibabaCloud\SDK\Dingtalk\Vcard_1_0\Models\CreateCardRequest\imSingleOpenSpaceModel;
use AlibabaCloud\SDK\Dingtalk\Vcard_1_0\Models\CreateCardRequest\openDynamicDataConfig;
use AlibabaCloud\SDK\Dingtalk\Vcard_1_0\Models\CreateCardRequest\topOpenSpaceModel;
use AlibabaCloud\SDK\Dingtalk\Vcard_1_0\Models\CreateCardRequest\workBenchOpenSpaceModel;
use AlibabaCloud\Tea\Model;

class CreateCardRequest extends Model
{
    /**
     * @description 卡片回调时的路由 Key，用于查询注册的 callbackUrl
     *
     * @var string
     */
    public $callbackRouteKey;

    /**
     * @description 卡片数据
     *
     * @var cardData
     */
    public $cardData;

    /**
     * @description 卡片的模版 Id
     *
     * @var string
     */
    public $cardTemplateId;

    /**
     * @description 协作场域信息
     *
     * @var coFeedOpenSpaceModel
     */
    public $coFeedOpenSpaceModel;

    /**
     * @description IM 群聊场域信息
     *
     * @var imGroupOpenSpaceModel
     */
    public $imGroupOpenSpaceModel;

    /**
     * @description IM 单聊场域信息
     *
     * @var imSingleOpenSpaceModel
     */
    public $imSingleOpenSpaceModel;

    /**
     * @description 动态数据源配置
     *
     * @var openDynamicDataConfig
     */
    public $openDynamicDataConfig;

    /**
     * @description 唯一标示卡片的外部编码
     *
     * @var string
     */
    public $outTrackId;

    /**
     * @description 用户的私有数据。
     * ● value：用户私有数据（cardData）
     * @var PrivateDataValue[]
     */
    public $privateData;

    /**
     * @description 吊顶场域信息
     *
     * @var topOpenSpaceModel
     */
    public $topOpenSpaceModel;

    /**
     * @description 卡片创建者的 userId
     *
     * @var string
     */
    public $userId;

    /**
     * @description 工作台场域信息
     *
     * @var workBenchOpenSpaceModel
     */
    public $workBenchOpenSpaceModel;
    protected $_name = [
        'callbackRouteKey'        => 'callbackRouteKey',
        'cardData'                => 'cardData',
        'cardTemplateId'          => 'cardTemplateId',
        'coFeedOpenSpaceModel'    => 'coFeedOpenSpaceModel',
        'imGroupOpenSpaceModel'   => 'imGroupOpenSpaceModel',
        'imSingleOpenSpaceModel'  => 'imSingleOpenSpaceModel',
        'openDynamicDataConfig'   => 'openDynamicDataConfig',
        'outTrackId'              => 'outTrackId',
        'privateData'             => 'privateData',
        'topOpenSpaceModel'       => 'topOpenSpaceModel',
        'userId'                  => 'userId',
        'workBenchOpenSpaceModel' => 'workBenchOpenSpaceModel',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->callbackRouteKey) {
            $res['callbackRouteKey'] = $this->callbackRouteKey;
        }
        if (null !== $this->cardData) {
            $res['cardData'] = null !== $this->cardData ? $this->cardData->toMap() : null;
        }
        if (null !== $this->cardTemplateId) {
            $res['cardTemplateId'] = $this->cardTemplateId;
        }
        if (null !== $this->coFeedOpenSpaceModel) {
            $res['coFeedOpenSpaceModel'] = null !== $this->coFeedOpenSpaceModel ? $this->coFeedOpenSpaceModel->toMap() : null;
        }
        if (null !== $this->imGroupOpenSpaceModel) {
            $res['imGroupOpenSpaceModel'] = null !== $this->imGroupOpenSpaceModel ? $this->imGroupOpenSpaceModel->toMap() : null;
        }
        if (null !== $this->imSingleOpenSpaceModel) {
            $res['imSingleOpenSpaceModel'] = null !== $this->imSingleOpenSpaceModel ? $this->imSingleOpenSpaceModel->toMap() : null;
        }
        if (null !== $this->openDynamicDataConfig) {
            $res['openDynamicDataConfig'] = null !== $this->openDynamicDataConfig ? $this->openDynamicDataConfig->toMap() : null;
        }
        if (null !== $this->outTrackId) {
            $res['outTrackId'] = $this->outTrackId;
        }
        if (null !== $this->privateData) {
            $res['privateData'] = [];
            if (null !== $this->privateData && \is_array($this->privateData)) {
                foreach ($this->privateData as $key => $val) {
                    $res['privateData'][$key] = null !== $val ? $val->toMap() : $val;
                }
            }
        }
        if (null !== $this->topOpenSpaceModel) {
            $res['topOpenSpaceModel'] = null !== $this->topOpenSpaceModel ? $this->topOpenSpaceModel->toMap() : null;
        }
        if (null !== $this->userId) {
            $res['userId'] = $this->userId;
        }
        if (null !== $this->workBenchOpenSpaceModel) {
            $res['workBenchOpenSpaceModel'] = null !== $this->workBenchOpenSpaceModel ? $this->workBenchOpenSpaceModel->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateCardRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['callbackRouteKey'])) {
            $model->callbackRouteKey = $map['callbackRouteKey'];
        }
        if (isset($map['cardData'])) {
            $model->cardData = cardData::fromMap($map['cardData']);
        }
        if (isset($map['cardTemplateId'])) {
            $model->cardTemplateId = $map['cardTemplateId'];
        }
        if (isset($map['coFeedOpenSpaceModel'])) {
            $model->coFeedOpenSpaceModel = coFeedOpenSpaceModel::fromMap($map['coFeedOpenSpaceModel']);
        }
        if (isset($map['imGroupOpenSpaceModel'])) {
            $model->imGroupOpenSpaceModel = imGroupOpenSpaceModel::fromMap($map['imGroupOpenSpaceModel']);
        }
        if (isset($map['imSingleOpenSpaceModel'])) {
            $model->imSingleOpenSpaceModel = imSingleOpenSpaceModel::fromMap($map['imSingleOpenSpaceModel']);
        }
        if (isset($map['openDynamicDataConfig'])) {
            $model->openDynamicDataConfig = openDynamicDataConfig::fromMap($map['openDynamicDataConfig']);
        }
        if (isset($map['outTrackId'])) {
            $model->outTrackId = $map['outTrackId'];
        }
        if (isset($map['privateData'])) {
            $model->privateData = $map['privateData'];
        }
        if (isset($map['topOpenSpaceModel'])) {
            $model->topOpenSpaceModel = topOpenSpaceModel::fromMap($map['topOpenSpaceModel']);
        }
        if (isset($map['userId'])) {
            $model->userId = $map['userId'];
        }
        if (isset($map['workBenchOpenSpaceModel'])) {
            $model->workBenchOpenSpaceModel = workBenchOpenSpaceModel::fromMap($map['workBenchOpenSpaceModel']);
        }

        return $model;
    }
}