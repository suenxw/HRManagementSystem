package com.esms.mapper;

import com.esms.dao.Department;

import java.util.List;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer dId);
    //通过主键删除部门

    int insert(Department record);
    //插入

    int insertSelective(Department record);
    //插入

    Department selectByPrimaryKey(Integer dId);
    //通过主键查找部门

    List<Department> selectAll();
    //查找所有

    int updateByPrimaryKeySelective(Department record);
    //通过主键更新部门

    int updateByPrimaryKey(Department record);
    //通过主键更新部门

    List<Department> findSelective(Department department);
    //通过部门名字查找部门，模糊查询

    void deleteByQuery(int[] ids);
    //删除部门，参数是一个数组，实际上是将dIsdel设置为0

    Department findByDname(String d_name);
    //通过名字查找部门
}