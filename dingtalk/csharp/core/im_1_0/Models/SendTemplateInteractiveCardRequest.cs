// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkim_1_0.Models
{
    public class SendTemplateInteractiveCardRequest : TeaModel {
        /// <summary>
        /// 可控制卡片回调的url【可空：不填写无需回调】
        /// </summary>
        [NameInMap("callbackUrl")]
        [Validation(Required=false)]
        public string CallbackUrl { get; set; }

        /// <summary>
        /// 卡片模板-文本内容参数（卡片json结构体）
        /// </summary>
        [NameInMap("cardData")]
        [Validation(Required=false)]
        public string CardData { get; set; }

        /// <summary>
        /// 卡片内容模板ID，响应模板目前有：TuWenCard01、TuWenCard02、TuWenCard03、TuWenCard04 4种
        /// </summary>
        [NameInMap("cardTemplateId")]
        [Validation(Required=false)]
        public string CardTemplateId { get; set; }

        [NameInMap("dingIsvOrgId")]
        [Validation(Required=false)]
        public long? DingIsvOrgId { get; set; }

        [NameInMap("dingOauthAppId")]
        [Validation(Required=false)]
        public long? DingOauthAppId { get; set; }

        [NameInMap("dingOrgId")]
        [Validation(Required=false)]
        public long? DingOrgId { get; set; }

        [NameInMap("dingSuiteKey")]
        [Validation(Required=false)]
        public string DingSuiteKey { get; set; }

        [NameInMap("dingTokenGrantType")]
        [Validation(Required=false)]
        public long? DingTokenGrantType { get; set; }

        /// <summary>
        /// 【openConversationId & singleChatReceiver 二选一必填】接收卡片的加密群ID，特指多人群会话（非单聊）
        /// </summary>
        [NameInMap("openConversationId")]
        [Validation(Required=false)]
        public string OpenConversationId { get; set; }

        /// <summary>
        /// 唯一标识一张卡片的外部ID（卡片幂等ID，可用于更新或重复发送同一卡片到多个群会话）【备注：同一个outTrackId重复创建，卡片数据不覆盖更新】
        /// </summary>
        [NameInMap("outTrackId")]
        [Validation(Required=false)]
        public string OutTrackId { get; set; }

        /// <summary>
        /// 机器人代码，群模板机器人网页有机器人ID；企业内部机器人为机器人appKey，企业三方机器人有robotCode
        /// </summary>
        [NameInMap("robotCode")]
        [Validation(Required=false)]
        public string RobotCode { get; set; }

        /// <summary>
        /// 互动卡片发送选项
        /// </summary>
        [NameInMap("sendOptions")]
        [Validation(Required=false)]
        public SendTemplateInteractiveCardRequestSendOptions SendOptions { get; set; }
        public class SendTemplateInteractiveCardRequestSendOptions : TeaModel {
            [NameInMap("atAll")]
            [Validation(Required=false)]
            public bool? AtAll { get; set; }
            [NameInMap("atUserListJson")]
            [Validation(Required=false)]
            public string AtUserListJson { get; set; }
            [NameInMap("cardPropertyJson")]
            [Validation(Required=false)]
            public string CardPropertyJson { get; set; }
            [NameInMap("receiverListJson")]
            [Validation(Required=false)]
            public string ReceiverListJson { get; set; }
        };

        /// <summary>
        /// 【openConversationId & singleChatReceiver 二选一必填】单聊会话接受者json串
        /// </summary>
        [NameInMap("singleChatReceiver")]
        [Validation(Required=false)]
        public string SingleChatReceiver { get; set; }

    }

}
