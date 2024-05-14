// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AlibabaCloud.SDK.Dingtalkstorage_1_0.Models;

namespace AlibabaCloud.SDK.Dingtalkstorage_1_0
{
    public class Client : AlibabaCloud.OpenApiClient.Client
    {
        protected AlibabaCloud.GatewaySpi.Client _client;

        public Client(AlibabaCloud.OpenApiClient.Models.Config config): base(config)
        {
            this._client = new AlibabaCloud.GatewayDingTalk.Client();
            this._spi = _client;
            this._endpointRule = "";
            if (AlibabaCloud.TeaUtil.Common.Empty(_endpoint))
            {
                this._endpoint = "api.dingtalk.com";
            }
        }


        /**
         * @summary 添加文件夹
         *
         * @param request AddFolderRequest
         * @param headers AddFolderHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return AddFolderResponse
         */
        public AddFolderResponse AddFolderWithOptions(string spaceId, string parentId, AddFolderRequest request, AddFolderHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Name))
            {
                body["name"] = request.Name;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "AddFolder",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + parentId + "/folders",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<AddFolderResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 添加文件夹
         *
         * @param request AddFolderRequest
         * @param headers AddFolderHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return AddFolderResponse
         */
        public async Task<AddFolderResponse> AddFolderWithOptionsAsync(string spaceId, string parentId, AddFolderRequest request, AddFolderHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Name))
            {
                body["name"] = request.Name;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "AddFolder",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + parentId + "/folders",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<AddFolderResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 添加文件夹
         *
         * @param request AddFolderRequest
         * @return AddFolderResponse
         */
        public AddFolderResponse AddFolder(string spaceId, string parentId, AddFolderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            AddFolderHeaders headers = new AddFolderHeaders();
            return AddFolderWithOptions(spaceId, parentId, request, headers, runtime);
        }

        /**
         * @summary 添加文件夹
         *
         * @param request AddFolderRequest
         * @return AddFolderResponse
         */
        public async Task<AddFolderResponse> AddFolderAsync(string spaceId, string parentId, AddFolderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            AddFolderHeaders headers = new AddFolderHeaders();
            return await AddFolderWithOptionsAsync(spaceId, parentId, request, headers, runtime);
        }

        /**
         * @summary 添加权限
         *
         * @param request AddPermissionRequest
         * @param headers AddPermissionHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return AddPermissionResponse
         */
        public AddPermissionResponse AddPermissionWithOptions(string spaceId, string dentryId, AddPermissionRequest request, AddPermissionHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Members))
            {
                body["members"] = request.Members;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.RoleId))
            {
                body["roleId"] = request.RoleId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "AddPermission",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/permissions",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<AddPermissionResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 添加权限
         *
         * @param request AddPermissionRequest
         * @param headers AddPermissionHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return AddPermissionResponse
         */
        public async Task<AddPermissionResponse> AddPermissionWithOptionsAsync(string spaceId, string dentryId, AddPermissionRequest request, AddPermissionHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Members))
            {
                body["members"] = request.Members;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.RoleId))
            {
                body["roleId"] = request.RoleId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "AddPermission",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/permissions",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<AddPermissionResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 添加权限
         *
         * @param request AddPermissionRequest
         * @return AddPermissionResponse
         */
        public AddPermissionResponse AddPermission(string spaceId, string dentryId, AddPermissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            AddPermissionHeaders headers = new AddPermissionHeaders();
            return AddPermissionWithOptions(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 添加权限
         *
         * @param request AddPermissionRequest
         * @return AddPermissionResponse
         */
        public async Task<AddPermissionResponse> AddPermissionAsync(string spaceId, string dentryId, AddPermissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            AddPermissionHeaders headers = new AddPermissionHeaders();
            return await AddPermissionWithOptionsAsync(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 添加空间
         *
         * @param request AddSpaceRequest
         * @param headers AddSpaceHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return AddSpaceResponse
         */
        public AddSpaceResponse AddSpaceWithOptions(AddSpaceRequest request, AddSpaceHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "AddSpace",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<AddSpaceResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 添加空间
         *
         * @param request AddSpaceRequest
         * @param headers AddSpaceHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return AddSpaceResponse
         */
        public async Task<AddSpaceResponse> AddSpaceWithOptionsAsync(AddSpaceRequest request, AddSpaceHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "AddSpace",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<AddSpaceResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 添加空间
         *
         * @param request AddSpaceRequest
         * @return AddSpaceResponse
         */
        public AddSpaceResponse AddSpace(AddSpaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            AddSpaceHeaders headers = new AddSpaceHeaders();
            return AddSpaceWithOptions(request, headers, runtime);
        }

        /**
         * @summary 添加空间
         *
         * @param request AddSpaceRequest
         * @return AddSpaceResponse
         */
        public async Task<AddSpaceResponse> AddSpaceAsync(AddSpaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            AddSpaceHeaders headers = new AddSpaceHeaders();
            return await AddSpaceWithOptionsAsync(request, headers, runtime);
        }

        /**
         * @summary 清空回收站
         *
         * @param request ClearRecycleBinRequest
         * @param headers ClearRecycleBinHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return ClearRecycleBinResponse
         */
        public ClearRecycleBinResponse ClearRecycleBinWithOptions(string recycleBinId, ClearRecycleBinRequest request, ClearRecycleBinHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "ClearRecycleBin",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/recycleBins/" + recycleBinId + "/clear",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<ClearRecycleBinResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 清空回收站
         *
         * @param request ClearRecycleBinRequest
         * @param headers ClearRecycleBinHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return ClearRecycleBinResponse
         */
        public async Task<ClearRecycleBinResponse> ClearRecycleBinWithOptionsAsync(string recycleBinId, ClearRecycleBinRequest request, ClearRecycleBinHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "ClearRecycleBin",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/recycleBins/" + recycleBinId + "/clear",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<ClearRecycleBinResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 清空回收站
         *
         * @param request ClearRecycleBinRequest
         * @return ClearRecycleBinResponse
         */
        public ClearRecycleBinResponse ClearRecycleBin(string recycleBinId, ClearRecycleBinRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            ClearRecycleBinHeaders headers = new ClearRecycleBinHeaders();
            return ClearRecycleBinWithOptions(recycleBinId, request, headers, runtime);
        }

        /**
         * @summary 清空回收站
         *
         * @param request ClearRecycleBinRequest
         * @return ClearRecycleBinResponse
         */
        public async Task<ClearRecycleBinResponse> ClearRecycleBinAsync(string recycleBinId, ClearRecycleBinRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            ClearRecycleBinHeaders headers = new ClearRecycleBinHeaders();
            return await ClearRecycleBinWithOptionsAsync(recycleBinId, request, headers, runtime);
        }

        /**
         * @summary 提交文件
         *
         * @param request CommitFileRequest
         * @param headers CommitFileHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return CommitFileResponse
         */
        public CommitFileResponse CommitFileWithOptions(string spaceId, CommitFileRequest request, CommitFileHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Name))
            {
                body["name"] = request.Name;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.ParentId))
            {
                body["parentId"] = request.ParentId;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UploadKey))
            {
                body["uploadKey"] = request.UploadKey;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "CommitFile",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/files/commit",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<CommitFileResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 提交文件
         *
         * @param request CommitFileRequest
         * @param headers CommitFileHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return CommitFileResponse
         */
        public async Task<CommitFileResponse> CommitFileWithOptionsAsync(string spaceId, CommitFileRequest request, CommitFileHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Name))
            {
                body["name"] = request.Name;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.ParentId))
            {
                body["parentId"] = request.ParentId;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UploadKey))
            {
                body["uploadKey"] = request.UploadKey;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "CommitFile",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/files/commit",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<CommitFileResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 提交文件
         *
         * @param request CommitFileRequest
         * @return CommitFileResponse
         */
        public CommitFileResponse CommitFile(string spaceId, CommitFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            CommitFileHeaders headers = new CommitFileHeaders();
            return CommitFileWithOptions(spaceId, request, headers, runtime);
        }

        /**
         * @summary 提交文件
         *
         * @param request CommitFileRequest
         * @return CommitFileResponse
         */
        public async Task<CommitFileResponse> CommitFileAsync(string spaceId, CommitFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            CommitFileHeaders headers = new CommitFileHeaders();
            return await CommitFileWithOptionsAsync(spaceId, request, headers, runtime);
        }

        /**
         * @summary 批量拷贝文件或文件夹
         *
         * @param request CopyDentriesRequest
         * @param headers CopyDentriesHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return CopyDentriesResponse
         */
        public CopyDentriesResponse CopyDentriesWithOptions(string spaceId, CopyDentriesRequest request, CopyDentriesHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.DentryIds))
            {
                body["dentryIds"] = request.DentryIds;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.TargetFolderId))
            {
                body["targetFolderId"] = request.TargetFolderId;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.TargetSpaceId))
            {
                body["targetSpaceId"] = request.TargetSpaceId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "CopyDentries",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/batchCopy",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<CopyDentriesResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 批量拷贝文件或文件夹
         *
         * @param request CopyDentriesRequest
         * @param headers CopyDentriesHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return CopyDentriesResponse
         */
        public async Task<CopyDentriesResponse> CopyDentriesWithOptionsAsync(string spaceId, CopyDentriesRequest request, CopyDentriesHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.DentryIds))
            {
                body["dentryIds"] = request.DentryIds;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.TargetFolderId))
            {
                body["targetFolderId"] = request.TargetFolderId;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.TargetSpaceId))
            {
                body["targetSpaceId"] = request.TargetSpaceId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "CopyDentries",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/batchCopy",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<CopyDentriesResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 批量拷贝文件或文件夹
         *
         * @param request CopyDentriesRequest
         * @return CopyDentriesResponse
         */
        public CopyDentriesResponse CopyDentries(string spaceId, CopyDentriesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            CopyDentriesHeaders headers = new CopyDentriesHeaders();
            return CopyDentriesWithOptions(spaceId, request, headers, runtime);
        }

        /**
         * @summary 批量拷贝文件或文件夹
         *
         * @param request CopyDentriesRequest
         * @return CopyDentriesResponse
         */
        public async Task<CopyDentriesResponse> CopyDentriesAsync(string spaceId, CopyDentriesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            CopyDentriesHeaders headers = new CopyDentriesHeaders();
            return await CopyDentriesWithOptionsAsync(spaceId, request, headers, runtime);
        }

        /**
         * @summary 拷贝文件或文件夹
         *
         * @param request CopyDentryRequest
         * @param headers CopyDentryHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return CopyDentryResponse
         */
        public CopyDentryResponse CopyDentryWithOptions(string spaceId, string dentryId, CopyDentryRequest request, CopyDentryHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.TargetFolderId))
            {
                body["targetFolderId"] = request.TargetFolderId;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.TargetSpaceId))
            {
                body["targetSpaceId"] = request.TargetSpaceId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "CopyDentry",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/copy",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<CopyDentryResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 拷贝文件或文件夹
         *
         * @param request CopyDentryRequest
         * @param headers CopyDentryHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return CopyDentryResponse
         */
        public async Task<CopyDentryResponse> CopyDentryWithOptionsAsync(string spaceId, string dentryId, CopyDentryRequest request, CopyDentryHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.TargetFolderId))
            {
                body["targetFolderId"] = request.TargetFolderId;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.TargetSpaceId))
            {
                body["targetSpaceId"] = request.TargetSpaceId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "CopyDentry",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/copy",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<CopyDentryResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 拷贝文件或文件夹
         *
         * @param request CopyDentryRequest
         * @return CopyDentryResponse
         */
        public CopyDentryResponse CopyDentry(string spaceId, string dentryId, CopyDentryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            CopyDentryHeaders headers = new CopyDentryHeaders();
            return CopyDentryWithOptions(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 拷贝文件或文件夹
         *
         * @param request CopyDentryRequest
         * @return CopyDentryResponse
         */
        public async Task<CopyDentryResponse> CopyDentryAsync(string spaceId, string dentryId, CopyDentryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            CopyDentryHeaders headers = new CopyDentryHeaders();
            return await CopyDentryWithOptionsAsync(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 批量删除文件或文件夹
         *
         * @param request DeleteDentriesRequest
         * @param headers DeleteDentriesHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return DeleteDentriesResponse
         */
        public DeleteDentriesResponse DeleteDentriesWithOptions(string spaceId, DeleteDentriesRequest request, DeleteDentriesHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.DentryIds))
            {
                body["dentryIds"] = request.DentryIds;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "DeleteDentries",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/batchRemove",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<DeleteDentriesResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 批量删除文件或文件夹
         *
         * @param request DeleteDentriesRequest
         * @param headers DeleteDentriesHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return DeleteDentriesResponse
         */
        public async Task<DeleteDentriesResponse> DeleteDentriesWithOptionsAsync(string spaceId, DeleteDentriesRequest request, DeleteDentriesHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.DentryIds))
            {
                body["dentryIds"] = request.DentryIds;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "DeleteDentries",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/batchRemove",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<DeleteDentriesResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 批量删除文件或文件夹
         *
         * @param request DeleteDentriesRequest
         * @return DeleteDentriesResponse
         */
        public DeleteDentriesResponse DeleteDentries(string spaceId, DeleteDentriesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            DeleteDentriesHeaders headers = new DeleteDentriesHeaders();
            return DeleteDentriesWithOptions(spaceId, request, headers, runtime);
        }

        /**
         * @summary 批量删除文件或文件夹
         *
         * @param request DeleteDentriesRequest
         * @return DeleteDentriesResponse
         */
        public async Task<DeleteDentriesResponse> DeleteDentriesAsync(string spaceId, DeleteDentriesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            DeleteDentriesHeaders headers = new DeleteDentriesHeaders();
            return await DeleteDentriesWithOptionsAsync(spaceId, request, headers, runtime);
        }

        /**
         * @summary 删除文件或文件夹
         *
         * @param request DeleteDentryRequest
         * @param headers DeleteDentryHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return DeleteDentryResponse
         */
        public DeleteDentryResponse DeleteDentryWithOptions(string spaceId, string dentryId, DeleteDentryRequest request, DeleteDentryHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.ToRecycleBin))
            {
                query["toRecycleBin"] = request.ToRecycleBin;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "DeleteDentry",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId,
                Method = "DELETE",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<DeleteDentryResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 删除文件或文件夹
         *
         * @param request DeleteDentryRequest
         * @param headers DeleteDentryHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return DeleteDentryResponse
         */
        public async Task<DeleteDentryResponse> DeleteDentryWithOptionsAsync(string spaceId, string dentryId, DeleteDentryRequest request, DeleteDentryHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.ToRecycleBin))
            {
                query["toRecycleBin"] = request.ToRecycleBin;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "DeleteDentry",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId,
                Method = "DELETE",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<DeleteDentryResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 删除文件或文件夹
         *
         * @param request DeleteDentryRequest
         * @return DeleteDentryResponse
         */
        public DeleteDentryResponse DeleteDentry(string spaceId, string dentryId, DeleteDentryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            DeleteDentryHeaders headers = new DeleteDentryHeaders();
            return DeleteDentryWithOptions(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 删除文件或文件夹
         *
         * @param request DeleteDentryRequest
         * @return DeleteDentryResponse
         */
        public async Task<DeleteDentryResponse> DeleteDentryAsync(string spaceId, string dentryId, DeleteDentryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            DeleteDentryHeaders headers = new DeleteDentryHeaders();
            return await DeleteDentryWithOptionsAsync(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 删除文件上的App属性值
         *
         * @param request DeleteDentryAppPropertiesRequest
         * @param headers DeleteDentryAppPropertiesHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return DeleteDentryAppPropertiesResponse
         */
        public DeleteDentryAppPropertiesResponse DeleteDentryAppPropertiesWithOptions(string spaceId, string dentryId, DeleteDentryAppPropertiesRequest request, DeleteDentryAppPropertiesHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.PropertyNames))
            {
                body["propertyNames"] = request.PropertyNames;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "DeleteDentryAppProperties",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/appProperties/remove",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<DeleteDentryAppPropertiesResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 删除文件上的App属性值
         *
         * @param request DeleteDentryAppPropertiesRequest
         * @param headers DeleteDentryAppPropertiesHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return DeleteDentryAppPropertiesResponse
         */
        public async Task<DeleteDentryAppPropertiesResponse> DeleteDentryAppPropertiesWithOptionsAsync(string spaceId, string dentryId, DeleteDentryAppPropertiesRequest request, DeleteDentryAppPropertiesHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.PropertyNames))
            {
                body["propertyNames"] = request.PropertyNames;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "DeleteDentryAppProperties",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/appProperties/remove",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<DeleteDentryAppPropertiesResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 删除文件上的App属性值
         *
         * @param request DeleteDentryAppPropertiesRequest
         * @return DeleteDentryAppPropertiesResponse
         */
        public DeleteDentryAppPropertiesResponse DeleteDentryAppProperties(string spaceId, string dentryId, DeleteDentryAppPropertiesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            DeleteDentryAppPropertiesHeaders headers = new DeleteDentryAppPropertiesHeaders();
            return DeleteDentryAppPropertiesWithOptions(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 删除文件上的App属性值
         *
         * @param request DeleteDentryAppPropertiesRequest
         * @return DeleteDentryAppPropertiesResponse
         */
        public async Task<DeleteDentryAppPropertiesResponse> DeleteDentryAppPropertiesAsync(string spaceId, string dentryId, DeleteDentryAppPropertiesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            DeleteDentryAppPropertiesHeaders headers = new DeleteDentryAppPropertiesHeaders();
            return await DeleteDentryAppPropertiesWithOptionsAsync(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 删除权限
         *
         * @param request DeletePermissionRequest
         * @param headers DeletePermissionHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return DeletePermissionResponse
         */
        public DeletePermissionResponse DeletePermissionWithOptions(string spaceId, string dentryId, DeletePermissionRequest request, DeletePermissionHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Members))
            {
                body["members"] = request.Members;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.RoleId))
            {
                body["roleId"] = request.RoleId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "DeletePermission",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/permissions/remove",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<DeletePermissionResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 删除权限
         *
         * @param request DeletePermissionRequest
         * @param headers DeletePermissionHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return DeletePermissionResponse
         */
        public async Task<DeletePermissionResponse> DeletePermissionWithOptionsAsync(string spaceId, string dentryId, DeletePermissionRequest request, DeletePermissionHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Members))
            {
                body["members"] = request.Members;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.RoleId))
            {
                body["roleId"] = request.RoleId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "DeletePermission",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/permissions/remove",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<DeletePermissionResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 删除权限
         *
         * @param request DeletePermissionRequest
         * @return DeletePermissionResponse
         */
        public DeletePermissionResponse DeletePermission(string spaceId, string dentryId, DeletePermissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            DeletePermissionHeaders headers = new DeletePermissionHeaders();
            return DeletePermissionWithOptions(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 删除权限
         *
         * @param request DeletePermissionRequest
         * @return DeletePermissionResponse
         */
        public async Task<DeletePermissionResponse> DeletePermissionAsync(string spaceId, string dentryId, DeletePermissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            DeletePermissionHeaders headers = new DeletePermissionHeaders();
            return await DeletePermissionWithOptionsAsync(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 删除回收项, 删除之后该记录从回收站删除, 后续文件就无法恢复了
         *
         * @param request DeleteRecycleItemRequest
         * @param headers DeleteRecycleItemHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return DeleteRecycleItemResponse
         */
        public DeleteRecycleItemResponse DeleteRecycleItemWithOptions(string recycleBinId, string recycleItemId, DeleteRecycleItemRequest request, DeleteRecycleItemHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "DeleteRecycleItem",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/recycleBins/" + recycleBinId + "/recycleItems/" + recycleItemId,
                Method = "DELETE",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<DeleteRecycleItemResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 删除回收项, 删除之后该记录从回收站删除, 后续文件就无法恢复了
         *
         * @param request DeleteRecycleItemRequest
         * @param headers DeleteRecycleItemHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return DeleteRecycleItemResponse
         */
        public async Task<DeleteRecycleItemResponse> DeleteRecycleItemWithOptionsAsync(string recycleBinId, string recycleItemId, DeleteRecycleItemRequest request, DeleteRecycleItemHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "DeleteRecycleItem",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/recycleBins/" + recycleBinId + "/recycleItems/" + recycleItemId,
                Method = "DELETE",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<DeleteRecycleItemResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 删除回收项, 删除之后该记录从回收站删除, 后续文件就无法恢复了
         *
         * @param request DeleteRecycleItemRequest
         * @return DeleteRecycleItemResponse
         */
        public DeleteRecycleItemResponse DeleteRecycleItem(string recycleBinId, string recycleItemId, DeleteRecycleItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            DeleteRecycleItemHeaders headers = new DeleteRecycleItemHeaders();
            return DeleteRecycleItemWithOptions(recycleBinId, recycleItemId, request, headers, runtime);
        }

        /**
         * @summary 删除回收项, 删除之后该记录从回收站删除, 后续文件就无法恢复了
         *
         * @param request DeleteRecycleItemRequest
         * @return DeleteRecycleItemResponse
         */
        public async Task<DeleteRecycleItemResponse> DeleteRecycleItemAsync(string recycleBinId, string recycleItemId, DeleteRecycleItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            DeleteRecycleItemHeaders headers = new DeleteRecycleItemHeaders();
            return await DeleteRecycleItemWithOptionsAsync(recycleBinId, recycleItemId, request, headers, runtime);
        }

        /**
         * @summary 批量删除回收项, 删除之后该记录从回收站删除, 后续文件就无法恢复了
         *
         * @param request DeleteRecycleItemsRequest
         * @param headers DeleteRecycleItemsHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return DeleteRecycleItemsResponse
         */
        public DeleteRecycleItemsResponse DeleteRecycleItemsWithOptions(string recycleBinId, DeleteRecycleItemsRequest request, DeleteRecycleItemsHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.RecycleItemIds))
            {
                body["recycleItemIds"] = request.RecycleItemIds;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "DeleteRecycleItems",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/recycleBins/" + recycleBinId + "/recycleItems/batchRemove",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<DeleteRecycleItemsResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 批量删除回收项, 删除之后该记录从回收站删除, 后续文件就无法恢复了
         *
         * @param request DeleteRecycleItemsRequest
         * @param headers DeleteRecycleItemsHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return DeleteRecycleItemsResponse
         */
        public async Task<DeleteRecycleItemsResponse> DeleteRecycleItemsWithOptionsAsync(string recycleBinId, DeleteRecycleItemsRequest request, DeleteRecycleItemsHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.RecycleItemIds))
            {
                body["recycleItemIds"] = request.RecycleItemIds;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "DeleteRecycleItems",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/recycleBins/" + recycleBinId + "/recycleItems/batchRemove",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<DeleteRecycleItemsResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 批量删除回收项, 删除之后该记录从回收站删除, 后续文件就无法恢复了
         *
         * @param request DeleteRecycleItemsRequest
         * @return DeleteRecycleItemsResponse
         */
        public DeleteRecycleItemsResponse DeleteRecycleItems(string recycleBinId, DeleteRecycleItemsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            DeleteRecycleItemsHeaders headers = new DeleteRecycleItemsHeaders();
            return DeleteRecycleItemsWithOptions(recycleBinId, request, headers, runtime);
        }

        /**
         * @summary 批量删除回收项, 删除之后该记录从回收站删除, 后续文件就无法恢复了
         *
         * @param request DeleteRecycleItemsRequest
         * @return DeleteRecycleItemsResponse
         */
        public async Task<DeleteRecycleItemsResponse> DeleteRecycleItemsAsync(string recycleBinId, DeleteRecycleItemsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            DeleteRecycleItemsHeaders headers = new DeleteRecycleItemsHeaders();
            return await DeleteRecycleItemsWithOptionsAsync(recycleBinId, request, headers, runtime);
        }

        /**
         * @summary 获取开放平台应用在企业存储中的相关应用信息
         *
         * @param request GetCurrentAppRequest
         * @param headers GetCurrentAppHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return GetCurrentAppResponse
         */
        public GetCurrentAppResponse GetCurrentAppWithOptions(GetCurrentAppRequest request, GetCurrentAppHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "GetCurrentApp",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/currentApps/query",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<GetCurrentAppResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 获取开放平台应用在企业存储中的相关应用信息
         *
         * @param request GetCurrentAppRequest
         * @param headers GetCurrentAppHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return GetCurrentAppResponse
         */
        public async Task<GetCurrentAppResponse> GetCurrentAppWithOptionsAsync(GetCurrentAppRequest request, GetCurrentAppHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "GetCurrentApp",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/currentApps/query",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<GetCurrentAppResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 获取开放平台应用在企业存储中的相关应用信息
         *
         * @param request GetCurrentAppRequest
         * @return GetCurrentAppResponse
         */
        public GetCurrentAppResponse GetCurrentApp(GetCurrentAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            GetCurrentAppHeaders headers = new GetCurrentAppHeaders();
            return GetCurrentAppWithOptions(request, headers, runtime);
        }

        /**
         * @summary 获取开放平台应用在企业存储中的相关应用信息
         *
         * @param request GetCurrentAppRequest
         * @return GetCurrentAppResponse
         */
        public async Task<GetCurrentAppResponse> GetCurrentAppAsync(GetCurrentAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            GetCurrentAppHeaders headers = new GetCurrentAppHeaders();
            return await GetCurrentAppWithOptionsAsync(request, headers, runtime);
        }

        /**
         * @summary 批量获取文件(夹)信息
         *
         * @param request GetDentriesRequest
         * @param headers GetDentriesHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return GetDentriesResponse
         */
        public GetDentriesResponse GetDentriesWithOptions(string spaceId, GetDentriesRequest request, GetDentriesHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.DentryIds))
            {
                body["dentryIds"] = request.DentryIds;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "GetDentries",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/query",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<GetDentriesResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 批量获取文件(夹)信息
         *
         * @param request GetDentriesRequest
         * @param headers GetDentriesHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return GetDentriesResponse
         */
        public async Task<GetDentriesResponse> GetDentriesWithOptionsAsync(string spaceId, GetDentriesRequest request, GetDentriesHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.DentryIds))
            {
                body["dentryIds"] = request.DentryIds;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "GetDentries",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/query",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<GetDentriesResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 批量获取文件(夹)信息
         *
         * @param request GetDentriesRequest
         * @return GetDentriesResponse
         */
        public GetDentriesResponse GetDentries(string spaceId, GetDentriesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            GetDentriesHeaders headers = new GetDentriesHeaders();
            return GetDentriesWithOptions(spaceId, request, headers, runtime);
        }

        /**
         * @summary 批量获取文件(夹)信息
         *
         * @param request GetDentriesRequest
         * @return GetDentriesResponse
         */
        public async Task<GetDentriesResponse> GetDentriesAsync(string spaceId, GetDentriesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            GetDentriesHeaders headers = new GetDentriesHeaders();
            return await GetDentriesWithOptionsAsync(spaceId, request, headers, runtime);
        }

        /**
         * @summary 获取文件(夹)信息
         *
         * @param request GetDentryRequest
         * @param headers GetDentryHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return GetDentryResponse
         */
        public GetDentryResponse GetDentryWithOptions(string spaceId, string dentryId, GetDentryRequest request, GetDentryHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "GetDentry",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/query",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<GetDentryResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 获取文件(夹)信息
         *
         * @param request GetDentryRequest
         * @param headers GetDentryHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return GetDentryResponse
         */
        public async Task<GetDentryResponse> GetDentryWithOptionsAsync(string spaceId, string dentryId, GetDentryRequest request, GetDentryHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "GetDentry",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/query",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<GetDentryResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 获取文件(夹)信息
         *
         * @param request GetDentryRequest
         * @return GetDentryResponse
         */
        public GetDentryResponse GetDentry(string spaceId, string dentryId, GetDentryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            GetDentryHeaders headers = new GetDentryHeaders();
            return GetDentryWithOptions(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 获取文件(夹)信息
         *
         * @param request GetDentryRequest
         * @return GetDentryResponse
         */
        public async Task<GetDentryResponse> GetDentryAsync(string spaceId, string dentryId, GetDentryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            GetDentryHeaders headers = new GetDentryHeaders();
            return await GetDentryWithOptionsAsync(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 获取文件打开链接
         *
         * @param request GetDentryOpenInfoRequest
         * @param headers GetDentryOpenInfoHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return GetDentryOpenInfoResponse
         */
        public GetDentryOpenInfoResponse GetDentryOpenInfoWithOptions(string spaceId, string dentryId, GetDentryOpenInfoRequest request, GetDentryOpenInfoHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "GetDentryOpenInfo",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/openInfos/query",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<GetDentryOpenInfoResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 获取文件打开链接
         *
         * @param request GetDentryOpenInfoRequest
         * @param headers GetDentryOpenInfoHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return GetDentryOpenInfoResponse
         */
        public async Task<GetDentryOpenInfoResponse> GetDentryOpenInfoWithOptionsAsync(string spaceId, string dentryId, GetDentryOpenInfoRequest request, GetDentryOpenInfoHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "GetDentryOpenInfo",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/openInfos/query",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<GetDentryOpenInfoResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 获取文件打开链接
         *
         * @param request GetDentryOpenInfoRequest
         * @return GetDentryOpenInfoResponse
         */
        public GetDentryOpenInfoResponse GetDentryOpenInfo(string spaceId, string dentryId, GetDentryOpenInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            GetDentryOpenInfoHeaders headers = new GetDentryOpenInfoHeaders();
            return GetDentryOpenInfoWithOptions(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 获取文件打开链接
         *
         * @param request GetDentryOpenInfoRequest
         * @return GetDentryOpenInfoResponse
         */
        public async Task<GetDentryOpenInfoResponse> GetDentryOpenInfoAsync(string spaceId, string dentryId, GetDentryOpenInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            GetDentryOpenInfoHeaders headers = new GetDentryOpenInfoHeaders();
            return await GetDentryOpenInfoWithOptionsAsync(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 批量获取文件缩略图
         *
         * @param request GetDentryThumbnailsRequest
         * @param headers GetDentryThumbnailsHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return GetDentryThumbnailsResponse
         */
        public GetDentryThumbnailsResponse GetDentryThumbnailsWithOptions(string spaceId, GetDentryThumbnailsRequest request, GetDentryThumbnailsHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.DentryIds))
            {
                body["dentryIds"] = request.DentryIds;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "GetDentryThumbnails",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/thumbnails/query",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<GetDentryThumbnailsResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 批量获取文件缩略图
         *
         * @param request GetDentryThumbnailsRequest
         * @param headers GetDentryThumbnailsHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return GetDentryThumbnailsResponse
         */
        public async Task<GetDentryThumbnailsResponse> GetDentryThumbnailsWithOptionsAsync(string spaceId, GetDentryThumbnailsRequest request, GetDentryThumbnailsHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.DentryIds))
            {
                body["dentryIds"] = request.DentryIds;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "GetDentryThumbnails",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/thumbnails/query",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<GetDentryThumbnailsResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 批量获取文件缩略图
         *
         * @param request GetDentryThumbnailsRequest
         * @return GetDentryThumbnailsResponse
         */
        public GetDentryThumbnailsResponse GetDentryThumbnails(string spaceId, GetDentryThumbnailsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            GetDentryThumbnailsHeaders headers = new GetDentryThumbnailsHeaders();
            return GetDentryThumbnailsWithOptions(spaceId, request, headers, runtime);
        }

        /**
         * @summary 批量获取文件缩略图
         *
         * @param request GetDentryThumbnailsRequest
         * @return GetDentryThumbnailsResponse
         */
        public async Task<GetDentryThumbnailsResponse> GetDentryThumbnailsAsync(string spaceId, GetDentryThumbnailsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            GetDentryThumbnailsHeaders headers = new GetDentryThumbnailsHeaders();
            return await GetDentryThumbnailsWithOptionsAsync(spaceId, request, headers, runtime);
        }

        /**
         * @summary 获取文件下载信息
         *
         * @param request GetFileDownloadInfoRequest
         * @param headers GetFileDownloadInfoHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return GetFileDownloadInfoResponse
         */
        public GetFileDownloadInfoResponse GetFileDownloadInfoWithOptions(string spaceId, string dentryId, GetFileDownloadInfoRequest request, GetFileDownloadInfoHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "GetFileDownloadInfo",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/downloadInfos/query",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<GetFileDownloadInfoResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 获取文件下载信息
         *
         * @param request GetFileDownloadInfoRequest
         * @param headers GetFileDownloadInfoHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return GetFileDownloadInfoResponse
         */
        public async Task<GetFileDownloadInfoResponse> GetFileDownloadInfoWithOptionsAsync(string spaceId, string dentryId, GetFileDownloadInfoRequest request, GetFileDownloadInfoHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "GetFileDownloadInfo",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/downloadInfos/query",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<GetFileDownloadInfoResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 获取文件下载信息
         *
         * @param request GetFileDownloadInfoRequest
         * @return GetFileDownloadInfoResponse
         */
        public GetFileDownloadInfoResponse GetFileDownloadInfo(string spaceId, string dentryId, GetFileDownloadInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            GetFileDownloadInfoHeaders headers = new GetFileDownloadInfoHeaders();
            return GetFileDownloadInfoWithOptions(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 获取文件下载信息
         *
         * @param request GetFileDownloadInfoRequest
         * @return GetFileDownloadInfoResponse
         */
        public async Task<GetFileDownloadInfoResponse> GetFileDownloadInfoAsync(string spaceId, string dentryId, GetFileDownloadInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            GetFileDownloadInfoHeaders headers = new GetFileDownloadInfoHeaders();
            return await GetFileDownloadInfoWithOptionsAsync(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 获取文件上传信息
         *
         * @param request GetFileUploadInfoRequest
         * @param headers GetFileUploadInfoHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return GetFileUploadInfoResponse
         */
        public GetFileUploadInfoResponse GetFileUploadInfoWithOptions(string spaceId, GetFileUploadInfoRequest request, GetFileUploadInfoHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Multipart))
            {
                body["multipart"] = request.Multipart;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Protocol))
            {
                body["protocol"] = request.Protocol;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "GetFileUploadInfo",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/files/uploadInfos/query",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<GetFileUploadInfoResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 获取文件上传信息
         *
         * @param request GetFileUploadInfoRequest
         * @param headers GetFileUploadInfoHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return GetFileUploadInfoResponse
         */
        public async Task<GetFileUploadInfoResponse> GetFileUploadInfoWithOptionsAsync(string spaceId, GetFileUploadInfoRequest request, GetFileUploadInfoHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Multipart))
            {
                body["multipart"] = request.Multipart;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Protocol))
            {
                body["protocol"] = request.Protocol;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "GetFileUploadInfo",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/files/uploadInfos/query",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<GetFileUploadInfoResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 获取文件上传信息
         *
         * @param request GetFileUploadInfoRequest
         * @return GetFileUploadInfoResponse
         */
        public GetFileUploadInfoResponse GetFileUploadInfo(string spaceId, GetFileUploadInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            GetFileUploadInfoHeaders headers = new GetFileUploadInfoHeaders();
            return GetFileUploadInfoWithOptions(spaceId, request, headers, runtime);
        }

        /**
         * @summary 获取文件上传信息
         *
         * @param request GetFileUploadInfoRequest
         * @return GetFileUploadInfoResponse
         */
        public async Task<GetFileUploadInfoResponse> GetFileUploadInfoAsync(string spaceId, GetFileUploadInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            GetFileUploadInfoHeaders headers = new GetFileUploadInfoHeaders();
            return await GetFileUploadInfoWithOptionsAsync(spaceId, request, headers, runtime);
        }

        /**
         * @summary 获取文件上传信息(分片上传)
         *
         * @param request GetMultipartFileUploadInfosRequest
         * @param headers GetMultipartFileUploadInfosHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return GetMultipartFileUploadInfosResponse
         */
        public GetMultipartFileUploadInfosResponse GetMultipartFileUploadInfosWithOptions(GetMultipartFileUploadInfosRequest request, GetMultipartFileUploadInfosHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.PartNumbers))
            {
                body["partNumbers"] = request.PartNumbers;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UploadKey))
            {
                body["uploadKey"] = request.UploadKey;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "GetMultipartFileUploadInfos",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/files/multiPartUploadInfos/query",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<GetMultipartFileUploadInfosResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 获取文件上传信息(分片上传)
         *
         * @param request GetMultipartFileUploadInfosRequest
         * @param headers GetMultipartFileUploadInfosHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return GetMultipartFileUploadInfosResponse
         */
        public async Task<GetMultipartFileUploadInfosResponse> GetMultipartFileUploadInfosWithOptionsAsync(GetMultipartFileUploadInfosRequest request, GetMultipartFileUploadInfosHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.PartNumbers))
            {
                body["partNumbers"] = request.PartNumbers;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UploadKey))
            {
                body["uploadKey"] = request.UploadKey;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "GetMultipartFileUploadInfos",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/files/multiPartUploadInfos/query",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<GetMultipartFileUploadInfosResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 获取文件上传信息(分片上传)
         *
         * @param request GetMultipartFileUploadInfosRequest
         * @return GetMultipartFileUploadInfosResponse
         */
        public GetMultipartFileUploadInfosResponse GetMultipartFileUploadInfos(GetMultipartFileUploadInfosRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            GetMultipartFileUploadInfosHeaders headers = new GetMultipartFileUploadInfosHeaders();
            return GetMultipartFileUploadInfosWithOptions(request, headers, runtime);
        }

        /**
         * @summary 获取文件上传信息(分片上传)
         *
         * @param request GetMultipartFileUploadInfosRequest
         * @return GetMultipartFileUploadInfosResponse
         */
        public async Task<GetMultipartFileUploadInfosResponse> GetMultipartFileUploadInfosAsync(GetMultipartFileUploadInfosRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            GetMultipartFileUploadInfosHeaders headers = new GetMultipartFileUploadInfosHeaders();
            return await GetMultipartFileUploadInfosWithOptionsAsync(request, headers, runtime);
        }

        /**
         * @summary 获取企业存储中企业维度的信息
         *
         * @param request GetOrgRequest
         * @param headers GetOrgHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return GetOrgResponse
         */
        public GetOrgResponse GetOrgWithOptions(string corpId, GetOrgRequest request, GetOrgHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "GetOrg",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/orgs/" + corpId,
                Method = "GET",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<GetOrgResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 获取企业存储中企业维度的信息
         *
         * @param request GetOrgRequest
         * @param headers GetOrgHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return GetOrgResponse
         */
        public async Task<GetOrgResponse> GetOrgWithOptionsAsync(string corpId, GetOrgRequest request, GetOrgHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "GetOrg",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/orgs/" + corpId,
                Method = "GET",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<GetOrgResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 获取企业存储中企业维度的信息
         *
         * @param request GetOrgRequest
         * @return GetOrgResponse
         */
        public GetOrgResponse GetOrg(string corpId, GetOrgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            GetOrgHeaders headers = new GetOrgHeaders();
            return GetOrgWithOptions(corpId, request, headers, runtime);
        }

        /**
         * @summary 获取企业存储中企业维度的信息
         *
         * @param request GetOrgRequest
         * @return GetOrgResponse
         */
        public async Task<GetOrgResponse> GetOrgAsync(string corpId, GetOrgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            GetOrgHeaders headers = new GetOrgHeaders();
            return await GetOrgWithOptionsAsync(corpId, request, headers, runtime);
        }

        /**
         * @summary 获取回收站信息
         *
         * @param request GetRecycleBinRequest
         * @param headers GetRecycleBinHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return GetRecycleBinResponse
         */
        public GetRecycleBinResponse GetRecycleBinWithOptions(GetRecycleBinRequest request, GetRecycleBinHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.RecycleBinScope))
            {
                query["recycleBinScope"] = request.RecycleBinScope;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.ScopeId))
            {
                query["scopeId"] = request.ScopeId;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "GetRecycleBin",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/recycleBins",
                Method = "GET",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<GetRecycleBinResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 获取回收站信息
         *
         * @param request GetRecycleBinRequest
         * @param headers GetRecycleBinHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return GetRecycleBinResponse
         */
        public async Task<GetRecycleBinResponse> GetRecycleBinWithOptionsAsync(GetRecycleBinRequest request, GetRecycleBinHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.RecycleBinScope))
            {
                query["recycleBinScope"] = request.RecycleBinScope;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.ScopeId))
            {
                query["scopeId"] = request.ScopeId;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "GetRecycleBin",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/recycleBins",
                Method = "GET",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<GetRecycleBinResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 获取回收站信息
         *
         * @param request GetRecycleBinRequest
         * @return GetRecycleBinResponse
         */
        public GetRecycleBinResponse GetRecycleBin(GetRecycleBinRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            GetRecycleBinHeaders headers = new GetRecycleBinHeaders();
            return GetRecycleBinWithOptions(request, headers, runtime);
        }

        /**
         * @summary 获取回收站信息
         *
         * @param request GetRecycleBinRequest
         * @return GetRecycleBinResponse
         */
        public async Task<GetRecycleBinResponse> GetRecycleBinAsync(GetRecycleBinRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            GetRecycleBinHeaders headers = new GetRecycleBinHeaders();
            return await GetRecycleBinWithOptionsAsync(request, headers, runtime);
        }

        /**
         * @summary 获取回收项详情
         *
         * @param request GetRecycleItemRequest
         * @param headers GetRecycleItemHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return GetRecycleItemResponse
         */
        public GetRecycleItemResponse GetRecycleItemWithOptions(string recycleBinId, string recycleItemId, GetRecycleItemRequest request, GetRecycleItemHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "GetRecycleItem",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/recycleBins/" + recycleBinId + "/recycleItems/" + recycleItemId,
                Method = "GET",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<GetRecycleItemResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 获取回收项详情
         *
         * @param request GetRecycleItemRequest
         * @param headers GetRecycleItemHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return GetRecycleItemResponse
         */
        public async Task<GetRecycleItemResponse> GetRecycleItemWithOptionsAsync(string recycleBinId, string recycleItemId, GetRecycleItemRequest request, GetRecycleItemHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "GetRecycleItem",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/recycleBins/" + recycleBinId + "/recycleItems/" + recycleItemId,
                Method = "GET",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<GetRecycleItemResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 获取回收项详情
         *
         * @param request GetRecycleItemRequest
         * @return GetRecycleItemResponse
         */
        public GetRecycleItemResponse GetRecycleItem(string recycleBinId, string recycleItemId, GetRecycleItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            GetRecycleItemHeaders headers = new GetRecycleItemHeaders();
            return GetRecycleItemWithOptions(recycleBinId, recycleItemId, request, headers, runtime);
        }

        /**
         * @summary 获取回收项详情
         *
         * @param request GetRecycleItemRequest
         * @return GetRecycleItemResponse
         */
        public async Task<GetRecycleItemResponse> GetRecycleItemAsync(string recycleBinId, string recycleItemId, GetRecycleItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            GetRecycleItemHeaders headers = new GetRecycleItemHeaders();
            return await GetRecycleItemWithOptionsAsync(recycleBinId, recycleItemId, request, headers, runtime);
        }

        /**
         * @summary 获取空间信息
         *
         * @param request GetSpaceRequest
         * @param headers GetSpaceHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return GetSpaceResponse
         */
        public GetSpaceResponse GetSpaceWithOptions(string spaceId, GetSpaceRequest request, GetSpaceHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "GetSpace",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId,
                Method = "GET",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<GetSpaceResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 获取空间信息
         *
         * @param request GetSpaceRequest
         * @param headers GetSpaceHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return GetSpaceResponse
         */
        public async Task<GetSpaceResponse> GetSpaceWithOptionsAsync(string spaceId, GetSpaceRequest request, GetSpaceHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "GetSpace",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId,
                Method = "GET",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<GetSpaceResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 获取空间信息
         *
         * @param request GetSpaceRequest
         * @return GetSpaceResponse
         */
        public GetSpaceResponse GetSpace(string spaceId, GetSpaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            GetSpaceHeaders headers = new GetSpaceHeaders();
            return GetSpaceWithOptions(spaceId, request, headers, runtime);
        }

        /**
         * @summary 获取空间信息
         *
         * @param request GetSpaceRequest
         * @return GetSpaceResponse
         */
        public async Task<GetSpaceResponse> GetSpaceAsync(string spaceId, GetSpaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            GetSpaceHeaders headers = new GetSpaceHeaders();
            return await GetSpaceWithOptionsAsync(spaceId, request, headers, runtime);
        }

        /**
         * @summary 获取异步任务信息
         *
         * @param request GetTaskRequest
         * @param headers GetTaskHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return GetTaskResponse
         */
        public GetTaskResponse GetTaskWithOptions(string taskId, GetTaskRequest request, GetTaskHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "GetTask",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/tasks/" + taskId,
                Method = "GET",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<GetTaskResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 获取异步任务信息
         *
         * @param request GetTaskRequest
         * @param headers GetTaskHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return GetTaskResponse
         */
        public async Task<GetTaskResponse> GetTaskWithOptionsAsync(string taskId, GetTaskRequest request, GetTaskHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "GetTask",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/tasks/" + taskId,
                Method = "GET",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<GetTaskResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 获取异步任务信息
         *
         * @param request GetTaskRequest
         * @return GetTaskResponse
         */
        public GetTaskResponse GetTask(string taskId, GetTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            GetTaskHeaders headers = new GetTaskHeaders();
            return GetTaskWithOptions(taskId, request, headers, runtime);
        }

        /**
         * @summary 获取异步任务信息
         *
         * @param request GetTaskRequest
         * @return GetTaskResponse
         */
        public async Task<GetTaskResponse> GetTaskAsync(string taskId, GetTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            GetTaskHeaders headers = new GetTaskHeaders();
            return await GetTaskWithOptionsAsync(taskId, request, headers, runtime);
        }

        /**
         * @summary 初始化文件分片上传
         *
         * @param request InitMultipartFileUploadRequest
         * @param headers InitMultipartFileUploadHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return InitMultipartFileUploadResponse
         */
        public InitMultipartFileUploadResponse InitMultipartFileUploadWithOptions(string spaceId, InitMultipartFileUploadRequest request, InitMultipartFileUploadHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "InitMultipartFileUpload",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/files/multiPartUploadInfos/init",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<InitMultipartFileUploadResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 初始化文件分片上传
         *
         * @param request InitMultipartFileUploadRequest
         * @param headers InitMultipartFileUploadHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return InitMultipartFileUploadResponse
         */
        public async Task<InitMultipartFileUploadResponse> InitMultipartFileUploadWithOptionsAsync(string spaceId, InitMultipartFileUploadRequest request, InitMultipartFileUploadHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "InitMultipartFileUpload",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/files/multiPartUploadInfos/init",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<InitMultipartFileUploadResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 初始化文件分片上传
         *
         * @param request InitMultipartFileUploadRequest
         * @return InitMultipartFileUploadResponse
         */
        public InitMultipartFileUploadResponse InitMultipartFileUpload(string spaceId, InitMultipartFileUploadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            InitMultipartFileUploadHeaders headers = new InitMultipartFileUploadHeaders();
            return InitMultipartFileUploadWithOptions(spaceId, request, headers, runtime);
        }

        /**
         * @summary 初始化文件分片上传
         *
         * @param request InitMultipartFileUploadRequest
         * @return InitMultipartFileUploadResponse
         */
        public async Task<InitMultipartFileUploadResponse> InitMultipartFileUploadAsync(string spaceId, InitMultipartFileUploadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            InitMultipartFileUploadHeaders headers = new InitMultipartFileUploadHeaders();
            return await InitMultipartFileUploadWithOptionsAsync(spaceId, request, headers, runtime);
        }

        /**
         * @summary 获取文件列表
         *
         * @param request ListAllDentriesRequest
         * @param headers ListAllDentriesHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return ListAllDentriesResponse
         */
        public ListAllDentriesResponse ListAllDentriesWithOptions(string spaceId, ListAllDentriesRequest request, ListAllDentriesHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "ListAllDentries",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/listAll",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<ListAllDentriesResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 获取文件列表
         *
         * @param request ListAllDentriesRequest
         * @param headers ListAllDentriesHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return ListAllDentriesResponse
         */
        public async Task<ListAllDentriesResponse> ListAllDentriesWithOptionsAsync(string spaceId, ListAllDentriesRequest request, ListAllDentriesHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "ListAllDentries",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/listAll",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<ListAllDentriesResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 获取文件列表
         *
         * @param request ListAllDentriesRequest
         * @return ListAllDentriesResponse
         */
        public ListAllDentriesResponse ListAllDentries(string spaceId, ListAllDentriesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            ListAllDentriesHeaders headers = new ListAllDentriesHeaders();
            return ListAllDentriesWithOptions(spaceId, request, headers, runtime);
        }

        /**
         * @summary 获取文件列表
         *
         * @param request ListAllDentriesRequest
         * @return ListAllDentriesResponse
         */
        public async Task<ListAllDentriesResponse> ListAllDentriesAsync(string spaceId, ListAllDentriesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            ListAllDentriesHeaders headers = new ListAllDentriesHeaders();
            return await ListAllDentriesWithOptionsAsync(spaceId, request, headers, runtime);
        }

        /**
         * @summary 获取文件列表
         *
         * @param request ListDentriesRequest
         * @param headers ListDentriesHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return ListDentriesResponse
         */
        public ListDentriesResponse ListDentriesWithOptions(string spaceId, ListDentriesRequest request, ListDentriesHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.MaxResults))
            {
                query["maxResults"] = request.MaxResults;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.NextToken))
            {
                query["nextToken"] = request.NextToken;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Order))
            {
                query["order"] = request.Order;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.OrderBy))
            {
                query["orderBy"] = request.OrderBy;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.ParentId))
            {
                query["parentId"] = request.ParentId;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.WithThumbnail))
            {
                query["withThumbnail"] = request.WithThumbnail;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "ListDentries",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries",
                Method = "GET",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<ListDentriesResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 获取文件列表
         *
         * @param request ListDentriesRequest
         * @param headers ListDentriesHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return ListDentriesResponse
         */
        public async Task<ListDentriesResponse> ListDentriesWithOptionsAsync(string spaceId, ListDentriesRequest request, ListDentriesHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.MaxResults))
            {
                query["maxResults"] = request.MaxResults;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.NextToken))
            {
                query["nextToken"] = request.NextToken;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Order))
            {
                query["order"] = request.Order;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.OrderBy))
            {
                query["orderBy"] = request.OrderBy;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.ParentId))
            {
                query["parentId"] = request.ParentId;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.WithThumbnail))
            {
                query["withThumbnail"] = request.WithThumbnail;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "ListDentries",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries",
                Method = "GET",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<ListDentriesResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 获取文件列表
         *
         * @param request ListDentriesRequest
         * @return ListDentriesResponse
         */
        public ListDentriesResponse ListDentries(string spaceId, ListDentriesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            ListDentriesHeaders headers = new ListDentriesHeaders();
            return ListDentriesWithOptions(spaceId, request, headers, runtime);
        }

        /**
         * @summary 获取文件列表
         *
         * @param request ListDentriesRequest
         * @return ListDentriesResponse
         */
        public async Task<ListDentriesResponse> ListDentriesAsync(string spaceId, ListDentriesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            ListDentriesHeaders headers = new ListDentriesHeaders();
            return await ListDentriesWithOptionsAsync(spaceId, request, headers, runtime);
        }

        /**
         * @summary 获取文件历史版本
         *
         * @param request ListDentryVersionsRequest
         * @param headers ListDentryVersionsHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return ListDentryVersionsResponse
         */
        public ListDentryVersionsResponse ListDentryVersionsWithOptions(string spaceId, string dentryId, ListDentryVersionsRequest request, ListDentryVersionsHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.MaxResults))
            {
                query["maxResults"] = request.MaxResults;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.NextToken))
            {
                query["nextToken"] = request.NextToken;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "ListDentryVersions",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/versions",
                Method = "GET",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<ListDentryVersionsResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 获取文件历史版本
         *
         * @param request ListDentryVersionsRequest
         * @param headers ListDentryVersionsHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return ListDentryVersionsResponse
         */
        public async Task<ListDentryVersionsResponse> ListDentryVersionsWithOptionsAsync(string spaceId, string dentryId, ListDentryVersionsRequest request, ListDentryVersionsHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.MaxResults))
            {
                query["maxResults"] = request.MaxResults;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.NextToken))
            {
                query["nextToken"] = request.NextToken;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "ListDentryVersions",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/versions",
                Method = "GET",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<ListDentryVersionsResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 获取文件历史版本
         *
         * @param request ListDentryVersionsRequest
         * @return ListDentryVersionsResponse
         */
        public ListDentryVersionsResponse ListDentryVersions(string spaceId, string dentryId, ListDentryVersionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            ListDentryVersionsHeaders headers = new ListDentryVersionsHeaders();
            return ListDentryVersionsWithOptions(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 获取文件历史版本
         *
         * @param request ListDentryVersionsRequest
         * @return ListDentryVersionsResponse
         */
        public async Task<ListDentryVersionsResponse> ListDentryVersionsAsync(string spaceId, string dentryId, ListDentryVersionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            ListDentryVersionsHeaders headers = new ListDentryVersionsHeaders();
            return await ListDentryVersionsWithOptionsAsync(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 获取权限列表
         *
         * @param request ListPermissionsRequest
         * @param headers ListPermissionsHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return ListPermissionsResponse
         */
        public ListPermissionsResponse ListPermissionsWithOptions(string spaceId, string dentryId, ListPermissionsRequest request, ListPermissionsHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "ListPermissions",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/permissions/query",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<ListPermissionsResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 获取权限列表
         *
         * @param request ListPermissionsRequest
         * @param headers ListPermissionsHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return ListPermissionsResponse
         */
        public async Task<ListPermissionsResponse> ListPermissionsWithOptionsAsync(string spaceId, string dentryId, ListPermissionsRequest request, ListPermissionsHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "ListPermissions",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/permissions/query",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<ListPermissionsResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 获取权限列表
         *
         * @param request ListPermissionsRequest
         * @return ListPermissionsResponse
         */
        public ListPermissionsResponse ListPermissions(string spaceId, string dentryId, ListPermissionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            ListPermissionsHeaders headers = new ListPermissionsHeaders();
            return ListPermissionsWithOptions(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 获取权限列表
         *
         * @param request ListPermissionsRequest
         * @return ListPermissionsResponse
         */
        public async Task<ListPermissionsResponse> ListPermissionsAsync(string spaceId, string dentryId, ListPermissionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            ListPermissionsHeaders headers = new ListPermissionsHeaders();
            return await ListPermissionsWithOptionsAsync(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 获取回收项列表
         *
         * @param request ListRecycleItemsRequest
         * @param headers ListRecycleItemsHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return ListRecycleItemsResponse
         */
        public ListRecycleItemsResponse ListRecycleItemsWithOptions(string recycleBinId, ListRecycleItemsRequest request, ListRecycleItemsHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.MaxResults))
            {
                query["maxResults"] = request.MaxResults;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.NextToken))
            {
                query["nextToken"] = request.NextToken;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "ListRecycleItems",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/recycleBins/" + recycleBinId + "/recycleItems",
                Method = "GET",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<ListRecycleItemsResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 获取回收项列表
         *
         * @param request ListRecycleItemsRequest
         * @param headers ListRecycleItemsHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return ListRecycleItemsResponse
         */
        public async Task<ListRecycleItemsResponse> ListRecycleItemsWithOptionsAsync(string recycleBinId, ListRecycleItemsRequest request, ListRecycleItemsHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.MaxResults))
            {
                query["maxResults"] = request.MaxResults;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.NextToken))
            {
                query["nextToken"] = request.NextToken;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "ListRecycleItems",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/recycleBins/" + recycleBinId + "/recycleItems",
                Method = "GET",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<ListRecycleItemsResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 获取回收项列表
         *
         * @param request ListRecycleItemsRequest
         * @return ListRecycleItemsResponse
         */
        public ListRecycleItemsResponse ListRecycleItems(string recycleBinId, ListRecycleItemsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            ListRecycleItemsHeaders headers = new ListRecycleItemsHeaders();
            return ListRecycleItemsWithOptions(recycleBinId, request, headers, runtime);
        }

        /**
         * @summary 获取回收项列表
         *
         * @param request ListRecycleItemsRequest
         * @return ListRecycleItemsResponse
         */
        public async Task<ListRecycleItemsResponse> ListRecycleItemsAsync(string recycleBinId, ListRecycleItemsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            ListRecycleItemsHeaders headers = new ListRecycleItemsHeaders();
            return await ListRecycleItemsWithOptionsAsync(recycleBinId, request, headers, runtime);
        }

        /**
         * @summary 批量移动文件或文件夹
         *
         * @param request MoveDentriesRequest
         * @param headers MoveDentriesHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return MoveDentriesResponse
         */
        public MoveDentriesResponse MoveDentriesWithOptions(string spaceId, MoveDentriesRequest request, MoveDentriesHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.DentryIds))
            {
                body["dentryIds"] = request.DentryIds;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.TargetFolderId))
            {
                body["targetFolderId"] = request.TargetFolderId;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.TargetSpaceId))
            {
                body["targetSpaceId"] = request.TargetSpaceId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "MoveDentries",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/batchMove",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<MoveDentriesResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 批量移动文件或文件夹
         *
         * @param request MoveDentriesRequest
         * @param headers MoveDentriesHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return MoveDentriesResponse
         */
        public async Task<MoveDentriesResponse> MoveDentriesWithOptionsAsync(string spaceId, MoveDentriesRequest request, MoveDentriesHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.DentryIds))
            {
                body["dentryIds"] = request.DentryIds;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.TargetFolderId))
            {
                body["targetFolderId"] = request.TargetFolderId;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.TargetSpaceId))
            {
                body["targetSpaceId"] = request.TargetSpaceId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "MoveDentries",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/batchMove",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<MoveDentriesResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 批量移动文件或文件夹
         *
         * @param request MoveDentriesRequest
         * @return MoveDentriesResponse
         */
        public MoveDentriesResponse MoveDentries(string spaceId, MoveDentriesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            MoveDentriesHeaders headers = new MoveDentriesHeaders();
            return MoveDentriesWithOptions(spaceId, request, headers, runtime);
        }

        /**
         * @summary 批量移动文件或文件夹
         *
         * @param request MoveDentriesRequest
         * @return MoveDentriesResponse
         */
        public async Task<MoveDentriesResponse> MoveDentriesAsync(string spaceId, MoveDentriesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            MoveDentriesHeaders headers = new MoveDentriesHeaders();
            return await MoveDentriesWithOptionsAsync(spaceId, request, headers, runtime);
        }

        /**
         * @summary 移动文件或文件夹
         *
         * @param request MoveDentryRequest
         * @param headers MoveDentryHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return MoveDentryResponse
         */
        public MoveDentryResponse MoveDentryWithOptions(string spaceId, string dentryId, MoveDentryRequest request, MoveDentryHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.TargetFolderId))
            {
                body["targetFolderId"] = request.TargetFolderId;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.TargetSpaceId))
            {
                body["targetSpaceId"] = request.TargetSpaceId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "MoveDentry",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/move",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<MoveDentryResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 移动文件或文件夹
         *
         * @param request MoveDentryRequest
         * @param headers MoveDentryHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return MoveDentryResponse
         */
        public async Task<MoveDentryResponse> MoveDentryWithOptionsAsync(string spaceId, string dentryId, MoveDentryRequest request, MoveDentryHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.TargetFolderId))
            {
                body["targetFolderId"] = request.TargetFolderId;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.TargetSpaceId))
            {
                body["targetSpaceId"] = request.TargetSpaceId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "MoveDentry",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/move",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<MoveDentryResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 移动文件或文件夹
         *
         * @param request MoveDentryRequest
         * @return MoveDentryResponse
         */
        public MoveDentryResponse MoveDentry(string spaceId, string dentryId, MoveDentryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            MoveDentryHeaders headers = new MoveDentryHeaders();
            return MoveDentryWithOptions(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 移动文件或文件夹
         *
         * @param request MoveDentryRequest
         * @return MoveDentryResponse
         */
        public async Task<MoveDentryResponse> MoveDentryAsync(string spaceId, string dentryId, MoveDentryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            MoveDentryHeaders headers = new MoveDentryHeaders();
            return await MoveDentryWithOptionsAsync(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 注册文件预览或编辑链接
         *
         * @param request RegisterOpenInfoRequest
         * @param headers RegisterOpenInfoHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return RegisterOpenInfoResponse
         */
        public RegisterOpenInfoResponse RegisterOpenInfoWithOptions(string spaceId, string dentryId, RegisterOpenInfoRequest request, RegisterOpenInfoHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.OpenInfos))
            {
                body["openInfos"] = request.OpenInfos;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Provider))
            {
                body["provider"] = request.Provider;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "RegisterOpenInfo",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/openInfos/register",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<RegisterOpenInfoResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 注册文件预览或编辑链接
         *
         * @param request RegisterOpenInfoRequest
         * @param headers RegisterOpenInfoHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return RegisterOpenInfoResponse
         */
        public async Task<RegisterOpenInfoResponse> RegisterOpenInfoWithOptionsAsync(string spaceId, string dentryId, RegisterOpenInfoRequest request, RegisterOpenInfoHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.OpenInfos))
            {
                body["openInfos"] = request.OpenInfos;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Provider))
            {
                body["provider"] = request.Provider;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "RegisterOpenInfo",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/openInfos/register",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<RegisterOpenInfoResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 注册文件预览或编辑链接
         *
         * @param request RegisterOpenInfoRequest
         * @return RegisterOpenInfoResponse
         */
        public RegisterOpenInfoResponse RegisterOpenInfo(string spaceId, string dentryId, RegisterOpenInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            RegisterOpenInfoHeaders headers = new RegisterOpenInfoHeaders();
            return RegisterOpenInfoWithOptions(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 注册文件预览或编辑链接
         *
         * @param request RegisterOpenInfoRequest
         * @return RegisterOpenInfoResponse
         */
        public async Task<RegisterOpenInfoResponse> RegisterOpenInfoAsync(string spaceId, string dentryId, RegisterOpenInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            RegisterOpenInfoHeaders headers = new RegisterOpenInfoHeaders();
            return await RegisterOpenInfoWithOptionsAsync(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 重命名文件或文件夹
         *
         * @param request RenameDentryRequest
         * @param headers RenameDentryHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return RenameDentryResponse
         */
        public RenameDentryResponse RenameDentryWithOptions(string spaceId, string dentryId, RenameDentryRequest request, RenameDentryHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.NewName))
            {
                body["newName"] = request.NewName;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "RenameDentry",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/rename",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<RenameDentryResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 重命名文件或文件夹
         *
         * @param request RenameDentryRequest
         * @param headers RenameDentryHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return RenameDentryResponse
         */
        public async Task<RenameDentryResponse> RenameDentryWithOptionsAsync(string spaceId, string dentryId, RenameDentryRequest request, RenameDentryHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.NewName))
            {
                body["newName"] = request.NewName;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "RenameDentry",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/rename",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<RenameDentryResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 重命名文件或文件夹
         *
         * @param request RenameDentryRequest
         * @return RenameDentryResponse
         */
        public RenameDentryResponse RenameDentry(string spaceId, string dentryId, RenameDentryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            RenameDentryHeaders headers = new RenameDentryHeaders();
            return RenameDentryWithOptions(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 重命名文件或文件夹
         *
         * @param request RenameDentryRequest
         * @return RenameDentryResponse
         */
        public async Task<RenameDentryResponse> RenameDentryAsync(string spaceId, string dentryId, RenameDentryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            RenameDentryHeaders headers = new RenameDentryHeaders();
            return await RenameDentryWithOptionsAsync(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 还原回收站中的回收项
         *
         * @param request RestoreRecycleItemRequest
         * @param headers RestoreRecycleItemHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return RestoreRecycleItemResponse
         */
        public RestoreRecycleItemResponse RestoreRecycleItemWithOptions(string recycleBinId, string recycleItemId, RestoreRecycleItemRequest request, RestoreRecycleItemHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "RestoreRecycleItem",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/recycleBins/" + recycleBinId + "/recycleItems/" + recycleItemId + "/restore",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<RestoreRecycleItemResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 还原回收站中的回收项
         *
         * @param request RestoreRecycleItemRequest
         * @param headers RestoreRecycleItemHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return RestoreRecycleItemResponse
         */
        public async Task<RestoreRecycleItemResponse> RestoreRecycleItemWithOptionsAsync(string recycleBinId, string recycleItemId, RestoreRecycleItemRequest request, RestoreRecycleItemHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "RestoreRecycleItem",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/recycleBins/" + recycleBinId + "/recycleItems/" + recycleItemId + "/restore",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<RestoreRecycleItemResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 还原回收站中的回收项
         *
         * @param request RestoreRecycleItemRequest
         * @return RestoreRecycleItemResponse
         */
        public RestoreRecycleItemResponse RestoreRecycleItem(string recycleBinId, string recycleItemId, RestoreRecycleItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            RestoreRecycleItemHeaders headers = new RestoreRecycleItemHeaders();
            return RestoreRecycleItemWithOptions(recycleBinId, recycleItemId, request, headers, runtime);
        }

        /**
         * @summary 还原回收站中的回收项
         *
         * @param request RestoreRecycleItemRequest
         * @return RestoreRecycleItemResponse
         */
        public async Task<RestoreRecycleItemResponse> RestoreRecycleItemAsync(string recycleBinId, string recycleItemId, RestoreRecycleItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            RestoreRecycleItemHeaders headers = new RestoreRecycleItemHeaders();
            return await RestoreRecycleItemWithOptionsAsync(recycleBinId, recycleItemId, request, headers, runtime);
        }

        /**
         * @summary 批量还原回收站中的回收项
         *
         * @param request RestoreRecycleItemsRequest
         * @param headers RestoreRecycleItemsHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return RestoreRecycleItemsResponse
         */
        public RestoreRecycleItemsResponse RestoreRecycleItemsWithOptions(string recycleBinId, RestoreRecycleItemsRequest request, RestoreRecycleItemsHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.RecycleItemIds))
            {
                body["recycleItemIds"] = request.RecycleItemIds;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "RestoreRecycleItems",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/recycleBins/" + recycleBinId + "/recycleItems/batchRestore",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<RestoreRecycleItemsResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 批量还原回收站中的回收项
         *
         * @param request RestoreRecycleItemsRequest
         * @param headers RestoreRecycleItemsHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return RestoreRecycleItemsResponse
         */
        public async Task<RestoreRecycleItemsResponse> RestoreRecycleItemsWithOptionsAsync(string recycleBinId, RestoreRecycleItemsRequest request, RestoreRecycleItemsHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.RecycleItemIds))
            {
                body["recycleItemIds"] = request.RecycleItemIds;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "RestoreRecycleItems",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/recycleBins/" + recycleBinId + "/recycleItems/batchRestore",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<RestoreRecycleItemsResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 批量还原回收站中的回收项
         *
         * @param request RestoreRecycleItemsRequest
         * @return RestoreRecycleItemsResponse
         */
        public RestoreRecycleItemsResponse RestoreRecycleItems(string recycleBinId, RestoreRecycleItemsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            RestoreRecycleItemsHeaders headers = new RestoreRecycleItemsHeaders();
            return RestoreRecycleItemsWithOptions(recycleBinId, request, headers, runtime);
        }

        /**
         * @summary 批量还原回收站中的回收项
         *
         * @param request RestoreRecycleItemsRequest
         * @return RestoreRecycleItemsResponse
         */
        public async Task<RestoreRecycleItemsResponse> RestoreRecycleItemsAsync(string recycleBinId, RestoreRecycleItemsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            RestoreRecycleItemsHeaders headers = new RestoreRecycleItemsHeaders();
            return await RestoreRecycleItemsWithOptionsAsync(recycleBinId, request, headers, runtime);
        }

        /**
         * @summary 恢复文件历史版本
         *
         * @param request RevertDentryVersionRequest
         * @param headers RevertDentryVersionHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return RevertDentryVersionResponse
         */
        public RevertDentryVersionResponse RevertDentryVersionWithOptions(string spaceId, string dentryId, string version, RevertDentryVersionRequest request, RevertDentryVersionHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "RevertDentryVersion",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/versions/" + version + "/revert",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<RevertDentryVersionResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 恢复文件历史版本
         *
         * @param request RevertDentryVersionRequest
         * @param headers RevertDentryVersionHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return RevertDentryVersionResponse
         */
        public async Task<RevertDentryVersionResponse> RevertDentryVersionWithOptionsAsync(string spaceId, string dentryId, string version, RevertDentryVersionRequest request, RevertDentryVersionHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "RevertDentryVersion",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/versions/" + version + "/revert",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<RevertDentryVersionResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 恢复文件历史版本
         *
         * @param request RevertDentryVersionRequest
         * @return RevertDentryVersionResponse
         */
        public RevertDentryVersionResponse RevertDentryVersion(string spaceId, string dentryId, string version, RevertDentryVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            RevertDentryVersionHeaders headers = new RevertDentryVersionHeaders();
            return RevertDentryVersionWithOptions(spaceId, dentryId, version, request, headers, runtime);
        }

        /**
         * @summary 恢复文件历史版本
         *
         * @param request RevertDentryVersionRequest
         * @return RevertDentryVersionResponse
         */
        public async Task<RevertDentryVersionResponse> RevertDentryVersionAsync(string spaceId, string dentryId, string version, RevertDentryVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            RevertDentryVersionHeaders headers = new RevertDentryVersionHeaders();
            return await RevertDentryVersionWithOptionsAsync(spaceId, dentryId, version, request, headers, runtime);
        }

        /**
         * @summary 订阅文件变更事件
         *
         * @param request SubscribeEventRequest
         * @param headers SubscribeEventHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return SubscribeEventResponse
         */
        public SubscribeEventResponse SubscribeEventWithOptions(SubscribeEventRequest request, SubscribeEventHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Scope))
            {
                body["scope"] = request.Scope;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.ScopeId))
            {
                body["scopeId"] = request.ScopeId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "SubscribeEvent",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/events/subscribe",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<SubscribeEventResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 订阅文件变更事件
         *
         * @param request SubscribeEventRequest
         * @param headers SubscribeEventHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return SubscribeEventResponse
         */
        public async Task<SubscribeEventResponse> SubscribeEventWithOptionsAsync(SubscribeEventRequest request, SubscribeEventHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Scope))
            {
                body["scope"] = request.Scope;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.ScopeId))
            {
                body["scopeId"] = request.ScopeId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "SubscribeEvent",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/events/subscribe",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<SubscribeEventResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 订阅文件变更事件
         *
         * @param request SubscribeEventRequest
         * @return SubscribeEventResponse
         */
        public SubscribeEventResponse SubscribeEvent(SubscribeEventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            SubscribeEventHeaders headers = new SubscribeEventHeaders();
            return SubscribeEventWithOptions(request, headers, runtime);
        }

        /**
         * @summary 订阅文件变更事件
         *
         * @param request SubscribeEventRequest
         * @return SubscribeEventResponse
         */
        public async Task<SubscribeEventResponse> SubscribeEventAsync(SubscribeEventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            SubscribeEventHeaders headers = new SubscribeEventHeaders();
            return await SubscribeEventWithOptionsAsync(request, headers, runtime);
        }

        /**
         * @summary 取消订阅文件变更事件
         *
         * @param request UnsubscribeEventRequest
         * @param headers UnsubscribeEventHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return UnsubscribeEventResponse
         */
        public UnsubscribeEventResponse UnsubscribeEventWithOptions(UnsubscribeEventRequest request, UnsubscribeEventHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Scope))
            {
                body["scope"] = request.Scope;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.ScopeId))
            {
                body["scopeId"] = request.ScopeId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "UnsubscribeEvent",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/events/unsubscribe",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<UnsubscribeEventResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 取消订阅文件变更事件
         *
         * @param request UnsubscribeEventRequest
         * @param headers UnsubscribeEventHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return UnsubscribeEventResponse
         */
        public async Task<UnsubscribeEventResponse> UnsubscribeEventWithOptionsAsync(UnsubscribeEventRequest request, UnsubscribeEventHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Scope))
            {
                body["scope"] = request.Scope;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.ScopeId))
            {
                body["scopeId"] = request.ScopeId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "UnsubscribeEvent",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/events/unsubscribe",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<UnsubscribeEventResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 取消订阅文件变更事件
         *
         * @param request UnsubscribeEventRequest
         * @return UnsubscribeEventResponse
         */
        public UnsubscribeEventResponse UnsubscribeEvent(UnsubscribeEventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            UnsubscribeEventHeaders headers = new UnsubscribeEventHeaders();
            return UnsubscribeEventWithOptions(request, headers, runtime);
        }

        /**
         * @summary 取消订阅文件变更事件
         *
         * @param request UnsubscribeEventRequest
         * @return UnsubscribeEventResponse
         */
        public async Task<UnsubscribeEventResponse> UnsubscribeEventAsync(UnsubscribeEventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            UnsubscribeEventHeaders headers = new UnsubscribeEventHeaders();
            return await UnsubscribeEventWithOptionsAsync(request, headers, runtime);
        }

        /**
         * @summary 修改文件上的App属性值
         *
         * @param request UpdateDentryAppPropertiesRequest
         * @param headers UpdateDentryAppPropertiesHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return UpdateDentryAppPropertiesResponse
         */
        public UpdateDentryAppPropertiesResponse UpdateDentryAppPropertiesWithOptions(string spaceId, string dentryId, UpdateDentryAppPropertiesRequest request, UpdateDentryAppPropertiesHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.AppProperties))
            {
                body["appProperties"] = request.AppProperties;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "UpdateDentryAppProperties",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/appProperties",
                Method = "PUT",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<UpdateDentryAppPropertiesResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 修改文件上的App属性值
         *
         * @param request UpdateDentryAppPropertiesRequest
         * @param headers UpdateDentryAppPropertiesHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return UpdateDentryAppPropertiesResponse
         */
        public async Task<UpdateDentryAppPropertiesResponse> UpdateDentryAppPropertiesWithOptionsAsync(string spaceId, string dentryId, UpdateDentryAppPropertiesRequest request, UpdateDentryAppPropertiesHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.AppProperties))
            {
                body["appProperties"] = request.AppProperties;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "UpdateDentryAppProperties",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/appProperties",
                Method = "PUT",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<UpdateDentryAppPropertiesResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 修改文件上的App属性值
         *
         * @param request UpdateDentryAppPropertiesRequest
         * @return UpdateDentryAppPropertiesResponse
         */
        public UpdateDentryAppPropertiesResponse UpdateDentryAppProperties(string spaceId, string dentryId, UpdateDentryAppPropertiesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            UpdateDentryAppPropertiesHeaders headers = new UpdateDentryAppPropertiesHeaders();
            return UpdateDentryAppPropertiesWithOptions(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 修改文件上的App属性值
         *
         * @param request UpdateDentryAppPropertiesRequest
         * @return UpdateDentryAppPropertiesResponse
         */
        public async Task<UpdateDentryAppPropertiesResponse> UpdateDentryAppPropertiesAsync(string spaceId, string dentryId, UpdateDentryAppPropertiesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            UpdateDentryAppPropertiesHeaders headers = new UpdateDentryAppPropertiesHeaders();
            return await UpdateDentryAppPropertiesWithOptionsAsync(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 修改权限
         *
         * @param request UpdatePermissionRequest
         * @param headers UpdatePermissionHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return UpdatePermissionResponse
         */
        public UpdatePermissionResponse UpdatePermissionWithOptions(string spaceId, string dentryId, UpdatePermissionRequest request, UpdatePermissionHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Members))
            {
                body["members"] = request.Members;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.RoleId))
            {
                body["roleId"] = request.RoleId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "UpdatePermission",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/permissions",
                Method = "PUT",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<UpdatePermissionResponse>(Execute(params_, req, runtime));
        }

        /**
         * @summary 修改权限
         *
         * @param request UpdatePermissionRequest
         * @param headers UpdatePermissionHeaders
         * @param runtime runtime options for this request RuntimeOptions
         * @return UpdatePermissionResponse
         */
        public async Task<UpdatePermissionResponse> UpdatePermissionWithOptionsAsync(string spaceId, string dentryId, UpdatePermissionRequest request, UpdatePermissionHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.UnionId))
            {
                query["unionId"] = request.UnionId;
            }
            Dictionary<string, object> body = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Members))
            {
                body["members"] = request.Members;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.Option))
            {
                body["option"] = request.Option;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.RoleId))
            {
                body["roleId"] = request.RoleId;
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
                Query = AlibabaCloud.OpenApiUtil.Client.Query(query),
                Body = AlibabaCloud.OpenApiUtil.Client.ParseToMap(body),
            };
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "UpdatePermission",
                Version = "storage_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/storage/spaces/" + spaceId + "/dentries/" + dentryId + "/permissions",
                Method = "PUT",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<UpdatePermissionResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /**
         * @summary 修改权限
         *
         * @param request UpdatePermissionRequest
         * @return UpdatePermissionResponse
         */
        public UpdatePermissionResponse UpdatePermission(string spaceId, string dentryId, UpdatePermissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            UpdatePermissionHeaders headers = new UpdatePermissionHeaders();
            return UpdatePermissionWithOptions(spaceId, dentryId, request, headers, runtime);
        }

        /**
         * @summary 修改权限
         *
         * @param request UpdatePermissionRequest
         * @return UpdatePermissionResponse
         */
        public async Task<UpdatePermissionResponse> UpdatePermissionAsync(string spaceId, string dentryId, UpdatePermissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            UpdatePermissionHeaders headers = new UpdatePermissionHeaders();
            return await UpdatePermissionWithOptionsAsync(spaceId, dentryId, request, headers, runtime);
        }

    }
}
