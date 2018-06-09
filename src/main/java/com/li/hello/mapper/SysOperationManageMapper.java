package com.li.hello.mapper;

import com.li.hello.entity.SysOperationManage;

public interface SysOperationManageMapper {
    int deleteByPrimaryKey(String operId);

    int insert(SysOperationManage record);

    int insertSelective(SysOperationManage record);

    SysOperationManage selectByPrimaryKey(String operId);

    int updateByPrimaryKeySelective(SysOperationManage record);

    int updateByPrimaryKey(SysOperationManage record);
}