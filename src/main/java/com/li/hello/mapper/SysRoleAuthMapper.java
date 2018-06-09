package com.li.hello.mapper;

import com.li.hello.entity.SysRoleAuth;

public interface SysRoleAuthMapper {
    int deleteByPrimaryKey(String sysAccreditId);

    int insert(SysRoleAuth record);

    int insertSelective(SysRoleAuth record);

    SysRoleAuth selectByPrimaryKey(String sysAccreditId);

    int updateByPrimaryKeySelective(SysRoleAuth record);

    int updateByPrimaryKey(SysRoleAuth record);
}