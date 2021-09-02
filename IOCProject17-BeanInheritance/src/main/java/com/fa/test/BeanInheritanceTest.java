package com.fa.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.fa.beans.Bike;


public class BeanInheritanceTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Bike bike =null;
		factory=new DefaultListableBeanFactory();
		
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/fa/cnfg/applicationContaxt.xml");
		bike = factory.getBean("palsarBike", Bike.class);
		System.out.println(bike);
	}

}
