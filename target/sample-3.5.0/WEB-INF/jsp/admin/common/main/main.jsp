<%@ page language="java" contentType="text/html; charset=UTF-8"pageEncoding="UTF-8"	%>
<%@ include file="/jsp/include/taglib.jsp"											%>
<html lang="ko">
<head>
<%@ include file="/jsp/include/adminHeader.jsp"										%>
</head>
<body>
	<!-- Fixed Header -->
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Project name</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#about">About</a></li>
					<li><a href="#contact">Contact</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<!-- Begin page content -->
	<div class="container"></div>
	
	<!-- Fixed Footer -->
	<footer class="footer">
		<div class="container">
			<p class="text-muted">
				<br/>
				<small>Copyright 'PROJECT' all rights reserved.</small>
			</p>
		</div>
	</footer>
	
	<%@ include file="/jsp/include/adminFooter.jsp"%>
</body>
</html>