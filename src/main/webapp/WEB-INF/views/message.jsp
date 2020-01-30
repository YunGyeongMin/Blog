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
	<script src="/res/js/message.js"></script>
</head>
<body>
	
	<c:import url="/head" />
	  
	<div class="container text-center">    
    	<h1>Recommend</h1>
		<form action="/message" method="post">
			<div class="form-group">
		      <textarea class="form-control txt-none font-default" rows="10" id="comment"></textarea>
		    </div>
		    <div class="form-group">
		      	<button type="submit" class="btn btn-success btn-block font-default">저장</button>
			</div>
		</form>
	</div>
	
	<c:import url="/footer" />
	
</body>
</html>