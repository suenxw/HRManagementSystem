package com.esms.mapper;

import com.esms.dao.Employee;

import java.util.List;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer eId);
    //通过主键删除员工，实际上是设置eIddel属性为0

    int insert(Employee record);


    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer eId);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    Employee selectByAccountAndPassword(Employee employee);
    //通过员工号和密码查找

    int countByDid(Integer eId);
    //判断是否有员工依赖该工龄
    int countByRbid(Integer eRank);

    Employee selectByAccount(String eAcount);

//    void deleteByQuery(int[] ids);

    Employee findByeAccount(String eAccount);
    //通过员工号查找

    List<Employee> selectAll();

    int isExistEmployee(String eAccount);

    int selectEidByEaccount(String eAccount);
    //根据员工工号查找员工id
}