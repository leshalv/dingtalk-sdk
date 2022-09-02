// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalktodo_1_0.Models
{
    public class CreateTodoTaskResponseBody : TeaModel {
        /// <summary>
        /// 接入应用标识
        /// </summary>
        [NameInMap("bizTag")]
        [Validation(Required=false)]
        public string BizTag { get; set; }

        /// <summary>
        /// 内容区表单字段配置
        /// </summary>
        [NameInMap("contentFieldList")]
        [Validation(Required=false)]
        public List<CreateTodoTaskResponseBodyContentFieldList> ContentFieldList { get; set; }
        public class CreateTodoTaskResponseBodyContentFieldList : TeaModel {
            /// <summary>
            /// 字段唯一标识
            /// </summary>
            [NameInMap("fieldKey")]
            [Validation(Required=false)]
            public string FieldKey { get; set; }

            /// <summary>
            /// 字段值
            /// </summary>
            [NameInMap("fieldValue")]
            [Validation(Required=false)]
            public string FieldValue { get; set; }

        }

        /// <summary>
        /// 创建时间
        /// </summary>
        [NameInMap("createdTime")]
        [Validation(Required=false)]
        public long? CreatedTime { get; set; }

        /// <summary>
        /// 创建者（用户的unionId）
        /// </summary>
        [NameInMap("creatorId")]
        [Validation(Required=false)]
        public string CreatorId { get; set; }

        /// <summary>
        /// 描述
        /// </summary>
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        /// <summary>
        /// 自定义详情页跳转配置
        /// </summary>
        [NameInMap("detailUrl")]
        [Validation(Required=false)]
        public CreateTodoTaskResponseBodyDetailUrl DetailUrl { get; set; }
        public class CreateTodoTaskResponseBodyDetailUrl : TeaModel {
            /// <summary>
            /// app端详情页地址
            /// </summary>
            [NameInMap("appUrl")]
            [Validation(Required=false)]
            public string AppUrl { get; set; }

            /// <summary>
            /// pc端详情页地址
            /// </summary>
            [NameInMap("pcUrl")]
            [Validation(Required=false)]
            public string PcUrl { get; set; }

        }

        /// <summary>
        /// 完成状态
        /// </summary>
        [NameInMap("done")]
        [Validation(Required=false)]
        public bool? Done { get; set; }

        /// <summary>
        /// 截止时间
        /// </summary>
        [NameInMap("dueTime")]
        [Validation(Required=false)]
        public long? DueTime { get; set; }

        /// <summary>
        /// 执行者列表（用户的unionId）
        /// </summary>
        [NameInMap("executorIds")]
        [Validation(Required=false)]
        public List<string> ExecutorIds { get; set; }

        /// <summary>
        /// 完成时间
        /// </summary>
        [NameInMap("finishTime")]
        [Validation(Required=false)]
        public long? FinishTime { get; set; }

        /// <summary>
        /// id
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        /// <summary>
        /// 生成的待办是否仅展示在执行者的待办列表中
        /// </summary>
        [NameInMap("isOnlyShowExecutor")]
        [Validation(Required=false)]
        public bool? IsOnlyShowExecutor { get; set; }

        /// <summary>
        /// 更新时间
        /// </summary>
        [NameInMap("modifiedTime")]
        [Validation(Required=false)]
        public long? ModifiedTime { get; set; }

        /// <summary>
        /// 更新者（用户的unionId）
        /// </summary>
        [NameInMap("modifierId")]
        [Validation(Required=false)]
        public string ModifierId { get; set; }

        /// <summary>
        /// 待办通知配置
        /// </summary>
        [NameInMap("notifyConfigs")]
        [Validation(Required=false)]
        public CreateTodoTaskResponseBodyNotifyConfigs NotifyConfigs { get; set; }
        public class CreateTodoTaskResponseBodyNotifyConfigs : TeaModel {
            /// <summary>
            /// ding通知配置：value:"channel"（1钉弹框通知，2钉短信通知，3钉电话通知）
            /// </summary>
            [NameInMap("dingNotify")]
            [Validation(Required=false)]
            public string DingNotify { get; set; }

        }

        /// <summary>
        /// 参与者列表（用户的unionId）
        /// </summary>
        [NameInMap("participantIds")]
        [Validation(Required=false)]
        public List<string> ParticipantIds { get; set; }

        /// <summary>
        /// 优先级, 较低:10, 普通:20, 紧急:30, 非常紧急:40
        /// </summary>
        [NameInMap("priority")]
        [Validation(Required=false)]
        public int? Priority { get; set; }

        /// <summary>
        /// requestId
        /// </summary>
        [NameInMap("requestId")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        /// <summary>
        /// 业务来源
        /// </summary>
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

        /// <summary>
        /// 业务来源id
        /// </summary>
        [NameInMap("sourceId")]
        [Validation(Required=false)]
        public string SourceId { get; set; }

        /// <summary>
        /// 开始时间
        /// </summary>
        [NameInMap("startTime")]
        [Validation(Required=false)]
        public long? StartTime { get; set; }

        /// <summary>
        /// 标题
        /// </summary>
        [NameInMap("subject")]
        [Validation(Required=false)]
        public string Subject { get; set; }

    }

}
