package com.ptlogie.domain;

public class Scene {
    private Integer sceneid;

    private Integer gatewayid;

    private String scenename;

    private String scenetype;

    private String location;

    private String remark;

    public Integer getSceneid() {
        return sceneid;
    }

    public void setSceneid(Integer sceneid) {
        this.sceneid = sceneid;
    }

    public Integer getGatewayid() {
        return gatewayid;
    }

    public void setGatewayid(Integer gatewayid) {
        this.gatewayid = gatewayid;
    }

    public String getScenename() {
        return scenename;
    }

    public void setScenename(String scenename) {
        this.scenename = scenename == null ? null : scenename.trim();
    }



    public String getScenetype() {
		return scenetype;
	}

	public void setScenetype(String scenetype) {
		this.scenetype = scenetype;
	}

	public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}