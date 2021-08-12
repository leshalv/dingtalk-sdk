// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkdrive_1_0.Models
{
    public class InfoSpaceResponseBody : TeaModel {
        /// <summary>
        /// 空间id
        /// </summary>
        [NameInMap("spaceId")]
        [Validation(Required=false)]
        public string SpaceId { get; set; }

        /// <summary>
        /// 空间名称
        /// </summary>
        [NameInMap("spaceName")]
        [Validation(Required=false)]
        public string SpaceName { get; set; }

        /// <summary>
        /// 空间类型
        /// </summary>
        [NameInMap("spaceType")]
        [Validation(Required=false)]
        public string SpaceType { get; set; }

        /// <summary>
        /// 容量
        /// </summary>
        [NameInMap("quota")]
        [Validation(Required=false)]
        public long? Quota { get; set; }

        /// <summary>
        /// 已使用容量
        /// </summary>
        [NameInMap("usedQuota")]
        [Validation(Required=false)]
        public long? UsedQuota { get; set; }

        /// <summary>
        /// 创建时间
        /// </summary>
        [NameInMap("createTime")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        /// <summary>
        /// 修改时间
        /// </summary>
        [NameInMap("modifyTime")]
        [Validation(Required=false)]
        public string ModifyTime { get; set; }

    }

}
