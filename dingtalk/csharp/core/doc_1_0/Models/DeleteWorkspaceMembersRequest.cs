// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkdoc_1_0.Models
{
    public class DeleteWorkspaceMembersRequest : TeaModel {
        /// <summary>
        /// 被操作用户组
        /// </summary>
        [NameInMap("members")]
        [Validation(Required=false)]
        public List<DeleteWorkspaceMembersRequestMembers> Members { get; set; }
        public class DeleteWorkspaceMembersRequestMembers : TeaModel {
            /// <summary>
            /// 被操作用户unionId
            /// </summary>
            [NameInMap("memberId")]
            [Validation(Required=false)]
            public string MemberId { get; set; }

            /// <summary>
            /// 用户类型
            /// </summary>
            [NameInMap("memberType")]
            [Validation(Required=false)]
            public string MemberType { get; set; }

        }

        /// <summary>
        /// 发起操作者unionId
        /// </summary>
        [NameInMap("operatorId")]
        [Validation(Required=false)]
        public string OperatorId { get; set; }

    }

}
