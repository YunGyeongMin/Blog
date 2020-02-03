$(document).ready(function(){
	
	$("#info").submit(function(e){
		e.preventDefault();
		var params = {
				num : $("#num").val(),
				name : $("#name").val(),
				email : $("#email").val(),
				phone : $("#phone").val(),
				Interests : resource
		};
		
		if($("#pwd").val() != "") {
			params.pwd = $("#pwd").val();
		}
		
		$.ajax({
			type : "put",
			url : "/myEdit",
			data : JSON.stringify(params),
			contentType : "application/json; charset=UTF-8"
		}).done(function(d) {
			console.log(d);
			if(d.result) {
				alert("+_+))");
			} else {
				alert("ㅠㅅㅠ))");
			}
		});
	});
	
	
	var getInterests = function(){
		var params = {
				num : $("#num").val()
		};
		$.ajax({
			type: "post",
			url: "/myEdit",
			data: params
		}).done(function(d) {
			$("#Interests").empty();
			for(var i = 0; i < d.length; i ++){
				var css = d[i].state?"txt-active":"";
				if(d[i].state) {
					resource[resource.length] = d[i].num;
				}
				var html = `
							<div class="col-xs-6 col-sm-4 col-md-3 cursor-pointer items" data-num="${d[i].num}">
								<div class="txt-box ${css}">
						        	<h4>${d[i].name}</h4>
					        	</div>
							</div>
						   `;
				$("#Interests").append(html);
			}
			getNum();
		});
	}
	
	var resource = [];
	
	var getNum = function(){
		$(".items").click(function(){
			var index = $(".items").index(this);
			var $target = $(".items").eq(index);
			var $target2 = $target.find("div");
			var num = $target.attr("data-num");
			
			if($target2.attr("class").indexOf("txt-active") > -1) {
				$target2.removeClass("txt-active");
				
				for(var i = 0; i < resource.length; i++){
					if(resource[i] == num) {
						resource.splice(i, 1);
						break;
					}
				}
				
			} else {
				$target2.addClass("txt-active");
				resource[resource.length] = num;
			}
			
		});
	}
	
	getInterests();
});