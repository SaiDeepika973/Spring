package com.sathya.springex;

import org.springframework.stereotype.Component;
@Component
public class JavaCourseService implements CourseService{

	@Override
	public void courseInfo() {
		
		System.out.println("Java Full Stack course");
		
	}
	
	/*public JavaCourseService() {
		System.out.println("Java Course Service :: object created");
	}*/
	
	

}
