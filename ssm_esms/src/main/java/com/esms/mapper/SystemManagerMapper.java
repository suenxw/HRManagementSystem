package com.esms.mapper;

import com.esms.dao.SystemManager;

public interface SystemManagerMapper {

    int deleteByPrimaryKey(Integer smId);

    int insert(SystemManager record);

    int insertSelective(SystemManager record);

    SystemManager selectByPrimaryKey(Integer smId);

    int updateByPrimaryKeySelective(SystemManager record);

    int updateByPrimaryKey(SystemManager record);

    SystemManager selectByAccountAndPassword(SystemManager systemManager);
}