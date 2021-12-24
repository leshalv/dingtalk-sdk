<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\Dingtalk\Vworkflow_1_0\Models\FormCreateRequest\formComponents\children\props;

use AlibabaCloud\Tea\Model;

class availableTemplates extends Model
{
    /**
     * @description 模板名称
     *
     * @var string
     */
    public $name;

    /**
     * @description 模板processCode
     *
     * @var string
     */
    public $processCode;
    protected $_name = [
        'name'        => 'name',
        'processCode' => 'processCode',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->processCode) {
            $res['processCode'] = $this->processCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return availableTemplates
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['processCode'])) {
            $model->processCode = $map['processCode'];
        }

        return $model;
    }
}
