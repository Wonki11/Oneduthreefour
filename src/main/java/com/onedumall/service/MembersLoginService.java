package com.onedumall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onedumall.dto.MembersLogin;
import com.onedumall.mapper.MembersLoginMapper;









@Service
public class MembersLoginService {
	@Autowired
	private MembersLoginMapper MembersLoginMapper;

	public MembersLogin getLogin(String members_id, String members_pw) {
		return MembersLoginMapper.getLogin(members_id, members_pw);
	}

}