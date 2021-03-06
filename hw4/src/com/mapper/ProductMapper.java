package com.mapper;

import java.util.List;

import com.vo.Product;
import com.vo.Student;

public interface ProductMapper {
	
	public Product selectProductById(int id);
	//插入商品
	public void insertProduct(Product product);
	
	public List<Product> selectProductByOrderId(Integer id);
	//删除
	public void deleteProductById(int id);

}
