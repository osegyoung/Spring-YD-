<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<sec:authorize access="isAnonymous()">
		<a href="/login">로그인</a>
	</sec:authorize>
	<sec:authorize access="isAuthenticated()">
		<sec:authentication property="principal.username" />
		<sec:authentication property="principal.member.userid" />
		<sec:authentication property="principal.member.userName" />
		<form method="post" action="logout">
			<input type="hidden" name="${_csrf.parameterName}"	value="${_csrf.token}"/>
			 <button>로그아웃</button>
		</form>
	</sec:authorize>
</body>
</html>