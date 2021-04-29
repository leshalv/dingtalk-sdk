# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel
from typing import Dict, List


class SearchOrgInnerGroupInfoHeaders(TeaModel):
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


class SearchOrgInnerGroupInfoRequest(TeaModel):
    def __init__(
        self,
        group_members_count_end: int = None,
        sync_to_dingpan: int = None,
        group_owner: str = None,
        create_time_end: int = None,
        page_size: int = None,
        create_time_start: int = None,
        uuid: str = None,
        group_members_count_start: int = None,
        last_active_time_end: int = None,
        operator_user_id: str = None,
        group_name: str = None,
        page_start: int = None,
        last_active_time_start: int = None,
    ):
        # groupMembersCntEnd
        self.group_members_count_end = group_members_count_end
        # syncToDingpan
        self.sync_to_dingpan = sync_to_dingpan
        # groupOwner
        self.group_owner = group_owner
        # createTimeEnd
        self.create_time_end = create_time_end
        # pageSize
        self.page_size = page_size
        # createTimeStart
        self.create_time_start = create_time_start
        # uuid
        self.uuid = uuid
        # groupMembersCntStart
        self.group_members_count_start = group_members_count_start
        # lastActiveTimeEnd
        self.last_active_time_end = last_active_time_end
        # operatorUserId
        self.operator_user_id = operator_user_id
        # groupName
        self.group_name = group_name
        # pageStart
        self.page_start = page_start
        # lastActiveTimeStart
        self.last_active_time_start = last_active_time_start

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.group_members_count_end is not None:
            result['groupMembersCountEnd'] = self.group_members_count_end
        if self.sync_to_dingpan is not None:
            result['syncToDingpan'] = self.sync_to_dingpan
        if self.group_owner is not None:
            result['groupOwner'] = self.group_owner
        if self.create_time_end is not None:
            result['createTimeEnd'] = self.create_time_end
        if self.page_size is not None:
            result['pageSize'] = self.page_size
        if self.create_time_start is not None:
            result['createTimeStart'] = self.create_time_start
        if self.uuid is not None:
            result['uuid'] = self.uuid
        if self.group_members_count_start is not None:
            result['groupMembersCountStart'] = self.group_members_count_start
        if self.last_active_time_end is not None:
            result['lastActiveTimeEnd'] = self.last_active_time_end
        if self.operator_user_id is not None:
            result['operatorUserId'] = self.operator_user_id
        if self.group_name is not None:
            result['groupName'] = self.group_name
        if self.page_start is not None:
            result['pageStart'] = self.page_start
        if self.last_active_time_start is not None:
            result['lastActiveTimeStart'] = self.last_active_time_start
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('groupMembersCountEnd') is not None:
            self.group_members_count_end = m.get('groupMembersCountEnd')
        if m.get('syncToDingpan') is not None:
            self.sync_to_dingpan = m.get('syncToDingpan')
        if m.get('groupOwner') is not None:
            self.group_owner = m.get('groupOwner')
        if m.get('createTimeEnd') is not None:
            self.create_time_end = m.get('createTimeEnd')
        if m.get('pageSize') is not None:
            self.page_size = m.get('pageSize')
        if m.get('createTimeStart') is not None:
            self.create_time_start = m.get('createTimeStart')
        if m.get('uuid') is not None:
            self.uuid = m.get('uuid')
        if m.get('groupMembersCountStart') is not None:
            self.group_members_count_start = m.get('groupMembersCountStart')
        if m.get('lastActiveTimeEnd') is not None:
            self.last_active_time_end = m.get('lastActiveTimeEnd')
        if m.get('operatorUserId') is not None:
            self.operator_user_id = m.get('operatorUserId')
        if m.get('groupName') is not None:
            self.group_name = m.get('groupName')
        if m.get('pageStart') is not None:
            self.page_start = m.get('pageStart')
        if m.get('lastActiveTimeStart') is not None:
            self.last_active_time_start = m.get('lastActiveTimeStart')
        return self


