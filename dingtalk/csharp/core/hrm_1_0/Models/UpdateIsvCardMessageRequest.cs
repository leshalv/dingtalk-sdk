// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkhrm_1_0.Models
{
    public class UpdateIsvCardMessageRequest : TeaModel {
        [NameInMap("agentId")]
        [Validation(Required=false)]
        public long? AgentId { get; set; }

        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("bizId")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("messageType")]
        [Validation(Required=false)]
        public string MessageType { get; set; }

        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("sceneType")]
        [Validation(Required=false)]
        public string SceneType { get; set; }

        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("valueMap")]
        [Validation(Required=false)]
        public Dictionary<string, string> ValueMap { get; set; }

    }

}
