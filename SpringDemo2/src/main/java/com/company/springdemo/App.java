package com.company.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
    	// do the configuration on the basis of Annotation.
    	// In this we provide a config file to provide the PACKAGE where your classes are which is in AppConfig.java file.
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Delegate d = context.getBean(Delegate.class);  // This line means asking 
    	d.notifyUser();
    }
}


