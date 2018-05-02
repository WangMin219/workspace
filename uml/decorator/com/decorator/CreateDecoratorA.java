package com.decorator;

import java.util.Base64.Decoder;

import com.person.Person;

public class CreateDecoratorA extends Decorator {
	Person person;

	public CreateDecoratorA() {
		super();
	}


	public CreateDecoratorA(Person person) {
		super();
		this.person = person;
	}


	public  String operation() {
		System.out.println(person.operation()+"一件衬衣");
		return person.operation()+"一件衬衣";
		
	}

}
