package com.ptlogie.domain;

import java.util.Date;

public class Scene {
    private Integer sceneId;

    private String sceneName;

    private Integer workshopId;

    private String scenelocation;

    private String sceneremark;

    private Integer parentsceneid;

    private Integer state;

    private String scenetype;

    private String devicestatus;

    private Integer sceneusetype;

    private String gateid;

    private Date inserttime;

    private Date updatetime;

    public Integer getSceneId() {
        return sceneId;
    }

    public void setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
    }

    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName == null ? null : sceneName.trim();
    }

    public Integer getWorkshopId() {
        return workshopId;
    }

    public void setWorkshopId(Integer workshopId) {
        this.workshopId = workshopId;
    }

    public String getScenelocation() {
        return scenelocation;
    }

    public void setScenelocation(String scenelocation) {
        this.scenelocation = scenelocation == null ? null : scenelocation.trim();
    }

    public String getSceneremark() {
        return sceneremark;
    }

    public void setSceneremark(String sceneremark) {
        this.sceneremark = sceneremark == null ? null : sceneremark.trim();
    }

    public Integer getParentsceneid() {
        return parentsceneid;
    }

    public void setParentsceneid(Integer parentsceneid) {
        this.parentsceneid = parentsceneid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getScenetype() {
        return scenetype;
    }

    public void setScenetype(String scenetype) {
        this.scenetype = scenetype == null ? null : scenetype.trim();
    }

    public String getDevicestatus() {
        return devicestatus;
    }

    public void setDevicestatus(String devicestatus) {
        this.devicestatus = devicestatus == null ? null : devicestatus.trim();
    }

    public Integer getSceneusetype() {
        return sceneusetype;
    }

    public void setSceneusetype(Integer sceneusetype) {
        this.sceneusetype = sceneusetype;
    }

    public String getGateid() {
        return gateid;
    }

    public void setGateid(String gateid) {
        this.gateid = gateid == null ? null : gateid.trim();
    }

    public Date getInserttime() {
        return inserttime;
    }

    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}