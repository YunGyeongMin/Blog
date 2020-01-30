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
	<script src="/res/js/myList.js"></script>
</head>
<body>
	
	<c:import url="/head" />
	  
	<div class="container text-center">    
	  <div class="row">
	  
		<div class="col-sm-3 well">
		  <div class="well">
	        <p><a href="/profile/${sessionScope.target.num}">Profile</a></p>
	        <img src="${sessionScope.target.img}" class="img-circle" height="65" width="65" alt="Avatar">
	      </div>
	      <div class="well">
	        <p><a href="#">Interests</a></p>
	        <p>
	          <span class="label label-default">Java</span>
	          <span class="label label-primary">WebService</span>
	          <span class="label label-success">DataBase</span>
	          <span class="label label-info">HTML</span>
	          <span class="label label-warning">CSS</span>
	          <span class="label label-danger">JavaScript</span>
	        </p>
	      </div>
	      <div class="well">
	        <p><a href="/message/${sessionScope.target.num}">Message</a></p>
	        <p>
	        	For the loser now<br>
	        	Will be later to win<br>
	        	For the times they are changing.
	        </p>
	      </div>
	    </div>
	    
	    <div class="col-sm-9">
	    	<div id="messageList"></div>
	    </div>
	    
	  </div>
	</div>
	
	<c:import url="/footer" />
	
</body>
</html>