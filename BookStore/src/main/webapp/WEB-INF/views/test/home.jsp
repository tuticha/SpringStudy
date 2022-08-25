<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<a href="/cha/test1">test1로 가기</a>

<a href="/cha/serviceTest">service test로 가기</a>
<a href="/cha/serviceTest2">service test2로 가기</a>
<br/>
<br/>

<a href="/cha/serviceTest3?plitche=3">parameter service1</a>
<a href="/cha/serviceTest4/5">parameter service2</a>
<a href="/cha/login3?id=plitche&pw=1111">login</a>
<a href="/cha/login2/plitche/1111">login2</a>

<a href="/cha/homework1?cha1=1&cha2=2">homework parameter1</a>
<a href="/cha/homework2?cha3=1">homework parameter2</a>
<a href="/cha/homework3?cha1=1&cha2=2&cha3=3">homework parameter3</a>
<br/>

<a href="/cha/dbTest">DB test1</a>

</body>
</html>
