package com.company.common.security;

import java.io.IOException;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@Component("deniedhandler")
public class CustomAccessDeniedHandler implements AccessDeniedHandler{

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
		
		//에러처리
		System.out.println("403에러 처리");
//		log.error("Access Denid Handler");
//		log.error("Redirect....");
		//뷰페이지로 이동
		String contextPath = request.getContextPath();
		response.sendRedirect(contextPath + "/accessError");
	}

}
