<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약하기</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>        
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        
        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        
		<link rel="stylesheet" href="/resources/css/tongnamu_style.css" type="text/css">
</head>
<body>
	<div class="wrap" >
            <header class="mt-4">
                <div class="text-center display-4">통나무 팬션</div>
                <nav class="mt-4">
                    <ul class="nav nav-fill">
                        <li class="nav-item"><a class="nav-link" href="#">팬션소개</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">객실보기</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">예약하기</a></li>
                        <li class="nav-item"><a class="nav-link" href="/lesson06/reservationList_view">예약목록</a></li>
                    </ul>
                </nav>
            </header>
            <section>
            	<h2 class="text-center">예약하기</h2>
            	<label>이름</label>
            	<input type="text" id="nameInput" class="form-control">
            	<label>예약날짜</label>
            	<input type="date" id="dateInput" class="form-control">
            	<label>숙박일수</label>
            	<input type="text" id="dayInput" class="form-control">
            	<label>숙박인원</label>
            	<input type="text" id="headcountInput" class="form-control">
            	<label>전화번호</label>
            	<input type="text" id="phoneNumberInput" class="form-control"><br>
            	<button class="btn btn-warning" id="reservationBtn">예약하기</button>
            </section>
            <footer class="mt-3 ml-4">
                <address>
                    제주특별자치도 제주시 애월읍  <br>
                    사업자등록번호: 111-22-255222 / 농어촌민박사업자지정 / 대표:김통목 <br>
                    Copyright 2025 tongnamu All right reserved
                </address>

            </footer>
	</div>
	<script>
		$(document).ready(function() {
			$("#reservationBtn").on("click", function() {
				var name = $("#nameInput").val();
				var date = $("#dateInput").val();
				var day = $("#dayInput").val();
				var headcount = $("#headcountInput").val();
				var phoneNumber = $("#phoneNumberInputInput").val();
				
				if(name == null || name =="") {
					alert("이름을 입력하세요.");
				}
				if(date == null || date =="") {
					alert("날짜를 입력하세요.");
				}
				if(day == null || day =="") {
					alert("일수를 입력하세요.");
				}
				if(headcount == null || headcount =="") {
					alert("인원을 입력하세요.");
				}
				if(phoneNumber == null || phoneNumber =="") {
					alert("번호를 입력하세요.");
				}
			});
		});
	</script>
</body>
</html>