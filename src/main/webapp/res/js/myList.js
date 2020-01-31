$(document).ready(function(){
	
	var listView = function(){
		$.ajax({
			type: "POST",
			url: "/myList/page"
		}).done(function(d){
			$("#messageList").html(d);
		});
	}
	
	listView();
});