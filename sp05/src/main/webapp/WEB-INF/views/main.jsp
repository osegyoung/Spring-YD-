<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
메인
${sampleDTO}<br>
${sampleDTO.name}<br>
${param.name}<br> <!--  request.getParameter("") -->
${param.age}<br>
${dept}
</body>
</html>