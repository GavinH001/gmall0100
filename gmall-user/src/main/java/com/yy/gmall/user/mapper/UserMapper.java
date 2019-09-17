package com.yy.gmall.user.mapper;

import com.yy.gmall.user.bean.UserMember;

import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper <UserMember>{
    List<UserMember> selectAllUser();




}
