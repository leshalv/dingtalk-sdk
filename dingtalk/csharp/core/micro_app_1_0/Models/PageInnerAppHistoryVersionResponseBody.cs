// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkmicro_app_1_0.Models
{
    public class PageInnerAppHistoryVersionResponseBody : TeaModel {
        /// <summary>
        /// 企业内部小程序版本号列表
        /// </summary>
        [NameInMap("miniAppVersionList")]
        [Validation(Required=false)]
        public List<PageInnerAppHistoryVersionResponseBodyMiniAppVersionList> MiniAppVersionList { get; set; }
        public class PageInnerAppHistoryVersionResponseBodyMiniAppVersionList : TeaModel {
            /// <summary>
            /// 小程序版本号
            /// </summary>
            [NameInMap("appVersion")]
            [Validation(Required=false)]
            public string AppVersion { get; set; }

            /// <summary>
            /// 小程序版本号id，用于小程序的发布和回滚等操作的唯一标识。
            /// </summary>
            [NameInMap("appVersionId")]
            [Validation(Required=false)]
            public long? AppVersionId { get; set; }

            /// <summary>
            /// 小程序版本类型，0表示开发版本，2表示正式版本，3表示体验版本
            /// </summary>
            [NameInMap("appVersionType")]
            [Validation(Required=false)]
            public int? AppVersionType { get; set; }

            /// <summary>
            /// 小程序版本创建事件，格式:yyyy-MM-dd HH:mm:ss
            /// </summary>
            [NameInMap("createTime")]
            [Validation(Required=false)]
            public string CreateTime { get; set; }

            /// <summary>
            /// 小程序id
            /// </summary>
            [NameInMap("miniAppId")]
            [Validation(Required=false)]
            public string MiniAppId { get; set; }

            /// <summary>
            /// 是否支持PC端打开小程序，false表示只支持移动端，true表示既支持移动端又支持PC端  
            /// </summary>
            [NameInMap("miniAppOnPc")]
            [Validation(Required=false)]
            public bool? MiniAppOnPc { get; set; }

            /// <summary>
            /// 小程序版本号更新时间，格式:yyyy-MM-dd HH:mm:ss
            /// </summary>
            [NameInMap("modifyTime")]
            [Validation(Required=false)]
            public string ModifyTime { get; set; }

        }

        /// <summary>
        /// 当前小程序历史版本的总数量
        /// </summary>
        [NameInMap("totalCount")]
        [Validation(Required=false)]
        public long? TotalCount { get; set; }

    }

}
