// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkcalendar_1_0.Models
{
    public class CreateAclsRequest : TeaModel {
        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("privilege")]
        [Validation(Required=false)]
        public string Privilege { get; set; }

        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("scope")]
        [Validation(Required=false)]
        public CreateAclsRequestScope Scope { get; set; }
        public class CreateAclsRequestScope : TeaModel {
            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("scopeType")]
            [Validation(Required=false)]
            public string ScopeType { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("userId")]
            [Validation(Required=false)]
            public string UserId { get; set; }

        }

        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("sendMsg")]
        [Validation(Required=false)]
        public bool? SendMsg { get; set; }

    }

}
