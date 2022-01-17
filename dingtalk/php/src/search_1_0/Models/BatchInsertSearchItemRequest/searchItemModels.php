<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\Dingtalk\Vsearch_1_0\Models\BatchInsertSearchItemRequest;

use AlibabaCloud\Tea\Model;

class searchItemModels extends Model
{
    /**
     * @description 数据项的id，tabId和orgId相同的情况下，itemId唯一标识一条数据项，长度不能超过128
     *
     * @var string
     */
    public $itemId;

    /**
     * @description 数据项的标题，长度不能超过16
     *
     * @var string
     */
    public $title;

    /**
     * @description 数据项的脚注，长度不能超过64
     *
     * @var string
     */
    public $footer;

    /**
     * @description 数据项的摘要，长度不能超过64
     *
     * @var string
     */
    public $summary;

    /**
     * @description 数据项的头像，长度不能超过512
     *
     * @var string
     */
    public $icon;

    /**
     * @description 数据项的默认url地址，若mobileUrl或pcUrl没有配置，则使用该url地址，默认url和mobileUrl、pcUrl至少配置其中一个
     *
     * @var string
     */
    public $url;

    /**
     * @description 数据项的移动端跳转url地址，若同时配置默认url和mobileUrl，移动端跳转链接优先使用mobileUrl
     *
     * @var string
     */
    public $mobileUrl;

    /**
     * @description 数据项的PC端跳转url地址，若同时配置默认url和pcUrl，PC端跳转链接优先使用pcUrl
     *
     * @var string
     */
    public $pcUrl;
    protected $_name = [
        'itemId'    => 'itemId',
        'title'     => 'title',
        'footer'    => 'footer',
        'summary'   => 'summary',
        'icon'      => 'icon',
        'url'       => 'url',
        'mobileUrl' => 'mobileUrl',
        'pcUrl'     => 'pcUrl',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->itemId) {
            $res['itemId'] = $this->itemId;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->footer) {
            $res['footer'] = $this->footer;
        }
        if (null !== $this->summary) {
            $res['summary'] = $this->summary;
        }
        if (null !== $this->icon) {
            $res['icon'] = $this->icon;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->mobileUrl) {
            $res['mobileUrl'] = $this->mobileUrl;
        }
        if (null !== $this->pcUrl) {
            $res['pcUrl'] = $this->pcUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return searchItemModels
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['itemId'])) {
            $model->itemId = $map['itemId'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['footer'])) {
            $model->footer = $map['footer'];
        }
        if (isset($map['summary'])) {
            $model->summary = $map['summary'];
        }
        if (isset($map['icon'])) {
            $model->icon = $map['icon'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['mobileUrl'])) {
            $model->mobileUrl = $map['mobileUrl'];
        }
        if (isset($map['pcUrl'])) {
            $model->pcUrl = $map['pcUrl'];
        }

        return $model;
    }
}