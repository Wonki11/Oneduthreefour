package com.onedumall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.onedumall.dto.Members;
import com.onedumall.mapper.MemberMapper;

@Service
public class MemberService {
	@Autowired
	private MemberMapper memberMapper;

	public Members getLogin(String members_id, String members_pw) {
		return memberMapper.getLogin(members_id, members_pw);
	}

}