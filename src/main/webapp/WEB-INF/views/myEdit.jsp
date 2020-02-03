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
	<script src="/res/js/myEdit.js"></script>
</head>
<body>
	
	<c:import url="/head" />
	  
	<div class="container text-center">    
	  <div class="row">
	  
		<div class="col-sm-3 well">
		  <div class="well">
	        <img id="myImage" src="/res/img/man.png" class="img-circle cursor-pointer" height="65" width="65" alt="Avatar" data-toggle="modal" data-target="#modal">
	      </div>
	    </div>
	    
	    <div class="col-sm-9">
			<form class="form-horizontal">
				<h2>Information</h2>
				<div class="form-group">
			    	<label class="control-label col-sm-2" for="name">Name:</label>
			    	<div class="col-sm-10">
			      		<input type="text" class="form-control" id="name" value="고세민" required="required">
			    	</div>
			  	</div>
				<div class="form-group">
			    	<label class="control-label col-sm-2" for="email">Email:</label>
			    	<div class="col-sm-10">
			      		<input type="email" class="form-control" id="email" value="gsm@goodee.co.kr" required="required">
			    	</div>
			  	</div>
			  	<div class="form-group">
			    	<label class="control-label col-sm-2" for="phone">Phone Cell:</label>
			    	<div class="col-sm-10">
			      		<input type="tel" class="form-control" id="phone" value="010-1234-5678">
			    	</div>
			  	</div>
			  	<div class="form-group">
			    	<label class="control-label col-sm-2" for="pwd">Password:</label>
			    	<div class="col-sm-10">
			      		<input type="password" class="form-control" id="pwd" placeholder="신규 비밀번호를 입력하세요.">
			    	</div>
			  	</div>
			  	<div class="form-group txt-body">
				  	<h2>Interests</h2>
				  	<div class="row" id="Interests"></div>
				</div>
			  	<div class="form-group button-body">
			      	<button type="submit" class="btn btn-success btn-block font-default">수정</button>
				</div>
			</form>
		  
	    </div>
	    
	  </div>
	</div>
	<br>
	
	<c:import url="/footer" />
	
	<!-- Modal -->
	<div id="modal" class="modal fade" role="dialog">
	  <div class="modal-dialog">
	
	    <!-- Modal content-->
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal">&times;</button>
	        <h4 class="modal-title">Profile Image Edit</h4>
	      </div>
	      <div class="modal-body">
	        <form>
	        	<div class="form-group text-center">
	        		<img id="preview" src="/res/img/man.png" alt="your image" class="img-circle cursor-pointer" height="65" width="65"/>
	        	</div>
	        </form>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-primary btn-block font-default" data-dismiss="modal">적용</button>
	      </div>
	    </div>
	
	  </div>
	</div>
	
</body>
</html>