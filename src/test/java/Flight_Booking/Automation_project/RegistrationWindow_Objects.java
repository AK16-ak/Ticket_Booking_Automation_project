package Flight_Booking.Automation_project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Flight_Booking.Automation_project_Testcases.BaseClass;
import Flight_Booking.Automation_project_Testcases.Listner;

public class RegistrationWindow_Objects extends BaseClass {
	String email=properties.getProperty("email");
	String passwordString=properties.getProperty("password");
	@FindBy(id="txtEmail")
	   WebElement emailEnter;
	 
	   public void EnterEmail ()
	   {
		   emailEnter.sendKeys("ishanayaz01@gmail.com");
	   	}
	   
	   @FindBy(id="shwotp")
	   WebElement continuebutton;
	 
	   public void continueButtonClick()
	   {
		   continuebutton.click();
	   	}
	   @FindBy(id="OtpLgnBtn")
	   WebElement createaccount;
	 
	   public void createaccount()
	   {
		   createaccount.click();
	   	}
	public RegistrationWindow_Objects()  throws IOException{
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver,this);
	}
}
