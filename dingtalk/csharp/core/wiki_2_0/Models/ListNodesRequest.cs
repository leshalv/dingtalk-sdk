// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkwiki_2_0.Models
{
    public class ListNodesRequest : TeaModel {
        [NameInMap("maxResults")]
        [Validation(Required=false)]
        public int? MaxResults { get; set; }

        [NameInMap("nextToken")]
        [Validation(Required=false)]
        public string NextToken { get; set; }

        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("operatorId")]
        [Validation(Required=false)]
        public string OperatorId { get; set; }

        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("parentNodeId")]
        [Validation(Required=false)]
        public string ParentNodeId { get; set; }

        [NameInMap("withPermissionRole")]
        [Validation(Required=false)]
        public bool? WithPermissionRole { get; set; }

    }

}
