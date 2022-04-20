// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkim_1_0.Models
{
    public class QueryGroupMemberResponseBody : TeaModel {
        /// <summary>
        /// 群成员列表
        /// </summary>
        [NameInMap("groupMembers")]
        [Validation(Required=false)]
        public List<QueryGroupMemberResponseBodyGroupMembers> GroupMembers { get; set; }
        public class QueryGroupMemberResponseBodyGroupMembers : TeaModel {
            /// <summary>
            /// 群成员头像
            /// </summary>
            [NameInMap("groupMemberAvatar")]
            [Validation(Required=false)]
            public string GroupMemberAvatar { get; set; }

            /// <summary>
            /// 群成员动态信息
            /// </summary>
            [NameInMap("groupMemberDynamics")]
            [Validation(Required=false)]
            public string GroupMemberDynamics { get; set; }

            /// <summary>
            /// 群成员Id
            /// </summary>
            [NameInMap("groupMemberId")]
            [Validation(Required=false)]
            public string GroupMemberId { get; set; }

            /// <summary>
            /// 群成员名称
            /// </summary>
            [NameInMap("groupMemberName")]
            [Validation(Required=false)]
            public string GroupMemberName { get; set; }

            /// <summary>
            /// 群成员类型
            /// </summary>
            [NameInMap("groupMemberType")]
            [Validation(Required=false)]
            public int? GroupMemberType { get; set; }

        }

        /// <summary>
        /// 群会话Id
        /// </summary>
        [NameInMap("openConversationId")]
        [Validation(Required=false)]
        public string OpenConversationId { get; set; }

    }

}
