package com.esms.dao;

public class SystemManager {
    private Integer smId;//系统管理员ID，主键

    private String smAccount;//账户

    private String smPassword;//密码

    public Integer getSmId() {
        return smId;
    }

    public void setSmId(Integer smId) {
        this.smId = smId;
    }

    public String getSmAccount() {
        return smAccount;
    }

    public void setSmAccount(String smAccount) {
        this.smAccount = smAccount == null ? null : smAccount.trim();
    }

    public String getSmPassword() {
        return smPassword;
    }

    public void setSmPassword(String smPassword) {
        this.smPassword = smPassword == null ? null : smPassword.trim();
    }

    @Override
    public String toString() {
        return "SystemManager{" +
                "smId=" + smId +
                ", smAccount='" + smAccount + '\'' +
                ", smPassword='" + smPassword + '\'' +
                '}';
    }
}