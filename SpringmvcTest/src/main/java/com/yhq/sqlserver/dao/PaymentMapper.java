package com.yhq.sqlserver.dao;

import com.yhq.sqlserver.pojo.Payment;
import com.yhq.sqlserver.pojo.PaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.BaseMapper;

public interface PaymentMapper extends BaseMapper<Payment> {
    int countByExample(PaymentExample example);

    int deleteByExample(PaymentExample example);

    List<Payment> selectByExample(PaymentExample example);

    int updateByExampleSelective(@Param("record") Payment record, @Param("example") PaymentExample example);

    int updateByExample(@Param("record") Payment record, @Param("example") PaymentExample example);
}