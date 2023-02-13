// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkimpaas_1_0.Models
{
    public class CreateTrustGroupRequest : TeaModel {
        /// <summary>
        /// IMPASS渠道编码
        /// </summary>
        [NameInMap("channel")]
        [Validation(Required=false)]
        public string Channel { get; set; }

        /// <summary>
        /// 素材ID
        /// </summary>
        [NameInMap("iconMediaId")]
        [Validation(Required=false)]
        public string IconMediaId { get; set; }

        /// <summary>
        /// 群成员列表
        /// </summary>
        [NameInMap("members")]
        [Validation(Required=false)]
        public List<CreateTrustGroupRequestMembers> Members { get; set; }
        public class CreateTrustGroupRequestMembers : TeaModel {
            /// <summary>
            /// 昵称
            /// </summary>
            [NameInMap("nick")]
            [Validation(Required=false)]
            public string Nick { get; set; }

            /// <summary>
            /// 互通账号ID
            /// </summary>
            [NameInMap("uid")]
            [Validation(Required=false)]
            public string Uid { get; set; }

        }

        /// <summary>
        /// 群名称
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        /// <summary>
        /// 其他扩展参数
        /// </summary>
        [NameInMap("properties")]
        [Validation(Required=false)]
        public Dictionary<string, string> Properties { get; set; }

        /// <summary>
        /// 系统消息
        /// </summary>
        [NameInMap("systemMsg")]
        [Validation(Required=false)]
        public string SystemMsg { get; set; }

        /// <summary>
        /// 外部系统映射唯一标识
        /// </summary>
        [NameInMap("uuid")]
        [Validation(Required=false)]
        public string Uuid { get; set; }

    }

}
