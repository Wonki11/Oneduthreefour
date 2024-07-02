package com.onedumall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onedumall.dto.Member;
import com.onedumall.mapper.MamberMapper;

@Service
public class MemberService {
	@Autowired
	private MamberMapper memberMapper;

	public Member getLogin(String members_id, String members_pw) {
		return memberMapper.getLogin(members_id, members_pw);
	}

}