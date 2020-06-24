package com.esms.mapper;

import com.esms.dao.Position;

import java.util.List;

public interface PositionMapper {

    int deleteByPrimaryKey(Integer pId);
    //通过pid主键删除，实际上是设置pIsdel为0

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(Integer pId);
    //通过主键查找

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);
    //通过主键更新

    List<Position> findSelective(Position position);
    //通过名字查找，有选择的

    void deleteByQuery(int[] ids);
    //通过pid主键删除，实际上是设置pIsdel为0，参数为数组

    Position findByDname(String p_name);
    //通过名字查找
}