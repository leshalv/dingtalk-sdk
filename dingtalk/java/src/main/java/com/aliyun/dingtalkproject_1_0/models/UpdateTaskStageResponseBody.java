// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkproject_1_0.models;

import com.aliyun.tea.*;

public class UpdateTaskStageResponseBody extends TeaModel {
    @NameInMap("result")
    public UpdateTaskStageResponseBodyResult result;

    public static UpdateTaskStageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskStageResponseBody self = new UpdateTaskStageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTaskStageResponseBody setResult(UpdateTaskStageResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateTaskStageResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateTaskStageResponseBodyResult extends TeaModel {
        /**
         * <p>任务完成时间(UTC)。</p>
         */
        @NameInMap("accomplishTime")
        public String accomplishTime;

        /**
         * <p>是否任务已完成。</p>
         */
        @NameInMap("isDone")
        public Boolean isDone;

        /**
         * <p>项目ID。</p>
         */
        @NameInMap("projectId")
        public String projectId;

        /**
         * <p>任务列ID。</p>
         */
        @NameInMap("stageId")
        public String stageId;

        /**
         * <p>任务ID。</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <p>任务分组ID。</p>
         */
        @NameInMap("taskListId")
        public String taskListId;

        /**
         * <p>更新时间(UTC)。</p>
         */
        @NameInMap("updated")
        public String updated;

        public static UpdateTaskStageResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskStageResponseBodyResult self = new UpdateTaskStageResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateTaskStageResponseBodyResult setAccomplishTime(String accomplishTime) {
            this.accomplishTime = accomplishTime;
            return this;
        }
        public String getAccomplishTime() {
            return this.accomplishTime;
        }

        public UpdateTaskStageResponseBodyResult setIsDone(Boolean isDone) {
            this.isDone = isDone;
            return this;
        }
        public Boolean getIsDone() {
            return this.isDone;
        }

        public UpdateTaskStageResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public UpdateTaskStageResponseBodyResult setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

        public UpdateTaskStageResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public UpdateTaskStageResponseBodyResult setTaskListId(String taskListId) {
            this.taskListId = taskListId;
            return this;
        }
        public String getTaskListId() {
            return this.taskListId;
        }

        public UpdateTaskStageResponseBodyResult setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

    }

}
