<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/jsp/include/taglib.jsp"											%>
<!doctype html>
<html lang="ko">
<head>
<%@ include file="/jsp/include/commonHeader.jsp"									%>
</head>
<body>
<%@ include file="/jsp/include/adminHeader.jsp"										%>
<div class="d-none d-xl-block col-xl-2 bd-toc">
	<ul class="section-nav">
		<li class="toc-entry toc-h2">
			<a href="#1">1</a>
		</li>
		<ul>
		<li class="toc-entry toc-h3">
			<a href="#1">1-1</a>
		</li>
		</ul>
	</ul>
</div>
<main class="col-12 col-md-9 col-xl-8 pymd-3 pl-md-5 bd-content" role="main">
	<h1 class="bd-title">111</h1>
	<table class="table table-hover">
		<caption>111</caption>
		<colgroup>
			<col width="25%">
			<col width="25%">
			<col width="25%">
			<col width="25%">
		</colgroup>
		<thead>
			<tr>
				<th scope="col">1</th>
				<th scope="col">2</th>
				<th scope="col">3</th>
				<th scope="col">4</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td scope="row">1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
			</tr>
		</tbody>
		<tfoot>
			<tr>
				<td scope="row">1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
			</tr>
		</tfoot>
	</table>
</main>
<%@ include file="/jsp/include/adminFooter.jsp"										%>
<%@ include file="/jsp/include/commonFooter.jsp"									%>
</body>
</html>