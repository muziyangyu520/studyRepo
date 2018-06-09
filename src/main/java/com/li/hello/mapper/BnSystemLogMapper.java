package com.li.hello.mapper;

import com.li.hello.entity.BnSystemLog;

public interface BnSystemLogMapper {
    int deleteByPrimaryKey(String logId);

    int insert(BnSystemLog record);

    int insertSelective(BnSystemLog record);

    BnSystemLog selectByPrimaryKey(String logId);

    int updateByPrimaryKeySelective(BnSystemLog record);

    int updateByPrimaryKeyWithBLOBs(BnSystemLog record);

    int updateByPrimaryKey(BnSystemLog record);
}