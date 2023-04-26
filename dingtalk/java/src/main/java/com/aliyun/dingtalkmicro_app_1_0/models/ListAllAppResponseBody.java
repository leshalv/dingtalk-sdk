// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkmicro_app_1_0.models;

import com.aliyun.tea.*;

public class ListAllAppResponseBody extends TeaModel {
    @NameInMap("appList")
    public java.util.List<ListAllAppResponseBodyAppList> appList;

    public static ListAllAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllAppResponseBody self = new ListAllAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllAppResponseBody setAppList(java.util.List<ListAllAppResponseBodyAppList> appList) {
        this.appList = appList;
        return this;
    }
    public java.util.List<ListAllAppResponseBodyAppList> getAppList() {
        return this.appList;
    }

    public static class ListAllAppResponseBodyAppList extends TeaModel {
        @NameInMap("agentId")
        public Long agentId;

        @NameInMap("appId")
        public Long appId;

        @NameInMap("appStatus")
        public Integer appStatus;

        @NameInMap("desc")
        public String desc;

        @NameInMap("developType")
        public Integer developType;

        @NameInMap("homepageLink")
        public String homepageLink;

        @NameInMap("icon")
        public String icon;

        @NameInMap("name")
        public String name;

        @NameInMap("ompLink")
        public String ompLink;

        @NameInMap("pcHomepageLink")
        public String pcHomepageLink;

        public static ListAllAppResponseBodyAppList build(java.util.Map<String, ?> map) throws Exception {
            ListAllAppResponseBodyAppList self = new ListAllAppResponseBodyAppList();
            return TeaModel.build(map, self);
        }

        public ListAllAppResponseBodyAppList setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

        public ListAllAppResponseBodyAppList setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public ListAllAppResponseBodyAppList setAppStatus(Integer appStatus) {
            this.appStatus = appStatus;
            return this;
        }
        public Integer getAppStatus() {
            return this.appStatus;
        }

        public ListAllAppResponseBodyAppList setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListAllAppResponseBodyAppList setDevelopType(Integer developType) {
            this.developType = developType;
            return this;
        }
        public Integer getDevelopType() {
            return this.developType;
        }

        public ListAllAppResponseBodyAppList setHomepageLink(String homepageLink) {
            this.homepageLink = homepageLink;
            return this;
        }
        public String getHomepageLink() {
            return this.homepageLink;
        }

        public ListAllAppResponseBodyAppList setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListAllAppResponseBodyAppList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAllAppResponseBodyAppList setOmpLink(String ompLink) {
            this.ompLink = ompLink;
            return this;
        }
        public String getOmpLink() {
            return this.ompLink;
        }

        public ListAllAppResponseBodyAppList setPcHomepageLink(String pcHomepageLink) {
            this.pcHomepageLink = pcHomepageLink;
            return this;
        }
        public String getPcHomepageLink() {
            return this.pcHomepageLink;
        }

    }

}
