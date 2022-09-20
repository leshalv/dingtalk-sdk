// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkconference_1_0.Models
{
    public class QueryConferenceMembersRequest : TeaModel {
        /// <summary>
        /// 返回的最大结果数
        /// </summary>
        [NameInMap("maxResults")]
        [Validation(Required=false)]
        public int? MaxResults { get; set; }

        /// <summary>
        /// 分页token
        /// </summary>
        [NameInMap("nextToken")]
        [Validation(Required=false)]
        public string NextToken { get; set; }

    }

}