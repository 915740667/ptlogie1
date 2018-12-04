package com.ptlogie.domain;

import java.util.Date;

public class Datainfo {
    private Integer id;

    private String scnenenmae;

    private String devicename;

    private String remark;

    private Date uptime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScnenenmae() {
        return scnenenmae;
    }

    public void setScnenenmae(String scnenenmae) {
        this.scnenenmae = scnenenmae == null ? null : scnenenmae.trim();
    }

    public String getDevicename() {
        return devicename;
    }

    public void setDevicename(String devicename) {
        this.devicename = devicename == null ? null : devicename.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }
}