// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkdoc_1_0.Models
{
    public class DocBlocksQueryResponseBody : TeaModel {
        [NameInMap("result")]
        [Validation(Required=false)]
        public DocBlocksQueryResponseBodyResult Result { get; set; }
        public class DocBlocksQueryResponseBodyResult : TeaModel {
            [NameInMap("data")]
            [Validation(Required=false)]
            public List<object> Data { get; set; }

        }

        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

    }

}
