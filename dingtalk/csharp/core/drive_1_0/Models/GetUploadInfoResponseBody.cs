// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkdrive_1_0.Models
{
    public class GetUploadInfoResponseBody : TeaModel {
        [NameInMap("headerSignatureUploadInfo")]
        [Validation(Required=false)]
        public GetUploadInfoResponseBodyHeaderSignatureUploadInfo HeaderSignatureUploadInfo { get; set; }
        public class GetUploadInfoResponseBodyHeaderSignatureUploadInfo : TeaModel {
            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("expirationSeconds")]
            [Validation(Required=false)]
            public int? ExpirationSeconds { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("headers")]
            [Validation(Required=false)]
            public Dictionary<string, object> Headers { get; set; }

            [NameInMap("internalResourceUrl")]
            [Validation(Required=false)]
            public string InternalResourceUrl { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("mediaId")]
            [Validation(Required=false)]
            public string MediaId { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("resourceUrl")]
            [Validation(Required=false)]
            public string ResourceUrl { get; set; }

        }

        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

        [NameInMap("stsUploadInfo")]
        [Validation(Required=false)]
        public GetUploadInfoResponseBodyStsUploadInfo StsUploadInfo { get; set; }
        public class GetUploadInfoResponseBodyStsUploadInfo : TeaModel {
            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("accessKeyId")]
            [Validation(Required=false)]
            public string AccessKeyId { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("accessKeySecret")]
            [Validation(Required=false)]
            public string AccessKeySecret { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("accessToken")]
            [Validation(Required=false)]
            public string AccessToken { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("accessTokenExpirationMillis")]
            [Validation(Required=false)]
            public long? AccessTokenExpirationMillis { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("bucket")]
            [Validation(Required=false)]
            public string Bucket { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("endPoint")]
            [Validation(Required=false)]
            public string EndPoint { get; set; }

            [NameInMap("internalEndPoint")]
            [Validation(Required=false)]
            public string InternalEndPoint { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("mediaId")]
            [Validation(Required=false)]
            public string MediaId { get; set; }

        }

    }

}
