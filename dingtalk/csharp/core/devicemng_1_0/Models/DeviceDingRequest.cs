// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkdevicemng_1_0.Models
{
    public class DeviceDingRequest : TeaModel {
        /// <summary>
        /// 设备标识
        /// </summary>
        [NameInMap("deviceKey")]
        [Validation(Required=false)]
        public string DeviceKey { get; set; }

        /// <summary>
        /// 钉钉组织id
        /// </summary>
        [NameInMap("dingCorpId")]
        [Validation(Required=false)]
        public string DingCorpId { get; set; }

        /// <summary>
        /// 消息体动态参数
        /// </summary>
        [NameInMap("paramsJson")]
        [Validation(Required=false)]
        public string ParamsJson { get; set; }

        /// <summary>
        /// staffId列表
        /// </summary>
        [NameInMap("receiverUserIdList")]
        [Validation(Required=false)]
        public List<string> ReceiverUserIdList { get; set; }

    }

}
