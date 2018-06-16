<%@ page language="java" contentType="text/html; charset=UTF-8"pageEncoding="UTF-8"	%>
<%@ include file="/jsp/include/taglib.jsp"											%>
<html lang="ko">
<head>
<%@ include file="/jsp/include/adminHeader.jsp"										%>
</head>
<body>
	<div class="container">
		<form class="form-signin">
			<h2 class="form-signin-heading">관리자 로그인</h2>
			
			<label for="inputEmail" class="sr-only">Email address</label>
			<input type="email"		name="inputEmail"		id="inputEmail"		class="form-control"	placeholder="Email address"	required autofocus	>
			
			<label for="inputPassword" class="sr-only">Password</label>
			<input type="password"	name="inputPassword"	id="inputPassword"	class="form-control"	placeholder="Password"		required			>
			
			<!--
			<input type="checkbox" value="remember-me">
			<label>Remember me</label>
			-->
			
			<button class="btn btn-lg btn-primary btn-block" type="submit">
				Sign in
			</button>
		</form>
	</div>
	
<%@ include file="/jsp/include/adminFooter.jsp"										%>
</body>
</html>