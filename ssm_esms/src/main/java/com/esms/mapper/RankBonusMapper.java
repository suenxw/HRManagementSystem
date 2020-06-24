package com.esms.mapper;

import com.esms.dao.RankBonus;

import java.util.List;

public interface RankBonusMapper {
    int deleteByPrimaryKey(Integer rbId);
    //通过主键rdId删除

    int insert(RankBonus record);

    int insertSelective(RankBonus record);

    RankBonus selectByPrimaryKey(Integer rbId);
    //通过主键查找

    List<RankBonus> selectAll();
    //查找全部

    int updateByPrimaryKeySelective(RankBonus record);
    //通过rbid来更新

    int updateByPrimaryKey(RankBonus record);
    //通过rbid来更新，有选择性的

    int CountByRankName(String name);
    //计数所有rank_name为。。。的记录

    List<RankBonus> findSelective(RankBonus record);
    //通过rank_name查找，有选择性的

    RankBonus findByname(String name);
    //通过rank_name查找，有选择性的

}