package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       //start the container
    	
    	@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        System.out.println("*********************");
        
        //calling the methods
        
        GreetingImpl greetingImpl = context.getBean("greet",GreetingImpl.class);
        greetingImpl.greet();
        
        
    }
}
