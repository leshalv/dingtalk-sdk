// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkim_1_0.Models
{
    public class QueryGroupMuteStatusResponseBody : TeaModel {
        /// <summary>
        /// 群禁言状态
        /// </summary>
        [NameInMap("groupMuteMode")]
        [Validation(Required=false)]
        public bool? GroupMuteMode { get; set; }

        [NameInMap("userMuteResult")]
        [Validation(Required=false)]
        public QueryGroupMuteStatusResponseBodyUserMuteResult UserMuteResult { get; set; }
        public class QueryGroupMuteStatusResponseBodyUserMuteResult : TeaModel {
            /// <summary>
            /// 禁言结束时间
            /// </summary>
            [NameInMap("muteEndTime")]
            [Validation(Required=false)]
            public long? MuteEndTime { get; set; }

            /// <summary>
            /// 禁言开始时间
            /// </summary>
            [NameInMap("muteStartTime")]
            [Validation(Required=false)]
            public long? MuteStartTime { get; set; }

            /// <summary>
            /// 成员禁言状态
            /// </summary>
            [NameInMap("userMuteMode")]
            [Validation(Required=false)]
            public bool? UserMuteMode { get; set; }

        }

    }

}
