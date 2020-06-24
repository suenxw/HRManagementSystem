package com.esms.service;

import com.esms.dao.WorkingYearsBonus;

import java.util.List;


public interface IWorkYearService {
    //添加工龄奖金记录
    boolean addWorkYearBonus(WorkingYearsBonus wyb);

    //删除
    boolean moveWorkYearBonus(int wybId);

    //修改
    boolean modifyWorkYearBonus(WorkingYearsBonus wyb);

    //查询所有
    List<WorkingYearsBonus> findAll();

    //根据id查询
    WorkingYearsBonus findById(int wybId);


    //统计是否存在该工龄
    int Count(int wybYear);

    List<WorkingYearsBonus> findSelective(WorkingYearsBonus record);

    WorkingYearsBonus findByYear(int year);


}
