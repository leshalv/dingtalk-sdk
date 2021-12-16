// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkcrm_1_0.Models
{
    public class UpdateRelationMetaFieldRequest : TeaModel {
        [NameInMap("fieldDTOList")]
        [Validation(Required=false)]
        public List<UpdateRelationMetaFieldRequestFieldDTOList> FieldDTOList { get; set; }
        public class UpdateRelationMetaFieldRequestFieldDTOList : TeaModel {
            [NameInMap("componentName")]
            [Validation(Required=false)]
            public string ComponentName { get; set; }

            [NameInMap("props")]
            [Validation(Required=false)]
            public UpdateRelationMetaFieldRequestFieldDTOListProps Props { get; set; }
            public class UpdateRelationMetaFieldRequestFieldDTOListProps : TeaModel {
                [NameInMap("fieldId")]
                [Validation(Required=false)]
                public string FieldId { get; set; }
                [NameInMap("label")]
                [Validation(Required=false)]
                public string Label { get; set; }
                [NameInMap("labelEditableFreeze")]
                [Validation(Required=false)]
                public bool? LabelEditableFreeze { get; set; }
                [NameInMap("required")]
                [Validation(Required=false)]
                public bool? Required { get; set; }
                [NameInMap("requiredEditableFreeze")]
                [Validation(Required=false)]
                public bool? RequiredEditableFreeze { get; set; }
                [NameInMap("notPrint")]
                [Validation(Required=false)]
                public string NotPrint { get; set; }
                [NameInMap("content")]
                [Validation(Required=false)]
                public string Content { get; set; }
                [NameInMap("format")]
                [Validation(Required=false)]
                public string Format { get; set; }
                [NameInMap("options")]
                [Validation(Required=false)]
                public List<UpdateRelationMetaFieldRequestFieldDTOListPropsOptions> Options { get; set; }
                public class UpdateRelationMetaFieldRequestFieldDTOListPropsOptions : TeaModel {
                    public string Key { get; set; }
                    public string Value { get; set; }
                }
                [NameInMap("notUpper")]
                [Validation(Required=false)]
                public string NotUpper { get; set; }
                [NameInMap("unit")]
                [Validation(Required=false)]
                public string Unit { get; set; }
                [NameInMap("placeholder")]
                [Validation(Required=false)]
                public string Placeholder { get; set; }
                [NameInMap("bizAlias")]
                [Validation(Required=false)]
                public string BizAlias { get; set; }
                [NameInMap("duration")]
                [Validation(Required=false)]
                public bool? Duration { get; set; }
                [NameInMap("choice")]
                [Validation(Required=false)]
                public long? Choice { get; set; }
                [NameInMap("disabled")]
                [Validation(Required=false)]
                public bool? Disabled { get; set; }
                [NameInMap("align")]
                [Validation(Required=false)]
                public string Align { get; set; }
                [NameInMap("invisible")]
                [Validation(Required=false)]
                public bool? Invisible { get; set; }
                [NameInMap("payEnable")]
                [Validation(Required=false)]
                public bool? PayEnable { get; set; }
                [NameInMap("link")]
                [Validation(Required=false)]
                public string Link { get; set; }
            };

        }

        [NameInMap("operatorUserId")]
        [Validation(Required=false)]
        public string OperatorUserId { get; set; }

        [NameInMap("relationType")]
        [Validation(Required=false)]
        public string RelationType { get; set; }

        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

    }

}
