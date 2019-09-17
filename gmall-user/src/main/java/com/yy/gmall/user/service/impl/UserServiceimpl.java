package com.yy.gmall.user.service.impl;

import com.yy.gmall.user.bean.UmsMemberReceiveAddress;
import com.yy.gmall.user.bean.UserMember;
import com.yy.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.yy.gmall.user.mapper.UserMapper;
import com.yy.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    UserMapper userMapper;
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UserMember> getAllUser() {
       // List<UserMember> userMemberList= userMapper.selectAllUser();
        List<UserMember> userMemberList=userMapper.selectAllUser();
        return userMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAdressByMemberId(String memberId) {
        //根据外键查询
        //封装的属性对象

        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);

//        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList=umsMemberReceiveAddressMapper.selectByExample(umsMemberReceiveAddress);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList=umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);

        return umsMemberReceiveAddressList;
    }


}
