package com.fa.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.fa.comp.BlueDarkCourier;
import com.fa.comp.Courier;
import com.fa.comp.DTCCourier;
import com.fa.comp.Flipkart;

public class FlipkartFactory {
		private static Properties props=null;
		static {
			InputStream is=null;
			try {
				//Locate Properties using stream
				is=new FileInputStream("src/com/fa/comns/info.properties");
				//Load properties file into Properties object
				props=new Properties();
				props.load(is);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		public static Flipkart getInstance() throws Exception{
			Courier courier=null;
			Flipkart flipkart=null;
			//get dependency class object
			courier=(Courier) Class.forName(props.getProperty("sdp.dependent")).newInstance();
			//create Target class object
			flipkart=new Flipkart();
			flipkart.setCourier(courier);
			
			return flipkart;
		}
}
