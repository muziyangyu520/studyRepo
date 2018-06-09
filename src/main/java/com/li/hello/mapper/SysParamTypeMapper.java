package com.li.hello.mapper;

import com.li.hello.entity.SysParamType;

public interface SysParamTypeMapper {
    int deleteByPrimaryKey(String paramTypeId);

    int insert(SysParamType record);

    int insertSelective(SysParamType record);

    SysParamType selectByPrimaryKey(String paramTypeId);

    int updateByPrimaryKeySelective(SysParamType record);

    int updateByPrimaryKey(SysParamType record);
}