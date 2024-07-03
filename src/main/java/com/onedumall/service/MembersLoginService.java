package com.onedumall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onedumall.dto.Members;
import com.onedumall.mapper.MembersMapperLogin;

@Service
public class MembersLoginService {
	@Autowired
	private MembersMapperLogin membersMapperLogin;

	public Members getLogin(String members_id, String members_pw) {
		return membersMapperLogin.getLogin(members_id, members_pw);
	}

}