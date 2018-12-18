package com.ptlogie.domain;

import java.util.Date;

public class Rule {
    private Integer id;

    private Integer equipmentid;

    private Float hightemperature;

    private Float lowtemperature;

    private Float highhumidity;

    private Float lowhumidity;

    private Date updatetime;

    private Integer sceneid;

    private Float alarmlowtemp;

    private Float alarmhightemp;

    private Float alarmlowhumi;

    private Float alarmhighhumi;

    private String linkmanname;

    private Integer agressivealarm;

    private Integer firealarm;

    private Integer wateralarm;

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

    public Float getHightemperature() {
        return hightemperature;
    }

    public void setHightemperature(Float hightemperature) {
        this.hightemperature = hightemperature;
    }

    public Float getLowtemperature() {
        return lowtemperature;
    }

    public void setLowtemperature(Float lowtemperature) {
        this.lowtemperature = lowtemperature;
    }

    public Float getHighhumidity() {
        return highhumidity;
    }

    public void setHighhumidity(Float highhumidity) {
        this.highhumidity = highhumidity;
    }

    public Float getLowhumidity() {
        return lowhumidity;
    }

    public void setLowhumidity(Float lowhumidity) {
        this.lowhumidity = lowhumidity;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getSceneid() {
        return sceneid;
    }

    public void setSceneid(Integer sceneid) {
        this.sceneid = sceneid;
    }

    public Float getAlarmlowtemp() {
        return alarmlowtemp;
    }

    public void setAlarmlowtemp(Float alarmlowtemp) {
        this.alarmlowtemp = alarmlowtemp;
    }

    public Float getAlarmhightemp() {
        return alarmhightemp;
    }

    public void setAlarmhightemp(Float alarmhightemp) {
        this.alarmhightemp = alarmhightemp;
    }

    public Float getAlarmlowhumi() {
        return alarmlowhumi;
    }

    public void setAlarmlowhumi(Float alarmlowhumi) {
        this.alarmlowhumi = alarmlowhumi;
    }

    public Float getAlarmhighhumi() {
        return alarmhighhumi;
    }

    public void setAlarmhighhumi(Float alarmhighhumi) {
        this.alarmhighhumi = alarmhighhumi;
    }

    public String getLinkmanname() {
        return linkmanname;
    }

    public void setLinkmanname(String linkmanname) {
        this.linkmanname = linkmanname == null ? null : linkmanname.trim();
    }

    public Integer getAgressivealarm() {
        return agressivealarm;
    }

    public void setAgressivealarm(Integer agressivealarm) {
        this.agressivealarm = agressivealarm;
    }

    public Integer getFirealarm() {
        return firealarm;
    }

    public void setFirealarm(Integer firealarm) {
        this.firealarm = firealarm;
    }

    public Integer getWateralarm() {
        return wateralarm;
    }

    public void setWateralarm(Integer wateralarm) {
        this.wateralarm = wateralarm;
    }
}