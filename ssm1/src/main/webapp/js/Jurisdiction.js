// 鉴权
function getJurisdiction(data){
	$.ajax({
		type : 'GET',
		url : 'Jurisdiction/getJurisdiction',
		dataType : 'json',
		data : {
			"id":data,
		},
		cache : false,
		sync : true,
		success : function(result) {
			if (result.code == "200") {
				var pres = result.extend.getJurisdiction[0].pre;
				var htm = "";
				$.each(pres, function(index,item){
				//	console.log(item.menuName)
					htm += '<li class=""><a href="javascript:;" class="" data-toggle="dropdown" data-hover="dropdown">'
						+'<span aria-hidden="true" class="'+item.pictures+'"></span>'
						+item.menuName
						+'<b class="caret"></b></a>';
					
					var pre = item.menuName;
					
					var pre_son = result.extend.getJurisdiction[0];
					var son = pre_son[pre]
					
					var str1 = "";
//					str1 = '<ul class="dropdown-menu">';
					var htmson;
					$.each(son, function(index,item1){
						
						htmson = '<li><a class="" onClick="'+item1.menuUrl+'()">'
								 +item1.menuName
								 +'</a></li>'
									 
						str1 += htmson
					});
					
					htm += '<ul class="dropdown-menu">'+str1+'</ul></li>';
				
				});
//				console.log(htm)
				$('<ul class="nav"></ul>')
						.append(htm)
						.appendTo("#table1")	
				
			} else if (result.code == "100") {
				alert("失败");
			} 
		},
		error : function() {
			alert("请求失败!");
		}
	});
}