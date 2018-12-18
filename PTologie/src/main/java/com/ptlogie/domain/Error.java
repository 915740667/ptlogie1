package com.ptlogie.domain;

import java.util.Date;

public class Error {
    private Integer id;

    private String scenename;

    private Integer scenetype;

    private Date alarmtime;

    private String alarmdata;

    private Integer status;

    private Integer type;

    private String manco;

    private Integer equipmentid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getManco() {
        return manco;
    }

    public void setManco(String manco) {
        this.manco = manco == null ? null : manco.trim();
    }

    public Integer getEquipmentid() {
        return equipmentid;
    }

    public void setEquipmentid(Integer equipmentid) {
        this.equipmentid = equipmentid;
    }
}