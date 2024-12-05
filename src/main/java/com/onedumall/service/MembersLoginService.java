package com.onedumall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import com.onedumall.dto.MembersLogin;
=======
import com.onedumall.dto.Members;
>>>>>>> 6d520fdf56f118de7e93b399d5b8322012273c08
import com.onedumall.mapper.MembersMapperLogin;

@Service
public class MembersLoginService {
	@Autowired
	private MembersMapperLogin membersMapperLogin;

	public Members getLogin(String members_id, String members_pw) {
		return membersMapperLogin.getLogin(members_id, members_pw);
	}

}