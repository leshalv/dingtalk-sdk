# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.core import TeaCore

from alibabacloud_tea_openapi.client import Client as OpenApiClient
from alibabacloud_tea_openapi import models as open_api_models
from alibabacloud_tea_util.client import Client as UtilClient
from alibabacloud_dingtalk.okr_1_0 import models as dingtalkokr__1__0_models
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

    def align_objective(
        self,
        objective_id: str,
        request: dingtalkokr__1__0_models.AlignObjectiveRequest,
    ) -> dingtalkokr__1__0_models.AlignObjectiveResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalkokr__1__0_models.AlignObjectiveHeaders()
        return self.align_objective_with_options(objective_id, request, headers, runtime)

    async def align_objective_async(
        self,
        objective_id: str,
        request: dingtalkokr__1__0_models.AlignObjectiveRequest,
    ) -> dingtalkokr__1__0_models.AlignObjectiveResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalkokr__1__0_models.AlignObjectiveHeaders()
        return await self.align_objective_with_options_async(objective_id, request, headers, runtime)

    def align_objective_with_options(
        self,
        objective_id: str,
        request: dingtalkokr__1__0_models.AlignObjectiveRequest,
        headers: dingtalkokr__1__0_models.AlignObjectiveHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkokr__1__0_models.AlignObjectiveResponse:
        UtilClient.validate_model(request)
        objective_id = OpenApiUtilClient.get_encode_param(objective_id)
        query = {}
        if not UtilClient.is_unset(request.owner_id):
            query['ownerId'] = request.owner_id
        body = {}
        if not UtilClient.is_unset(request.period_id):
            body['periodId'] = request.period_id
        if not UtilClient.is_unset(request.target_id):
            body['targetId'] = request.target_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query),
            body=OpenApiUtilClient.parse_to_map(body)
        )
        return TeaCore.from_map(
            dingtalkokr__1__0_models.AlignObjectiveResponse(),
            self.do_roarequest('AlignObjective', 'okr_1.0', 'HTTP', 'POST', 'AK', f'/v1.0/okr/objectives/{objective_id}/alignments', 'json', req, runtime)
        )

    async def align_objective_with_options_async(
        self,
        objective_id: str,
        request: dingtalkokr__1__0_models.AlignObjectiveRequest,
        headers: dingtalkokr__1__0_models.AlignObjectiveHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkokr__1__0_models.AlignObjectiveResponse:
        UtilClient.validate_model(request)
        objective_id = OpenApiUtilClient.get_encode_param(objective_id)
        query = {}
        if not UtilClient.is_unset(request.owner_id):
            query['ownerId'] = request.owner_id
        body = {}
        if not UtilClient.is_unset(request.period_id):
            body['periodId'] = request.period_id
        if not UtilClient.is_unset(request.target_id):
            body['targetId'] = request.target_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query),
            body=OpenApiUtilClient.parse_to_map(body)
        )
        return TeaCore.from_map(
            dingtalkokr__1__0_models.AlignObjectiveResponse(),
            await self.do_roarequest_async('AlignObjective', 'okr_1.0', 'HTTP', 'POST', 'AK', f'/v1.0/okr/objectives/{objective_id}/alignments', 'json', req, runtime)
        )

    def batch_query_objective(
        self,
        request: dingtalkokr__1__0_models.BatchQueryObjectiveRequest,
    ) -> dingtalkokr__1__0_models.BatchQueryObjectiveResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalkokr__1__0_models.BatchQueryObjectiveHeaders()
        return self.batch_query_objective_with_options(request, headers, runtime)

    async def batch_query_objective_async(
        self,
        request: dingtalkokr__1__0_models.BatchQueryObjectiveRequest,
    ) -> dingtalkokr__1__0_models.BatchQueryObjectiveResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalkokr__1__0_models.BatchQueryObjectiveHeaders()
        return await self.batch_query_objective_with_options_async(request, headers, runtime)

    def batch_query_objective_with_options(
        self,
        request: dingtalkokr__1__0_models.BatchQueryObjectiveRequest,
        headers: dingtalkokr__1__0_models.BatchQueryObjectiveHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkokr__1__0_models.BatchQueryObjectiveResponse:
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.owner_id):
            query['ownerId'] = request.owner_id
        body = {}
        if not UtilClient.is_unset(request.objective_ids):
            body['objectiveIds'] = request.objective_ids
        if not UtilClient.is_unset(request.period_id):
            body['periodId'] = request.period_id
        if not UtilClient.is_unset(request.with_align):
            body['withAlign'] = request.with_align
        if not UtilClient.is_unset(request.with_kr):
            body['withKr'] = request.with_kr
        if not UtilClient.is_unset(request.with_progress):
            body['withProgress'] = request.with_progress
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query),
            body=OpenApiUtilClient.parse_to_map(body)
        )
        return TeaCore.from_map(
            dingtalkokr__1__0_models.BatchQueryObjectiveResponse(),
            self.do_roarequest('BatchQueryObjective', 'okr_1.0', 'HTTP', 'POST', 'AK', f'/v1.0/okr/objectives/query', 'json', req, runtime)
        )

    async def batch_query_objective_with_options_async(
        self,
        request: dingtalkokr__1__0_models.BatchQueryObjectiveRequest,
        headers: dingtalkokr__1__0_models.BatchQueryObjectiveHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkokr__1__0_models.BatchQueryObjectiveResponse:
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.owner_id):
            query['ownerId'] = request.owner_id
        body = {}
        if not UtilClient.is_unset(request.objective_ids):
            body['objectiveIds'] = request.objective_ids
        if not UtilClient.is_unset(request.period_id):
            body['periodId'] = request.period_id
        if not UtilClient.is_unset(request.with_align):
            body['withAlign'] = request.with_align
        if not UtilClient.is_unset(request.with_kr):
            body['withKr'] = request.with_kr
        if not UtilClient.is_unset(request.with_progress):
            body['withProgress'] = request.with_progress
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query),
            body=OpenApiUtilClient.parse_to_map(body)
        )
        return TeaCore.from_map(
            dingtalkokr__1__0_models.BatchQueryObjectiveResponse(),
            await self.do_roarequest_async('BatchQueryObjective', 'okr_1.0', 'HTTP', 'POST', 'AK', f'/v1.0/okr/objectives/query', 'json', req, runtime)
        )

    def create_key_result(
        self,
        request: dingtalkokr__1__0_models.CreateKeyResultRequest,
    ) -> dingtalkokr__1__0_models.CreateKeyResultResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalkokr__1__0_models.CreateKeyResultHeaders()
        return self.create_key_result_with_options(request, headers, runtime)

    async def create_key_result_async(
        self,
        request: dingtalkokr__1__0_models.CreateKeyResultRequest,
    ) -> dingtalkokr__1__0_models.CreateKeyResultResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalkokr__1__0_models.CreateKeyResultHeaders()
        return await self.create_key_result_with_options_async(request, headers, runtime)

    def create_key_result_with_options(
        self,
        request: dingtalkokr__1__0_models.CreateKeyResultRequest,
        headers: dingtalkokr__1__0_models.CreateKeyResultHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkokr__1__0_models.CreateKeyResultResponse:
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.owner_id):
            query['ownerId'] = request.owner_id
        body = {}
        if not UtilClient.is_unset(request.content):
            body['content'] = request.content
        if not UtilClient.is_unset(request.objective_id):
            body['objectiveId'] = request.objective_id
        if not UtilClient.is_unset(request.period_id):
            body['periodId'] = request.period_id
        if not UtilClient.is_unset(request.prev_position):
            body['prevPosition'] = request.prev_position
        if not UtilClient.is_unset(request.weight):
            body['weight'] = request.weight
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query),
            body=OpenApiUtilClient.parse_to_map(body)
        )
        return TeaCore.from_map(
            dingtalkokr__1__0_models.CreateKeyResultResponse(),
            self.do_roarequest('CreateKeyResult', 'okr_1.0', 'HTTP', 'POST', 'AK', f'/v1.0/okr/keyResults', 'json', req, runtime)
        )

    async def create_key_result_with_options_async(
        self,
        request: dingtalkokr__1__0_models.CreateKeyResultRequest,
        headers: dingtalkokr__1__0_models.CreateKeyResultHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkokr__1__0_models.CreateKeyResultResponse:
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.owner_id):
            query['ownerId'] = request.owner_id
        body = {}
        if not UtilClient.is_unset(request.content):
            body['content'] = request.content
        if not UtilClient.is_unset(request.objective_id):
            body['objectiveId'] = request.objective_id
        if not UtilClient.is_unset(request.period_id):
            body['periodId'] = request.period_id
        if not UtilClient.is_unset(request.prev_position):
            body['prevPosition'] = request.prev_position
        if not UtilClient.is_unset(request.weight):
            body['weight'] = request.weight
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query),
            body=OpenApiUtilClient.parse_to_map(body)
        )
        return TeaCore.from_map(
            dingtalkokr__1__0_models.CreateKeyResultResponse(),
            await self.do_roarequest_async('CreateKeyResult', 'okr_1.0', 'HTTP', 'POST', 'AK', f'/v1.0/okr/keyResults', 'json', req, runtime)
        )

    def create_objective(
        self,
        request: dingtalkokr__1__0_models.CreateObjectiveRequest,
    ) -> dingtalkokr__1__0_models.CreateObjectiveResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalkokr__1__0_models.CreateObjectiveHeaders()
        return self.create_objective_with_options(request, headers, runtime)

    async def create_objective_async(
        self,
        request: dingtalkokr__1__0_models.CreateObjectiveRequest,
    ) -> dingtalkokr__1__0_models.CreateObjectiveResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalkokr__1__0_models.CreateObjectiveHeaders()
        return await self.create_objective_with_options_async(request, headers, runtime)

    def create_objective_with_options(
        self,
        request: dingtalkokr__1__0_models.CreateObjectiveRequest,
        headers: dingtalkokr__1__0_models.CreateObjectiveHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkokr__1__0_models.CreateObjectiveResponse:
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.user_id):
            query['userId'] = request.user_id
        body = {}
        if not UtilClient.is_unset(request.content):
            body['content'] = request.content
        if not UtilClient.is_unset(request.period_id):
            body['periodId'] = request.period_id
        if not UtilClient.is_unset(request.prev_position):
            body['prevPosition'] = request.prev_position
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query),
            body=OpenApiUtilClient.parse_to_map(body)
        )
        return TeaCore.from_map(
            dingtalkokr__1__0_models.CreateObjectiveResponse(),
            self.do_roarequest('CreateObjective', 'okr_1.0', 'HTTP', 'POST', 'AK', f'/v1.0/okr/objectives', 'json', req, runtime)
        )

    async def create_objective_with_options_async(
        self,
        request: dingtalkokr__1__0_models.CreateObjectiveRequest,
        headers: dingtalkokr__1__0_models.CreateObjectiveHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkokr__1__0_models.CreateObjectiveResponse:
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.user_id):
            query['userId'] = request.user_id
        body = {}
        if not UtilClient.is_unset(request.content):
            body['content'] = request.content
        if not UtilClient.is_unset(request.period_id):
            body['periodId'] = request.period_id
        if not UtilClient.is_unset(request.prev_position):
            body['prevPosition'] = request.prev_position
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query),
            body=OpenApiUtilClient.parse_to_map(body)
        )
        return TeaCore.from_map(
            dingtalkokr__1__0_models.CreateObjectiveResponse(),
            await self.do_roarequest_async('CreateObjective', 'okr_1.0', 'HTTP', 'POST', 'AK', f'/v1.0/okr/objectives', 'json', req, runtime)
        )

    def delete_key_result(
        self,
        request: dingtalkokr__1__0_models.DeleteKeyResultRequest,
    ) -> dingtalkokr__1__0_models.DeleteKeyResultResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalkokr__1__0_models.DeleteKeyResultHeaders()
        return self.delete_key_result_with_options(request, headers, runtime)

    async def delete_key_result_async(
        self,
        request: dingtalkokr__1__0_models.DeleteKeyResultRequest,
    ) -> dingtalkokr__1__0_models.DeleteKeyResultResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalkokr__1__0_models.DeleteKeyResultHeaders()
        return await self.delete_key_result_with_options_async(request, headers, runtime)

    def delete_key_result_with_options(
        self,
        request: dingtalkokr__1__0_models.DeleteKeyResultRequest,
        headers: dingtalkokr__1__0_models.DeleteKeyResultHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkokr__1__0_models.DeleteKeyResultResponse:
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.kr_id):
            query['krId'] = request.kr_id
        if not UtilClient.is_unset(request.owner_id):
            query['ownerId'] = request.owner_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        return TeaCore.from_map(
            dingtalkokr__1__0_models.DeleteKeyResultResponse(),
            self.do_roarequest('DeleteKeyResult', 'okr_1.0', 'HTTP', 'DELETE', 'AK', f'/v1.0/okr/keyResults', 'json', req, runtime)
        )

    async def delete_key_result_with_options_async(
        self,
        request: dingtalkokr__1__0_models.DeleteKeyResultRequest,
        headers: dingtalkokr__1__0_models.DeleteKeyResultHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkokr__1__0_models.DeleteKeyResultResponse:
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.kr_id):
            query['krId'] = request.kr_id
        if not UtilClient.is_unset(request.owner_id):
            query['ownerId'] = request.owner_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        return TeaCore.from_map(
            dingtalkokr__1__0_models.DeleteKeyResultResponse(),
            await self.do_roarequest_async('DeleteKeyResult', 'okr_1.0', 'HTTP', 'DELETE', 'AK', f'/v1.0/okr/keyResults', 'json', req, runtime)
        )

    def delete_objective(
        self,
        objective_id: str,
        request: dingtalkokr__1__0_models.DeleteObjectiveRequest,
    ) -> dingtalkokr__1__0_models.DeleteObjectiveResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalkokr__1__0_models.DeleteObjectiveHeaders()
        return self.delete_objective_with_options(objective_id, request, headers, runtime)

    async def delete_objective_async(
        self,
        objective_id: str,
        request: dingtalkokr__1__0_models.DeleteObjectiveRequest,
    ) -> dingtalkokr__1__0_models.DeleteObjectiveResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalkokr__1__0_models.DeleteObjectiveHeaders()
        return await self.delete_objective_with_options_async(objective_id, request, headers, runtime)

    def delete_objective_with_options(
        self,
        objective_id: str,
        request: dingtalkokr__1__0_models.DeleteObjectiveRequest,
        headers: dingtalkokr__1__0_models.DeleteObjectiveHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkokr__1__0_models.DeleteObjectiveResponse:
        UtilClient.validate_model(request)
        objective_id = OpenApiUtilClient.get_encode_param(objective_id)
        query = {}
        if not UtilClient.is_unset(request.user_id):
            query['userId'] = request.user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        return TeaCore.from_map(
            dingtalkokr__1__0_models.DeleteObjectiveResponse(),
            self.do_roarequest('DeleteObjective', 'okr_1.0', 'HTTP', 'DELETE', 'AK', f'/v1.0/okr/objectives/{objective_id}', 'json', req, runtime)
        )

    async def delete_objective_with_options_async(
        self,
        objective_id: str,
        request: dingtalkokr__1__0_models.DeleteObjectiveRequest,
        headers: dingtalkokr__1__0_models.DeleteObjectiveHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkokr__1__0_models.DeleteObjectiveResponse:
        UtilClient.validate_model(request)
        objective_id = OpenApiUtilClient.get_encode_param(objective_id)
        query = {}
        if not UtilClient.is_unset(request.user_id):
            query['userId'] = request.user_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        return TeaCore.from_map(
            dingtalkokr__1__0_models.DeleteObjectiveResponse(),
            await self.do_roarequest_async('DeleteObjective', 'okr_1.0', 'HTTP', 'DELETE', 'AK', f'/v1.0/okr/objectives/{objective_id}', 'json', req, runtime)
        )

    def get_period_list(self) -> dingtalkokr__1__0_models.GetPeriodListResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalkokr__1__0_models.GetPeriodListHeaders()
        return self.get_period_list_with_options(headers, runtime)

    async def get_period_list_async(self) -> dingtalkokr__1__0_models.GetPeriodListResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalkokr__1__0_models.GetPeriodListHeaders()
        return await self.get_period_list_with_options_async(headers, runtime)

    def get_period_list_with_options(
        self,
        headers: dingtalkokr__1__0_models.GetPeriodListHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkokr__1__0_models.GetPeriodListResponse:
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers
        )
        return TeaCore.from_map(
            dingtalkokr__1__0_models.GetPeriodListResponse(),
            self.do_roarequest('GetPeriodList', 'okr_1.0', 'HTTP', 'GET', 'AK', f'/v1.0/okr/periods', 'json', req, runtime)
        )

    async def get_period_list_with_options_async(
        self,
        headers: dingtalkokr__1__0_models.GetPeriodListHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkokr__1__0_models.GetPeriodListResponse:
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers
        )
        return TeaCore.from_map(
            dingtalkokr__1__0_models.GetPeriodListResponse(),
            await self.do_roarequest_async('GetPeriodList', 'okr_1.0', 'HTTP', 'GET', 'AK', f'/v1.0/okr/periods', 'json', req, runtime)
        )

    def get_user_okr(
        self,
        request: dingtalkokr__1__0_models.GetUserOkrRequest,
    ) -> dingtalkokr__1__0_models.GetUserOkrResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalkokr__1__0_models.GetUserOkrHeaders()
        return self.get_user_okr_with_options(request, headers, runtime)

    async def get_user_okr_async(
        self,
        request: dingtalkokr__1__0_models.GetUserOkrRequest,
    ) -> dingtalkokr__1__0_models.GetUserOkrResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalkokr__1__0_models.GetUserOkrHeaders()
        return await self.get_user_okr_with_options_async(request, headers, runtime)

    def get_user_okr_with_options(
        self,
        request: dingtalkokr__1__0_models.GetUserOkrRequest,
        headers: dingtalkokr__1__0_models.GetUserOkrHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkokr__1__0_models.GetUserOkrResponse:
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.owner_id):
            query['ownerId'] = request.owner_id
        if not UtilClient.is_unset(request.page_number):
            query['pageNumber'] = request.page_number
        if not UtilClient.is_unset(request.page_size):
            query['pageSize'] = request.page_size
        if not UtilClient.is_unset(request.period_id):
            query['periodId'] = request.period_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        return TeaCore.from_map(
            dingtalkokr__1__0_models.GetUserOkrResponse(),
            self.do_roarequest('GetUserOkr', 'okr_1.0', 'HTTP', 'GET', 'AK', f'/v1.0/okr/users/okrs', 'json', req, runtime)
        )

    async def get_user_okr_with_options_async(
        self,
        request: dingtalkokr__1__0_models.GetUserOkrRequest,
        headers: dingtalkokr__1__0_models.GetUserOkrHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkokr__1__0_models.GetUserOkrResponse:
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.owner_id):
            query['ownerId'] = request.owner_id
        if not UtilClient.is_unset(request.page_number):
            query['pageNumber'] = request.page_number
        if not UtilClient.is_unset(request.page_size):
            query['pageSize'] = request.page_size
        if not UtilClient.is_unset(request.period_id):
            query['periodId'] = request.period_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query)
        )
        return TeaCore.from_map(
            dingtalkokr__1__0_models.GetUserOkrResponse(),
            await self.do_roarequest_async('GetUserOkr', 'okr_1.0', 'HTTP', 'GET', 'AK', f'/v1.0/okr/users/okrs', 'json', req, runtime)
        )

    def un_align_objective(
        self,
        objective_id: str,
        request: dingtalkokr__1__0_models.UnAlignObjectiveRequest,
    ) -> dingtalkokr__1__0_models.UnAlignObjectiveResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalkokr__1__0_models.UnAlignObjectiveHeaders()
        return self.un_align_objective_with_options(objective_id, request, headers, runtime)

    async def un_align_objective_async(
        self,
        objective_id: str,
        request: dingtalkokr__1__0_models.UnAlignObjectiveRequest,
    ) -> dingtalkokr__1__0_models.UnAlignObjectiveResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalkokr__1__0_models.UnAlignObjectiveHeaders()
        return await self.un_align_objective_with_options_async(objective_id, request, headers, runtime)

    def un_align_objective_with_options(
        self,
        objective_id: str,
        request: dingtalkokr__1__0_models.UnAlignObjectiveRequest,
        headers: dingtalkokr__1__0_models.UnAlignObjectiveHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkokr__1__0_models.UnAlignObjectiveResponse:
        UtilClient.validate_model(request)
        objective_id = OpenApiUtilClient.get_encode_param(objective_id)
        query = {}
        if not UtilClient.is_unset(request.owner_id):
            query['ownerId'] = request.owner_id
        body = {}
        if not UtilClient.is_unset(request.period_id):
            body['periodId'] = request.period_id
        if not UtilClient.is_unset(request.target_id):
            body['targetId'] = request.target_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query),
            body=OpenApiUtilClient.parse_to_map(body)
        )
        return TeaCore.from_map(
            dingtalkokr__1__0_models.UnAlignObjectiveResponse(),
            self.do_roarequest('UnAlignObjective', 'okr_1.0', 'HTTP', 'POST', 'AK', f'/v1.0/okr/objectives/{objective_id}/alignments/cancel', 'json', req, runtime)
        )

    async def un_align_objective_with_options_async(
        self,
        objective_id: str,
        request: dingtalkokr__1__0_models.UnAlignObjectiveRequest,
        headers: dingtalkokr__1__0_models.UnAlignObjectiveHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkokr__1__0_models.UnAlignObjectiveResponse:
        UtilClient.validate_model(request)
        objective_id = OpenApiUtilClient.get_encode_param(objective_id)
        query = {}
        if not UtilClient.is_unset(request.owner_id):
            query['ownerId'] = request.owner_id
        body = {}
        if not UtilClient.is_unset(request.period_id):
            body['periodId'] = request.period_id
        if not UtilClient.is_unset(request.target_id):
            body['targetId'] = request.target_id
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query),
            body=OpenApiUtilClient.parse_to_map(body)
        )
        return TeaCore.from_map(
            dingtalkokr__1__0_models.UnAlignObjectiveResponse(),
            await self.do_roarequest_async('UnAlignObjective', 'okr_1.0', 'HTTP', 'POST', 'AK', f'/v1.0/okr/objectives/{objective_id}/alignments/cancel', 'json', req, runtime)
        )

    def update_krof_content(
        self,
        request: dingtalkokr__1__0_models.UpdateKROfContentRequest,
    ) -> dingtalkokr__1__0_models.UpdateKROfContentResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalkokr__1__0_models.UpdateKROfContentHeaders()
        return self.update_krof_content_with_options(request, headers, runtime)

    async def update_krof_content_async(
        self,
        request: dingtalkokr__1__0_models.UpdateKROfContentRequest,
    ) -> dingtalkokr__1__0_models.UpdateKROfContentResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalkokr__1__0_models.UpdateKROfContentHeaders()
        return await self.update_krof_content_with_options_async(request, headers, runtime)

    def update_krof_content_with_options(
        self,
        request: dingtalkokr__1__0_models.UpdateKROfContentRequest,
        headers: dingtalkokr__1__0_models.UpdateKROfContentHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkokr__1__0_models.UpdateKROfContentResponse:
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.kr_id):
            query['krId'] = request.kr_id
        if not UtilClient.is_unset(request.operator_uid):
            query['operatorUid'] = request.operator_uid
        body = {}
        if not UtilClient.is_unset(request.content):
            body['content'] = request.content
        if not UtilClient.is_unset(request.update_quote_list):
            body['updateQuoteList'] = request.update_quote_list
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query),
            body=OpenApiUtilClient.parse_to_map(body)
        )
        return TeaCore.from_map(
            dingtalkokr__1__0_models.UpdateKROfContentResponse(),
            self.do_roarequest('UpdateKROfContent', 'okr_1.0', 'HTTP', 'PUT', 'AK', f'/v1.0/okr/keyResults/contents', 'json', req, runtime)
        )

    async def update_krof_content_with_options_async(
        self,
        request: dingtalkokr__1__0_models.UpdateKROfContentRequest,
        headers: dingtalkokr__1__0_models.UpdateKROfContentHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkokr__1__0_models.UpdateKROfContentResponse:
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.kr_id):
            query['krId'] = request.kr_id
        if not UtilClient.is_unset(request.operator_uid):
            query['operatorUid'] = request.operator_uid
        body = {}
        if not UtilClient.is_unset(request.content):
            body['content'] = request.content
        if not UtilClient.is_unset(request.update_quote_list):
            body['updateQuoteList'] = request.update_quote_list
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query),
            body=OpenApiUtilClient.parse_to_map(body)
        )
        return TeaCore.from_map(
            dingtalkokr__1__0_models.UpdateKROfContentResponse(),
            await self.do_roarequest_async('UpdateKROfContent', 'okr_1.0', 'HTTP', 'PUT', 'AK', f'/v1.0/okr/keyResults/contents', 'json', req, runtime)
        )

    def update_krof_score(
        self,
        request: dingtalkokr__1__0_models.UpdateKROfScoreRequest,
    ) -> dingtalkokr__1__0_models.UpdateKROfScoreResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalkokr__1__0_models.UpdateKROfScoreHeaders()
        return self.update_krof_score_with_options(request, headers, runtime)

    async def update_krof_score_async(
        self,
        request: dingtalkokr__1__0_models.UpdateKROfScoreRequest,
    ) -> dingtalkokr__1__0_models.UpdateKROfScoreResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalkokr__1__0_models.UpdateKROfScoreHeaders()
        return await self.update_krof_score_with_options_async(request, headers, runtime)

    def update_krof_score_with_options(
        self,
        request: dingtalkokr__1__0_models.UpdateKROfScoreRequest,
        headers: dingtalkokr__1__0_models.UpdateKROfScoreHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkokr__1__0_models.UpdateKROfScoreResponse:
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.kr_id):
            query['krId'] = request.kr_id
        if not UtilClient.is_unset(request.owner_id):
            query['ownerId'] = request.owner_id
        body = {}
        if not UtilClient.is_unset(request.score):
            body['score'] = request.score
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query),
            body=OpenApiUtilClient.parse_to_map(body)
        )
        return TeaCore.from_map(
            dingtalkokr__1__0_models.UpdateKROfScoreResponse(),
            self.do_roarequest('UpdateKROfScore', 'okr_1.0', 'HTTP', 'PUT', 'AK', f'/v1.0/okr/keyResults/scores', 'json', req, runtime)
        )

    async def update_krof_score_with_options_async(
        self,
        request: dingtalkokr__1__0_models.UpdateKROfScoreRequest,
        headers: dingtalkokr__1__0_models.UpdateKROfScoreHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkokr__1__0_models.UpdateKROfScoreResponse:
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.kr_id):
            query['krId'] = request.kr_id
        if not UtilClient.is_unset(request.owner_id):
            query['ownerId'] = request.owner_id
        body = {}
        if not UtilClient.is_unset(request.score):
            body['score'] = request.score
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query),
            body=OpenApiUtilClient.parse_to_map(body)
        )
        return TeaCore.from_map(
            dingtalkokr__1__0_models.UpdateKROfScoreResponse(),
            await self.do_roarequest_async('UpdateKROfScore', 'okr_1.0', 'HTTP', 'PUT', 'AK', f'/v1.0/okr/keyResults/scores', 'json', req, runtime)
        )

    def update_krof_weight(
        self,
        request: dingtalkokr__1__0_models.UpdateKROfWeightRequest,
    ) -> dingtalkokr__1__0_models.UpdateKROfWeightResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalkokr__1__0_models.UpdateKROfWeightHeaders()
        return self.update_krof_weight_with_options(request, headers, runtime)

    async def update_krof_weight_async(
        self,
        request: dingtalkokr__1__0_models.UpdateKROfWeightRequest,
    ) -> dingtalkokr__1__0_models.UpdateKROfWeightResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalkokr__1__0_models.UpdateKROfWeightHeaders()
        return await self.update_krof_weight_with_options_async(request, headers, runtime)

    def update_krof_weight_with_options(
        self,
        request: dingtalkokr__1__0_models.UpdateKROfWeightRequest,
        headers: dingtalkokr__1__0_models.UpdateKROfWeightHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkokr__1__0_models.UpdateKROfWeightResponse:
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.kr_id):
            query['krId'] = request.kr_id
        if not UtilClient.is_unset(request.owner_id):
            query['ownerId'] = request.owner_id
        body = {}
        if not UtilClient.is_unset(request.weight):
            body['weight'] = request.weight
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query),
            body=OpenApiUtilClient.parse_to_map(body)
        )
        return TeaCore.from_map(
            dingtalkokr__1__0_models.UpdateKROfWeightResponse(),
            self.do_roarequest('UpdateKROfWeight', 'okr_1.0', 'HTTP', 'PUT', 'AK', f'/v1.0/okr/keyResults/weights', 'json', req, runtime)
        )

    async def update_krof_weight_with_options_async(
        self,
        request: dingtalkokr__1__0_models.UpdateKROfWeightRequest,
        headers: dingtalkokr__1__0_models.UpdateKROfWeightHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkokr__1__0_models.UpdateKROfWeightResponse:
        UtilClient.validate_model(request)
        query = {}
        if not UtilClient.is_unset(request.kr_id):
            query['krId'] = request.kr_id
        if not UtilClient.is_unset(request.owner_id):
            query['ownerId'] = request.owner_id
        body = {}
        if not UtilClient.is_unset(request.weight):
            body['weight'] = request.weight
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query),
            body=OpenApiUtilClient.parse_to_map(body)
        )
        return TeaCore.from_map(
            dingtalkokr__1__0_models.UpdateKROfWeightResponse(),
            await self.do_roarequest_async('UpdateKROfWeight', 'okr_1.0', 'HTTP', 'PUT', 'AK', f'/v1.0/okr/keyResults/weights', 'json', req, runtime)
        )

    def update_objective(
        self,
        objective_id: str,
        request: dingtalkokr__1__0_models.UpdateObjectiveRequest,
    ) -> dingtalkokr__1__0_models.UpdateObjectiveResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalkokr__1__0_models.UpdateObjectiveHeaders()
        return self.update_objective_with_options(objective_id, request, headers, runtime)

    async def update_objective_async(
        self,
        objective_id: str,
        request: dingtalkokr__1__0_models.UpdateObjectiveRequest,
    ) -> dingtalkokr__1__0_models.UpdateObjectiveResponse:
        runtime = util_models.RuntimeOptions()
        headers = dingtalkokr__1__0_models.UpdateObjectiveHeaders()
        return await self.update_objective_with_options_async(objective_id, request, headers, runtime)

    def update_objective_with_options(
        self,
        objective_id: str,
        request: dingtalkokr__1__0_models.UpdateObjectiveRequest,
        headers: dingtalkokr__1__0_models.UpdateObjectiveHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkokr__1__0_models.UpdateObjectiveResponse:
        UtilClient.validate_model(request)
        objective_id = OpenApiUtilClient.get_encode_param(objective_id)
        query = {}
        if not UtilClient.is_unset(request.user_id):
            query['userId'] = request.user_id
        body = {}
        if not UtilClient.is_unset(request.content):
            body['content'] = request.content
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query),
            body=OpenApiUtilClient.parse_to_map(body)
        )
        return TeaCore.from_map(
            dingtalkokr__1__0_models.UpdateObjectiveResponse(),
            self.do_roarequest('UpdateObjective', 'okr_1.0', 'HTTP', 'PUT', 'AK', f'/v1.0/okr/objectives/{objective_id}', 'json', req, runtime)
        )

    async def update_objective_with_options_async(
        self,
        objective_id: str,
        request: dingtalkokr__1__0_models.UpdateObjectiveRequest,
        headers: dingtalkokr__1__0_models.UpdateObjectiveHeaders,
        runtime: util_models.RuntimeOptions,
    ) -> dingtalkokr__1__0_models.UpdateObjectiveResponse:
        UtilClient.validate_model(request)
        objective_id = OpenApiUtilClient.get_encode_param(objective_id)
        query = {}
        if not UtilClient.is_unset(request.user_id):
            query['userId'] = request.user_id
        body = {}
        if not UtilClient.is_unset(request.content):
            body['content'] = request.content
        real_headers = {}
        if not UtilClient.is_unset(headers.common_headers):
            real_headers = headers.common_headers
        if not UtilClient.is_unset(headers.x_acs_dingtalk_access_token):
            real_headers['x-acs-dingtalk-access-token'] = UtilClient.to_jsonstring(headers.x_acs_dingtalk_access_token)
        req = open_api_models.OpenApiRequest(
            headers=real_headers,
            query=OpenApiUtilClient.query(query),
            body=OpenApiUtilClient.parse_to_map(body)
        )
        return TeaCore.from_map(
            dingtalkokr__1__0_models.UpdateObjectiveResponse(),
            await self.do_roarequest_async('UpdateObjective', 'okr_1.0', 'HTTP', 'PUT', 'AK', f'/v1.0/okr/objectives/{objective_id}', 'json', req, runtime)
        )