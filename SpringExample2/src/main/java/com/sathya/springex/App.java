package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
	@SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
       
       Traveller traveller = context.getBean("Traveller",Traveller.class);
       traveller.startJourney();
    }
}
