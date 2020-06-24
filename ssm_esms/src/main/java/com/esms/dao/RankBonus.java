package com.esms.dao;

public class RankBonus {
    private Integer rbId;//职称id，主键

    private String rankName;//职称名称

    private Integer rbBonus;//奖金

    public Integer getRbId() {
        return rbId;
    }

    public void setRbId(Integer rbId) {
        this.rbId = rbId;
    }

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName == null ? null : rankName.trim();
    }

    public Integer getRbBonus() {
        return rbBonus;
    }

    public void setRbBonus(Integer rbBonus) {
        this.rbBonus = rbBonus;
    }

    @Override
    public String toString() {
        return "RankBonus{" +
                "rbId=" + rbId +
                ", rankName='" + rankName + '\'' +
                ", rbBonus=" + rbBonus +
                '}';
    }
}