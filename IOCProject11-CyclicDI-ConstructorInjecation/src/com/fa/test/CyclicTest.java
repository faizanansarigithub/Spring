package com.fa.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.fa.beans.A;

public class CyclicTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		 A a=null;
		 factory=new XmlBeanFactory(new ClassPathResource("com/fa/cfgs/applicationContext.xml"));
		 a=factory.getBean("a",A.class);
		 System.out.println(a);
	}

}
