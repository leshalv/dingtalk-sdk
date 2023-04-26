// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkedu_1_0.models;

import com.aliyun.tea.*;

public class QueryClassScheduleByTimeSchoolResponseBody extends TeaModel {
    @NameInMap("result")
    public java.util.List<QueryClassScheduleByTimeSchoolResponseBodyResult> result;

    public static QueryClassScheduleByTimeSchoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryClassScheduleByTimeSchoolResponseBody self = new QueryClassScheduleByTimeSchoolResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryClassScheduleByTimeSchoolResponseBody setResult(java.util.List<QueryClassScheduleByTimeSchoolResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryClassScheduleByTimeSchoolResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryClassScheduleByTimeSchoolResponseBodyResultClassrooms extends TeaModel {
        @NameInMap("interactInfo")
        public String interactInfo;

        @NameInMap("targetId")
        public String targetId;

        public static QueryClassScheduleByTimeSchoolResponseBodyResultClassrooms build(java.util.Map<String, ?> map) throws Exception {
            QueryClassScheduleByTimeSchoolResponseBodyResultClassrooms self = new QueryClassScheduleByTimeSchoolResponseBodyResultClassrooms();
            return TeaModel.build(map, self);
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResultClassrooms setInteractInfo(String interactInfo) {
            this.interactInfo = interactInfo;
            return this;
        }
        public String getInteractInfo() {
            return this.interactInfo;
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResultClassrooms setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

    }

    public static class QueryClassScheduleByTimeSchoolResponseBodyResultEduUserModels extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("uid")
        public Long uid;

        @NameInMap("userId")
        public String userId;

        public static QueryClassScheduleByTimeSchoolResponseBodyResultEduUserModels build(java.util.Map<String, ?> map) throws Exception {
            QueryClassScheduleByTimeSchoolResponseBodyResultEduUserModels self = new QueryClassScheduleByTimeSchoolResponseBodyResultEduUserModels();
            return TeaModel.build(map, self);
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResultEduUserModels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResultEduUserModels setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResultEduUserModels setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryClassScheduleByTimeSchoolResponseBodyResult extends TeaModel {
        @NameInMap("bizKey")
        public String bizKey;

        @NameInMap("classId")
        public Long classId;

        @NameInMap("classrooms")
        public java.util.List<QueryClassScheduleByTimeSchoolResponseBodyResultClassrooms> classrooms;

        @NameInMap("code")
        public String code;

        @NameInMap("courseGroupCode")
        public String courseGroupCode;

        @NameInMap("coverUrl")
        public String coverUrl;

        @NameInMap("creatorCorpId")
        public String creatorCorpId;

        @NameInMap("creatorUserId")
        public String creatorUserId;

        @NameInMap("creatorUserName")
        public String creatorUserName;

        @NameInMap("eduUserModels")
        public java.util.List<QueryClassScheduleByTimeSchoolResponseBodyResultEduUserModels> eduUserModels;

        @NameInMap("endTime")
        public Long endTime;

        @NameInMap("extInfo")
        public String extInfo;

        @NameInMap("introduce")
        public String introduce;

        @NameInMap("name")
        public String name;

        @NameInMap("sectionIndex")
        public Long sectionIndex;

        @NameInMap("sectionName")
        public String sectionName;

        @NameInMap("startTime")
        public Long startTime;

        @NameInMap("status")
        public Long status;

        @NameInMap("subjectCode")
        public String subjectCode;

        @NameInMap("teacherCorpId")
        public String teacherCorpId;

        @NameInMap("teacherUserId")
        public String teacherUserId;

        @NameInMap("teacherUserName")
        public String teacherUserName;

        public static QueryClassScheduleByTimeSchoolResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryClassScheduleByTimeSchoolResponseBodyResult self = new QueryClassScheduleByTimeSchoolResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResult setBizKey(String bizKey) {
            this.bizKey = bizKey;
            return this;
        }
        public String getBizKey() {
            return this.bizKey;
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResult setClassId(Long classId) {
            this.classId = classId;
            return this;
        }
        public Long getClassId() {
            return this.classId;
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResult setClassrooms(java.util.List<QueryClassScheduleByTimeSchoolResponseBodyResultClassrooms> classrooms) {
            this.classrooms = classrooms;
            return this;
        }
        public java.util.List<QueryClassScheduleByTimeSchoolResponseBodyResultClassrooms> getClassrooms() {
            return this.classrooms;
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResult setCourseGroupCode(String courseGroupCode) {
            this.courseGroupCode = courseGroupCode;
            return this;
        }
        public String getCourseGroupCode() {
            return this.courseGroupCode;
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResult setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResult setCreatorCorpId(String creatorCorpId) {
            this.creatorCorpId = creatorCorpId;
            return this;
        }
        public String getCreatorCorpId() {
            return this.creatorCorpId;
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResult setCreatorUserId(String creatorUserId) {
            this.creatorUserId = creatorUserId;
            return this;
        }
        public String getCreatorUserId() {
            return this.creatorUserId;
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResult setCreatorUserName(String creatorUserName) {
            this.creatorUserName = creatorUserName;
            return this;
        }
        public String getCreatorUserName() {
            return this.creatorUserName;
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResult setEduUserModels(java.util.List<QueryClassScheduleByTimeSchoolResponseBodyResultEduUserModels> eduUserModels) {
            this.eduUserModels = eduUserModels;
            return this;
        }
        public java.util.List<QueryClassScheduleByTimeSchoolResponseBodyResultEduUserModels> getEduUserModels() {
            return this.eduUserModels;
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResult setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResult setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResult setIntroduce(String introduce) {
            this.introduce = introduce;
            return this;
        }
        public String getIntroduce() {
            return this.introduce;
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResult setSectionIndex(Long sectionIndex) {
            this.sectionIndex = sectionIndex;
            return this;
        }
        public Long getSectionIndex() {
            return this.sectionIndex;
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResult setSectionName(String sectionName) {
            this.sectionName = sectionName;
            return this;
        }
        public String getSectionName() {
            return this.sectionName;
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResult setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResult setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResult setSubjectCode(String subjectCode) {
            this.subjectCode = subjectCode;
            return this;
        }
        public String getSubjectCode() {
            return this.subjectCode;
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResult setTeacherCorpId(String teacherCorpId) {
            this.teacherCorpId = teacherCorpId;
            return this;
        }
        public String getTeacherCorpId() {
            return this.teacherCorpId;
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResult setTeacherUserId(String teacherUserId) {
            this.teacherUserId = teacherUserId;
            return this;
        }
        public String getTeacherUserId() {
            return this.teacherUserId;
        }

        public QueryClassScheduleByTimeSchoolResponseBodyResult setTeacherUserName(String teacherUserName) {
            this.teacherUserName = teacherUserName;
            return this;
        }
        public String getTeacherUserName() {
            return this.teacherUserName;
        }

    }

}
