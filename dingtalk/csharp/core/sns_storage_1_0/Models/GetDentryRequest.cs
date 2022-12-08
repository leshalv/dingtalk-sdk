// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalksns_storage_1_0.Models
{
    public class GetDentryRequest : TeaModel {
        /// <summary>
        /// 可选参数
        /// </summary>
        [NameInMap("option")]
        [Validation(Required=false)]
        public GetDentryRequestOption Option { get; set; }
        public class GetDentryRequestOption : TeaModel {
            /// <summary>
            /// 通过指定应用id, 返回对应的可见属性，即dentry.appProperties，
            /// 默认都会返回当前应用的属性，
            /// 如不指定appIds, 则默认返回当前应用的appProperties
            /// 最大size:
            /// 	20
            /// </summary>
            [NameInMap("appIdsForAppProperties")]
            [Validation(Required=false)]
            public List<string> AppIdsForAppProperties { get; set; }

            /// <summary>
            /// 是否获取文件缩略图临时链接
            /// 注: 按需获取, 会影响接口耗时
            /// 默认值:
            /// 	false
            /// </summary>
            [NameInMap("withThumbnail")]
            [Validation(Required=false)]
            public bool? WithThumbnail { get; set; }

        }

        /// <summary>
        /// 用户id
        /// </summary>
        [NameInMap("unionId")]
        [Validation(Required=false)]
        public string UnionId { get; set; }

    }

}