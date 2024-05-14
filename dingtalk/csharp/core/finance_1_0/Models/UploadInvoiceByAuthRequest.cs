// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkfinance_1_0.Models
{
    public class UploadInvoiceByAuthRequest : TeaModel {
        [NameInMap("extension")]
        [Validation(Required=false)]
        public UploadInvoiceByAuthRequestExtension Extension { get; set; }
        public class UploadInvoiceByAuthRequestExtension : TeaModel {
            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("bizCode")]
            [Validation(Required=false)]
            public string BizCode { get; set; }

            [NameInMap("orderNo")]
            [Validation(Required=false)]
            public string OrderNo { get; set; }

            [NameInMap("orderType")]
            [Validation(Required=false)]
            public string OrderType { get; set; }

        }

        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("invoices")]
        [Validation(Required=false)]
        public List<UploadInvoiceByAuthRequestInvoices> Invoices { get; set; }
        public class UploadInvoiceByAuthRequestInvoices : TeaModel {
            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("invoiceAmount")]
            [Validation(Required=false)]
            public string InvoiceAmount { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("invoiceCode")]
            [Validation(Required=false)]
            public string InvoiceCode { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("invoiceDate")]
            [Validation(Required=false)]
            public string InvoiceDate { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("invoiceNo")]
            [Validation(Required=false)]
            public string InvoiceNo { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("invoiceType")]
            [Validation(Required=false)]
            public string InvoiceType { get; set; }

            [NameInMap("logoUrl")]
            [Validation(Required=false)]
            public string LogoUrl { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("payeeName")]
            [Validation(Required=false)]
            public string PayeeName { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("payeeTaxNo")]
            [Validation(Required=false)]
            public string PayeeTaxNo { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("payerName")]
            [Validation(Required=false)]
            public string PayerName { get; set; }

            [NameInMap("payerTaxNo")]
            [Validation(Required=false)]
            public string PayerTaxNo { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("pdfUrl")]
            [Validation(Required=false)]
            public string PdfUrl { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("taxAmount")]
            [Validation(Required=false)]
            public string TaxAmount { get; set; }

            [NameInMap("verifyCode")]
            [Validation(Required=false)]
            public string VerifyCode { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("withoutTaxAmount")]
            [Validation(Required=false)]
            public string WithoutTaxAmount { get; set; }

        }

    }

}
