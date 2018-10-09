// 立即加载
$(function(){ 
	New_customers();
	New_customers_moth();
	New_sales_orders_seven();
});

// 获取到近七日新增客户
function New_customers() {
	
	$.ajax({
		type : 'GET',
		url : 'customer/seven_new_customers',
		dataType : 'json',
		cache : false,
		sync : true,
		
		success : function(result){
			if(result.code == "200"){
				//console.log(result);
				document.getElementById('customerCount').innerText = result.extend.seven_new_customers;
			}
		},
		error : function() {
			alert("请求失败!");
		}
		
	});
}

//获取到近一月新增客户
function New_customers_moth() {
	
	$.ajax({
		type : 'GET',
		url : 'customer/moth_new_customers',
		dataType : 'json',
		cache : false,
		sync : true,
		
		success : function(result){
			if(result.code == "200"){
				//console.log(result);
				document.getElementById('customerTotal').innerText = result.extend.moth_new_customers;
			}
		},
		error : function() {
			alert("请求失败!");
		}
		
	});
}

//获取到近七日新增销售单
function New_sales_orders_seven() {
	$.ajax({
		type : 'GET',
		url : 'orders/new_sales_orders_seven',
		dataType : 'json',
		cache : false,
		sync : true,
		
		success : function(result){
			if(result.code == "200"){
				//console.log(result);
				document.getElementById('salesCount').innerText = result.extend.new_sales_orders_seven;
			}
		},
		error : function() {
			alert("请求失败!");
		}
		
	});
}
