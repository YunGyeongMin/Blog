<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html oncontextmenu="return false">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Blog</title>
	<link rel="shortcut icon" type="image/x-icon" href="/res/img/icon_goodee.png">
	<link href="https://fonts.googleapis.com/css?family=Nanum+Pen+Script&display=swap" rel="stylesheet">
	<link rel="stylesheet" href="/lib/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="/lib/jquery/3.4.1/dist/jquery.min.js"></script>
	<script src="/lib/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="/res/css/commons.css">
	<script src="/res/js/commons.js"></script>
	<script src="/res/js/signup.js"></script>
</head>
<body>
	
	<c:import url="/head" />
	  
	<div class="container">    
		<h1 class="text-center">Sign Up</h1>
		<form action="/signup" method="post">
			<div class="form-group">
		    	<label class="control-label" for="id">Id:</label>
		      	<input type="text" class="form-control" id="id" name="id" required="required" placeholder="계정을 입력하세요.">
		  	</div>
		  	<div class="form-group">
		    	<label class="control-label" for="password">Password:</label>
		      	<input type="password" class="form-control" id="password" name="password" required="required" placeholder="비밀번호를 입력하세요.">
		  	</div>		  	
			
			<div class="form-group">
		    	<label class="control-label" for="name">Name:</label>
	      		<input type="text" class="form-control" id="name" name="name" required="required" placeholder="이름을 입력하세요.">
		  	</div>
			<div class="form-group">
		    	<label class="control-label" for="email">Email:</label>
	      		<input type="email" class="form-control" id="email" name="email" required="required" placeholder="이메일를 입력하세요.">
		  	</div>
		  	<div class="form-group">
		    	<label class="control-label" for="phone">Phone Cell:</label>
	      		<input type="tel" class="form-control" id="phone" name="phone" pattern="[0-9]{3}-[0-9]{4}-[0-9]{4}" placeholder="휴대전화번호를 입력하세요.">
		  	</div>
		  	
		  	<div class="form-group">
		      	<button type="submit" class="btn btn-success btn-block font-default">가입</button>
			</div>
		</form>
			  
    </div>
	    
	<c:import url="/footer" />
	
</body>
</html>