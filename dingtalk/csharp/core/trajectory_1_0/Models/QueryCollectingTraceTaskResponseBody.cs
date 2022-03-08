// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalktrajectory_1_0.Models
{
    public class QueryCollectingTraceTaskResponseBody : TeaModel {
        /// <summary>
        /// result
        /// </summary>
        [NameInMap("list")]
        [Validation(Required=false)]
        public List<QueryCollectingTraceTaskResponseBodyList> List { get; set; }
        public class QueryCollectingTraceTaskResponseBodyList : TeaModel {
            /// <summary>
            /// 应用轨迹ID
            /// </summary>
            [NameInMap("appTraceId")]
            [Validation(Required=false)]
            public string AppTraceId { get; set; }

            [NameInMap("geoCollectPeriod")]
            [Validation(Required=false)]
            public long? GeoCollectPeriod { get; set; }

            [NameInMap("geoReportPeriod")]
            [Validation(Required=false)]
            public long? GeoReportPeriod { get; set; }

            [NameInMap("geoReportStatus")]
            [Validation(Required=false)]
            public long? GeoReportStatus { get; set; }

            [NameInMap("reportEndTime")]
            [Validation(Required=false)]
            public long? ReportEndTime { get; set; }

            [NameInMap("reportStartTime")]
            [Validation(Required=false)]
            public long? ReportStartTime { get; set; }

            /// <summary>
            /// 组织下员工Id
            /// </summary>
            [NameInMap("userId")]
            [Validation(Required=false)]
            public string UserId { get; set; }

        }

    }

}
