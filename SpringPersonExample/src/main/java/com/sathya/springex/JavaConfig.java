package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class JavaConfig {
	
		@Bean

		public Person person1() {
			Person person=new Person();
			person.setName("Deepika");
			person.setEmail("deepika.71419@gmail.com");
			return person;
			
		}
		
		@Bean
		public Person person2() {
			Person person=new Person();
			person.setName("Vyshnavi");
			person.setEmail("vyshuvyshnavi112@gmail.com");
			return person;
		}
		
		@Bean
		public Person person3() {
			Person person = new Person();
			person.setName("Vani");
			person.setEmail("vanikeerthana.danda@gmail.com");
			return person;
		}
		
		@Bean
		public Person person4() {
			Person person = new Person();
			person.setName("Gayathri");
			person.setEmail("gayathri.taneeru@gmail.com");
			return person;
		}
		

}
