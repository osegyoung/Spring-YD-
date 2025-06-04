package com.company.user.service.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.company.user.mapper.MemberMapper;
import com.company.user.service.CustomUser;
import com.company.user.service.MemberVO;
@Service 
public class CustomUserDetailService  implements UserDetailsService{

	@Autowired MemberMapper memberMapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		MemberVO member = memberMapper.read(username);
		/*
		 * List<SimpleGrantedAuthority> list = new ArrayList<>();
		 * member.getAuthList().forEach(auth -> list.add(new
		 * SimpleGrantedAuthority(auth.getAuth())));
		 */
		List<SimpleGrantedAuthority> list =
		member.getAuthList().stream().map(auth -> new SimpleGrantedAuthority(auth.getAuth())).collect(Collectors.toList());
		return new CustomUser(member);
	}

}
