package com.fa.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.fa.bean.WishMessageGenrator;

public class ConstructorInjecationTest {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		WishMessageGenrator generator=null;
		//hold spring bean config file name and location
		res=new FileSystemResource("src/com/fa/cfgs/applicationContext.xml");
		//create IOC container
		factory=new XmlBeanFactory(res);
		//get target bean class object
		generator=(WishMessageGenrator)factory.getBean("wmg");
		//invoke the business method
		System.out.println(generator.wishMessage("Faizan Ansari"));
	}//main

}//class
