package com.strategy;

public class DiscountCash implements CashSuper{
	private double discount;
	

	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	@Override
	public double calcuate(double money) {
		// TODO Auto-generated method stub
		return money*discount;
	}

	
}
