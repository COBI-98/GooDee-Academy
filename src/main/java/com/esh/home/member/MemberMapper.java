package com.esh.home.member;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

	public MemberVO getLogin(MemberVO memberVO) throws Exception;
	
	public int getJoin(MemberVO memberVO) throws Exception;
	
}
