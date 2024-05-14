// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkhrm_1_0.Models
{
    public class SolutionTaskInitRequest : TeaModel {
        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("category")]
        [Validation(Required=false)]
        public string Category { get; set; }

        [NameInMap("claimTime")]
        [Validation(Required=false)]
        public long? ClaimTime { get; set; }

        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        [NameInMap("finishTime")]
        [Validation(Required=false)]
        public long? FinishTime { get; set; }

        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("outerId")]
        [Validation(Required=false)]
        public string OuterId { get; set; }

        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("userId")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("solutionType")]
        [Validation(Required=false)]
        public string SolutionType { get; set; }

    }

}
