// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkim_1_0.Models
{
    public class GroupBanWordsRequest : TeaModel {
        /// <summary>
        /// 禁言模式
        /// </summary>
        [NameInMap("banWordsMode")]
        [Validation(Required=false)]
        public int? BanWordsMode { get; set; }

        /// <summary>
        /// 开放群id
        /// </summary>
        [NameInMap("openConversationId")]
        [Validation(Required=false)]
        public string OpenConversationId { get; set; }

        /// <summary>
        /// 扩展参数
        /// </summary>
        [NameInMap("options")]
        [Validation(Required=false)]
        public Dictionary<string, object> Options { get; set; }

    }

}