class SearchOrgInnerGroupInfoResponseBodyItems(TeaModel):
    def __init__(
        self,
        open_conversation_id: str = None,
        group_owner: str = None,
        group_name: str = None,
        group_admins_count: int = None,
        group_members_count: int = None,
        group_create_time: int = None,
        group_last_active_time: int = None,
        group_last_active_time_show: str = None,
        sync_to_dingpan: int = None,
        used_quota: int = None,
        group_owner_user_id: str = None,
        status: int = None,
        template_id: str = None,
        template_name: str = None,
    ):
        self.open_conversation_id = open_conversation_id
        self.group_owner = group_owner
        self.group_name = group_name
        self.group_admins_count = group_admins_count
        self.group_members_count = group_members_count
        self.group_create_time = group_create_time
        self.group_last_active_time = group_last_active_time
        self.group_last_active_time_show = group_last_active_time_show
        self.sync_to_dingpan = sync_to_dingpan
        self.used_quota = used_quota
        self.group_owner_user_id = group_owner_user_id
        self.status = status
        self.template_id = template_id
        self.template_name = template_name

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.open_conversation_id is not None:
            result['openConversationId'] = self.open_conversation_id
        if self.group_owner is not None:
            result['groupOwner'] = self.group_owner
        if self.group_name is not None:
            result['groupName'] = self.group_name
        if self.group_admins_count is not None:
            result['groupAdminsCount'] = self.group_admins_count
        if self.group_members_count is not None:
            result['groupMembersCount'] = self.group_members_count
        if self.group_create_time is not None:
            result['groupCreateTime'] = self.group_create_time
        if self.group_last_active_time is not None:
            result['groupLastActiveTime'] = self.group_last_active_time
        if self.group_last_active_time_show is not None:
            result['groupLastActiveTimeShow'] = self.group_last_active_time_show
        if self.sync_to_dingpan is not None:
            result['syncToDingpan'] = self.sync_to_dingpan
        if self.used_quota is not None:
            result['usedQuota'] = self.used_quota
        if self.group_owner_user_id is not None:
            result['groupOwnerUserId'] = self.group_owner_user_id
        if self.status is not None:
            result['status'] = self.status
        if self.template_id is not None:
            result['templateId'] = self.template_id
        if self.template_name is not None:
            result['templateName'] = self.template_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('openConversationId') is not None:
            self.open_conversation_id = m.get('openConversationId')
        if m.get('groupOwner') is not None:
            self.group_owner = m.get('groupOwner')
        if m.get('groupName') is not None:
            self.group_name = m.get('groupName')
        if m.get('groupAdminsCount') is not None:
            self.group_admins_count = m.get('groupAdminsCount')
        if m.get('groupMembersCount') is not None:
            self.group_members_count = m.get('groupMembersCount')
        if m.get('groupCreateTime') is not None:
            self.group_create_time = m.get('groupCreateTime')
        if m.get('groupLastActiveTime') is not None:
            self.group_last_active_time = m.get('groupLastActiveTime')
        if m.get('groupLastActiveTimeShow') is not None:
            self.group_last_active_time_show = m.get('groupLastActiveTimeShow')
        if m.get('syncToDingpan') is not None:
            self.sync_to_dingpan = m.get('syncToDingpan')
        if m.get('usedQuota') is not None:
            self.used_quota = m.get('usedQuota')
        if m.get('groupOwnerUserId') is not None:
            self.group_owner_user_id = m.get('groupOwnerUserId')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('templateId') is not None:
            self.template_id = m.get('templateId')
        if m.get('templateName') is not None:
            self.template_name = m.get('templateName')
        return self


class SearchOrgInnerGroupInfoResponseBody(TeaModel):
    def __init__(
        self,
        total_count: int = None,
        item_count: int = None,
        items: List[SearchOrgInnerGroupInfoResponseBodyItems] = None,
    ):
        self.total_count = total_count
        self.item_count = item_count
        self.items = items

    def validate(self):
        if self.items:
            for k in self.items:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.total_count is not None:
            result['totalCount'] = self.total_count
        if self.item_count is not None:
            result['itemCount'] = self.item_count
        result['items'] = []
        if self.items is not None:
            for k in self.items:
                result['items'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('totalCount') is not None:
            self.total_count = m.get('totalCount')
        if m.get('itemCount') is not None:
            self.item_count = m.get('itemCount')
        self.items = []
        if m.get('items') is not None:
            for k in m.get('items'):
                temp_model = SearchOrgInnerGroupInfoResponseBodyItems()
                self.items.append(temp_model.from_map(k))
        return self


class SearchOrgInnerGroupInfoResponse(TeaModel):
    def __init__(
        self,
        headers: Dict[str, str] = None,
        body: SearchOrgInnerGroupInfoResponseBody = None,
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
            temp_model = SearchOrgInnerGroupInfoResponseBody()
            self.body = temp_model.from_map(m['body'])
        return self


