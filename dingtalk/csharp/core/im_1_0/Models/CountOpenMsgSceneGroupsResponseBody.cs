// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkim_1_0.Models
{
    public class CountOpenMsgSceneGroupsResponseBody : TeaModel {
        [NameInMap("result")]
        [Validation(Required=false)]
        public CountOpenMsgSceneGroupsResponseBodyResult Result { get; set; }
        public class CountOpenMsgSceneGroupsResponseBodyResult : TeaModel {
            [NameInMap("count")]
            [Validation(Required=false)]
            public long? Count { get; set; }

        }

        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

    }

}
