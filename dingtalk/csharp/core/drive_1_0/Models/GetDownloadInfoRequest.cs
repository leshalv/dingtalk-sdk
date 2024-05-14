// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkdrive_1_0.Models
{
    public class GetDownloadInfoRequest : TeaModel {
        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("unionId")]
        [Validation(Required=false)]
        public string UnionId { get; set; }

        [NameInMap("withInternalResourceUrl")]
        [Validation(Required=false)]
        public bool? WithInternalResourceUrl { get; set; }

        [NameInMap("withRegion")]
        [Validation(Required=false)]
        public bool? WithRegion { get; set; }

    }

}
