<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
	
	<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>                        
	      </button>
	      <a class="navbar-brand" href="/">GDJ21</a>
	    </div>
	    <div class="collapse navbar-collapse" id="myNavbar">
	      <ul class="nav navbar-nav nav-list">
	      
			<c:choose>
				<c:when test="${sessionScope.page eq 'login'}">
	      			<li><a href="/">Home</a></li>
	      			<li class="active"><a href="/login">Login</a></li>
	      		</c:when>
	      		<c:when test="${sessionScope.page eq 'signup'}">
	      			<li><a href="/">Home</a></li>
	      			<li class="active"><a href="/signup">Sign Up</a></li>
	      		</c:when>
	      		<c:when test="${sessionScope.page eq 'myList'}">
	      			<li><a href="/">Home</a></li>
	      			<li class="active"><a href="/myList/${sessionScope.target.num}">${sessionScope.target.name}</a></li>
	      		</c:when>
	      		<c:when test="${sessionScope.page eq 'profile'}">
	      			<li><a href="/">Home</a></li>
	      			<li><a href="/myList/${sessionScope.target.num}">${sessionScope.target.name}</a></li>
	      			<li class="active"><a href="/profile">Profile</a></li>
	      		</c:when>
	      		<c:when test="${sessionScope.page eq 'message'}">
	      			<li><a href="/">Home</a></li>
	      			<li><a href="/myList/${sessionScope.target.num}">${sessionScope.target.name}</a></li>
	      			<li class="active"><a href="/message">Message</a></li>
	      		</c:when>
	      		<c:when test="${sessionScope.page eq 'myEdit'}">
	      			<li><a href="/">Home</a></li>
	      			<li><a href="/myList/${sessionScope.target.num}">${sessionScope.target.name}</a></li>
	      			<li class="active"><a href="/myEdit">Edit</a></li>
	      		</c:when>
				<c:otherwise>
					<li><a href="/">Home</a></li>
				</c:otherwise>
			</c:choose>
	      	
	      </ul>
	      <form class="navbar-form navbar-right" role="search">
	        <div class="form-group input-group">
	          <input type="text" class="form-control" placeholder="검색..">
	          <span class="input-group-btn">
	            <button class="btn btn-default" type="button">
	              <span class="glyphicon glyphicon-search"></span>
	            </button>
	          </span>        
	        </div>
	      </form>
	      <ul class="nav navbar-nav navbar-right">
	      
	      <sec:authorize access="isAnonymous()">
	      	<li><a href="/signup"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      		<li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
	      </sec:authorize>
	      
	      <sec:authorize access="isAuthenticated()">
	      	<li><a href="/myEdit"><span class="glyphicon glyphicon-user"></span> ${sessionScope.UserInfo.name}</a></li>
	        <li><a href="/logout"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
	      </sec:authorize>
	      
	      </ul>
	    </div>
	  </div>
	</nav>
	
</body>
</html>