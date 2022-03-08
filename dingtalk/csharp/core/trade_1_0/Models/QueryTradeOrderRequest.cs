// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalktrade_1_0.Models
{
    public class QueryTradeOrderRequest : TeaModel {
        /// <summary>
        /// 内部订单号
        /// </summary>
        [NameInMap("orderId")]
        [Validation(Required=false)]
        public long? OrderId { get; set; }

        /// <summary>
        /// 外部订单号
        /// </summary>
        [NameInMap("outerOrderId")]
        [Validation(Required=false)]
        public string OuterOrderId { get; set; }

    }

}
