// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkresident_1_0.models;

import com.aliyun.tea.*;

public class CreateSpaceRequest extends TeaModel {
    // 空间名称，如A栋，二单元，406室等
    @NameInMap("name")
    public String name;

    // 父节点id，根节点为-7
    @NameInMap("parentDeptId")
    public String parentDeptId;

    // 空间tag标识，目前有House/Unit/Building/Partition
    @NameInMap("tagCode")
    public String tagCode;

    // * 空间类型为楼时，1住宅/2公寓/3排屋/4洋房/5叠墅/6别墅/7商铺/8办公用房/9经营用房/10其他      * 空间类型为房屋是，1普通住宅/2公寓/3排屋/4物业管理用房/5社区用房/6别墅/7商铺/8办公用房（商写）/9经营用房/10其他
    @NameInMap("type")
    public String type;

    public static CreateSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSpaceRequest self = new CreateSpaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateSpaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSpaceRequest setParentDeptId(String parentDeptId) {
        this.parentDeptId = parentDeptId;
        return this;
    }
    public String getParentDeptId() {
        return this.parentDeptId;
    }

    public CreateSpaceRequest setTagCode(String tagCode) {
        this.tagCode = tagCode;
        return this;
    }
    public String getTagCode() {
        return this.tagCode;
    }

    public CreateSpaceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}