package com.fa.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.fa.comp.Student;

public class ConstructorInjection {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Student std=null;
		factory=new XmlBeanFactory(new ClassPathResource("com/fa/cfgs/applicationContext.xml"));
		std=factory.getBean("stud", Student.class);
		System.out.println(std);
	}

}
