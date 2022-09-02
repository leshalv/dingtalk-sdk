// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkattendance_1_0.Models
{
    public class SaveCustomWaterMarkTemplateResponseBody : TeaModel {
        /// <summary>
        /// 返回对象。
        /// </summary>
        [NameInMap("result")]
        [Validation(Required=false)]
        public SaveCustomWaterMarkTemplateResponseBodyResult Result { get; set; }
        public class SaveCustomWaterMarkTemplateResponseBodyResult : TeaModel {
            /// <summary>
            /// 模板的表单Code。
            /// </summary>
            [NameInMap("formCode")]
            [Validation(Required=false)]
            public string FormCode { get; set; }

            /// <summary>
            /// 模板的水印ID。
            /// </summary>
            [NameInMap("waterMarkId")]
            [Validation(Required=false)]
            public string WaterMarkId { get; set; }

        }

    }

}
