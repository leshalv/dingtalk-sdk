// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkedu_1_0.Models
{
    public class QueryUniversityCourseGroupResponseBody : TeaModel {
        /// <summary>
        /// 课程组信息
        /// </summary>
        [NameInMap("universityCourseGroupInfo")]
        [Validation(Required=false)]
        public QueryUniversityCourseGroupResponseBodyUniversityCourseGroupInfo UniversityCourseGroupInfo { get; set; }
        public class QueryUniversityCourseGroupResponseBodyUniversityCourseGroupInfo : TeaModel {
            [NameInMap("courseGroupCode")]
            [Validation(Required=false)]
            public string CourseGroupCode { get; set; }
            [NameInMap("courseGroupIntroduce")]
            [Validation(Required=false)]
            public string CourseGroupIntroduce { get; set; }
            [NameInMap("courseGroupName")]
            [Validation(Required=false)]
            public string CourseGroupName { get; set; }
            [NameInMap("courserGroupItemModels")]
            [Validation(Required=false)]
            public List<QueryUniversityCourseGroupResponseBodyUniversityCourseGroupInfoCourserGroupItemModels> CourserGroupItemModels { get; set; }
            public class QueryUniversityCourseGroupResponseBodyUniversityCourseGroupInfoCourserGroupItemModels : TeaModel {
                public int? ClassPeriodType { get; set; }
                public long? ClassroomId { get; set; }
                public int? CourseType { get; set; }
                public QueryUniversityCourseGroupResponseBodyUniversityCourseGroupInfoCourserGroupItemModelsCourserGroupItemEndDate CourserGroupItemEndDate { get; set; }
                public class QueryUniversityCourseGroupResponseBodyUniversityCourseGroupInfoCourserGroupItemModelsCourserGroupItemEndDate : TeaModel {
                    /// <summary>
                    /// 日
                    /// </summary>
                    [NameInMap("dayOfMonth")]
                    [Validation(Required=false)]
                    public int? DayOfMonth { get; set; }

                    /// <summary>
                    /// 月
                    /// </summary>
                    [NameInMap("month")]
                    [Validation(Required=false)]
                    public int? Month { get; set; }

                    /// <summary>
                    /// 年
                    /// </summary>
                    [NameInMap("year")]
                    [Validation(Required=false)]
                    public int? Year { get; set; }

                }
                public QueryUniversityCourseGroupResponseBodyUniversityCourseGroupInfoCourserGroupItemModelsCourserGroupItemStartDate CourserGroupItemStartDate { get; set; }
                public class QueryUniversityCourseGroupResponseBodyUniversityCourseGroupInfoCourserGroupItemModelsCourserGroupItemStartDate : TeaModel {
                    /// <summary>
                    /// 日
                    /// </summary>
                    [NameInMap("dayOfMonth")]
                    [Validation(Required=false)]
                    public int? DayOfMonth { get; set; }

                    /// <summary>
                    /// 月
                    /// </summary>
                    [NameInMap("month")]
                    [Validation(Required=false)]
                    public int? Month { get; set; }

                    /// <summary>
                    /// 年
                    /// </summary>
                    [NameInMap("year")]
                    [Validation(Required=false)]
                    public int? Year { get; set; }

                }
                public int? DayOfWeek { get; set; }
                public List<int?> SectionIndex { get; set; }
            }
            [NameInMap("isvCourseGroupCode")]
            [Validation(Required=false)]
            public string IsvCourseGroupCode { get; set; }
            [NameInMap("periodCode")]
            [Validation(Required=false)]
            public string PeriodCode { get; set; }
            [NameInMap("schoolYear")]
            [Validation(Required=false)]
            public string SchoolYear { get; set; }
            [NameInMap("semester")]
            [Validation(Required=false)]
            public int? Semester { get; set; }
            [NameInMap("subjectName")]
            [Validation(Required=false)]
            public string SubjectName { get; set; }
        };

    }

}
