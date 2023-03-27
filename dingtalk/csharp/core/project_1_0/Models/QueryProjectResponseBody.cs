// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkproject_1_0.Models
{
    public class QueryProjectResponseBody : TeaModel {
        /// <summary>
        /// 项目列表。
        /// </summary>
        [NameInMap("result")]
        [Validation(Required=false)]
        public List<QueryProjectResponseBodyResult> Result { get; set; }
        public class QueryProjectResponseBodyResult : TeaModel {
            /// <summary>
            /// 创建时间。
            /// </summary>
            [NameInMap("created")]
            [Validation(Required=false)]
            public string Created { get; set; }

            /// <summary>
            /// 创建人ID。
            /// </summary>
            [NameInMap("creatorId")]
            [Validation(Required=false)]
            public string CreatorId { get; set; }

            /// <summary>
            /// 自定义字段值集合。
            /// </summary>
            [NameInMap("customfields")]
            [Validation(Required=false)]
            public List<QueryProjectResponseBodyResultCustomfields> Customfields { get; set; }
            public class QueryProjectResponseBodyResultCustomfields : TeaModel {
                /// <summary>
                /// 自定义字段ID。
                /// </summary>
                [NameInMap("customfieldId")]
                [Validation(Required=false)]
                public string CustomfieldId { get; set; }

                /// <summary>
                /// 自定义字段类型。
                /// </summary>
                [NameInMap("type")]
                [Validation(Required=false)]
                public string Type { get; set; }

                /// <summary>
                /// 自定义字段值列表。
                /// </summary>
                [NameInMap("value")]
                [Validation(Required=false)]
                public List<QueryProjectResponseBodyResultCustomfieldsValue> Value { get; set; }
                public class QueryProjectResponseBodyResultCustomfieldsValue : TeaModel {
                    /// <summary>
                    /// 自定义字段值ID。
                    /// </summary>
                    [NameInMap("fieldvalueId")]
                    [Validation(Required=false)]
                    public string FieldvalueId { get; set; }

                    /// <summary>
                    /// 自定义字段值元属性。
                    /// </summary>
                    [NameInMap("metaString")]
                    [Validation(Required=false)]
                    public string MetaString { get; set; }

                    /// <summary>
                    /// 自定义字段值内容。
                    /// </summary>
                    [NameInMap("title")]
                    [Validation(Required=false)]
                    public string Title { get; set; }

                }

            }

            /// <summary>
            /// 项目描述。
            /// </summary>
            [NameInMap("description")]
            [Validation(Required=false)]
            public string Description { get; set; }

            /// <summary>
            /// 项目结束时间。
            /// </summary>
            [NameInMap("endDate")]
            [Validation(Required=false)]
            public string EndDate { get; set; }

            /// <summary>
            /// 是否放入回收站。
            /// </summary>
            [NameInMap("isArchived")]
            [Validation(Required=false)]
            public bool? IsArchived { get; set; }

            /// <summary>
            /// 是否归档。
            /// </summary>
            [NameInMap("isSuspended")]
            [Validation(Required=false)]
            public bool? IsSuspended { get; set; }

            /// <summary>
            /// 是模版项目。
            /// </summary>
            [NameInMap("isTemplate")]
            [Validation(Required=false)]
            public bool? IsTemplate { get; set; }

            /// <summary>
            /// 项目LOGO。
            /// </summary>
            [NameInMap("logo")]
            [Validation(Required=false)]
            public string Logo { get; set; }

            /// <summary>
            /// 项目名称。
            /// </summary>
            [NameInMap("name")]
            [Validation(Required=false)]
            public string Name { get; set; }

            /// <summary>
            /// 企业ID。
            /// </summary>
            [NameInMap("organizationId")]
            [Validation(Required=false)]
            public string OrganizationId { get; set; }

            /// <summary>
            /// 项目ID。
            /// </summary>
            [NameInMap("projectId")]
            [Validation(Required=false)]
            public string ProjectId { get; set; }

            /// <summary>
            /// 项目开始时间。
            /// </summary>
            [NameInMap("startDate")]
            [Validation(Required=false)]
            public string StartDate { get; set; }

            /// <summary>
            /// 任务ID前缀。
            /// </summary>
            [NameInMap("uniqueIdPrefix")]
            [Validation(Required=false)]
            public string UniqueIdPrefix { get; set; }

            /// <summary>
            /// 更新时间。
            /// </summary>
            [NameInMap("updated")]
            [Validation(Required=false)]
            public string Updated { get; set; }

            /// <summary>
            /// 可见性，project | organization。
            /// </summary>
            [NameInMap("visibility")]
            [Validation(Required=false)]
            public string Visibility { get; set; }

        }

    }

}
