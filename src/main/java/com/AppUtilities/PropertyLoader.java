package com.AppUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {

	public static Properties prop;
	static File file;
	
	public PropertyLoader() {
		
		
		try {
			file = new File("./AppFiles/login.properties");
			FileInputStream fis = new FileInputStream(file);
			
			prop = new Properties();
			prop.load(fis);
			
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}finally {
			if(file.exists()) {
				System.out.println("Property file loaded successfully");
			}
			else
			{
				System.out.println("Does not loaded successfully");
			}
			System.out.println("Exception created");
		}
		
	}
	
	
	public String getappname() {
		return prop.getProperty("appname");
	}
	
	public String getappurl() {
		return prop.getProperty("appurl");
	}
	
	
	
	
}
