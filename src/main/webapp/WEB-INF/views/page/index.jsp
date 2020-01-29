<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<c:forEach var="row" items="${result}">
	  <div class="col-sm-3 col-xs-6 cursor-pointer item" data-num="${row.num}">
	    <div class="well">
	     <p>${row.name}</p>
	     <img src="${row.img}" class="img-circle" height="55" width="55" alt="${row.name}">
	    </div>
	  </div>
</c:forEach>
</body>
</html>