// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkedu_1_0.models;

import com.aliyun.tea.*;

public class CreateRemoteClassCourseResponseBody extends TeaModel {
    @NameInMap("success")
    public Boolean success;

    @NameInMap("result")
    public CreateRemoteClassCourseResponseBodyResult result;

    public static CreateRemoteClassCourseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRemoteClassCourseResponseBody self = new CreateRemoteClassCourseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRemoteClassCourseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateRemoteClassCourseResponseBody setResult(CreateRemoteClassCourseResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateRemoteClassCourseResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateRemoteClassCourseResponseBodyResult extends TeaModel {
        // 课程码
        @NameInMap("courseCode")
        public String courseCode;

        public static CreateRemoteClassCourseResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateRemoteClassCourseResponseBodyResult self = new CreateRemoteClassCourseResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateRemoteClassCourseResponseBodyResult setCourseCode(String courseCode) {
            this.courseCode = courseCode;
            return this;
        }
        public String getCourseCode() {
            return this.courseCode;
        }

    }

}
