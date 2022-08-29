// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkbizfinance_1_0.Models
{
    public class UnbindApplyReceiptAndInvoiceRelatedResponseBody : TeaModel {
        /// <summary>
        /// 批量更新发票返回结果
        /// 
        /// </summary>
        [NameInMap("batchUpdateInvoiceResponse")]
        [Validation(Required=false)]
        public UnbindApplyReceiptAndInvoiceRelatedResponseBodyBatchUpdateInvoiceResponse BatchUpdateInvoiceResponse { get; set; }
        public class UnbindApplyReceiptAndInvoiceRelatedResponseBodyBatchUpdateInvoiceResponse : TeaModel {
            [NameInMap("invoiceKeyVOList")]
            [Validation(Required=false)]
            public List<UnbindApplyReceiptAndInvoiceRelatedResponseBodyBatchUpdateInvoiceResponseInvoiceKeyVOList> InvoiceKeyVOList { get; set; }
            public class UnbindApplyReceiptAndInvoiceRelatedResponseBodyBatchUpdateInvoiceResponseInvoiceKeyVOList : TeaModel {
                public string InvoiceCode { get; set; }
                public string InvoiceNo { get; set; }
            }
        };

        /// <summary>
        /// 是否成功
        /// </summary>
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

    }

}
