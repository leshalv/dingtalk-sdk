// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkyida_1_0.Models
{
    public class SearchFormDatasRequest : TeaModel {
        /// <summary>
        /// 应用编码
        /// </summary>
        [NameInMap("appType")]
        [Validation(Required=false)]
        public string AppType { get; set; }

        /// <summary>
        /// 应用秘钥。在应用数据中获取。
        /// </summary>
        [NameInMap("systemToken")]
        [Validation(Required=false)]
        public string SystemToken { get; set; }

        /// <summary>
        /// 钉钉userId
        /// </summary>
        [NameInMap("userId")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        /// <summary>
        /// 语言。可选值：zh_CN/en_US 默认：zh_CN
        /// </summary>
        [NameInMap("language")]
        [Validation(Required=false)]
        public string Language { get; set; }

        /// <summary>
        /// 表单ID
        /// </summary>
        [NameInMap("formUuid")]
        [Validation(Required=false)]
        public string FormUuid { get; set; }

        /// <summary>
        /// 根据表单内组件值查询
        /// </summary>
        [NameInMap("searchFieldJson")]
        [Validation(Required=false)]
        public string SearchFieldJson { get; set; }

        /// <summary>
        /// 当前页
        /// </summary>
        [NameInMap("currentPage")]
        [Validation(Required=false)]
        public int? CurrentPage { get; set; }

        /// <summary>
        /// 每页记录数
        /// </summary>
        [NameInMap("pageSize")]
        [Validation(Required=false)]
        public int? PageSize { get; set; }

        /// <summary>
        /// 根据数据提交人工号查询
        /// </summary>
        [NameInMap("originatorId")]
        [Validation(Required=false)]
        public string OriginatorId { get; set; }

        /// <summary>
        /// createFrom和createTo两个时间构造一个时间段。查询在该时间段创建的数据列表, 字符串格式，且为yyyy-MM-DD格式
        /// </summary>
        [NameInMap("createFromTimeGMT")]
        [Validation(Required=false)]
        public string CreateFromTimeGMT { get; set; }

        /// <summary>
        /// createFrom和createTo两个时间构造一个时间段。查询在该时间段创建的数据列表。字符串格式，且为yyyy-MM-DD格式。 和createFrom一起，相当于查询在 2018-01-01到2018-01-31之间(包含01和31号)创建的数据。
        /// </summary>
        [NameInMap("createToTimeGMT")]
        [Validation(Required=false)]
        public string CreateToTimeGMT { get; set; }

        /// <summary>
        /// modifiedFrom和modifiedTo构成一个时间段，查询在该时间段有修改的数据列表。字符串格式，且为yyyy-MM-DD格式
        /// </summary>
        [NameInMap("modifiedFromTimeGMT")]
        [Validation(Required=false)]
        public string ModifiedFromTimeGMT { get; set; }

        /// <summary>
        /// modifiedFrom和modifiedTo构成一个时间段，查询在该时间段有修改的数据列表。字符串格式，且为yyyy-MM-DD格式。 和modifiedFrom一起，相当于查询在 2018-01-01到2018-01-31之间(包含01和31号)被修改的数据。
        /// </summary>
        [NameInMap("modifiedToTimeGMT")]
        [Validation(Required=false)]
        public string ModifiedToTimeGMT { get; set; }

        /// <summary>
        /// 指定排序字段
        /// </summary>
        [NameInMap("dynamicOrder")]
        [Validation(Required=false)]
        public string DynamicOrder { get; set; }

    }

}
