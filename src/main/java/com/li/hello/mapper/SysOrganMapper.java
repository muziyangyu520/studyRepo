package com.li.hello.mapper;

import com.li.hello.entity.SysOrgan;

public interface SysOrganMapper {
    int deleteByPrimaryKey(String orgId);

    int insert(SysOrgan record);

    int insertSelective(SysOrgan record);

    SysOrgan selectByPrimaryKey(String orgId);

    int updateByPrimaryKeySelective(SysOrgan record);

    int updateByPrimaryKey(SysOrgan record);
}