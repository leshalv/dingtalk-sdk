// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkdrive_1_0.Models
{
    public class CopyFileResponseBody : TeaModel {
        /// <summary>
        /// 文件信息
        /// </summary>
        [NameInMap("file")]
        [Validation(Required=false)]
        public CopyFileResponseBodyFile File { get; set; }
        public class CopyFileResponseBodyFile : TeaModel {
            [NameInMap("spaceId")]
            [Validation(Required=false)]
            public string SpaceId { get; set; }
            [NameInMap("parentId")]
            [Validation(Required=false)]
            public string ParentId { get; set; }
            [NameInMap("fileId")]
            [Validation(Required=false)]
            public string FileId { get; set; }
            [NameInMap("fileName")]
            [Validation(Required=false)]
            public string FileName { get; set; }
            [NameInMap("filePath")]
            [Validation(Required=false)]
            public string FilePath { get; set; }
            [NameInMap("fileType")]
            [Validation(Required=false)]
            public string FileType { get; set; }
            [NameInMap("contentType")]
            [Validation(Required=false)]
            public string ContentType { get; set; }
            [NameInMap("fileExtension")]
            [Validation(Required=false)]
            public string FileExtension { get; set; }
            [NameInMap("fileSize")]
            [Validation(Required=false)]
            public long? FileSize { get; set; }
            [NameInMap("createTime")]
            [Validation(Required=false)]
            public string CreateTime { get; set; }
            [NameInMap("modifyTime")]
            [Validation(Required=false)]
            public string ModifyTime { get; set; }
            [NameInMap("creator")]
            [Validation(Required=false)]
            public string Creator { get; set; }
            [NameInMap("modifier")]
            [Validation(Required=false)]
            public string Modifier { get; set; }
        };

        /// <summary>
        /// 异步任务id
        /// </summary>
        [NameInMap("taskId")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

    }

}
