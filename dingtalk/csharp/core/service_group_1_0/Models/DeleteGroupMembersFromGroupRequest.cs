// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkservice_group_1_0.Models
{
    public class DeleteGroupMembersFromGroupRequest : TeaModel {
        /// <summary>
        /// 删除类型
        /// </summary>
        [NameInMap("deleteGroupType")]
        [Validation(Required=false)]
        public string DeleteGroupType { get; set; }

        /// <summary>
        /// 群成员unionId
        /// </summary>
        [NameInMap("memberUnionId")]
        [Validation(Required=false)]
        public string MemberUnionId { get; set; }

        /// <summary>
        /// 会话ID
        /// </summary>
        [NameInMap("openConversationId")]
        [Validation(Required=false)]
        public string OpenConversationId { get; set; }

        /// <summary>
        /// 开放群组ID
        /// </summary>
        [NameInMap("openGroupSetId")]
        [Validation(Required=false)]
        public string OpenGroupSetId { get; set; }

        /// <summary>
        /// 开放团队ID
        /// </summary>
        [NameInMap("openTeamId")]
        [Validation(Required=false)]
        public string OpenTeamId { get; set; }

    }

}
