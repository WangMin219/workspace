package net.wanho.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.wanho.dao.ItemsMapper;
import net.wanho.pojo.Items;
import net.wanho.pojo.ItemsExample;
@Service
public class ItemServiceImpl implements ItemsService {
	
	
    @Autowired
	private ItemsMapper itemsMapper;


	@Override
	public List<Items> selectAllItems() throws Exception {
		
		ItemsExample example = new ItemsExample();
	    List<Items>	list =itemsMapper.selectByExampleWithBLOBs(example);
		return list;
	}


	@Override
	public Items findItemById(int parseInt) {
		Items itmes = itemsMapper.selectByPrimaryKey(parseInt);
		return itmes;
	}


	@Override
	public void updateItem(Items items) {
		// TODO Auto-generated method stub
		itemsMapper.updateByPrimaryKeyWithBLOBs(items);
	}


	@Override
	public List<Items> selectByNameandPrice(String name,float price) throws Exception {
		ItemsExample example = new ItemsExample();
	    List<Items>	list =itemsMapper.selectByNameandPrice(name,price);
		return list;
	}

	@Override
	public void deleteByPrimaryKey(int id) {
		itemsMapper.deleteByPrimaryKey(id);
	}

}
