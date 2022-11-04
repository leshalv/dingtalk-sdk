// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkh5package_1_0.Models
{
    public class CreatePackageRequest : TeaModel {
        /// <summary>
        /// 企业内部微应用agentId
        /// </summary>
        [NameInMap("agentId")]
        [Validation(Required=false)]
        public long? AgentId { get; set; }

        /// <summary>
        /// 第三方企业应用appId
        /// </summary>
        [NameInMap("appId")]
        [Validation(Required=false)]
        public long? AppId { get; set; }

        /// <summary>
        /// 离线包入口页面地址。没有设置时，默认值是应用设置中的应用首页地址。
        /// </summary>
        [NameInMap("homeUrl")]
        [Validation(Required=false)]
        public string HomeUrl { get; set; }

        /// <summary>
        /// 通过获取上传凭据接口返回的name值
        /// </summary>
        [NameInMap("ossObjectKey")]
        [Validation(Required=false)]
        public string OssObjectKey { get; set; }

    }

}
