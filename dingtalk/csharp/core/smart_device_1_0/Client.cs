// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AlibabaCloud.SDK.Dingtalksmart_device_1_0.Models;

namespace AlibabaCloud.SDK.Dingtalksmart_device_1_0
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


        public AddDeviceVideoConferenceMembersResponse AddDeviceVideoConferenceMembers(string deviceId, string conferenceId, AddDeviceVideoConferenceMembersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            AddDeviceVideoConferenceMembersHeaders headers = new AddDeviceVideoConferenceMembersHeaders();
            return AddDeviceVideoConferenceMembersWithOptions(deviceId, conferenceId, request, headers, runtime);
        }

        public async Task<AddDeviceVideoConferenceMembersResponse> AddDeviceVideoConferenceMembersAsync(string deviceId, string conferenceId, AddDeviceVideoConferenceMembersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            AddDeviceVideoConferenceMembersHeaders headers = new AddDeviceVideoConferenceMembersHeaders();
            return await AddDeviceVideoConferenceMembersWithOptionsAsync(deviceId, conferenceId, request, headers, runtime);
        }

        public AddDeviceVideoConferenceMembersResponse AddDeviceVideoConferenceMembersWithOptions(string deviceId, string conferenceId, AddDeviceVideoConferenceMembersRequest request, AddDeviceVideoConferenceMembersHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            deviceId = AlibabaCloud.OpenApiUtil.Client.GetEncodeParam(deviceId);
            conferenceId = AlibabaCloud.OpenApiUtil.Client.GetEncodeParam(conferenceId);
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UserIds))
            {
                body["userIds"] = request.UserIds;
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
            return TeaModel.ToObject<AddDeviceVideoConferenceMembersResponse>(DoROARequest("AddDeviceVideoConferenceMembers", "smartDevice_1.0", "HTTP", "POST", "AK", "/v1.0/smartDevice/devices/" + deviceId + "/videoConferences/" + conferenceId + "/members", "none", req, runtime));
        }

        public async Task<AddDeviceVideoConferenceMembersResponse> AddDeviceVideoConferenceMembersWithOptionsAsync(string deviceId, string conferenceId, AddDeviceVideoConferenceMembersRequest request, AddDeviceVideoConferenceMembersHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            deviceId = AlibabaCloud.OpenApiUtil.Client.GetEncodeParam(deviceId);
            conferenceId = AlibabaCloud.OpenApiUtil.Client.GetEncodeParam(conferenceId);
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UserIds))
            {
                body["userIds"] = request.UserIds;
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
            return TeaModel.ToObject<AddDeviceVideoConferenceMembersResponse>(await DoROARequestAsync("AddDeviceVideoConferenceMembers", "smartDevice_1.0", "HTTP", "POST", "AK", "/v1.0/smartDevice/devices/" + deviceId + "/videoConferences/" + conferenceId + "/members", "none", req, runtime));
        }

        public CreateDeviceVideoConferenceResponse CreateDeviceVideoConference(string deviceId, CreateDeviceVideoConferenceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            CreateDeviceVideoConferenceHeaders headers = new CreateDeviceVideoConferenceHeaders();
            return CreateDeviceVideoConferenceWithOptions(deviceId, request, headers, runtime);
        }

        public async Task<CreateDeviceVideoConferenceResponse> CreateDeviceVideoConferenceAsync(string deviceId, CreateDeviceVideoConferenceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            CreateDeviceVideoConferenceHeaders headers = new CreateDeviceVideoConferenceHeaders();
            return await CreateDeviceVideoConferenceWithOptionsAsync(deviceId, request, headers, runtime);
        }

        public CreateDeviceVideoConferenceResponse CreateDeviceVideoConferenceWithOptions(string deviceId, CreateDeviceVideoConferenceRequest request, CreateDeviceVideoConferenceHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            deviceId = AlibabaCloud.OpenApiUtil.Client.GetEncodeParam(deviceId);
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UserIds))
            {
                body["userIds"] = request.UserIds;
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
            return TeaModel.ToObject<CreateDeviceVideoConferenceResponse>(DoROARequest("CreateDeviceVideoConference", "smartDevice_1.0", "HTTP", "POST", "AK", "/v1.0/smartDevice/devices/" + deviceId + "/videoConferences", "json", req, runtime));
        }

        public async Task<CreateDeviceVideoConferenceResponse> CreateDeviceVideoConferenceWithOptionsAsync(string deviceId, CreateDeviceVideoConferenceRequest request, CreateDeviceVideoConferenceHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            deviceId = AlibabaCloud.OpenApiUtil.Client.GetEncodeParam(deviceId);
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UserIds))
            {
                body["userIds"] = request.UserIds;
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
            return TeaModel.ToObject<CreateDeviceVideoConferenceResponse>(await DoROARequestAsync("CreateDeviceVideoConference", "smartDevice_1.0", "HTTP", "POST", "AK", "/v1.0/smartDevice/devices/" + deviceId + "/videoConferences", "json", req, runtime));
        }

        public ExtractFacialFeatureResponse ExtractFacialFeature(ExtractFacialFeatureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            ExtractFacialFeatureHeaders headers = new ExtractFacialFeatureHeaders();
            return ExtractFacialFeatureWithOptions(request, headers, runtime);
        }

        public async Task<ExtractFacialFeatureResponse> ExtractFacialFeatureAsync(ExtractFacialFeatureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            ExtractFacialFeatureHeaders headers = new ExtractFacialFeatureHeaders();
            return await ExtractFacialFeatureWithOptionsAsync(request, headers, runtime);
        }

        public ExtractFacialFeatureResponse ExtractFacialFeatureWithOptions(ExtractFacialFeatureRequest request, ExtractFacialFeatureHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.MediaId))
            {
                body["mediaId"] = request.MediaId;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Userid))
            {
                body["userid"] = request.Userid;
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
            return TeaModel.ToObject<ExtractFacialFeatureResponse>(DoROARequest("ExtractFacialFeature", "smartDevice_1.0", "HTTP", "POST", "AK", "/v1.0/smartDevice/faceRecognitions/features/extract", "json", req, runtime));
        }

        public async Task<ExtractFacialFeatureResponse> ExtractFacialFeatureWithOptionsAsync(ExtractFacialFeatureRequest request, ExtractFacialFeatureHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.MediaId))
            {
                body["mediaId"] = request.MediaId;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Userid))
            {
                body["userid"] = request.Userid;
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
            return TeaModel.ToObject<ExtractFacialFeatureResponse>(await DoROARequestAsync("ExtractFacialFeature", "smartDevice_1.0", "HTTP", "POST", "AK", "/v1.0/smartDevice/faceRecognitions/features/extract", "json", req, runtime));
        }

        public KickDeviceVideoConferenceMembersResponse KickDeviceVideoConferenceMembers(string deviceId, string conferenceId, KickDeviceVideoConferenceMembersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            KickDeviceVideoConferenceMembersHeaders headers = new KickDeviceVideoConferenceMembersHeaders();
            return KickDeviceVideoConferenceMembersWithOptions(deviceId, conferenceId, request, headers, runtime);
        }

        public async Task<KickDeviceVideoConferenceMembersResponse> KickDeviceVideoConferenceMembersAsync(string deviceId, string conferenceId, KickDeviceVideoConferenceMembersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            KickDeviceVideoConferenceMembersHeaders headers = new KickDeviceVideoConferenceMembersHeaders();
            return await KickDeviceVideoConferenceMembersWithOptionsAsync(deviceId, conferenceId, request, headers, runtime);
        }

        public KickDeviceVideoConferenceMembersResponse KickDeviceVideoConferenceMembersWithOptions(string deviceId, string conferenceId, KickDeviceVideoConferenceMembersRequest request, KickDeviceVideoConferenceMembersHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            deviceId = AlibabaCloud.OpenApiUtil.Client.GetEncodeParam(deviceId);
            conferenceId = AlibabaCloud.OpenApiUtil.Client.GetEncodeParam(conferenceId);
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UserIds))
            {
                body["userIds"] = request.UserIds;
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
            return TeaModel.ToObject<KickDeviceVideoConferenceMembersResponse>(DoROARequest("KickDeviceVideoConferenceMembers", "smartDevice_1.0", "HTTP", "POST", "AK", "/v1.0/smartDevice/devices/" + deviceId + "/videoConferences/" + conferenceId + "/members/batchDelete", "none", req, runtime));
        }

        public async Task<KickDeviceVideoConferenceMembersResponse> KickDeviceVideoConferenceMembersWithOptionsAsync(string deviceId, string conferenceId, KickDeviceVideoConferenceMembersRequest request, KickDeviceVideoConferenceMembersHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            deviceId = AlibabaCloud.OpenApiUtil.Client.GetEncodeParam(deviceId);
            conferenceId = AlibabaCloud.OpenApiUtil.Client.GetEncodeParam(conferenceId);
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UserIds))
            {
                body["userIds"] = request.UserIds;
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
            return TeaModel.ToObject<KickDeviceVideoConferenceMembersResponse>(await DoROARequestAsync("KickDeviceVideoConferenceMembers", "smartDevice_1.0", "HTTP", "POST", "AK", "/v1.0/smartDevice/devices/" + deviceId + "/videoConferences/" + conferenceId + "/members/batchDelete", "none", req, runtime));
        }

        public MachineManagerUpdateResponse MachineManagerUpdate(MachineManagerUpdateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            MachineManagerUpdateHeaders headers = new MachineManagerUpdateHeaders();
            return MachineManagerUpdateWithOptions(request, headers, runtime);
        }

        public async Task<MachineManagerUpdateResponse> MachineManagerUpdateAsync(MachineManagerUpdateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            MachineManagerUpdateHeaders headers = new MachineManagerUpdateHeaders();
            return await MachineManagerUpdateWithOptionsAsync(request, headers, runtime);
        }

        public MachineManagerUpdateResponse MachineManagerUpdateWithOptions(MachineManagerUpdateRequest request, MachineManagerUpdateHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.AtmManagerRightMap.ToMap()))
            {
                body["atmManagerRightMap"] = request.AtmManagerRightMap;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.DeviceId))
            {
                body["deviceId"] = request.DeviceId;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.ScopeDeptIds))
            {
                body["scopeDeptIds"] = request.ScopeDeptIds;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UserId))
            {
                body["userId"] = request.UserId;
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
            return TeaModel.ToObject<MachineManagerUpdateResponse>(DoROARequest("MachineManagerUpdate", "smartDevice_1.0", "HTTP", "PUT", "AK", "/v1.0/smartDevice/atmachines/managers", "none", req, runtime));
        }

        public async Task<MachineManagerUpdateResponse> MachineManagerUpdateWithOptionsAsync(MachineManagerUpdateRequest request, MachineManagerUpdateHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.AtmManagerRightMap.ToMap()))
            {
                body["atmManagerRightMap"] = request.AtmManagerRightMap;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.DeviceId))
            {
                body["deviceId"] = request.DeviceId;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.ScopeDeptIds))
            {
                body["scopeDeptIds"] = request.ScopeDeptIds;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UserId))
            {
                body["userId"] = request.UserId;
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
            return TeaModel.ToObject<MachineManagerUpdateResponse>(await DoROARequestAsync("MachineManagerUpdate", "smartDevice_1.0", "HTTP", "PUT", "AK", "/v1.0/smartDevice/atmachines/managers", "none", req, runtime));
        }

        public MachineUsersUpdateResponse MachineUsersUpdate(MachineUsersUpdateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            MachineUsersUpdateHeaders headers = new MachineUsersUpdateHeaders();
            return MachineUsersUpdateWithOptions(request, headers, runtime);
        }

        public async Task<MachineUsersUpdateResponse> MachineUsersUpdateAsync(MachineUsersUpdateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            MachineUsersUpdateHeaders headers = new MachineUsersUpdateHeaders();
            return await MachineUsersUpdateWithOptionsAsync(request, headers, runtime);
        }

        public MachineUsersUpdateResponse MachineUsersUpdateWithOptions(MachineUsersUpdateRequest request, MachineUsersUpdateHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.AddDeptIds))
            {
                body["addDeptIds"] = request.AddDeptIds;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.AddUserIds))
            {
                body["addUserIds"] = request.AddUserIds;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.DelDeptIds))
            {
                body["delDeptIds"] = request.DelDeptIds;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.DelUserIds))
            {
                body["delUserIds"] = request.DelUserIds;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.DevIds))
            {
                body["devIds"] = request.DevIds;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.DeviceIds))
            {
                body["deviceIds"] = request.DeviceIds;
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
            return TeaModel.ToObject<MachineUsersUpdateResponse>(DoROARequest("MachineUsersUpdate", "smartDevice_1.0", "HTTP", "PUT", "AK", "/v1.0/smartDevice/atmachines/users", "none", req, runtime));
        }

        public async Task<MachineUsersUpdateResponse> MachineUsersUpdateWithOptionsAsync(MachineUsersUpdateRequest request, MachineUsersUpdateHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.AddDeptIds))
            {
                body["addDeptIds"] = request.AddDeptIds;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.AddUserIds))
            {
                body["addUserIds"] = request.AddUserIds;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.DelDeptIds))
            {
                body["delDeptIds"] = request.DelDeptIds;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.DelUserIds))
            {
                body["delUserIds"] = request.DelUserIds;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.DevIds))
            {
                body["devIds"] = request.DevIds;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.DeviceIds))
            {
                body["deviceIds"] = request.DeviceIds;
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
            return TeaModel.ToObject<MachineUsersUpdateResponse>(await DoROARequestAsync("MachineUsersUpdate", "smartDevice_1.0", "HTTP", "PUT", "AK", "/v1.0/smartDevice/atmachines/users", "none", req, runtime));
        }

        public QueryDeviceVideoConferenceBookResponse QueryDeviceVideoConferenceBook(string deviceId, string bookId)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            QueryDeviceVideoConferenceBookHeaders headers = new QueryDeviceVideoConferenceBookHeaders();
            return QueryDeviceVideoConferenceBookWithOptions(deviceId, bookId, headers, runtime);
        }

        public async Task<QueryDeviceVideoConferenceBookResponse> QueryDeviceVideoConferenceBookAsync(string deviceId, string bookId)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            QueryDeviceVideoConferenceBookHeaders headers = new QueryDeviceVideoConferenceBookHeaders();
            return await QueryDeviceVideoConferenceBookWithOptionsAsync(deviceId, bookId, headers, runtime);
        }

        public QueryDeviceVideoConferenceBookResponse QueryDeviceVideoConferenceBookWithOptions(string deviceId, string bookId, QueryDeviceVideoConferenceBookHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            deviceId = AlibabaCloud.OpenApiUtil.Client.GetEncodeParam(deviceId);
            bookId = AlibabaCloud.OpenApiUtil.Client.GetEncodeParam(bookId);
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
            };
            return TeaModel.ToObject<QueryDeviceVideoConferenceBookResponse>(DoROARequest("QueryDeviceVideoConferenceBook", "smartDevice_1.0", "HTTP", "GET", "AK", "/v1.0/smartDevice/devices/" + deviceId + "/books/" + bookId, "json", req, runtime));
        }

        public async Task<QueryDeviceVideoConferenceBookResponse> QueryDeviceVideoConferenceBookWithOptionsAsync(string deviceId, string bookId, QueryDeviceVideoConferenceBookHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            deviceId = AlibabaCloud.OpenApiUtil.Client.GetEncodeParam(deviceId);
            bookId = AlibabaCloud.OpenApiUtil.Client.GetEncodeParam(bookId);
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
            };
            return TeaModel.ToObject<QueryDeviceVideoConferenceBookResponse>(await DoROARequestAsync("QueryDeviceVideoConferenceBook", "smartDevice_1.0", "HTTP", "GET", "AK", "/v1.0/smartDevice/devices/" + deviceId + "/books/" + bookId, "json", req, runtime));
        }

    }
}
