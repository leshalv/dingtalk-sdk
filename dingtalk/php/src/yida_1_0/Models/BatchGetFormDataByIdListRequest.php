<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\Dingtalk\Vyida_1_0\Models;

use AlibabaCloud\Tea\Model;

class BatchGetFormDataByIdListRequest extends Model
{
    /**
     * @description This parameter is required.
     *
     * @example APP_XCE0EVXS6DYG3YDYC5RD
     *
     * @var string
     */
    public $appType;

    /**
     * @description This parameter is required.
     *
     * @example FINST-J8766S91O2UYN87ZX3XOF1MY8MBA2912BSV0L24
     *
     * @var string[]
     */
    public $formInstanceIdList;

    /**
     * @description This parameter is required.
     *
     * @example FORM-GX866MC1NC1VOFF6WVQW33FD16E23L3CPMKVKA
     *
     * @var string
     */
    public $formUuid;

    /**
     * @example true
     *
     * @var bool
     */
    public $needFormInstanceValue;

    /**
     * @description This parameter is required.
     *
     * @example 09866181UTZVVD4R3DC955FNKIM52HVPU5WWK7
     *
     * @var string
     */
    public $systemToken;

    /**
     * @description This parameter is required.
     *
     * @example ding173982232112232
     *
     * @var string
     */
    public $userId;
    protected $_name = [
        'appType'               => 'appType',
        'formInstanceIdList'    => 'formInstanceIdList',
        'formUuid'              => 'formUuid',
        'needFormInstanceValue' => 'needFormInstanceValue',
        'systemToken'           => 'systemToken',
        'userId'                => 'userId',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appType) {
            $res['appType'] = $this->appType;
        }
        if (null !== $this->formInstanceIdList) {
            $res['formInstanceIdList'] = $this->formInstanceIdList;
        }
        if (null !== $this->formUuid) {
            $res['formUuid'] = $this->formUuid;
        }
        if (null !== $this->needFormInstanceValue) {
            $res['needFormInstanceValue'] = $this->needFormInstanceValue;
        }
        if (null !== $this->systemToken) {
            $res['systemToken'] = $this->systemToken;
        }
        if (null !== $this->userId) {
            $res['userId'] = $this->userId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchGetFormDataByIdListRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['appType'])) {
            $model->appType = $map['appType'];
        }
        if (isset($map['formInstanceIdList'])) {
            if (!empty($map['formInstanceIdList'])) {
                $model->formInstanceIdList = $map['formInstanceIdList'];
            }
        }
        if (isset($map['formUuid'])) {
            $model->formUuid = $map['formUuid'];
        }
        if (isset($map['needFormInstanceValue'])) {
            $model->needFormInstanceValue = $map['needFormInstanceValue'];
        }
        if (isset($map['systemToken'])) {
            $model->systemToken = $map['systemToken'];
        }
        if (isset($map['userId'])) {
            $model->userId = $map['userId'];
        }

        return $model;
    }
}
