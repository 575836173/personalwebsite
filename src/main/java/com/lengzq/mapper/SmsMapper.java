package com.lengzq.mapper;

import com.lengzq.model.Sms;

public interface SmsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Sms record);

    int insertSelective(Sms record);

    Sms selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Sms record);

    int updateByPrimaryKey(Sms record);
}