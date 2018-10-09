// 显示分页信息
function build_page_info(result){
	$("#page_info_area").empty();
	$("#page_info_area").append("当前"+result.extend.listEmp.pageNum+"页,总"+
			result.extend.listEmp.pages+"页,总"+
			result.extend.listEmp.total+"条记录");
}

// 显示分页条
function build_page_nav(result){
	$("#page_nav_area").empty();
	var ul = $("<ul></ul>").addClass("pagination");
	// 构建元素
	// 分页 第一页
	var firstPageLi = $("<li></li>").append($("<a></a>").append("首页"));
	// 分页 上一页
	var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
	
	if(result.extend.listEmp.hasPreviousPage == false){
		firstPageLi.addClass("disabled");
		prePageLi.addClass("disabled");
	} else {
		// 为元素添加点击翻页事件(第一页)
		firstPageLi.click(function(){
			to_page(1);
		})
		// 为元素添加点击翻页事件(上一页)
		prePageLi.click(function(){
			to_page(result.extend.listEmp.pageNum - 1);
		})
	}
	
	// 分页 下一页
	var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
	// 分页 最后一页
	var lastPageLi = $("<li></li>").append($("<a></a>").append("末页"));
	
	if(result.extend.listEmp.hasNextPage == false){
		nextPageLi.addClass("disabled");
		lastPageLi.addClass("disabled");
	}else{
		// 为元素添加点击翻页事件(最后一页)
		lastPageLi.click(function(){
			to_page(result.extend.listEmp.pages);
		})
		// 为元素添加点击翻页事件(下一页)
		nextPageLi.click(function(){
			to_page(result.extend.listEmp.pageNum + 1);
		})
		
	}
	
	
	// 添加首页和前一页 的提示
	ul.append(firstPageLi).append(prePageLi);
	// 1,2，3遍历给ul中添加页码提示
	$.each(result.extend.listEmp.navigatepageNums,function(index,item){
		
		var numLi = $("<li></li>").append($("<a></a>").append(item));
		
		if(result.extend.listEmp.pageNum ==item){
			numLi.addClass("active");
		}
		
		// 点击之后前往第item页
		numLi.click(function(){
			to_page(item);
		})
		
		ul.append(numLi);
	});
	// 添加下一页和末页 的提示
	ul.append(nextPageLi).append(lastPageLi);
	
	// 把ul加入到nav
	var navEle = $("<nav></nav>").append(ul);
	navEle.appendTo("#page_nav_area");
}

//显示分页条
function build_page_navB(result){
	$("#page_nav_area").empty();
	var ul = $("<ul></ul>").addClass("pagination");
	// 构建元素
	// 分页 第一页
	var firstPageLi = $("<li></li>").append($("<a></a>").append("首页"));
	// 分页 上一页
	var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
	
	if(result.extend.listEmp.hasPreviousPage == false){
		firstPageLi.addClass("disabled");
		prePageLi.addClass("disabled");
	} else {
		// 为元素添加点击翻页事件(第一页)
		firstPageLi.click(function(){
			SearchEmp(1);
		})
		// 为元素添加点击翻页事件(上一页)
		prePageLi.click(function(){
			SearchEmp(result.extend.listEmp.pageNum - 1);
		})
	}
	
	// 分页 下一页
	var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
	// 分页 最后一页
	var lastPageLi = $("<li></li>").append($("<a></a>").append("末页"));
	
	if(result.extend.listEmp.hasNextPage == false){
		nextPageLi.addClass("disabled");
		lastPageLi.addClass("disabled");
	}else{
		// 为元素添加点击翻页事件(最后一页)
		lastPageLi.click(function(){
			SearchEmp(result.extend.listEmp.pages);
		})
		// 为元素添加点击翻页事件(下一页)
		nextPageLi.click(function(){
			SearchEmp(result.extend.listEmp.pageNum + 1);
		})
		
	}
	
	
	// 添加首页和前一页 的提示
	ul.append(firstPageLi).append(prePageLi);
	// 1,2，3遍历给ul中添加页码提示
	$.each(result.extend.listEmp.navigatepageNums,function(index,item){
		
		var numLi = $("<li></li>").append($("<a></a>").append(item));
		
		if(result.extend.listEmp.pageNum ==item){
			numLi.addClass("active");
		}
		
		// 点击之后前往第item页
		numLi.click(function(){
//			to_page(item);
			SearchEmp(item);
		})
		
		ul.append(numLi);
	});
	// 添加下一页和末页 的提示
	ul.append(nextPageLi).append(lastPageLi);
	
	// 把ul加入到nav
	var navEle = $("<nav></nav>").append(ul);
	navEle.appendTo("#page_nav_area");
}