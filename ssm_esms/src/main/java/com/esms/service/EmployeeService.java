package com.esms.service;

import com.esms.dao.Employee;

public interface EmployeeService {
    void deleteByPrimaryKey(int id);

    void deleteByQuery(int[] ids);

    void insert(Employee employee);

    Employee findByeAccount(String eAccount);

    void updateByPrimaryKeySelective(Employee employee);
}
