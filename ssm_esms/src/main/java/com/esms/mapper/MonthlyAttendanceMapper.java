package com.esms.mapper;

import com.esms.dao.MonthlyAttendance;

import java.util.List;
import java.util.Map;

public interface MonthlyAttendanceMapper {

    int deleteByPrimaryKey(Integer maId);
    //通过主键删除

    int insert(MonthlyAttendance record);

    int insertSelective(MonthlyAttendance record);

    MonthlyAttendance selectByPrimaryKey(Integer maId);
    //通过主键查找

    int updateByPrimaryKeySelective(MonthlyAttendance record);

    int updateByPrimaryKey(MonthlyAttendance record);

    MonthlyAttendance selectByeIdAndDate(int eId, String date);
    //通过员工ID和日期来选择

    void deleteByQuery(int[] ids);
    //删除考勤记录，通过id，传入的是一个数组

    List<MonthlyAttendance> selectMonthlyAttendanceMapperByeEidAndTime(Map<String, Object> map);
    //按员工id和年份查询考勤
}