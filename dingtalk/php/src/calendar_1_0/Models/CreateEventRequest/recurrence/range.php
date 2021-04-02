<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\Dingtalk\Vcalendar_1_0\Models\CreateEventRequest\recurrence;

use AlibabaCloud\Tea\Model;

class range extends Model
{
    /**
     * @var string
     */
    public $type;

    /**
     * @var string
     */
    public $endDate;

    /**
     * @var int
     */
    public $numberOfOccurrences;
    protected $_name = [
        'type'                => 'type',
        'endDate'             => 'endDate',
        'numberOfOccurrences' => 'numberOfOccurrences',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->endDate) {
            $res['endDate'] = $this->endDate;
        }
        if (null !== $this->numberOfOccurrences) {
            $res['numberOfOccurrences'] = $this->numberOfOccurrences;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return range
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['endDate'])) {
            $model->endDate = $map['endDate'];
        }
        if (isset($map['numberOfOccurrences'])) {
            $model->numberOfOccurrences = $map['numberOfOccurrences'];
        }

        return $model;
    }
}
