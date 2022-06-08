// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkdevicemng_1_0.Models
{
    public class UpdateCardRequest : TeaModel {
        /// <summary>
        /// 卡片实例唯一标识
        /// </summary>
        [NameInMap("bizId")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        /// <summary>
        /// 卡片变量赋值，json结构
        /// </summary>
        [NameInMap("cardData")]
        [Validation(Required=false)]
        public string CardData { get; set; }

    }

}
