# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel
from typing import Dict, List


class GetShareRolesHeaders(TeaModel):
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


class GetShareRolesResponseBodyResult(TeaModel):
    def __init__(
        self,
        share_role_code: str = None,
        share_role_name: str = None,
    ):
        # 角色code
        self.share_role_code = share_role_code
        # 角色名称
        self.share_role_name = share_role_name

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.share_role_code is not None:
            result['shareRoleCode'] = self.share_role_code
        if self.share_role_name is not None:
            result['shareRoleName'] = self.share_role_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('shareRoleCode') is not None:
            self.share_role_code = m.get('shareRoleCode')
        if m.get('shareRoleName') is not None:
            self.share_role_name = m.get('shareRoleName')
        return self


class GetShareRolesResponseBody(TeaModel):
    def __init__(
        self,
        result: List[GetShareRolesResponseBodyResult] = None,
    ):
        self.result = result

    def validate(self):
        if self.result:
            for k in self.result:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.result = []
        if m.get('result') is not None:
            for k in m.get('result'):
                temp_model = GetShareRolesResponseBodyResult()
                self.result.append(temp_model.from_map(k))
        return self


class GetShareRolesResponse(TeaModel):
    def __init__(
        self,
        headers: Dict[str, str] = None,
        body: GetShareRolesResponseBody = None,
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
            temp_model = GetShareRolesResponseBody()
            self.body = temp_model.from_map(m['body'])
        return self


class QueryOrgTypeHeaders(TeaModel):
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


class QueryOrgTypeResponseBody(TeaModel):
    def __init__(
        self,
        org_type: int = None,
    ):
        # 组织类型
        self.org_type = org_type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.org_type is not None:
            result['orgType'] = self.org_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('orgType') is not None:
            self.org_type = m.get('orgType')
        return self


class QueryOrgTypeResponse(TeaModel):
    def __init__(
        self,
        headers: Dict[str, str] = None,
        body: QueryOrgTypeResponseBody = None,
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
            temp_model = QueryOrgTypeResponseBody()
            self.body = temp_model.from_map(m['body'])
        return self


class GetDefaultChildHeaders(TeaModel):
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


class GetDefaultChildResponseBodyBindStudents(TeaModel):
    def __init__(
        self,
        corp_id: str = None,
        staff_id: str = None,
        class_id: int = None,
        period: str = None,
    ):
        self.corp_id = corp_id
        self.staff_id = staff_id
        self.class_id = class_id
        self.period = period

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.corp_id is not None:
            result['corpId'] = self.corp_id
        if self.staff_id is not None:
            result['staffId'] = self.staff_id
        if self.class_id is not None:
            result['classId'] = self.class_id
        if self.period is not None:
            result['period'] = self.period
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('corpId') is not None:
            self.corp_id = m.get('corpId')
        if m.get('staffId') is not None:
            self.staff_id = m.get('staffId')
        if m.get('classId') is not None:
            self.class_id = m.get('classId')
        if m.get('period') is not None:
            self.period = m.get('period')
        return self


class GetDefaultChildResponseBody(TeaModel):
    def __init__(
        self,
        name: str = None,
        nick: str = None,
        avatar: str = None,
        union_id: str = None,
        period: str = None,
        grade: int = None,
        bind_students: List[GetDefaultChildResponseBodyBindStudents] = None,
    ):
        self.name = name
        self.nick = nick
        self.avatar = avatar
        self.union_id = union_id
        self.period = period
        self.grade = grade
        self.bind_students = bind_students

    def validate(self):
        if self.bind_students:
            for k in self.bind_students:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.nick is not None:
            result['nick'] = self.nick
        if self.avatar is not None:
            result['avatar'] = self.avatar
        if self.union_id is not None:
            result['unionId'] = self.union_id
        if self.period is not None:
            result['period'] = self.period
        if self.grade is not None:
            result['grade'] = self.grade
        result['bindStudents'] = []
        if self.bind_students is not None:
            for k in self.bind_students:
                result['bindStudents'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('nick') is not None:
            self.nick = m.get('nick')
        if m.get('avatar') is not None:
            self.avatar = m.get('avatar')
        if m.get('unionId') is not None:
            self.union_id = m.get('unionId')
        if m.get('period') is not None:
            self.period = m.get('period')
        if m.get('grade') is not None:
            self.grade = m.get('grade')
        self.bind_students = []
        if m.get('bindStudents') is not None:
            for k in m.get('bindStudents'):
                temp_model = GetDefaultChildResponseBodyBindStudents()
                self.bind_students.append(temp_model.from_map(k))
        return self


class GetDefaultChildResponse(TeaModel):
    def __init__(
        self,
        headers: Dict[str, str] = None,
        body: GetDefaultChildResponseBody = None,
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
            temp_model = GetDefaultChildResponseBody()
            self.body = temp_model.from_map(m['body'])
        return self


class BatchCreateHeaders(TeaModel):
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


class BatchCreateRequestDataCardRuleItemParamList(TeaModel):
    def __init__(
        self,
        card_task_code: str = None,
        relation_id: str = None,
        card_rule_attr: str = None,
        daily_dubbing: int = None,
        relation_title: str = None,
        relation_url: str = None,
    ):
        # 卡片taskCode
        self.card_task_code = card_task_code
        # 关联的外部Id
        self.relation_id = relation_id
        # 扩展属性，存放配音难度、每日配音视频的url等
        self.card_rule_attr = card_rule_attr
        # 每日配音数
        self.daily_dubbing = daily_dubbing
        # 关联内容标题（会在打卡详页页展示）
        self.relation_title = relation_title
        # relationUrl（点击打卡内容后跳转的链接）（点击卡片内容后跳转的链接）
        self.relation_url = relation_url

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.card_task_code is not None:
            result['cardTaskCode'] = self.card_task_code
        if self.relation_id is not None:
            result['relationId'] = self.relation_id
        if self.card_rule_attr is not None:
            result['cardRuleAttr'] = self.card_rule_attr
        if self.daily_dubbing is not None:
            result['dailyDubbing'] = self.daily_dubbing
        if self.relation_title is not None:
            result['relationTitle'] = self.relation_title
        if self.relation_url is not None:
            result['relationUrl'] = self.relation_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cardTaskCode') is not None:
            self.card_task_code = m.get('cardTaskCode')
        if m.get('relationId') is not None:
            self.relation_id = m.get('relationId')
        if m.get('cardRuleAttr') is not None:
            self.card_rule_attr = m.get('cardRuleAttr')
        if m.get('dailyDubbing') is not None:
            self.daily_dubbing = m.get('dailyDubbing')
        if m.get('relationTitle') is not None:
            self.relation_title = m.get('relationTitle')
        if m.get('relationUrl') is not None:
            self.relation_url = m.get('relationUrl')
        return self


class BatchCreateRequestDataOrgClassStudentGroupListClassListStudents(TeaModel):
    def __init__(
        self,
        name: str = None,
        staff_id: str = None,
    ):
        # 学生名称
        self.name = name
        # 学生id
        self.staff_id = staff_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.staff_id is not None:
            result['staffId'] = self.staff_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('staffId') is not None:
            self.staff_id = m.get('staffId')
        return self


class BatchCreateRequestDataOrgClassStudentGroupListClassList(TeaModel):
    def __init__(
        self,
        class_id: int = None,
        class_name: str = None,
        students: List[BatchCreateRequestDataOrgClassStudentGroupListClassListStudents] = None,
    ):
        # 班级id
        self.class_id = class_id
        # 班级名称
        self.class_name = class_name
        # 班级学生
        self.students = students

    def validate(self):
        if self.students:
            for k in self.students:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.class_id is not None:
            result['classId'] = self.class_id
        if self.class_name is not None:
            result['className'] = self.class_name
        result['students'] = []
        if self.students is not None:
            for k in self.students:
                result['students'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('classId') is not None:
            self.class_id = m.get('classId')
        if m.get('className') is not None:
            self.class_name = m.get('className')
        self.students = []
        if m.get('students') is not None:
            for k in m.get('students'):
                temp_model = BatchCreateRequestDataOrgClassStudentGroupListClassListStudents()
                self.students.append(temp_model.from_map(k))
        return self


class BatchCreateRequestDataOrgClassStudentGroupList(TeaModel):
    def __init__(
        self,
        corp_id: str = None,
        class_list: List[BatchCreateRequestDataOrgClassStudentGroupListClassList] = None,
    ):
        # 组织id
        self.corp_id = corp_id
        # 班级列表
        self.class_list = class_list

    def validate(self):
        if self.class_list:
            for k in self.class_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.corp_id is not None:
            result['corpId'] = self.corp_id
        result['classList'] = []
        if self.class_list is not None:
            for k in self.class_list:
                result['classList'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('corpId') is not None:
            self.corp_id = m.get('corpId')
        self.class_list = []
        if m.get('classList') is not None:
            for k in m.get('classList'):
                temp_model = BatchCreateRequestDataOrgClassStudentGroupListClassList()
                self.class_list.append(temp_model.from_map(k))
        return self


class BatchCreateRequestData(TeaModel):
    def __init__(
        self,
        can_reissue_card: bool = None,
        card_cycle: int = None,
        card_frequency: List[int] = None,
        card_rule_item_param_list: List[BatchCreateRequestDataCardRuleItemParamList] = None,
        class_ids: List[str] = None,
        class_names: List[str] = None,
        content: str = None,
        effect_date: int = None,
        medias: str = None,
        need_metering: str = None,
        org_class_student_group_list: List[BatchCreateRequestDataOrgClassStudentGroupList] = None,
        remind_hour: int = None,
        remind_minute: int = None,
        target_role: str = None,
        template_id: int = None,
        title: str = None,
        unit_of_measurement: str = None,
    ):
        # 是否可以补卡
        self.can_reissue_card = can_reissue_card
        # 打卡周期,单位为天
        self.card_cycle = card_cycle
        # 打卡的频次设置："cardFrequency":[             1,//周天             2,//周一             3,//周二             4,//周三             5,//周四             6,//周五             7//周六         ]
        self.card_frequency = card_frequency
        self.card_rule_item_param_list = card_rule_item_param_list
        # 班级列表
        self.class_ids = class_ids
        # 班级名称列表
        self.class_names = class_names
        # 打卡的内容
        self.content = content
        # 卡片生效时间
        self.effect_date = effect_date
        # 上传相册，图片，录音，盯盘的信息
        self.medias = medias
        # 计量开启
        self.need_metering = need_metering
        self.org_class_student_group_list = org_class_student_group_list
        # 提醒时间（小时）
        self.remind_hour = remind_hour
        # 提醒时间（分钟）
        self.remind_minute = remind_minute
        # 默认：student_guardian
        self.target_role = target_role
        # 打卡模板id
        self.template_id = template_id
        # 卡片标题
        self.title = title
        # 计量单位
        self.unit_of_measurement = unit_of_measurement

    def validate(self):
        if self.card_rule_item_param_list:
            for k in self.card_rule_item_param_list:
                if k:
                    k.validate()
        if self.org_class_student_group_list:
            for k in self.org_class_student_group_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.can_reissue_card is not None:
            result['canReissueCard'] = self.can_reissue_card
        if self.card_cycle is not None:
            result['cardCycle'] = self.card_cycle
        if self.card_frequency is not None:
            result['cardFrequency'] = self.card_frequency
        result['cardRuleItemParamList'] = []
        if self.card_rule_item_param_list is not None:
            for k in self.card_rule_item_param_list:
                result['cardRuleItemParamList'].append(k.to_map() if k else None)
        if self.class_ids is not None:
            result['classIds'] = self.class_ids
        if self.class_names is not None:
            result['classNames'] = self.class_names
        if self.content is not None:
            result['content'] = self.content
        if self.effect_date is not None:
            result['effectDate'] = self.effect_date
        if self.medias is not None:
            result['medias'] = self.medias
        if self.need_metering is not None:
            result['needMetering'] = self.need_metering
        result['orgClassStudentGroupList'] = []
        if self.org_class_student_group_list is not None:
            for k in self.org_class_student_group_list:
                result['orgClassStudentGroupList'].append(k.to_map() if k else None)
        if self.remind_hour is not None:
            result['remindHour'] = self.remind_hour
        if self.remind_minute is not None:
            result['remindMinute'] = self.remind_minute
        if self.target_role is not None:
            result['targetRole'] = self.target_role
        if self.template_id is not None:
            result['templateId'] = self.template_id
        if self.title is not None:
            result['title'] = self.title
        if self.unit_of_measurement is not None:
            result['unitOfMeasurement'] = self.unit_of_measurement
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('canReissueCard') is not None:
            self.can_reissue_card = m.get('canReissueCard')
        if m.get('cardCycle') is not None:
            self.card_cycle = m.get('cardCycle')
        if m.get('cardFrequency') is not None:
            self.card_frequency = m.get('cardFrequency')
        self.card_rule_item_param_list = []
        if m.get('cardRuleItemParamList') is not None:
            for k in m.get('cardRuleItemParamList'):
                temp_model = BatchCreateRequestDataCardRuleItemParamList()
                self.card_rule_item_param_list.append(temp_model.from_map(k))
        if m.get('classIds') is not None:
            self.class_ids = m.get('classIds')
        if m.get('classNames') is not None:
            self.class_names = m.get('classNames')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('effectDate') is not None:
            self.effect_date = m.get('effectDate')
        if m.get('medias') is not None:
            self.medias = m.get('medias')
        if m.get('needMetering') is not None:
            self.need_metering = m.get('needMetering')
        self.org_class_student_group_list = []
        if m.get('orgClassStudentGroupList') is not None:
            for k in m.get('orgClassStudentGroupList'):
                temp_model = BatchCreateRequestDataOrgClassStudentGroupList()
                self.org_class_student_group_list.append(temp_model.from_map(k))
        if m.get('remindHour') is not None:
            self.remind_hour = m.get('remindHour')
        if m.get('remindMinute') is not None:
            self.remind_minute = m.get('remindMinute')
        if m.get('targetRole') is not None:
            self.target_role = m.get('targetRole')
        if m.get('templateId') is not None:
            self.template_id = m.get('templateId')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('unitOfMeasurement') is not None:
            self.unit_of_measurement = m.get('unitOfMeasurement')
        return self


class BatchCreateRequest(TeaModel):
    def __init__(
        self,
        card_biz_code: str = None,
        data: BatchCreateRequestData = None,
        identifier: str = None,
        source_type: str = None,
        userid: str = None,
        ding_corp_id: str = None,
        js_version: int = None,
    ):
        # 卡片业务类型，打卡写死：industry_center
        self.card_biz_code = card_biz_code
        # 卡片详细数据
        self.data = data
        # 卡片幂等唯一键
        self.identifier = identifier
        # isv业务类型
        self.source_type = source_type
        # 老师用户id
        self.userid = userid
        # 老师corpId
        self.ding_corp_id = ding_corp_id
        # 小程序版本号
        self.js_version = js_version

    def validate(self):
        if self.data:
            self.data.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.card_biz_code is not None:
            result['cardBizCode'] = self.card_biz_code
        if self.data is not None:
            result['data'] = self.data.to_map()
        if self.identifier is not None:
            result['identifier'] = self.identifier
        if self.source_type is not None:
            result['sourceType'] = self.source_type
        if self.userid is not None:
            result['userid'] = self.userid
        if self.ding_corp_id is not None:
            result['dingCorpId'] = self.ding_corp_id
        if self.js_version is not None:
            result['jsVersion'] = self.js_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cardBizCode') is not None:
            self.card_biz_code = m.get('cardBizCode')
        if m.get('data') is not None:
            temp_model = BatchCreateRequestData()
            self.data = temp_model.from_map(m['data'])
        if m.get('identifier') is not None:
            self.identifier = m.get('identifier')
        if m.get('sourceType') is not None:
            self.source_type = m.get('sourceType')
        if m.get('userid') is not None:
            self.userid = m.get('userid')
        if m.get('dingCorpId') is not None:
            self.ding_corp_id = m.get('dingCorpId')
        if m.get('jsVersion') is not None:
            self.js_version = m.get('jsVersion')
        return self


class BatchCreateResponseBodyResult(TeaModel):
    def __init__(
        self,
        corp_id_card_id_map: Dict[str, str] = None,
    ):
        self.corp_id_card_id_map = corp_id_card_id_map

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.corp_id_card_id_map is not None:
            result['corpIdCardIdMap'] = self.corp_id_card_id_map
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('corpIdCardIdMap') is not None:
            self.corp_id_card_id_map = m.get('corpIdCardIdMap')
        return self


class BatchCreateResponseBody(TeaModel):
    def __init__(
        self,
        result: BatchCreateResponseBodyResult = None,
    ):
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
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('result') is not None:
            temp_model = BatchCreateResponseBodyResult()
            self.result = temp_model.from_map(m['result'])
        return self


class BatchCreateResponse(TeaModel):
    def __init__(
        self,
        headers: Dict[str, str] = None,
        body: BatchCreateResponseBody = None,
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
            temp_model = BatchCreateResponseBody()
            self.body = temp_model.from_map(m['body'])
        return self


class BatchOrgCreateHWHeaders(TeaModel):
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


class BatchOrgCreateHWRequestOpenSelectItemListClassListStudents(TeaModel):
    def __init__(
        self,
        name: str = None,
        staff_id: str = None,
        avatar: str = None,
    ):
        # 学生姓名
        self.name = name
        # 学生userid
        self.staff_id = staff_id
        # 学生头像
        self.avatar = avatar

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.staff_id is not None:
            result['staffId'] = self.staff_id
        if self.avatar is not None:
            result['avatar'] = self.avatar
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('staffId') is not None:
            self.staff_id = m.get('staffId')
        if m.get('avatar') is not None:
            self.avatar = m.get('avatar')
        return self


class BatchOrgCreateHWRequestOpenSelectItemListClassList(TeaModel):
    def __init__(
        self,
        class_id: str = None,
        class_name: str = None,
        all: bool = None,
        students: List[BatchOrgCreateHWRequestOpenSelectItemListClassListStudents] = None,
    ):
        # 班级id
        self.class_id = class_id
        # 班级名称
        self.class_name = class_name
        # 是否全选
        self.all = all
        # 学生列表
        self.students = students

    def validate(self):
        if self.students:
            for k in self.students:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.class_id is not None:
            result['classId'] = self.class_id
        if self.class_name is not None:
            result['className'] = self.class_name
        if self.all is not None:
            result['all'] = self.all
        result['students'] = []
        if self.students is not None:
            for k in self.students:
                result['students'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('classId') is not None:
            self.class_id = m.get('classId')
        if m.get('className') is not None:
            self.class_name = m.get('className')
        if m.get('all') is not None:
            self.all = m.get('all')
        self.students = []
        if m.get('students') is not None:
            for k in m.get('students'):
                temp_model = BatchOrgCreateHWRequestOpenSelectItemListClassListStudents()
                self.students.append(temp_model.from_map(k))
        return self


class BatchOrgCreateHWRequestOpenSelectItemList(TeaModel):
    def __init__(
        self,
        corp_id: str = None,
        selected_classes_desc: str = None,
        class_list: List[BatchOrgCreateHWRequestOpenSelectItemListClassList] = None,
    ):
        # 组织corpId
        self.corp_id = corp_id
        # 选择内容
        self.selected_classes_desc = selected_classes_desc
        # 班级列表
        self.class_list = class_list

    def validate(self):
        if self.class_list:
            for k in self.class_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.corp_id is not None:
            result['corpId'] = self.corp_id
        if self.selected_classes_desc is not None:
            result['selectedClassesDesc'] = self.selected_classes_desc
        result['classList'] = []
        if self.class_list is not None:
            for k in self.class_list:
                result['classList'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('corpId') is not None:
            self.corp_id = m.get('corpId')
        if m.get('selectedClassesDesc') is not None:
            self.selected_classes_desc = m.get('selectedClassesDesc')
        self.class_list = []
        if m.get('classList') is not None:
            for k in m.get('classList'):
                temp_model = BatchOrgCreateHWRequestOpenSelectItemListClassList()
                self.class_list.append(temp_model.from_map(k))
        return self


class BatchOrgCreateHWRequest(TeaModel):
    def __init__(
        self,
        hw_media: str = None,
        hw_content: str = None,
        hw_title: str = None,
        course_name: str = None,
        hw_photo: str = None,
        hw_video: str = None,
        teacher_name: str = None,
        teacher_user_id: str = None,
        identifier: str = None,
        attributes: str = None,
        target_role: str = None,
        biz_code: str = None,
        status: str = None,
        scheduled_release: str = None,
        scheduled_time: str = None,
        hw_deadline_open: str = None,
        hw_deadline: int = None,
        hw_type: str = None,
        open_select_item_list: List[BatchOrgCreateHWRequestOpenSelectItemList] = None,
        ding_org_id: int = None,
    ):
        # 作业视频
        self.hw_media = hw_media
        # 作业内容
        self.hw_content = hw_content
        # 作业标题
        self.hw_title = hw_title
        # 作业课程名称
        self.course_name = course_name
        # 作业图片
        self.hw_photo = hw_photo
        # 作业音视频
        self.hw_video = hw_video
        # 老师名称
        self.teacher_name = teacher_name
        # 老师userid
        self.teacher_user_id = teacher_user_id
        # 幂等ID字段
        self.identifier = identifier
        # 扩展属性
        self.attributes = attributes
        # 发送对象
        self.target_role = target_role
        # 业务编码
        self.biz_code = biz_code
        # 状态
        self.status = status
        # 定时调度
        self.scheduled_release = scheduled_release
        # 定时调度时间
        self.scheduled_time = scheduled_time
        # 截止时间开启
        self.hw_deadline_open = hw_deadline_open
        # 截止时间
        self.hw_deadline = hw_deadline
        # 作业类型
        self.hw_type = hw_type
        # 选择跨组织班级
        self.open_select_item_list = open_select_item_list
        # 组织ID
        self.ding_org_id = ding_org_id

    def validate(self):
        if self.open_select_item_list:
            for k in self.open_select_item_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.hw_media is not None:
            result['hwMedia'] = self.hw_media
        if self.hw_content is not None:
            result['hwContent'] = self.hw_content
        if self.hw_title is not None:
            result['hwTitle'] = self.hw_title
        if self.course_name is not None:
            result['courseName'] = self.course_name
        if self.hw_photo is not None:
            result['hwPhoto'] = self.hw_photo
        if self.hw_video is not None:
            result['hwVideo'] = self.hw_video
        if self.teacher_name is not None:
            result['teacherName'] = self.teacher_name
        if self.teacher_user_id is not None:
            result['teacherUserId'] = self.teacher_user_id
        if self.identifier is not None:
            result['identifier'] = self.identifier
        if self.attributes is not None:
            result['attributes'] = self.attributes
        if self.target_role is not None:
            result['targetRole'] = self.target_role
        if self.biz_code is not None:
            result['bizCode'] = self.biz_code
        if self.status is not None:
            result['status'] = self.status
        if self.scheduled_release is not None:
            result['scheduledRelease'] = self.scheduled_release
        if self.scheduled_time is not None:
            result['scheduledTime'] = self.scheduled_time
        if self.hw_deadline_open is not None:
            result['hwDeadlineOpen'] = self.hw_deadline_open
        if self.hw_deadline is not None:
            result['hwDeadline'] = self.hw_deadline
        if self.hw_type is not None:
            result['hwType'] = self.hw_type
        result['openSelectItemList'] = []
        if self.open_select_item_list is not None:
            for k in self.open_select_item_list:
                result['openSelectItemList'].append(k.to_map() if k else None)
        if self.ding_org_id is not None:
            result['dingOrgId'] = self.ding_org_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('hwMedia') is not None:
            self.hw_media = m.get('hwMedia')
        if m.get('hwContent') is not None:
            self.hw_content = m.get('hwContent')
        if m.get('hwTitle') is not None:
            self.hw_title = m.get('hwTitle')
        if m.get('courseName') is not None:
            self.course_name = m.get('courseName')
        if m.get('hwPhoto') is not None:
            self.hw_photo = m.get('hwPhoto')
        if m.get('hwVideo') is not None:
            self.hw_video = m.get('hwVideo')
        if m.get('teacherName') is not None:
            self.teacher_name = m.get('teacherName')
        if m.get('teacherUserId') is not None:
            self.teacher_user_id = m.get('teacherUserId')
        if m.get('identifier') is not None:
            self.identifier = m.get('identifier')
        if m.get('attributes') is not None:
            self.attributes = m.get('attributes')
        if m.get('targetRole') is not None:
            self.target_role = m.get('targetRole')
        if m.get('bizCode') is not None:
            self.biz_code = m.get('bizCode')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('scheduledRelease') is not None:
            self.scheduled_release = m.get('scheduledRelease')
        if m.get('scheduledTime') is not None:
            self.scheduled_time = m.get('scheduledTime')
        if m.get('hwDeadlineOpen') is not None:
            self.hw_deadline_open = m.get('hwDeadlineOpen')
        if m.get('hwDeadline') is not None:
            self.hw_deadline = m.get('hwDeadline')
        if m.get('hwType') is not None:
            self.hw_type = m.get('hwType')
        self.open_select_item_list = []
        if m.get('openSelectItemList') is not None:
            for k in m.get('openSelectItemList'):
                temp_model = BatchOrgCreateHWRequestOpenSelectItemList()
                self.open_select_item_list.append(temp_model.from_map(k))
        if m.get('dingOrgId') is not None:
            self.ding_org_id = m.get('dingOrgId')
        return self


class BatchOrgCreateHWResponseBodyResultPublishList(TeaModel):
    def __init__(
        self,
        corpid: str = None,
        hwid: int = None,
    ):
        self.corpid = corpid
        self.hwid = hwid

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.corpid is not None:
            result['corpid'] = self.corpid
        if self.hwid is not None:
            result['hwid'] = self.hwid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('corpid') is not None:
            self.corpid = m.get('corpid')
        if m.get('hwid') is not None:
            self.hwid = m.get('hwid')
        return self


class BatchOrgCreateHWResponseBodyResult(TeaModel):
    def __init__(
        self,
        publish_list: List[BatchOrgCreateHWResponseBodyResultPublishList] = None,
    ):
        self.publish_list = publish_list

    def validate(self):
        if self.publish_list:
            for k in self.publish_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['publishList'] = []
        if self.publish_list is not None:
            for k in self.publish_list:
                result['publishList'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.publish_list = []
        if m.get('publishList') is not None:
            for k in m.get('publishList'):
                temp_model = BatchOrgCreateHWResponseBodyResultPublishList()
                self.publish_list.append(temp_model.from_map(k))
        return self


class BatchOrgCreateHWResponseBody(TeaModel):
    def __init__(
        self,
        result: BatchOrgCreateHWResponseBodyResult = None,
    ):
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('result') is not None:
            temp_model = BatchOrgCreateHWResponseBodyResult()
            self.result = temp_model.from_map(m['result'])
        return self


class BatchOrgCreateHWResponse(TeaModel):
    def __init__(
        self,
        headers: Dict[str, str] = None,
        body: BatchOrgCreateHWResponseBody = None,
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
            temp_model = BatchOrgCreateHWResponseBody()
            self.body = temp_model.from_map(m['body'])
        return self


class CreateCustomDeptHeaders(TeaModel):
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


class CreateCustomDeptRequestCustomDept(TeaModel):
    def __init__(
        self,
        type: str = None,
        name: str = None,
    ):
        # 部门类型：custom_campus: 自定义校区；custom_dept: 自定义部门
        self.type = type
        # 自定义校区或部门名称
        self.name = name

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class CreateCustomDeptRequest(TeaModel):
    def __init__(
        self,
        custom_dept: CreateCustomDeptRequestCustomDept = None,
        super_id: int = None,
        operator: str = None,
        ding_org_id: int = None,
        ding_token_grant_type: int = None,
        ding_suite_key: str = None,
        ding_oauth_app_id: int = None,
        ding_corp_id: str = None,
        ding_isv_org_id: int = None,
    ):
        self.custom_dept = custom_dept
        # 上级部门ID（type为custom_campus时，必须为-7）
        self.super_id = super_id
        # 钉钉管理员员工ID
        self.operator = operator
        self.ding_org_id = ding_org_id
        self.ding_token_grant_type = ding_token_grant_type
        self.ding_suite_key = ding_suite_key
        self.ding_oauth_app_id = ding_oauth_app_id
        self.ding_corp_id = ding_corp_id
        self.ding_isv_org_id = ding_isv_org_id

    def validate(self):
        if self.custom_dept:
            self.custom_dept.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.custom_dept is not None:
            result['customDept'] = self.custom_dept.to_map()
        if self.super_id is not None:
            result['superId'] = self.super_id
        if self.operator is not None:
            result['operator'] = self.operator
        if self.ding_org_id is not None:
            result['dingOrgId'] = self.ding_org_id
        if self.ding_token_grant_type is not None:
            result['dingTokenGrantType'] = self.ding_token_grant_type
        if self.ding_suite_key is not None:
            result['dingSuiteKey'] = self.ding_suite_key
        if self.ding_oauth_app_id is not None:
            result['dingOauthAppId'] = self.ding_oauth_app_id
        if self.ding_corp_id is not None:
            result['dingCorpId'] = self.ding_corp_id
        if self.ding_isv_org_id is not None:
            result['dingIsvOrgId'] = self.ding_isv_org_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('customDept') is not None:
            temp_model = CreateCustomDeptRequestCustomDept()
            self.custom_dept = temp_model.from_map(m['customDept'])
        if m.get('superId') is not None:
            self.super_id = m.get('superId')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('dingOrgId') is not None:
            self.ding_org_id = m.get('dingOrgId')
        if m.get('dingTokenGrantType') is not None:
            self.ding_token_grant_type = m.get('dingTokenGrantType')
        if m.get('dingSuiteKey') is not None:
            self.ding_suite_key = m.get('dingSuiteKey')
        if m.get('dingOauthAppId') is not None:
            self.ding_oauth_app_id = m.get('dingOauthAppId')
        if m.get('dingCorpId') is not None:
            self.ding_corp_id = m.get('dingCorpId')
        if m.get('dingIsvOrgId') is not None:
            self.ding_isv_org_id = m.get('dingIsvOrgId')
        return self


class CreateCustomDeptResponseBodyResult(TeaModel):
    def __init__(
        self,
        dept_id: int = None,
    ):
        # 部门ID
        self.dept_id = dept_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.dept_id is not None:
            result['deptId'] = self.dept_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('deptId') is not None:
            self.dept_id = m.get('deptId')
        return self


class CreateCustomDeptResponseBody(TeaModel):
    def __init__(
        self,
        success: bool = None,
        result: CreateCustomDeptResponseBodyResult = None,
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
            temp_model = CreateCustomDeptResponseBodyResult()
            self.result = temp_model.from_map(m['result'])
        return self


class CreateCustomDeptResponse(TeaModel):
    def __init__(
        self,
        headers: Dict[str, str] = None,
        body: CreateCustomDeptResponseBody = None,
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
            temp_model = CreateCustomDeptResponseBody()
            self.body = temp_model.from_map(m['body'])
        return self


class DeleteDeptHeaders(TeaModel):
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


class DeleteDeptRequest(TeaModel):
    def __init__(
        self,
        operator: str = None,
    ):
        # 钉钉企业管理员员工ID
        self.operator = operator

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.operator is not None:
            result['operator'] = self.operator
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        return self


class DeleteDeptResponseBody(TeaModel):
    def __init__(
        self,
        success: bool = None,
    ):
        # success
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class DeleteDeptResponse(TeaModel):
    def __init__(
        self,
        headers: Dict[str, str] = None,
        body: DeleteDeptResponseBody = None,
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
            temp_model = DeleteDeptResponseBody()
            self.body = temp_model.from_map(m['body'])
        return self


class DeleteStudentHeaders(TeaModel):
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


class DeleteStudentRequest(TeaModel):
    def __init__(
        self,
        operator: str = None,
    ):
        # 钉钉管理员员工ID
        self.operator = operator

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.operator is not None:
            result['operator'] = self.operator
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        return self


class DeleteStudentResponseBody(TeaModel):
    def __init__(
        self,
        success: bool = None,
    ):
        # success
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class DeleteStudentResponse(TeaModel):
    def __init__(
        self,
        headers: Dict[str, str] = None,
        body: DeleteStudentResponseBody = None,
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
            temp_model = DeleteStudentResponseBody()
            self.body = temp_model.from_map(m['body'])
        return self


class DeleteGuardianHeaders(TeaModel):
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


class DeleteGuardianRequest(TeaModel):
    def __init__(
        self,
        stu_id: str = None,
        operator: str = None,
    ):
        # 学生ID
        self.stu_id = stu_id
        # 钉钉企业管理员员工ID
        self.operator = operator

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.stu_id is not None:
            result['stuId'] = self.stu_id
        if self.operator is not None:
            result['operator'] = self.operator
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('stuId') is not None:
            self.stu_id = m.get('stuId')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        return self


class DeleteGuardianResponseBody(TeaModel):
    def __init__(
        self,
        success: bool = None,
    ):
        # success
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class DeleteGuardianResponse(TeaModel):
    def __init__(
        self,
        headers: Dict[str, str] = None,
        body: DeleteGuardianResponseBody = None,
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
            temp_model = DeleteGuardianResponseBody()
            self.body = temp_model.from_map(m['body'])
        return self


class CreateCustomClassHeaders(TeaModel):
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


class CreateCustomClassRequestCustomClass(TeaModel):
    def __init__(
        self,
        name: str = None,
    ):
        # 班级名称
        self.name = name

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class CreateCustomClassRequest(TeaModel):
    def __init__(
        self,
        custom_class: CreateCustomClassRequestCustomClass = None,
        super_id: int = None,
        operator: str = None,
        ding_isv_org_id: int = None,
        ding_corp_id: str = None,
        ding_oauth_app_id: int = None,
        ding_suite_key: str = None,
        ding_token_grant_type: int = None,
        ding_org_id: int = None,
    ):
        # 班级信息
        self.custom_class = custom_class
        # 上级部门ID
        self.super_id = super_id
        # 钉钉企业管理员工ID
        self.operator = operator
        self.ding_isv_org_id = ding_isv_org_id
        self.ding_corp_id = ding_corp_id
        self.ding_oauth_app_id = ding_oauth_app_id
        self.ding_suite_key = ding_suite_key
        self.ding_token_grant_type = ding_token_grant_type
        self.ding_org_id = ding_org_id

    def validate(self):
        if self.custom_class:
            self.custom_class.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.custom_class is not None:
            result['customClass'] = self.custom_class.to_map()
        if self.super_id is not None:
            result['superId'] = self.super_id
        if self.operator is not None:
            result['operator'] = self.operator
        if self.ding_isv_org_id is not None:
            result['dingIsvOrgId'] = self.ding_isv_org_id
        if self.ding_corp_id is not None:
            result['dingCorpId'] = self.ding_corp_id
        if self.ding_oauth_app_id is not None:
            result['dingOauthAppId'] = self.ding_oauth_app_id
        if self.ding_suite_key is not None:
            result['dingSuiteKey'] = self.ding_suite_key
        if self.ding_token_grant_type is not None:
            result['dingTokenGrantType'] = self.ding_token_grant_type
        if self.ding_org_id is not None:
            result['dingOrgId'] = self.ding_org_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('customClass') is not None:
            temp_model = CreateCustomClassRequestCustomClass()
            self.custom_class = temp_model.from_map(m['customClass'])
        if m.get('superId') is not None:
            self.super_id = m.get('superId')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('dingIsvOrgId') is not None:
            self.ding_isv_org_id = m.get('dingIsvOrgId')
        if m.get('dingCorpId') is not None:
            self.ding_corp_id = m.get('dingCorpId')
        if m.get('dingOauthAppId') is not None:
            self.ding_oauth_app_id = m.get('dingOauthAppId')
        if m.get('dingSuiteKey') is not None:
            self.ding_suite_key = m.get('dingSuiteKey')
        if m.get('dingTokenGrantType') is not None:
            self.ding_token_grant_type = m.get('dingTokenGrantType')
        if m.get('dingOrgId') is not None:
            self.ding_org_id = m.get('dingOrgId')
        return self


class CreateCustomClassResponseBodyResult(TeaModel):
    def __init__(
        self,
        dept_id: int = None,
    ):
        # 班级ID
        self.dept_id = dept_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.dept_id is not None:
            result['deptId'] = self.dept_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('deptId') is not None:
            self.dept_id = m.get('deptId')
        return self


class CreateCustomClassResponseBody(TeaModel):
    def __init__(
        self,
        result: CreateCustomClassResponseBodyResult = None,
        success: bool = None,
    ):
        # result
        self.result = result
        # success
        self.success = success

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.result is not None:
            result['result'] = self.result.to_map()
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('result') is not None:
            temp_model = CreateCustomClassResponseBodyResult()
            self.result = temp_model.from_map(m['result'])
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class CreateCustomClassResponse(TeaModel):
    def __init__(
        self,
        headers: Dict[str, str] = None,
        body: CreateCustomClassResponseBody = None,
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
            temp_model = CreateCustomClassResponseBody()
            self.body = temp_model.from_map(m['body'])
        return self


class DeleteTeacherHeaders(TeaModel):
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


class DeleteTeacherRequest(TeaModel):
    def __init__(
        self,
        adviser: int = None,
        operator: str = None,
    ):
        # 是否班主任；1:班主任；0:非班主任
        self.adviser = adviser
        # 钉钉企业管理员员工ID
        self.operator = operator

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.adviser is not None:
            result['adviser'] = self.adviser
        if self.operator is not None:
            result['operator'] = self.operator
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('adviser') is not None:
            self.adviser = m.get('adviser')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        return self


class DeleteTeacherResponseBody(TeaModel):
    def __init__(
        self,
        success: bool = None,
    ):
        # success
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class DeleteTeacherResponse(TeaModel):
    def __init__(
        self,
        headers: Dict[str, str] = None,
        body: DeleteTeacherResponseBody = None,
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
            temp_model = DeleteTeacherResponseBody()
            self.body = temp_model.from_map(m['body'])
        return self


class GetShareRoleMembersHeaders(TeaModel):
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


class GetShareRoleMembersResponseBodyResult(TeaModel):
    def __init__(
        self,
        corp_id: str = None,
        member_user_id_list_in_trunk_org: List[str] = None,
    ):
        # 分支组织corpId
        self.corp_id = corp_id
        # 角色成员在主干组织中的userId列表
        self.member_user_id_list_in_trunk_org = member_user_id_list_in_trunk_org

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.corp_id is not None:
            result['corpId'] = self.corp_id
        if self.member_user_id_list_in_trunk_org is not None:
            result['memberUserIdListInTrunkOrg'] = self.member_user_id_list_in_trunk_org
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('corpId') is not None:
            self.corp_id = m.get('corpId')
        if m.get('memberUserIdListInTrunkOrg') is not None:
            self.member_user_id_list_in_trunk_org = m.get('memberUserIdListInTrunkOrg')
        return self


class GetShareRoleMembersResponseBody(TeaModel):
    def __init__(
        self,
        result: List[GetShareRoleMembersResponseBodyResult] = None,
    ):
        self.result = result

    def validate(self):
        if self.result:
            for k in self.result:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.result = []
        if m.get('result') is not None:
            for k in m.get('result'):
                temp_model = GetShareRoleMembersResponseBodyResult()
                self.result.append(temp_model.from_map(k))
        return self


class GetShareRoleMembersResponse(TeaModel):
    def __init__(
        self,
        headers: Dict[str, str] = None,
        body: GetShareRoleMembersResponseBody = None,
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
            temp_model = GetShareRoleMembersResponseBody()
            self.body = temp_model.from_map(m['body'])
        return self


