package com.yhq.mysql.dao;

import org.springframework.stereotype.Repository;

import com.yhq.mysql.MySqlMapper;
import com.yhq.mysql.pojo.User;

@Repository
public interface UserMapper extends MySqlMapper<User> {

}