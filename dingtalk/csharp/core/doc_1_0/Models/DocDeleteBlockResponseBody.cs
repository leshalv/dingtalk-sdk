// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkdoc_1_0.Models
{
    public class DocDeleteBlockResponseBody : TeaModel {
        [NameInMap("result")]
        [Validation(Required=false)]
        public DocDeleteBlockResponseBodyResult Result { get; set; }
        public class DocDeleteBlockResponseBodyResult : TeaModel {
            [NameInMap("data")]
            [Validation(Required=false)]
            public Dictionary<string, object> Data { get; set; }

        }

        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

    }

}
