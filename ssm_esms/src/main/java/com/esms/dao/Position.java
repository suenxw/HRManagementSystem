package com.esms.dao;

public class Position {
    private Integer pId;//岗位id，主键

    private String pName;//岗位名称

    private String pDuty;//岗位描述

    private Double pPostPay;//岗位补贴

    private Integer pIsdel;//是否可用，0表示不可用，1表示可用

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpDuty() {
        return pDuty;
    }

    public void setpDuty(String pDuty) {
        this.pDuty = pDuty == null ? null : pDuty.trim();
    }

    public Double getpPostPay() {
        return pPostPay;
    }

    public void setpPostPay(Double pPostPay) {
        this.pPostPay = pPostPay;
    }

    public Integer getpIsdel() {
        return pIsdel;
    }

    public void setpIsdel(Integer pIsdel) {
        this.pIsdel = pIsdel;
    }

    @Override
    public String toString() {
        return "Position{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", pDuty='" + pDuty + '\'' +
                ", pPostPay=" + pPostPay +
                ", pIsdel=" + pIsdel +
                '}';
    }
}