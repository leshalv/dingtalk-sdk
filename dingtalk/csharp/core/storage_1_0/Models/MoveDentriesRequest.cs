// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkstorage_1_0.Models
{
    public class MoveDentriesRequest : TeaModel {
        /// <summary>
        /// 源文件(夹)id列表
        /// 最大size:
        /// 	30
        /// </summary>
        [NameInMap("dentryIds")]
        [Validation(Required=false)]
        public List<string> DentryIds { get; set; }

        /// <summary>
        /// 可选参数
        /// </summary>
        [NameInMap("option")]
        [Validation(Required=false)]
        public MoveDentriesRequestOption Option { get; set; }
        public class MoveDentriesRequestOption : TeaModel {
            /// <summary>
            /// 文件(夹)名称冲突策略
            /// 枚举值:
            /// 	AUTO_RENAME: 自动重命名
            /// 	OVERWRITE: 覆盖
            /// 	RETURN_DENTRY_IF_EXISTS: 返回已存在文件
            /// 	RETURN_ERROR_IF_EXISTS: 文件已存在时报错
            /// 默认值:
            /// 	AUTO_RENAME
            /// </summary>
            [NameInMap("conflictStrategy")]
            [Validation(Required=false)]
            public string ConflictStrategy { get; set; }

            /// <summary>
            /// 移动后，是否保留权限
            /// 默认值:
            /// 	false
            /// </summary>
            [NameInMap("preservePermissions")]
            [Validation(Required=false)]
            public bool? PreservePermissions { get; set; }

        }

        /// <summary>
        /// 目标文件夹id, 根目录id值为0
        /// </summary>
        [NameInMap("targetFolderId")]
        [Validation(Required=false)]
        public string TargetFolderId { get; set; }

        /// <summary>
        /// 目标文件(夹)空间id
        /// </summary>
        [NameInMap("targetSpaceId")]
        [Validation(Required=false)]
        public string TargetSpaceId { get; set; }

        /// <summary>
        /// 用户id
        /// </summary>
        [NameInMap("unionId")]
        [Validation(Required=false)]
        public string UnionId { get; set; }

    }

}