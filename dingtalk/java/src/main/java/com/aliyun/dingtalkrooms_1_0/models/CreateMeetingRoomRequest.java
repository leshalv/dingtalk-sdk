// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dingtalkrooms_1_0.models;

import com.aliyun.tea.*;

public class CreateMeetingRoomRequest extends TeaModel {
    @NameInMap("enableCycleReservation")
    public Boolean enableCycleReservation;

    @NameInMap("groupId")
    public Long groupId;

    @NameInMap("isvRoomId")
    public String isvRoomId;

    @NameInMap("reservationAuthority")
    public CreateMeetingRoomRequestReservationAuthority reservationAuthority;

    @NameInMap("roomCapacity")
    public Integer roomCapacity;

    @NameInMap("roomLabelIds")
    public java.util.List<Long> roomLabelIds;

    @NameInMap("roomLocation")
    public CreateMeetingRoomRequestRoomLocation roomLocation;

    @NameInMap("roomName")
    public String roomName;

    @NameInMap("roomPicture")
    public String roomPicture;

    @NameInMap("roomStatus")
    public Integer roomStatus;

    @NameInMap("unionId")
    public String unionId;

    public static CreateMeetingRoomRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMeetingRoomRequest self = new CreateMeetingRoomRequest();
        return TeaModel.build(map, self);
    }

    public CreateMeetingRoomRequest setEnableCycleReservation(Boolean enableCycleReservation) {
        this.enableCycleReservation = enableCycleReservation;
        return this;
    }
    public Boolean getEnableCycleReservation() {
        return this.enableCycleReservation;
    }

    public CreateMeetingRoomRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public CreateMeetingRoomRequest setIsvRoomId(String isvRoomId) {
        this.isvRoomId = isvRoomId;
        return this;
    }
    public String getIsvRoomId() {
        return this.isvRoomId;
    }

    public CreateMeetingRoomRequest setReservationAuthority(CreateMeetingRoomRequestReservationAuthority reservationAuthority) {
        this.reservationAuthority = reservationAuthority;
        return this;
    }
    public CreateMeetingRoomRequestReservationAuthority getReservationAuthority() {
        return this.reservationAuthority;
    }

    public CreateMeetingRoomRequest setRoomCapacity(Integer roomCapacity) {
        this.roomCapacity = roomCapacity;
        return this;
    }
    public Integer getRoomCapacity() {
        return this.roomCapacity;
    }

    public CreateMeetingRoomRequest setRoomLabelIds(java.util.List<Long> roomLabelIds) {
        this.roomLabelIds = roomLabelIds;
        return this;
    }
    public java.util.List<Long> getRoomLabelIds() {
        return this.roomLabelIds;
    }

    public CreateMeetingRoomRequest setRoomLocation(CreateMeetingRoomRequestRoomLocation roomLocation) {
        this.roomLocation = roomLocation;
        return this;
    }
    public CreateMeetingRoomRequestRoomLocation getRoomLocation() {
        return this.roomLocation;
    }

    public CreateMeetingRoomRequest setRoomName(String roomName) {
        this.roomName = roomName;
        return this;
    }
    public String getRoomName() {
        return this.roomName;
    }

    public CreateMeetingRoomRequest setRoomPicture(String roomPicture) {
        this.roomPicture = roomPicture;
        return this;
    }
    public String getRoomPicture() {
        return this.roomPicture;
    }

    public CreateMeetingRoomRequest setRoomStatus(Integer roomStatus) {
        this.roomStatus = roomStatus;
        return this;
    }
    public Integer getRoomStatus() {
        return this.roomStatus;
    }

    public CreateMeetingRoomRequest setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

    public static class CreateMeetingRoomRequestReservationAuthorityAuthorizedMembers extends TeaModel {
        @NameInMap("memberId")
        public String memberId;

        @NameInMap("memberName")
        public String memberName;

        @NameInMap("memberType")
        public String memberType;

        public static CreateMeetingRoomRequestReservationAuthorityAuthorizedMembers build(java.util.Map<String, ?> map) throws Exception {
            CreateMeetingRoomRequestReservationAuthorityAuthorizedMembers self = new CreateMeetingRoomRequestReservationAuthorityAuthorizedMembers();
            return TeaModel.build(map, self);
        }

        public CreateMeetingRoomRequestReservationAuthorityAuthorizedMembers setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public CreateMeetingRoomRequestReservationAuthorityAuthorizedMembers setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public CreateMeetingRoomRequestReservationAuthorityAuthorizedMembers setMemberType(String memberType) {
            this.memberType = memberType;
            return this;
        }
        public String getMemberType() {
            return this.memberType;
        }

    }

    public static class CreateMeetingRoomRequestReservationAuthority extends TeaModel {
        @NameInMap("authorizedMembers")
        public java.util.List<CreateMeetingRoomRequestReservationAuthorityAuthorizedMembers> authorizedMembers;

        public static CreateMeetingRoomRequestReservationAuthority build(java.util.Map<String, ?> map) throws Exception {
            CreateMeetingRoomRequestReservationAuthority self = new CreateMeetingRoomRequestReservationAuthority();
            return TeaModel.build(map, self);
        }

        public CreateMeetingRoomRequestReservationAuthority setAuthorizedMembers(java.util.List<CreateMeetingRoomRequestReservationAuthorityAuthorizedMembers> authorizedMembers) {
            this.authorizedMembers = authorizedMembers;
            return this;
        }
        public java.util.List<CreateMeetingRoomRequestReservationAuthorityAuthorizedMembers> getAuthorizedMembers() {
            return this.authorizedMembers;
        }

    }

    public static class CreateMeetingRoomRequestRoomLocation extends TeaModel {
        @NameInMap("desc")
        public String desc;

        @NameInMap("title")
        public String title;

        public static CreateMeetingRoomRequestRoomLocation build(java.util.Map<String, ?> map) throws Exception {
            CreateMeetingRoomRequestRoomLocation self = new CreateMeetingRoomRequestRoomLocation();
            return TeaModel.build(map, self);
        }

        public CreateMeetingRoomRequestRoomLocation setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public CreateMeetingRoomRequestRoomLocation setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
