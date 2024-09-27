// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkexclusive_1_0.Models
{
    public class GetRealPeopleRecordsResponseBody : TeaModel {
        [NameInMap("data")]
        [Validation(Required=false)]
        public List<GetRealPeopleRecordsResponseBodyData> Data { get; set; }
        public class GetRealPeopleRecordsResponseBodyData : TeaModel {
            /// <summary>
            /// <b>Example:</b>
            /// <para>agentId</para>
            /// </summary>
            [NameInMap("agentId")]
            [Validation(Required=false)]
            public long? AgentId { get; set; }

            /// <summary>
            /// <b>Example:</b>
            /// <para>166700000</para>
            /// </summary>
            [NameInMap("invokeTime")]
            [Validation(Required=false)]
            public long? InvokeTime { get; set; }

            /// <summary>
            /// <b>Example:</b>
            /// <para>1</para>
            /// </summary>
            [NameInMap("personIdentification")]
            [Validation(Required=false)]
            public int? PersonIdentification { get; set; }

            /// <summary>
            /// <b>Example:</b>
            /// <para>1</para>
            /// </summary>
            [NameInMap("platform")]
            [Validation(Required=false)]
            public int? Platform { get; set; }

            /// <summary>
            /// <b>Example:</b>
            /// <para>1</para>
            /// </summary>
            [NameInMap("scene")]
            [Validation(Required=false)]
            public int? Scene { get; set; }

            /// <summary>
            /// <b>Example:</b>
            /// <para>1234</para>
            /// </summary>
            [NameInMap("userId")]
            [Validation(Required=false)]
            public string UserId { get; set; }

        }

        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("nextToken")]
        [Validation(Required=false)]
        public long? NextToken { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>20</para>
        /// </summary>
        [NameInMap("total")]
        [Validation(Required=false)]
        public int? Total { get; set; }

    }

}
