// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Dingtalkdevicemng_1_0.Models
{
    public class RegisterAndActivateDeviceRequest : TeaModel {
        [NameInMap("deviceCallbackUrl")]
        [Validation(Required=false)]
        public string DeviceCallbackUrl { get; set; }

        [NameInMap("deviceCode")]
        [Validation(Required=false)]
        public string DeviceCode { get; set; }

        [NameInMap("deviceDetailUrl")]
        [Validation(Required=false)]
        public string DeviceDetailUrl { get; set; }

        [NameInMap("deviceName")]
        [Validation(Required=false)]
        public string DeviceName { get; set; }

        [NameInMap("introduction")]
        [Validation(Required=false)]
        public string Introduction { get; set; }

        [NameInMap("roleUuid")]
        [Validation(Required=false)]
        public string RoleUuid { get; set; }

        [NameInMap("typeUuid")]
        [Validation(Required=false)]
        public string TypeUuid { get; set; }

        [NameInMap("userIds")]
        [Validation(Required=false)]
        public List<string> UserIds { get; set; }

    }

}
