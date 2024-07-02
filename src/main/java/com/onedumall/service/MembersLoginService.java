package com.onedumall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onedumall.dto.MembersLogin;
import com.onedumall.mapper.MambersMapperLogin;

@Service
public class MembersLoginService {
	@Autowired
	private MambersMapperLogin membersMapperLogin;

	public MembersLogin getLogin(String members_id, String members_pw) {
		return membersMapperLogin.getLogin(members_id, members_pw);
	}

}