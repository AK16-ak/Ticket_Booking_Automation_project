package Flight_Booking.Automation_project_Testcases;


import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Flight_Booking.Automation_project.utilities.Read_Config;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	/*	@BeforeMethod
//	public void GotoUrl() {
//		driver=new ChromeDriver();
//		driver.get("https://www.easemytrip.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));*/
	
//		Flight_Booking.Automation_project.utilities.Read_Config=new Read_Config();
//		Read_Config reader=new Read_Config();
//		String url=reader.getBaseUrl();
//		
//		String browser=reader.getBrowser();
//		
//		String email=reader.getEmail();
//		
	public  static WebDriver driver;
		public  static Properties properties;
		
		public BaseClass(){
			// TODO Auto-generated constructor stub
//			  Read_Config reader=new Read_Config();
//				 String url=reader.getBaseUrl();
//				 String browser=reader.getBrowser();
//				 String email=reader.getEmail();
//				  String password=reader.getPassword();
				try {
					properties=new Properties();

					String path = "C:\\Users\\ABHI\\eclipse-workspace\\Automation_project\\Configurations\\config.properties";
					
					
					properties=new Properties();
					FileInputStream fis=new FileInputStream(path);
					
					properties.load(fis);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
		}
		public  static void setup() {
			String browser=properties.getProperty("browser");
			String url=properties.getProperty("BaseUrl");
			switch(browser.toLowerCase()) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
		        options.addArguments("--disable-geolocation"); // Disable geolocation

		        // Optionally set preferences to automatically allow location access
		        Map<String, Object> prefs = new HashMap<>();
		        prefs.put("profile.default_content_setting_values.geolocation", 1); // 1 = allow, 2 = block
		        options.setExperimentalOption("prefs", prefs);
				driver=new ChromeDriver();
				break;
			case "msedge":
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				break;
			default:
				driver=null;
				break;
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().getImplicitWaitTimeout();
			//driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
			//logger=LogManager.getLogger("MOVIE_TICKETBOOKING");
			driver.manage().deleteAllCookies();
			//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			driver.get(url);
			
			//logger.info("URL OPENED");
		}
		
		
		
		
}
//	@AfterMethod
//	public void aftermethod()  throws IOException{
//		/*taking Screenshot
//	 TakesScreenshot  tsScreenshot=driver;
//	 File sourceFile=tsScreenshot.getScreenshotAs(OutputType.FILE);*/
//	 
//	}
//	



