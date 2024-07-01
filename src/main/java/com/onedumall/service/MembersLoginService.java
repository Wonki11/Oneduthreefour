package com.onedumall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onedumall.dto.MembersLogin;
<<<<<<< HEAD
import com.onedumall.mapper.MambersMapperLogin;
=======
import com.onedumall.mapper.MembersLoginMapper;
>>>>>>> jinwoo-onedu









@Service
public class MembersLoginService {
	@Autowired
<<<<<<< HEAD
	private MambersMapperLogin membersMapperLogin;

	public MembersLogin getLogin(String members_id, String members_pw) {
		return membersMapperLogin.getLogin(members_id, members_pw);
=======
	private MembersLoginMapper MembersLoginMapper;

	public MembersLogin getLogin(String members_id, String members_pw) {
		return MembersLoginMapper.getLogin(members_id, members_pw);
>>>>>>> jinwoo-onedu
	}

}