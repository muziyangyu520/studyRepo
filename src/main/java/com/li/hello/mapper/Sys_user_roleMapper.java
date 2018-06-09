package com.li.hello.mapper;

import com.li.hello.entity.Sys_user_role;

public interface Sys_user_roleMapper {
    int deleteByPrimaryKey(String userRoleId);

    int insert(Sys_user_role record);

    int insertSelective(Sys_user_role record);

    Sys_user_role selectByPrimaryKey(String userRoleId);

    int updateByPrimaryKeySelective(Sys_user_role record);

    int updateByPrimaryKey(Sys_user_role record);
}