<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\Dingtalk\Vindustry_1_0\Models\BatchGetTaskResultResponseBody\tasks;

use AlibabaCloud\SDK\Dingtalk\Vindustry_1_0\Models\BatchGetTaskResultResponseBody\tasks\result\items;
use AlibabaCloud\Tea\Model;

class result extends Model
{
    /**
     * @example https://industry-ai-prod.oss-cn-zhangjiakou.aliyuncs.com/4beae5155406457291fcbdd76c4e8da8.txt
     *
     * @var string
     */
    public $audioText;

    /**
     * @example 2024-05-14
     *
     * @var string
     */
    public $date;

    /**
     * @example xxx项目
     *
     * @var string
     */
    public $desc;

    /**
     * @example 1001
     *
     * @var int
     */
    public $id;

    /**
     * @var items[]
     */
    public $items;

    /**
     * @example xxx项目会议
     *
     * @var string
     */
    public $name;

    /**
     * @example 100
     *
     * @var int
     */
    public $total;
    protected $_name = [
        'audioText' => 'audioText',
        'date'      => 'date',
        'desc'      => 'desc',
        'id'        => 'id',
        'items'     => 'items',
        'name'      => 'name',
        'total'     => 'total',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->audioText) {
            $res['audioText'] = $this->audioText;
        }
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->items) {
            $res['items'] = [];
            if (null !== $this->items && \is_array($this->items)) {
                $n = 0;
                foreach ($this->items as $item) {
                    $res['items'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
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
        if (isset($map['audioText'])) {
            $model->audioText = $map['audioText'];
        }
        if (isset($map['date'])) {
            $model->date = $map['date'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['items'])) {
            if (!empty($map['items'])) {
                $model->items = [];
                $n            = 0;
                foreach ($map['items'] as $item) {
                    $model->items[$n++] = null !== $item ? items::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }

        return $model;
    }
}
