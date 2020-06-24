package com.esms.service;

import com.esms.dao.MonthlyAttendance;


public interface IMonthlyAttendanceService {
    void deleteByPrimaryKey(int id);

    void deleteByQuery(int[] ids);

    MonthlyAttendance selectByPrimaryKey(int id);

    void updateByPrimaryKeySelective(MonthlyAttendance monthlyAttendance);
}
