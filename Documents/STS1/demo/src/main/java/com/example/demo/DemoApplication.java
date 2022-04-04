package com.example.demo;
import com.example.demo.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoApplication {

	public static void main(String[] args) {
//		//Bean factory
		
//		BeanFactory factory=new ClassPathXmlApplicationContext("student.xml");
//		StudentBean student=(StudentBean) factory.getBean("student");
//		
//		
//		StudentBean student1=(StudentBean) factory.getBean("student");
//		System.out.println(student);
//		
//		System.out.println(student1);
		
////		//Application context
//		
//		ApplicationContext context=new ClassPathXmlApplicationContext("student.xml");
//		StudentBean student2=(StudentBean) context.getBean("student");
//		System.out.println(student2);
		
		
		AnnotationConfigApplicationContext context1=new AnnotationConfigApplicationContext(StudentConfig.class);
		StudentBean student3=(StudentBean)context1.getBean("student");
		System.out.println(student3);
		
		StudentBean student4=(StudentBean)context1.getBean("student");
		System.out.println(student4);
		
		context1.close();
	}

}

