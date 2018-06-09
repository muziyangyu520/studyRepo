package com.li.hello.mapper;

import com.li.hello.entity.SysParam;

public interface SysParamMapper {
    int deleteByPrimaryKey(String paramId);

    int insert(SysParam record);

    int insertSelective(SysParam record);

    SysParam selectByPrimaryKey(String paramId);

    int updateByPrimaryKeySelective(SysParam record);

    int updateByPrimaryKey(SysParam record);
}