// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkyida_1_0.Models
{
    public class GetProcessDefinitionRequest : TeaModel {
        [NameInMap("appType")]
        [Validation(Required=false)]
        public string AppType { get; set; }

        [NameInMap("corpId")]
        [Validation(Required=false)]
        public string CorpId { get; set; }

        [NameInMap("groupId")]
        [Validation(Required=false)]
        public string GroupId { get; set; }

        [NameInMap("language")]
        [Validation(Required=false)]
        public string Language { get; set; }

        [NameInMap("nameSpace")]
        [Validation(Required=false)]
        public string NameSpace { get; set; }

        [NameInMap("orderNumber")]
        [Validation(Required=false)]
        public string OrderNumber { get; set; }

        [NameInMap("systemToken")]
        [Validation(Required=false)]
        public string SystemToken { get; set; }

        [NameInMap("systemType")]
        [Validation(Required=false)]
        public string SystemType { get; set; }

        [NameInMap("userId")]
        [Validation(Required=false)]
        public string UserId { get; set; }

    }

}
