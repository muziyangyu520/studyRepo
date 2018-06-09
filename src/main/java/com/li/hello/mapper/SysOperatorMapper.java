package com.li.hello.mapper;

import com.li.hello.entity.SysOperator;

public interface SysOperatorMapper {
    int deleteByPrimaryKey(String optId);

    int insert(SysOperator record);

    int insertSelective(SysOperator record);

    SysOperator selectByPrimaryKey(String optId);

    int updateByPrimaryKeySelective(SysOperator record);

    int updateByPrimaryKey(SysOperator record);
}