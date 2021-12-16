<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\Dingtalk\Vdrive_1_0\Models;

use AlibabaCloud\Tea\Model;

class GetDownloadInfoRequest extends Model
{
    /**
     * @description 用户id
     *
     * @var string
     */
    public $unionId;

    /**
     * @description 是否返回区域信息
     *
     * @var bool
     */
    public $withRegion;

    /**
     * @description 是否返回内网加签url
     *
     * @var bool
     */
    public $withInternalResourceUrl;
    protected $_name = [
        'unionId'                 => 'unionId',
        'withRegion'              => 'withRegion',
        'withInternalResourceUrl' => 'withInternalResourceUrl',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->unionId) {
            $res['unionId'] = $this->unionId;
        }
        if (null !== $this->withRegion) {
            $res['withRegion'] = $this->withRegion;
        }
        if (null !== $this->withInternalResourceUrl) {
            $res['withInternalResourceUrl'] = $this->withInternalResourceUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetDownloadInfoRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['unionId'])) {
            $model->unionId = $map['unionId'];
        }
        if (isset($map['withRegion'])) {
            $model->withRegion = $map['withRegion'];
        }
        if (isset($map['withInternalResourceUrl'])) {
            $model->withInternalResourceUrl = $map['withInternalResourceUrl'];
        }

        return $model;
    }
}
