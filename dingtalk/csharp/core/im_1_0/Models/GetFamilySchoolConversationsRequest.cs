// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkim_1_0.Models
{
    public class GetFamilySchoolConversationsRequest : TeaModel {
        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("maxResults")]
        [Validation(Required=false)]
        public int? MaxResults { get; set; }

        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("nextToken")]
        [Validation(Required=false)]
        public long? NextToken { get; set; }

        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("unionId")]
        [Validation(Required=false)]
        public string UnionId { get; set; }

    }

}
