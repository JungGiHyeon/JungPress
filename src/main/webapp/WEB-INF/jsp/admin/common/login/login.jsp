<%@ page language="java" contentType="text/html; charset=UTF-8"pageEncoding="UTF-8"	%>
<%@ include file="/jsp/include/taglib.jsp"											%>
<html lang="ko">
<head>
<%@ include file="/jsp/include/commonHeader.jsp"									%>

<!-- Bootstrap ustom style															-->
<link href="<c:url value="/bootstrap/examples/signin/signin.css"/>"	rel="stylesheet">

<script type="text/javascript">
$(document).ready(function(){
<c:if test="${not empty resultMsg}">
	alert("${resultMsg}");
</c:if>
});

function fnSubmit() {
	submit();
}
</script>
</head>
<body>
	<div class="container">
		<form class="form-signin" action="/admin/common/login/loginProc.do" method="post">
			<h2 class="form-signin-heading">관리자 로그인</h2>
			
			<label for="userEmail"	class="sr-only">Email address</label>
			<input type="email"		class="form-control"	id="userEmail"	name="userEmail"	placeholder="Email address"	required autofocus	>
			
			<label for="userPw"		class="sr-only">Password</label>
			<input type="password"	class="form-control"	id="userPw"		name="userPw"		placeholder="Password"		required			>
			
			<!--
			<input type="checkbox" value="remember-me">
			<label>Remember me</label>
			-->
			
			<button class="btn btn-lg btn-primary btn-block" type="submit" onclick="fnSubmit();">
				Sign in
			</button>
		</form>
	</div>
<%@ include file="/jsp/include/commonFooter.jsp"									%>
</body>
</html>