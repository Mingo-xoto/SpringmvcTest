package com.yhq.sqlserver.dao;

import com.yhq.sqlserver.pojo.Payment1;
import com.yhq.sqlserver.pojo.Payment1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.BaseMapper;

public interface Payment1Mapper extends BaseMapper<Payment1> {
    int countByExample(Payment1Example example);

    int deleteByExample(Payment1Example example);

    List<Payment1> selectByExample(Payment1Example example);

    int updateByExampleSelective(@Param("record") Payment1 record, @Param("example") Payment1Example example);

    int updateByExample(@Param("record") Payment1 record, @Param("example") Payment1Example example);
}