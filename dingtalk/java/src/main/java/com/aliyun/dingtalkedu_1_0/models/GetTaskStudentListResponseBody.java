// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkedu_1_0.models;

import com.aliyun.tea.*;

public class GetTaskStudentListResponseBody extends TeaModel {
    @NameInMap("count")
    public Long count;

    @NameInMap("studentList")
    public java.util.List<GetTaskStudentListResponseBodyStudentList> studentList;

    @NameInMap("taskId")
    public Long taskId;

    public static GetTaskStudentListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskStudentListResponseBody self = new GetTaskStudentListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskStudentListResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public GetTaskStudentListResponseBody setStudentList(java.util.List<GetTaskStudentListResponseBodyStudentList> studentList) {
        this.studentList = studentList;
        return this;
    }
    public java.util.List<GetTaskStudentListResponseBodyStudentList> getStudentList() {
        return this.studentList;
    }

    public GetTaskStudentListResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public static class GetTaskStudentListResponseBodyStudentList extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("sexuality")
        public String sexuality;

        @NameInMap("studentId")
        public Long studentId;

        public static GetTaskStudentListResponseBodyStudentList build(java.util.Map<String, ?> map) throws Exception {
            GetTaskStudentListResponseBodyStudentList self = new GetTaskStudentListResponseBodyStudentList();
            return TeaModel.build(map, self);
        }

        public GetTaskStudentListResponseBodyStudentList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskStudentListResponseBodyStudentList setSexuality(String sexuality) {
            this.sexuality = sexuality;
            return this;
        }
        public String getSexuality() {
            return this.sexuality;
        }

        public GetTaskStudentListResponseBodyStudentList setStudentId(Long studentId) {
            this.studentId = studentId;
            return this;
        }
        public Long getStudentId() {
            return this.studentId;
        }

    }

}
