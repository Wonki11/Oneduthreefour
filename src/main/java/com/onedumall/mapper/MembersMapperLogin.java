package com.onedumall.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import org.mybatis.spring.annotation.MapperScan;

import com.onedumall.dto.MembersLogin;









@MapperScan("com.onedumall.mapper.LoginMapper")
@Mapper
public interface MembersMapperLogin {


MembersLogin getLogin(@Param("members_id") String members_id, @Param("members_pw") String members_pw);
}