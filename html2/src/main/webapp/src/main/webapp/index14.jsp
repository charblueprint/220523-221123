<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 데이터 확인</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	String email1 = request.getParameter("user_email1");
	String email2 = request.getParameter("user_email2");
	String pass = request.getParameter("user_pw");
	%>
	<%=email1%>@<%=email2%><br>
	<%=pass%>
</body>
</html>