package com.esms.mapper;

import com.esms.dao.WorkingYearsBonus;

import java.util.List;

public interface WorkingYearsBonusMapper {
    int deleteByPrimaryKey(Integer wybId);

    int insert(WorkingYearsBonus record);

    int insertSelective(WorkingYearsBonus record);

    WorkingYearsBonus selectByPrimaryKey(Integer wybId);

    int updateByPrimaryKeySelective(WorkingYearsBonus record);

    int updateByPrimaryKey(WorkingYearsBonus record);

    List<WorkingYearsBonus> selectAll();

    int countByYear(Integer year);

    List<WorkingYearsBonus> findSelective(WorkingYearsBonus record);

    WorkingYearsBonus findByYear(int year);
}