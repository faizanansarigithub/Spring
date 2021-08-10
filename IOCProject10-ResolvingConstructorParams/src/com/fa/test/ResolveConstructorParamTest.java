package com.fa.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.fa.beans.Student;

public class ResolveConstructorParamTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Student student=null;
		factory=new XmlBeanFactory(new ClassPathResource("com/fa/cfgs/applicationContext.xml"));
		student = factory.getBean("stud", Student.class);
		System.out.println(student);
	}

}
