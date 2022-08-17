<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\Dingtalk\Vedu_1_0\Models;

use AlibabaCloud\Tea\Model;

class CancelUserOrderResponseBody extends Model
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
     * @description 商户订单号。
     *
     * @var string
     */
    public $merchantOrderNo;

    /**
     * @description 订单号。
     *
     * @var string
     */
    public $orderNo;

    /**
     * @var int
     */
    public $payStatus;

    /**
     * @var int
     */
    public $refundStatus;

    /**
     * @var int
     */
    public $totalAmount;
    protected $_name = [
        'appId'           => 'appId',
        'merchantId'      => 'merchantId',
        'merchantOrderNo' => 'merchantOrderNo',
        'orderNo'         => 'orderNo',
        'payStatus'       => 'payStatus',
        'refundStatus'    => 'refundStatus',
        'totalAmount'     => 'totalAmount',
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
        if (null !== $this->merchantOrderNo) {
            $res['merchantOrderNo'] = $this->merchantOrderNo;
        }
        if (null !== $this->orderNo) {
            $res['orderNo'] = $this->orderNo;
        }
        if (null !== $this->payStatus) {
            $res['payStatus'] = $this->payStatus;
        }
        if (null !== $this->refundStatus) {
            $res['refundStatus'] = $this->refundStatus;
        }
        if (null !== $this->totalAmount) {
            $res['totalAmount'] = $this->totalAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelUserOrderResponseBody
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
        if (isset($map['merchantOrderNo'])) {
            $model->merchantOrderNo = $map['merchantOrderNo'];
        }
        if (isset($map['orderNo'])) {
            $model->orderNo = $map['orderNo'];
        }
        if (isset($map['payStatus'])) {
            $model->payStatus = $map['payStatus'];
        }
        if (isset($map['refundStatus'])) {
            $model->refundStatus = $map['refundStatus'];
        }
        if (isset($map['totalAmount'])) {
            $model->totalAmount = $map['totalAmount'];
        }

        return $model;
    }
}
