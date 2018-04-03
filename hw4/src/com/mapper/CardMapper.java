package com.mapper;

import com.vo.Card;

public interface CardMapper {
	public void insertCard(Card card);
	// 删除副表时会删除掉自己的id 我要做的就是删除副表的一条信息也删除主表的那条信息 -->
	public void deleteCardById(int id);
	//修改掉副表的id  主表的stuid 外键也要变
	public void updateCardById(Card card);
}
