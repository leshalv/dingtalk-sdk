<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\Dingtalk\Vdoc_1_0\Models\BatchGetWorkspaceDocsResponseBody\result;

use AlibabaCloud\Tea\Model;

class nodeBO extends Model
{
    /**
     * @var string
     */
    public $name;

    /**
     * @var string
     */
    public $nodeId;

    /**
     * @var string
     */
    public $url;

    /**
     * @description 最后编辑时间
     *
     * @var int
     */
    public $lastEditTime;

    /**
     * @var bool
     */
    public $deleted;

    /**
     * @description 节点类型
     *
     * @var string
     */
    public $docType;
    protected $_name = [
        'name'         => 'name',
        'nodeId'       => 'nodeId',
        'url'          => 'url',
        'lastEditTime' => 'lastEditTime',
        'deleted'      => 'deleted',
        'docType'      => 'docType',
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
        if (null !== $this->nodeId) {
            $res['nodeId'] = $this->nodeId;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->lastEditTime) {
            $res['lastEditTime'] = $this->lastEditTime;
        }
        if (null !== $this->deleted) {
            $res['deleted'] = $this->deleted;
        }
        if (null !== $this->docType) {
            $res['docType'] = $this->docType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return nodeBO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['nodeId'])) {
            $model->nodeId = $map['nodeId'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['lastEditTime'])) {
            $model->lastEditTime = $map['lastEditTime'];
        }
        if (isset($map['deleted'])) {
            $model->deleted = $map['deleted'];
        }
        if (isset($map['docType'])) {
            $model->docType = $map['docType'];
        }

        return $model;
    }
}
