// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkcrm_1_0.Models
{
    public class BatchSendOfficialAccountOTOMessageRequest : TeaModel {
        /// <summary>
        /// 服务窗帐号ID
        /// </summary>
        [NameInMap("accountId")]
        [Validation(Required=false)]
        public string AccountId { get; set; }

        /// <summary>
        /// 服务窗授权的调用方标识，可空
        /// </summary>
        [NameInMap("bizId")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        /// <summary>
        /// 消息详情
        /// </summary>
        [NameInMap("detail")]
        [Validation(Required=false)]
        public BatchSendOfficialAccountOTOMessageRequestDetail Detail { get; set; }
        public class BatchSendOfficialAccountOTOMessageRequestDetail : TeaModel {
            [NameInMap("bizRequestId")]
            [Validation(Required=false)]
            public string BizRequestId { get; set; }
            [NameInMap("messageBody")]
            [Validation(Required=false)]
            public BatchSendOfficialAccountOTOMessageRequestDetailMessageBody MessageBody { get; set; }
            public class BatchSendOfficialAccountOTOMessageRequestDetailMessageBody : TeaModel {
                /// <summary>
                /// 卡片消息
                /// </summary>
                [NameInMap("actionCard")]
                [Validation(Required=false)]
                public BatchSendOfficialAccountOTOMessageRequestDetailMessageBodyActionCard ActionCard { get; set; }
                public class BatchSendOfficialAccountOTOMessageRequestDetailMessageBodyActionCard : TeaModel {
                    [NameInMap("buttonList")]
                    [Validation(Required=false)]
                    public List<BatchSendOfficialAccountOTOMessageRequestDetailMessageBodyActionCardButtonList> ButtonList { get; set; }
                    public class BatchSendOfficialAccountOTOMessageRequestDetailMessageBodyActionCardButtonList : TeaModel {
                        public string ActionUrl { get; set; }
                        public string Title { get; set; }
                    }
                    [NameInMap("buttonOrientation")]
                    [Validation(Required=false)]
                    public string ButtonOrientation { get; set; }
                    [NameInMap("markdown")]
                    [Validation(Required=false)]
                    public string Markdown { get; set; }
                    [NameInMap("singleTitle")]
                    [Validation(Required=false)]
                    public string SingleTitle { get; set; }
                    [NameInMap("singleUrl")]
                    [Validation(Required=false)]
                    public string SingleUrl { get; set; }
                    [NameInMap("title")]
                    [Validation(Required=false)]
                    public string Title { get; set; }
                };

                /// <summary>
                /// 链接消息类型
                /// </summary>
                [NameInMap("link")]
                [Validation(Required=false)]
                public BatchSendOfficialAccountOTOMessageRequestDetailMessageBodyLink Link { get; set; }
                public class BatchSendOfficialAccountOTOMessageRequestDetailMessageBodyLink : TeaModel {
                    [NameInMap("messageUrl")]
                    [Validation(Required=false)]
                    public string MessageUrl { get; set; }
                    [NameInMap("picUrl")]
                    [Validation(Required=false)]
                    public string PicUrl { get; set; }
                    [NameInMap("text")]
                    [Validation(Required=false)]
                    public string Text { get; set; }
                    [NameInMap("title")]
                    [Validation(Required=false)]
                    public string Title { get; set; }
                };

                /// <summary>
                /// markdown消息，仅对消息类型为markdown时有效
                /// </summary>
                [NameInMap("markdown")]
                [Validation(Required=false)]
                public BatchSendOfficialAccountOTOMessageRequestDetailMessageBodyMarkdown Markdown { get; set; }
                public class BatchSendOfficialAccountOTOMessageRequestDetailMessageBodyMarkdown : TeaModel {
                    [NameInMap("text")]
                    [Validation(Required=false)]
                    public string Text { get; set; }
                    [NameInMap("title")]
                    [Validation(Required=false)]
                    public string Title { get; set; }
                };

                /// <summary>
                /// 文本消息体  对于文本类型消息时必填
                /// </summary>
                [NameInMap("text")]
                [Validation(Required=false)]
                public BatchSendOfficialAccountOTOMessageRequestDetailMessageBodyText Text { get; set; }
                public class BatchSendOfficialAccountOTOMessageRequestDetailMessageBodyText : TeaModel {
                    [NameInMap("content")]
                    [Validation(Required=false)]
                    public string Content { get; set; }
                };

            }
            [NameInMap("msgType")]
            [Validation(Required=false)]
            public string MsgType { get; set; }
            [NameInMap("sendToAll")]
            [Validation(Required=false)]
            public bool? SendToAll { get; set; }
            [NameInMap("userIdList")]
            [Validation(Required=false)]
            public List<string> UserIdList { get; set; }
            [NameInMap("uuid")]
            [Validation(Required=false)]
            public string Uuid { get; set; }
        };

    }

}
