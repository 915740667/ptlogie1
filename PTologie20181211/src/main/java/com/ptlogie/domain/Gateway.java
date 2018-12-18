package com.ptlogie.domain;

import java.util.Date;

public class Gateway {
    private Integer gatewayid;

    private String identifying;

    private String gatename;

    private String hostname;

    private String chain;

    private Integer status;

    private Date updatetime;

    private String content;

    private String period;

    public Integer getGatewayid() {
        return gatewayid;
    }

    public void setGatewayid(Integer gatewayid) {
        this.gatewayid = gatewayid;
    }

    public String getIdentifying() {
        return identifying;
    }

    public void setIdentifying(String identifying) {
        this.identifying = identifying == null ? null : identifying.trim();
    }

    public String getGatename() {
        return gatename;
    }

    public void setGatename(String gatename) {
        this.gatename = gatename == null ? null : gatename.trim();
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname == null ? null : hostname.trim();
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain == null ? null : chain.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period == null ? null : period.trim();
    }
}