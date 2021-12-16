# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel
from typing import Dict, List


class QueryGoodsListHeaders(TeaModel):
    def __init__(
        self,
        common_headers: Dict[str, str] = None,
        x_acs_dingtalk_access_token: str = None,
    ):
        self.common_headers = common_headers
        self.x_acs_dingtalk_access_token = x_acs_dingtalk_access_token

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.common_headers is not None:
            result['commonHeaders'] = self.common_headers
        if self.x_acs_dingtalk_access_token is not None:
            result['x-acs-dingtalk-access-token'] = self.x_acs_dingtalk_access_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('commonHeaders') is not None:
            self.common_headers = m.get('commonHeaders')
        if m.get('x-acs-dingtalk-access-token') is not None:
            self.x_acs_dingtalk_access_token = m.get('x-acs-dingtalk-access-token')
        return self


class QueryGoodsListRequest(TeaModel):
    def __init__(
        self,
        next_token: int = None,
        max_results: int = None,
        start_time_in_mills: int = None,
        end_time_in_mills: int = None,
    ):
        # 分页起始值
        self.next_token = next_token
        # 分页大小
        self.max_results = max_results
        # 开始时间
        self.start_time_in_mills = start_time_in_mills
        # 结束时间
        self.end_time_in_mills = end_time_in_mills

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.next_token is not None:
            result['nextToken'] = self.next_token
        if self.max_results is not None:
            result['maxResults'] = self.max_results
        if self.start_time_in_mills is not None:
            result['startTimeInMills'] = self.start_time_in_mills
        if self.end_time_in_mills is not None:
            result['endTimeInMills'] = self.end_time_in_mills
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('nextToken') is not None:
            self.next_token = m.get('nextToken')
        if m.get('maxResults') is not None:
            self.max_results = m.get('maxResults')
        if m.get('startTimeInMills') is not None:
            self.start_time_in_mills = m.get('startTimeInMills')
        if m.get('endTimeInMills') is not None:
            self.end_time_in_mills = m.get('endTimeInMills')
        return self


class QueryGoodsListResponseBodyResultList(TeaModel):
    def __init__(
        self,
        instance_id: str = None,
        goods_no: str = None,
        goods_name: str = None,
        unit: str = None,
        product_specs: str = None,
    ):
        # 物料ID
        self.instance_id = instance_id
        # 物料编号
        self.goods_no = goods_no
        # 物料名称
        self.goods_name = goods_name
        # 计量单位
        self.unit = unit
        # 规格
        self.product_specs = product_specs

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.instance_id is not None:
            result['instanceId'] = self.instance_id
        if self.goods_no is not None:
            result['goodsNo'] = self.goods_no
        if self.goods_name is not None:
            result['goodsName'] = self.goods_name
        if self.unit is not None:
            result['unit'] = self.unit
        if self.product_specs is not None:
            result['productSpecs'] = self.product_specs
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('instanceId') is not None:
            self.instance_id = m.get('instanceId')
        if m.get('goodsNo') is not None:
            self.goods_no = m.get('goodsNo')
        if m.get('goodsName') is not None:
            self.goods_name = m.get('goodsName')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        if m.get('productSpecs') is not None:
            self.product_specs = m.get('productSpecs')
        return self


class QueryGoodsListResponseBodyResult(TeaModel):
    def __init__(
        self,
        next_token: str = None,
        has_more: bool = None,
        max_results: int = None,
        list: List[QueryGoodsListResponseBodyResultList] = None,
    ):
        # 下次获取数据的游标
        self.next_token = next_token
        # 下次获取数据的游标
        self.has_more = has_more
        # 总数
        self.max_results = max_results
        self.list = list

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.next_token is not None:
            result['nextToken'] = self.next_token
        if self.has_more is not None:
            result['hasMore'] = self.has_more
        if self.max_results is not None:
            result['maxResults'] = self.max_results
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('nextToken') is not None:
            self.next_token = m.get('nextToken')
        if m.get('hasMore') is not None:
            self.has_more = m.get('hasMore')
        if m.get('maxResults') is not None:
            self.max_results = m.get('maxResults')
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = QueryGoodsListResponseBodyResultList()
                self.list.append(temp_model.from_map(k))
        return self


class QueryGoodsListResponseBody(TeaModel):
    def __init__(
        self,
        success: bool = None,
        result: QueryGoodsListResponseBodyResult = None,
    ):
        # success
        self.success = success
        # result
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('result') is not None:
            temp_model = QueryGoodsListResponseBodyResult()
            self.result = temp_model.from_map(m['result'])
        return self


class QueryGoodsListResponse(TeaModel):
    def __init__(
        self,
        headers: Dict[str, str] = None,
        body: QueryGoodsListResponseBody = None,
    ):
        self.headers = headers
        self.body = body

    def validate(self):
        self.validate_required(self.headers, 'headers')
        self.validate_required(self.body, 'body')
        if self.body:
            self.body.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.headers is not None:
            result['headers'] = self.headers
        if self.body is not None:
            result['body'] = self.body.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('headers') is not None:
            self.headers = m.get('headers')
        if m.get('body') is not None:
            temp_model = QueryGoodsListResponseBody()
            self.body = temp_model.from_map(m['body'])
        return self


