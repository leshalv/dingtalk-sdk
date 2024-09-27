// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkservice_group_1_0.Models
{
    public class GetTicketRequest : TeaModel {
        /// <summary>
        /// <para>This parameter is required.</para>
        /// </summary>
        [NameInMap("openTeamId")]
        [Validation(Required=false)]
        public string OpenTeamId { get; set; }

        /// <summary>
        /// <para>This parameter is required.</para>
        /// </summary>
        [NameInMap("openTicketId")]
        [Validation(Required=false)]
        public string OpenTicketId { get; set; }

    }

}
