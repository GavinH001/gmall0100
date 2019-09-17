package com.yy.gmall.user.service;

import com.yy.gmall.user.bean.UmsMemberReceiveAddress;
import com.yy.gmall.user.bean.UserMember;
import com.yy.gmall.user.bean.UserMemberLevel;

import java.util.List;

public interface UserService {


    List<UserMember> getAllUser();


    List<UmsMemberReceiveAddress> getReceiveAdressByMemberId(String memberId);

}
