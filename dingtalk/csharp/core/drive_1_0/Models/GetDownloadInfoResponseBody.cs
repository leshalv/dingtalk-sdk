// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkdrive_1_0.Models
{
    public class GetDownloadInfoResponseBody : TeaModel {
        /// <summary>
        /// 下载加签url信息
        /// </summary>
        [NameInMap("downloadInfo")]
        [Validation(Required=false)]
        public GetDownloadInfoResponseBodyDownloadInfo DownloadInfo { get; set; }
        public class GetDownloadInfoResponseBodyDownloadInfo : TeaModel {
            [NameInMap("expirationSeconds")]
            [Validation(Required=false)]
            public int? ExpirationSeconds { get; set; }
            [NameInMap("headers")]
            [Validation(Required=false)]
            public Dictionary<string, string> Headers { get; set; }
            [NameInMap("internalResourceUrl")]
            [Validation(Required=false)]
            public string InternalResourceUrl { get; set; }
            [NameInMap("resourceUrl")]
            [Validation(Required=false)]
            public string ResourceUrl { get; set; }
        };

        /// <summary>
        /// 文件所存储的区域
        /// </summary>
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

    }

}
