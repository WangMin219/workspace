package net.wanho.service;

import java.util.List;

import net.wanho.pojo.Items;

public interface ItemsService {

	
	public List<Items> selectAllItems() throws Exception;

	public Items findItemById(int parseInt);

	public void updateItem(Items items);
	
	public List<Items> selectByNameandPrice(String name,float price  ) throws Exception;
	
	public void deleteByPrimaryKey(int id);
}
