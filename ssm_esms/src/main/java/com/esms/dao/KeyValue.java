package com.esms.dao;

public class KeyValue {
    private Integer kvId;//工资管理项，id主键

    private String kvKey;//工资管理项名称

    private double kvValue;//工资管理项金额

    public Integer getKvId() {
        return kvId;
    }

    public void setKvId(Integer kvId) {
        this.kvId = kvId;
    }

    public String getKvKey() {
        return kvKey;
    }

    public void setKvKey(String kvKey) {
        this.kvKey = kvKey == null ? null : kvKey.trim();
    }

    public double getKvValue() {
        return kvValue;
    }

    public void setKvValue(double kvValue) {
        this.kvValue = kvValue;
    }

    @Override
    public String toString() {
        return "KeyValue{" +
                "kvId=" + kvId +
                ", kvKey='" + kvKey + '\'' +
                ", kvValue='" + kvValue + '\'' +
                '}';
    }
}