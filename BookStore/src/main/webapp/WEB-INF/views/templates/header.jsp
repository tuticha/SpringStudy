<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
<title>tuticha 북스토어</title>
</head>
<body>
	<div>여기는 헤더에요</div>
	
	<script>
		var loginResult = '${loginResult}';
		
		$(document).ready(function() {
			if (loginResult == 'success') {
				$('#login').css('display', 'none');
			} else {
				$('#logout').css('display', 'none');
			}	
		})
	</script>
	
	<a id="login" href="/cha/login">로그인</a>
	<a id="logout" href="/cha/logout">로그아웃</a>




	<div style="border: 5px solid black; margin-bottom: 40px;"></div>