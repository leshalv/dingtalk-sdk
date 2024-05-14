// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkindustry_1_0.Models
{
    public class IndustryManufactureCostRecordListGetResponseBody : TeaModel {
        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("hasMore")]
        [Validation(Required=false)]
        public bool? HasMore { get; set; }

        [NameInMap("list")]
        [Validation(Required=false)]
        public List<IndustryManufactureCostRecordListGetResponseBodyList> List { get; set; }
        public class IndustryManufactureCostRecordListGetResponseBodyList : TeaModel {
            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("corpId")]
            [Validation(Required=false)]
            public string CorpId { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("count")]
            [Validation(Required=false)]
            public float? Count { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("ext")]
            [Validation(Required=false)]
            public string Ext { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("gmtCreate")]
            [Validation(Required=false)]
            public long? GmtCreate { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("gmtModified")]
            [Validation(Required=false)]
            public long? GmtModified { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("instanceId")]
            [Validation(Required=false)]
            public string InstanceId { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("isDeleted")]
            [Validation(Required=false)]
            public string IsDeleted { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("materialCostRecordNo")]
            [Validation(Required=false)]
            public string MaterialCostRecordNo { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("materialName")]
            [Validation(Required=false)]
            public string MaterialName { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("materialNo")]
            [Validation(Required=false)]
            public string MaterialNo { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("memo")]
            [Validation(Required=false)]
            public string Memo { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("orderNo")]
            [Validation(Required=false)]
            public string OrderNo { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("price")]
            [Validation(Required=false)]
            public float? Price { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("processCode")]
            [Validation(Required=false)]
            public string ProcessCode { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("productionTaskNo")]
            [Validation(Required=false)]
            public string ProductionTaskNo { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("realCount")]
            [Validation(Required=false)]
            public float? RealCount { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("realPrice")]
            [Validation(Required=false)]
            public float? RealPrice { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("type")]
            [Validation(Required=false)]
            public string Type { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("unit")]
            [Validation(Required=false)]
            public string Unit { get; set; }

        }

        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("nextCursor")]
        [Validation(Required=false)]
        public long? NextCursor { get; set; }

        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("totalCount")]
        [Validation(Required=false)]
        public long? TotalCount { get; set; }

    }

}
