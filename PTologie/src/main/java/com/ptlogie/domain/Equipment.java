package com.ptlogie.domain;

import java.util.Date;

public class Equipment {
    private Integer equipmentid;

    private Integer sceneid;

    private Integer equipmenttype;

    private String equipmentname;

    private String snno;

    private String macno;

    private Integer workstatus;

    private Float electric;

    private Integer alarmstatus;

    private Date createtime;

    private String period;

    private String content;

    private String hostname;

    private String gps;

    private String chipsn;

    private String httpsrvurl;

    private String websocketsrvurl;

    private String wirelesschannel;

    private String hardwareupdatedir;

    private String reportcycle;

    private String deviceinterval;

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

    public Float getElectric() {
        return electric;
    }

    public void setElectric(Float electric) {
        this.electric = electric;
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

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period == null ? null : period.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname == null ? null : hostname.trim();
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps == null ? null : gps.trim();
    }

    public String getChipsn() {
        return chipsn;
    }

    public void setChipsn(String chipsn) {
        this.chipsn = chipsn == null ? null : chipsn.trim();
    }

    public String getHttpsrvurl() {
        return httpsrvurl;
    }

    public void setHttpsrvurl(String httpsrvurl) {
        this.httpsrvurl = httpsrvurl == null ? null : httpsrvurl.trim();
    }

    public String getWebsocketsrvurl() {
        return websocketsrvurl;
    }

    public void setWebsocketsrvurl(String websocketsrvurl) {
        this.websocketsrvurl = websocketsrvurl == null ? null : websocketsrvurl.trim();
    }

    public String getWirelesschannel() {
        return wirelesschannel;
    }

    public void setWirelesschannel(String wirelesschannel) {
        this.wirelesschannel = wirelesschannel == null ? null : wirelesschannel.trim();
    }

    public String getHardwareupdatedir() {
        return hardwareupdatedir;
    }

    public void setHardwareupdatedir(String hardwareupdatedir) {
        this.hardwareupdatedir = hardwareupdatedir == null ? null : hardwareupdatedir.trim();
    }

    public String getReportcycle() {
        return reportcycle;
    }

    public void setReportcycle(String reportcycle) {
        this.reportcycle = reportcycle == null ? null : reportcycle.trim();
    }

    public String getDeviceinterval() {
        return deviceinterval;
    }

    public void setDeviceinterval(String deviceinterval) {
        this.deviceinterval = deviceinterval == null ? null : deviceinterval.trim();
    }
}