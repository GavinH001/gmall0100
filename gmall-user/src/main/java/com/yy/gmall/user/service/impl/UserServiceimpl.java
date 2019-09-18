package com.yy.gmall.user.service.impl;

import com.yy.gmall.bean.UmsMember;
import com.yy.gmall.bean.UmsMemberReceiveAddress;
import com.yy.gmall.service.UserService;
import com.yy.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.yy.gmall.user.mapper.UsmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    UsmMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
       // List<UmsMember> umsMemberList= userMapper.selectAllUser();
        List<UmsMember> umsMemberList =userMapper.selectAllUser();
        return umsMemberList;
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
