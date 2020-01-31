<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>

<c:forEach var="row" items="${result}">
	<div class="row">
	  <div class="col-sm-3">
	    <div class="well">
	     <p>${row.name}</p>
	     <img src="${row.img}" class="img-circle" height="55" width="55" alt="${row.name}">
	    </div>
	  </div>
	  <div class="col-sm-9">
	    <div class="well">
	      <p>${row.comment}</p>
	    </div>
	  </div>
	</div>
</c:forEach>

<c:if test="${result.size() == 0}">
	<div class="row">
	  <div class="col-sm-12">
	  	<div class="well">당신은 인기가 없네요!</div>
	  </div>
	</div>
</c:if>
	
</body>
</html>