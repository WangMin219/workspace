package com.decorator;

import com.person.Person;

public  abstract class Decorator extends Person {
	//有抽象方法的一定是抽象类，抽象类不可以实例话，抽象类不一定有抽象方法
	public abstract String operation();

}
