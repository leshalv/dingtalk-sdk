<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\Dingtalk\Vdevicemng_1_0\Models\RegisterAndActivateDeviceBatchResponseBody\failItems;

use AlibabaCloud\Tea\Model;

class result extends Model
{
    /**
     * @var string
     */
    public $corpId;

    /**
     * @var string
     */
    public $deviceCallbackUrl;

    /**
     * @var string
     */
    public $deviceCode;

    /**
     * @var string
     */
    public $deviceDetailUrl;

    /**
     * @var string
     */
    public $deviceName;

    /**
     * @var string
     */
    public $groupUuid;

    /**
     * @var string
     */
    public $icon;

    /**
     * @var string
     */
    public $introduction;

    /**
     * @var string
     */
    public $roleUuid;

    /**
     * @var int
     */
    public $status;

    /**
     * @var string
     */
    public $typeUuid;

    /**
     * @var string[]
     */
    public $userIds;

    /**
     * @var string
     */
    public $uuid;
    protected $_name = [
        'corpId'            => 'corpId',
        'deviceCallbackUrl' => 'deviceCallbackUrl',
        'deviceCode'        => 'deviceCode',
        'deviceDetailUrl'   => 'deviceDetailUrl',
        'deviceName'        => 'deviceName',
        'groupUuid'         => 'groupUuid',
        'icon'              => 'icon',
        'introduction'      => 'introduction',
        'roleUuid'          => 'roleUuid',
        'status'            => 'status',
        'typeUuid'          => 'typeUuid',
        'userIds'           => 'userIds',
        'uuid'              => 'uuid',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->corpId) {
            $res['corpId'] = $this->corpId;
        }
        if (null !== $this->deviceCallbackUrl) {
            $res['deviceCallbackUrl'] = $this->deviceCallbackUrl;
        }
        if (null !== $this->deviceCode) {
            $res['deviceCode'] = $this->deviceCode;
        }
        if (null !== $this->deviceDetailUrl) {
            $res['deviceDetailUrl'] = $this->deviceDetailUrl;
        }
        if (null !== $this->deviceName) {
            $res['deviceName'] = $this->deviceName;
        }
        if (null !== $this->groupUuid) {
            $res['groupUuid'] = $this->groupUuid;
        }
        if (null !== $this->icon) {
            $res['icon'] = $this->icon;
        }
        if (null !== $this->introduction) {
            $res['introduction'] = $this->introduction;
        }
        if (null !== $this->roleUuid) {
            $res['roleUuid'] = $this->roleUuid;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->typeUuid) {
            $res['typeUuid'] = $this->typeUuid;
        }
        if (null !== $this->userIds) {
            $res['userIds'] = $this->userIds;
        }
        if (null !== $this->uuid) {
            $res['uuid'] = $this->uuid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return result
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['corpId'])) {
            $model->corpId = $map['corpId'];
        }
        if (isset($map['deviceCallbackUrl'])) {
            $model->deviceCallbackUrl = $map['deviceCallbackUrl'];
        }
        if (isset($map['deviceCode'])) {
            $model->deviceCode = $map['deviceCode'];
        }
        if (isset($map['deviceDetailUrl'])) {
            $model->deviceDetailUrl = $map['deviceDetailUrl'];
        }
        if (isset($map['deviceName'])) {
            $model->deviceName = $map['deviceName'];
        }
        if (isset($map['groupUuid'])) {
            $model->groupUuid = $map['groupUuid'];
        }
        if (isset($map['icon'])) {
            $model->icon = $map['icon'];
        }
        if (isset($map['introduction'])) {
            $model->introduction = $map['introduction'];
        }
        if (isset($map['roleUuid'])) {
            $model->roleUuid = $map['roleUuid'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['typeUuid'])) {
            $model->typeUuid = $map['typeUuid'];
        }
        if (isset($map['userIds'])) {
            if (!empty($map['userIds'])) {
                $model->userIds = $map['userIds'];
            }
        }
        if (isset($map['uuid'])) {
            $model->uuid = $map['uuid'];
        }

        return $model;
    }
}
