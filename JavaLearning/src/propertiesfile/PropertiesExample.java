package propertiesfile;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesExample {
	static FileInputStream fis;
	static Properties prop;
	public static void main(String[] args) {
		try
		{
			fis=new FileInputStream("./PropertiesFiles/greetings.properties");
			prop=new Properties();
			prop.load(fis);
					
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//Fetching one by one
		System.out.println(prop.getProperty("gn"));
		System.out.println(prop.getProperty("gm"));
		System.out.println(prop.getProperty("ga"));
		
		//Printing All Entries From Properties file
		System.out.println(prop);
		
		//Using Enumeration
		Enumeration e=prop.propertyNames();
		while(e.hasMoreElements())
		{
			String key=e.nextElement().toString();
			System.out.println(prop.getProperty(key));
		}
		
	}

}
