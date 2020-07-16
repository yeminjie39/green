package com.smart.shop.service;

import com.smart.shop.domain.entity.Member;


public interface LoginService {

    Member selectInfo( Member member);

    //注册用户
    void addLogin(Member member);

}
