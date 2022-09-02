// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkorg_culture_1_0.Models
{
    public class AssignOrgHoldingToEmpHoldingBatchResponseBody : TeaModel {
        [NameInMap("result")]
        [Validation(Required=false)]
        public AssignOrgHoldingToEmpHoldingBatchResponseBodyResult Result { get; set; }
        public class AssignOrgHoldingToEmpHoldingBatchResponseBodyResult : TeaModel {
            /// <summary>
            /// 每个人发放的结果
            /// </summary>
            [NameInMap("openPointInvokeResultDTOS")]
            [Validation(Required=false)]
            public List<AssignOrgHoldingToEmpHoldingBatchResponseBodyResultOpenPointInvokeResultDTOS> OpenPointInvokeResultDTOS { get; set; }
            public class AssignOrgHoldingToEmpHoldingBatchResponseBodyResultOpenPointInvokeResultDTOS : TeaModel {
                /// <summary>
                /// 错误码
                /// </summary>
                [NameInMap("code")]
                [Validation(Required=false)]
                public string Code { get; set; }

                /// <summary>
                /// 状态SUCCESS：成功。 FAIL：失败 UNKNOWN:结果未知
                /// </summary>
                [NameInMap("invokeStatus")]
                [Validation(Required=false)]
                public string InvokeStatus { get; set; }

                /// <summary>
                /// 错误信息
                /// </summary>
                [NameInMap("msg")]
                [Validation(Required=false)]
                public string Msg { get; set; }

                /// <summary>
                /// 积分交易单号
                /// 
                /// </summary>
                [NameInMap("outId")]
                [Validation(Required=false)]
                public string OutId { get; set; }

                /// <summary>
                /// 发放用户userId
                /// </summary>
                [NameInMap("userId")]
                [Validation(Required=false)]
                public string UserId { get; set; }

            }

        }

        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

    }

}
