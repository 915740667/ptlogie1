package com.ptlogie.domain;

import java.util.Date;

public class Equimentlog {
    private Integer id;

    private Integer equipmentid;

    private Integer gatewayid;

    private Integer relayid;

    private String operationname;

    private String equimentname;

    private Date operationtime;

    private String operation;

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

    public String getOperationname() {
        return operationname;
    }

    public void setOperationname(String operationname) {
        this.operationname = operationname == null ? null : operationname.trim();
    }

    public String getEquimentname() {
        return equimentname;
    }

    public void setEquimentname(String equimentname) {
        this.equimentname = equimentname == null ? null : equimentname.trim();
    }

    public Date getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(Date operationtime) {
        this.operationtime = operationtime;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }
}