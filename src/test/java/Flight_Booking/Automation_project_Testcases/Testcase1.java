package Flight_Booking.Automation_project_Testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Flight_Booking.Automation_project.HomePage_Objects;
import Flight_Booking.Automation_project.LoginWindow_Objects;


//@Listeners(Listner.class)
public class Testcase1  extends BaseClass{
	HomePage_Objects ahoHomePage_Objects;
	LoginWindow_Objects loginWindow_Objects;
	
	public Testcase1(){
		// TODO Auto-generated constructor stub
		super();
	}
	
	@BeforeMethod
	public void FirstSetup(){
		setup();
		ahoHomePage_Objects=new HomePage_Objects();
		loginWindow_Objects=new LoginWindow_Objects();
		
	}
	 
	@Test(priority = 1)
	public void getText() {
		String b=ahoHomePage_Objects.geteleText();
		Assert.assertEquals(b, "Login or Signup");
	}
	
	@Test(priority = 2)
	public void oneWay_Flight() throws InterruptedException,IOException {
		
		ahoHomePage_Objects.sign_up();
		ahoHomePage_Objects.customer_login();
		
		
		loginWindow_Objects.EnterEmail();
		//Thread.sleep(1000);
	loginWindow_Objects.ClickContinueButton();
	loginWindow_Objects.EnterPassword();
	loginWindow_Objects.LoginClick();
		
		//Thread.sleep(10000);
	Assert.assertTrue(true);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
