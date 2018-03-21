package com.mapper;

import java.util.List;


import com.vo.Card;

public interface CardMapper {
	public void saveCard(Card card);
	public void delectCardById(int id);
	public  void updateCard(Card card) ;

}
