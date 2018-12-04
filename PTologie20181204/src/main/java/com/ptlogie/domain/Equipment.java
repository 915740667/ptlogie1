package com.ptlogie.domain;

import java.util.Date;

public class Equipment {
    private Integer equipmentid;

    private Integer sceneid;

    private Integer errorid;

    private Integer equipmenttype;

    private String equipmentname;

    private String snno;

    private String macno;

    private Integer workstatus;

    private Float eletric;

    private Integer alarmstatus;

    private Date createtime;

    public Integer getEquipmentid() {
        return equipmentid;
    }

    public void setEquipmentid(Integer equipmentid) {
        this.equipmentid = equipmentid;
    }

    public Integer getSceneid() {
        return sceneid;
    }

    public void setSceneid(Integer sceneid) {
        this.sceneid = sceneid;
    }

    public Integer getErrorid() {
        return errorid;
    }

    public void setErrorid(Integer errorid) {
        this.errorid = errorid;
    }

    public Integer getEquipmenttype() {
        return equipmenttype;
    }

    public void setEquipmenttype(Integer equipmenttype) {
        this.equipmenttype = equipmenttype;
    }

    public String getEquipmentname() {
        return equipmentname;
    }

    public void setEquipmentname(String equipmentname) {
        this.equipmentname = equipmentname == null ? null : equipmentname.trim();
    }

    public String getSnno() {
        return snno;
    }

    public void setSnno(String snno) {
        this.snno = snno == null ? null : snno.trim();
    }

    public String getMacno() {
        return macno;
    }

    public void setMacno(String macno) {
        this.macno = macno == null ? null : macno.trim();
    }

    public Integer getWorkstatus() {
        return workstatus;
    }

    public void setWorkstatus(Integer workstatus) {
        this.workstatus = workstatus;
    }

    public Float getEletric() {
        return eletric;
    }

    public void setEletric(Float eletric) {
        this.eletric = eletric;
    }

    public Integer getAlarmstatus() {
        return alarmstatus;
    }

    public void setAlarmstatus(Integer alarmstatus) {
        this.alarmstatus = alarmstatus;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}