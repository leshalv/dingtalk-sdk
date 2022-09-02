// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkcalendar_1_0.Models
{
    public class ListAclsResponseBody : TeaModel {
        /// <summary>
        /// 访问控制列表
        /// </summary>
        [NameInMap("acls")]
        [Validation(Required=false)]
        public List<ListAclsResponseBodyAcls> Acls { get; set; }
        public class ListAclsResponseBodyAcls : TeaModel {
            /// <summary>
            /// acl资源ID
            /// </summary>
            [NameInMap("aclId")]
            [Validation(Required=false)]
            public string AclId { get; set; }

            /// <summary>
            /// 权限信息
            /// </summary>
            [NameInMap("privilege")]
            [Validation(Required=false)]
            public string Privilege { get; set; }

            /// <summary>
            /// 权限范围
            /// </summary>
            [NameInMap("scope")]
            [Validation(Required=false)]
            public ListAclsResponseBodyAclsScope Scope { get; set; }
            public class ListAclsResponseBodyAclsScope : TeaModel {
                /// <summary>
                /// 权限类型
                /// </summary>
                [NameInMap("scopeType")]
                [Validation(Required=false)]
                public string ScopeType { get; set; }

                /// <summary>
                /// 用户id
                /// </summary>
                [NameInMap("userId")]
                [Validation(Required=false)]
                public string UserId { get; set; }

            }

        }

    }

}
