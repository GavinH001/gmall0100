package com.yy.gmall.user.mapper;

import com.yy.gmall.user.bean.UmsMemberReceiveAddress;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UmsMemberReceiveAddressMapper extends Mapper<UmsMemberReceiveAddress> {
    List<UmsMemberReceiveAddress> selectReceiveAdressByMemberId();
}
