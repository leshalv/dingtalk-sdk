<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\Dingtalk\Vdoc_1_0\Models\GetRecentEditDocsResponseBody\recentList;

use AlibabaCloud\Tea\Model;

class nodeBO extends Model
{
    /**
     * @description 节点类型
     *
     * @var string
     */
    public $docType;

    /**
     * @description 是否被删除
     *
     * @var bool
     */
    public $isDeleted;

    /**
     * @description 最后编辑时间
     *
     * @var int
     */
    public $lastEditTime;

    /**
     * @description 文档Id
     *
     * @var string
     */
    public $nodeId;

    /**
     * @description 文档名称
     *
     * @var string
     */
    public $nodeName;

    /**
     * @description 文档打开url
     *
     * @var string
     */
    public $url;
    protected $_name = [
        'docType'      => 'docType',
        'isDeleted'    => 'isDeleted',
        'lastEditTime' => 'lastEditTime',
        'nodeId'       => 'nodeId',
        'nodeName'     => 'nodeName',
        'url'          => 'url',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->docType) {
            $res['docType'] = $this->docType;
        }
        if (null !== $this->isDeleted) {
            $res['isDeleted'] = $this->isDeleted;
        }
        if (null !== $this->lastEditTime) {
            $res['lastEditTime'] = $this->lastEditTime;
        }
        if (null !== $this->nodeId) {
            $res['nodeId'] = $this->nodeId;
        }
        if (null !== $this->nodeName) {
            $res['nodeName'] = $this->nodeName;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
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
        if (isset($map['docType'])) {
            $model->docType = $map['docType'];
        }
        if (isset($map['isDeleted'])) {
            $model->isDeleted = $map['isDeleted'];
        }
        if (isset($map['lastEditTime'])) {
            $model->lastEditTime = $map['lastEditTime'];
        }
        if (isset($map['nodeId'])) {
            $model->nodeId = $map['nodeId'];
        }
        if (isset($map['nodeName'])) {
            $model->nodeName = $map['nodeName'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }

        return $model;
    }
}
