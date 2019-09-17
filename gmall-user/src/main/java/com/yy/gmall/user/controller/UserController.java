package com.yy.gmall.user.controller;

import com.yy.gmall.user.bean.UmsMemberReceiveAddress;
import com.yy.gmall.user.bean.UserMember;

import com.yy.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UserMember> getAllUser(){
        List<UserMember> userMembers = userService.getAllUser();
        return userMembers;
    }




    @RequestMapping("getReceiveAdressByMemberId")
    @ResponseBody
//传参处的RequestBody表示可以接受到前端传的jason类型
    public List<UmsMemberReceiveAddress> getReceiveAdressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddress = userService.getReceiveAdressByMemberId(memberId);
        return umsMemberReceiveAddress;
    }


}
