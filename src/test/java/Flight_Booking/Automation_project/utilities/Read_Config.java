package Flight_Booking.Automation_project.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Read_Config {
	Properties properties;

	String path = "C:\\Users\\ABHI\\eclipse-workspace\\Automation_project\\Configurations\\config.properties";
	
	
	public Read_Config() {
		
		try {
			
			properties=new Properties();
			FileInputStream fis=new FileInputStream(path);
			
			properties.load(fis);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	
	public String getEmail() {
		String EMAIL=properties.getProperty("email");
		if(EMAIL!=null) {
			return EMAIL;
		}
		else {
			throw new RuntimeException("Email is not found");
		}
	}
	public String getPassword() {
		String Password=properties.getProperty("password");
		if(Password!=null) {
			return Password;
		}
		else {
			throw new RuntimeException("Password is not found");
		}
	}
	public String getBaseUrl() {
		String baseurl=properties.getProperty("BaseUrl");
		
		if(baseurl!=null) {
			return baseurl;
		}
		else {
			throw new RuntimeException("BaseUrl  is not found");
		}
	}
	public String getBrowser() {
		String BROWSER=properties.getProperty("browser");
		
		if(BROWSER!=null) {
			return BROWSER;
		}
		else {
			throw new RuntimeException("browser name is not found");
		}
	}
	
}
