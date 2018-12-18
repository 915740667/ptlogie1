package com.ptlogie.domain;

public class Relay {
    private Integer relayid;

    private String relayname;

    private String macno;

    private String content;
    
    private int status;
    

    public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Integer getRelayid() {
        return relayid;
    }

    public void setRelayid(Integer relayid) {
        this.relayid = relayid;
    }

    public String getRelayname() {
        return relayname;
    }

    public void setRelayname(String relayname) {
        this.relayname = relayname == null ? null : relayname.trim();
    }

    public String getMacno() {
        return macno;
    }

    public void setMacno(String macno) {
        this.macno = macno == null ? null : macno.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}