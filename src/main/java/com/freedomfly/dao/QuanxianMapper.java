package com.freedomfly.dao;

import com.freedomfly.entity.QuanXian;
import java.util.List;

public interface QuanxianMapper {
    int deleteByPrimaryKey(Integer qxId);

    int insert(QuanXian record);

    QuanXian selectByPrimaryKey(Integer qxId);

    List<QuanXian> selectAll();

    int updateByPrimaryKey(QuanXian record);
}