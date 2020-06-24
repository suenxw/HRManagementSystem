package com.esms.vo;

/**
 * @program: ssm
 * @Description：
 */
public class EchSalaryPercent {
    private String Department = null;
    private Double Salary = 0.00;

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }
    public EchSalaryPercent(){}

    public EchSalaryPercent(String department, Double salary) {
        Department = department;
        Salary = salary;
    }
}
