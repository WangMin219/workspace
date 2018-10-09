package net.wanho.vo;

import net.wanho.pojo.Items;

public class QueryVo {

	
	//  跟条件进行查询
	
	
	private Items item;
	
	private Integer [] ids;

	public Items getItem() {
		return item;
	}

	public void setItem(Items item) {
		this.item = item;
	}

	public Integer[] getIds() {
		return ids;
	}

	public void setIds(Integer[] ids) {
		this.ids = ids;
	}
	
	
}
