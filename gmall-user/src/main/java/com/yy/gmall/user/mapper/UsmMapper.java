package com.yy.gmall.user.mapper;

import com.yy.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UsmMapper extends Mapper <UmsMember>{
    List<UmsMember> selectAllUser();




}
