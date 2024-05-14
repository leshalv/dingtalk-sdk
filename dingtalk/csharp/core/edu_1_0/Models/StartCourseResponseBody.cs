// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkedu_1_0.Models
{
    public class StartCourseResponseBody : TeaModel {
        /// <summary>
        /// This parameter is required.
        /// </summary>
        [NameInMap("universityCourseCommonResponse")]
        [Validation(Required=false)]
        public StartCourseResponseBodyUniversityCourseCommonResponse UniversityCourseCommonResponse { get; set; }
        public class StartCourseResponseBodyUniversityCourseCommonResponse : TeaModel {
            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("courseCode")]
            [Validation(Required=false)]
            public string CourseCode { get; set; }

            /// <summary>
            /// This parameter is required.
            /// </summary>
            [NameInMap("success")]
            [Validation(Required=false)]
            public bool? Success { get; set; }

        }

    }

}
