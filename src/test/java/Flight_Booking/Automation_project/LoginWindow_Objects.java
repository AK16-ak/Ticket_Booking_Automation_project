package Flight_Booking.Automation_project;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Flight_Booking.Automation_project_Testcases.BaseClass;
import Flight_Booking.Automation_project_Testcases.Listner;



public class LoginWindow_Objects extends BaseClass{   
	
	//WebDriver  rdriver;
	//BaseClass baseObject=new BaseClass();
	String email=properties.getProperty("email");
	String passwordString=properties.getProperty("password");
	@FindBy(id = "txtEmail")
	WebElement enterEmailElement;
	
	@FindBy(id="shwotp")
	WebElement continue_ButtonElement;
	
	@FindBy(id="txtEmail2")
	WebElement enterPasswordElement;
	
	
	@FindBy(xpath ="//div[@id='forgetpdBox']//div[position()=6]//input" )
	WebElement loginElement;
	
	public void LoginClick() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(loginElement));
		wait.until(ExpectedConditions.elementToBeClickable(loginElement));
		continue_ButtonElement.click();
		loginElement.click();
	}
	public void EnterPassword() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(enterPasswordElement));
		enterPasswordElement.sendKeys(passwordString);
	}
	
	public void ClickContinueButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(continue_ButtonElement));
		continue_ButtonElement.click();
	}
	 
	public void EnterEmail() {
		enterEmailElement.sendKeys(email);
	}
	
	public LoginWindow_Objects() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver,this);
	}
}
