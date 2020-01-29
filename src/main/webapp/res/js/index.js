$(document).ready(function(){
	
	var listView = function(){
		$.ajax({
			type: "POST",
			url: "/page"
		}).done(function(d){
			$("#userList").html(d);
			btnClick();
		});
	}
	var btnClick = function(){
		$(".item").click(function(){
			var index = $(".item").index(this);
			var num = $(".item").eq(index).attr("data-num");
			location.href = "/myList/" + num;
		});
	}
	
	listView();
});