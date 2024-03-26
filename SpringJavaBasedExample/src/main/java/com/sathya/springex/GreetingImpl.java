package com.sathya.springex;

public class GreetingImpl implements Greeting{

	@Override
	public void greet() {
		System.out.println("This is java based configuration");
	}
	
	public GreetingImpl() {
		System.out.println("Greeting constructor created");
	}

}
