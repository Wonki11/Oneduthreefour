package com.onedumall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onedumall.dto.MembersReg;
import com.onedumall.mapper.RegisterMemMapper;

@Service
public class RegisterMemService {
	@Autowired
	private RegisterMemMapper registerMemMapper;
	
	public void insertRegister(MembersReg members) {
		registerMemMapper.insertRegister(members);
	}
	
	
}
