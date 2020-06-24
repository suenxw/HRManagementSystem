package com.esms.dao;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Employee {
    private Integer eId;//id主键

    private String eAccount;//工号

    private String ePassword;//密码

    private String eName;//姓名

    private String eIdcard;//身份证号

    private String  eSex;//性别

    private String eDagree;//学历

    private Date eBirthday;//出生年月

    private String eEmail;//邮箱

    private String ePhone;//电话

    private String eHometown;//家庭地址

    private Integer eRank;//职称对应的id
//    private RankBonus rankBonus;

    private String eHeadPath;//头像地址

    private String eUrgentPerson;//紧急联系人

    private String eUrgentPhone;//紧急联系人电话

    private Integer pId;//岗位对应的id
//    private Position position;
    private Integer dId;//部门对应的id
//    private Department department;

    private Double eBasePay;//基本工资

    private Integer eIsdel;//是否被删除，没有被删除为1，已经被删除为0

    private Date eEntryTime;//加入时间

    private Date eLeaveTime;//离开时间

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String geteAccount() {
        return eAccount;
    }

    public void seteAccount(String eAccount) {
        this.eAccount = eAccount == null ? null : eAccount.trim();
    }

    public String getePassword() {
        return ePassword;
    }

    public void setePassword(String ePassword) {
        this.ePassword = ePassword == null ? null : ePassword.trim();
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName == null ? null : eName.trim();
    }

    public String geteIdcard() {
        return eIdcard;
    }

    public void seteIdcard(String eIdcard) {
        this.eIdcard = eIdcard == null ? null : eIdcard.trim();
    }

    public String geteSex() {
        return eSex;
    }

    public void seteSex(String eSex) {
        this.eSex = eSex;
    }

    public String geteDagree() {
        return eDagree;
    }

    public void seteDagree(String eDagree) {
        this.eDagree = eDagree == null ? null : eDagree.trim();
    }

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    public Date geteBirthday() {
        return eBirthday;
    }
    //1）入参时，请求报文只需要传入yyyymmddhhmmss字符串进来，则自动转换为Date类型数据。2）出参时，Date类型的数据自动转换为14位的字符串返回出去。

    public void seteBirthday(Date eBirthday) {
        this.eBirthday = eBirthday;
    }

    public String geteEmail() {
        return eEmail;
    }

    public void seteEmail(String eEmail) {
        this.eEmail = eEmail == null ? null : eEmail.trim();
    }

    public String getePhone() {
        return ePhone;
    }

    public void setePhone(String ePhone) {
        this.ePhone = ePhone == null ? null : ePhone.trim();
    }

    public String geteHometown() {
        return eHometown;
    }

    public void seteHometown(String eHometown) {
        this.eHometown = eHometown == null ? null : eHometown.trim();
    }

    public Integer geteRank() {
        return eRank;
    }

    public void seteRank(Integer eRank) {
        this.eRank = eRank;
    }

    public String geteHeadPath() {
        return eHeadPath;
    }

    public void seteHeadPath(String eHeadPath) {
        this.eHeadPath = eHeadPath == null ? null : eHeadPath.trim();
    }

    public String geteUrgentPerson() {
        return eUrgentPerson;
    }

    public void seteUrgentPerson(String eUrgentPerson) {
        this.eUrgentPerson = eUrgentPerson == null ? null : eUrgentPerson.trim();
    }

    public String geteUrgentPhone() {
        return eUrgentPhone;
    }

    public void seteUrgentPhone(String eUrgentPhone) {
        this.eUrgentPhone = eUrgentPhone == null ? null : eUrgentPhone.trim();
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

//    public RankBonus getRankBonus() {
//        return rankBonus;
//    }
//
//    public void setRankBonus(RankBonus rankBonus) {
//        this.rankBonus = rankBonus;
//    }
//
//    public Position getPosition() {
//        return position;
//    }
//
//    public void setPosition(Position position) {
//        this.position = position;
//    }
//
//    public Department getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(Department department) {
//        this.department = department;
//    }

    public Double geteBasePay() {
        return eBasePay;
    }

    public void seteBasePay(Double eBasePay) {
        this.eBasePay = eBasePay;
    }

    public Integer geteIsdel() {
        return eIsdel;
    }

    public void seteIsdel(Integer eIsdel) {
        this.eIsdel = eIsdel;
    }

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    public Date geteEntryTime() {
        return eEntryTime;
    }

    public void seteEntryTime(Date eEntryTime) {
        this.eEntryTime = eEntryTime;
    }

    public Date geteLeaveTime() {
        return eLeaveTime;
    }

    public void seteLeaveTime(Date eLeaveTime) {
        this.eLeaveTime = eLeaveTime;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", eAccount='" + eAccount + '\'' +
                ", ePassword='" + ePassword + '\'' +
                ", eName='" + eName + '\'' +
                ", eIdcard='" + eIdcard + '\'' +
                ", eSex=" + eSex +
                ", eDagree='" + eDagree + '\'' +
                ", eBirthday=" + eBirthday +
                ", eEmail='" + eEmail + '\'' +
                ", ePhone='" + ePhone + '\'' +
                ", eHometown='" + eHometown + '\'' +
                ", eRank=" + eRank +
                ", eHeadPath='" + eHeadPath + '\'' +
                ", eUrgentPerson='" + eUrgentPerson + '\'' +
                ", eUrgentPhone='" + eUrgentPhone + '\'' +
                ", pId=" + pId +
                ", dId=" + dId +
                ", eBasePay=" + eBasePay +
                ", eIsdel=" + eIsdel +
                ", eEntryTime=" + eEntryTime +
                ", eLeaveTime=" + eLeaveTime +
                '}';
    }
}