package com.strategy;

public class FullsubCash implements CashSuper{
	private double full;
	private double sub;
	

	public FullsubCash() {
		super();
	}


	public FullsubCash(double full, double sub) {
		super();
		this.full = full;
		sub = sub;
	}
	


	public double getFull() {
		return full;
	}


	public void setFull(double full) {
		this.full = full;
	}


	public double getSub() {
		return sub;
	}


	public void setSub(double sub) {
		sub = sub;
	}


	@Override
	public double calcuate(double money) {
		if(money>=full) {
			return money-sub;
		}
		else {
			return money;
		}
		
		
	}

	
}
