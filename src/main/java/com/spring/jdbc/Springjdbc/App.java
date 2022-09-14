package com.spring.jdbc.Springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

	// we can create bean lifecyle method using intializingbean and disposablebean
	// interfaces, theyy will provide two method
	// inside which we can write our init and destroy code
	// we can use Postconstruct and predestroy anotation on methods to be considered
	// as init and destroy for that bean, to use this annoation in java9+ add
	// javax-annoation-api depedency ,enalbe annoation in xml using
	// context:annotation-config tag
	public static void main(String[] args) {

		// creating ioc container
		// abstract application context to register shutdown hook
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student student1 = (Student) context.getBean("student1");
		Student student2 = (Student) context.getBean("student1");
//		Student student2 = (Student) context.getBean("student2");
//		System.out.println(student1);
//		System.out.println(student1);
//		context.registerShutdownHook();
	}
}
