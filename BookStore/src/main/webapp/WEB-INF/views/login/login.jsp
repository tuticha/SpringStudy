<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../templates/header.jsp" %>

	<form action="/cha/goLogin">
		id: <input type="text" name="id" placeholder="id를 작성해주세요"/><br/>
		pw: <input type="text" name="pw" placeholder="pw를 작성해주세요"/><br/><br/>
		<input type="submit" value="로그인"/>
	</form>
	
	
﻿<%@ include file="../templates/footer.jsp" %>
