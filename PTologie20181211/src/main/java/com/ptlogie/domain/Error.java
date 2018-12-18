package com.ptlogie.domain;

import java.util.Date;

public class Error {
    private Integer id;

    private Integer equipmentid;

    private Integer gatewayid;

    private Integer relayid;

    private String scenename;

    private Integer scenetype;

    private Date alarmtime;

    private String alarmdata;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEquipmentid() {
        return equipmentid;
    }

    public void setEquipmentid(Integer equipmentid) {
        this.equipmentid = equipmentid;
    }

    public Integer getGatewayid() {
        return gatewayid;
    }

    public void setGatewayid(Integer gatewayid) {
        this.gatewayid = gatewayid;
    }

    public Integer getRelayid() {
        return relayid;
    }

    public void setRelayid(Integer relayid) {
        this.relayid = relayid;
    }

    public String getScenename() {
        return scenename;
    }

    public void setScenename(String scenename) {
        this.scenename = scenename == null ? null : scenename.trim();
    }

    public Integer getScenetype() {
        return scenetype;
    }

    public void setScenetype(Integer scenetype) {
        this.scenetype = scenetype;
    }

    public Date getAlarmtime() {
        return alarmtime;
    }

    public void setAlarmtime(Date alarmtime) {
        this.alarmtime = alarmtime;
    }

    public String getAlarmdata() {
        return alarmdata;
    }

    public void setAlarmdata(String alarmdata) {
        this.alarmdata = alarmdata == null ? null : alarmdata.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}