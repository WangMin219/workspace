package com.mapper;

import com.vo.Product;

public interface ProductMapper {
	
	public Product selectProductByOrderId(int id);
	//插入商品
	public void insertProduct(Product product);
	

}
