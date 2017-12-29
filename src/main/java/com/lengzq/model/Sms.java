package com.lengzq.model;

public class Sms {
    private Long id;

    private String phone;

    private Integer smType;

    private String sms;

    private String releaseTime;

    private String expireTime;

    private Integer state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getSmType() {
        return smType;
    }

    public void setSmType(Integer smType) {
        this.smType = smType;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms == null ? null : sms.trim();
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime == null ? null : releaseTime.trim();
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime == null ? null : expireTime.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Sms{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", smType=" + smType +
                ", sms='" + sms + '\'' +
                ", releaseTime='" + releaseTime + '\'' +
                ", expireTime='" + expireTime + '\'' +
                ", state=" + state +
                '}';
    }
}