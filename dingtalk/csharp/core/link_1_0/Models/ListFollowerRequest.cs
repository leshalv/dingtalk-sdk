// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalklink_1_0.Models
{
    public class ListFollowerRequest : TeaModel {
        /// <summary>
        /// 服务窗帐号ID，用于非服务窗自建应用场景下指定服务窗帐号。
        /// </summary>
        [NameInMap("accountId")]
        [Validation(Required=false)]
        public string AccountId { get; set; }

        /// <summary>
        /// 分页查询页大小。
        /// </summary>
        [NameInMap("maxResults")]
        [Validation(Required=false)]
        public int? MaxResults { get; set; }

        /// <summary>
        /// 分页查询下一页token,首页查询此字段可空，其它页查询时需要将此值设置炎上一次接口调用的token
        /// </summary>
        [NameInMap("nextToken")]
        [Validation(Required=false)]
        public string NextToken { get; set; }

    }

}