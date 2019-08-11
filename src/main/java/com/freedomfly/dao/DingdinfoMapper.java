package com.freedomfly.dao;

import com.freedomfly.entity.DingdInfo;
import java.util.List;

public interface DingdinfoMapper {
    int deleteByPrimaryKey(Integer dingdId);

    int insert(DingdInfo record);

    DingdInfo selectByPrimaryKey(Integer dingdId);

    List<DingdInfo> selectAll();

    int updateByPrimaryKey(DingdInfo record);
}