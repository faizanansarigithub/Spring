package com.fa.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.fa.bean.College;
import com.fa.bean.Marks;

public class Test {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Marks marks=null;
		College collage=null;
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/facfgs/applicationContaxt.xml");
		marks=factory.getBean("ms", Marks.class);
		System.out.println(marks);
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		collage=factory.getBean("clg",College.class);
		System.out.println(collage);
	}

}
