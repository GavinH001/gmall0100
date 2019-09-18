package com.yy.gmall.user.controller;

import com.yy.gmall.bean.UmsMember;
import com.yy.gmall.bean.UmsMemberReceiveAddress;
import com.yy.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;




    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }




    @RequestMapping("getReceiveAdressByMemberId")
    @ResponseBody
//传参处的RequestBody表示可以接受到前端传的jason类型
    public List<UmsMemberReceiveAddress> getReceiveAdressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddress = userService.getReceiveAdressByMemberId(memberId);
        return umsMemberReceiveAddress;
    }


}
