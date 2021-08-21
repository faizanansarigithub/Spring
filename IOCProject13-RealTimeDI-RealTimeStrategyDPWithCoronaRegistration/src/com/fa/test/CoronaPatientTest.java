package com.fa.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.fa.controller.CoronaController;
import com.fa.vo.CoronaVO;

public class CoronaPatientTest {

	public static void main(String[] args) {
		Scanner sc=null;
		String name=null,addrs=null,day=null,adhar=null;
		CoronaVO vo=null;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		CoronaController controller=null;
		String result=null;
		sc=new Scanner(System.in);
		
		System.out.println("Enter Patient Name :: ");
		name=sc.nextLine();
		System.out.println("Enter Patient Address :: ");
		addrs=sc.nextLine();
		System.out.println("Enter Patient Day :: ");
		day=sc.nextLine();
		System.out.println("Enter Patient Adhar Number :: ");
		adhar=sc.nextLine();
		vo=new CoronaVO();
		vo.setPname(name);vo.setPaddrs(addrs);vo.setAdhar(adhar);vo.setDays(day);
		
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/fa/cfgs/applicationContext.xml");
		
		controller=factory.getBean("controller",CoronaController.class);
		try {
			result=controller.processPatient(vo);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Internal problem");
			e.printStackTrace();
		}
	}

}
