<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\Dingtalk\Vservice_group_1_0\Models\AddOpenKnowledgeResponseBody;

use AlibabaCloud\Tea\Model;

class result extends Model
{
    /**
     * @description 知识点ID
     *
     * @var int
     */
    public $id;

    /**
     * @description 失败错误消息
     *
     * @var string
     */
    public $message;

    /**
     * @description 操作是否成功标识
     *
     * @var bool
     */
    public $success;
    protected $_name = [
        'id'      => 'id',
        'message' => 'message',
        'success' => 'success',
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
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }

        return $model;
    }
}
