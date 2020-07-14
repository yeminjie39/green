package com.smart.shop.controller;

import com.smart.shop.domain.entity.Member;
import com.smart.shop.service.MemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml","classpath:spring-context.xml"})
public class MemberControllerTest {
    @Resource
    MemberService memberService;

    @Test
    public void query() {
        Member query = memberService.query(1);
        System.out.println(query);
    }
}
