// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AlibabaCloud.SDK.Dingtalktrajectory_1_0.Models;

namespace AlibabaCloud.SDK.Dingtalktrajectory_1_0
{
    public class Client : AlibabaCloud.OpenApiClient.Client
    {

        public Client(AlibabaCloud.OpenApiClient.Models.Config config): base(config)
        {
            AlibabaCloud.GatewayDingTalk.Client gatewayClient = new AlibabaCloud.GatewayDingTalk.Client();
            this._spi = gatewayClient;
            this._endpointRule = "";
            if (AlibabaCloud.TeaUtil.Common.Empty(_endpoint))
            {
                this._endpoint = "api.dingtalk.com";
            }
        }


        /// <term><b>Summary:</b></term>
        /// <summary>
        /// <para>查询APP当前开启轨迹采集的用户</para>
        /// </summary>
        /// 
        /// <param name="request">
        /// QueryAppActiveUsersRequest
        /// </param>
        /// <param name="headers">
        /// QueryAppActiveUsersHeaders
        /// </param>
        /// <param name="runtime">
        /// runtime options for this request RuntimeOptions
        /// </param>
        /// 
        /// <returns>
        /// QueryAppActiveUsersResponse
        /// </returns>
        public QueryAppActiveUsersResponse QueryAppActiveUsersWithOptions(QueryAppActiveUsersRequest request, QueryAppActiveUsersHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.MaxResults))
            {
                query["maxResults"] = request.MaxResults;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.NeedPositionInfo))
            {
                query["needPositionInfo"] = request.NeedPositionInfo;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.NextToken))
            {
                query["nextToken"] = request.NextToken;
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
                Action = "QueryAppActiveUsers",
                Version = "trajectory_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/trajectory/activeUsers",
                Method = "GET",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "json",
                BodyType = "json",
            };
            return TeaModel.ToObject<QueryAppActiveUsersResponse>(Execute(params_, req, runtime));
        }

        /// <term><b>Summary:</b></term>
        /// <summary>
        /// <para>查询APP当前开启轨迹采集的用户</para>
        /// </summary>
        /// 
        /// <param name="request">
        /// QueryAppActiveUsersRequest
        /// </param>
        /// <param name="headers">
        /// QueryAppActiveUsersHeaders
        /// </param>
        /// <param name="runtime">
        /// runtime options for this request RuntimeOptions
        /// </param>
        /// 
        /// <returns>
        /// QueryAppActiveUsersResponse
        /// </returns>
        public async Task<QueryAppActiveUsersResponse> QueryAppActiveUsersWithOptionsAsync(QueryAppActiveUsersRequest request, QueryAppActiveUsersHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.MaxResults))
            {
                query["maxResults"] = request.MaxResults;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.NeedPositionInfo))
            {
                query["needPositionInfo"] = request.NeedPositionInfo;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.NextToken))
            {
                query["nextToken"] = request.NextToken;
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
                Action = "QueryAppActiveUsers",
                Version = "trajectory_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/trajectory/activeUsers",
                Method = "GET",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "json",
                BodyType = "json",
            };
            return TeaModel.ToObject<QueryAppActiveUsersResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /// <term><b>Summary:</b></term>
        /// <summary>
        /// <para>查询APP当前开启轨迹采集的用户</para>
        /// </summary>
        /// 
        /// <param name="request">
        /// QueryAppActiveUsersRequest
        /// </param>
        /// 
        /// <returns>
        /// QueryAppActiveUsersResponse
        /// </returns>
        public QueryAppActiveUsersResponse QueryAppActiveUsers(QueryAppActiveUsersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            QueryAppActiveUsersHeaders headers = new QueryAppActiveUsersHeaders();
            return QueryAppActiveUsersWithOptions(request, headers, runtime);
        }

        /// <term><b>Summary:</b></term>
        /// <summary>
        /// <para>查询APP当前开启轨迹采集的用户</para>
        /// </summary>
        /// 
        /// <param name="request">
        /// QueryAppActiveUsersRequest
        /// </param>
        /// 
        /// <returns>
        /// QueryAppActiveUsersResponse
        /// </returns>
        public async Task<QueryAppActiveUsersResponse> QueryAppActiveUsersAsync(QueryAppActiveUsersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            QueryAppActiveUsersHeaders headers = new QueryAppActiveUsersHeaders();
            return await QueryAppActiveUsersWithOptionsAsync(request, headers, runtime);
        }

        /// <term><b>Summary:</b></term>
        /// <summary>
        /// <para>查询应用采集中的轨迹任务</para>
        /// </summary>
        /// 
        /// <param name="request">
        /// QueryCollectingTraceTaskRequest
        /// </param>
        /// <param name="headers">
        /// QueryCollectingTraceTaskHeaders
        /// </param>
        /// <param name="runtime">
        /// runtime options for this request RuntimeOptions
        /// </param>
        /// 
        /// <returns>
        /// QueryCollectingTraceTaskResponse
        /// </returns>
        public QueryCollectingTraceTaskResponse QueryCollectingTraceTaskWithOptions(QueryCollectingTraceTaskRequest request, QueryCollectingTraceTaskHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
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
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "QueryCollectingTraceTask",
                Version = "trajectory_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/trajectory/currentTasks/queryByUserIds",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "json",
                BodyType = "json",
            };
            return TeaModel.ToObject<QueryCollectingTraceTaskResponse>(Execute(params_, req, runtime));
        }

        /// <term><b>Summary:</b></term>
        /// <summary>
        /// <para>查询应用采集中的轨迹任务</para>
        /// </summary>
        /// 
        /// <param name="request">
        /// QueryCollectingTraceTaskRequest
        /// </param>
        /// <param name="headers">
        /// QueryCollectingTraceTaskHeaders
        /// </param>
        /// <param name="runtime">
        /// runtime options for this request RuntimeOptions
        /// </param>
        /// 
        /// <returns>
        /// QueryCollectingTraceTaskResponse
        /// </returns>
        public async Task<QueryCollectingTraceTaskResponse> QueryCollectingTraceTaskWithOptionsAsync(QueryCollectingTraceTaskRequest request, QueryCollectingTraceTaskHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
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
            AlibabaCloud.OpenApiClient.Models.Params params_ = new AlibabaCloud.OpenApiClient.Models.Params
            {
                Action = "QueryCollectingTraceTask",
                Version = "trajectory_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/trajectory/currentTasks/queryByUserIds",
                Method = "POST",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "json",
                BodyType = "json",
            };
            return TeaModel.ToObject<QueryCollectingTraceTaskResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /// <term><b>Summary:</b></term>
        /// <summary>
        /// <para>查询应用采集中的轨迹任务</para>
        /// </summary>
        /// 
        /// <param name="request">
        /// QueryCollectingTraceTaskRequest
        /// </param>
        /// 
        /// <returns>
        /// QueryCollectingTraceTaskResponse
        /// </returns>
        public QueryCollectingTraceTaskResponse QueryCollectingTraceTask(QueryCollectingTraceTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            QueryCollectingTraceTaskHeaders headers = new QueryCollectingTraceTaskHeaders();
            return QueryCollectingTraceTaskWithOptions(request, headers, runtime);
        }

        /// <term><b>Summary:</b></term>
        /// <summary>
        /// <para>查询应用采集中的轨迹任务</para>
        /// </summary>
        /// 
        /// <param name="request">
        /// QueryCollectingTraceTaskRequest
        /// </param>
        /// 
        /// <returns>
        /// QueryCollectingTraceTaskResponse
        /// </returns>
        public async Task<QueryCollectingTraceTaskResponse> QueryCollectingTraceTaskAsync(QueryCollectingTraceTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            QueryCollectingTraceTaskHeaders headers = new QueryCollectingTraceTaskHeaders();
            return await QueryCollectingTraceTaskWithOptionsAsync(request, headers, runtime);
        }

        /// <term><b>Summary:</b></term>
        /// <summary>
        /// <para>查询轨迹数据</para>
        /// </summary>
        /// 
        /// <param name="request">
        /// QueryPageTraceDataRequest
        /// </param>
        /// <param name="headers">
        /// QueryPageTraceDataHeaders
        /// </param>
        /// <param name="runtime">
        /// runtime options for this request RuntimeOptions
        /// </param>
        /// 
        /// <returns>
        /// QueryPageTraceDataResponse
        /// </returns>
        public QueryPageTraceDataResponse QueryPageTraceDataWithOptions(QueryPageTraceDataRequest request, QueryPageTraceDataHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.EndTime))
            {
                query["endTime"] = request.EndTime;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.MaxResults))
            {
                query["maxResults"] = request.MaxResults;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.NextToken))
            {
                query["nextToken"] = request.NextToken;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.StaffId))
            {
                query["staffId"] = request.StaffId;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.StartTime))
            {
                query["startTime"] = request.StartTime;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.TraceId))
            {
                query["traceId"] = request.TraceId;
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
                Action = "QueryPageTraceData",
                Version = "trajectory_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/trajectory/data",
                Method = "GET",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<QueryPageTraceDataResponse>(Execute(params_, req, runtime));
        }

        /// <term><b>Summary:</b></term>
        /// <summary>
        /// <para>查询轨迹数据</para>
        /// </summary>
        /// 
        /// <param name="request">
        /// QueryPageTraceDataRequest
        /// </param>
        /// <param name="headers">
        /// QueryPageTraceDataHeaders
        /// </param>
        /// <param name="runtime">
        /// runtime options for this request RuntimeOptions
        /// </param>
        /// 
        /// <returns>
        /// QueryPageTraceDataResponse
        /// </returns>
        public async Task<QueryPageTraceDataResponse> QueryPageTraceDataWithOptionsAsync(QueryPageTraceDataRequest request, QueryPageTraceDataHeaders headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            Dictionary<string, object> query = new Dictionary<string, object>(){};
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.EndTime))
            {
                query["endTime"] = request.EndTime;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.MaxResults))
            {
                query["maxResults"] = request.MaxResults;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.NextToken))
            {
                query["nextToken"] = request.NextToken;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.StaffId))
            {
                query["staffId"] = request.StaffId;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.StartTime))
            {
                query["startTime"] = request.StartTime;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.TraceId))
            {
                query["traceId"] = request.TraceId;
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
                Action = "QueryPageTraceData",
                Version = "trajectory_1.0",
                Protocol = "HTTP",
                Pathname = "/v1.0/trajectory/data",
                Method = "GET",
                AuthType = "AK",
                Style = "ROA",
                ReqBodyType = "none",
                BodyType = "json",
            };
            return TeaModel.ToObject<QueryPageTraceDataResponse>(await ExecuteAsync(params_, req, runtime));
        }

        /// <term><b>Summary:</b></term>
        /// <summary>
        /// <para>查询轨迹数据</para>
        /// </summary>
        /// 
        /// <param name="request">
        /// QueryPageTraceDataRequest
        /// </param>
        /// 
        /// <returns>
        /// QueryPageTraceDataResponse
        /// </returns>
        public QueryPageTraceDataResponse QueryPageTraceData(QueryPageTraceDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            QueryPageTraceDataHeaders headers = new QueryPageTraceDataHeaders();
            return QueryPageTraceDataWithOptions(request, headers, runtime);
        }

        /// <term><b>Summary:</b></term>
        /// <summary>
        /// <para>查询轨迹数据</para>
        /// </summary>
        /// 
        /// <param name="request">
        /// QueryPageTraceDataRequest
        /// </param>
        /// 
        /// <returns>
        /// QueryPageTraceDataResponse
        /// </returns>
        public async Task<QueryPageTraceDataResponse> QueryPageTraceDataAsync(QueryPageTraceDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            QueryPageTraceDataHeaders headers = new QueryPageTraceDataHeaders();
            return await QueryPageTraceDataWithOptionsAsync(request, headers, runtime);
        }

    }
}
