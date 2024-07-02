package com.onedumall.mapper;



import org.apache.ibatis.annotations.Mapper;

import com.onedumall.dto.MembersReg;

@Mapper
public interface RegisterMemMapper {
		void insertRegister(MembersReg members);
		
}