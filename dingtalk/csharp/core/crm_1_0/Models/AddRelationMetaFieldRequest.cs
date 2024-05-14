// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkcrm_1_0.Models
{
    public class AddRelationMetaFieldRequest : TeaModel {
        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("fieldDTOList")]
        [Validation(Required=false)]
        public List<AddRelationMetaFieldRequestFieldDTOList> FieldDTOList { get; set; }
        public class AddRelationMetaFieldRequestFieldDTOList : TeaModel {
            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("componentName")]
            [Validation(Required=false)]
            public string ComponentName { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("props")]
            [Validation(Required=false)]
            public AddRelationMetaFieldRequestFieldDTOListProps Props { get; set; }
            public class AddRelationMetaFieldRequestFieldDTOListProps : TeaModel {
                [NameInMap("align")]
                [Validation(Required=false)]
                public string Align { get; set; }

                /// <summary>
                /// This parameter is required.
                /// </summary>
                [NameInMap("bizAlias")]
                [Validation(Required=false)]
                public string BizAlias { get; set; }

                [NameInMap("choice")]
                [Validation(Required=false)]
                public long? Choice { get; set; }

                [NameInMap("content")]
                [Validation(Required=false)]
                public string Content { get; set; }

                [NameInMap("disabled")]
                [Validation(Required=false)]
                public bool? Disabled { get; set; }

                [NameInMap("duration")]
                [Validation(Required=false)]
                public bool? Duration { get; set; }

                [NameInMap("fieldId")]
                [Validation(Required=false)]
                public string FieldId { get; set; }

                [NameInMap("format")]
                [Validation(Required=false)]
                public string Format { get; set; }

                [NameInMap("invisible")]
                [Validation(Required=false)]
                public bool? Invisible { get; set; }

                /// <summary>
                /// This parameter is required.
                /// </summary>
                [NameInMap("label")]
                [Validation(Required=false)]
                public string Label { get; set; }

                [NameInMap("labelEditableFreeze")]
                [Validation(Required=false)]
                public bool? LabelEditableFreeze { get; set; }

                [NameInMap("link")]
                [Validation(Required=false)]
                public string Link { get; set; }

                [NameInMap("needDetail")]
                [Validation(Required=false)]
                public string NeedDetail { get; set; }

                [NameInMap("notPrint")]
                [Validation(Required=false)]
                public string NotPrint { get; set; }

                [NameInMap("notUpper")]
                [Validation(Required=false)]
                public string NotUpper { get; set; }

                [NameInMap("options")]
                [Validation(Required=false)]
                public List<AddRelationMetaFieldRequestFieldDTOListPropsOptions> Options { get; set; }
                public class AddRelationMetaFieldRequestFieldDTOListPropsOptions : TeaModel {
                    [NameInMap("key")]
                    [Validation(Required=false)]
                    public string Key { get; set; }

                    [NameInMap("value")]
                    [Validation(Required=false)]
                    public string Value { get; set; }

                }

                [NameInMap("payEnable")]
                [Validation(Required=false)]
                public bool? PayEnable { get; set; }

                [NameInMap("placeholder")]
                [Validation(Required=false)]
                public string Placeholder { get; set; }

                /// <summary>
                /// This parameter is required.
                /// </summary>
                [NameInMap("required")]
                [Validation(Required=false)]
                public bool? Required { get; set; }

                [NameInMap("requiredEditableFreeze")]
                [Validation(Required=false)]
                public bool? RequiredEditableFreeze { get; set; }

                [NameInMap("sortable")]
                [Validation(Required=false)]
                public bool? Sortable { get; set; }

                [NameInMap("unit")]
                [Validation(Required=false)]
                public string Unit { get; set; }

            }

        }

        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("operatorUserId")]
        [Validation(Required=false)]
        public string OperatorUserId { get; set; }

        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("relationType")]
        [Validation(Required=false)]
        public string RelationType { get; set; }

        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

    }

}
