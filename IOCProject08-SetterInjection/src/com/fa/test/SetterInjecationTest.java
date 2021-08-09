package com.fa.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.fa.comps.Employee;

public class SetterInjecationTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Employee employee=null;
		factory=new XmlBeanFactory(new ClassPathResource("com/fa/cfgs/applicationContext.xml"));
		employee=factory.getBean("emp",Employee.class);
		System.out.println(employee);
	}

}
