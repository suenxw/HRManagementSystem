package com.esms.service;

import com.esms.exception.CustomException;
import com.esms.dao.Employee;
import com.esms.vo.EmployeeCustomVo;
import com.esms.dao.Salary;
import com.esms.dao.SystemManager;

import java.util.List;


public interface IUserInforService {
    public void updateSystemManagePassword(int id, SystemManager systemManager);
    public void updateEmployeePassword(int id, String oldPassword, String newPassword) throws CustomException;
    public EmployeeCustomVo getInforEmployee(int id);
    public int  updateEmploueeById(int id, Employee employee);
    // 查找员工个人的某年工资记录
    public List<Salary> getEmployeeSalaryList(int eId, String year);


    public void resetPassword(int eid);
}
