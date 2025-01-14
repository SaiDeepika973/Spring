package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       //start the IOC container
    	
    	@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    	System.out.println("*****************");
    	
    	//call the methods
    	
    	Person person = context.getBean("person1",Person.class);
    	person.personInfo();
    	
    	Person person1 = context.getBean("person2",Person.class);
    	person1.personInfo();
    	
    	Person person2 = context.getBean("person3",Person.class);
    	person2.personInfo();
    	
    	Person person3 = context.getBean("person4",Person.class);
    	person3.personInfo();
    	
    }
}
