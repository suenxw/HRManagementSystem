package com.esms.service;

import com.esms.exception.CustomException;
import com.esms.dao.Employee;
import com.esms.dao.SystemManager;


public interface ILoginService {
    public Employee findEmployeeByIdAndPassword(String account, String password) throws CustomException;
    public SystemManager findSystemManagerByIdAndPassword(String account, String password) throws CustomException;
    public Employee findEmployeeById(int id);
    public SystemManager findSystemManagerById(int id);
}
