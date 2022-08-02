// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkswform_1_0.Models
{
    public class ListFormSchemasByCreatorResponseBody : TeaModel {
        /// <summary>
        /// 返回结果对象。
        /// </summary>
        [NameInMap("result")]
        [Validation(Required=false)]
        public ListFormSchemasByCreatorResponseBodyResult Result { get; set; }
        public class ListFormSchemasByCreatorResponseBodyResult : TeaModel {
            [NameInMap("hasMore")]
            [Validation(Required=false)]
            public bool? HasMore { get; set; }
            [NameInMap("list")]
            [Validation(Required=false)]
            public List<ListFormSchemasByCreatorResponseBodyResultList> List { get; set; }
            public class ListFormSchemasByCreatorResponseBodyResultList : TeaModel {
                public string Creator { get; set; }
                public string FormCode { get; set; }
                public string Memo { get; set; }
                public string Name { get; set; }
                public ListFormSchemasByCreatorResponseBodyResultListSetting Setting { get; set; }
                public class ListFormSchemasByCreatorResponseBodyResultListSetting : TeaModel {
                    /// <summary>
                    /// 表单类型：  0：一次性填表  1：周期性填表
                    /// </summary>
                    [NameInMap("bizType")]
                    [Validation(Required=false)]
                    public int? BizType { get; set; }

                    /// <summary>
                    /// 创建时间。iso8601格式。
                    /// </summary>
                    [NameInMap("createTime")]
                    [Validation(Required=false)]
                    public string CreateTime { get; set; }

                    /// <summary>
                    /// 截止时间。iso8601格式。
                    /// </summary>
                    [NameInMap("endTime")]
                    [Validation(Required=false)]
                    public string EndTime { get; set; }

                    /// <summary>
                    /// 表单类型：  0：一次性填表  1：周期性填表
                    /// </summary>
                    [NameInMap("formType")]
                    [Validation(Required=false)]
                    public int? FormType { get; set; }

                    /// <summary>
                    /// 填表周期，周一到周日分别用1-7表示。
                    /// </summary>
                    [NameInMap("loopDays")]
                    [Validation(Required=false)]
                    public List<int?> LoopDays { get; set; }

                    /// <summary>
                    /// 循环执行的时间点。
                    /// </summary>
                    [NameInMap("loopTime")]
                    [Validation(Required=false)]
                    public string LoopTime { get; set; }

                    /// <summary>
                    /// 填表是否终止的标记。
                    /// </summary>
                    [NameInMap("stop")]
                    [Validation(Required=false)]
                    public bool? Stop { get; set; }

                }
            }
            [NameInMap("nextToken")]
            [Validation(Required=false)]
            public long? NextToken { get; set; }
        };

        /// <summary>
        /// 是否成功。
        /// </summary>
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

    }

}