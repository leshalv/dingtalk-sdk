// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkdoc_2_0.Models
{
    public class DocContentRequest : TeaModel {
        [NameInMap("option")]
        [Validation(Required=false)]
        public DocContentRequestOption Option { get; set; }
        public class DocContentRequestOption : TeaModel {
            /// <summary>
            /// <b>Example:</b>
            /// <para>markdown</para>
            /// </summary>
            [NameInMap("targetFormat")]
            [Validation(Required=false)]
            public string TargetFormat { get; set; }

        }

        /// <summary>
        /// <para>This parameter is required.</para>
        /// 
        /// <b>Example:</b>
        /// <para>union_id</para>
        /// </summary>
        [NameInMap("operatorId")]
        [Validation(Required=false)]
        public string OperatorId { get; set; }

    }

}
