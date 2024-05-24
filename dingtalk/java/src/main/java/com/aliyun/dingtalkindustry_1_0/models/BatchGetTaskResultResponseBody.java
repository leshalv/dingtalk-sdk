// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkindustry_1_0.models;

import com.aliyun.tea.*;

public class BatchGetTaskResultResponseBody extends TeaModel {
    @NameInMap("tasks")
    public java.util.List<BatchGetTaskResultResponseBodyTasks> tasks;

    public static BatchGetTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetTaskResultResponseBody self = new BatchGetTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetTaskResultResponseBody setTasks(java.util.List<BatchGetTaskResultResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<BatchGetTaskResultResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public static class BatchGetTaskResultResponseBodyTasksResultItems extends TeaModel {
        @NameInMap("info")
        public String info;

        @NameInMap("name")
        public String name;

        @NameInMap("point")
        public Long point;

        public static BatchGetTaskResultResponseBodyTasksResultItems build(java.util.Map<String, ?> map) throws Exception {
            BatchGetTaskResultResponseBodyTasksResultItems self = new BatchGetTaskResultResponseBodyTasksResultItems();
            return TeaModel.build(map, self);
        }

        public BatchGetTaskResultResponseBodyTasksResultItems setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public BatchGetTaskResultResponseBodyTasksResultItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BatchGetTaskResultResponseBodyTasksResultItems setPoint(Long point) {
            this.point = point;
            return this;
        }
        public Long getPoint() {
            return this.point;
        }

    }

    public static class BatchGetTaskResultResponseBodyTasksResult extends TeaModel {
        @NameInMap("audioText")
        public String audioText;

        @NameInMap("date")
        public String date;

        @NameInMap("desc")
        public String desc;

        @NameInMap("id")
        public Long id;

        @NameInMap("items")
        public java.util.List<BatchGetTaskResultResponseBodyTasksResultItems> items;

        @NameInMap("name")
        public String name;

        @NameInMap("total")
        public Long total;

        public static BatchGetTaskResultResponseBodyTasksResult build(java.util.Map<String, ?> map) throws Exception {
            BatchGetTaskResultResponseBodyTasksResult self = new BatchGetTaskResultResponseBodyTasksResult();
            return TeaModel.build(map, self);
        }

        public BatchGetTaskResultResponseBodyTasksResult setAudioText(String audioText) {
            this.audioText = audioText;
            return this;
        }
        public String getAudioText() {
            return this.audioText;
        }

        public BatchGetTaskResultResponseBodyTasksResult setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public BatchGetTaskResultResponseBodyTasksResult setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public BatchGetTaskResultResponseBodyTasksResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public BatchGetTaskResultResponseBodyTasksResult setItems(java.util.List<BatchGetTaskResultResponseBodyTasksResultItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<BatchGetTaskResultResponseBodyTasksResultItems> getItems() {
            return this.items;
        }

        public BatchGetTaskResultResponseBodyTasksResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BatchGetTaskResultResponseBodyTasksResult setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class BatchGetTaskResultResponseBodyTasks extends TeaModel {
        @NameInMap("result")
        public BatchGetTaskResultResponseBodyTasksResult result;

        @NameInMap("status")
        public String status;

        @NameInMap("taskId")
        public String taskId;

        public static BatchGetTaskResultResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            BatchGetTaskResultResponseBodyTasks self = new BatchGetTaskResultResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public BatchGetTaskResultResponseBodyTasks setResult(BatchGetTaskResultResponseBodyTasksResult result) {
            this.result = result;
            return this;
        }
        public BatchGetTaskResultResponseBodyTasksResult getResult() {
            return this.result;
        }

        public BatchGetTaskResultResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchGetTaskResultResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
