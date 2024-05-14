// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkresident_1_0.Models
{
    public class CreateResidentBlackBoardRequest : TeaModel {
        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("context")]
        [Validation(Required=false)]
        public string Context { get; set; }

        [NameInMap("mediaId")]
        [Validation(Required=false)]
        public string MediaId { get; set; }

        [NameInMap("sendTime")]
        [Validation(Required=false)]
        public string SendTime { get; set; }

        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

    }

}
