package com.yy.gmall.service;

import com.yy.gmall.bean.UmsMemberReceiveAddress;
import com.yy.gmall.bean.UmsMember;

import java.util.List;

public interface UserService {


    List<UmsMember> getAllUser();


    List<UmsMemberReceiveAddress> getReceiveAdressByMemberId(String memberId);

}
