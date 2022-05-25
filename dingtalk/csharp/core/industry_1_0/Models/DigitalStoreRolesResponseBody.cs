// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkindustry_1_0.Models
{
    public class DigitalStoreRolesResponseBody : TeaModel {
        [NameInMap("content")]
        [Validation(Required=false)]
        public List<DigitalStoreRolesResponseBodyContent> Content { get; set; }
        public class DigitalStoreRolesResponseBodyContent : TeaModel {
            /// <summary>
            /// 优先级
            /// </summary>
            [NameInMap("level")]
            [Validation(Required=false)]
            public long? Level { get; set; }

            /// <summary>
            /// 角色Code
            /// </summary>
            [NameInMap("roleCode")]
            [Validation(Required=false)]
            public string RoleCode { get; set; }

            /// <summary>
            /// 角色Id
            /// </summary>
            [NameInMap("roleId")]
            [Validation(Required=false)]
            public long? RoleId { get; set; }

            /// <summary>
            /// 角色名称
            /// </summary>
            [NameInMap("roleName")]
            [Validation(Required=false)]
            public string RoleName { get; set; }

        }

    }

}