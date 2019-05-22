<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Index</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>WNP</h1>

	<!-- 네비게이션 바(모듈화) -->
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<a class="navbar-brand" href="${pageContext.request.contextPath}/">WNP</a>
		
		<ul class="navbar-nav">
			<c:forEach var="novelCategory" items="${novelCategoryList}">
				<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/novel/getNovelList?novelCategoryNo=${novelCategory.novelCategoryNo}">${novelCategory.novelCategoryName}</a></li>
			</c:forEach>
		</ul>
		
		<a class="nav-link" href="#">공지사항</a>
		
		<form class="form-inline" action="#">
			<input class="form-control mr-sm-2" name="searchWord" type="text" placeholder="Search">
			<button class="btn btn-success" type="button">Search</button>
		</form>
	</nav>
	
	<!-- 이벤트 배너(공지사항으로 연결) -->
	<!-- 장르별 최신작(시간단위 비동기 호출) -->
	<!-- 장르별 투데이 베스트(시간단위 비동기 호출) -->
	<!-- 로그인 폼 -->
	<!-- 선호작 목록(로그인 시) -->
	<!-- 글쓰기 -->
	<!-- 작품명 검색 -->
</body>
</html>