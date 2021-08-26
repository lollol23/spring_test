<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날씨 정보 페이지</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
            
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>
	<div id="wrap" class="container pt-2">
		<div class="d-flex">
			<nav class="col-2 bg-primary">
				<img src="https://blog.kakaocdn.net/dn/TxmeD/btqCKArBvPm/2tzfJfINwg0WWmCzC4jKW0/img.jpg" width="170px" height="60px">
				<ul class="nav nav-fill flex-column">
					<li class="nav-item text-left"><a class="nav-link text-white" href="#">날씨</a></li>
					<li class="nav-item text-left"><a class="nav-link text-white" href="#">날씨입력</a></li>
					<li class="nav-item text-left"><a class="nav-link text-white" href="#">테마날씨</a></li>
					<li class="nav-item text-left"><a class="nav-link text-white" href="#">관측기후</a></li>
				</ul>
			</nav>
			<section class="col-10 mt-2 ml-4">
				<h2>과거 날씨</h2>
				<table class="table text-center">
					<thead>
						<tr>
							<th>날짜</th>
							<th>날씨</th>
							<th>기온</th>
							<th>강수량</th>
							<th>미세먼지</th>
							<th>풍속</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="weatherHistory" items="${weatherHistorys }">
						<tr>
							<td>
							<fmt:formatDate value="${weatherHistory.date }" pattern="yyyy년 M월 dd일"/>
							</td>
							<td>
								<c:choose>
									<c:when test="${weatherHistory.weather == '맑음'}">
										<img src="/resources/img/sunny.jpg">
									</c:when>
									<c:when test="${weatherHistory.weather == '흐림'}">
										<img src="/resources/img/cloudy.jpg">
									</c:when>
									<c:when test="${weatherHistory.weather == '비'}">
										<img src="/resources/img/rainy.jpg">
									</c:when>
									<c:when test="${weatherHistory.weather == '구름조금'}">
										<img src="/resources/img/partlyCloudy.jpg">
									</c:when>
								</c:choose>
							</td>
							<td>${weatherHistory.temperatures }°C</td>
							<td>${weatherHistory.precipitation }mm</td>
							<td>${weatherHistory.microDust }</td>
							<td>${weatherHistory.windSpeed }km/h</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
			</section>
		</div>
		<footer class="d-flex">
			<div class="col-2">
				<img src="https://blog.kakaocdn.net/dn/TxmeD/btqCKArBvPm/2tzfJfINwg0WWmCzC4jKW0/img.jpg" width="150px" height="60px">
			</div>
			
			<div class="col-10">
				<small class="text-secondary">
					(07062) 서울시 동작구 여의대방로16길 61<br>
					Copyright@2020 KMA. ALL Rights RESERVED.
				</small>
			</div>
		</footer>
	</div>
</body>
</html>