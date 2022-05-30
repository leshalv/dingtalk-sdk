// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AlibabaCloud.SDK.Dingtalktrip_1_0.Models;

namespace AlibabaCloud.SDK.Dingtalktrip_1_0
{
    public class Client : AlibabaCloud.OpenApiClient.Client
    {

        public Client(AlibabaCloud.OpenApiClient.Models.Config config): base(config)
        {
            this._endpointRule = "";
            if (AlibabaCloud.TeaUtil.Common.Empty(_endpoint))
            {
                this._endpoint = "api.dingtalk.com";
            }
        }


        public SyncTripOrderResponse SyncTripOrder(SyncTripOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            SyncTripOrderHeaders headers = new SyncTripOrderHeaders();
            return SyncTripOrderWithOptions(request, headers, runtime);
        }

        public async Task<SyncTripOrderResponse> SyncTripOrderAsync(SyncTripOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            SyncTripOrderHeaders headers = new SyncTripOrderHeaders();
            return await SyncTripOrderWithOptionsAsync(request, headers, runtime);
        }

        public SyncTripOrderResponse SyncTripOrderWithOptions(SyncTripOrderRequest request, SyncTripOrderHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Currency))
            {
                body["currency"] = request.Currency;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.DingUserId))
            {
                body["dingUserId"] = request.DingUserId;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.DiscountAmount))
            {
                body["discountAmount"] = request.DiscountAmount;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.EndorseFlag))
            {
                body["endorseFlag"] = request.EndorseFlag;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Event.ToMap()))
            {
                body["event"] = request.Event;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.GmtOrder))
            {
                body["gmtOrder"] = request.GmtOrder;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.GmtPay))
            {
                body["gmtPay"] = request.GmtPay;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.GmtRefund))
            {
                body["gmtRefund"] = request.GmtRefund;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.InvoiceApplyUrl))
            {
                body["invoiceApplyUrl"] = request.InvoiceApplyUrl;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.JourneyBizNo))
            {
                body["journeyBizNo"] = request.JourneyBizNo;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.OrderDetails))
            {
                body["orderDetails"] = request.OrderDetails;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.OrderNo))
            {
                body["orderNo"] = request.OrderNo;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.OrderUrl))
            {
                body["orderUrl"] = request.OrderUrl;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.RealAmount))
            {
                body["realAmount"] = request.RealAmount;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.RefundAmount))
            {
                body["refundAmount"] = request.RefundAmount;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.RelativeOrderNo))
            {
                body["relativeOrderNo"] = request.RelativeOrderNo;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.TargetCorpId))
            {
                body["targetCorpId"] = request.TargetCorpId;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.TotalAmount))
            {
                body["totalAmount"] = request.TotalAmount;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Type))
            {
                body["type"] = request.Type;
            }
            Dictionary<string, string> realHeaders = new Dictionary<string, string>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(headers.CommonHeaders))
            {
                realHeaders = headers.CommonHeaders;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(headers.XAcsDingtalkAccessToken))
            {
                realHeaders["x-acs-dingtalk-access-token"] = AlibabaCloud.TeaUtil.Common.ToJSONString(headers.XAcsDingtalkAccessToken);
            }
            AlibabaCloud.OpenApiClient.Models.OpenApiRequest req = new AlibabaCloud.OpenApiClient.Models.OpenApiRequest
            {
                Headers = realHeaders,
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            return TeaModel.ToObject<SyncTripOrderResponse>(DoROARequest("SyncTripOrder", "trip_1.0", "HTTP", "POST", "AK", "/v1.0/trip/tripOrders/sync", "json", req, runtime));
        }

        public async Task<SyncTripOrderResponse> SyncTripOrderWithOptionsAsync(SyncTripOrderRequest request, SyncTripOrderHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Currency))
            {
                body["currency"] = request.Currency;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.DingUserId))
            {
                body["dingUserId"] = request.DingUserId;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.DiscountAmount))
            {
                body["discountAmount"] = request.DiscountAmount;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.EndorseFlag))
            {
                body["endorseFlag"] = request.EndorseFlag;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Event.ToMap()))
            {
                body["event"] = request.Event;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.GmtOrder))
            {
                body["gmtOrder"] = request.GmtOrder;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.GmtPay))
            {
                body["gmtPay"] = request.GmtPay;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.GmtRefund))
            {
                body["gmtRefund"] = request.GmtRefund;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.InvoiceApplyUrl))
            {
                body["invoiceApplyUrl"] = request.InvoiceApplyUrl;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.JourneyBizNo))
            {
                body["journeyBizNo"] = request.JourneyBizNo;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.OrderDetails))
            {
                body["orderDetails"] = request.OrderDetails;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.OrderNo))
            {
                body["orderNo"] = request.OrderNo;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.OrderUrl))
            {
                body["orderUrl"] = request.OrderUrl;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.RealAmount))
            {
                body["realAmount"] = request.RealAmount;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.RefundAmount))
            {
                body["refundAmount"] = request.RefundAmount;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.RelativeOrderNo))
            {
                body["relativeOrderNo"] = request.RelativeOrderNo;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.TargetCorpId))
            {
                body["targetCorpId"] = request.TargetCorpId;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.TotalAmount))
            {
                body["totalAmount"] = request.TotalAmount;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Type))
            {
                body["type"] = request.Type;
            }
            Dictionary<string, string> realHeaders = new Dictionary<string, string>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(headers.CommonHeaders))
            {
                realHeaders = headers.CommonHeaders;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(headers.XAcsDingtalkAccessToken))
            {
                realHeaders["x-acs-dingtalk-access-token"] = AlibabaCloud.TeaUtil.Common.ToJSONString(headers.XAcsDingtalkAccessToken);
            }
            AlibabaCloud.OpenApiClient.Models.OpenApiRequest req = new AlibabaCloud.OpenApiClient.Models.OpenApiRequest
            {
                Headers = realHeaders,
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            return TeaModel.ToObject<SyncTripOrderResponse>(await DoROARequestAsync("SyncTripOrder", "trip_1.0", "HTTP", "POST", "AK", "/v1.0/trip/tripOrders/sync", "json", req, runtime));
        }

    }
}