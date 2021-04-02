<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\Dingtalk\Vcalendar_1_0\Models\GetEventResponseBody;

use AlibabaCloud\Tea\Model;

class start extends Model
{
    /**
     * @description 日期，格式：yyyyMMdd
     *
     * @var string
     */
    public $date;

    /**
     * @description 时间戳，按照ISO 8601格式
     *
     * @var string
     */
    public $dateTime;

    /**
     * @description 时区
     *
     * @var string
     */
    public $timeZone;
    protected $_name = [
        'date'     => 'date',
        'dateTime' => 'dateTime',
        'timeZone' => 'timeZone',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }
        if (null !== $this->dateTime) {
            $res['dateTime'] = $this->dateTime;
        }
        if (null !== $this->timeZone) {
            $res['timeZone'] = $this->timeZone;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return start
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['date'])) {
            $model->date = $map['date'];
        }
        if (isset($map['dateTime'])) {
            $model->dateTime = $map['dateTime'];
        }
        if (isset($map['timeZone'])) {
            $model->timeZone = $map['timeZone'];
        }

        return $model;
    }
}
