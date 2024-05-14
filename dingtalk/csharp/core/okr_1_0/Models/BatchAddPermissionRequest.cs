// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkokr_1_0.Models
{
    public class BatchAddPermissionRequest : TeaModel {
        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("list")]
        [Validation(Required=false)]
        public List<BatchAddPermissionRequestList> List { get; set; }
        public class BatchAddPermissionRequestList : TeaModel {
            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("member")]
            [Validation(Required=false)]
            public BatchAddPermissionRequestListMember Member { get; set; }
            public class BatchAddPermissionRequestListMember : TeaModel {
                /// <summary>
                /// This parameter is required.
                /// </summary>
                [NameInMap("id")]
                [Validation(Required=false)]
                public string Id { get; set; }

                /// <summary>
                /// This parameter is required.
                /// </summary>
                [NameInMap("type")]
                [Validation(Required=false)]
                public string Type { get; set; }

            }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("policyType")]
            [Validation(Required=false)]
            public long? PolicyType { get; set; }

        }

        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("targetId")]
        [Validation(Required=false)]
        public string TargetId { get; set; }

        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("targetType")]
        [Validation(Required=false)]
        public string TargetType { get; set; }

        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("userId")]
        [Validation(Required=false)]
        public string UserId { get; set; }

    }

}
