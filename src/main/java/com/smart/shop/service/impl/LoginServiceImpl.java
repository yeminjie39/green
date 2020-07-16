package com.smart.shop.service.impl;

import com.smart.shop.domain.entity.Member;
import com.smart.shop.mapper.LoginMapper;
import com.smart.shop.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginMapper loginMapper;

    @Override
    public Member selectInfo(Member member) {
        Member exituser = loginMapper.selectInfo(member);
        if (member.getName().trim() == "") throw new RuntimeException("账号不能为空！");
        if (member.getPassword().trim() == "") throw new RuntimeException("密码不能为空！");
        if (exituser == null) {
            throw new RuntimeException("账号不存在");
        }
        if (exituser.getPassword().equals(member.getPassword())) {

            return exituser;
        } else {
            throw new RuntimeException("账号或密码错误");
        }

    }

    @Override
    public void addLogin(Member member) {
        Member exituser = loginMapper.selectInfo(member);
        if (member.getName().trim() == "") throw new RuntimeException("账号不能为空！");
        if (member.getPassword().trim() == "") throw new RuntimeException("密码不能为空！");
        if (member.getPhone().trim() == "") throw new RuntimeException("手机号不能为空！");
        if (member.getEmail().trim() == "") throw new RuntimeException("邮箱不能为空！");
        if (exituser != null) {
            throw new RuntimeException("账号已存在");
        } else {
            loginMapper.addLogin(member);
        }


    }


}


