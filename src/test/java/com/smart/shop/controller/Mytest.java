package com.smart.shop.controller;

import com.smart.shop.domain.entity.Member;
import com.smart.shop.domain.entity.Shop;
import com.smart.shop.service.LoginService;
import com.smart.shop.service.ShopService;
import lombok.val;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml","classpath:spring-mybatis.xml"})
public class Mytest {
    @Resource
    LoginService loginService;


    @Test
    public void selectInfo(){
        Member member = new Member();
        member.setName("fu");
        member.setPassword("123");
        Member list = loginService.selectInfo(member);
        System.out.println(list);
    }

    @Test
    public void addLogin(){
        Member member = new Member();
        member.setName("王八");
        member.setPassword("123");
        member.setRealName("5555");
        member.setIdNumber("12344");
        member.setSex("5");
        member.setPhone("123111");
        member.setEmail("123123");
        member.setAddress("55444");

        loginService.addLogin(member);

    }

    @Resource
    ShopService shopService;
    @Test
    public void selectByShopAll(){
        List<Shop> shops1 = shopService.selectByShopAll();
        for (Shop shop : shops1) {
            System.out.println(shop);
        }
    }



}
