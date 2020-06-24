package com.esms.service;

import com.esms.dao.Position;

import java.util.List;


public interface PositionService {
    List<Position> findSelective(Position position);

    int insertSelective(Position position);

    Position findByPrimaryKey(int id);

    void updateByPrimaryKeySelective(Position position);

    void deleteByPrimaryKey(int id);

    void deleteByQuery(int[] ids);

    Position findByDname(String p_name);
}
