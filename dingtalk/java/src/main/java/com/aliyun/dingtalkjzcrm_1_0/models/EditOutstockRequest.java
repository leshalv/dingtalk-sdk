// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkjzcrm_1_0.models;

import com.aliyun.tea.*;

public class EditOutstockRequest extends TeaModel {
    @NameInMap("data")
    public EditOutstockRequestData data;

    @NameInMap("datatype")
    public Long datatype;

    @NameInMap("msgid")
    public Long msgid;

    @NameInMap("stamp")
    public Long stamp;

    public static EditOutstockRequest build(java.util.Map<String, ?> map) throws Exception {
        EditOutstockRequest self = new EditOutstockRequest();
        return TeaModel.build(map, self);
    }

    public EditOutstockRequest setData(EditOutstockRequestData data) {
        this.data = data;
        return this;
    }
    public EditOutstockRequestData getData() {
        return this.data;
    }

    public EditOutstockRequest setDatatype(Long datatype) {
        this.datatype = datatype;
        return this;
    }
    public Long getDatatype() {
        return this.datatype;
    }

    public EditOutstockRequest setMsgid(Long msgid) {
        this.msgid = msgid;
        return this;
    }
    public Long getMsgid() {
        return this.msgid;
    }

    public EditOutstockRequest setStamp(Long stamp) {
        this.stamp = stamp;
        return this;
    }
    public Long getStamp() {
        return this.stamp;
    }

    public static class EditOutstockRequestData extends TeaModel {
        @NameInMap("askempid")
        public String askempid;

        @NameInMap("auditreson")
        public String auditreson;

        @NameInMap("billno")
        public String billno;

        @NameInMap("child_mx")
        public String childMx;

        @NameInMap("customerid")
        public String customerid;

        @NameInMap("data_userid")
        public String dataUserid;

        @NameInMap("empid")
        public String empid;

        @NameInMap("inorout")
        public String inorout;

        @NameInMap("libiodate")
        public String libiodate;

        @NameInMap("libioname")
        public String libioname;

        @NameInMap("libiostate")
        public String libiostate;

        @NameInMap("orderid")
        public String orderid;

        @NameInMap("remark")
        public String remark;

        @NameInMap("stocklibid")
        public String stocklibid;

        public static EditOutstockRequestData build(java.util.Map<String, ?> map) throws Exception {
            EditOutstockRequestData self = new EditOutstockRequestData();
            return TeaModel.build(map, self);
        }

        public EditOutstockRequestData setAskempid(String askempid) {
            this.askempid = askempid;
            return this;
        }
        public String getAskempid() {
            return this.askempid;
        }

        public EditOutstockRequestData setAuditreson(String auditreson) {
            this.auditreson = auditreson;
            return this;
        }
        public String getAuditreson() {
            return this.auditreson;
        }

        public EditOutstockRequestData setBillno(String billno) {
            this.billno = billno;
            return this;
        }
        public String getBillno() {
            return this.billno;
        }

        public EditOutstockRequestData setChildMx(String childMx) {
            this.childMx = childMx;
            return this;
        }
        public String getChildMx() {
            return this.childMx;
        }

        public EditOutstockRequestData setCustomerid(String customerid) {
            this.customerid = customerid;
            return this;
        }
        public String getCustomerid() {
            return this.customerid;
        }

        public EditOutstockRequestData setDataUserid(String dataUserid) {
            this.dataUserid = dataUserid;
            return this;
        }
        public String getDataUserid() {
            return this.dataUserid;
        }

        public EditOutstockRequestData setEmpid(String empid) {
            this.empid = empid;
            return this;
        }
        public String getEmpid() {
            return this.empid;
        }

        public EditOutstockRequestData setInorout(String inorout) {
            this.inorout = inorout;
            return this;
        }
        public String getInorout() {
            return this.inorout;
        }

        public EditOutstockRequestData setLibiodate(String libiodate) {
            this.libiodate = libiodate;
            return this;
        }
        public String getLibiodate() {
            return this.libiodate;
        }

        public EditOutstockRequestData setLibioname(String libioname) {
            this.libioname = libioname;
            return this;
        }
        public String getLibioname() {
            return this.libioname;
        }

        public EditOutstockRequestData setLibiostate(String libiostate) {
            this.libiostate = libiostate;
            return this;
        }
        public String getLibiostate() {
            return this.libiostate;
        }

        public EditOutstockRequestData setOrderid(String orderid) {
            this.orderid = orderid;
            return this;
        }
        public String getOrderid() {
            return this.orderid;
        }

        public EditOutstockRequestData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public EditOutstockRequestData setStocklibid(String stocklibid) {
            this.stocklibid = stocklibid;
            return this;
        }
        public String getStocklibid() {
            return this.stocklibid;
        }

    }

}
