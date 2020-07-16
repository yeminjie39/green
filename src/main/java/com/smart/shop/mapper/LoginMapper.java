package com.smart.shop.mapper;

import com.smart.shop.domain.entity.Member;
import org.apache.ibatis.annotations.Param;


public interface LoginMapper {
    //查询用户
    Member selectInfo(@Param("member") Member member);

    //注册用户
    int addLogin(@Param("member") Member member);
}
