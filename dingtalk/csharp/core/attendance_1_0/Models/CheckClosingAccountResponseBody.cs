// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkattendance_1_0.Models
{
    public class CheckClosingAccountResponseBody : TeaModel {
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        [NameInMap("mesage")]
        [Validation(Required=false)]
        public string Mesage { get; set; }

        [NameInMap("pass")]
        [Validation(Required=false)]
        public bool? Pass { get; set; }

    }

}
