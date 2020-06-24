package com.esms.service.impl;

import com.esms.mapper.MonthlyAttendanceMapper;
import com.esms.dao.MonthlyAttendance;
import com.esms.service.IMonthlyAttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @DATE: 2019/12/9 8:52
 */
@Service
public class MonthlyAttendanceServiceImpl implements IMonthlyAttendanceService {
    @Autowired
    private MonthlyAttendanceMapper monthlyAttendanceMapper;
    public MonthlyAttendance t(int id) {
        return monthlyAttendanceMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteByPrimaryKey(int id) {
        monthlyAttendanceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByQuery(int[] ids) {
        monthlyAttendanceMapper.deleteByQuery(ids);
    }

    @Override
    public MonthlyAttendance selectByPrimaryKey(int id) {
        return monthlyAttendanceMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateByPrimaryKeySelective(MonthlyAttendance monthlyAttendance) {
        monthlyAttendanceMapper.updateByPrimaryKeySelective(monthlyAttendance);
    }
}
