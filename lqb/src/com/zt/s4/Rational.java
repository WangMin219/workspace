package com.zt.s4;


class Rational
{
	private long ra;
	private long rb;
	
	private long gcd(long a, long b){
		if(b==0) return a;
		return gcd(b,a%b);
	}
	public Rational(long a, long b){
		ra = a;
		rb = b;	
		long k = gcd(ra,rb);
		if(k>1){ //需要约分
			ra /= k;  
			rb /= k;
		}
	}
	// 加法
	public Rational add(Rational x){
		return x;
		//填空位置
	}
	// 乘法
	public Rational mul(Rational x){
		return new Rational(ra*x.ra, rb*x.rb);
	}
	public String toString(){
		if(rb==1) return "" + ra;
		return ra + "/" + rb;
	}
}

