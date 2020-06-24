package com.esms.mapper;

import com.esms.dao.KeyValue;

public interface KeyValueMapper {

    int deleteByPrimaryKey(Integer kvId);
    //通过主键删除

    int insert(KeyValue record);

    int insertSelective(KeyValue record);

    KeyValue selectByPrimaryKey(Integer kvId);
    //通过主键查找

    int updateByPrimaryKeySelective(KeyValue record);

    int updateByPrimaryKey(KeyValue record);

    KeyValue selectBykvKey(String kvKey);
    //通过工资项名称查找

}