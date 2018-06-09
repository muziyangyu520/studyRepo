package com.li.hello.mapper;

import com.li.hello.entity.SysResource;

public interface SysResourceMapper {
    int deleteByPrimaryKey(String resId);

    int insert(SysResource record);

    int insertSelective(SysResource record);

    SysResource selectByPrimaryKey(String resId);

    int updateByPrimaryKeySelective(SysResource record);

    int updateByPrimaryKey(SysResource record);
}