package com.smart.shop.controller;


import com.smart.shop.domain.entity.Member;
import com.smart.shop.service.LoginService;
import com.smart.shop.utils.ResultDate;
import com.smart.shop.utils.StatusType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


@RestController
@RequestMapping("/Member")
public class LoginController {
    //注入service
    @Resource
    private LoginService loginService;

    //查询用户密码
//    @RequestMapping("/selectInfo")
//    public ResultDate<Member> selectInfo(@PathVariable() String name,@PathVariable() String password){
//        Member info = loginService.selectInfo(name, password);
//        return ResultDate.success(StatusType.SUCCESS.getValue(), StatusType.FAILURE.getMsg(),info);
//    }
    @RequestMapping("/selectInfo")
    String selectInfo(Member member, HttpSession session, Model model){
        Member exituser;
        try {
            exituser = loginService.selectInfo(member);
            session.setAttribute("name", exituser);
        }catch (Exception e){
            model.addAttribute("error_msg",e.getMessage());
            return "selectInfo";
        }
        return "index";
    }



    @RequestMapping("/addLogin")
    public ResultDate<Member> addLogin(Member member){
        loginService.addLogin(member);
        return ResultDate.success(StatusType.SUCCESS.getValue(),StatusType.FAILURE.getMsg(),member);



    }


}
