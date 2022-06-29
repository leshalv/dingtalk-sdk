// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalktrip_1_0.Models
{
    public class SyncSecretKeyRequest : TeaModel {
        /// <summary>
        /// 操作类型，ADD/QUERY/MODIFY/DEL
        /// </summary>
        [NameInMap("actionType")]
        [Validation(Required=false)]
        public string ActionType { get; set; }

        /// <summary>
        /// 验签加密串
        /// </summary>
        [NameInMap("secretString")]
        [Validation(Required=false)]
        public string SecretString { get; set; }

        /// <summary>
        /// 钉钉侧对应的组织ID
        /// </summary>
        [NameInMap("targetCorpId")]
        [Validation(Required=false)]
        public string TargetCorpId { get; set; }

        /// <summary>
        /// 商旅侧appkey
        /// </summary>
        [NameInMap("tripAppKey")]
        [Validation(Required=false)]
        public string TripAppKey { get; set; }

        /// <summary>
        /// 商旅对接密钥
        /// </summary>
        [NameInMap("tripAppSecurity")]
        [Validation(Required=false)]
        public string TripAppSecurity { get; set; }

        /// <summary>
        /// 商旅侧组织ID
        /// </summary>
        [NameInMap("tripCorpId")]
        [Validation(Required=false)]
        public string TripCorpId { get; set; }

    }

}