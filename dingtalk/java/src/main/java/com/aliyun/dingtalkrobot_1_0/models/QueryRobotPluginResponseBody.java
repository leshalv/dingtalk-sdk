// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkrobot_1_0.models;

import com.aliyun.tea.*;

public class QueryRobotPluginResponseBody extends TeaModel {
    @NameInMap("pluginInfoList")
    public java.util.List<QueryRobotPluginResponseBodyPluginInfoList> pluginInfoList;

    public static QueryRobotPluginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotPluginResponseBody self = new QueryRobotPluginResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRobotPluginResponseBody setPluginInfoList(java.util.List<QueryRobotPluginResponseBodyPluginInfoList> pluginInfoList) {
        this.pluginInfoList = pluginInfoList;
        return this;
    }
    public java.util.List<QueryRobotPluginResponseBodyPluginInfoList> getPluginInfoList() {
        return this.pluginInfoList;
    }

    public static class QueryRobotPluginResponseBodyPluginInfoList extends TeaModel {
        @NameInMap("icon")
        public String icon;

        @NameInMap("mobileUrl")
        public String mobileUrl;

        @NameInMap("name")
        public String name;

        @NameInMap("pcUrl")
        public String pcUrl;

        public static QueryRobotPluginResponseBodyPluginInfoList build(java.util.Map<String, ?> map) throws Exception {
            QueryRobotPluginResponseBodyPluginInfoList self = new QueryRobotPluginResponseBodyPluginInfoList();
            return TeaModel.build(map, self);
        }

        public QueryRobotPluginResponseBodyPluginInfoList setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QueryRobotPluginResponseBodyPluginInfoList setMobileUrl(String mobileUrl) {
            this.mobileUrl = mobileUrl;
            return this;
        }
        public String getMobileUrl() {
            return this.mobileUrl;
        }

        public QueryRobotPluginResponseBodyPluginInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryRobotPluginResponseBodyPluginInfoList setPcUrl(String pcUrl) {
            this.pcUrl = pcUrl;
            return this;
        }
        public String getPcUrl() {
            return this.pcUrl;
        }

    }

}
