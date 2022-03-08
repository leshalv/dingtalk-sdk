// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkyida_1_0.Models
{
    public class GetFormComponentDefinitionListResponseBody : TeaModel {
        [NameInMap("result")]
        [Validation(Required=false)]
        public List<GetFormComponentDefinitionListResponseBodyResult> Result { get; set; }
        public class GetFormComponentDefinitionListResponseBodyResult : TeaModel {
            /// <summary>
            /// componentName
            /// </summary>
            [NameInMap("componentName")]
            [Validation(Required=false)]
            public string ComponentName { get; set; }

            /// <summary>
            /// key
            /// </summary>
            [NameInMap("fieldId")]
            [Validation(Required=false)]
            public string FieldId { get; set; }

            /// <summary>
            /// label
            /// </summary>
            [NameInMap("label")]
            [Validation(Required=false)]
            public string Label { get; set; }

            /// <summary>
            /// parentId
            /// </summary>
            [NameInMap("parentId")]
            [Validation(Required=false)]
            public string ParentId { get; set; }

        }

    }

}
