package com.fa.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.fa.controller.CustomerController;
import com.fa.vo.CustomerVO;

public class RealTimeDITest {

	public static void main(String[] args) {
		Scanner sc=null;
		CustomerVO vo=null;
		String name=null,addrs=null,pamt=null,time=null,rate=null;
		DefaultListableBeanFactory factory;
		XmlBeanDefinitionReader reader=null;
		CustomerController controller=null;
		String result=null;
		sc=new Scanner(System.in);
		
		System.out.println("Enter Customer Name :: ");
		name=sc.nextLine();
		System.out.println("Enter Customer Address :: ");
		addrs=sc.nextLine();
		System.out.println("Enter Principle Amount :: ");
		pamt=sc.nextLine();
		System.out.println("Enter Rate :: ");
		rate=sc.nextLine();
		System.out.println("Enter Time :: ");
		time=sc.nextLine();
		vo=new CustomerVO();
		vo.setCname(name);vo.setCaddrs(addrs);vo.setPamt(pamt);vo.setRate(rate);vo.setTime(time);
		//create bean factory IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/fa/cfgs/applicationContaxt.xml");
		controller=factory.getBean("controller",CustomerController.class);
		try {
			result=controller.processCustomer(vo);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Internal Problem");
			e.printStackTrace();
		}
		
		
	}

}
