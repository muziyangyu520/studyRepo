package com.li.hello.mapper;

import com.li.hello.entity.SysBinarFile;

public interface SysBinarFileMapper {
    int deleteByPrimaryKey(String fileId);

    int insert(SysBinarFile record);

    int insertSelective(SysBinarFile record);

    SysBinarFile selectByPrimaryKey(String fileId);

    int updateByPrimaryKeySelective(SysBinarFile record);

    int updateByPrimaryKey(SysBinarFile record);
}