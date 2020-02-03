$(document).ready(function(){
	
	var getInterests = function(){
		$.ajax({
			type: "post",
			url: "/myEdit"
		}).done(function(d) {
			$("#Interests").empty();
			for(var i = 0; i < d.length; i ++){
//				console.log(d[i].num, d[i].name);
				var html = `
							<div class="col-xs-6 col-sm-4 col-md-3 cursor-pointer items" data-num="${d[i].num}">
								<div class="txt-box">
						        	<h4>${d[i].name}</h4>
					        	</div>
							</div>
						   `;
				$("#Interests").append(html);
			}
			getNum();
		});
	}
	
	var getNum = function(){
		$(".items").click(function(){
			var index = $(".items").index(this);
			var $target = $(".items").eq(index);
			var $target2 = $target.find("div");
			var num = $target.attr("data-num");
			console.log(num);
			
			if($target2.attr("class").indexOf("txt-active") > -1) {
				$target2.removeClass("txt-active");
			} else {
				$target2.addClass("txt-active");
			}
			
		});
	}
	
	getInterests();
});