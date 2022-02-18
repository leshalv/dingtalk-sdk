// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkapaas_1_0.models;

import com.aliyun.tea.*;

public class BatchCreateTemplateRequest extends TeaModel {
    @NameInMap("templateList")
    public java.util.List<BatchCreateTemplateRequestTemplateList> templateList;

    public static BatchCreateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateTemplateRequest self = new BatchCreateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateTemplateRequest setTemplateList(java.util.List<BatchCreateTemplateRequestTemplateList> templateList) {
        this.templateList = templateList;
        return this;
    }
    public java.util.List<BatchCreateTemplateRequestTemplateList> getTemplateList() {
        return this.templateList;
    }

    public static class BatchCreateTemplateRequestTemplateList extends TeaModel {
        // adaptEnv
        @NameInMap("adaptEnv")
        public java.util.List<String> adaptEnv;

        // appDesc
        @NameInMap("appDesc")
        public String appDesc;

        // appIcon
        @NameInMap("appIcon")
        public String appIcon;

        // caseVideoList
        @NameInMap("caseVideoList")
        public java.util.List<String> caseVideoList;

        // category
        @NameInMap("categoryCode")
        public String categoryCode;

        // coverImgList
        @NameInMap("coverImgList")
        public java.util.List<String> coverImgList;

        // expUrl
        @NameInMap("expUrl")
        public String expUrl;

        // industryLabelList
        @NameInMap("industryLabelList")
        public java.util.List<String> industryLabelList;

        // installTimes
        @NameInMap("installTimes")
        public Long installTimes;

        // mobilePreviewMediaList
        @NameInMap("mobilePreviewMediaList")
        public java.util.List<String> mobilePreviewMediaList;

        // name
        @NameInMap("name")
        public String name;

        // previewMediaList
        @NameInMap("previewMediaList")
        public java.util.List<String> previewMediaList;

        // providerName
        @NameInMap("providerName")
        public String providerName;

        // roleLabelList
        @NameInMap("roleLabelList")
        public java.util.List<String> roleLabelList;

        // simpleDesc
        @NameInMap("simpleDesc")
        public String simpleDesc;

        // templateKey
        @NameInMap("templateKey")
        public String templateKey;

        // useCasesMediaList
        @NameInMap("useCasesMediaList")
        public java.util.List<String> useCasesMediaList;

        public static BatchCreateTemplateRequestTemplateList build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateTemplateRequestTemplateList self = new BatchCreateTemplateRequestTemplateList();
            return TeaModel.build(map, self);
        }

        public BatchCreateTemplateRequestTemplateList setAdaptEnv(java.util.List<String> adaptEnv) {
            this.adaptEnv = adaptEnv;
            return this;
        }
        public java.util.List<String> getAdaptEnv() {
            return this.adaptEnv;
        }

        public BatchCreateTemplateRequestTemplateList setAppDesc(String appDesc) {
            this.appDesc = appDesc;
            return this;
        }
        public String getAppDesc() {
            return this.appDesc;
        }

        public BatchCreateTemplateRequestTemplateList setAppIcon(String appIcon) {
            this.appIcon = appIcon;
            return this;
        }
        public String getAppIcon() {
            return this.appIcon;
        }

        public BatchCreateTemplateRequestTemplateList setCaseVideoList(java.util.List<String> caseVideoList) {
            this.caseVideoList = caseVideoList;
            return this;
        }
        public java.util.List<String> getCaseVideoList() {
            return this.caseVideoList;
        }

        public BatchCreateTemplateRequestTemplateList setCategoryCode(String categoryCode) {
            this.categoryCode = categoryCode;
            return this;
        }
        public String getCategoryCode() {
            return this.categoryCode;
        }

        public BatchCreateTemplateRequestTemplateList setCoverImgList(java.util.List<String> coverImgList) {
            this.coverImgList = coverImgList;
            return this;
        }
        public java.util.List<String> getCoverImgList() {
            return this.coverImgList;
        }

        public BatchCreateTemplateRequestTemplateList setExpUrl(String expUrl) {
            this.expUrl = expUrl;
            return this;
        }
        public String getExpUrl() {
            return this.expUrl;
        }

        public BatchCreateTemplateRequestTemplateList setIndustryLabelList(java.util.List<String> industryLabelList) {
            this.industryLabelList = industryLabelList;
            return this;
        }
        public java.util.List<String> getIndustryLabelList() {
            return this.industryLabelList;
        }

        public BatchCreateTemplateRequestTemplateList setInstallTimes(Long installTimes) {
            this.installTimes = installTimes;
            return this;
        }
        public Long getInstallTimes() {
            return this.installTimes;
        }

        public BatchCreateTemplateRequestTemplateList setMobilePreviewMediaList(java.util.List<String> mobilePreviewMediaList) {
            this.mobilePreviewMediaList = mobilePreviewMediaList;
            return this;
        }
        public java.util.List<String> getMobilePreviewMediaList() {
            return this.mobilePreviewMediaList;
        }

        public BatchCreateTemplateRequestTemplateList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BatchCreateTemplateRequestTemplateList setPreviewMediaList(java.util.List<String> previewMediaList) {
            this.previewMediaList = previewMediaList;
            return this;
        }
        public java.util.List<String> getPreviewMediaList() {
            return this.previewMediaList;
        }

        public BatchCreateTemplateRequestTemplateList setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

        public BatchCreateTemplateRequestTemplateList setRoleLabelList(java.util.List<String> roleLabelList) {
            this.roleLabelList = roleLabelList;
            return this;
        }
        public java.util.List<String> getRoleLabelList() {
            return this.roleLabelList;
        }

        public BatchCreateTemplateRequestTemplateList setSimpleDesc(String simpleDesc) {
            this.simpleDesc = simpleDesc;
            return this;
        }
        public String getSimpleDesc() {
            return this.simpleDesc;
        }

        public BatchCreateTemplateRequestTemplateList setTemplateKey(String templateKey) {
            this.templateKey = templateKey;
            return this;
        }
        public String getTemplateKey() {
            return this.templateKey;
        }

        public BatchCreateTemplateRequestTemplateList setUseCasesMediaList(java.util.List<String> useCasesMediaList) {
            this.useCasesMediaList = useCasesMediaList;
            return this;
        }
        public java.util.List<String> getUseCasesMediaList() {
            return this.useCasesMediaList;
        }

    }

}