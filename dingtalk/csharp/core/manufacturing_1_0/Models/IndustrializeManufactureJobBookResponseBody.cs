// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkmanufacturing_1_0.Models
{
    public class IndustrializeManufactureJobBookResponseBody : TeaModel {
        /// <summary>
        /// content
        /// </summary>
        [NameInMap("content")]
        [Validation(Required=false)]
        public IndustrializeManufactureJobBookResponseBodyContent Content { get; set; }
        public class IndustrializeManufactureJobBookResponseBodyContent : TeaModel {
            /// <summary>
            /// 影响行数
            /// </summary>
            [NameInMap("count")]
            [Validation(Required=false)]
            public int? Count { get; set; }

            /// <summary>
            /// 新增记录的数据库id
            /// </summary>
            [NameInMap("id")]
            [Validation(Required=false)]
            public long? Id { get; set; }

        }

        /// <summary>
        /// errorCode
        /// </summary>
        [NameInMap("errorCode")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        /// <summary>
        /// errorLevel
        /// </summary>
        [NameInMap("errorLevel")]
        [Validation(Required=false)]
        public int? ErrorLevel { get; set; }

        /// <summary>
        /// errorMsg
        /// </summary>
        [NameInMap("errorMsg")]
        [Validation(Required=false)]
        public string ErrorMsg { get; set; }

        /// <summary>
        /// httpCode
        /// </summary>
        [NameInMap("httpCode")]
        [Validation(Required=false)]
        public string HttpCode { get; set; }

        /// <summary>
        /// success
        /// </summary>
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        /// <summary>
        /// 此次报工记录的唯一标识
        /// </summary>
        [NameInMap("uuid")]
        [Validation(Required=false)]
        public string Uuid { get; set; }

    }

}
