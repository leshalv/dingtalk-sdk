// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkwiki_1_0;

import com.aliyun.tea.*;
import com.aliyun.dingtalkwiki_1_0.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        if (com.aliyun.teautil.Common.empty(_endpoint)) {
            this._endpoint = "api.dingtalk.com";
        }

    }


    public WikiWordsDetailResponse wikiWordsDetail(WikiWordsDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        WikiWordsDetailHeaders headers = new WikiWordsDetailHeaders();
        return this.wikiWordsDetailWithOptions(request, headers, runtime);
    }

    public WikiWordsDetailResponse wikiWordsDetailWithOptions(WikiWordsDetailRequest request, WikiWordsDetailHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.wordName)) {
            query.put("wordName", request.wordName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("WikiWordsDetail", "wiki_1.0", "HTTP", "GET", "AK", "/v1.0/wiki/words/details", "json", req, runtime), new WikiWordsDetailResponse());
    }

    public WikiWordsParseResponse wikiWordsParse(WikiWordsParseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        WikiWordsParseHeaders headers = new WikiWordsParseHeaders();
        return this.wikiWordsParseWithOptions(request, headers, runtime);
    }

    public WikiWordsParseResponse wikiWordsParseWithOptions(WikiWordsParseRequest request, WikiWordsParseHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsDingtalkAccessToken)) {
            realHeaders.put("x-acs-dingtalk-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsDingtalkAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("WikiWordsParse", "wiki_1.0", "HTTP", "POST", "AK", "/v1.0/wiki/words/parse", "json", req, runtime), new WikiWordsParseResponse());
    }
}
