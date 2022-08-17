<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\Dingtalk\Vedu_1_0\Models;

use AlibabaCloud\Tea\Model;

class QueryOrderRequest extends Model
{
    /**
     * @description 应用id。
     *
     * @var string
     */
    public $appId;

    /**
     * @description 商户id。
     *
     * @var string
     */
    public $merchantId;

    /**
     * @description 订单号。
     *
     * @var string
     */
    public $orderNo;

    /**
     * @description 签名。
     *
     * @var string
     */
    public $signature;
    protected $_name = [
        'appId'      => 'appId',
        'merchantId' => 'merchantId',
        'orderNo'    => 'orderNo',
        'signature'  => 'signature',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appId) {
            $res['appId'] = $this->appId;
        }
        if (null !== $this->merchantId) {
            $res['merchantId'] = $this->merchantId;
        }
        if (null !== $this->orderNo) {
            $res['orderNo'] = $this->orderNo;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryOrderRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['appId'])) {
            $model->appId = $map['appId'];
        }
        if (isset($map['merchantId'])) {
            $model->merchantId = $map['merchantId'];
        }
        if (isset($map['orderNo'])) {
            $model->orderNo = $map['orderNo'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }

        return $model;
    }
}
