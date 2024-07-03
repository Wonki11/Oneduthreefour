package com.onedumall.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import org.mybatis.spring.annotation.MapperScan;

<<<<<<< HEAD
import com.onedumall.dto.MembersLogin;









@MapperScan("com.onedumall.mapper.LoginMapper")
@Mapper
public interface MembersMapperLogin {


MembersLogin getLogin(@Param("members_id") String members_id, @Param("members_pw") String members_pw);
}
=======
import com.onedumall.dto.Members;

@Mapper
public interface MembersMapperLogin {

	Members getLogin(@Param("members_id") String members_id, @Param("members_pw") String members_pw);
}
>>>>>>> 6d520fdf56f118de7e93b399d5b8322012273c08
