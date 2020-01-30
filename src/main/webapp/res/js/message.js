$(document).ready(function(){
	
	$("#message").submit(function(e){
		e.preventDefault();
		var params = {"comment" : $("#comment").val()};
		$.ajax({
			type : "post",
			url : "/message",
			data : JSON.stringify(params),
			contentType : "application/json; charset=UTF-8"
		}).done(function(d) {
			if(d.result > 0) {
				location.href = $(".nav-list li").eq(1).find("a").attr("href");
			} else {
				alert("ㅠㅅㅠ))");
				$("#comment").val("");
			}
		});
	});
	
});