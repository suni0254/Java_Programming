package Day1_Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		//Location of Properties File
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\config.properties");
		
		//Loading Properties File
		Properties propertiesObj = new Properties();
		propertiesObj.load(file);
		
		//Reading Data from Properties file
		String url = propertiesObj.getProperty("appurl");
		String email = propertiesObj.getProperty("email");
		String pwd = propertiesObj.getProperty("pwd");
		String orderid = propertiesObj.getProperty("orderid");
		String custid = propertiesObj.getProperty("custid");
		
		System.out.println(url+"  "+email+"  "+pwd+"  "+orderid+"  "+custid);
		
		//Reading all the keys from properties file
		/*
		Set<String> keys = propertiesObj.stringPropertyNames();
		System.out.println(keys);
		*/
		
		Set<Object> keys = propertiesObj.keySet();
		System.out.println(keys);
		
		//Reading all the values from properties file
		Collection<Object> values = propertiesObj.values();
		System.out.println(values);
		
		file.close();
	}

}
