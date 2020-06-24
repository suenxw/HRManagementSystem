package com.esms.dao;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Salary {
    private Integer sId;//工资表id，主键

    private Integer eId;//员工id，外键
    private Employee employee;
    private Integer dId;//部门id，外键
    private Department department;

    private Date sTime;//时间

    private Integer sState;//状态，0未发，1已发

    private Double basePay;//基本工资

    private Double foodPay;//餐补

    private Double postPay;//岗位补贴

    private Double workingYearPay;//工龄奖金

    private Double rankPay;//职称奖金

    private Double trafficPay;//交通补贴

    private Double persionPay;//养老保险

    private Double medicalPay;//医疗保险

    private Double unemploymentPay;//事业保险

    private Double injuryPay;//工伤保险

    private Double birthPay;//生育保险

    private Double housingPay;//住房公积金

    private Double latePay;//迟到罚款

    private Double earlyPay;//早退罚金

    private Double overtimePay;//加班奖金

    private Double sickPay;//病假扣额

    private Double thingPay;//事假扣额

    private Double businessTravelPay;//出差补贴

    private Double fullAttendancePay;//全勤奖

    private Double rissuePay;//补发金额

    private Double individualIncomeTax;//个人所得税

    private Double shouldPay;//应发工资

    private Double actualPay;//实发工资

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @JsonFormat(pattern="yyyy-MM",timezone = "GMT+8")
    public Date getsTime() {
        return sTime;
    }

    public void setsTime(Date sTime) {
        this.sTime = sTime;
    }

    public Integer getsState() {
        return sState;
    }

    public void setsState(Integer sState) {
        this.sState = sState;
    }

    public Double getBasePay() {
        return basePay;
    }

    public void setBasePay(Double basePay) {
        this.basePay = basePay;
    }

    public Double getFoodPay() {
        return foodPay;
    }

    public void setFoodPay(Double foodPay) {
        this.foodPay = foodPay;
    }

    public Double getPostPay() {
        return postPay;
    }

    public void setPostPay(Double postPay) {
        this.postPay = postPay;
    }

    public Double getWorkingYearPay() {
        return workingYearPay;
    }

    public void setWorkingYearPay(Double workingYearPay) {
        this.workingYearPay = workingYearPay;
    }

    public Double getRankPay() {
        return rankPay;
    }

    public void setRankPay(Double rankPay) {
        this.rankPay = rankPay;
    }

    public Double getTrafficPay() {
        return trafficPay;
    }

    public void setTrafficPay(Double trafficPay) {
        this.trafficPay = trafficPay;
    }

    public Double getPersionPay() {
        return persionPay;
    }

    public void setPersionPay(Double persionPay) {
        this.persionPay = persionPay;
    }

    public Double getMedicalPay() {
        return medicalPay;
    }

    public void setMedicalPay(Double medicalPay) {
        this.medicalPay = medicalPay;
    }

    public Double getUnemploymentPay() {
        return unemploymentPay;
    }

    public void setUnemploymentPay(Double unemploymentPay) {
        this.unemploymentPay = unemploymentPay;
    }

    public Double getInjuryPay() {
        return injuryPay;
    }

    public void setInjuryPay(Double injuryPay) {
        this.injuryPay = injuryPay;
    }

    public Double getBirthPay() {
        return birthPay;
    }

    public void setBirthPay(Double birthPay) {
        this.birthPay = birthPay;
    }

    public Double getHousingPay() {
        return housingPay;
    }

    public void setHousingPay(Double housingPay) {
        this.housingPay = housingPay;
    }

    public Double getLatePay() {
        return latePay;
    }

    public void setLatePay(Double latePay) {
        this.latePay = latePay;
    }

    public Double getEarlyPay() {
        return earlyPay;
    }

    public void setEarlyPay(Double earlyPay) {
        this.earlyPay = earlyPay;
    }

    public Double getOvertimePay() {
        return overtimePay;
    }

    public void setOvertimePay(Double overtimePay) {
        this.overtimePay = overtimePay;
    }

    public Double getSickPay() {
        return sickPay;
    }

    public void setSickPay(Double sickPay) {
        this.sickPay = sickPay;
    }

    public Double getThingPay() {
        return thingPay;
    }

    public void setThingPay(Double thingPay) {
        this.thingPay = thingPay;
    }

    public Double getBusinessTravelPay() {
        return businessTravelPay;
    }

    public void setBusinessTravelPay(Double businessTravelPay) {
        this.businessTravelPay = businessTravelPay;
    }

    public Double getFullAttendancePay() {
        return fullAttendancePay;
    }

    public void setFullAttendancePay(Double fullAttendancePay) {
        this.fullAttendancePay = fullAttendancePay;
    }

    public Double getRissuePay() {
        return rissuePay;
    }

    public void setRissuePay(Double rissuePay) {
        this.rissuePay = rissuePay;
    }

    public Double getIndividualIncomeTax() {
        return individualIncomeTax;
    }

    public void setIndividualIncomeTax(Double individualIncomeTax) {
        this.individualIncomeTax = individualIncomeTax;
    }

    public Double getShouldPay() {
        return shouldPay;
    }

    public void setShouldPay(Double shouldPay) {
        this.shouldPay = shouldPay;
    }

    public Double getActualPay() {
        return actualPay;
    }

    public void setActualPay(Double actualPay) {
        this.actualPay = actualPay;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "sId=" + sId +
                ", eId=" + eId +
                ", employee=" + employee +
                ", dId=" + dId +
                ", department=" + department +
                ", sTime=" + sTime +
                ", sState=" + sState +
                ", basePay=" + basePay +
                ", foodPay=" + foodPay +
                ", postPay=" + postPay +
                ", workingYearPay=" + workingYearPay +
                ", rankPay=" + rankPay +
                ", trafficPay=" + trafficPay +
                ", persionPay=" + persionPay +
                ", medicalPay=" + medicalPay +
                ", unemploymentPay=" + unemploymentPay +
                ", injuryPay=" + injuryPay +
                ", birthPay=" + birthPay +
                ", housingPay=" + housingPay +
                ", latePay=" + latePay +
                ", earlyPay=" + earlyPay +
                ", overtimePay=" + overtimePay +
                ", sickPay=" + sickPay +
                ", thingPay=" + thingPay +
                ", businessTravelPay=" + businessTravelPay +
                ", fullAttendancePay=" + fullAttendancePay +
                ", rissuePay=" + rissuePay +
                ", individualIncomeTax=" + individualIncomeTax +
                ", shouldPay=" + shouldPay +
                ", actualPay=" + actualPay +
                '}';
    }
}