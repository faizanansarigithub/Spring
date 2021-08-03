package com.fa.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.fa.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		Object obj=null;
		String result=null;
		WishMessageGenerator generator=null;
		//hold name and location of spring bean cfg file
		res=new FileSystemResource("src/com/fa/cfgs/applicationContext.xml");
		//create BeanFactory IOC container
		factory=new XmlBeanFactory(res);
		//get Target bean class object
		obj=factory.getBean("wmg");
		generator=(WishMessageGenerator)obj;
		result=generator.wishMessage("Faizan Ansari ");
		System.out.println("Message is:::   "+result);
		
	}//main

}//class
