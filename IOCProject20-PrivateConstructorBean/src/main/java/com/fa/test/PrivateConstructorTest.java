package com.fa.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.fa.bean.BeanTest;

public class PrivateConstructorTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		BeanTest bt=null;
		
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/fa/cfgs/applicationContaxt.xml");
		bt=factory.getBean("test", BeanTest.class);
		System.out.println(bt);
	}
}
