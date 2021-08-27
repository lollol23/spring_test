<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날씨 입력</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
            
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

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
				<h2>날씨입력</h2><br>
				<form method="post" action="/lesson05/test05_insertSuccess">
					<div class="d-flex">
						<div class="input-group">
							<label class="">날짜</label>
							<input type="date" name="date" class="">
						</div>
						<div class="input-group">
							<label class="">날씨</label>
							<select name="weather" class="form-control">
								<option value="sunny">맑음</option>
								<option value="rainy">비</option>
								<option value="cloudy">흐림</option>
								<option value="partlyCloudy">구름조금</option>
							</select>
						</div>
						<div class="input-group">
							<label class="">미세먼지</label>
							<select name="microDust" class="form-control">
								<option value="good">좋음</option>
								<option value="soso">보통</option>
								<option value="bad">나쁨</option>
							</select>
						</div>
					</div>
					<br><br>
					<div class="d-flex">
						<div class="input-group">
							<label class="">기온</label>
							<input type="text" name="temperatures" class="form-control">
						</div>
						<div class="input-group">
							<label class="">강수량</label>
							<input type="text" name="precipitation" class="form-control">
						</div>
						<div class="input-group">
							<label class="">풍속</label>
							<input type="text" name="windSpeed" class="form-control">
						</div>
					</div>
					<br><br>
					<div align="right">
						<input type="submit" value="저장" class="btn btn-success justify-content-right">
					</div>
				</form>
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