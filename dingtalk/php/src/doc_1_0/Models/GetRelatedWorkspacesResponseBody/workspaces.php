<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\Dingtalk\Vdoc_1_0\Models\GetRelatedWorkspacesResponseBody;

use AlibabaCloud\SDK\Dingtalk\Vdoc_1_0\Models\GetRelatedWorkspacesResponseBody\workspaces\recentList;
use AlibabaCloud\Tea\Model;

class workspaces extends Model
{
    /**
     * @description 团队空间Id
     *
     * @var string
     */
    public $workspaceId;

    /**
     * @description 团队空间打开url
     *
     * @var string
     */
    public $url;

    /**
     * @description 团队空间是否被删除
     *
     * @var bool
     */
    public $deleted;

    /**
     * @var string
     */
    public $owner;

    /**
     * @description 用户的角色
     *
     * @var string
     */
    public $role;

    /**
     * @description 团队空间名称
     *
     * @var string
     */
    public $name;

    /**
     * @description 团队空间最近访问文档列表
     *
     * @var recentList[]
     */
    public $recentList;

    /**
     * @description 团队空间创建时间
     *
     * @var int
     */
    public $createTime;
    protected $_name = [
        'workspaceId' => 'workspaceId',
        'url'         => 'url',
        'deleted'     => 'deleted',
        'owner'       => 'owner',
        'role'        => 'role',
        'name'        => 'name',
        'recentList'  => 'recentList',
        'createTime'  => 'createTime',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->workspaceId) {
            $res['workspaceId'] = $this->workspaceId;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->deleted) {
            $res['deleted'] = $this->deleted;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->recentList) {
            $res['recentList'] = [];
            if (null !== $this->recentList && \is_array($this->recentList)) {
                $n = 0;
                foreach ($this->recentList as $item) {
                    $res['recentList'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->createTime) {
            $res['createTime'] = $this->createTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return workspaces
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['workspaceId'])) {
            $model->workspaceId = $map['workspaceId'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['deleted'])) {
            $model->deleted = $map['deleted'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }
        if (isset($map['role'])) {
            $model->role = $map['role'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['recentList'])) {
            if (!empty($map['recentList'])) {
                $model->recentList = [];
                $n                 = 0;
                foreach ($map['recentList'] as $item) {
                    $model->recentList[$n++] = null !== $item ? recentList::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['createTime'])) {
            $model->createTime = $map['createTime'];
        }

        return $model;
    }
}
