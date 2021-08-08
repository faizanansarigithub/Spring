package com.fa.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.fa.comps.Flipkart;

public class StretegyDPTest {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		Flipkart flipkart=null;
		//hold spring bean cfg cile
		res=new ClassPathResource("com/fa/cnfgs/applicationContext.xml");
		//create IOC container
		factory=new XmlBeanFactory(res);
		//get Target bean
		flipkart=factory.getBean("flipkart", Flipkart.class);
		//invoke the method
		System.out.println(flipkart.shoping(new String[] {"Java Book","Python Book","Spring Book"},new float[]{1000,1500,2000}));
	}

}
