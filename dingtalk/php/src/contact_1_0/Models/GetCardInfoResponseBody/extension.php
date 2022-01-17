<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\Dingtalk\Vcontact_1_0\Models\GetCardInfoResponseBody;

use AlibabaCloud\SDK\Dingtalk\Vcontact_1_0\Models\GetCardInfoResponseBody\extension\cardContactInfo;
use AlibabaCloud\Tea\Model;

class extension extends Model
{
    /**
     * @description 企业是否认证
     *
     * @var bool
     */
    public $orgAuthed;

    /**
     * @description 企业认证等级
     *
     * @var int
     */
    public $orgAuthLevel;

    /**
     * @description 企业corpId
     *
     * @var string
     */
    public $corpId;

    /**
     * @description 企业LOGO
     *
     * @var string
     */
    public $orgLogo;

    /**
     * @description 视频链接
     *
     * @var string
     */
    public $videoUrl;

    /**
     * @description 视频标题
     *
     * @var string
     */
    public $videoTitle;

    /**
     * @description 视频缩略图
     *
     * @var string
     */
    public $thumbnailUrl;

    /**
     * @description 视频文件名称
     *
     * @var string
     */
    public $videoFileName;

    /**
     * @description 拍名片图片链接
     *
     * @var string
     */
    public $originCardUrl;

    /**
     * @description 分享文案
     *
     * @var string
     */
    public $shareContent;

    /**
     * @description 拍名片部门
     *
     * @var string
     */
    public $department;

    /**
     * @description 联系信息
     *
     * @var cardContactInfo
     */
    public $cardContactInfo;
    protected $_name = [
        'orgAuthed'       => 'orgAuthed',
        'orgAuthLevel'    => 'orgAuthLevel',
        'corpId'          => 'corpId',
        'orgLogo'         => 'orgLogo',
        'videoUrl'        => 'videoUrl',
        'videoTitle'      => 'videoTitle',
        'thumbnailUrl'    => 'thumbnailUrl',
        'videoFileName'   => 'videoFileName',
        'originCardUrl'   => 'originCardUrl',
        'shareContent'    => 'shareContent',
        'department'      => 'department',
        'cardContactInfo' => 'cardContactInfo',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orgAuthed) {
            $res['orgAuthed'] = $this->orgAuthed;
        }
        if (null !== $this->orgAuthLevel) {
            $res['orgAuthLevel'] = $this->orgAuthLevel;
        }
        if (null !== $this->corpId) {
            $res['corpId'] = $this->corpId;
        }
        if (null !== $this->orgLogo) {
            $res['orgLogo'] = $this->orgLogo;
        }
        if (null !== $this->videoUrl) {
            $res['videoUrl'] = $this->videoUrl;
        }
        if (null !== $this->videoTitle) {
            $res['videoTitle'] = $this->videoTitle;
        }
        if (null !== $this->thumbnailUrl) {
            $res['thumbnailUrl'] = $this->thumbnailUrl;
        }
        if (null !== $this->videoFileName) {
            $res['videoFileName'] = $this->videoFileName;
        }
        if (null !== $this->originCardUrl) {
            $res['originCardUrl'] = $this->originCardUrl;
        }
        if (null !== $this->shareContent) {
            $res['shareContent'] = $this->shareContent;
        }
        if (null !== $this->department) {
            $res['department'] = $this->department;
        }
        if (null !== $this->cardContactInfo) {
            $res['cardContactInfo'] = null !== $this->cardContactInfo ? $this->cardContactInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return extension
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['orgAuthed'])) {
            $model->orgAuthed = $map['orgAuthed'];
        }
        if (isset($map['orgAuthLevel'])) {
            $model->orgAuthLevel = $map['orgAuthLevel'];
        }
        if (isset($map['corpId'])) {
            $model->corpId = $map['corpId'];
        }
        if (isset($map['orgLogo'])) {
            $model->orgLogo = $map['orgLogo'];
        }
        if (isset($map['videoUrl'])) {
            $model->videoUrl = $map['videoUrl'];
        }
        if (isset($map['videoTitle'])) {
            $model->videoTitle = $map['videoTitle'];
        }
        if (isset($map['thumbnailUrl'])) {
            $model->thumbnailUrl = $map['thumbnailUrl'];
        }
        if (isset($map['videoFileName'])) {
            $model->videoFileName = $map['videoFileName'];
        }
        if (isset($map['originCardUrl'])) {
            $model->originCardUrl = $map['originCardUrl'];
        }
        if (isset($map['shareContent'])) {
            $model->shareContent = $map['shareContent'];
        }
        if (isset($map['department'])) {
            $model->department = $map['department'];
        }
        if (isset($map['cardContactInfo'])) {
            $model->cardContactInfo = cardContactInfo::fromMap($map['cardContactInfo']);
        }

        return $model;
    }
}
