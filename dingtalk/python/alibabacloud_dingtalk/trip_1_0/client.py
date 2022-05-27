# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.core import TeaCore

from alibabacloud_tea_openapi.client import Client as OpenApiClient
from alibabacloud_tea_openapi import models as open_api_models
from alibabacloud_tea_util.client import Client as UtilClient
from alibabacloud_dingtalk.trip_1_0 import models as dingtalktrip__1__0_models
from alibabacloud_tea_util import models as util_models
from alibabacloud_openapi_util.client import Client as OpenApiUtilClient


class Client(OpenApiClient):
    """
    *\
    """
    def __init__(
        self, 
        config: open_api_models.Config,
    ):
        super().__init__(config)
        self._endpoint_rule = ''
        if UtilClient.empty(self._endpoint):
            self._endpoint = 'api.dingtalk.com'

    def sync_trip_order(
        self,
        request: dingtalktrip__1__0_models.SyncTripOrderRequest,
    ) -> dingtalktrip__1__0_models.SyncTripOrderResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalktrip__1__0_models.SyncTripOrderHeaders()
        return self.sync_trip_order_with_options(request, headers, runtime)

    async def sync_trip_order_async(
        self,
        request: dingtalktrip__1__0_models.SyncTripOrderRequest,
    ) -> dingtalktrip__1__0_models.SyncTripOrderResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalktrip__1__0_models.SyncTripOrderHeaders()
        return await self.sync_trip_order_with_options_async(request, headers, runtime)

    def sync_trip_order_with_options(
        self,
        request: dingtalktrip__1__0_models.SyncTripOrderRequest,
        headers: dingtalktrip__1__0_models.SyncTripOrderHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalktrip__1__0_models.SyncTripOrderResponse:
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.currency):
            body['currency'] = request.currency
        if not UtilClient.is_unset(request.ding_user_id):
            body['dingUserId'] = request.ding_user_id
        if not UtilClient.is_unset(request.discount_amount):
            body['discountAmount'] = request.discount_amount
        if not UtilClient.is_unset(request.endorse_flag):
            body['endorseFlag'] = request.endorse_flag
        if not UtilClient.is_unset(request.event):
            body['event'] = request.event
        if not UtilClient.is_unset(request.gmt_order):
            body['gmtOrder'] = request.gmt_order
        if not UtilClient.is_unset(request.gmt_pay):
            body['gmtPay'] = request.gmt_pay
        if not UtilClient.is_unset(request.gmt_refund):
            body['gmtRefund'] = request.gmt_refund
        if not UtilClient.is_unset(request.invoice_apply_url):
            body['invoiceApplyUrl'] = request.invoice_apply_url
        if not UtilClient.is_unset(request.journey_biz_no):
            body['journeyBizNo'] = request.journey_biz_no
        if not UtilClient.is_unset(request.order_details):
            body['orderDetails'] = request.order_details
        if not UtilClient.is_unset(request.order_no):
            body['orderNo'] = request.order_no
        if not UtilClient.is_unset(request.order_url):
            body['orderUrl'] = request.order_url
        if not UtilClient.is_unset(request.real_amount):
            body['realAmount'] = request.real_amount
        if not UtilClient.is_unset(request.refund_amount):
            body['refundAmount'] = request.refund_amount
        if not UtilClient.is_unset(request.relative_order_no):
            body['relativeOrderNo'] = request.relative_order_no
        if not UtilClient.is_unset(request.target_corp_id):
            body['targetCorpId'] = request.target_corp_id
        if not UtilClient.is_unset(request.total_amount):
            body['totalAmount'] = request.total_amount
        if not UtilClient.is_unset(request.type):
            body['type'] = request.type
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        return TeaCore.from_map(
            dingtalktrip__1__0_models.SyncTripOrderResponse(),
            self.do_roarequest('SyncTripOrder', 'trip_1.0', 'HTTP', 'POST', 'AK', f'/v1.0/trip/tripOrders/sync', 'json', req, runtime)
        )

    async def sync_trip_order_with_options_async(
        self,
        request: dingtalktrip__1__0_models.SyncTripOrderRequest,
        headers: dingtalktrip__1__0_models.SyncTripOrderHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalktrip__1__0_models.SyncTripOrderResponse:
        UtilClient.validate_model(request)
        body = {}
        if not UtilClient.is_unset(request.currency):
            body['currency'] = request.currency
        if not UtilClient.is_unset(request.ding_user_id):
            body['dingUserId'] = request.ding_user_id
        if not UtilClient.is_unset(request.discount_amount):
            body['discountAmount'] = request.discount_amount
        if not UtilClient.is_unset(request.endorse_flag):
            body['endorseFlag'] = request.endorse_flag
        if not UtilClient.is_unset(request.event):
            body['event'] = request.event
        if not UtilClient.is_unset(request.gmt_order):
            body['gmtOrder'] = request.gmt_order
        if not UtilClient.is_unset(request.gmt_pay):
            body['gmtPay'] = request.gmt_pay
        if not UtilClient.is_unset(request.gmt_refund):
            body['gmtRefund'] = request.gmt_refund
        if not UtilClient.is_unset(request.invoice_apply_url):
            body['invoiceApplyUrl'] = request.invoice_apply_url
        if not UtilClient.is_unset(request.journey_biz_no):
            body['journeyBizNo'] = request.journey_biz_no
        if not UtilClient.is_unset(request.order_details):
            body['orderDetails'] = request.order_details
        if not UtilClient.is_unset(request.order_no):
            body['orderNo'] = request.order_no
        if not UtilClient.is_unset(request.order_url):
            body['orderUrl'] = request.order_url
        if not UtilClient.is_unset(request.real_amount):
            body['realAmount'] = request.real_amount
        if not UtilClient.is_unset(request.refund_amount):
            body['refundAmount'] = request.refund_amount
        if not UtilClient.is_unset(request.relative_order_no):
            body['relativeOrderNo'] = request.relative_order_no
        if not UtilClient.is_unset(request.target_corp_id):
            body['targetCorpId'] = request.target_corp_id
        if not UtilClient.is_unset(request.total_amount):
            body['totalAmount'] = request.total_amount
        if not UtilClient.is_unset(request.type):
            body['type'] = request.type
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            body=OpenApiUtilClient.parse_to_map(body)
        )
        return TeaCore.from_map(
            dingtalktrip__1__0_models.SyncTripOrderResponse(),
            await self.do_roarequest_async('SyncTripOrder', 'trip_1.0', 'HTTP', 'POST', 'AK', f'/v1.0/trip/tripOrders/sync', 'json', req, runtime)
        )
