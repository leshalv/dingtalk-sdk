// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkbizfinance_1_0.Models
{
    public class BatchCreateCustomerRequest : TeaModel {
        [NameInMap("createCustomerRequestList")]
        [Validation(Required=false)]
        public List<BatchCreateCustomerRequestCreateCustomerRequestList> CreateCustomerRequestList { get; set; }
        public class BatchCreateCustomerRequestCreateCustomerRequestList : TeaModel {
            /// <summary>
            /// 客户描述
            /// </summary>
            [NameInMap("description")]
            [Validation(Required=false)]
            public string Description { get; set; }

            /// <summary>
            /// 开票人邮箱
            /// </summary>
            [NameInMap("drawerEmail")]
            [Validation(Required=false)]
            public string DrawerEmail { get; set; }

            /// <summary>
            /// 开票人手机号
            /// </summary>
            [NameInMap("drawerTelephone")]
            [Validation(Required=false)]
            public string DrawerTelephone { get; set; }

            /// <summary>
            /// 客户名字
            /// </summary>
            [NameInMap("name")]
            [Validation(Required=false)]
            public string Name { get; set; }

            /// <summary>
            /// 购方账户
            /// </summary>
            [NameInMap("purchaserAccount")]
            [Validation(Required=false)]
            public string PurchaserAccount { get; set; }

            /// <summary>
            /// 购房地址
            /// </summary>
            [NameInMap("purchaserAddress")]
            [Validation(Required=false)]
            public string PurchaserAddress { get; set; }

            /// <summary>
            /// 购方银行
            /// </summary>
            [NameInMap("purchaserBankName")]
            [Validation(Required=false)]
            public string PurchaserBankName { get; set; }

            /// <summary>
            /// 购方名字
            /// </summary>
            [NameInMap("purchaserName")]
            [Validation(Required=false)]
            public string PurchaserName { get; set; }

            /// <summary>
            /// 购方税号
            /// </summary>
            [NameInMap("purchaserTaxNo")]
            [Validation(Required=false)]
            public string PurchaserTaxNo { get; set; }

            /// <summary>
            /// 购方电话
            /// </summary>
            [NameInMap("purchaserTel")]
            [Validation(Required=false)]
            public string PurchaserTel { get; set; }

        }

        /// <summary>
        /// 创建人userId
        /// </summary>
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

    }

}
