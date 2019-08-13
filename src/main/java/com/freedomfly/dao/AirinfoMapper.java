package com.freedomfly.dao;

import com.freedomfly.entity.AirInfo;
import java.util.List;

public interface AirinfoMapper {
    int deleteByPrimaryKey(Integer airId);

    int insert(AirInfo record);

    AirInfo selectByPrimaryKey(Integer airId);

    List<AirInfo> selectAll();

    int updateByPrimaryKey(AirInfo record);
}