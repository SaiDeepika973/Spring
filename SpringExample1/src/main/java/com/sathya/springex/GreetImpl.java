package com.sathya.springex;

public class GreetImpl implements Greeting{

	@Override
	public void greet() {
		System.out.println("This is Spring first example");
		System.out.println("Ratan Sir wowwwww");		
	}
	public GreetImpl()
	{
		System.out.println("GreetingImpl constructor :: object created");
	}

}
